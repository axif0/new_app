package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.C1491e;
import com.google.android.datatransport.runtime.backends.C1492f;
import com.google.android.datatransport.runtime.backends.C1494g;
import com.google.android.datatransport.runtime.backends.C1502m;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p193t.C3765a;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3795h;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
public class C1521m {

    /* renamed from: a */
    private final Context f5116a;

    /* renamed from: b */
    private final C1491e f5117b;

    /* renamed from: c */
    private final C3784c f5118c;

    /* renamed from: d */
    private final C1527s f5119d;

    /* renamed from: e */
    private final Executor f5120e;

    /* renamed from: f */
    private final C3819b f5121f;

    /* renamed from: g */
    private final C3821a f5122g;

    public C1521m(Context context, C1491e eVar, C3784c cVar, C1527s sVar, Executor executor, C3819b bVar, C3821a aVar) {
        this.f5116a = context;
        this.f5117b = eVar;
        this.f5118c = cVar;
        this.f5119d = sVar;
        this.f5120e = executor;
        this.f5121f = bVar;
        this.f5122g = aVar;
    }

    /* renamed from: c */
    static /* synthetic */ Object m7328c(C1521m mVar, C1494g gVar, Iterable iterable, C3755l lVar, int i) {
        if (gVar.mo6127c() == C1494g.C1495a.TRANSIENT_ERROR) {
            mVar.f5118c.mo12385U(iterable);
            mVar.f5119d.mo6147a(lVar, i + 1);
            return null;
        }
        mVar.f5118c.mo12387g(iterable);
        if (gVar.mo6127c() == C1494g.C1495a.OK) {
            mVar.f5118c.mo12389z(lVar, mVar.f5122g.mo12402a() + gVar.mo6126b());
        }
        if (!mVar.f5118c.mo12384T(lVar)) {
            return null;
        }
        mVar.f5119d.mo6147a(lVar, 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f5119d.mo6147a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m7330e(com.google.android.datatransport.runtime.scheduling.jobscheduling.C1521m r2, p148g.p189d.p190a.p191a.p192i.C3755l r3, int r4, java.lang.Runnable r5) {
        /*
            g.d.a.a.i.w.b r0 = r2.f5121f     // Catch:{ a -> 0x0024 }
            g.d.a.a.i.v.j.c r1 = r2.f5118c     // Catch:{ a -> 0x0024 }
            r1.getClass()     // Catch:{ a -> 0x0024 }
            g.d.a.a.i.w.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C1519k.m7325a(r1)     // Catch:{ a -> 0x0024 }
            r0.mo12400a(r1)     // Catch:{ a -> 0x0024 }
            boolean r0 = r2.mo6174a()     // Catch:{ a -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            g.d.a.a.i.w.b r0 = r2.f5121f     // Catch:{ a -> 0x0024 }
            g.d.a.a.i.w.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C1520l.m7326a(r2, r3, r4)     // Catch:{ a -> 0x0024 }
            r0.mo12400a(r1)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.mo6175f(r3, r4)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.s r2 = r2.f5119d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.mo6147a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C1521m.m7330e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m, g.d.a.a.i.l, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6174a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5116a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6175f(C3755l lVar, int i) {
        C1494g gVar;
        C1502m a = this.f5117b.mo6138a(lVar.mo12319b());
        Iterable<C3795h> iterable = (Iterable) this.f5121f.mo12400a(C1517i.m7323a(this, lVar));
        if (iterable.iterator().hasNext()) {
            if (a == null) {
                C3765a.m15704a("Uploader", "Unknown backend for %s, deleting event batch for it...", lVar);
                gVar = C1494g.m7262a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C3795h b : iterable) {
                    arrayList.add(b.mo12374b());
                }
                C1492f.C1493a a2 = C1492f.m7256a();
                a2.mo6124b(arrayList);
                a2.mo6125c(lVar.mo12320c());
                gVar = a.mo6115b(a2.mo6123a());
            }
            this.f5121f.mo12400a(C1518j.m7324a(this, gVar, iterable, lVar, i));
        }
    }

    /* renamed from: g */
    public void mo6176g(C3755l lVar, int i, Runnable runnable) {
        this.f5120e.execute(C1516h.m7322a(this, lVar, i, runnable));
    }
}
