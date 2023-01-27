package com.google.android.gms.common.internal.p037t;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.internal.t.b */
public class C1664b {

    /* renamed from: com.google.android.gms.common.internal.t.b$a */
    public static class C1665a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1665a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                int r1 = r1 + 41
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.p037t.C1664b.C1665a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static Bundle m7864a(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s);
        return readBundle;
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m7865b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s);
        return t;
    }

    /* renamed from: c */
    public static String m7866c(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s);
        return readString;
    }

    /* renamed from: d */
    public static ArrayList<String> m7867d(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s);
        return createStringArrayList;
    }

    /* renamed from: e */
    public static <T> T[] m7868e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s);
        return createTypedArray;
    }

    /* renamed from: f */
    public static <T> ArrayList<T> m7869f(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s);
        return createTypedArrayList;
    }

    /* renamed from: g */
    public static void m7870g(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new C1665a(sb.toString(), parcel);
        }
    }

    /* renamed from: h */
    public static int m7871h(int i) {
        return i & 65535;
    }

    /* renamed from: i */
    public static boolean m7872i(Parcel parcel, int i) {
        m7885v(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: j */
    public static Boolean m7873j(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        if (s == 0) {
            return null;
        }
        m7886w(parcel, i, s, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: k */
    public static Double m7874k(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        if (s == 0) {
            return null;
        }
        m7886w(parcel, i, s, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: l */
    public static float m7875l(Parcel parcel, int i) {
        m7885v(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: m */
    public static Float m7876m(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        if (s == 0) {
            return null;
        }
        m7886w(parcel, i, s, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: n */
    public static int m7877n(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: o */
    public static IBinder m7878o(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (s == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s);
        return readStrongBinder;
    }

    /* renamed from: p */
    public static int m7879p(Parcel parcel, int i) {
        m7885v(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: q */
    public static long m7880q(Parcel parcel, int i) {
        m7885v(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: r */
    public static Long m7881r(Parcel parcel, int i) {
        int s = m7882s(parcel, i);
        if (s == 0) {
            return null;
        }
        m7886w(parcel, i, s, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: s */
    public static int m7882s(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: t */
    public static void m7883t(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m7882s(parcel, i));
    }

    /* renamed from: u */
    public static int m7884u(Parcel parcel) {
        int n = m7877n(parcel);
        int s = m7882s(parcel, n);
        int dataPosition = parcel.dataPosition();
        if (m7871h(n) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(n));
            throw new C1665a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = s + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new C1665a(sb.toString(), parcel);
    }

    /* renamed from: v */
    private static void m7885v(Parcel parcel, int i, int i2) {
        int s = m7882s(parcel, i);
        if (s != i2) {
            String hexString = Integer.toHexString(s);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(s);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1665a(sb.toString(), parcel);
        }
    }

    /* renamed from: w */
    private static void m7886w(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new C1665a(sb.toString(), parcel);
        }
    }
}
