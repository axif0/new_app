package p374m.p375g0;

/* renamed from: m.g0.b */
public abstract class C6129b implements Runnable {

    /* renamed from: f */
    protected final String f17196f;

    public C6129b(String str, Object... objArr) {
        this.f17196f = C6130c.m25055r(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo17350k();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f17196f);
        try {
            mo17350k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
