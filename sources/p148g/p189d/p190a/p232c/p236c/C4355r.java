package p148g.p189d.p190a.p232c.p236c;

import android.os.Bundle;

/* renamed from: g.d.a.c.c.r */
final class C4355r extends C4358u<Void> {
    C4355r(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13660a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo13664c(null);
        } else {
            mo13663b(new C4357t(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo13661d() {
        return true;
    }
}
