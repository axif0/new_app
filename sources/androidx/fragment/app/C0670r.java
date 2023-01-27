package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.r */
final class C0670r implements Parcelable {
    public static final Parcelable.Creator<C0670r> CREATOR = new C0671a();

    /* renamed from: f */
    final String f2801f;

    /* renamed from: g */
    final String f2802g;

    /* renamed from: h */
    final boolean f2803h;

    /* renamed from: i */
    final int f2804i;

    /* renamed from: j */
    final int f2805j;

    /* renamed from: k */
    final String f2806k;

    /* renamed from: l */
    final boolean f2807l;

    /* renamed from: m */
    final boolean f2808m;

    /* renamed from: n */
    final boolean f2809n;

    /* renamed from: o */
    final Bundle f2810o;

    /* renamed from: p */
    final boolean f2811p;

    /* renamed from: q */
    final int f2812q;

    /* renamed from: r */
    Bundle f2813r;

    /* renamed from: androidx.fragment.app.r$a */
    static class C0671a implements Parcelable.Creator<C0670r> {
        C0671a() {
        }

        /* renamed from: a */
        public C0670r createFromParcel(Parcel parcel) {
            return new C0670r(parcel);
        }

        /* renamed from: b */
        public C0670r[] newArray(int i) {
            return new C0670r[i];
        }
    }

    C0670r(Parcel parcel) {
        this.f2801f = parcel.readString();
        this.f2802g = parcel.readString();
        boolean z = true;
        this.f2803h = parcel.readInt() != 0;
        this.f2804i = parcel.readInt();
        this.f2805j = parcel.readInt();
        this.f2806k = parcel.readString();
        this.f2807l = parcel.readInt() != 0;
        this.f2808m = parcel.readInt() != 0;
        this.f2809n = parcel.readInt() != 0;
        this.f2810o = parcel.readBundle();
        this.f2811p = parcel.readInt() == 0 ? false : z;
        this.f2813r = parcel.readBundle();
        this.f2812q = parcel.readInt();
    }

    C0670r(Fragment fragment) {
        this.f2801f = fragment.getClass().getName();
        this.f2802g = fragment.f2623j;
        this.f2803h = fragment.f2631r;
        this.f2804i = fragment.f2593A;
        this.f2805j = fragment.f2594B;
        this.f2806k = fragment.f2595C;
        this.f2807l = fragment.f2598F;
        this.f2808m = fragment.f2630q;
        this.f2809n = fragment.f2597E;
        this.f2810o = fragment.f2624k;
        this.f2811p = fragment.f2596D;
        this.f2812q = fragment.f2613U.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2801f);
        sb.append(" (");
        sb.append(this.f2802g);
        sb.append(")}:");
        if (this.f2803h) {
            sb.append(" fromLayout");
        }
        if (this.f2805j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2805j));
        }
        String str = this.f2806k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2806k);
        }
        if (this.f2807l) {
            sb.append(" retainInstance");
        }
        if (this.f2808m) {
            sb.append(" removing");
        }
        if (this.f2809n) {
            sb.append(" detached");
        }
        if (this.f2811p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2801f);
        parcel.writeString(this.f2802g);
        parcel.writeInt(this.f2803h ? 1 : 0);
        parcel.writeInt(this.f2804i);
        parcel.writeInt(this.f2805j);
        parcel.writeString(this.f2806k);
        parcel.writeInt(this.f2807l ? 1 : 0);
        parcel.writeInt(this.f2808m ? 1 : 0);
        parcel.writeInt(this.f2809n ? 1 : 0);
        parcel.writeBundle(this.f2810o);
        parcel.writeInt(this.f2811p ? 1 : 0);
        parcel.writeBundle(this.f2813r);
        parcel.writeInt(this.f2812q);
    }
}
