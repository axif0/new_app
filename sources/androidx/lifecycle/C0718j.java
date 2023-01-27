package androidx.lifecycle;

import androidx.lifecycle.C0710e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p086f.p095b.p096a.p098b.C3172a;
import p086f.p095b.p096a.p098b.C3173b;

/* renamed from: androidx.lifecycle.j */
public class C0718j extends C0710e {

    /* renamed from: a */
    private C3172a<C0716h, C0720b> f2964a = new C3172a<>();

    /* renamed from: b */
    private C0710e.C0712b f2965b;

    /* renamed from: c */
    private final WeakReference<C0717i> f2966c;

    /* renamed from: d */
    private int f2967d = 0;

    /* renamed from: e */
    private boolean f2968e = false;

    /* renamed from: f */
    private boolean f2969f = false;

    /* renamed from: g */
    private ArrayList<C0710e.C0712b> f2970g = new ArrayList<>();

    /* renamed from: androidx.lifecycle.j$a */
    static /* synthetic */ class C0719a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2971a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2972b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.e$b[] r0 = androidx.lifecycle.C0710e.C0712b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2972b = r0
                r1 = 1
                androidx.lifecycle.e$b r2 = androidx.lifecycle.C0710e.C0712b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2972b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.e$b r3 = androidx.lifecycle.C0710e.C0712b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2972b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.e$b r4 = androidx.lifecycle.C0710e.C0712b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2972b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.e$b r5 = androidx.lifecycle.C0710e.C0712b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f2972b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.e$b r6 = androidx.lifecycle.C0710e.C0712b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.e$a[] r5 = androidx.lifecycle.C0710e.C0711a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f2971a = r5
                androidx.lifecycle.e$a r6 = androidx.lifecycle.C0710e.C0711a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f2971a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.e$a r5 = androidx.lifecycle.C0710e.C0711a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.C0710e.C0711a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.C0710e.C0711a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.C0710e.C0711a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.C0710e.C0711a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f2971a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.e$a r1 = androidx.lifecycle.C0710e.C0711a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0718j.C0719a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.j$b */
    static class C0720b {

        /* renamed from: a */
        C0710e.C0712b f2973a;

        /* renamed from: b */
        C0715g f2974b;

        C0720b(C0716h hVar, C0710e.C0712b bVar) {
            this.f2974b = C0722l.m3635f(hVar);
            this.f2973a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3674a(C0717i iVar, C0710e.C0711a aVar) {
            C0710e.C0712b h = C0718j.m3614h(aVar);
            this.f2973a = C0718j.m3616l(this.f2973a, h);
            this.f2974b.mo727d(iVar, aVar);
            this.f2973a = h;
        }
    }

    public C0718j(C0717i iVar) {
        this.f2966c = new WeakReference<>(iVar);
        this.f2965b = C0710e.C0712b.INITIALIZED;
    }

    /* renamed from: d */
    private void m3610d(C0717i iVar) {
        Iterator<Map.Entry<C0716h, C0720b>> c = this.f2964a.mo10979c();
        while (c.hasNext() && !this.f2969f) {
            Map.Entry next = c.next();
            C0720b bVar = (C0720b) next.getValue();
            while (bVar.f2973a.compareTo(this.f2965b) > 0 && !this.f2969f && this.f2964a.contains(next.getKey())) {
                C0710e.C0711a f = m3612f(bVar.f2973a);
                m3619o(m3614h(f));
                bVar.mo3674a(iVar, f);
                m3618n();
            }
        }
    }

