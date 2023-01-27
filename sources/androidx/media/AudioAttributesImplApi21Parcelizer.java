package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C0936a;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0744b read(C0936a aVar) {
        C0744b bVar = new C0744b();
        bVar.f2995a = (AudioAttributes) aVar.mo4917r(bVar.f2995a, 1);
        bVar.f2996b = aVar.mo4915p(bVar.f2996b, 2);
        return bVar;
    }

    public static void write(C0744b bVar, C0936a aVar) {
        aVar.mo4923x(false, false);
        aVar.mo4897H(bVar.f2995a, 1);
        aVar.mo4895F(bVar.f2996b, 2);
    }
}
