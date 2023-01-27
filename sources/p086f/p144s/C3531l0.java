package p086f.p144s;

import android.view.View;
import android.view.WindowId;

/* renamed from: f.s.l0 */
class C3531l0 implements C3539m0 {

    /* renamed from: a */
    private final WindowId f10981a;

    C3531l0(View view) {
        this.f10981a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3531l0) && ((C3531l0) obj).f10981a.equals(this.f10981a);
    }

    public int hashCode() {
        return this.f10981a.hashCode();
    }
}
