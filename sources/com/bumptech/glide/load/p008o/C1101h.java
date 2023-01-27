package com.bumptech.glide.load.p008o;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C0967d;
import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1005l;
import com.bumptech.glide.load.C1006m;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p006n.C1012e;
import com.bumptech.glide.load.p008o.C1098f;
import com.bumptech.glide.load.p008o.C1110i;
import com.bumptech.glide.load.p008o.p010b0.C1066a;
import com.bumptech.glide.load.p014q.p015d.C1256m;
import com.bumptech.glide.p029s.C1397f;
import com.bumptech.glide.p029s.p030l.C1404a;
import com.bumptech.glide.p029s.p030l.C1412b;
import com.bumptech.glide.p029s.p030l.C1413c;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.h */
class C1101h<R> implements C1098f.C1099a, Runnable, Comparable<C1101h<?>>, C1404a.C1410f {

    /* renamed from: A */
    private Object f4136A;

    /* renamed from: B */
    private Thread f4137B;

    /* renamed from: C */
    private C0998g f4138C;

    /* renamed from: D */
    private C0998g f4139D;

    /* renamed from: E */
    private Object f4140E;

    /* renamed from: F */
    private C0992a f4141F;

    /* renamed from: G */
    private C1010d<?> f4142G;

    /* renamed from: H */
    private volatile C1098f f4143H;

    /* renamed from: I */
    private volatile boolean f4144I;

    /* renamed from: J */
    private volatile boolean f4145J;

    /* renamed from: f */
    private final C1100g<R> f4146f = new C1100g<>();

    /* renamed from: g */
    private final List<Throwable> f4147g = new ArrayList();

    /* renamed from: h */
    private final C1413c f4148h = C1413c.m7013a();

    /* renamed from: i */
    private final C1106e f4149i;

    /* renamed from: j */
    private final C3346e<C1101h<?>> f4150j;

    /* renamed from: k */
    private final C1105d<?> f4151k = new C1105d<>();

    /* renamed from: l */
    private final C1107f f4152l = new C1107f();

    /* renamed from: m */
    private C0967d f4153m;

    /* renamed from: n */
    private C0998g f4154n;

    /* renamed from: o */
    private C0969f f4155o;

    /* renamed from: p */
    private C1130n f4156p;

    /* renamed from: q */
    private int f4157q;

    /* renamed from: r */
    private int f4158r;

    /* renamed from: s */
    private C1112j f4159s;

    /* renamed from: t */
    private C1002i f4160t;

    /* renamed from: u */
    private C1103b<R> f4161u;

    /* renamed from: v */
    private int f4162v;

    /* renamed from: w */
    private C1109h f4163w;

    /* renamed from: x */
    private C1108g f4164x;

    /* renamed from: y */
    private long f4165y;

    /* renamed from: z */
    private boolean f4166z;

    /* renamed from: com.bumptech.glide.load.o.h$a */
    static /* synthetic */ class C1102a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4167a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4168b;

        /* renamed from: c */
        static final /* synthetic */ int[] f4169c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.C0994c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4169c = r0
                r1 = 1
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.C0994c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4169c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.C0994c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.o.h$h[] r2 = com.bumptech.glide.load.p008o.C1101h.C1109h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f4168b = r2
                com.bumptech.glide.load.o.h$h r3 = com.bumptech.glide.load.p008o.C1101h.C1109h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f4168b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.o.h$h r3 = com.bumptech.glide.load.p008o.C1101h.C1109h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f4168b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.o.h$h r4 = com.bumptech.glide.load.p008o.C1101h.C1109h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f4168b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.o.h$h r4 = com.bumptech.glide.load.p008o.C1101h.C1109h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f4168b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.o.h$h r4 = com.bumptech.glide.load.p008o.C1101h.C1109h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.o.h$g[] r3 = com.bumptech.glide.load.p008o.C1101h.C1108g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f4167a = r3
                com.bumptech.glide.load.o.h$g r4 = com.bumptech.glide.load.p008o.C1101h.C1108g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f4167a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.o.h$g r3 = com.bumptech.glide.load.p008o.C1101h.C1108g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f4167a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.o.h$g r1 = com.bumptech.glide.load.p008o.C1101h.C1108g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p008o.C1101h.C1102a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$b */
    interface C1103b<R> {
        /* renamed from: a */
        void mo5363a(C1134q qVar);

