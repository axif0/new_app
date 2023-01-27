package p337i.p338a.p339a;

import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p148g.p325e.p326a.C5544a;
import p337i.p338a.p339a.C5608b;

/* renamed from: i.a.a.d */
final class C5612d extends C5608b {

    /* renamed from: a */
    WeakReference<C5544a> f16184a;

    /* renamed from: i.a.a.d$a */
    class C5613a implements C5544a.C5545a {

        /* renamed from: a */
        final /* synthetic */ C5608b.C5609a f16185a;

        C5613a(C5612d dVar, C5608b.C5609a aVar) {
            this.f16185a = aVar;
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            this.f16185a.mo561a();
        }

        /* renamed from: b */
        public void mo566b(C5544a aVar) {
            this.f16185a.mo563c();
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
            this.f16185a.mo564d();
        }
    }

    C5612d(C5544a aVar, C5602a aVar2) {
        super(aVar2);
        this.f16184a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public void mo16135a(C5608b.C5609a aVar) {
        C5544a aVar2 = (C5544a) this.f16184a.get();
        if (aVar2 != null) {
            if (aVar == null) {
                aVar2.mo15959b((C5544a.C5545a) null);
            } else {
                aVar2.mo15959b(new C5613a(this, aVar));
            }
        }
    }

    /* renamed from: b */
    public void mo16136b(int i) {
        C5544a aVar = (C5544a) this.f16184a.get();
        if (aVar != null) {
            aVar.mo15964f((long) i);
        }
    }

    /* renamed from: c */
    public void mo16137c(Interpolator interpolator) {
        C5544a aVar = (C5544a) this.f16184a.get();
        if (aVar != null) {
            aVar.mo15965g(interpolator);
        }
    }

    /* renamed from: d */
    public void mo16138d() {
        C5544a aVar = (C5544a) this.f16184a.get();
        if (aVar != null) {
            aVar.mo15966i();
        }
    }
}
