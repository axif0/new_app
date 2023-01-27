package android.support.p004v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0200a();

    /* renamed from: f */
    private final int f679f;

    /* renamed from: g */
    private final MediaDescriptionCompat f680g;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0200a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0200a() {
        }

        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f679f = parcel.readInt();
        this.f680g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f679f + ", mDescription=" + this.f680g + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f679f);
        this.f680g.writeToParcel(parcel, i);
    }
}
