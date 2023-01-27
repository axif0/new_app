package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.load.p008o.C1112j;
import com.bumptech.glide.p025q.C1359a;
import com.bumptech.glide.p025q.C1360b;
import com.bumptech.glide.p025q.C1361c;
import com.bumptech.glide.p025q.C1362d;
import com.bumptech.glide.p025q.C1364e;
import com.bumptech.glide.p025q.C1365f;
import com.bumptech.glide.p025q.C1367h;
import com.bumptech.glide.p025q.p026j.C1377h;
import com.bumptech.glide.p025q.p026j.C1378i;
import com.bumptech.glide.p029s.C1394e;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.C1402k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.i */
public class C0977i<TranscodeType> extends C1359a<C0977i<TranscodeType>> implements Cloneable {

    /* renamed from: F */
    private final Context f3871F;

    /* renamed from: G */
    private final C0979j f3872G;

    /* renamed from: H */
    private final Class<TranscodeType> f3873H;

    /* renamed from: I */
    private final C0967d f3874I;

    /* renamed from: J */
    private C0982k<?, ? super TranscodeType> f3875J;

    /* renamed from: K */
    private Object f3876K;

    /* renamed from: L */
    private List<C1364e<TranscodeType>> f3877L;

    /* renamed from: M */
    private C0977i<TranscodeType> f3878M;

    /* renamed from: N */
    private C0977i<TranscodeType> f3879N;

    /* renamed from: O */
    private Float f3880O;

    /* renamed from: P */
    private boolean f3881P = true;

    /* renamed from: Q */
    private boolean f3882Q;

    /* renamed from: R */
    private boolean f3883R;

