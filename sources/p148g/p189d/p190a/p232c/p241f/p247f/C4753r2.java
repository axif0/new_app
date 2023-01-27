package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p086f.p102e.C3190a;

/* renamed from: g.d.a.c.f.f.r2 */
public final class C4753r2 implements C4819v1 {

    /* renamed from: f */
    private static final Map<String, C4753r2> f14436f = new C3190a();

    /* renamed from: a */
    private final SharedPreferences f14437a;

    /* renamed from: b */
    private final SharedPreferences.OnSharedPreferenceChangeListener f14438b = new C4737q2(this);

    /* renamed from: c */
    private final Object f14439c = new Object();

    /* renamed from: d */
    private volatile Map<String, ?> f14440d;

    /* renamed from: e */
    private final List<C4835w1> f14441e = new ArrayList();

    private C4753r2(SharedPreferences sharedPreferences) {
        this.f14437a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f14438b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g.d.a.c.f.f.r2, java.lang.Object, java.lang.String] */
    /* renamed from: a */
    static C4753r2 m20269a(Context context, String str) {
        C4753r2 r2Var;
        ? r0 = 0;
        if (!((!C4720p1.m20074a() || r0.startsWith("direct_boot:")) ? true : C4720p1.m20075b(context))) {
            return r0;
        }
        synchronized (C4753r2.class) {
            r2Var = f14436f.get(r0);
            if (r2Var == null) {
                r2Var = new C4753r2(m20271d(context, r0));
                f14436f.put(r0, r2Var);
            }
        }
        return r2Var;
    }

    /* renamed from: b */
    static synchronized void m20270b() {
        synchronized (C4753r2.class) {
            for (C4753r2 next : f14436f.values()) {
                next.f14437a.unregisterOnSharedPreferenceChangeListener(next.f14438b);
            }
            f14436f.clear();
        }
    }

    /* renamed from: d */
    private static SharedPreferences m20271d(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (C4720p1.m20074a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14572c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f14439c) {
            this.f14440d = null;
            C4558g2.m19508g();
        }
        synchronized (this) {
            for (C4835w1 a : this.f14441e) {
                a.mo14695a();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final Object mo13773e(String str) {
        Map<String, ?> map = this.f14440d;
        if (map == null) {
            synchronized (this.f14439c) {
                map = this.f14440d;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f14437a.getAll();
                        this.f14440d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
