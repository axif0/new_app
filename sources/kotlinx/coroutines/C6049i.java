package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.i */
public class C6049i {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f17014b = AtomicIntegerFieldUpdater.newUpdater(C6049i.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f17015a;

    public C6049i(Throwable th, boolean z) {
        C5956g.m24501f(th, "cause");
        this.f17015a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6049i(Throwable th, boolean z, int i, C5954e eVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* renamed from: a */
    public final boolean mo17132a() {
        return f17014b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C6082w.m24816a(this) + '[' + this.f17015a + ']';
    }
}
