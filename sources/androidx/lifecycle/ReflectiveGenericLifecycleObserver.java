package androidx.lifecycle;

import androidx.lifecycle.C0704a;
import androidx.lifecycle.C0710e;

class ReflectiveGenericLifecycleObserver implements C0715g {

    /* renamed from: a */
    private final Object f2943a;

    /* renamed from: b */
    private final C0704a.C0705a f2944b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2943a = obj;
        this.f2944b = C0704a.f2950c.mo3647c(obj.getClass());
    }

    /* renamed from: d */
    public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
        this.f2944b.mo3649a(iVar, aVar, this.f2943a);
    }
}
