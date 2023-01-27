package android.support.p004v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p004v4.media.session.C0235g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0219a();

    /* renamed from: f */
    final int f722f;

    /* renamed from: g */
    final long f723g;

    /* renamed from: h */
    final long f724h;

    /* renamed from: i */
    final float f725i;

    /* renamed from: j */
    final long f726j;

    /* renamed from: k */
    final int f727k;

    /* renamed from: l */
    final CharSequence f728l;

    /* renamed from: m */
    final long f729m;

    /* renamed from: n */
    List<CustomAction> f730n;

    /* renamed from: o */
    final long f731o;

    /* renamed from: p */
    final Bundle f732p;

    /* renamed from: q */
    private Object f733q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0218a();

        /* renamed from: f */
        private final String f734f;

        /* renamed from: g */
        private final CharSequence f735g;

        /* renamed from: h */
        private final int f736h;

        /* renamed from: i */
        private final Bundle f737i;

        /* renamed from: j */
        private Object f738j;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0218a implements Parcelable.Creator<CustomAction> {
            C0218a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(Parcel parcel) {
            this.f734f = parcel.readString();
            this.f735g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f736h = parcel.readInt();
            this.f737i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f734f = str;
            this.f735g = charSequence;
            this.f736h = i;
            this.f737i = bundle;
        }

        /* renamed from: a */
        public static CustomAction m807a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0235g.C0236a.m881a(obj), C0235g.C0236a.m884d(obj), C0235g.C0236a.m883c(obj), C0235g.C0236a.m882b(obj));
            customAction.f738j = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f735g + ", mIcon=" + this.f736h + ", mExtras=" + this.f737i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f734f);
            TextUtils.writeToParcel(this.f735g, parcel, i);
            parcel.writeInt(this.f736h);
            parcel.writeBundle(this.f737i);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0219a implements Parcelable.Creator<PlaybackStateCompat> {
        C0219a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f722f = i;
        this.f723g = j;
        this.f724h = j2;
        this.f725i = f;
        this.f726j = j3;
        this.f727k = i2;
        this.f728l = charSequence;
        this.f729m = j4;
        this.f730n = new ArrayList(list);
        this.f731o = j5;
        this.f732p = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f722f = parcel.readInt();
        this.f723g = parcel.readLong();
        this.f725i = parcel.readFloat();
        this.f729m = parcel.readLong();
        this.f724h = parcel.readLong();
        this.f726j = parcel.readLong();
        this.f728l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f730n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f731o = parcel.readLong();
        this.f732p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f727k = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m806a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0235g.m875d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object a : d) {
                arrayList2.add(CustomAction.m807a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0237h.m885a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0235g.m880i(obj), C0235g.m879h(obj), C0235g.m874c(obj), C0235g.m878g(obj), C0235g.m872a(obj), 0, C0235g.m876e(obj), C0235g.m877f(obj), arrayList, C0235g.m873b(obj), bundle);
        playbackStateCompat.f733q = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f722f + ", position=" + this.f723g + ", buffered position=" + this.f724h + ", speed=" + this.f725i + ", updated=" + this.f729m + ", actions=" + this.f726j + ", error code=" + this.f727k + ", error message=" + this.f728l + ", custom actions=" + this.f730n + ", active item id=" + this.f731o + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f722f);
        parcel.writeLong(this.f723g);
        parcel.writeFloat(this.f725i);
        parcel.writeLong(this.f729m);
        parcel.writeLong(this.f724h);
        parcel.writeLong(this.f726j);
        TextUtils.writeToParcel(this.f728l, parcel, i);
        parcel.writeTypedList(this.f730n);
        parcel.writeLong(this.f731o);
        parcel.writeBundle(this.f732p);
        parcel.writeInt(this.f727k);
    }
}
