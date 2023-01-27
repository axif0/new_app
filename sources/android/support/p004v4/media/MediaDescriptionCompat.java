package android.support.p004v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p004v4.media.C0208d;
import android.support.p004v4.media.C0210e;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0201a();

    /* renamed from: f */
    private final String f684f;

    /* renamed from: g */
    private final CharSequence f685g;

    /* renamed from: h */
    private final CharSequence f686h;

    /* renamed from: i */
    private final CharSequence f687i;

    /* renamed from: j */
    private final Bitmap f688j;

    /* renamed from: k */
    private final Uri f689k;

    /* renamed from: l */
    private final Bundle f690l;

    /* renamed from: m */
    private final Uri f691m;

    /* renamed from: n */
    private Object f692n;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0201a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0201a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m739a(C0208d.m764a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0202b {

        /* renamed from: a */
        private String f693a;

        /* renamed from: b */
        private CharSequence f694b;

        /* renamed from: c */
        private CharSequence f695c;

        /* renamed from: d */
        private CharSequence f696d;

        /* renamed from: e */
        private Bitmap f697e;

        /* renamed from: f */
        private Uri f698f;

        /* renamed from: g */
        private Bundle f699g;

        /* renamed from: h */
        private Uri f700h;

        /* renamed from: a */
        public MediaDescriptionCompat mo602a() {
            return new MediaDescriptionCompat(this.f693a, this.f694b, this.f695c, this.f696d, this.f697e, this.f698f, this.f699g, this.f700h);
        }

        /* renamed from: b */
        public C0202b mo603b(CharSequence charSequence) {
            this.f696d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0202b mo604c(Bundle bundle) {
            this.f699g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0202b mo605d(Bitmap bitmap) {
            this.f697e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0202b mo606e(Uri uri) {
            this.f698f = uri;
            return this;
        }

        /* renamed from: f */
        public C0202b mo607f(String str) {
            this.f693a = str;
            return this;
        }

        /* renamed from: g */
        public C0202b mo608g(Uri uri) {
            this.f700h = uri;
            return this;
        }

        /* renamed from: h */
        public C0202b mo609h(CharSequence charSequence) {
            this.f695c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0202b mo610i(CharSequence charSequence) {
            this.f694b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f684f = parcel.readString();
        this.f685g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f686h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f687i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f688j = (Bitmap) parcel.readParcelable(classLoader);
        this.f689k = (Uri) parcel.readParcelable(classLoader);
        this.f690l = parcel.readBundle(classLoader);
        this.f691m = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f684f = str;
        this.f685g = charSequence;
        this.f686h = charSequence2;
        this.f687i = charSequence3;
        this.f688j = bitmap;
        this.f689k = uri;
        this.f690l = bundle;
        this.f691m = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p004v4.media.MediaDescriptionCompat m739a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0080
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0080
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.p004v4.media.C0208d.m769f(r8)
            r1.mo607f(r2)
            java.lang.CharSequence r2 = android.support.p004v4.media.C0208d.m771h(r8)
            r1.mo610i(r2)
            java.lang.CharSequence r2 = android.support.p004v4.media.C0208d.m770g(r8)
            r1.mo609h(r2)
            java.lang.CharSequence r2 = android.support.p004v4.media.C0208d.m765b(r8)
            r1.mo603b(r2)
            android.graphics.Bitmap r2 = android.support.p004v4.media.C0208d.m767d(r8)
            r1.mo605d(r2)
            android.net.Uri r2 = android.support.p004v4.media.C0208d.m768e(r8)
            r1.mo606e(r2)
            android.os.Bundle r2 = android.support.p004v4.media.C0208d.m766c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x004a
            android.support.p004v4.media.session.MediaSessionCompat.m792a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004b
        L_0x004a:
            r4 = r0
        L_0x004b:
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005d
            goto L_0x0064
        L_0x005d:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0063:
            r0 = r2
        L_0x0064:
            r1.mo604c(r0)
            if (r4 == 0) goto L_0x006d
            r1.mo608g(r4)
            goto L_0x007a
        L_0x006d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x007a
            android.net.Uri r0 = android.support.p004v4.media.C0210e.m782a(r8)
            r1.mo608g(r0)
        L_0x007a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo602a()
            r0.f692n = r8
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004v4.media.MediaDescriptionCompat.m739a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo594b() {
        if (this.f692n != null || Build.VERSION.SDK_INT < 21) {
            return this.f692n;
        }
        Object b = C0208d.C0209a.m774b();
        C0208d.C0209a.m779g(b, this.f684f);
        C0208d.C0209a.m781i(b, this.f685g);
        C0208d.C0209a.m780h(b, this.f686h);
        C0208d.C0209a.m775c(b, this.f687i);
        C0208d.C0209a.m777e(b, this.f688j);
        C0208d.C0209a.m778f(b, this.f689k);
        Bundle bundle = this.f690l;
        if (Build.VERSION.SDK_INT < 23 && this.f691m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f691m);
        }
        C0208d.C0209a.m776d(b, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0210e.C0211a.m783a(b, this.f691m);
        }
        Object a = C0208d.C0209a.m773a(b);
        this.f692n = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f685g + ", " + this.f686h + ", " + this.f687i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f684f);
            TextUtils.writeToParcel(this.f685g, parcel, i);
            TextUtils.writeToParcel(this.f686h, parcel, i);
            TextUtils.writeToParcel(this.f687i, parcel, i);
            parcel.writeParcelable(this.f688j, i);
            parcel.writeParcelable(this.f689k, i);
            parcel.writeBundle(this.f690l);
            parcel.writeParcelable(this.f691m, i);
            return;
        }
        C0208d.m772i(mo594b(), parcel, i);
    }
}
