package android.support.p004v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0217a();

    /* renamed from: f */
    public int f717f;

    /* renamed from: g */
    public int f718g;

    /* renamed from: h */
    public int f719h;

    /* renamed from: i */
    public int f720i;

    /* renamed from: j */
    public int f721j;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0217a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0217a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f717f = parcel.readInt();
        this.f719h = parcel.readInt();
        this.f720i = parcel.readInt();
        this.f721j = parcel.readInt();
        this.f718g = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f717f);
        parcel.writeInt(this.f719h);
        parcel.writeInt(this.f720i);
        parcel.writeInt(this.f721j);
        parcel.writeInt(this.f718g);
    }
}
