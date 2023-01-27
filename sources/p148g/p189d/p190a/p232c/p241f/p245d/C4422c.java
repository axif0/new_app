package p148g.p189d.p190a.p232c.p241f.p245d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g.d.a.c.f.d.c */
public class C4422c {
    static {
        C4422c.class.getClassLoader();
    }

    private C4422c() {
    }

    /* renamed from: a */
    public static void m18668a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m18669b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m18670c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: d */
    public static void m18671d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static boolean m18672e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
