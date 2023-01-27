package p086f.p111h.p112e;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0569c;

/* renamed from: f.h.e.b */
public final class C3268b {
    /* renamed from: a */
    public static int m14081a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = C0569c.m2654b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0569c.m2653a(context, b, str2) != 0 ? -2 : 0;
    }

    /* renamed from: b */
    public static int m14082b(Context context, String str) {
        return m14081a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