        /* renamed from: b */
        void mo5364b(C1141v<R> vVar, C0992a aVar);

        /* renamed from: c */
        void mo5365c(C1101h<?> hVar);
    }

    /* renamed from: com.bumptech.glide.load.o.h$c */
    private final class C1104c<Z> implements C1110i.C1111a<Z> {

        /* renamed from: a */
        private final C0992a f4170a;

        C1104c(C0992a aVar) {
            this.f4170a = aVar;
        }

        /* renamed from: a */
        public C1141v<Z> mo5366a(C1141v<Z> vVar) {
            return C1101h.this.mo5355B(this.f4170a, vVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$d */
    private static class C1105d<Z> {

        /* renamed from: a */
        private C0998g f4172a;

        /* renamed from: b */
        private C1005l<Z> f4173b;

        /* renamed from: c */
        private C1139u<Z> f4174c;

        C1105d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5367a() {
            this.f4172a = null;
            this.f4173b = null;
            this.f4174c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5368b(C1106e eVar, C1002i iVar) {
            C1412b.m7009a("DecodeJob.encode");
            try {
                eVar.mo5371a().mo5278a(this.f4172a, new C1097e(this.f4173b, this.f4174c, iVar));
            } finally {
                this.f4174c.mo5448g();
                C1412b.m7012d();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo5369c() {
            return this.f4174c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <X> void mo5370d(C0998g gVar, C1005l<X> lVar, C1139u<X> uVar) {
            this.f4172a = gVar;
            this.f4173b = lVar;
            this.f4174c = uVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$e */
    interface C1106e {
        /* renamed from: a */
        C1066a mo5371a();
    }

    /* renamed from: com.bumptech.glide.load.o.h$f */
    private static class C1107f {

        /* renamed from: a */
        private boolean f4175a;

        /* renamed from: b */
        private boolean f4176b;

        /* renamed from: c */
        private boolean f4177c;

        C1107f() {
        }

        /* renamed from: a */
        private boolean m5913a(boolean z) {
            return (this.f4177c || z || this.f4176b) && this.f4175a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo5372b() {
            this.f4176b = true;
            return m5913a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo5373c() {
            this.f4177c = true;
            return m5913a(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public synchronized boolean mo5374d(boolean z) {
            this.f4175a = true;
            return m5913a(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo5375e() {
            this.f4176b = false;
            this.f4175a = false;
            this.f4177c = false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.h$g */
    private enum C1108g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.o.h$h */
    private enum C1109h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C1101h(C1106e eVar, C3346e<C1101h<?>> eVar2) {
        this.f4149i = eVar;
        this.f4150j = eVar2;
    }

    /* renamed from: A */
    private void m5875A() {
        if (this.f4152l.mo5373c()) {
            m5876D();
        }
    }

    /* renamed from: D */
    private void m5876D() {
        this.f4152l.mo5375e();
        this.f4151k.mo5367a();
        this.f4146f.mo5331a();
        this.f4144I = false;
        this.f4153m = null;
        this.f4154n = null;
        this.f4160t = null;
        this.f4155o = null;
        this.f4156p = null;
        this.f4161u = null;
        this.f4163w = null;
        this.f4143H = null;
        this.f4137B = null;
        this.f4138C = null;
        this.f4140E = null;
        this.f4141F = null;
        this.f4142G = null;
        this.f4165y = 0;
        this.f4145J = false;
        this.f4136A = null;
        this.f4147g.clear();
        this.f4150j.mo5908a(this);
    }

    /* renamed from: E */
    private void m5877E() {
        this.f4137B = Thread.currentThread();
        this.f4165y = C1397f.m6956b();
        boolean z = false;
        while (!this.f4145J && this.f4143H != null && !(z = this.f4143H.mo5307a())) {
            this.f4163w = m5885q(this.f4163w);
            this.f4143H = m5884o();
            if (this.f4163w == C1109h.SOURCE) {
                mo5328e();
                return;
            }
        }
        if ((this.f4163w == C1109h.FINISHED || this.f4145J) && !z) {
            m5892y();
        }
    }

    /* renamed from: F */
    private <Data, ResourceType> C1141v<R> m5878F(Data data, C0992a aVar, C1138t<Data, ResourceType, R> tVar) throws C1134q {
        C1002i r = m5886r(aVar);
        C1012e l = this.f4153m.mo5062h().mo5074l(data);
        try {
            return tVar.mo5446a(l, r, this.f4157q, this.f4158r, new C1104c(aVar));
        } finally {
            l.mo5181b();
        }
    }

    /* renamed from: G */
    private void m5879G() {
        int i = C1102a.f4167a[this.f4164x.ordinal()];
        if (i == 1) {
            this.f4163w = m5885q(C1109h.INITIALIZE);
            this.f4143H = m5884o();
        } else if (i != 2) {
            if (i == 3) {
                m5883n();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f4164x);
        }
        m5877E();
    }

    /* renamed from: H */
    private void m5880H() {
        Throwable th;
        this.f4148h.mo5911c();
        if (this.f4144I) {
            if (this.f4147g.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f4147g;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f4144I = true;
    }

    /* renamed from: l */
    private <Data> C1141v<R> m5881l(C1010d<?> dVar, Data data, C0992a aVar) throws C1134q {
        if (data == null) {
            dVar.mo5167b();
            return null;
        }
        try {
            long b = C1397f.m6956b();
            C1141v<R> m = m5882m(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m5888u("Decoded result " + m, b);
            }
            return m;
        } finally {
            dVar.mo5167b();
        }
    }

    /* renamed from: m */
    private <Data> C1141v<R> m5882m(Data data, C0992a aVar) throws C1134q {
        return m5878F(data, aVar, this.f4146f.mo5338h(data.getClass()));
    }

    /* renamed from: n */
    private void m5883n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f4165y;
            m5889v("Retrieved data", j, "data: " + this.f4140E + ", cache key: " + this.f4138C + ", fetcher: " + this.f4142G);
        }
        C1141v<R> vVar = null;
        try {
            vVar = m5881l(this.f4142G, this.f4140E, this.f4141F);
        } catch (C1134q e) {
            e.mo5433j(this.f4139D, this.f4141F);
            this.f4147g.add(e);
        }
        if (vVar != null) {
            m5891x(vVar, this.f4141F);
        } else {
            m5877E();
        }
    }

    /* renamed from: o */
    private C1098f m5884o() {
        int i = C1102a.f4168b[this.f4163w.ordinal()];
        if (i == 1) {
            return new C1142w(this.f4146f, this);
        }
        if (i == 2) {
            return new C1088c(this.f4146f, this);
        }
        if (i == 3) {
            return new C1146z(this.f4146f, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f4163w);
    }

    /* renamed from: q */
    private C1109h m5885q(C1109h hVar) {
        int i = C1102a.f4168b[hVar.ordinal()];
        if (i == 1) {
            return this.f4159s.mo5378a() ? C1109h.DATA_CACHE : m5885q(C1109h.DATA_CACHE);
        }
        if (i == 2) {
            return this.f4166z ? C1109h.FINISHED : C1109h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return C1109h.FINISHED;
        }
        if (i == 5) {
            return this.f4159s.mo5379b() ? C1109h.RESOURCE_CACHE : m5885q(C1109h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: r */
    private C1002i m5886r(C0992a aVar) {
        C1002i iVar = this.f4160t;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == C0992a.RESOURCE_DISK_CACHE || this.f4146f.mo5353w();
        Boolean bool = (Boolean) iVar.mo5154c(C1256m.f4455i);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        C1002i iVar2 = new C1002i();
        iVar2.mo5155d(this.f4160t);
        iVar2.mo5156e(C1256m.f4455i, Boolean.valueOf(z));
        return iVar2;
    }

    /* renamed from: s */
    private int m5887s() {
        return this.f4155o.ordinal();
    }

    /* renamed from: u */
    private void m5888u(String str, long j) {
        m5889v(str, j, (String) null);
    }

    /* renamed from: v */
    private void m5889v(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1397f.m6955a(j));
        sb.append(", load key: ");
        sb.append(this.f4156p);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: w */
    private void m5890w(C1141v<R> vVar, C0992a aVar) {
        m5880H();
        this.f4161u.mo5364b(vVar, aVar);
    }

    /* renamed from: x */
    private void m5891x(C1141v<R> vVar, C0992a aVar) {
        if (vVar instanceof C1136r) {
            ((C1136r) vVar).mo5442a();
        }
        C1139u<R> uVar = null;
        C1139u<R> uVar2 = vVar;
        if (this.f4151k.mo5369c()) {
            C1139u<R> e = C1139u.m6015e(vVar);
            uVar = e;
            uVar2 = e;
        }
        m5890w(uVar2, aVar);
        this.f4163w = C1109h.ENCODE;
        try {
            if (this.f4151k.mo5369c()) {
                this.f4151k.mo5368b(this.f4149i, this.f4160t);
            }
            m5893z();
        } finally {
            if (uVar != null) {
                uVar.mo5448g();
            }
        }
    }

    /* renamed from: y */
    private void m5892y() {
        m5880H();
        this.f4161u.mo5363a(new C1134q("Failed to load resource", (List<Throwable>) new ArrayList(this.f4147g)));
        m5875A();
    }

    /* renamed from: z */
    private void m5893z() {
        if (this.f4152l.mo5372b()) {
            m5876D();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.bumptech.glide.load.o.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.bumptech.glide.load.o.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.bumptech.glide.load.o.x} */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.g] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.p008o.C1141v<Z> mo5355B(com.bumptech.glide.load.C0992a r12, com.bumptech.glide.load.p008o.C1141v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C0992a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.o.g<R> r0 = r11.f4146f
            com.bumptech.glide.load.m r0 = r0.mo5348r(r8)
            com.bumptech.glide.d r2 = r11.f4153m
            int r3 = r11.f4157q
            int r4 = r11.f4158r
            com.bumptech.glide.load.o.v r2 = r0.mo5161a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.mo5422d()
        L_0x002b:
            com.bumptech.glide.load.o.g<R> r13 = r11.f4146f
            boolean r13 = r13.mo5352v(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.o.g<R> r13 = r11.f4146f
            com.bumptech.glide.load.l r1 = r13.mo5344n(r0)
            com.bumptech.glide.load.i r13 = r11.f4160t
            com.bumptech.glide.load.c r13 = r1.mo5160b(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.C0994c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.o.g<R> r1 = r11.f4146f
            com.bumptech.glide.load.g r2 = r11.f4138C
            boolean r1 = r1.mo5354x(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.o.j r3 = r11.f4159s
            boolean r12 = r3.mo5381d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.p008o.C1101h.C1102a.f4169c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.o.x r12 = new com.bumptech.glide.load.o.x
            com.bumptech.glide.load.o.g<R> r13 = r11.f4146f
            com.bumptech.glide.load.o.a0.b r2 = r13.mo5332b()
            com.bumptech.glide.load.g r3 = r11.f4138C
            com.bumptech.glide.load.g r4 = r11.f4154n
            int r5 = r11.f4157q
            int r6 = r11.f4158r
            com.bumptech.glide.load.i r9 = r11.f4160t
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.o.d r12 = new com.bumptech.glide.load.o.d
            com.bumptech.glide.load.g r13 = r11.f4138C
            com.bumptech.glide.load.g r1 = r11.f4154n
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.o.u r0 = com.bumptech.glide.load.p008o.C1139u.m6015e(r0)
            com.bumptech.glide.load.o.h$d<?> r13 = r11.f4151k
            r13.mo5370d(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.h$d r12 = new com.bumptech.glide.h$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p008o.C1101h.mo5355B(com.bumptech.glide.load.a, com.bumptech.glide.load.o.v):com.bumptech.glide.load.o.v");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo5356C(boolean z) {
        if (this.f4152l.mo5374d(z)) {
            m5876D();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo5357J() {
        C1109h q = m5885q(C1109h.INITIALIZE);
        return q == C1109h.RESOURCE_CACHE || q == C1109h.DATA_CACHE;
    }

    /* renamed from: e */
    public void mo5328e() {
        this.f4164x = C1108g.SWITCH_TO_SOURCE_SERVICE;
        this.f4161u.mo5365c(this);
    }

    /* renamed from: g */
    public void mo5329g(C0998g gVar, Exception exc, C1010d<?> dVar, C0992a aVar) {
        dVar.mo5167b();
        C1134q qVar = new C1134q("Fetching data failed", (Throwable) exc);
        qVar.mo5434k(gVar, aVar, dVar.mo5162a());
        this.f4147g.add(qVar);
        if (Thread.currentThread() != this.f4137B) {
            this.f4164x = C1108g.SWITCH_TO_SOURCE_SERVICE;
            this.f4161u.mo5365c(this);
            return;
        }
        m5877E();
    }

    /* renamed from: h */
    public void mo5330h(C0998g gVar, Object obj, C1010d<?> dVar, C0992a aVar, C0998g gVar2) {
        this.f4138C = gVar;
        this.f4140E = obj;
        this.f4142G = dVar;
        this.f4141F = aVar;
        this.f4139D = gVar2;
        if (Thread.currentThread() != this.f4137B) {
            this.f4164x = C1108g.DECODE_DATA;
            this.f4161u.mo5365c(this);
            return;
        }
        C1412b.m7009a("DecodeJob.decodeFromRetrievedData");
        try {
            m5883n();
        } finally {
            C1412b.m7012d();
        }
    }

    /* renamed from: i */
    public C1413c mo5306i() {
        return this.f4148h;
    }

    /* renamed from: j */
    public void mo5359j() {
        this.f4145J = true;
        C1098f fVar = this.f4143H;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* renamed from: k */
    public int compareTo(C1101h<?> hVar) {
        int s = m5887s() - hVar.m5887s();
        return s == 0 ? this.f4162v - hVar.f4162v : s;
    }

    public void run() {
        C1412b.m7010b("DecodeJob#run(model=%s)", this.f4136A);
        C1010d<?> dVar = this.f4142G;
        try {
            if (this.f4145J) {
                m5892y();
                if (dVar != null) {
                    dVar.mo5167b();
                }
                C1412b.m7012d();
                return;
            }
            m5879G();
            if (dVar != null) {
                dVar.mo5167b();
            }
            C1412b.m7012d();
        } catch (C1065b e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo5167b();
            }
            C1412b.m7012d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C1101h<R> mo5362t(C0967d dVar, Object obj, C1130n nVar, C0998g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0969f fVar, C1112j jVar, Map<Class<?>, C1006m<?>> map, boolean z, boolean z2, boolean z3, C1002i iVar, C1103b<R> bVar, int i3) {
        this.f4146f.mo5351u(dVar, obj, gVar, i, i2, jVar, cls, cls2, fVar, iVar, map, z, z2, this.f4149i);
        this.f4153m = dVar;
        this.f4154n = gVar;
        this.f4155o = fVar;
        this.f4156p = nVar;
        this.f4157q = i;
        this.f4158r = i2;
        this.f4159s = jVar;
        this.f4166z = z3;
        this.f4160t = iVar;
        this.f4161u = bVar;
        this.f4162v = i3;
        this.f4164x = C1108g.INITIALIZE;
        this.f4136A = obj;
        return this;
    }
}
