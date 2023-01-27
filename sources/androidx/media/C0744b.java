package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: androidx.media.b */
class C0744b implements C0743a {

    /* renamed from: a */
    AudioAttributes f2995a;

    /* renamed from: b */
    int f2996b = -1;

    C0744b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0744b)) {
            return false;
        }
        return this.f2995a.equals(((C0744b) obj).f2995a);
    }

    public int hashCode() {
        return this.f2995a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2995a;
    }
}
