package p340io.realm;

import p340io.realm.internal.C5720n;
import p340io.realm.internal.C5722p;

/* renamed from: io.realm.l */
public class C5761l extends C5771n0 implements C5720n {

    /* renamed from: a */
    private final C5642c0<C5761l> f16610a;

    /* renamed from: io.realm.l$a */
    static /* synthetic */ class C5762a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16611a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.realm.RealmFieldType[] r0 = p340io.realm.RealmFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16611a = r0
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.INTEGER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.STRING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.BINARY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.DATE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.OBJECT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.LIST     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.LINKING_OBJECTS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0084 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.INTEGER_LIST     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x0090 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.BOOLEAN_LIST     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x009c }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.STRING_LIST     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.BINARY_LIST     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.DATE_LIST     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.FLOAT_LIST     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f16611a     // Catch:{ NoSuchFieldError -> 0x00cc }
                io.realm.RealmFieldType r1 = p340io.realm.RealmFieldType.DOUBLE_LIST     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5761l.C5762a.<clinit>():void");
        }
    }

    C5761l(C5632b bVar, C5722p pVar) {
        C5642c0<C5761l> c0Var = new C5642c0<>(this);
        this.f16610a = c0Var;
        c0Var.mo16264m(bVar);
        this.f16610a.mo16265n(pVar);
        this.f16610a.mo16262k();
    }

    /* renamed from: L */
    public C5642c0 mo16212L() {
        return this.f16610a;
    }

    /* renamed from: Q */
    public void mo16213Q() {
    }

    /* renamed from: U */
    public String[] mo16727U() {
        this.f16610a.mo16258e().mo16228j();
        int j = (int) this.f16610a.mo16259f().mo16591j();
        String[] strArr = new String[j];
        for (int i = 0; i < j; i++) {
            strArr[i] = this.f16610a.mo16259f().mo16584F((long) i);
        }
        return strArr;
    }

    /* renamed from: V */
    public String mo16728V() {
        this.f16610a.mo16258e().mo16228j();
        return this.f16610a.mo16259f().mo16592k().mo16549f();
    }

    public boolean equals(Object obj) {
        this.f16610a.mo16258e().mo16228j();
        if (this == obj) {
            return true;
        }
        if (obj == null || C5761l.class != obj.getClass()) {
            return false;
        }
        C5761l lVar = (C5761l) obj;
        String D = this.f16610a.mo16258e().mo16218D();
        String D2 = lVar.f16610a.mo16258e().mo16218D();
        if (D == null ? D2 != null : !D.equals(D2)) {
            return false;
        }
        String m = this.f16610a.mo16259f().mo16592k().mo16555m();
        String m2 = lVar.f16610a.mo16259f().mo16592k().mo16555m();
        if (m == null ? m2 == null : m.equals(m2)) {
            return this.f16610a.mo16259f().mo16589g() == lVar.f16610a.mo16259f().mo16589g();
        }
        return false;
    }

    public int hashCode() {
        this.f16610a.mo16258e().mo16228j();
        String D = this.f16610a.mo16258e().mo16218D();
        String m = this.f16610a.mo16259f().mo16592k().mo16555m();
        long g = this.f16610a.mo16259f().mo16589g();
        int i = 0;
        int hashCode = (527 + (D != null ? D.hashCode() : 0)) * 31;
        if (m != null) {
            i = m.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((g >>> 32) ^ g));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01e5, code lost:
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0259, code lost:
        r1.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x025c, code lost:
        r1.append("},");
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            io.realm.c0<io.realm.l> r0 = r11.f16610a
            io.realm.b r0 = r0.mo16258e()
            r0.mo16228j()
            io.realm.c0<io.realm.l> r0 = r11.f16610a
            io.realm.internal.p r0 = r0.mo16259f()
            boolean r0 = r0.mo16582A()
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0018:
            io.realm.c0<io.realm.l> r0 = r11.f16610a
            io.realm.internal.p r0 = r0.mo16259f()
            io.realm.internal.Table r0 = r0.mo16592k()
            java.lang.String r0 = r0.mo16549f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " = dynamic["
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            java.lang.String[] r0 = r11.mo16727U()
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0043:
            r5 = 1
            if (r4 >= r2) goto L_0x0265
            r6 = r0[r4]
            io.realm.c0<io.realm.l> r7 = r11.f16610a
            io.realm.internal.p r7 = r7.mo16259f()
            long r7 = r7.mo16606x(r6)
            io.realm.c0<io.realm.l> r9 = r11.f16610a
            io.realm.internal.p r9 = r9.mo16259f()
            io.realm.RealmFieldType r9 = r9.mo16586H(r7)
            java.lang.String r10 = "{"
            r1.append(r10)
            r1.append(r6)
            java.lang.String r6 = ":"
            r1.append(r6)
            int[] r6 = p340io.realm.C5761l.C5762a.f16611a
            int r10 = r9.ordinal()
            r6 = r6[r10]
            java.lang.String r10 = "null"
            switch(r6) {
                case 1: goto L_0x023e;
                case 2: goto L_0x0222;
                case 3: goto L_0x0206;
                case 4: goto L_0x01ea;
                case 5: goto L_0x01db;
                case 6: goto L_0x01cc;
                case 7: goto L_0x01b2;
                case 8: goto L_0x018e;
                case 9: goto L_0x015a;
                case 10: goto L_0x0076;
                case 11: goto L_0x013a;
                case 12: goto L_0x011a;
                case 13: goto L_0x00fa;
                case 14: goto L_0x00da;
                case 15: goto L_0x00ba;
                case 16: goto L_0x009a;
                case 17: goto L_0x007a;
                default: goto L_0x0076;
            }
        L_0x0076:
            java.lang.String r5 = "?"
            goto L_0x01e5
        L_0x007a:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Double>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x009a:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Float>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x00ba:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Date>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x00da:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<byte[]>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x00fa:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<String>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x011a:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Boolean>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x013a:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r5 = new java.lang.Object[r5]
            io.realm.c0<io.realm.l> r10 = r11.f16610a
            io.realm.internal.p r10 = r10.mo16259f()
            io.realm.internal.OsList r7 = r10.mo16344D(r7, r9)
            long r7 = r7.mo16396I()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r5[r3] = r7
            java.lang.String r7 = "RealmList<Long>[%s]"
            java.lang.String r5 = java.lang.String.format(r6, r7, r5)
            goto L_0x01e5
        L_0x015a:
            io.realm.c0<io.realm.l> r6 = r11.f16610a
            io.realm.internal.p r6 = r6.mo16259f()
            io.realm.internal.Table r6 = r6.mo16592k()
            io.realm.internal.Table r6 = r6.mo16554l(r7)
            java.lang.String r6 = r6.mo16549f()
            java.util.Locale r9 = java.util.Locale.US
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r6
            io.realm.c0<io.realm.l> r6 = r11.f16610a
            io.realm.internal.p r6 = r6.mo16259f()
            io.realm.internal.OsList r6 = r6.mo16368y(r7)
            long r6 = r6.mo16396I()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r10[r5] = r6
            java.lang.String r5 = "RealmList<%s>[%s]"
            java.lang.String r5 = java.lang.String.format(r9, r5, r10)
            goto L_0x01e5
        L_0x018e:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16346l(r7)
            if (r5 == 0) goto L_0x019b
            goto L_0x01ad
        L_0x019b:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            io.realm.internal.Table r5 = r5.mo16592k()
            io.realm.internal.Table r5 = r5.mo16554l(r7)
            java.lang.String r10 = r5.mo16549f()
        L_0x01ad:
            r1.append(r10)
            goto L_0x025c
        L_0x01b2:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16345E(r7)
            if (r5 == 0) goto L_0x01c0
            goto L_0x0259
        L_0x01c0:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            java.util.Date r10 = r5.mo16583B(r7)
            goto L_0x0259
        L_0x01cc:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            byte[] r5 = r5.mo16593n(r7)
            java.lang.String r5 = java.util.Arrays.toString(r5)
            goto L_0x01e5
        L_0x01db:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            java.lang.String r5 = r5.mo16604v(r7)
        L_0x01e5:
            r1.append(r5)
            goto L_0x025c
        L_0x01ea:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16345E(r7)
            if (r5 == 0) goto L_0x01f7
            goto L_0x0259
        L_0x01f7:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            double r5 = r5.mo16599q(r7)
            java.lang.Double r10 = java.lang.Double.valueOf(r5)
            goto L_0x0259
        L_0x0206:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16345E(r7)
            if (r5 == 0) goto L_0x0213
            goto L_0x0259
        L_0x0213:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            float r5 = r5.mo16602t(r7)
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
            goto L_0x0259
        L_0x0222:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16345E(r7)
            if (r5 == 0) goto L_0x022f
            goto L_0x0259
        L_0x022f:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            long r5 = r5.mo16603u(r7)
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            goto L_0x0259
        L_0x023e:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16345E(r7)
            if (r5 == 0) goto L_0x024b
            goto L_0x0259
        L_0x024b:
            io.realm.c0<io.realm.l> r5 = r11.f16610a
            io.realm.internal.p r5 = r5.mo16259f()
            boolean r5 = r5.mo16600r(r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
        L_0x0259:
            r1.append(r10)
        L_0x025c:
            java.lang.String r5 = "},"
            r1.append(r5)
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0265:
            int r0 = r1.length()
            int r0 = r0 - r5
            int r2 = r1.length()
            java.lang.String r3 = ""
            r1.replace(r0, r2, r3)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.C5761l.toString():java.lang.String");
    }
}
