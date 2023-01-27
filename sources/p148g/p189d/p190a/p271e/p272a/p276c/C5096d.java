package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: g.d.a.e.a.c.d */
public abstract class C5096d extends C5111k0 implements C5098e {
    public C5096d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo15201n(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        mo9291e((Bundle) C5113l0.m21500a(parcel, Bundle.CREATOR));
        return true;
    }
}
