package academia.bracu.com.academia.app;

import android.app.Application;
import android.content.Context;
import androidx.appcompat.app.C0275g;
import com.karumi.dexter.C2722R;
import java.io.File;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p086f.p142q.C3469a;
import p340io.realm.C5648d0;
import p340io.realm.C5672i0;
import p390p.p391a.C6550a;

public class MyApplication extends Application {
    /* renamed from: a */
    public static void m1a(Context context) {
        String[] list;
        File cacheDir = context.getCacheDir();
        if (cacheDir.getParent() != null) {
            File file = new File(cacheDir.getParent());
            if (file.exists() && (list = file.list()) != null) {
                for (String str : list) {
                    if (!str.equals("lib")) {
                        m2b(new File(file, str));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m2b(File file) {
        boolean z = true;
        if (file != null && file.isDirectory()) {
            String[] list = file.list();
            if (list == null) {
                return true;
            }
            for (String file2 : list) {
                z = m2b(new File(file, file2));
                if (!z) {
                    return false;
                }
            }
        }
        return file != null ? file.delete() : z;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C3469a.m14975k(context);
    }

    public void onCreate() {
        super.onCreate();
        String e = C3099l.m13277b(this).mo10692e(getString(C2722R.string.theme_pref_key), "dark");
        if (C3099l.m13277b(this).mo10691d(getString(C2722R.string.theme_pref_key)).isEmpty()) {
            C3099l.m13277b(this).mo10696i(getString(C2722R.string.theme_pref_key), e);
        }
        C0001a.f0a.mo3a(e);
        C0275g.m1031D(true);
        C5648d0.m23429r0(this);
        C5672i0.C5673a aVar = new C5672i0.C5673a();
        aVar.mo16330f("default.realm");
        aVar.mo16331g(1);
        aVar.mo16329d();
        C5648d0.m23431t0(aVar.mo16328b());
        C6550a.m26772b(new C6550a.C6552b());
    }
}
