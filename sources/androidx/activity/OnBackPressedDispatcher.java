package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0710e;
import androidx.lifecycle.C0715g;
import androidx.lifecycle.C0717i;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f761a;

    /* renamed from: b */
    final ArrayDeque<C0244b> f762b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0715g, C0243a {

        /* renamed from: a */
        private final C0710e f763a;

        /* renamed from: b */
        private final C0244b f764b;

        /* renamed from: c */
        private C0243a f765c;

        LifecycleOnBackPressedCancellable(C0710e eVar, C0244b bVar) {
            this.f763a = eVar;
            this.f764b = bVar;
            eVar.mo3667a(this);
        }

        public void cancel() {
            this.f763a.mo3669c(this);
            this.f764b.mo737e(this);
            C0243a aVar = this.f765c;
            if (aVar != null) {
                aVar.cancel();
                this.f765c = null;
            }
        }

        /* renamed from: d */
        public void mo727d(C0717i iVar, C0710e.C0711a aVar) {
            if (aVar == C0710e.C0711a.ON_START) {
                this.f765c = OnBackPressedDispatcher.this.mo730b(this.f764b);
            } else if (aVar == C0710e.C0711a.ON_STOP) {
                C0243a aVar2 = this.f765c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0710e.C0711a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0242a implements C0243a {

        /* renamed from: a */
        private final C0244b f767a;

        C0242a(C0244b bVar) {
            this.f767a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f762b.remove(this.f767a);
            this.f767a.mo737e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f761a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo729a(C0717i iVar, C0244b bVar) {
        C0710e a = iVar.mo720a();
        if (a.mo3668b() != C0710e.C0712b.DESTROYED) {
            bVar.mo733a(new LifecycleOnBackPressedCancellable(a, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0243a mo730b(C0244b bVar) {
        this.f762b.add(bVar);
        C0242a aVar = new C0242a(bVar);
        bVar.mo733a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo731c() {
        Iterator<C0244b> descendingIterator = this.f762b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0244b next = descendingIterator.next();
            if (next.mo735c()) {
                next.mo734b();
                return;
            }
        }
        Runnable runnable = this.f761a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
