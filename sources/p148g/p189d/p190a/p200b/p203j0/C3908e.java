package p148g.p189d.p190a.p200b.p203j0;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* renamed from: g.d.a.b.j0.e */
public final class C3908e implements C3907d {

    /* renamed from: a */
    private final MediaCrypto f11850a;

    /* renamed from: b */
    private final boolean f11851b;

    /* renamed from: a */
    public MediaCrypto mo12710a() {
        return this.f11850a;
    }

    /* renamed from: b */
    public boolean mo12711b(String str) {
        return !this.f11851b && this.f11850a.requiresSecureDecoderComponent(str);
    }
}
