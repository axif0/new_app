package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: g.d.a.c.f.f.u */
public class C4800u {

    /* renamed from: a */
    private static final ClassLoader f14555a = C4800u.class.getClassLoader();

    private C4800u() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m20437a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m20438b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m20439c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m20440d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static boolean m20441e(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: f */
    public static HashMap m20442f(Parcel parcel) {
        return parcel.readHashMap(f14555a);
    }
}
