package p148g.p189d.p281b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.C1569a;
import com.google.android.gms.common.internal.C1655n;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1680c;
import com.google.android.gms.common.util.C1689l;
import com.google.android.gms.common.util.C1690m;
import com.google.firebase.components.C2508d;
import com.google.firebase.components.C2512f;
import com.google.firebase.components.C2517h;
import com.google.firebase.components.C2521l;
import com.google.firebase.components.C2531s;
import com.google.firebase.components.ComponentDiscoveryService;
import com.karumi.dexter.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p086f.p102e.C3190a;
import p086f.p111h.p118i.C3310c;
import p148g.p189d.p281b.p284g.C5193c;
import p148g.p189d.p281b.p285h.C5196b;
import p148g.p189d.p281b.p287j.C5201a;
import p148g.p189d.p281b.p288k.C5204c;
import p148g.p189d.p281b.p288k.C5206e;
import p148g.p189d.p281b.p288k.C5208g;

/* renamed from: g.d.b.c */
public class C5171c {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f15205i = new Object();

    /* renamed from: j */
    private static final Executor f15206j = new C5175d();

    /* renamed from: k */
    static final Map<String, C5171c> f15207k = new C3190a();

    /* renamed from: a */
    private final Context f15208a;

    /* renamed from: b */
    private final String f15209b;

    /* renamed from: c */
    private final C5178e f15210c;

    /* renamed from: d */
    private final C2521l f15211d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f15212e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f15213f = new AtomicBoolean();

    /* renamed from: g */
    private final C2531s<C5201a> f15214g;

    /* renamed from: h */
    private final List<C5173b> f15215h = new CopyOnWriteArrayList();

    /* renamed from: g.d.b.c$b */
    public interface C5173b {
        /* renamed from: a */
        void mo15283a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: g.d.b.c$c */
    private static class C5174c implements C1569a.C1570a {

        /* renamed from: a */
        private static AtomicReference<C5174c> f15216a = new AtomicReference<>();

