package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: g.d.a.c.f.f.e2 */
public final class C4520e2 {

    /* renamed from: a */
    private static volatile C4465b3<Boolean> f14082a = C4465b3.m18791d();

    /* renamed from: b */
    private static final Object f14083b = new Object();

    /* renamed from: a */
    private static boolean m19302a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    public static boolean m19303b(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f14082a.mo13836b()) {
            synchronized (f14083b) {
                if (f14082a.mo13836b()) {
                    boolean booleanValue = f14082a.mo13837c().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && m19302a(context)) {
                            z2 = true;
                        }
                        f14082a = C4465b3.m18790a(Boolean.valueOf(z2));
                    }
                }
                z = true;
                z2 = true;
                f14082a = C4465b3.m18790a(Boolean.valueOf(z2));
            }
        }
        return f14082a.mo13837c().booleanValue();
    }
}
