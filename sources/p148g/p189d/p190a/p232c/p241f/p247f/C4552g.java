package p148g.p189d.p190a.p232c.p241f.p247f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1682e;
import com.google.android.gms.common.util.C1685h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C1832j6;
import com.google.android.gms.measurement.internal.C1929r7;
import com.google.android.gms.measurement.p039a.C1714a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: g.d.a.c.f.f.g */
public class C4552g {

    /* renamed from: i */
    private static volatile C4552g f14109i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Boolean f14110j = null;

    /* renamed from: k */
    private static String f14111k = "allow_remote_dynamite";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f14112a;

    /* renamed from: b */
    protected final C1682e f14113b;

    /* renamed from: c */
    private final ExecutorService f14114c;

    /* renamed from: d */
    private final C1714a f14115d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<Pair<C1832j6, Object>> f14116e;

    /* renamed from: f */
    private int f14117f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f14118g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4551ff f14119h;

    /* renamed from: g.d.a.c.f.f.g$a */
    abstract class C4553a implements Runnable {

        /* renamed from: f */
        final long f14120f;

        /* renamed from: g */
        final long f14121g;

        /* renamed from: h */
        private final boolean f14122h;

        C4553a(C4552g gVar) {
            this(true);
        }

        C4553a(boolean z) {
            this.f14120f = C4552g.this.f14113b.mo6587c();
            this.f14121g = C4552g.this.f14113b.mo6585a();
            this.f14122h = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo13770a() throws RemoteException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo14157b() {
        }

        public void run() {
            if (C4552g.this.f14118g) {
                mo14157b();
                return;
            }
            try {
                mo13770a();
            } catch (Exception e) {
                C4552g.this.m19459n(e, false, this.f14122h);
                mo14157b();
            }
        }
    }

