package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.q7 */
final class C1917q7 implements Runnable {

    /* renamed from: f */
    private final URL f6194f;

    /* renamed from: g */
    private final C1881n7 f6195g;

    /* renamed from: h */
    private final String f6196h;

    /* renamed from: i */
    private final /* synthetic */ C1893o7 f6197i;

    public C1917q7(C1893o7 o7Var, String str, URL url, byte[] bArr, Map<String, String> map, C1881n7 n7Var) {
        this.f6197i = o7Var;
        C1658o.m7841f(str);
        C1658o.m7845j(url);
        C1658o.m7845j(n7Var);
        this.f6194f = url;
        this.f6195g = n7Var;
        this.f6196h = str;
    }

    /* renamed from: b */
    private final void m8807b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f6197i.mo6706e().mo6703y(new C1905p7(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo7311a(int i, Exception exc, byte[] bArr, Map map) {
        this.f6195g.mo7011a(this.f6196h, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.o7 r0 = r5.f6197i
            r0.mo6699a()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.o7 r2 = r5.f6197i     // Catch:{ IOException -> 0x003c, all -> 0x0030 }
            java.net.URL r3 = r5.f6194f     // Catch:{ IOException -> 0x003c, all -> 0x0030 }
            java.net.HttpURLConnection r2 = r2.mo7267t(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0030 }
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x002d, all -> 0x002a }
            com.google.android.gms.measurement.internal.o7 r4 = r5.f6197i     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            byte[] r4 = com.google.android.gms.measurement.internal.C1893o7.m8759v(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0026 }
            if (r2 == 0) goto L_0x0022
            r2.disconnect()
        L_0x0022:
            r5.m8807b(r1, r0, r4, r3)
            return
        L_0x0026:
            r4 = move-exception
            goto L_0x0033
        L_0x0028:
            r4 = move-exception
            goto L_0x003f
        L_0x002a:
            r4 = move-exception
            r3 = r0
            goto L_0x0033
        L_0x002d:
            r4 = move-exception
            r3 = r0
            goto L_0x003f
        L_0x0030:
            r4 = move-exception
            r2 = r0
            r3 = r2
        L_0x0033:
            if (r2 == 0) goto L_0x0038
            r2.disconnect()
        L_0x0038:
            r5.m8807b(r1, r0, r0, r3)
            throw r4
        L_0x003c:
            r4 = move-exception
            r2 = r0
            r3 = r2
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.disconnect()
        L_0x0044:
            r5.m8807b(r1, r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1917q7.run():void");
    }
}
