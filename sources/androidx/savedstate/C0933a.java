package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0710e;

/* renamed from: androidx.savedstate.a */
public final class C0933a {

    /* renamed from: a */
    private final C0934b f3706a;

    /* renamed from: b */
    private final SavedStateRegistry f3707b = new SavedStateRegistry();

    private C0933a(C0934b bVar) {
        this.f3706a = bVar;
    }

    /* renamed from: a */
    public static C0933a m5229a(C0934b bVar) {
        return new C0933a(bVar);
    }

    /* renamed from: b */
    public SavedStateRegistry mo4881b() {
        return this.f3707b;
    }

    /* renamed from: c */
    public void mo4882c(Bundle bundle) {
        C0710e a = this.f3706a.mo720a();
        if (a.mo3668b() == C0710e.C0712b.INITIALIZED) {
            a.mo3667a(new Recreator(this.f3706a));
            this.f3707b.mo4877b(a, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo4883d(Bundle bundle) {
        this.f3707b.mo4878c(bundle);
    }
}
