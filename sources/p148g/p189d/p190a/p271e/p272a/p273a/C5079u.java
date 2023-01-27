package p148g.p189d.p190a.p271e.p272a.p273a;

import android.content.Context;
import java.io.File;

/* renamed from: g.d.a.e.a.a.u */
final class C5079u {

    /* renamed from: a */
    private final Context f15101a;

    C5079u(Context context) {
        this.f15101a = context;
    }

    /* renamed from: b */
    private static long m21431b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b : listFiles) {
                j += m21431b(b);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo15182a() {
        return m21431b(new File(this.f15101a.getFilesDir(), "assetpacks"));
    }
}
