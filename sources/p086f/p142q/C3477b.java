package p086f.p142q;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: f.q.b */
final class C3477b implements Closeable {

    /* renamed from: f */
    private final File f10886f;

    /* renamed from: g */
    private final long f10887g;

    /* renamed from: h */
    private final File f10888h;

    /* renamed from: i */
    private final RandomAccessFile f10889i;

    /* renamed from: j */
    private final FileChannel f10890j;

    /* renamed from: k */
    private final FileLock f10891k;

    /* renamed from: f.q.b$a */
    class C3478a implements FileFilter {
        C3478a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: f.q.b$b */
    private static class C3479b extends File {

        /* renamed from: f */
        public long f10893f = -1;

        public C3479b(File file, String str) {
            super(file, str);
        }
    }

    C3477b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f10886f = file;
        this.f10888h = file2;
        this.f10887g = m14994q(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f10889i = randomAccessFile;
        try {
            this.f10890j = randomAccessFile.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f10891k = this.f10890j.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m14990h(this.f10890j);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m14990h(this.f10890j);
                throw e;
            } catch (Error e3) {
                e = e3;
                m14990h(this.f10890j);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m14990h(this.f10889i);
            throw e4;
        }
    }

    /* renamed from: a */
    private void m14989a() {
        File[] listFiles = this.f10888h.listFiles(new C3478a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f10888h.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    /* renamed from: h */
    private static void m14990h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: j */
    private static void m14991j(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    m14990h(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m14990h(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: m */
    private static SharedPreferences m14992m(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: o */
    private static long m14993o(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: q */
    private static long m14994q(File file) throws IOException {
        long c = C3480c.m15002c(file);
        return c == -1 ? c - 1 : c;
    }

    /* renamed from: r */
    private static boolean m14995r(Context context, File file, long j, String str) {
        SharedPreferences m = m14992m(context);
        if (m.getLong(str + "timestamp", -1) == m14993o(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return m.getLong(sb.toString(), -1) != j;
        }
    }

    /* renamed from: u */
    private List<C3479b> m14996u(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f10886f.getName() + ".classes";
        SharedPreferences m = m14992m(context);
        int i = m.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C3479b bVar = new C3479b(this.f10888h, str3 + i2 + ".zip");
            if (bVar.isFile()) {
                bVar.f10893f = m14994q(bVar);
                long j = m.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = m.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = m;
                    if (j == bVar.f10893f) {
                        arrayList.add(bVar);
                        i2++;
                        m = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.f10893f);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: w */
    private List<C3479b> m14997w() throws IOException {
        C3479b bVar;
        boolean z;
        String str = this.f10886f.getName() + ".classes";
        m14989a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f10886f);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                bVar = new C3479b(this.f10888h, str + i + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m14991j(zipFile, entry, bVar, str);
                    bVar.f10893f = m14994q(bVar);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    int i4 = i3;
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f10893f);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i4;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e2);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    /* renamed from: x */
    private static void m14998x(Context context, String str, long j, long j2, List<C3479b> list) {
        SharedPreferences.Editor edit = m14992m(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C3479b next : list) {
            edit.putLong(str + "dex.crc." + i, next.f10893f);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    public void close() throws IOException {
        this.f10891k.release();
        this.f10890j.close();
        this.f10889i.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public List<? extends File> mo11866t(Context context, String str, boolean z) throws IOException {
        List<C3479b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f10886f.getPath() + ", " + z + ", " + str + ")");
        if (this.f10891k.isValid()) {
            if (z || m14995r(context, this.f10886f, this.f10887g, str)) {
                Log.i("MultiDex", z ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
            } else {
                try {
                    list = m14996u(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            List<C3479b> w = m14997w();
            m14998x(context, str, m14993o(this.f10886f), this.f10887g, w);
            list = w;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
