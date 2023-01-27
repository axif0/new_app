package android.support.p004v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
class C0210e {

    /* renamed from: android.support.v4.media.e$a */
    static class C0211a {
        /* renamed from: a */
        public static void m783a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m782a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
