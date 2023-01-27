package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.v */
public class C0741v {

    /* renamed from: a */
    private final HashMap<String, C0736t> f2992a = new HashMap<>();

    /* renamed from: a */
    public final void mo3718a() {
        for (C0736t a : this.f2992a.values()) {
            a.mo3712a();
        }
        this.f2992a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0736t mo3719b(String str) {
        return this.f2992a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> mo3720c() {
        return new HashSet(this.f2992a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3721d(String str, C0736t tVar) {
        C0736t put = this.f2992a.put(str, tVar);
        if (put != null) {
            put.mo3495d();
        }
    }
}
