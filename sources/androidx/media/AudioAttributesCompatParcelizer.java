package androidx.media;

import androidx.versionedparcelable.C0936a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C0936a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2994a = (C0743a) aVar.mo4921v(audioAttributesCompat.f2994a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C0936a aVar) {
        aVar.mo4923x(false, false);
        aVar.mo4902M(audioAttributesCompat.f2994a, 1);
    }
}
