package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;
import android.os.Bundle;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;

/* renamed from: g.d.a.c.f.f.j */
final class C4607j extends C4552g.C4553a {

    /* renamed from: j */
    private final /* synthetic */ String f14186j;

    /* renamed from: k */
    private final /* synthetic */ String f14187k;

    /* renamed from: l */
    private final /* synthetic */ Context f14188l;

    /* renamed from: m */
    private final /* synthetic */ Bundle f14189m;

    /* renamed from: n */
    private final /* synthetic */ C4552g f14190n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4607j(C4552g gVar, String str, String str2, Context context, Bundle bundle) {
        super(gVar);
        this.f14190n = gVar;
        this.f14186j = str;
        this.f14187k = str2;
        this.f14188l = context;
        this.f14189m = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x00a0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13770a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            g.d.a.c.f.f.g r2 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
            r3.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.util.List unused = r2.f14116e = r3     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.g r2 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = r14.f14186j     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r14.f14187k     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4552g.m19444F(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f14187k     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r14.f14186j     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.g r4 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = r4.f14112a     // Catch:{ Exception -> 0x00a0 }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f14188l     // Catch:{ Exception -> 0x00a0 }
            p148g.p189d.p190a.p232c.p241f.p247f.C4552g.m19449P(r2)     // Catch:{ Exception -> 0x00a0 }
            java.lang.Boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4552g.f14110j     // Catch:{ Exception -> 0x00a0 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x00a0 }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            g.d.a.c.f.f.g r3 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.g r4 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r5 = r14.f14188l     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.ff r4 = r4.mo14146c(r5, r2)     // Catch:{ Exception -> 0x00a0 }
            p148g.p189d.p190a.p232c.p241f.p247f.C4551ff unused = r3.f14119h = r4     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.g r3 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.ff r3 = r3.f14119h     // Catch:{ Exception -> 0x00a0 }
            if (r3 != 0) goto L_0x0060
            g.d.a.c.f.f.g r2 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r2.f14112a     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x0060:
            android.content.Context r3 = r14.f14188l     // Catch:{ Exception -> 0x00a0 }
            int r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4552g.m19448N(r3)     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r4 = r14.f14188l     // Catch:{ Exception -> 0x00a0 }
            int r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4552g.m19447L(r4)     // Catch:{ Exception -> 0x00a0 }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x00a0 }
            if (r4 >= r3) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0083
        L_0x0079:
            if (r3 <= 0) goto L_0x007c
            r4 = r3
        L_0x007c:
            if (r3 <= 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0080:
            r2 = 0
        L_0x0081:
            r8 = r2
            r2 = r4
        L_0x0083:
            g.d.a.c.f.f.e r13 = new g.d.a.c.f.f.e     // Catch:{ Exception -> 0x00a0 }
            r4 = 31049(0x7949, double:1.534E-319)
            long r6 = (long) r2     // Catch:{ Exception -> 0x00a0 }
            android.os.Bundle r12 = r14.f14189m     // Catch:{ Exception -> 0x00a0 }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.g r2 = r14.f14190n     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.f.f.ff r2 = r2.f14119h     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r3 = r14.f14188l     // Catch:{ Exception -> 0x00a0 }
            g.d.a.c.e.a r3 = p148g.p189d.p190a.p232c.p240e.C4403b.m18643S0(r3)     // Catch:{ Exception -> 0x00a0 }
            long r4 = r14.f14120f     // Catch:{ Exception -> 0x00a0 }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x00a0:
            r2 = move-exception
            g.d.a.c.f.f.g r3 = r14.f14190n
            r3.m19459n(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p241f.p247f.C4607j.mo13770a():void");
    }
}
