package android.support.p004v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0204a();

    /* renamed from: f */
    private final int f704f;

    /* renamed from: g */
    private final float f705g;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0204a implements Parcelable.Creator<RatingCompat> {
        C0204a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f704f = i;
        this.f705g = f;
    }

    public int describeContents() {
        return this.f704f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f704f);
        sb.append(" rating=");
        float f = this.f705g;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f704f);
        parcel.writeFloat(this.f705g);
    }
}
