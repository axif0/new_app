package androidx.media;

import androidx.versionedparcelable.C0936a;

public final class AudioAttributesImplBaseParcelizer {
    public static C0745c read(C0936a aVar) {
        C0745c cVar = new C0745c();
        cVar.f2997a = aVar.mo4915p(cVar.f2997a, 1);
        cVar.f2998b = aVar.mo4915p(cVar.f2998b, 2);
        cVar.f2999c = aVar.mo4915p(cVar.f2999c, 3);
        cVar.f3000d = aVar.mo4915p(cVar.f3000d, 4);
        return cVar;
    }

    public static void write(C0745c cVar, C0936a aVar) {
        aVar.mo4923x(false, false);
        aVar.mo4895F(cVar.f2997a, 1);
        aVar.mo4895F(cVar.f2998b, 2);
        aVar.mo4895F(cVar.f2999c, 3);
        aVar.mo4895F(cVar.f3000d, 4);
    }
}
