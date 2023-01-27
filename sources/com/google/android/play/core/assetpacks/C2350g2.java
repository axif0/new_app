package com.google.android.play.core.assetpacks;

import android.content.Context;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.g2 */
final class C2350g2 {

    /* renamed from: c */
    private static final C5100f f7773c = new C5100f("PackageStateCache");

    /* renamed from: a */
    private final Context f7774a;

    /* renamed from: b */
    private int f7775b = -1;

    C2350g2(Context context) {
        this.f7774a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo9151a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f7775b     // Catch:{ all -> 0x0029 }
            r1 = -1
            if (r0 != r1) goto L_0x0025
            r0 = 0
            android.content.Context r1 = r3.f7774a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r3.f7774a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r3.f7775b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0025
        L_0x001c:
            g.d.a.e.a.c.f r1 = f7773c     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0029 }
            r1.mo15205e(r2, r0)     // Catch:{ all -> 0x0029 }
        L_0x0025:
            int r0 = r3.f7775b     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2350g2.mo9151a():int");
    }
}