    /* renamed from: e */
    private C0710e.C0712b m3611e(C0716h hVar) {
        Map.Entry<C0716h, C0720b> p = this.f2964a.mo10978p(hVar);
        C0710e.C0712b bVar = null;
        C0710e.C0712b bVar2 = p != null ? p.getValue().f2973a : null;
        if (!this.f2970g.isEmpty()) {
            ArrayList<C0710e.C0712b> arrayList = this.f2970g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m3616l(m3616l(this.f2965b, bVar2), bVar);
    }

    /* renamed from: f */
    private static C0710e.C0711a m3612f(C0710e.C0712b bVar) {
        int i = C0719a.f2972b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0710e.C0711a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0710e.C0711a.ON_STOP;
            }
            if (i == 4) {
                return C0710e.C0711a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: g */
    private void m3613g(C0717i iVar) {
        C3173b<K, V>.d h = this.f2964a.mo10982h();
        while (h.hasNext() && !this.f2969f) {
            Map.Entry entry = (Map.Entry) h.next();
            C0720b bVar = (C0720b) entry.getValue();
            while (bVar.f2973a.compareTo(this.f2965b) < 0 && !this.f2969f && this.f2964a.contains(entry.getKey())) {
                m3619o(bVar.f2973a);
                bVar.mo3674a(iVar, m3621r(bVar.f2973a));
                m3618n();
            }
        }
    }

    /* renamed from: h */
    static C0710e.C0712b m3614h(C0710e.C0711a aVar) {
        switch (C0719a.f2971a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0710e.C0712b.CREATED;
            case 3:
            case 4:
                return C0710e.C0712b.STARTED;
            case 5:
                return C0710e.C0712b.RESUMED;
            case 6:
                return C0710e.C0712b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: j */
    private boolean m3615j() {
        if (this.f2964a.size() == 0) {
            return true;
        }
        C0710e.C0712b bVar = this.f2964a.mo10980d().getValue().f2973a;
        C0710e.C0712b bVar2 = this.f2964a.mo10984i().getValue().f2973a;
        return bVar == bVar2 && this.f2965b == bVar2;
    }

    /* renamed from: l */
    static C0710e.C0712b m3616l(C0710e.C0712b bVar, C0710e.C0712b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: m */
    private void m3617m(C0710e.C0712b bVar) {
        if (this.f2965b != bVar) {
            this.f2965b = bVar;
            if (this.f2968e || this.f2967d != 0) {
                this.f2969f = true;
                return;
            }
            this.f2968e = true;
            m3620q();
            this.f2968e = false;
        }
    }

    /* renamed from: n */
    private void m3618n() {
        ArrayList<C0710e.C0712b> arrayList = this.f2970g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: o */
    private void m3619o(C0710e.C0712b bVar) {
        this.f2970g.add(bVar);
    }

    /* renamed from: q */
    private void m3620q() {
        C0717i iVar = (C0717i) this.f2966c.get();
        if (iVar != null) {
            while (true) {
                boolean j = m3615j();
                this.f2969f = false;
                if (!j) {
                    if (this.f2965b.compareTo(this.f2964a.mo10980d().getValue().f2973a) < 0) {
                        m3610d(iVar);
                    }
                    Map.Entry<C0716h, C0720b> i = this.f2964a.mo10984i();
                    if (!this.f2969f && i != null && this.f2965b.compareTo(i.getValue().f2973a) > 0) {
                        m3613g(iVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: r */
    private static C0710e.C0711a m3621r(C0710e.C0712b bVar) {
        int i = C0719a.f2972b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0710e.C0711a.ON_START;
            }
            if (i == 3) {
                return C0710e.C0711a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return C0710e.C0711a.ON_CREATE;
    }

    /* renamed from: a */
    public void mo3667a(C0716h hVar) {
        C0717i iVar;
        C0710e.C0712b bVar = this.f2965b;
        C0710e.C0712b bVar2 = C0710e.C0712b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0710e.C0712b.INITIALIZED;
        }
        C0720b bVar3 = new C0720b(hVar, bVar2);
        if (this.f2964a.mo10976m(hVar, bVar3) == null && (iVar = (C0717i) this.f2966c.get()) != null) {
            boolean z = this.f2967d != 0 || this.f2968e;
            C0710e.C0712b e = m3611e(hVar);
            this.f2967d++;
            while (bVar3.f2973a.compareTo(e) < 0 && this.f2964a.contains(hVar)) {
                m3619o(bVar3.f2973a);
                bVar3.mo3674a(iVar, m3621r(bVar3.f2973a));
                m3618n();
                e = m3611e(hVar);
            }
            if (!z) {
                m3620q();
            }
            this.f2967d--;
        }
    }

    /* renamed from: b */
    public C0710e.C0712b mo3668b() {
        return this.f2965b;
    }

    /* renamed from: c */
    public void mo3669c(C0716h hVar) {
        this.f2964a.mo10977o(hVar);
    }

    /* renamed from: i */
    public void mo3671i(C0710e.C0711a aVar) {
        m3617m(m3614h(aVar));
    }

    @Deprecated
    /* renamed from: k */
    public void mo3672k(C0710e.C0712b bVar) {
        mo3673p(bVar);
    }

    /* renamed from: p */
    public void mo3673p(C0710e.C0712b bVar) {
        m3617m(bVar);
    }
}
