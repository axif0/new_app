package p148g.p189d.p190a.p232c.p237d.p239p;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C1689l;

/* renamed from: g.d.a.c.d.p.b */
public class C4388b {

    /* renamed from: a */
    private final Context f13930a;

    public C4388b(Context context) {
        this.f13930a = context;
    }

    /* renamed from: a */
    public int mo13713a(String str) {
        return this.f13930a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo13714b(String str, String str2) {
        return this.f13930a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo mo13715c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f13930a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence mo13716d(String str) throws PackageManager.NameNotFoundException {
        return this.f13930a.getPackageManager().getApplicationLabel(this.f13930a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo mo13717e(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f13930a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public final String[] mo13718f(int i) {
        return this.f13930a.getPackageManager().getPackagesForUid(i);
    }

    /* renamed from: g */
    public boolean mo13719g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C4387a.m18617a(this.f13930a);
        }
        if (!C1689l.m7966i() || (nameForUid = this.f13930a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f13930a.getPackageManager().isInstantApp(nameForUid);
    }

    /* renamed from: h */
    public final PackageInfo mo13720h(String str, int i, int i2) throws PackageManager.NameNotFoundException {
        return this.f13930a.getPackageManager().getPackageInfo(str, 64);
    }

    @TargetApi(19)
    /* renamed from: i */
    public final boolean mo13721i(int i, String str) {
        if (C1689l.m7962e()) {
            try {
                ((AppOpsManager) this.f13930a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f13930a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