    /* renamed from: com.bumptech.glide.i$a */
    static /* synthetic */ class C0978a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3884a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3885b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.f[] r0 = com.bumptech.glide.C0969f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3885b = r0
                r1 = 1
                com.bumptech.glide.f r2 = com.bumptech.glide.C0969f.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3885b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.f r3 = com.bumptech.glide.C0969f.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3885b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.f r4 = com.bumptech.glide.C0969f.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3885b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.f r5 = com.bumptech.glide.C0969f.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3884a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f3884a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f3884a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f3884a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f3884a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f3884a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f3884a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f3884a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C0977i.C0978a.<clinit>():void");
        }
    }

    static {
        C1365f fVar = (C1365f) ((C1365f) ((C1365f) new C1365f().mo5792g(C1112j.f4195b)).mo5787b0(C0969f.LOW)).mo5798j0(true);
    }

    @SuppressLint({"CheckResult"})
    protected C0977i(C0963b bVar, C0979j jVar, Class<TranscodeType> cls, Context context) {
        this.f3872G = jVar;
        this.f3873H = cls;
        this.f3871F = context;
        this.f3875J = jVar.mo5105r(cls);
        this.f3874I = bVar.mo5042i();
        m5445w0(jVar.mo5103p());
        mo5085b(jVar.mo5104q());
    }

    /* renamed from: B0 */
    private boolean m5438B0(C1359a<?> aVar, C1361c cVar) {
        return !aVar.mo5773G() && cVar.mo5828j();
    }

    /* renamed from: F0 */
    private C0977i<TranscodeType> m5439F0(Object obj) {
        this.f3876K = obj;
        this.f3882Q = true;
        return this;
    }

    /* renamed from: G0 */
    private C1361c m5440G0(Object obj, C1377h<TranscodeType> hVar, C1364e<TranscodeType> eVar, C1359a<?> aVar, C1362d dVar, C0982k<?, ? super TranscodeType> kVar, C0969f fVar, int i, int i2, Executor executor) {
        Context context = this.f3871F;
        C0967d dVar2 = this.f3874I;
        return C1367h.m6841x(context, dVar2, obj, this.f3876K, this.f3873H, aVar, i, i2, fVar, hVar, eVar, this.f3877L, dVar, dVar2.mo5060f(), kVar.mo5118c(), executor);
    }

    /* renamed from: r0 */
    private C1361c m5441r0(C1377h<TranscodeType> hVar, C1364e<TranscodeType> eVar, C1359a<?> aVar, Executor executor) {
        return m5442s0(new Object(), hVar, eVar, (C1362d) null, this.f3875J, aVar.mo5815y(), aVar.mo5812u(), aVar.mo5811t(), aVar, executor);
    }

    /* renamed from: s0 */
    private C1361c m5442s0(Object obj, C1377h<TranscodeType> hVar, C1364e<TranscodeType> eVar, C1362d dVar, C0982k<?, ? super TranscodeType> kVar, C0969f fVar, int i, int i2, C1359a<?> aVar, Executor executor) {
        C1360b bVar;
        C1360b bVar2;
        if (this.f3879N != null) {
            bVar2 = new C1360b(obj, dVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = dVar;
        }
        C1361c t0 = m5443t0(obj, hVar, eVar, bVar2, kVar, fVar, i, i2, aVar, executor);
        if (bVar == null) {
            return t0;
        }
        int u = this.f3879N.mo5812u();
        int t = this.f3879N.mo5811t();
        if (C1402k.m6991r(i, i2) && !this.f3879N.mo5779P()) {
            u = aVar.mo5812u();
            t = aVar.mo5811t();
        }
        C0977i<TranscodeType> iVar = this.f3879N;
        C1360b bVar3 = bVar;
        bVar3.mo5830q(t0, iVar.m5442s0(obj, hVar, eVar, bVar3, iVar.f3875J, iVar.mo5815y(), u, t, this.f3879N, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [com.bumptech.glide.q.a, com.bumptech.glide.q.a<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.p025q.C1361c m5443t0(java.lang.Object r19, com.bumptech.glide.p025q.p026j.C1377h<TranscodeType> r20, com.bumptech.glide.p025q.C1364e<TranscodeType> r21, com.bumptech.glide.p025q.C1362d r22, com.bumptech.glide.C0982k<?, ? super TranscodeType> r23, com.bumptech.glide.C0969f r24, int r25, int r26, com.bumptech.glide.p025q.C1359a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.i<TranscodeType> r0 = r11.f3878M
            if (r0 == 0) goto L_0x0096
            boolean r1 = r11.f3883R
            if (r1 != 0) goto L_0x008e
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.f3875J
            boolean r0 = r0.f3881P
            if (r0 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            com.bumptech.glide.i<TranscodeType> r0 = r11.f3878M
            boolean r0 = r0.mo5774I()
            if (r0 == 0) goto L_0x0029
            com.bumptech.glide.i<TranscodeType> r0 = r11.f3878M
            com.bumptech.glide.f r0 = r0.mo5815y()
            goto L_0x002d
        L_0x0029:
            com.bumptech.glide.f r0 = r11.m5444v0(r13)
        L_0x002d:
            r15 = r0
            com.bumptech.glide.i<TranscodeType> r0 = r11.f3878M
            int r0 = r0.mo5812u()
            com.bumptech.glide.i<TranscodeType> r1 = r11.f3878M
            int r1 = r1.mo5811t()
            boolean r2 = com.bumptech.glide.p029s.C1402k.m6991r(r25, r26)
            if (r2 == 0) goto L_0x0050
            com.bumptech.glide.i<TranscodeType> r2 = r11.f3878M
            boolean r2 = r2.mo5779P()
            if (r2 != 0) goto L_0x0050
            int r0 = r27.mo5812u()
            int r1 = r27.mo5811t()
        L_0x0050:
            r16 = r0
            r17 = r1
            com.bumptech.glide.q.i r10 = new com.bumptech.glide.q.i
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            com.bumptech.glide.q.c r10 = r0.m5440G0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f3883R = r0
            com.bumptech.glide.i<TranscodeType> r9 = r11.f3878M
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            com.bumptech.glide.q.c r0 = r0.m5442s0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f3883R = r1
            r13.mo5836q(r12, r0)
            return r13
        L_0x008e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0096:
            java.lang.Float r0 = r11.f3880O
            if (r0 == 0) goto L_0x00d6
            com.bumptech.glide.q.i r14 = new com.bumptech.glide.q.i
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.q.c r15 = r0.m5440G0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.bumptech.glide.q.a r0 = r27.clone()
            java.lang.Float r1 = r11.f3880O
            float r1 = r1.floatValue()
            com.bumptech.glide.q.a r4 = r0.mo5797i0(r1)
            com.bumptech.glide.f r7 = r11.m5444v0(r13)
            r0 = r18
            r1 = r19
            com.bumptech.glide.q.c r0 = r0.m5440G0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo5836q(r15, r0)
            return r14
        L_0x00d6:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            com.bumptech.glide.q.c r0 = r0.m5440G0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C0977i.m5443t0(java.lang.Object, com.bumptech.glide.q.j.h, com.bumptech.glide.q.e, com.bumptech.glide.q.d, com.bumptech.glide.k, com.bumptech.glide.f, int, int, com.bumptech.glide.q.a, java.util.concurrent.Executor):com.bumptech.glide.q.c");
    }

    /* renamed from: v0 */
    private C0969f m5444v0(C0969f fVar) {
        int i = C0978a.f3885b[fVar.ordinal()];
        if (i == 1) {
            return C0969f.NORMAL;
        }
        if (i == 2) {
            return C0969f.HIGH;
        }
        if (i == 3 || i == 4) {
            return C0969f.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo5815y());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: w0 */
    private void m5445w0(List<C1364e<Object>> list) {
        for (C1364e<Object> p0 : list) {
            mo5088p0(p0);
        }
    }

    /* renamed from: y0 */
    private <Y extends C1377h<TranscodeType>> Y m5446y0(Y y, C1364e<TranscodeType> eVar, C1359a<?> aVar, Executor executor) {
        C1401j.m6972d(y);
        if (this.f3882Q) {
            C1361c r0 = m5441r0(y, eVar, aVar, executor);
            C1361c g = y.mo5842g();
            if (!r0.mo5823f(g) || m5438B0(aVar, g)) {
                this.f3872G.mo5099o(y);
                y.mo5844j(r0);
                this.f3872G.mo5113y(y, r0);
                return y;
            }
            C1401j.m6972d(g);
            if (!g.isRunning()) {
                g.mo5825h();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: A0 */
    public C1378i<ImageView, TranscodeType> mo5081A0(ImageView imageView) {
        C1359a aVar;
        C1402k.m6974a();
        C1401j.m6972d(imageView);
        if (!mo5778O() && mo5776M() && imageView.getScaleType() != null) {
            switch (C0978a.f3884a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = mo5087e().mo5781T();
                    break;
                case 2:
                case 6:
                    aVar = mo5087e().mo5782U();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = mo5087e().mo5783V();
                    break;
            }
        }
        aVar = this;
        C1378i<ImageView, TranscodeType> a = this.f3874I.mo5055a(imageView, this.f3873H);
        m5446y0(a, (C1364e) null, aVar, C1394e.m6954b());
        return a;
    }

    /* renamed from: C0 */
    public C0977i<TranscodeType> mo5082C0(C1364e<TranscodeType> eVar) {
        this.f3877L = null;
        mo5088p0(eVar);
        return this;
    }

    /* renamed from: D0 */
    public C0977i<TranscodeType> mo5083D0(Object obj) {
        m5439F0(obj);
        return this;
    }

    /* renamed from: E0 */
    public C0977i<TranscodeType> mo5084E0(String str) {
        m5439F0(str);
        return this;
    }

    /* renamed from: p0 */
    public C0977i<TranscodeType> mo5088p0(C1364e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f3877L == null) {
                this.f3877L = new ArrayList();
            }
            this.f3877L.add(eVar);
        }
        return this;
    }

    /* renamed from: q0 */
    public C0977i<TranscodeType> mo5085b(C1359a<?> aVar) {
        C1401j.m6972d(aVar);
        return (C0977i) super.mo5085b(aVar);
    }

    /* renamed from: u0 */
    public C0977i<TranscodeType> mo5087e() {
        C0977i<TranscodeType> iVar = (C0977i) super.clone();
        iVar.f3875J = iVar.f3875J.clone();
        return iVar;
    }

    /* renamed from: x0 */
    public <Y extends C1377h<TranscodeType>> Y mo5091x0(Y y) {
        mo5092z0(y, (C1364e) null, C1394e.m6954b());
        return y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public <Y extends C1377h<TranscodeType>> Y mo5092z0(Y y, C1364e<TranscodeType> eVar, Executor executor) {
        m5446y0(y, eVar, this, executor);
        return y;
    }
}
