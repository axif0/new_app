package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p086f.p102e.C3190a;

/* renamed from: g.d.a.c.f.f.r1 */
public final class C4752r1 implements C4819v1 {

    /* renamed from: g */
    private static final Map<Uri, C4752r1> f14428g = new C3190a();

    /* renamed from: h */
    private static final String[] f14429h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f14430a;

    /* renamed from: b */
    private final Uri f14431b;

    /* renamed from: c */
    private final ContentObserver f14432c = new C4786t1(this, (Handler) null);

    /* renamed from: d */
    private final Object f14433d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f14434e;

    /* renamed from: f */
    private final List<C4835w1> f14435f = new ArrayList();

    private C4752r1(ContentResolver contentResolver, Uri uri) {
        this.f14430a = contentResolver;
        this.f14431b = uri;
        contentResolver.registerContentObserver(uri, false, this.f14432c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p148g.p189d.p190a.p232c.p241f.p247f.C4752r1 m20262a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<g.d.a.c.f.f.r1> r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4752r1.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, g.d.a.c.f.f.r1> r1 = f14428g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            g.d.a.c.f.f.r1 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4752r1) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            g.d.a.c.f.f.r1 r2 = new g.d.a.c.f.f.r1     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, g.d.a.c.f.f.r1> r3 = f14428g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4752r1.m20262a(android.content.ContentResolver, android.net.Uri):g.d.a.c.f.f.r1");
    }

    /* renamed from: d */
    static synchronized void m20263d() {
        synchronized (C4752r1.class) {
            for (C4752r1 next : f14428g.values()) {
                next.f14430a.unregisterContentObserver(next.f14432c);
            }
            f14428g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private final Map<String, String> m20264g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C4869y1.m20619a(new C4803u1(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: b */
    public final Map<String, String> mo14569b() {
        Map<String, String> map = this.f14434e;
        if (map == null) {
            synchronized (this.f14433d) {
                map = this.f14434e;
                if (map == null) {
                    map = m20264g();
                    this.f14434e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* renamed from: c */
    public final void mo14570c() {
        synchronized (this.f14433d) {
            this.f14434e = null;
            C4558g2.m19508g();
        }
        synchronized (this) {
            for (C4835w1 a : this.f14435f) {
                a.mo14695a();
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo13773e(String str) {
        return mo14569b().get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Map mo14571f() {
        Cursor query = this.f14430a.query(this.f14431b, f14429h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new C3190a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } finally {
            query.close();
        }
    }
}
