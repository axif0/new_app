package p148g.p189d.p190a.p232c.p241f.p243b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g.d.a.c.f.b.c */
public class C4412c {
    static {
        C4412c.class.getClassLoader();
    }

    private C4412c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m18657a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m18658b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m18659c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
