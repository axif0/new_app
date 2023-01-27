package p086f.p111h.p122m;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: f.h.m.r */
public final class C3401r {

    /* renamed from: a */
    private Object f10705a;

    private C3401r(Object obj) {
        this.f10705a = obj;
    }

    /* renamed from: b */
    public static C3401r m14597b(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new C3401r(PointerIcon.getSystemIcon(context, i)) : new C3401r((Object) null);
    }

    /* renamed from: a */
    public Object mo11707a() {
        return this.f10705a;
    }
}