        private C5174c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m21676c(Context context) {
            if (C1689l.m7958a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f15216a.get() == null) {
                    C5174c cVar = new C5174c();
                    if (f15216a.compareAndSet((Object) null, cVar)) {
                        C1569a.m7544c(application);
                        C1569a.m7543b().mo6361a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo6374a(boolean z) {
            synchronized (C5171c.f15205i) {
                Iterator it = new ArrayList(C5171c.f15207k.values()).iterator();
                while (it.hasNext()) {
                    C5171c cVar = (C5171c) it.next();
                    if (cVar.f15212e.get()) {
                        cVar.m21666t(z);
                    }
                }
            }
        }
    }

    /* renamed from: g.d.b.c$d */
    private static class C5175d implements Executor {

        /* renamed from: a */
        private static final Handler f15217a = new Handler(Looper.getMainLooper());

        private C5175d() {
        }

        public void execute(Runnable runnable) {
            f15217a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: g.d.b.c$e */
    private static class C5176e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C5176e> f15218b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f15219a;

        public C5176e(Context context) {
            this.f15219a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m21679b(Context context) {
            if (f15218b.get() == null) {
                C5176e eVar = new C5176e(context);
                if (f15218b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo15285c() {
            this.f15219a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C5171c.f15205i) {
                for (C5171c b : C5171c.f15207k.values()) {
                    b.m21660l();
                }
            }
            mo15285c();
        }
    }

    protected C5171c(Context context, String str, C5178e eVar) {
        new CopyOnWriteArrayList();
        C1658o.m7845j(context);
        this.f15208a = context;
        C1658o.m7841f(str);
        this.f15209b = str;
        C1658o.m7845j(eVar);
        this.f15210c = eVar;
        List<C2517h> a = C2512f.m11295b(context, ComponentDiscoveryService.class).mo9379a();
        String a2 = C5206e.m21754a();
        Executor executor = f15206j;
        C2508d[] dVarArr = new C2508d[8];
        dVarArr[0] = C2508d.m11274n(context, Context.class, new Class[0]);
        dVarArr[1] = C2508d.m11274n(this, C5171c.class, new Class[0]);
        dVarArr[2] = C2508d.m11274n(eVar, C5178e.class, new Class[0]);
        dVarArr[3] = C5208g.m21758a("fire-android", BuildConfig.FLAVOR);
        dVarArr[4] = C5208g.m21758a("fire-core", "19.3.0");
        dVarArr[5] = a2 != null ? C5208g.m21758a("kotlin", a2) : null;
        dVarArr[6] = C5204c.m21748b();
        dVarArr[7] = C5196b.m21733b();
        this.f15211d = new C2521l(executor, a, dVarArr);
        this.f15214g = new C2531s<>(C5170b.m21653a(this, context));
    }

    /* renamed from: e */
    private void m21658e() {
        C1658o.m7849n(!this.f15213f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: h */
    public static C5171c m21659h() {
        C5171c cVar;
        synchronized (f15205i) {
            cVar = f15207k.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C1690m.m7968a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m21660l() {
        if (!C3310c.m14263a(this.f15208a)) {
            C5176e.m21679b(this.f15208a);
        } else {
            this.f15211d.mo9383e(mo15281q());
        }
    }

    /* renamed from: m */
    public static C5171c m21661m(Context context) {
        synchronized (f15205i) {
            if (f15207k.containsKey("[DEFAULT]")) {
                C5171c h = m21659h();
                return h;
            }
            C5178e a = C5178e.m21681a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C5171c n = m21662n(context, a);
            return n;
        }
    }

    /* renamed from: n */
    public static C5171c m21662n(Context context, C5178e eVar) {
        return m21663o(context, eVar, "[DEFAULT]");
    }

    /* renamed from: o */
    public static C5171c m21663o(Context context, C5178e eVar, String str) {
        C5171c cVar;
        C5174c.m21676c(context);
        String s = m21665s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f15205i) {
            boolean z = !f15207k.containsKey(s);
            C1658o.m7849n(z, "FirebaseApp name " + s + " already exists!");
            C1658o.m7846k(context, "Application context cannot be null.");
            cVar = new C5171c(context, s, eVar);
            f15207k.put(s, cVar);
        }
        cVar.m21660l();
        return cVar;
    }

    /* renamed from: r */
    static /* synthetic */ C5201a m21664r(C5171c cVar, Context context) {
        return new C5201a(context, cVar.mo15279k(), (C5193c) cVar.f15211d.mo9362a(C5193c.class));
    }

    /* renamed from: s */
    private static String m21665s(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m21666t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C5173b a : this.f15215h) {
            a.mo15283a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5171c)) {
            return false;
        }
        return this.f15209b.equals(((C5171c) obj).mo15277i());
    }

    /* renamed from: f */
    public <T> T mo15274f(Class<T> cls) {
        m21658e();
        return this.f15211d.mo9362a(cls);
    }

    /* renamed from: g */
    public Context mo15275g() {
        m21658e();
        return this.f15208a;
    }

    public int hashCode() {
        return this.f15209b.hashCode();
    }

    /* renamed from: i */
    public String mo15277i() {
        m21658e();
        return this.f15209b;
    }

    /* renamed from: j */
    public C5178e mo15278j() {
        m21658e();
        return this.f15210c;
    }

    /* renamed from: k */
    public String mo15279k() {
        return C1680c.m7936a(mo15277i().getBytes(Charset.defaultCharset())) + "+" + C1680c.m7936a(mo15278j().mo15288c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: p */
    public boolean mo15280p() {
        m21658e();
        return this.f15214g.get().mo15323b();
    }

    /* renamed from: q */
    public boolean mo15281q() {
        return "[DEFAULT]".equals(mo15277i());
    }

    public String toString() {
        C1655n.C1656a c = C1655n.m7834c(this);
        c.mo6552a("name", this.f15209b);
        c.mo6552a("options", this.f15210c);
        return c.toString();
    }
}
