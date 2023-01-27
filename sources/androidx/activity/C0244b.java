package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C0244b {

    /* renamed from: a */
    private boolean f769a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0243a> f770b = new CopyOnWriteArrayList<>();

    public C0244b(boolean z) {
        this.f769a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo733a(C0243a aVar) {
        this.f770b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo734b();

    /* renamed from: c */
    public final boolean mo735c() {
        return this.f769a;
    }

    /* renamed from: d */
    public final void mo736d() {
        Iterator<C0243a> it = this.f770b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo737e(C0243a aVar) {
        this.f770b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo738f(boolean z) {
        this.f769a = z;
    }
}
