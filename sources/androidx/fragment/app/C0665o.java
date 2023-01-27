package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.o */
final class C0665o implements Parcelable {
    public static final Parcelable.Creator<C0665o> CREATOR = new C0666a();

    /* renamed from: f */
    ArrayList<C0670r> f2784f;

    /* renamed from: g */
    ArrayList<String> f2785g;

    /* renamed from: h */
    C0630b[] f2786h;

    /* renamed from: i */
    int f2787i;

    /* renamed from: j */
    String f2788j = null;

    /* renamed from: androidx.fragment.app.o$a */
    static class C0666a implements Parcelable.Creator<C0665o> {
        C0666a() {
        }

        /* renamed from: a */
        public C0665o createFromParcel(Parcel parcel) {
            return new C0665o(parcel);
        }

        /* renamed from: b */
        public C0665o[] newArray(int i) {
            return new C0665o[i];
        }
    }

    public C0665o() {
    }

    public C0665o(Parcel parcel) {
        this.f2784f = parcel.createTypedArrayList(C0670r.CREATOR);
        this.f2785g = parcel.createStringArrayList();
        this.f2786h = (C0630b[]) parcel.createTypedArray(C0630b.CREATOR);
        this.f2787i = parcel.readInt();
        this.f2788j = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2784f);
        parcel.writeStringList(this.f2785g);
        parcel.writeTypedArray(this.f2786h, i);
        parcel.writeInt(this.f2787i);
        parcel.writeString(this.f2788j);
    }
}
