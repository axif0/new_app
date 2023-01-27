package androidx.lifecycle;

import androidx.lifecycle.C0710e;
import androidx.savedstate.C0934b;
import androidx.savedstate.SavedStateRegistry;

final class SavedStateHandleController implements C0715g {

    /* renamed from: a */
    private boolean f2945a;

    /* renamed from: b */
    private final C0735s f2946b;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    final class C07021 implements C0715g {

        /* renamed from: a */
        final /* synthetic */ C0710e f2947a;

        /* renamed from: b */
        final /* synthetic */ SavedStateRegistry f2948b;

        /* renamed from: d */
        public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
            if (aVar == C0710e.C0711a.ON_START) {
                this.f2947a.mo3669c(this);
                this.f2948b.mo4880e(C0703a.class);
            }
        }
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0703a implements SavedStateRegistry.C0931a {
        C0703a() {
        }

        /* renamed from: a */
        public void mo3646a(C0934b bVar) {
            if (bVar instanceof C0742w) {
                C0741v q = ((C0742w) bVar).mo725q();
                SavedStateRegistry d = bVar.mo722d();
                for (String b : q.mo3720c()) {
                    SavedStateHandleController.m3581h(q.mo3719b(b), d, bVar.mo720a());
                }
                if (!q.mo3720c().isEmpty()) {
                    d.mo4880e(C0703a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: h */
    static void m3581h(C0736t tVar, SavedStateRegistry savedStateRegistry, C0710e eVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) tVar.mo3713c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo3645j()) {
            savedStateHandleController.mo3644i(savedStateRegistry, eVar);
            throw null;
        }
    }

    /* renamed from: d */
    public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
        if (aVar == C0710e.C0711a.ON_DESTROY) {
            this.f2945a = false;
            iVar.mo720a().mo3669c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3644i(SavedStateRegistry savedStateRegistry, C0710e eVar) {
        if (this.f2945a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2945a = true;
        eVar.mo3667a(this);
        this.f2946b.mo3711a();
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo3645j() {
        return this.f2945a;
    }
}
