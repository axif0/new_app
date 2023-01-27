package p086f.p103f.p107b.p108k;

import java.util.HashSet;
import java.util.Iterator;
import p086f.p103f.p107b.C3210c;
import p086f.p103f.p107b.C3220i;

/* renamed from: f.f.b.k.d */
public class C3226d {

    /* renamed from: a */
    private HashSet<C3226d> f10314a = null;

    /* renamed from: b */
    public final C3229e f10315b;

    /* renamed from: c */
    public final C3228b f10316c;

    /* renamed from: d */
    public C3226d f10317d;

    /* renamed from: e */
    public int f10318e = 0;

    /* renamed from: f */
    int f10319f = -1;

    /* renamed from: g */
    C3220i f10320g;

    /* renamed from: f.f.b.k.d$a */
    static /* synthetic */ class C3227a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10321a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.f.b.k.d$b[] r0 = p086f.p103f.p107b.p108k.C3226d.C3228b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10321a = r0
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x0054 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x0060 }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f10321a     // Catch:{ NoSuchFieldError -> 0x006c }
                f.f.b.k.d$b r1 = p086f.p103f.p107b.p108k.C3226d.C3228b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.C3226d.C3227a.<clinit>():void");
        }
    }

    /* renamed from: f.f.b.k.d$b */
    public enum C3228b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3226d(C3229e eVar, C3228b bVar) {
        this.f10315b = eVar;
        this.f10316c = bVar;
    }

    /* renamed from: a */
    public boolean mo11260a(C3226d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo11270k();
            return true;
        } else if (!z && !mo11269j(dVar)) {
            return false;
        } else {
            this.f10317d = dVar;
            if (dVar.f10314a == null) {
                dVar.f10314a = new HashSet<>();
            }
            this.f10317d.f10314a.add(this);
            if (i > 0) {
                this.f10318e = i;
            } else {
                this.f10318e = 0;
            }
            this.f10319f = i2;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f10317d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo11261b() {
        /*
            r3 = this;
            f.f.b.k.e r0 = r3.f10315b
            int r0 = r0.mo11292M()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f10319f
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            f.f.b.k.d r0 = r3.f10317d
            if (r0 == 0) goto L_0x0020
            f.f.b.k.e r0 = r0.f10315b
            int r0 = r0.mo11292M()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f10319f
            return r0
        L_0x0020:
            int r0 = r3.f10318e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p103f.p107b.p108k.C3226d.mo11261b():int");
    }

    /* renamed from: c */
    public final C3226d mo11262c() {
        switch (C3227a.f10321a[this.f10316c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f10315b.f10333A;
            case 3:
                return this.f10315b.f10388y;
            case 4:
                return this.f10315b.f10334B;
            case 5:
                return this.f10315b.f10389z;
            default:
                throw new AssertionError(this.f10316c.name());
        }
    }

    /* renamed from: d */
    public C3229e mo11263d() {
        return this.f10315b;
    }

    /* renamed from: e */
    public C3220i mo11264e() {
        return this.f10320g;
    }

    /* renamed from: f */
    public C3226d mo11265f() {
        return this.f10317d;
    }

    /* renamed from: g */
    public C3228b mo11266g() {
        return this.f10316c;
    }

    /* renamed from: h */
    public boolean mo11267h() {
        HashSet<C3226d> hashSet = this.f10314a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C3226d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo11262c().mo11268i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo11268i() {
        return this.f10317d != null;
    }

    /* renamed from: j */
    public boolean mo11269j(C3226d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C3228b g = dVar.mo11266g();
        C3228b bVar = this.f10316c;
        if (g == bVar) {
            return bVar != C3228b.BASELINE || (dVar.mo11263d().mo11296Q() && mo11263d().mo11296Q());
        }
        switch (C3227a.f10321a[bVar.ordinal()]) {
            case 1:
                return (g == C3228b.BASELINE || g == C3228b.CENTER_X || g == C3228b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = g == C3228b.LEFT || g == C3228b.RIGHT;
                if (!(dVar.mo11263d() instanceof C3233g)) {
                    return z2;
                }
                if (z2 || g == C3228b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = g == C3228b.TOP || g == C3228b.BOTTOM;
                if (!(dVar.mo11263d() instanceof C3233g)) {
                    return z3;
                }
                if (z3 || g == C3228b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f10316c.name());
        }
    }

    /* renamed from: k */
    public void mo11270k() {
        HashSet<C3226d> hashSet;
        C3226d dVar = this.f10317d;
        if (!(dVar == null || (hashSet = dVar.f10314a) == null)) {
            hashSet.remove(this);
        }
        this.f10317d = null;
        this.f10318e = 0;
        this.f10319f = -1;
    }

    /* renamed from: l */
    public void mo11271l(C3210c cVar) {
        C3220i iVar = this.f10320g;
        if (iVar == null) {
            this.f10320g = new C3220i(C3220i.C3221a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo11242d();
        }
    }

    public String toString() {
        return this.f10315b.mo11328p() + ":" + this.f10316c.toString();
    }
}
