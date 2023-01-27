package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1658o;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
final class C1842k4 implements Runnable {

    /* renamed from: f */
    private final URL f5963f;

    /* renamed from: g */
    private final byte[] f5964g;

    /* renamed from: h */
    private final C1818i4 f5965h;

    /* renamed from: i */
    private final String f5966i;

    /* renamed from: j */
    private final Map<String, String> f5967j;

    /* renamed from: k */
    private final /* synthetic */ C1794g4 f5968k;

    public C1842k4(C1794g4 g4Var, String str, URL url, byte[] bArr, Map<String, String> map, C1818i4 i4Var) {
        this.f5968k = g4Var;
        C1658o.m7841f(str);
        C1658o.m7845j(url);
        C1658o.m7845j(i4Var);
        this.f5963f = url;
        this.f5964g = bArr;
        this.f5965h = i4Var;
        this.f5966i = str;
        this.f5967j = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1 A[SYNTHETIC, Splitter:B:48:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c A[SYNTHETIC, Splitter:B:61:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.g4 r1 = r13.f5968k
            r1.mo6699a()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.g4 r3 = r13.f5968k     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.URL r4 = r13.f5963f     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.net.HttpURLConnection r3 = r3.mo7009u(r4)     // Catch:{ IOException -> 0x0105, all -> 0x00ca }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f5967j     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f5967j     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f5964g     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            if (r4 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.g4 r4 = r13.f5968k     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.ba r4 = r4.mo7383m()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r5 = r13.f5964g     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            byte[] r4 = r4.mo6756W(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.g4 r5 = r13.f5968k     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo6709i()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6772M()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.mo6886b(r6, r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            int r5 = r4.length     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r3.connect()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            r5.write(r4)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r1 = r5
            goto L_0x00ce
        L_0x0082:
            r4 = move-exception
            r10 = r1
            r8 = r4
            r1 = r5
            goto L_0x0109
        L_0x0088:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00c7, all -> 0x00c4 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00bf, all -> 0x00ba }
            com.google.android.gms.measurement.internal.g4 r2 = r13.f5968k     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            byte[] r10 = com.google.android.gms.measurement.internal.C1794g4.m8522w(r3)     // Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
            if (r3 == 0) goto L_0x009b
            r3.disconnect()
        L_0x009b:
            com.google.android.gms.measurement.internal.g4 r0 = r13.f5968k
            com.google.android.gms.measurement.internal.a5 r0 = r0.mo6706e()
            com.google.android.gms.measurement.internal.l4 r1 = new com.google.android.gms.measurement.internal.l4
            java.lang.String r6 = r13.f5966i
            com.google.android.gms.measurement.internal.i4 r7 = r13.f5965h
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00ad:
            r0.mo6703y(r1)
            return
        L_0x00b1:
            r4 = move-exception
            r2 = r4
            r7 = r8
            r10 = r11
            goto L_0x00cf
        L_0x00b6:
            r4 = move-exception
            r7 = r8
            r10 = r11
            goto L_0x00c2
        L_0x00ba:
            r4 = move-exception
            r10 = r1
            r2 = r4
            r7 = r8
            goto L_0x00cf
        L_0x00bf:
            r4 = move-exception
            r10 = r1
            r7 = r8
        L_0x00c2:
            r8 = r4
            goto L_0x010a
        L_0x00c4:
            r4 = move-exception
            r10 = r1
            goto L_0x00cd
        L_0x00c7:
            r4 = move-exception
            r10 = r1
            goto L_0x0108
        L_0x00ca:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x00cd:
            r2 = r4
        L_0x00ce:
            r7 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x00e9
            r1.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00e9
        L_0x00d5:
            r1 = move-exception
            com.google.android.gms.measurement.internal.g4 r4 = r13.f5968k
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6764E()
            java.lang.String r5 = r13.f5966i
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r5)
            r4.mo6887c(r0, r5, r1)
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.disconnect()
        L_0x00ee:
            com.google.android.gms.measurement.internal.g4 r0 = r13.f5968k
            com.google.android.gms.measurement.internal.a5 r0 = r0.mo6706e()
            com.google.android.gms.measurement.internal.l4 r1 = new com.google.android.gms.measurement.internal.l4
            java.lang.String r5 = r13.f5966i
            com.google.android.gms.measurement.internal.i4 r6 = r13.f5965h
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo6703y(r1)
            throw r2
        L_0x0105:
            r4 = move-exception
            r3 = r1
            r10 = r3
        L_0x0108:
            r8 = r4
        L_0x0109:
            r7 = 0
        L_0x010a:
            if (r1 == 0) goto L_0x0124
            r1.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0124
        L_0x0110:
            r1 = move-exception
            com.google.android.gms.measurement.internal.g4 r2 = r13.f5968k
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()
            java.lang.String r4 = r13.f5966i
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r4)
            r2.mo6887c(r0, r4, r1)
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            r3.disconnect()
        L_0x0129:
            com.google.android.gms.measurement.internal.g4 r0 = r13.f5968k
            com.google.android.gms.measurement.internal.a5 r0 = r0.mo6706e()
            com.google.android.gms.measurement.internal.l4 r1 = new com.google.android.gms.measurement.internal.l4
            java.lang.String r5 = r13.f5966i
            com.google.android.gms.measurement.internal.i4 r6 = r13.f5965h
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1842k4.run():void");
    }
}
