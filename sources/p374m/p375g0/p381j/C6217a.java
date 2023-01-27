package p374m.p375g0.p381j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p385n.C6288l;
import p385n.C6299r;
import p385n.C6300s;

/* renamed from: m.g0.j.a */
public interface C6217a {

    /* renamed from: a */
    public static final C6217a f17543a = new C6218a();

    /* renamed from: m.g0.j.a$a */
    class C6218a implements C6217a {
        C6218a() {
        }

        /* renamed from: a */
        public void mo17566a(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        /* renamed from: b */
        public C6300s mo17567b(File file) throws FileNotFoundException {
            return C6288l.m25939j(file);
        }

        /* renamed from: c */
        public C6299r mo17568c(File file) throws FileNotFoundException {
            try {
                return C6288l.m25935f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C6288l.m25935f(file);
            }
        }

        /* renamed from: d */
        public void mo17569d(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo17569d(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        /* renamed from: e */
        public C6299r mo17570e(File file) throws FileNotFoundException {
            try {
                return C6288l.m25930a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C6288l.m25930a(file);
            }
        }

        /* renamed from: f */
        public boolean mo17571f(File file) {
            return file.exists();
        }

        /* renamed from: g */
        public void mo17572g(File file, File file2) throws IOException {
            mo17566a(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        /* renamed from: h */
        public long mo17573h(File file) {
            return file.length();
        }
    }

    /* renamed from: a */
    void mo17566a(File file) throws IOException;

    /* renamed from: b */
    C6300s mo17567b(File file) throws FileNotFoundException;

    /* renamed from: c */
    C6299r mo17568c(File file) throws FileNotFoundException;

    /* renamed from: d */
    void mo17569d(File file) throws IOException;

    /* renamed from: e */
    C6299r mo17570e(File file) throws FileNotFoundException;

    /* renamed from: f */
    boolean mo17571f(File file);

    /* renamed from: g */
    void mo17572g(File file, File file2) throws IOException;

    /* renamed from: h */
    long mo17573h(File file);
}
