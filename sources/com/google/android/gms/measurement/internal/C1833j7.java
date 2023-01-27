package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.j7 */
final class C1833j7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    private final /* synthetic */ C1856l6 f5947f;

    private C1833j7(C1856l6 l6Var) {
        this.f5947f = l6Var;
    }

    /* synthetic */ C1833j7(C1856l6 l6Var, C1916q6 q6Var) {
        this(l6Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1 A[SYNTHETIC, Splitter:B:33:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe A[Catch:{ Exception -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[SYNTHETIC, Splitter:B:51:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e A[Catch:{ Exception -> 0x01d6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f A[Catch:{ Exception -> 0x01d6 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8620b(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.l6 r3 = r1.f5947f
            r3.mo6700b()
            com.google.android.gms.measurement.internal.l6 r3 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r3 = r3.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6365f0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.mo7415s(r4)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.l6 r3 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r3 = r3.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C1957u.f6369h0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.mo7415s(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.l6 r3 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r3 = r3.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C1957u.f6367g0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.mo7415s(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x009b
        L_0x0044:
            com.google.android.gms.measurement.internal.l6 r3 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.fa r3 = r3.mo6707f()     // Catch:{ Exception -> 0x01d6 }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r11 == 0) goto L_0x0051
            goto L_0x0042
        L_0x0051:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6771L()     // Catch:{ Exception -> 0x01d6 }
            r3.mo6885a(r4)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x0042
        L_0x0075:
            java.lang.String r11 = "https://google.com/search?"
            java.lang.String r12 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x01d6 }
            int r13 = r12.length()     // Catch:{ Exception -> 0x01d6 }
            if (r13 == 0) goto L_0x0086
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x008c
        L_0x0086:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01d6 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01d6 }
            r11 = r12
        L_0x008c:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01d6 }
            android.os.Bundle r3 = r3.mo6970A(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x009b
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01d6 }
        L_0x009b:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.l6 r14 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.fa r14 = r14.mo6707f()     // Catch:{ Exception -> 0x01d6 }
            r15 = r19
            android.os.Bundle r14 = r14.mo6970A(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r14 == 0) goto L_0x00ff
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C1957u.f6365f0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo7415s(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00e3
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x00e3
            if (r3 == 0) goto L_0x00e3
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x01d6 }
            r9[r11] = r16     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x01d6 }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x01d6 }
        L_0x00e3:
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            r6.mo7195X(r0, r12, r14)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C1957u.f6330L0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo7415s(r9)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00ff
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.na r6 = r6.f6007n     // Catch:{ Exception -> 0x01d6 }
            r6.mo7260b(r0, r14)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x00ff
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C1957u.f6369h0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo7415s(r9)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x0138
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C1957u.f6367g0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo7415s(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x0138
            if (r3 == 0) goto L_0x0138
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x0138
            if (r14 == 0) goto L_0x012d
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x0138
        L_0x012d:
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01d6 }
            r6.mo7198a0(r9, r14, r15, r13)     // Catch:{ Exception -> 0x01d6 }
        L_0x0138:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x013f
            return
        L_0x013f:
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6771L()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "Activity created with referrer"
            r6.mo6886b(r14, r2)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.l6 r6 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C1957u.f6367g0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo7415s(r14)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x0191
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.measurement.internal.l6 r2 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            r2.mo7195X(r0, r12, r3)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.l6 r2 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.wa r2 = r2.mo6712l()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6330L0     // Catch:{ Exception -> 0x01d6 }
            boolean r2 = r2.mo7415s(r4)     // Catch:{ Exception -> 0x01d6 }
            if (r2 == 0) goto L_0x018a
            com.google.android.gms.measurement.internal.l6 r2 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.na r2 = r2.f6007n     // Catch:{ Exception -> 0x01d6 }
            r2.mo7260b(r0, r3)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x018a
        L_0x017b:
            com.google.android.gms.measurement.internal.l6 r0 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6771L()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.mo6886b(r3, r2)     // Catch:{ Exception -> 0x01d6 }
        L_0x018a:
            com.google.android.gms.measurement.internal.l6 r0 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            r2 = 0
            r0.mo7198a0(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01d6 }
            return
        L_0x0191:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01d6 }
            if (r0 == 0) goto L_0x01ba
        L_0x01b9:
            r11 = 1
        L_0x01ba:
            if (r11 != 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.l6 r0 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6771L()     // Catch:{ Exception -> 0x01d6 }
            r0.mo6885a(r4)     // Catch:{ Exception -> 0x01d6 }
            return
        L_0x01ca:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.l6 r0 = r1.f5947f     // Catch:{ Exception -> 0x01d6 }
            r0.mo7198a0(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01d6 }
        L_0x01d5:
            return
        L_0x01d6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.l6 r2 = r1.f5947f
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo6886b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1833j7.m8620b(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f5947f.mo6709i().mo6772M().mo6885a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f5947f.mo6707f();
                        this.f5947f.mo6706e().mo6703y(new C1869m7(this, bundle == null, data, C1788fa.m8456Z(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                    }
                }
            }
        } catch (Exception e) {
            this.f5947f.mo6709i().mo6764E().mo6886b("Throwable caught in onActivityCreated", e);
        } catch (Throwable th) {
            this.f5947f.mo6858s().mo7349G(activity, bundle);
            throw th;
        }
        this.f5947f.mo6858s().mo7349G(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f5947f.mo6858s().mo7356V(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f5947f.mo6858s().mo7354T(activity);
        C1835j9 u = this.f5947f.mo6860u();
        u.mo6706e().mo6703y(new C1859l9(u, u.mo6708g().mo6585a()));
    }

    public final void onActivityResumed(Activity activity) {
        C1835j9 u = this.f5947f.mo6860u();
        u.mo6706e().mo6703y(new C1823i9(u, u.mo6708g().mo6585a()));
        this.f5947f.mo6858s().mo7348F(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f5947f.mo6858s().mo7355U(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
