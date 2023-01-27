package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0935a();

    /* renamed from: f */
    private final C0938c f3708f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0935a implements Parcelable.Creator<ParcelImpl> {
        C0935a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3708f = new C0937b(parcel).mo4920u();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0937b(parcel).mo4901L(this.f3708f);
    }
}
