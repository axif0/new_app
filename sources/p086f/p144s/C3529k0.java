package p086f.p144s;

import android.os.IBinder;

/* renamed from: f.s.k0 */
class C3529k0 implements C3539m0 {

    /* renamed from: a */
    private final IBinder f10978a;

    C3529k0(IBinder iBinder) {
        this.f10978a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3529k0) && ((C3529k0) obj).f10978a.equals(this.f10978a);
    }

    public int hashCode() {
        return this.f10978a.hashCode();
    }
}
