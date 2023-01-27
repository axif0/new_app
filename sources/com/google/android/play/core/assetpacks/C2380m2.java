package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import p148g.p189d.p190a.p271e.p272a.p276c.C5097d0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.m2 */
final class C2380m2 {

    /* renamed from: h */
    private static final C5100f f7862h = new C5100f("SliceMetadataManager");

    /* renamed from: a */
    private final byte[] f7863a = new byte[8192];

    /* renamed from: b */
    private final C2328c0 f7864b;

    /* renamed from: c */
    private final String f7865c;

    /* renamed from: d */
    private final int f7866d;

    /* renamed from: e */
    private final long f7867e;

    /* renamed from: f */
    private final String f7868f;

    /* renamed from: g */
    private int f7869g;

    C2380m2(C2328c0 c0Var, String str, int i, long j, String str2) {
        this.f7864b = c0Var;
        this.f7865c = str;
        this.f7866d = i;
        this.f7867e = j;
        this.f7868f = str2;
        this.f7869g = -1;
    }

    /* renamed from: n */
    private final File m10961n() {
        File y = this.f7864b.mo9134y(this.f7865c, this.f7866d, this.f7867e, this.f7868f);
        if (!y.exists()) {
            y.mkdirs();
        }
        return y;
    }

    /* renamed from: o */
    private final File m10962o() throws IOException {
        File n = this.f7864b.mo9124n(this.f7865c, this.f7866d, this.f7867e, this.f7868f);
        n.getParentFile().mkdirs();
        n.createNewFile();
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2375l2 mo9211a() throws IOException {
        File n = this.f7864b.mo9124n(this.f7865c, this.f7866d, this.f7867e, this.f7868f);
        if (n.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C2411u0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f7869g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C2375l2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C2411u0("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                C5097d0.m21473a(th, th);
            }
        } else {
            throw new C2411u0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9212b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo9219i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f7869g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10962o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9213c(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo9219i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9214d(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo9219i(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f7863a);
                if (read > 0) {
                    randomAccessFile.write(this.f7863a, 0, read);
                }
            } while (read == this.f7863a.length);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9215e(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f7869g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10962o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9216f(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        this.f7869g++;
        try {
            fileOutputStream = new FileOutputStream(new File(m10961n(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f7869g)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C2411u0("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo9217g(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f7869g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10962o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File s = this.f7864b.mo9128s(this.f7865c, this.f7866d, this.f7867e, this.f7868f);
            if (s.exists()) {
                s.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(s);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                C5097d0.m21473a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C5097d0.m21473a(th, th2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo9218h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f7869g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo9219i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f7863a);
            while (read > 0) {
                fileOutputStream.write(this.f7863a, 0, read);
                read = inputStream.read(this.f7863a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final File mo9219i() {
        return new File(m10961n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f7869g)}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo9220j(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f7869g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10962o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo9221k(byte[] bArr, int i) throws IOException {
        this.f7869g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo9219i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final int mo9222l() throws IOException {
        File n = this.f7864b.mo9124n(this.f7865c, this.f7866d, this.f7867e, this.f7868f);
        if (!n.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(n);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C2411u0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo9223m() {
        FileInputStream fileInputStream;
        File n = this.f7864b.mo9124n(this.f7865c, this.f7866d, this.f7867e, this.f7868f);
        if (!n.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(n);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f7862h.mo15205e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            f7862h.mo15205e("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }
}
