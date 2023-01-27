package p340io.realm.internal.p343u;

import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p340io.realm.internal.Util;
import p340io.realm.log.RealmLog;
import p374m.C6099a0;
import p374m.C6113c0;
import p374m.C6238j;
import p374m.C6259u;
import p374m.C6261v;
import p374m.C6265x;
import p385n.C6277c;

/* renamed from: io.realm.internal.u.e */
public class C5744e implements C5746f {

    /* renamed from: d */
    public static final C6261v f16583d = C6261v.m25704c("application/json; charset=utf-8");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Charset f16584e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C6265x f16585a;

    /* renamed from: b */
    private Map<String, Map<String, String>> f16586b = new LinkedHashMap();

    /* renamed from: c */
    private Map<String, String> f16587c = new HashMap();

    /* renamed from: io.realm.internal.u.e$a */
    class C5745a implements C6259u {
        C5745a(C5744e eVar) {
        }

        /* renamed from: a */
        public C6113c0 mo16688a(C6259u.C6260a aVar) throws IOException {
            C6099a0 request = aVar.request();
            if (RealmLog.m24082h() <= 2) {
                StringBuilder sb = new StringBuilder(request.mo17218g());
                sb.append(' ');
                sb.append(request.mo17221j());
                sb.append(10);
                sb.append(request.mo17216e());
                if (request.mo17212a() != null) {
                    C6277c cVar = new C6277c();
                    request.mo17212a().mo17235f(cVar);
                    sb.append(cVar.mo17824h0(C5744e.f16584e));
                }
                RealmLog.m24086l("HTTP Request = \n%s", sb);
            }
            return aVar.mo17438d(request);
        }
    }

    public C5744e() {
        C6265x.C6267b bVar = new C6265x.C6267b();
        bVar.mo17770d(15, TimeUnit.SECONDS);
        bVar.mo17774h(15, TimeUnit.SECONDS);
        bVar.mo17773g(30, TimeUnit.SECONDS);
        bVar.mo17772f(true);
        bVar.mo17767a(new C5745a(this));
        bVar.mo17771e(new C6238j(5, 5, TimeUnit.SECONDS));
        this.f16585a = bVar.mo17768b();
        m24008e();
    }

    /* renamed from: e */
    private void m24008e() {
        this.f16587c.put(BuildConfig.FLAVOR, "Authorization");
        this.f16586b.put(BuildConfig.FLAVOR, new LinkedHashMap());
    }

    /* renamed from: a */
    public void mo16685a(String str, String str2) {
        if (Util.m23792e(str2)) {
            this.f16587c.put(BuildConfig.FLAVOR, str);
        } else {
            this.f16587c.put(str2, str);
        }
    }

    /* renamed from: b */
    public void mo16686b() {
        this.f16587c.clear();
        this.f16586b.clear();
        m24008e();
    }

    /* renamed from: c */
    public void mo16687c(String str, String str2, String str3) {
        if (Util.m23792e(str3)) {
            this.f16586b.get(BuildConfig.FLAVOR).put(str, str2);
            return;
        }
        Map map = this.f16586b.get(str3);
        if (map == null) {
            map = new LinkedHashMap();
            this.f16586b.put(str3, map);
        }
        map.put(str, str2);
    }
}
