package androidx.fragment.app;

import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0717i;
import androidx.lifecycle.C0718j;

/* renamed from: androidx.fragment.app.y */
class C0696y implements C0717i {

    /* renamed from: f */
    private C0718j f2909f = null;

    C0696y() {
    }

    /* renamed from: a */
    public C0710e mo720a() {
        mo3623e();
        return this.f2909f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3622b(C0710e.C0711a aVar) {
        this.f2909f.mo3671i(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3623e() {
        if (this.f2909f == null) {
            this.f2909f = new C0718j(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo3624f() {
        return this.f2909f != null;
    }
}
