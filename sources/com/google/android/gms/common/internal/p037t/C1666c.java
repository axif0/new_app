package com.google.android.gms.common.internal.p037t;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.t.c */
public class C1666c {
    /* renamed from: a */
    public static int m7887a(Parcel parcel) {
        return m7904r(parcel, 20293);
    }

    /* renamed from: b */
    public static void m7888b(Parcel parcel, int i) {
        m7906t(parcel, i);
    }

    /* renamed from: c */
    public static void m7889c(Parcel parcel, int i, boolean z) {
        m7907u(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m7890d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m7907u(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m7891e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int r = m7904r(parcel, i);
            parcel.writeBundle(bundle);
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m7892f(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m7907u(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m7893g(Parcel parcel, int i, float f) {
        m7907u(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: h */
    public static void m7894h(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m7907u(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m7895i(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int r = m7904r(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m7896j(Parcel parcel, int i, int i2) {
        m7907u(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: k */
    public static void m7897k(Parcel parcel, int i, long j) {
        m7907u(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: l */
    public static void m7898l(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m7907u(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m7899m(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int r = m7904r(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m7900n(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int r = m7904r(parcel, i);
            parcel.writeString(str);
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m7901o(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int r = m7904r(parcel, i);
            parcel.writeStringList(list);
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static <T extends Parcelable> void m7902p(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int r = m7904r(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m7905s(parcel, t, i2);
                }
            }
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static <T extends Parcelable> void m7903q(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int r = m7904r(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m7905s(parcel, parcelable, 0);
                }
            }
            m7906t(parcel, r);
        } else if (z) {
            m7907u(parcel, i, 0);
        }
    }

    /* renamed from: r */
    private static int m7904r(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: s */
    private static <T extends Parcelable> void m7905s(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: t */
    private static void m7906t(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: u */
    private static void m7907u(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }
}
