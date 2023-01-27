package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.q2 */
final class C2397q2 {

    /* renamed from: b */
    private static final C5100f f7923b = new C5100f("VerifySliceTaskHandler");

    /* renamed from: a */
    private final C2328c0 f7924a;

    C2397q2(C2328c0 c0Var) {
        this.f7924a = c0Var;
    }

    /* renamed from: b */
    private final void m10994b(C2393p2 p2Var, File file) {
        try {
            File y = this.f7924a.mo9134y(p2Var.f7879b, p2Var.f7887c, p2Var.f7888d, p2Var.f7889e);
            if (y.exists()) {
                try {
                    if (C2420w1.m11061b(C2389o2.m10983a(file, y)).equals(p2Var.f7890f)) {
                        f7923b.mo15206f("Verification of slice %s of pack %s successful.", p2Var.f7889e, p2Var.f7879b);
                        return;
                    }
                    throw new C2411u0(String.format("Verification failed for slice %s.", new Object[]{p2Var.f7889e}), p2Var.f7878a);
                } catch (NoSuchAlgorithmException e) {
                    throw new C2411u0("SHA256 algorithm not supported.", e, p2Var.f7878a);
                } catch (IOException e2) {
                    throw new C2411u0(String.format("Could not digest file during verification for slice %s.", new Object[]{p2Var.f7889e}), e2, p2Var.f7878a);
                }
            } else {
                throw new C2411u0(String.format("Cannot find metadata files for slice %s.", new Object[]{p2Var.f7889e}), p2Var.f7878a);
            }
        } catch (IOException e3) {
            throw new C2411u0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{p2Var.f7889e}), e3, p2Var.f7878a);
        }
    }

    /* renamed from: a */
    public final void mo9228a(C2393p2 p2Var) {
        File c = this.f7924a.mo9115c(p2Var.f7879b, p2Var.f7887c, p2Var.f7888d, p2Var.f7889e);
        if (c.exists()) {
            m10994b(p2Var, c);
            File k = this.f7924a.mo9121k(p2Var.f7879b, p2Var.f7887c, p2Var.f7888d, p2Var.f7889e);
            if (!k.exists()) {
                k.mkdirs();
            }
            if (!c.renameTo(k)) {
                throw new C2411u0(String.format("Failed to move slice %s after verification.", new Object[]{p2Var.f7889e}), p2Var.f7878a);
            }
            return;
        }
        throw new C2411u0(String.format("Cannot find unverified files for slice %s.", new Object[]{p2Var.f7889e}), p2Var.f7878a);
    }
}
