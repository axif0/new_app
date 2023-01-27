package android.support.p004v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.d */
class C0208d {

    /* renamed from: android.support.v4.media.d$a */
    static class C0209a {
        /* renamed from: a */
        public static Object m773a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: b */
        public static Object m774b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        public static void m775c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: d */
        public static void m776d(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: e */
        public static void m777e(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: f */
        public static void m778f(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: g */
        public static void m779g(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: h */
        public static void m780h(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: i */
        public static void m781i(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public static Object m764a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static CharSequence m765b(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: c */
    public static Bundle m766c(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: d */
    public static Bitmap m767d(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: e */
    public static Uri m768e(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: f */
    public static String m769f(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: g */
    public static CharSequence m770g(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: h */
    public static CharSequence m771h(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: i */
    public static void m772i(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
