package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
final class C2320a2 {

    /* renamed from: b */
    private static final C5100f f7714b = new C5100f("MergeSliceTaskHandler");

    /* renamed from: a */
    private final C2328c0 f7715a;

    C2320a2(C2328c0 c0Var) {
        this.f7715a = c0Var;
    }

    /* renamed from: b */
    private static void m10798b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m10798b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C2411u0(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C2411u0(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C2411u0(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo9099a(C2432z1 z1Var) {
        File k = this.f7715a.mo9121k(z1Var.f7879b, z1Var.f8062c, z1Var.f8063d, z1Var.f8064e);
        if (k.exists()) {
            File m = this.f7715a.mo9123m(z1Var.f7879b, z1Var.f8062c, z1Var.f8063d);
            if (!m.exists()) {
                m.mkdirs();
            }
            m10798b(k, m);
            try {
                this.f7715a.mo9117f(z1Var.f7879b, z1Var.f8062c, z1Var.f8063d, this.f7715a.mo9127r(z1Var.f7879b, z1Var.f8062c, z1Var.f8063d) + 1);
            } catch (IOException e) {
                f7714b.mo15205e("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C2411u0("Writing merge checkpoint failed.", e, z1Var.f7878a);
            }
        } else {
            throw new C2411u0(String.format("Cannot find verified files for slice %s.", new Object[]{z1Var.f8064e}), z1Var.f7878a);
        }
    }
}
