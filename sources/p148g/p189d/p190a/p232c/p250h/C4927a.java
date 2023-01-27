package p148g.p189d.p190a.p232c.p250h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1691n;
import com.google.android.gms.common.util.C1693p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import p148g.p189d.p190a.p232c.p237d.p238o.C4384a;

/* renamed from: g.d.a.c.h.a */
public class C4927a {

    /* renamed from: l */
    private static ScheduledExecutorService f14733l;

    /* renamed from: a */
    private final Object f14734a;

    /* renamed from: b */
    private final PowerManager.WakeLock f14735b;

    /* renamed from: c */
    private WorkSource f14736c;

    /* renamed from: d */
    private final int f14737d;

    /* renamed from: e */
    private final String f14738e;

    /* renamed from: f */
    private final String f14739f;

    /* renamed from: g */
    private final Context f14740g;

    /* renamed from: h */
    private boolean f14741h;

    /* renamed from: i */
    private final Map<String, Integer[]> f14742i;

    /* renamed from: j */
    private int f14743j;

    /* renamed from: k */
    private AtomicInteger f14744k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4927a(Context context, int i, String str) {
        this(context, i, str, (String) null, context == null ? null : context.getPackageName());
    }

    private C4927a(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, (String) null, str3, (String) null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C4927a(Context context, int i, String str, String str2, String str3, String str4) {
        this.f14734a = this;
        this.f14741h = true;
        this.f14742i = new HashMap();
        Collections.synchronizedSet(new HashSet());
        this.f14744k = new AtomicInteger(0);
        C1658o.m7846k(context, "WakeLock: context must not be null");
        C1658o.m7842g(str, "WakeLock: wakeLockName must not be empty");
        this.f14737d = i;
        this.f14739f = null;
        this.f14740g = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f14738e = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f14738e = str;
        }
        this.f14735b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C1693p.m7976c(context)) {
            WorkSource a = C1693p.m7974a(context, C1691n.m7971a(str3) ? context.getPackageName() : str3);
            this.f14736c = a;
            if (a != null && C1693p.m7976c(this.f14740g)) {
                WorkSource workSource = this.f14736c;
                if (workSource != null) {
                    workSource.add(a);
                } else {
                    this.f14736c = a;
                }
                try {
                    this.f14735b.setWorkSource(this.f14736c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f14733l == null) {
            f14733l = C4384a.m18614a().mo13712a();
        }
    }

    /* renamed from: d */
    private final String m20890d(String str) {
        return this.f14741h ? !TextUtils.isEmpty(str) ? str : this.f14739f : this.f14739f;
    }

    /* renamed from: e */
    private final List<String> m20891e() {
        return C1693p.m7975b(this.f14736c);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m20892f(int i) {
        if (this.f14735b.isHeld()) {
            try {
                this.f14735b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f14738e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.f14735b.isHeld();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f14743j == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C1676d.m7927a().mo6582c(r13.f14740g, com.google.android.gms.common.stats.C1675c.m7924a(r13.f14735b, r6), 7, r13.f14738e, r6, (java.lang.String) null, r13.f14737d, m20891e(), r14);
        r13.f14743j++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14855a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f14744k
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m20890d(r0)
            java.lang.Object r0 = r13.f14734a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14742i     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.f14743j     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f14735b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14742i     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.f14743j = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.f14741h     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14742i     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14742i     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.f14741h     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.f14743j     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C1676d.m7927a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.f14740g     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f14735b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.C1675c.m7924a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f14738e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f14737d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.m20891e()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.mo6582c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.f14743j     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.f14743j = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f14735b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = f14733l
            g.d.a.c.h.b r1 = new g.d.a.c.h.b
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p250h.C4927a.mo14855a(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r12.f14743j == 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.google.android.gms.common.stats.C1676d.m7927a().mo6581b(r12.f14740g, com.google.android.gms.common.stats.C1675c.m7924a(r12.f14735b, r6), 8, r12.f14738e, r6, (java.lang.String) null, r12.f14737d, m20891e());
        r12.f14743j--;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14856b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f14744k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f14738e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L_0x0019:
            r0 = 0
            java.lang.String r6 = r12.m20890d(r0)
            java.lang.Object r0 = r12.f14734a
            monitor-enter(r0)
            boolean r1 = r12.f14741h     // Catch:{ all -> 0x007e }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f14742i     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x007e }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0050
        L_0x0033:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            if (r2 != r10) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f14742i     // Catch:{ all -> 0x007e }
            r1.remove(r6)     // Catch:{ all -> 0x007e }
            r1 = 1
            goto L_0x0050
        L_0x0042:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r1[r11] = r2     // Catch:{ all -> 0x007e }
            goto L_0x0031
        L_0x0050:
            if (r1 != 0) goto L_0x005a
        L_0x0052:
            boolean r1 = r12.f14741h     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0079
            int r1 = r12.f14743j     // Catch:{ all -> 0x007e }
            if (r1 != r10) goto L_0x0079
        L_0x005a:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C1676d.m7927a()     // Catch:{ all -> 0x007e }
            android.content.Context r2 = r12.f14740g     // Catch:{ all -> 0x007e }
            android.os.PowerManager$WakeLock r3 = r12.f14735b     // Catch:{ all -> 0x007e }
            java.lang.String r3 = com.google.android.gms.common.stats.C1675c.m7924a(r3, r6)     // Catch:{ all -> 0x007e }
            r4 = 8
            java.lang.String r5 = r12.f14738e     // Catch:{ all -> 0x007e }
            r7 = 0
            int r8 = r12.f14737d     // Catch:{ all -> 0x007e }
            java.util.List r9 = r12.m20891e()     // Catch:{ all -> 0x007e }
            r1.mo6581b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007e }
            int r1 = r12.f14743j     // Catch:{ all -> 0x007e }
            int r1 = r1 - r10
            r12.f14743j = r1     // Catch:{ all -> 0x007e }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            r12.m20892f(r11)
            return
        L_0x007e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x0081:
            throw r1
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p232c.p250h.C4927a.mo14856b():void");
    }

    /* renamed from: c */
    public void mo14857c(boolean z) {
        this.f14735b.setReferenceCounted(z);
        this.f14741h = z;
    }
}
