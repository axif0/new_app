package android.support.p004v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0214a();

        /* renamed from: f */
        private final MediaDescriptionCompat f711f;

        /* renamed from: g */
        private final long f712g;

        /* renamed from: h */
        private Object f713h;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        static class C0214a implements Parcelable.Creator<QueueItem> {
            C0214a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        QueueItem(Parcel parcel) {
            this.f711f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f712g = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f711f = mediaDescriptionCompat;
                this.f712g = j;
                this.f713h = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: a */
        public static QueueItem m793a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m739a(C0234f.m870a(obj)), C0234f.m871b(obj));
        }

        /* renamed from: b */
        public static List<QueueItem> m794b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m793a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f711f + ", Id=" + this.f712g + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f711f.writeToParcel(parcel, i);
            parcel.writeLong(this.f712g);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0215a();

        /* renamed from: f */
        ResultReceiver f714f;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        static class C0215a implements Parcelable.Creator<ResultReceiverWrapper> {
            C0215a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f714f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f714f.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0216a();

        /* renamed from: f */
        private final Object f715f;

        /* renamed from: g */
        private C0222b f716g;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        static class C0216a implements Parcelable.Creator<Token> {
            C0216a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, (C0222b) null, (Bundle) null);
        }

        Token(Object obj, C0222b bVar, Bundle bundle) {
            this.f715f = obj;
            this.f716g = bVar;
        }

        /* renamed from: a */
        public C0222b mo652a() {
            return this.f716g;
        }

        /* renamed from: b */
        public void mo653b(C0222b bVar) {
            this.f716g = bVar;
        }

        /* renamed from: c */
        public void mo654c(Bundle bundle) {
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f715f;
            Object obj3 = ((Token) obj).f715f;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f715f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f715f, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f715f);
            }
        }
    }

    /* renamed from: a */
    public static void m792a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
