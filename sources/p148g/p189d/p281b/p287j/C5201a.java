package p148g.p189d.p281b.p287j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import p086f.p111h.p112e.C3267a;
import p148g.p189d.p281b.p284g.C5193c;

/* renamed from: g.d.b.j.a */
public class C5201a {

    /* renamed from: a */
    private final Context f15253a;

    /* renamed from: b */
    private final SharedPreferences f15254b;

    /* renamed from: c */
    private final AtomicBoolean f15255c = new AtomicBoolean(m21742c());

    public C5201a(Context context, String str, C5193c cVar) {
        this.f15253a = m21741a(context);
        this.f15254b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
    }

    /* renamed from: a */
    private static Context m21741a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || C3267a.m14078h(context)) ? context : C3267a.m14072b(context);
    }

    /* renamed from: c */
    private boolean m21742c() {
        ApplicationInfo applicationInfo;
        if (this.f15254b.contains("firebase_data_collection_default_enabled")) {
            return this.f15254b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f15253a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f15253a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo15323b() {
        return this.f15255c.get();
    }
}
