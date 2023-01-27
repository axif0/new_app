package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.e.a.c.b */
public abstract class C5092b extends C5111k0 implements C5094c {
    /* renamed from: r */
    public static C5094c m21468r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof C5094c ? (C5094c) queryLocalInterface : new C5090a(iBinder);
    }
}
