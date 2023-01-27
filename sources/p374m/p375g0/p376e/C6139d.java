package p374m.p375g0.p376e;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p374m.p375g0.C6130c;
import p374m.p375g0.p381j.C6217a;
import p374m.p375g0.p382k.C6228f;
import p385n.C6280d;
import p385n.C6288l;
import p385n.C6299r;
import p385n.C6300s;

/* renamed from: m.g0.e.d */
public final class C6139d implements Closeable, Flushable {

    /* renamed from: z */
    static final Pattern f17235z = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: f */
    final C6217a f17236f;

    /* renamed from: g */
    final File f17237g;

    /* renamed from: h */
    private final File f17238h;

    /* renamed from: i */
    private final File f17239i;

    /* renamed from: j */
    private final File f17240j;

    /* renamed from: k */
    private final int f17241k;

    /* renamed from: l */
    private long f17242l;

    /* renamed from: m */
    final int f17243m;

    /* renamed from: n */
    private long f17244n = 0;

    /* renamed from: o */
    C6280d f17245o;

    /* renamed from: p */
    final LinkedHashMap<String, C6144d> f17246p = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: q */
    int f17247q;

    /* renamed from: r */
    boolean f17248r;

    /* renamed from: s */
    boolean f17249s;

    /* renamed from: t */
    boolean f17250t;

    /* renamed from: u */
    boolean f17251u;

    /* renamed from: v */
    boolean f17252v;

    /* renamed from: w */
    private long f17253w = 0;

    /* renamed from: x */
    private final Executor f17254x;

    /* renamed from: y */
    private final Runnable f17255y = new C6140a();

