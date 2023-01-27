package com.bumptech.glide.p005l;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.l.a */
public final class C0983a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final File f3903f;

    /* renamed from: g */
    private final File f3904g;

    /* renamed from: h */
    private final File f3905h;

    /* renamed from: i */
    private final File f3906i;

    /* renamed from: j */
    private final int f3907j;

    /* renamed from: k */
    private long f3908k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f3909l;

    /* renamed from: m */
    private long f3910m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Writer f3911n;

    /* renamed from: o */
    private final LinkedHashMap<String, C0987d> f3912o = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f3913p;

    /* renamed from: q */
    private long f3914q = 0;

    /* renamed from: r */
    final ThreadPoolExecutor f3915r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0985b((C0984a) null));

    /* renamed from: s */
    private final Callable<Void> f3916s = new C0984a();

    /* renamed from: com.bumptech.glide.l.a$a */
    class C0984a implements Callable<Void> {
        C0984a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bumptech.glide.l.a r0 = com.bumptech.glide.p005l.C0983a.this
                monitor-enter(r0)
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p005l.C0983a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f3911n     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p005l.C0983a.this     // Catch:{ all -> 0x0028 }
                r1.m5493k0()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p005l.C0983a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m5483X()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p005l.C0983a.this     // Catch:{ all -> 0x0028 }
                r1.m5490h0()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p005l.C0983a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f3913p = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p005l.C0983a.C0984a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.l.a$b */
    private static final class C0985b implements ThreadFactory {
        private C0985b() {
        }

        /* synthetic */ C0985b(C0984a aVar) {
            this();
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: com.bumptech.glide.l.a$c */
    public final class C0986c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C0987d f3918a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f3919b;

        /* renamed from: c */
        private boolean f3920c;

        private C0986c(C0987d dVar) {
            this.f3918a = dVar;
            this.f3919b = dVar.f3926e ? null : new boolean[C0983a.this.f3909l];
        }

        /* synthetic */ C0986c(C0983a aVar, C0987d dVar, C0984a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo5128a() throws IOException {
            C0983a.this.m5501x(this, false);
        }

        /* renamed from: b */
        public void mo5129b() {
            if (!this.f3920c) {
                try {
                    mo5128a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo5130e() throws IOException {
            C0983a.this.m5501x(this, true);
            this.f3920c = true;
        }

        /* renamed from: f */
        public File mo5131f(int i) throws IOException {
            File k;
            synchronized (C0983a.this) {
                if (this.f3918a.f3927f == this) {
                    if (!this.f3918a.f3926e) {
                        this.f3919b[i] = true;
                    }
                    k = this.f3918a.mo5133k(i);
                    if (!C0983a.this.f3903f.exists()) {
                        C0983a.this.f3903f.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }
    }

    /* renamed from: com.bumptech.glide.l.a$d */
    private final class C0987d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f3922a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f3923b;

        /* renamed from: c */
        File[] f3924c;

        /* renamed from: d */
        File[] f3925d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f3926e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C0986c f3927f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f3928g;

        private C0987d(String str) {
            this.f3922a = str;
            this.f3923b = new long[C0983a.this.f3909l];
            this.f3924c = new File[C0983a.this.f3909l];
            this.f3925d = new File[C0983a.this.f3909l];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C0983a.this.f3909l; i++) {
                sb.append(i);
                this.f3924c[i] = new File(C0983a.this.f3903f, sb.toString());
                sb.append(".tmp");
                this.f3925d[i] = new File(C0983a.this.f3903f, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ C0987d(C0983a aVar, String str, C0984a aVar2) {
            this(str);
        }

        /* renamed from: m */
        private IOException m5522m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m5523n(String[] strArr) throws IOException {
            if (strArr.length == C0983a.this.f3909l) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f3923b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m5522m(strArr);
                        throw null;
                    }
                }
                return;
            }
            m5522m(strArr);
            throw null;
        }

        /* renamed from: j */
        public File mo5132j(int i) {
            return this.f3924c[i];
        }

        /* renamed from: k */
        public File mo5133k(int i) {
            return this.f3925d[i];
        }

        /* renamed from: l */
        public String mo5134l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f3923b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    /* renamed from: com.bumptech.glide.l.a$e */
    public final class C0988e {

        /* renamed from: a */
        private final File[] f3930a;

        private C0988e(String str, long j, File[] fileArr, long[] jArr) {
            this.f3930a = fileArr;
        }

        /* synthetic */ C0988e(C0983a aVar, String str, long j, File[] fileArr, long[] jArr, C0984a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo5135a(int i) {
            return this.f3930a[i];
        }
    }

    private C0983a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f3903f = file2;
        this.f3907j = i;
        this.f3904g = new File(file2, "journal");
        this.f3905h = new File(file2, "journal.tmp");
        this.f3906i = new File(file2, "journal.bkp");
        this.f3909l = i2;
        this.f3908k = j;
    }

    /* renamed from: H */
    private static void m5480H(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p005l.C0983a.C0986c m5481Q(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m5499u()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r0 = r5.f3912o     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.l.a$d r0 = (com.bumptech.glide.p005l.C0983a.C0987d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f3928g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.l.a$d r0 = new com.bumptech.glide.l.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r7 = r5.f3912o     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.l.a$c r7 = r0.f3927f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.l.a$c r7 = new com.bumptech.glide.l.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.p005l.C0983a.C0986c unused = r0.f3927f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f3911n     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f3911n     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f3911n     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f3911n     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f3911n     // Catch:{ all -> 0x005d }
            m5482S(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p005l.C0983a.m5481Q(java.lang.String, long):com.bumptech.glide.l.a$c");
    }

    @TargetApi(26)
    /* renamed from: S */
    private static void m5482S(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public boolean m5483X() {
        int i = this.f3913p;
        return i >= 2000 && i >= this.f3912o.size();
    }

    /* renamed from: a0 */
    public static C0983a m5485a0(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m5492j0(file2, file3, false);
                }
            }
            C0983a aVar = new C0983a(file, i, i2, j);
            if (aVar.f3904g.exists()) {
                try {
                    aVar.m5487f0();
                    aVar.m5486e0();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo5120D();
                }
            }
            file.mkdirs();
            C0983a aVar2 = new C0983a(file, i, i2, j);
            aVar2.m5490h0();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: e0 */
    private void m5486e0() throws IOException {
        m5480H(this.f3905h);
        Iterator<C0987d> it = this.f3912o.values().iterator();
        while (it.hasNext()) {
            C0987d next = it.next();
            int i = 0;
            if (next.f3927f == null) {
                while (i < this.f3909l) {
                    this.f3910m += next.f3923b[i];
                    i++;
                }
            } else {
                C0986c unused = next.f3927f = null;
                while (i < this.f3909l) {
                    m5480H(next.mo5132j(i));
                    m5480H(next.mo5133k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f3913p = r0 - r9.f3912o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo5137j() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m5490h0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f3911n = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f3904g, true), com.bumptech.glide.p005l.C0991c.f3938a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5487f0() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.l.b r1 = new com.bumptech.glide.l.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f3904g
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.p005l.C0991c.f3938a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo5138m()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo5138m()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo5138m()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo5138m()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo5138m()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f3907j     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f3909l     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo5138m()     // Catch:{ EOFException -> 0x005f }
            r9.m5488g0(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r2 = r9.f3912o     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f3913p = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo5137j()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m5490h0()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f3904g     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.p005l.C0991c.f3938a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f3911n = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.p005l.C0991c.m5532a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.p005l.C0991c.m5532a(r1)
            goto L_0x00c0
        L_0x00bf:
            throw r0
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p005l.C0983a.m5487f0():void");
    }

    /* renamed from: g0 */
    private void m5488g0(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f3912o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C0987d dVar = this.f3912o.get(str2);
            if (dVar == null) {
                dVar = new C0987d(this, str2, (C0984a) null);
                this.f3912o.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f3926e = true;
                C0986c unused2 = dVar.f3927f = null;
                dVar.m5523n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                C0986c unused3 = dVar.f3927f = new C0986c(this, dVar, (C0984a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public synchronized void m5490h0() throws IOException {
        String str;
        if (this.f3911n != null) {
            m5500w(this.f3911n);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3905h), C0991c.f3938a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3907j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3909l));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C0987d next : this.f3912o.values()) {
                if (next.f3927f != null) {
                    str = "DIRTY " + next.f3922a + 10;
                } else {
                    str = "CLEAN " + next.f3922a + next.mo5134l() + 10;
                }
                bufferedWriter.write(str);
            }
            m5500w(bufferedWriter);
            if (this.f3904g.exists()) {
                m5492j0(this.f3904g, this.f3906i, true);
            }
            m5492j0(this.f3905h, this.f3904g, false);
            this.f3906i.delete();
            this.f3911n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3904g, true), C0991c.f3938a));
        } catch (Throwable th) {
            m5500w(bufferedWriter);
            throw th;
        }
    }

    /* renamed from: j0 */
    private static void m5492j0(File file, File file2, boolean z) throws IOException {
        if (z) {
            m5480H(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m5493k0() throws IOException {
        while (this.f3910m > this.f3908k) {
            mo5124i0((String) this.f3912o.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: u */
    private void m5499u() {
        if (this.f3911n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    /* renamed from: w */
    private static void m5500w(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m5501x(com.bumptech.glide.p005l.C0983a.C0986c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.l.a$d r0 = r10.f3918a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.l.a$c r1 = r0.f3927f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f3926e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f3909l     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f3919b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo5133k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo5128a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo5128a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f3909l     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo5133k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo5132j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f3923b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f3923b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f3910m     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f3910m = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m5480H(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f3913p     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f3913p = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            com.bumptech.glide.p005l.C0983a.C0986c unused = r0.f3927f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f3926e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f3926e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f3922a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo5134l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f3914q     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f3914q = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f3928g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r10 = r9.f3912o     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f3922a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f3922a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f3911n     // Catch:{ all -> 0x010e }
            m5482S(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f3910m     // Catch:{ all -> 0x010e }
            long r0 = r9.f3908k     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m5483X()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f3915r     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f3916s     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x0112
        L_0x0111:
            throw r10
        L_0x0112:
            goto L_0x0111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p005l.C0983a.m5501x(com.bumptech.glide.l.a$c, boolean):void");
    }

    /* renamed from: D */
    public void mo5120D() throws IOException {
        close();
        C0991c.m5533b(this.f3903f);
    }

    /* renamed from: J */
    public C0986c mo5121J(String str) throws IOException {
        return m5481Q(str, -1);
    }

    /* renamed from: V */
    public synchronized C0988e mo5122V(String str) throws IOException {
        m5499u();
        C0987d dVar = this.f3912o.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f3926e) {
            return null;
        }
        for (File exists : dVar.f3924c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f3913p++;
        this.f3911n.append("READ");
        this.f3911n.append(' ');
        this.f3911n.append(str);
        this.f3911n.append(10);
        if (m5483X()) {
            this.f3915r.submit(this.f3916s);
        }
        return new C0988e(this, str, dVar.f3928g, dVar.f3924c, dVar.f3923b, (C0984a) null);
    }

    public synchronized void close() throws IOException {
        if (this.f3911n != null) {
            Iterator it = new ArrayList(this.f3912o.values()).iterator();
            while (it.hasNext()) {
                C0987d dVar = (C0987d) it.next();
                if (dVar.f3927f != null) {
                    dVar.f3927f.mo5128a();
                }
            }
            m5493k0();
            m5500w(this.f3911n);
            this.f3911n = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo5124i0(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m5499u()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r0 = r7.f3912o     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.l.a$d r0 = (com.bumptech.glide.p005l.C0983a.C0987d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.l.a$c r2 = r0.f3927f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f3909l     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo5132j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f3910m     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f3923b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f3910m = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f3923b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f3913p     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f3913p = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f3911n     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f3911n     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f3911n     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f3911n     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r0 = r7.f3912o     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m5483X()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f3915r     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f3916s     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0093
        L_0x0092:
            throw r8
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p005l.C0983a.mo5124i0(java.lang.String):boolean");
    }
}
