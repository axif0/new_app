package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C2437d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import p148g.p189d.p190a.p271e.p272a.p276c.C5097d0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5126s;

/* renamed from: com.google.android.play.core.assetpacks.j2 */
final class C2365j2 {

    /* renamed from: d */
    private static final C5100f f7821d = new C5100f("PatchSliceTaskHandler");

    /* renamed from: a */
    private final C2328c0 f7822a;

    /* renamed from: b */
    private final C5099e0<C2371k3> f7823b;

    /* renamed from: c */
    private final C2437d f7824c;

    C2365j2(C2328c0 c0Var, C5099e0<C2371k3> e0Var, C2437d dVar) {
        this.f7822a = c0Var;
        this.f7823b = e0Var;
        this.f7824c = dVar;
    }

    /* renamed from: a */
    public final void mo9160a(C2360i2 i2Var) {
        InputStream inputStream;
        Throwable th;
        C2360i2 i2Var2 = i2Var;
        File b = this.f7822a.mo9114b(i2Var2.f7879b, i2Var2.f7805c, i2Var2.f7806d);
        C2328c0 c0Var = this.f7822a;
        String str = i2Var2.f7879b;
        int i = i2Var2.f7805c;
        long j = i2Var2.f7806d;
        File file = new File(c0Var.mo9120j(str, i, j), i2Var2.f7810h);
        try {
            inputStream = i2Var2.f7812j;
            if (i2Var2.f7809g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C2343f0 f0Var = new C2343f0(b, file);
            if (this.f7824c.mo9279b()) {
                File c = this.f7822a.mo9115c(i2Var2.f7879b, i2Var2.f7807e, i2Var2.f7808f, i2Var2.f7810h);
                if (!c.exists()) {
                    c.mkdirs();
                }
                C2380m2 m2Var = new C2380m2(this.f7822a, i2Var2.f7879b, i2Var2.f7807e, i2Var2.f7808f, i2Var2.f7810h);
                C5126s.m21542b(f0Var, inputStream, new C2423x0(c, m2Var), i2Var2.f7811i);
                m2Var.mo9220j(0);
            } else {
                File file2 = new File(this.f7822a.mo9134y(i2Var2.f7879b, i2Var2.f7807e, i2Var2.f7808f, i2Var2.f7810h), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                C5126s.m21542b(f0Var, inputStream, new FileOutputStream(file2), i2Var2.f7811i);
                if (!file2.renameTo(this.f7822a.mo9132w(i2Var2.f7879b, i2Var2.f7807e, i2Var2.f7808f, i2Var2.f7810h))) {
                    throw new C2411u0(String.format("Error moving patch for slice %s of pack %s.", new Object[]{i2Var2.f7810h, i2Var2.f7879b}), i2Var2.f7878a);
                }
            }
            inputStream.close();
            if (this.f7824c.mo9279b()) {
                f7821d.mo15206f("Patching and extraction finished for slice %s of pack %s.", i2Var2.f7810h, i2Var2.f7879b);
            } else {
                f7821d.mo15206f("Patching finished for slice %s of pack %s.", i2Var2.f7810h, i2Var2.f7879b);
            }
            this.f7823b.mo15202d().mo9167x(i2Var2.f7878a, i2Var2.f7879b, i2Var2.f7810h, 0);
            try {
                i2Var2.f7812j.close();
                return;
            } catch (IOException unused) {
                f7821d.mo15207g("Could not close file for slice %s of pack %s.", i2Var2.f7810h, i2Var2.f7879b);
                return;
            }
        } catch (IOException e) {
            f7821d.mo15205e("IOException during patching %s.", e.getMessage());
            throw new C2411u0(String.format("Error patching slice %s of pack %s.", new Object[]{i2Var2.f7810h, i2Var2.f7879b}), e, i2Var2.f7878a);
        } catch (Throwable th2) {
            C5097d0.m21473a(th, th2);
        }
        throw th;
    }
}
