package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g.d.a.e.a.c.l0 */
public final class C5113l0 {
    static {
        C5113l0.class.getClassLoader();
    }

    private C5113l0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m21500a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m21501b(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p271e.p272a.p276c.C5113l0.m21501b(android.os.Parcel, android.os.IInterface):void");
    }

    /* renamed from: c */
    public static void m21502c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
