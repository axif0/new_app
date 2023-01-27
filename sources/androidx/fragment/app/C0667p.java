package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0736t;
import androidx.lifecycle.C0737u;
import androidx.lifecycle.C0741v;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.p */
final class C0667p extends C0736t {

    /* renamed from: h */
    private static final C0737u.C0738a f2789h = new C0668a();

    /* renamed from: b */
    private final HashMap<String, Fragment> f2790b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C0667p> f2791c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0741v> f2792d = new HashMap<>();

    /* renamed from: e */
    private final boolean f2793e;

    /* renamed from: f */
    private boolean f2794f = false;

    /* renamed from: g */
    private boolean f2795g = false;

    /* renamed from: androidx.fragment.app.p$a */
    static class C0668a implements C0737u.C0738a {
        C0668a() {
        }

        /* renamed from: a */
        public <T extends C0736t> T mo3508a(Class<T> cls) {
            return new C0667p(true);
        }
    }

    C0667p(boolean z) {
        this.f2793e = z;
    }

    /* renamed from: i */
    static C0667p m3390i(C0741v vVar) {
        return (C0667p) new C0737u(vVar, f2789h).mo3714a(C0667p.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3495d() {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2794f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo3496e(Fragment fragment) {
        if (this.f2790b.containsKey(fragment.f2623j)) {
            return false;
        }
        this.f2790b.put(fragment.f2623j, fragment);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0667p.class != obj.getClass()) {
            return false;
        }
        C0667p pVar = (C0667p) obj;
        return this.f2790b.equals(pVar.f2790b) && this.f2791c.equals(pVar.f2791c) && this.f2792d.equals(pVar.f2792d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3498f(Fragment fragment) {
        if (C0653m.m3287p0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0667p pVar = this.f2791c.get(fragment.f2623j);
        if (pVar != null) {
            pVar.mo3495d();
            this.f2791c.remove(fragment.f2623j);
        }
        C0741v vVar = this.f2792d.get(fragment.f2623j);
        if (vVar != null) {
            vVar.mo3718a();
            this.f2792d.remove(fragment.f2623j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment mo3499g(String str) {
        return this.f2790b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C0667p mo3500h(Fragment fragment) {
        C0667p pVar = this.f2791c.get(fragment.f2623j);
        if (pVar != null) {
            return pVar;
        }
        C0667p pVar2 = new C0667p(this.f2793e);
        this.f2791c.put(fragment.f2623j, pVar2);
        return pVar2;
    }

    public int hashCode() {
        return (((this.f2790b.hashCode() * 31) + this.f2791c.hashCode()) * 31) + this.f2792d.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection<Fragment> mo3502j() {
        return this.f2790b.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0741v mo3503k(Fragment fragment) {
        C0741v vVar = this.f2792d.get(fragment.f2623j);
        if (vVar != null) {
            return vVar;
        }
        C0741v vVar2 = new C0741v();
        this.f2792d.put(fragment.f2623j, vVar2);
        return vVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo3504l() {
        return this.f2794f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo3505m(Fragment fragment) {
        return this.f2790b.remove(fragment.f2623j) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo3506n(Fragment fragment) {
        if (!this.f2790b.containsKey(fragment.f2623j)) {
            return true;
        }
        return this.f2793e ? this.f2794f : !this.f2795g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2790b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2791c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2792d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