    /* renamed from: g.d.a.c.f.f.g$b */
    class C4554b implements Application.ActivityLifecycleCallbacks {
        C4554b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C4552g.this.m19456k(new C4498d0(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            C4552g.this.m19456k(new C4591i0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C4552g.this.m19456k(new C4516e0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C4552g.this.m19456k(new C4535f0(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C4514df dfVar = new C4514df();
            C4552g.this.m19456k(new C4555g0(this, activity, dfVar));
            Bundle S0 = dfVar.mo14081S0(50);
            if (S0 != null) {
                bundle.putAll(S0);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C4552g.this.m19456k(new C4480c0(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C4552g.this.m19456k(new C4573h0(this, activity));
        }
    }

    private C4552g(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f14112a = (str == null || !m19444F(str2, str3)) ? "FA" : str;
        this.f14113b = C1685h.m7946d();
        this.f14114c = C4506d7.m19229a().mo14088a(new C4683n(this), C4496cf.f14023a);
        this.f14115d = new C1714a(this);
        boolean z = false;
        if (!(!m19446K(context) || m19451R())) {
            this.f14118g = true;
            Log.w(this.f14112a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!m19444F(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f14112a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f14112a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        m19456k(new C4607j(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f14112a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C4554b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static boolean m19444F(String str, String str2) {
        return (str2 == null || str == null || m19451R()) ? false : true;
    }

    /* renamed from: K */
    private static boolean m19446K(Context context) {
        try {
            return C1929r7.m8823a(context, "google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static int m19447L(Context context) {
        return DynamiteModule.m7993b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static int m19448N(Context context) {
        return DynamiteModule.m7992a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static void m19449P(Context context) {
        synchronized (C4552g.class) {
            try {
                if (f14110j == null) {
                    if (m19462t(context, "app_measurement_internal_disable_startup_flags")) {
                        f14110j = Boolean.FALSE;
                        return;
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                    f14110j = Boolean.valueOf(sharedPreferences.getBoolean(f14111k, false));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove(f14111k);
                    edit.apply();
                }
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                f14110j = Boolean.FALSE;
            }
        }
    }

    /* renamed from: R */
    private static boolean m19451R() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static C4552g m19452a(Context context) {
        return m19453b(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* renamed from: b */
    public static C4552g m19453b(Context context, String str, String str2, String str3, Bundle bundle) {
        C1658o.m7845j(context);
        if (f14109i == null) {
            synchronized (C4552g.class) {
                if (f14109i == null) {
                    f14109i = new C4552g(context, str, str2, str3, bundle);
                }
            }
        }
        return f14109i;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m19456k(C4553a aVar) {
        this.f14114c.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m19459n(Exception exc, boolean z, boolean z2) {
        this.f14118g |= z;
        if (z) {
            Log.w(this.f14112a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo14149h(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f14112a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: p */
    private final void m19460p(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m19456k(new C4461b0(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: r */
    private final void m19461r(String str, String str2, Object obj, boolean z) {
        m19456k(new C4443a0(this, str, str2, obj, z));
    }

    /* renamed from: t */
    private static boolean m19462t(Context context, String str) {
        C1658o.m7841f(str);
        try {
            ApplicationInfo c = C4389c.m18627a(context).mo13715c(context.getPackageName(), 128);
            if (c != null) {
                if (c.metaData != null) {
                    return c.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: A */
    public final void mo14138A(String str, String str2, Bundle bundle) {
        m19456k(new C4644l(this, str, str2, bundle));
    }

    /* renamed from: D */
    public final String mo14139D() {
        C4514df dfVar = new C4514df();
        m19456k(new C4750r(this, dfVar));
        return dfVar.mo14083w(500);
    }

    /* renamed from: E */
    public final void mo14140E(String str) {
        m19456k(new C4700o(this, str));
    }

    /* renamed from: H */
    public final int mo14141H(String str) {
        C4514df dfVar = new C4514df();
        m19456k(new C4866y(this, str, dfVar));
        Integer num = (Integer) C4514df.m19292r(dfVar.mo14081S0(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: I */
    public final String mo14142I() {
        C4514df dfVar = new C4514df();
        m19456k(new C4734q(this, dfVar));
        return dfVar.mo14083w(50);
    }

    /* renamed from: J */
    public final long mo14143J() {
        C4514df dfVar = new C4514df();
        m19456k(new C4783t(this, dfVar));
        Long l = (Long) C4514df.m19292r(dfVar.mo14081S0(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f14113b.mo6587c()).nextLong();
        int i = this.f14117f + 1;
        this.f14117f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: M */
    public final String mo14144M() {
        C4514df dfVar = new C4514df();
        m19456k(new C4766s(this, dfVar));
        return dfVar.mo14083w(500);
    }

    /* renamed from: O */
    public final String mo14145O() {
        C4514df dfVar = new C4514df();
        m19456k(new C4833w(this, dfVar));
        return dfVar.mo14083w(500);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C4551ff mo14146c(Context context, boolean z) {
        DynamiteModule.C1700b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.f5593k;
            } catch (DynamiteModule.C1699a e) {
                m19459n(e, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.f5591i;
        }
        return C4533ef.asInterface(DynamiteModule.m7994d(context, bVar, ModuleDescriptor.MODULE_ID).mo6590c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* renamed from: e */
    public final C1714a mo14147e() {
        return this.f14115d;
    }

    /* renamed from: g */
    public final Map<String, Object> mo14148g(String str, String str2, boolean z) {
        C4514df dfVar = new C4514df();
        m19456k(new C4817v(this, str, str2, z, dfVar));
        Bundle S0 = dfVar.mo14081S0(5000);
        if (S0 == null || S0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(S0.size());
        for (String str3 : S0.keySet()) {
            Object obj = S0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public final void mo14149h(int i, String str, Object obj, Object obj2, Object obj3) {
        m19456k(new C4849x(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* renamed from: i */
    public final void mo14150i(Activity activity, String str, String str2) {
        m19456k(new C4662m(this, activity, str, str2));
    }

    /* renamed from: j */
    public final void mo14151j(Bundle bundle) {
        m19456k(new C4590i(this, bundle));
    }

    /* renamed from: o */
    public final void mo14152o(String str, String str2, Bundle bundle) {
        m19460p(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: q */
    public final void mo14153q(String str, String str2, Object obj) {
        m19461r(str, str2, obj, true);
    }

    /* renamed from: s */
    public final void mo14154s(boolean z) {
        m19456k(new C4887z(this, z));
    }

    /* renamed from: x */
    public final List<Bundle> mo14155x(String str, String str2) {
        C4514df dfVar = new C4514df();
        m19456k(new C4627k(this, str, str2, dfVar));
        List<Bundle> list = (List) C4514df.m19292r(dfVar.mo14081S0(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: z */
    public final void mo14156z(String str) {
        m19456k(new C4718p(this, str));
    }
}
