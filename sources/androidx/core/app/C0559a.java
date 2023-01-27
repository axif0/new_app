package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import p086f.p111h.p112e.C3267a;

/* renamed from: androidx.core.app.a */
public class C0559a extends C3267a {

    /* renamed from: c */
    private static C0562c f2329c;

    /* renamed from: androidx.core.app.a$a */
    class C0560a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String[] f2330f;

        /* renamed from: g */
        final /* synthetic */ Activity f2331g;

        /* renamed from: h */
        final /* synthetic */ int f2332h;

        C0560a(String[] strArr, Activity activity, int i) {
            this.f2330f = strArr;
            this.f2331g = activity;
            this.f2332h = i;
        }

        public void run() {
            int[] iArr = new int[this.f2330f.length];
            PackageManager packageManager = this.f2331g.getPackageManager();
            String packageName = this.f2331g.getPackageName();
            int length = this.f2330f.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f2330f[i], packageName);
            }
            ((C0561b) this.f2331g).onRequestPermissionsResult(this.f2332h, this.f2330f, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    public interface C0561b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$c */
    public interface C0562c {
        /* renamed from: a */
        boolean mo2807a(Activity activity, int i, int i2, Intent intent);

        /* renamed from: b */
        boolean mo2808b(Activity activity, String[] strArr, int i);
    }

    /* renamed from: androidx.core.app.a$d */
    public interface C0563d {
        /* renamed from: b */
        void mo2809b(int i);
    }

    /* renamed from: k */
    public static void m2635k(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: l */
    public static C0562c m2636l() {
        return f2329c;
    }

    /* renamed from: m */
    public static void m2637m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !C0564b.m2652i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: n */
    public static void m2638n(Activity activity, String[] strArr, int i) {
        C0562c cVar = f2329c;
        if (cVar != null && cVar.mo2808b(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C0563d) {
                ((C0563d) activity).mo2809b(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0561b) {
            new Handler(Looper.getMainLooper()).post(new C0560a(strArr, activity, i));
        }
    }

    /* renamed from: o */
    public static boolean m2639o(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: p */
    public static void m2640p(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
