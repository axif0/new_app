package p148g.p189d.p190a.p200b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import p148g.p189d.p190a.p200b.p201h0.C3856d;
import p148g.p189d.p190a.p200b.p201h0.C3858e;
import p148g.p189d.p190a.p200b.p203j0.C3906c;
import p148g.p189d.p190a.p200b.p203j0.C3908e;
import p148g.p189d.p190a.p200b.p212l0.C4049c;
import p148g.p189d.p190a.p200b.p213m0.C4067f;
import p148g.p189d.p190a.p200b.p213m0.C4068g;
import p148g.p189d.p190a.p200b.p219o0.C4162k;
import p148g.p189d.p190a.p200b.p219o0.C4163l;
import p148g.p189d.p190a.p200b.p231s0.C4295e;
import p148g.p189d.p190a.p200b.p231s0.C4303h;

/* renamed from: g.d.a.b.g */
public class C3843g implements C3835d0 {

    /* renamed from: a */
    private final Context f11568a;

    /* renamed from: b */
    private final C3906c<C3908e> f11569b;

    /* renamed from: c */
    private final int f11570c;

    /* renamed from: d */
    private final long f11571d;

    public C3843g(Context context) {
        this(context, (C3906c<C3908e>) null);
    }

    public C3843g(Context context, C3906c<C3908e> cVar) {
        this(context, cVar, 0);
    }

    public C3843g(Context context, C3906c<C3908e> cVar, int i) {
        this(context, cVar, i, 5000);
    }

    public C3843g(Context context, C3906c<C3908e> cVar, int i, long j) {
        this.f11568a = context;
        this.f11569b = cVar;
        this.f11570c = i;
        this.f11571d = j;
    }

    /* renamed from: a */
    public C3829a0[] mo12444a(Handler handler, C4303h hVar, C3858e eVar, C4162k kVar, C4067f fVar) {
        ArrayList arrayList = new ArrayList();
        mo12530g(this.f11568a, this.f11569b, this.f11571d, handler, hVar, this.f11570c, arrayList);
        mo12526c(this.f11568a, this.f11569b, mo12525b(), handler, eVar, this.f11570c, arrayList);
        ArrayList arrayList2 = arrayList;
        mo12529f(this.f11568a, kVar, handler.getLooper(), this.f11570c, arrayList2);
        mo12527d(this.f11568a, fVar, handler.getLooper(), this.f11570c, arrayList2);
        mo12528e(this.f11568a, handler, this.f11570c, arrayList);
        return (C3829a0[]) arrayList.toArray(new C3829a0[arrayList.size()]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3856d[] mo12525b() {
        return new C3856d[0];
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006c] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12526c(android.content.Context r15, p148g.p189d.p190a.p200b.p203j0.C3906c<p148g.p189d.p190a.p200b.p203j0.C3908e> r16, p148g.p189d.p190a.p200b.p201h0.C3856d[] r17, android.os.Handler r18, p148g.p189d.p190a.p200b.p201h0.C3858e r19, int r20, java.util.ArrayList<p148g.p189d.p190a.p200b.C3829a0> r21) {
        /*
            r14 = this;
            r0 = r20
            r9 = r21
            java.lang.String r10 = "DefaultRenderersFactory"
            java.lang.Class<g.d.a.b.h0.d[]> r11 = p148g.p189d.p190a.p200b.p201h0.C3856d[].class
            java.lang.Class<g.d.a.b.h0.e> r12 = p148g.p189d.p190a.p200b.p201h0.C3858e.class
            g.d.a.b.h0.k r13 = new g.d.a.b.h0.k
            g.d.a.b.l0.c r2 = p148g.p189d.p190a.p200b.p212l0.C4049c.f12830a
            g.d.a.b.h0.c r7 = p148g.p189d.p190a.p200b.p201h0.C3855c.m16088a(r15)
            r4 = 1
            r1 = r13
            r3 = r16
            r5 = r18
            r6 = r19
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.add(r13)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            int r1 = r21.size()
            r2 = 2
            if (r0 != r2) goto L_0x002e
            int r1 = r1 + -1
        L_0x002e:
            r0 = 0
            r3 = 3
            r4 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r4] = r12     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r2] = r11     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r0] = r18     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r4] = r19     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            r6[r2] = r17     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            g.d.a.b.a0 r5 = (p148g.p189d.p190a.p200b.C3829a0) r5     // Catch:{ ClassNotFoundException -> 0x0069, Exception -> 0x0060 }
            int r6 = r1 + 1
            r9.add(r1, r5)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x0060 }
            java.lang.String r1 = "Loaded LibopusAudioRenderer."
            android.util.Log.i(r10, r1)     // Catch:{ ClassNotFoundException -> 0x005e, Exception -> 0x0060 }
            goto L_0x006a
        L_0x005e:
            r1 = r6
            goto L_0x0069
        L_0x0060:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0069:
            r6 = r1
        L_0x006a:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r4] = r12     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r2] = r11     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r0] = r18     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r4] = r19     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            r5[r2] = r17     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            g.d.a.b.a0 r1 = (p148g.p189d.p190a.p200b.C3829a0) r1     // Catch:{ ClassNotFoundException -> 0x00a2, Exception -> 0x0099 }
            int r5 = r6 + 1
            r9.add(r6, r1)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0099 }
            java.lang.String r1 = "Loaded LibflacAudioRenderer."
            android.util.Log.i(r10, r1)     // Catch:{ ClassNotFoundException -> 0x0097, Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0097:
            r6 = r5
            goto L_0x00a2
        L_0x0099:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a2:
            r5 = r6
        L_0x00a3:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r6[r4] = r12     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r6[r2] = r11     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r3[r0] = r18     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r3[r4] = r19     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r3[r2] = r17     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.Object r0 = r1.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            g.d.a.b.a0 r0 = (p148g.p189d.p190a.p200b.C3829a0) r0     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            r9.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00ce }
            goto L_0x00d7
        L_0x00ce:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.C3843g.mo12526c(android.content.Context, g.d.a.b.j0.c, g.d.a.b.h0.d[], android.os.Handler, g.d.a.b.h0.e, int, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo12527d(Context context, C4067f fVar, Looper looper, int i, ArrayList<C3829a0> arrayList) {
        arrayList.add(new C4068g(fVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo12528e(Context context, Handler handler, int i, ArrayList<C3829a0> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo12529f(Context context, C4162k kVar, Looper looper, int i, ArrayList<C3829a0> arrayList) {
        arrayList.add(new C4163l(kVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo12530g(Context context, C3906c<C3908e> cVar, long j, Handler handler, C4303h hVar, int i, ArrayList<C3829a0> arrayList) {
        int i2 = i;
        ArrayList<C3829a0> arrayList2 = arrayList;
        arrayList2.add(new C4295e(context, C4049c.f12830a, j, cVar, false, handler, hVar, 50));
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (C3829a0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, C4303h.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, Long.valueOf(j), handler, hVar, 50}));
                Log.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }
}