    /* renamed from: m.g0.e.d$a */
    class C6140a implements Runnable {
        C6140a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f17256f.f17252v = true;
            r5.f17256f.f17245o = p385n.C6288l.m25932c(p385n.C6288l.m25931b());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                m.g0.e.d r0 = p374m.p375g0.p376e.C6139d.this
                monitor-enter(r0)
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f17249s     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                m.g0.e.d r4 = p374m.p375g0.p376e.C6139d.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.f17250t     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ IOException -> 0x001d }
                r1.mo17361X()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ all -> 0x0045 }
                r1.f17251u = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.mo17371w()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ IOException -> 0x0033 }
                r1.mo17358Q()     // Catch:{ IOException -> 0x0033 }
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ IOException -> 0x0033 }
                r1.f17247q = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ all -> 0x0045 }
                r1.f17252v = r3     // Catch:{ all -> 0x0045 }
                m.g0.e.d r1 = p374m.p375g0.p376e.C6139d.this     // Catch:{ all -> 0x0045 }
                n.r r2 = p385n.C6288l.m25931b()     // Catch:{ all -> 0x0045 }
                n.d r2 = p385n.C6288l.m25932c(r2)     // Catch:{ all -> 0x0045 }
                r1.f17245o = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6139d.C6140a.run():void");
        }
    }

    /* renamed from: m.g0.e.d$b */
    class C6141b extends C6146e {
        static {
            Class<C6139d> cls = C6139d.class;
        }

        C6141b(C6299r rVar) {
            super(rVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo17373a(IOException iOException) {
            C6139d.this.f17248r = true;
        }
    }

    /* renamed from: m.g0.e.d$c */
    public final class C6142c {

        /* renamed from: a */
        final C6144d f17258a;

        /* renamed from: b */
        final boolean[] f17259b;

        /* renamed from: c */
        private boolean f17260c;

        /* renamed from: m.g0.e.d$c$a */
        class C6143a extends C6146e {
            C6143a(C6299r rVar) {
                super(rVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo17373a(IOException iOException) {
                synchronized (C6139d.this) {
                    C6142c.this.mo17376c();
                }
            }
        }

        C6142c(C6144d dVar) {
            this.f17258a = dVar;
            this.f17259b = dVar.f17267e ? null : new boolean[C6139d.this.f17243m];
        }

        /* renamed from: a */
        public void mo17374a() throws IOException {
            synchronized (C6139d.this) {
                if (!this.f17260c) {
                    if (this.f17258a.f17268f == this) {
                        C6139d.this.mo17364h(this, false);
                    }
                    this.f17260c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public void mo17375b() throws IOException {
            synchronized (C6139d.this) {
                if (!this.f17260c) {
                    if (this.f17258a.f17268f == this) {
                        C6139d.this.mo17364h(this, true);
                    }
                    this.f17260c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo17376c() {
            if (this.f17258a.f17268f == this) {
                int i = 0;
                while (true) {
                    C6139d dVar = C6139d.this;
                    if (i < dVar.f17243m) {
                        try {
                            dVar.f17236f.mo17566a(this.f17258a.f17266d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f17258a.f17268f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: d */
        public C6299r mo17377d(int i) {
            synchronized (C6139d.this) {
                if (this.f17260c) {
                    throw new IllegalStateException();
                } else if (this.f17258a.f17268f != this) {
                    C6299r b = C6288l.m25931b();
                    return b;
                } else {
                    if (!this.f17258a.f17267e) {
                        this.f17259b[i] = true;
                    }
                    try {
                        C6143a aVar = new C6143a(C6139d.this.f17236f.mo17568c(this.f17258a.f17266d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return C6288l.m25931b();
                    }
                }
            }
        }
    }

    /* renamed from: m.g0.e.d$d */
    private final class C6144d {

        /* renamed from: a */
        final String f17263a;

        /* renamed from: b */
        final long[] f17264b;

        /* renamed from: c */
        final File[] f17265c;

        /* renamed from: d */
        final File[] f17266d;

        /* renamed from: e */
        boolean f17267e;

        /* renamed from: f */
        C6142c f17268f;

        /* renamed from: g */
        long f17269g;

        C6144d(String str) {
            this.f17263a = str;
            int i = C6139d.this.f17243m;
            this.f17264b = new long[i];
            this.f17265c = new File[i];
            this.f17266d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C6139d.this.f17243m; i2++) {
                sb.append(i2);
                this.f17265c[i2] = new File(C6139d.this.f17237g, sb.toString());
                sb.append(".tmp");
                this.f17266d[i2] = new File(C6139d.this.f17237g, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        private IOException m25106a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17378b(String[] strArr) throws IOException {
            if (strArr.length == C6139d.this.f17243m) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f17264b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m25106a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m25106a(strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C6145e mo17379c() {
            if (Thread.holdsLock(C6139d.this)) {
                C6300s[] sVarArr = new C6300s[C6139d.this.f17243m];
                long[] jArr = (long[]) this.f17264b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C6139d.this.f17243m) {
                    try {
                        sVarArr[i2] = C6139d.this.f17236f.mo17567b(this.f17265c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C6139d.this.f17243m && sVarArr[i] != null) {
                            C6130c.m25044g(sVarArr[i]);
                            i++;
                        }
                        try {
                            C6139d.this.mo17360V(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new C6145e(this.f17263a, this.f17269g, sVarArr, jArr);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17380d(C6280d dVar) throws IOException {
            for (long Z : this.f17264b) {
                dVar.mo17796B(32).mo17811Z(Z);
            }
        }
    }

    /* renamed from: m.g0.e.d$e */
    public final class C6145e implements Closeable {

        /* renamed from: f */
        private final String f17271f;

        /* renamed from: g */
        private final long f17272g;

        /* renamed from: h */
        private final C6300s[] f17273h;

        C6145e(String str, long j, C6300s[] sVarArr, long[] jArr) {
            this.f17271f = str;
            this.f17272g = j;
            this.f17273h = sVarArr;
        }

        /* renamed from: a */
        public C6142c mo17381a() throws IOException {
            return C6139d.this.mo17367q(this.f17271f, this.f17272g);
        }

        public void close() {
            for (C6300s g : this.f17273h) {
                C6130c.m25044g(g);
            }
        }

        /* renamed from: h */
        public C6300s mo17383h(int i) {
            return this.f17273h[i];
        }
    }

    static {
        Class<C6139d> cls = C6139d.class;
    }

    C6139d(C6217a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f17236f = aVar;
        this.f17237g = file;
        this.f17241k = i;
        this.f17238h = new File(file, "journal");
        this.f17239i = new File(file, "journal.tmp");
        this.f17240j = new File(file, "journal.bkp");
        this.f17243m = i2;
        this.f17242l = j;
        this.f17254x = executor;
    }

    /* renamed from: D */
    private void m25081D() throws IOException {
        this.f17236f.mo17566a(this.f17239i);
        Iterator<C6144d> it = this.f17246p.values().iterator();
        while (it.hasNext()) {
            C6144d next = it.next();
            int i = 0;
            if (next.f17268f == null) {
                while (i < this.f17243m) {
                    this.f17244n += next.f17264b[i];
                    i++;
                }
            } else {
                next.f17268f = null;
                while (i < this.f17243m) {
                    this.f17236f.mo17566a(next.f17265c[i]);
                    this.f17236f.mo17566a(next.f17266d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f17247q = r0 - r9.f17246p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo17794A() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo17358Q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f17245o = m25087x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007a=Splitter:B:23:0x007a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25082H() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            m.g0.j.a r1 = r9.f17236f
            java.io.File r2 = r9.f17238h
            n.s r1 = r1.mo17567b(r2)
            n.e r1 = p385n.C6288l.m25933d(r1)
            java.lang.String r2 = r1.mo17849s()     // Catch:{ all -> 0x00a8 }
            java.lang.String r3 = r1.mo17849s()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = r1.mo17849s()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r1.mo17849s()     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = r1.mo17849s()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a8 }
            if (r7 == 0) goto L_0x007a
            int r7 = r9.f17241k     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            int r4 = r9.f17243m     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x007a
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo17849s()     // Catch:{ EOFException -> 0x005d }
            r9.m25083J(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, m.g0.e.d$d> r2 = r9.f17246p     // Catch:{ all -> 0x00a8 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 - r2
            r9.f17247q = r0     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.mo17794A()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x0070
            r9.mo17358Q()     // Catch:{ all -> 0x00a8 }
            goto L_0x0076
        L_0x0070:
            n.d r0 = r9.m25087x()     // Catch:{ all -> 0x00a8 }
            r9.f17245o = r0     // Catch:{ all -> 0x00a8 }
        L_0x0076:
            p374m.p375g0.C6130c.m25044g(r1)
            return
        L_0x007a:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r7.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a8 }
            r7.append(r2)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r3)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r5)     // Catch:{ all -> 0x00a8 }
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            r7.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a8 }
            throw r4     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            p374m.p375g0.C6130c.m25044g(r1)
            goto L_0x00ae
        L_0x00ad:
            throw r0
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6139d.m25082H():void");
    }

    /* renamed from: J */
    private void m25083J(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f17246p.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C6144d dVar = this.f17246p.get(str2);
            if (dVar == null) {
                dVar = new C6144d(str2);
                this.f17246p.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f17267e = true;
                dVar.f17268f = null;
                dVar.mo17378b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f17268f = new C6142c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: a */
    private synchronized void m25084a() {
        if (mo17370u()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a0 */
    private void m25085a0(String str) {
        if (!f17235z.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: j */
    public static C6139d m25086j(C6217a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C6139d(aVar, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C6130c.m25034G("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: x */
    private C6280d m25087x() throws FileNotFoundException {
        return C6288l.m25932c(new C6141b(this.f17236f.mo17570e(this.f17238h)));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public synchronized void mo17358Q() throws IOException {
        if (this.f17245o != null) {
            this.f17245o.close();
        }
        C6280d c = C6288l.m25932c(this.f17236f.mo17568c(this.f17239i));
        try {
            c.mo17810Y("libcore.io.DiskLruCache").mo17796B(10);
            c.mo17810Y("1").mo17796B(10);
            c.mo17811Z((long) this.f17241k).mo17796B(10);
            c.mo17811Z((long) this.f17243m).mo17796B(10);
            c.mo17796B(10);
            for (C6144d next : this.f17246p.values()) {
                if (next.f17268f != null) {
                    c.mo17810Y("DIRTY").mo17796B(32);
                    c.mo17810Y(next.f17263a);
                } else {
                    c.mo17810Y("CLEAN").mo17796B(32);
                    c.mo17810Y(next.f17263a);
                    next.mo17380d(c);
                }
                c.mo17796B(10);
            }
            c.close();
            if (this.f17236f.mo17571f(this.f17238h)) {
                this.f17236f.mo17572g(this.f17238h, this.f17240j);
            }
            this.f17236f.mo17572g(this.f17239i, this.f17238h);
            this.f17236f.mo17566a(this.f17240j);
            this.f17245o = m25087x();
            this.f17248r = false;
            this.f17252v = false;
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo17359S(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo17369t()     // Catch:{ all -> 0x0029 }
            r6.m25084a()     // Catch:{ all -> 0x0029 }
            r6.m25085a0(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, m.g0.e.d$d> r0 = r6.f17246p     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            m.g0.e.d$d r7 = (p374m.p375g0.p376e.C6139d.C6144d) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo17360V(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f17244n     // Catch:{ all -> 0x0029 }
            long r3 = r6.f17242l     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f17251u = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6139d.mo17359S(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo17360V(C6144d dVar) throws IOException {
        C6142c cVar = dVar.f17268f;
        if (cVar != null) {
            cVar.mo17376c();
        }
        for (int i = 0; i < this.f17243m; i++) {
            this.f17236f.mo17566a(dVar.f17265c[i]);
            long j = this.f17244n;
            long[] jArr = dVar.f17264b;
            this.f17244n = j - jArr[i];
            jArr[i] = 0;
        }
        this.f17247q++;
        this.f17245o.mo17810Y("REMOVE").mo17796B(32).mo17810Y(dVar.f17263a).mo17796B(10);
        this.f17246p.remove(dVar.f17263a);
        if (mo17371w()) {
            this.f17254x.execute(this.f17255y);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo17361X() throws IOException {
        while (this.f17244n > this.f17242l) {
            mo17360V(this.f17246p.values().iterator().next());
        }
        this.f17251u = false;
    }

    public synchronized void close() throws IOException {
        if (this.f17249s) {
            if (!this.f17250t) {
                for (C6144d dVar : (C6144d[]) this.f17246p.values().toArray(new C6144d[this.f17246p.size()])) {
                    if (dVar.f17268f != null) {
                        dVar.f17268f.mo17374a();
                    }
                }
                mo17361X();
                this.f17245o.close();
                this.f17245o = null;
                this.f17250t = true;
                return;
            }
        }
        this.f17250t = true;
    }

    public synchronized void flush() throws IOException {
        if (this.f17249s) {
            m25084a();
            mo17361X();
            this.f17245o.flush();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo17364h(p374m.p375g0.p376e.C6139d.C6142c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            m.g0.e.d$d r0 = r10.f17258a     // Catch:{ all -> 0x00fb }
            m.g0.e.d$c r1 = r0.f17268f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f17267e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f17243m     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f17259b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            m.g0.j.a r3 = r9.f17236f     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f17266d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.mo17571f(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo17374a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo17374a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.f17243m     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f17266d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            m.g0.j.a r2 = r9.f17236f     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.mo17571f(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f17265c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            m.g0.j.a r3 = r9.f17236f     // Catch:{ all -> 0x00fb }
            r3.mo17572g(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f17264b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            m.g0.j.a r10 = r9.f17236f     // Catch:{ all -> 0x00fb }
            long r5 = r10.mo17573h(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f17264b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f17244n     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f17244n = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            m.g0.j.a r2 = r9.f17236f     // Catch:{ all -> 0x00fb }
            r2.mo17566a(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f17247q     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f17247q = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f17268f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f17267e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f17267e = r1     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            n.d r10 = r10.mo17810Y(r1)     // Catch:{ all -> 0x00fb }
            r10.mo17796B(r3)     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f17263a     // Catch:{ all -> 0x00fb }
            r10.mo17810Y(r1)     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            r0.mo17380d(r10)     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            r10.mo17796B(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f17253w     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f17253w = r1     // Catch:{ all -> 0x00fb }
            r0.f17269g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, m.g0.e.d$d> r10 = r9.f17246p     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f17263a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            n.d r10 = r10.mo17810Y(r11)     // Catch:{ all -> 0x00fb }
            r10.mo17796B(r3)     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f17263a     // Catch:{ all -> 0x00fb }
            r10.mo17810Y(r11)     // Catch:{ all -> 0x00fb }
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            r10.mo17796B(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            n.d r10 = r9.f17245o     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f17244n     // Catch:{ all -> 0x00fb }
            long r0 = r9.f17242l     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo17371w()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f17254x     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f17255y     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x00ff
        L_0x00fe:
            throw r10
        L_0x00ff:
            goto L_0x00fe
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6139d.mo17364h(m.g0.e.d$c, boolean):void");
    }

    /* renamed from: m */
    public void mo17365m() throws IOException {
        close();
        this.f17236f.mo17569d(this.f17237g);
    }

    /* renamed from: o */
    public C6142c mo17366o(String str) throws IOException {
        return mo17367q(str, -1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p374m.p375g0.p376e.C6139d.C6142c mo17367q(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo17369t()     // Catch:{ all -> 0x0074 }
            r5.m25084a()     // Catch:{ all -> 0x0074 }
            r5.m25085a0(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, m.g0.e.d$d> r0 = r5.f17246p     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            m.g0.e.d$d r0 = (p374m.p375g0.p376e.C6139d.C6144d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f17269g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            m.g0.e.d$c r7 = r0.f17268f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f17251u     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f17252v     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            n.d r7 = r5.f17245o     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            n.d r7 = r7.mo17810Y(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            n.d r7 = r7.mo17796B(r8)     // Catch:{ all -> 0x0074 }
            n.d r7 = r7.mo17810Y(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.mo17796B(r8)     // Catch:{ all -> 0x0074 }
            n.d r7 = r5.f17245o     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f17248r     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            m.g0.e.d$d r0 = new m.g0.e.d$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, m.g0.e.d$d> r7 = r5.f17246p     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            m.g0.e.d$c r6 = new m.g0.e.d$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f17268f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f17254x     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f17255y     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6139d.mo17367q(java.lang.String, long):m.g0.e.d$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p374m.p375g0.p376e.C6139d.C6145e mo17368r(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo17369t()     // Catch:{ all -> 0x0050 }
            r3.m25084a()     // Catch:{ all -> 0x0050 }
            r3.m25085a0(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, m.g0.e.d$d> r0 = r3.f17246p     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            m.g0.e.d$d r0 = (p374m.p375g0.p376e.C6139d.C6144d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f17267e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            m.g0.e.d$e r0 = r0.mo17379c()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f17247q     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f17247q = r1     // Catch:{ all -> 0x0050 }
            n.d r1 = r3.f17245o     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            n.d r1 = r1.mo17810Y(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            n.d r1 = r1.mo17796B(r2)     // Catch:{ all -> 0x0050 }
            n.d r4 = r1.mo17810Y(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.mo17796B(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo17371w()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f17254x     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f17255y     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p374m.p375g0.p376e.C6139d.mo17368r(java.lang.String):m.g0.e.d$e");
    }

    /* renamed from: t */
    public synchronized void mo17369t() throws IOException {
        if (!this.f17249s) {
            if (this.f17236f.mo17571f(this.f17240j)) {
                if (this.f17236f.mo17571f(this.f17238h)) {
                    this.f17236f.mo17566a(this.f17240j);
                } else {
                    this.f17236f.mo17572g(this.f17240j, this.f17238h);
                }
            }
            if (this.f17236f.mo17571f(this.f17238h)) {
                try {
                    m25082H();
                    m25081D();
                    this.f17249s = true;
                    return;
                } catch (IOException e) {
                    C6228f j = C6228f.m25514j();
                    j.mo17582q(5, "DiskLruCache " + this.f17237g + " is corrupt: " + e.getMessage() + ", removing", e);
                    mo17365m();
                    this.f17250t = false;
                } catch (Throwable th) {
                    this.f17250t = false;
                    throw th;
                }
            }
            mo17358Q();
            this.f17249s = true;
        }
    }

    /* renamed from: u */
    public synchronized boolean mo17370u() {
        return this.f17250t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo17371w() {
        int i = this.f17247q;
        return i >= 2000 && i >= this.f17246p.size();
    }
}
