package p148g.p325e.p326a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import p148g.p325e.p326a.C5544a;

/* renamed from: g.e.a.m */
public class C5580m extends C5544a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final ThreadLocal<ArrayList<C5580m>> f16110A = new C5583c();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final ThreadLocal<ArrayList<C5580m>> f16111B = new C5584d();
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final ThreadLocal<ArrayList<C5580m>> f16112C = new C5585e();

    /* renamed from: D */
    private static final Interpolator f16113D = new AccelerateDecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static long f16114E = 10;

    /* renamed from: x */
    private static ThreadLocal<C5586f> f16115x = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final ThreadLocal<ArrayList<C5580m>> f16116y = new C5581a();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final ThreadLocal<ArrayList<C5580m>> f16117z = new C5582b();

    /* renamed from: g */
    long f16118g;

    /* renamed from: h */
    long f16119h = -1;

    /* renamed from: i */
    private boolean f16120i = false;

    /* renamed from: j */
    private int f16121j = 0;

    /* renamed from: k */
    private boolean f16122k = false;

    /* renamed from: l */
    private long f16123l;

    /* renamed from: m */
    int f16124m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f16125n = false;

    /* renamed from: o */
    boolean f16126o = false;

    /* renamed from: p */
    private long f16127p = 300;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f16128q = 0;

    /* renamed from: r */
    private int f16129r = 0;

    /* renamed from: s */
    private int f16130s = 1;

    /* renamed from: t */
    private Interpolator f16131t = f16113D;

    /* renamed from: u */
    private ArrayList<C5587g> f16132u = null;

    /* renamed from: v */
    C5576k[] f16133v;

    /* renamed from: w */
    HashMap<String, C5576k> f16134w;

    /* renamed from: g.e.a.m$a */
    static class C5581a extends ThreadLocal<ArrayList<C5580m>> {
        C5581a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C5580m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: g.e.a.m$b */
    static class C5582b extends ThreadLocal<ArrayList<C5580m>> {
        C5582b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C5580m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: g.e.a.m$c */
    static class C5583c extends ThreadLocal<ArrayList<C5580m>> {
        C5583c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C5580m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: g.e.a.m$d */
    static class C5584d extends ThreadLocal<ArrayList<C5580m>> {
        C5584d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C5580m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: g.e.a.m$e */
    static class C5585e extends ThreadLocal<ArrayList<C5580m>> {
        C5585e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C5580m> initialValue() {
            return new ArrayList<>();
        }
    }

    /* renamed from: g.e.a.m$f */
    private static class C5586f extends Handler {
        private C5586f() {
        }

        /* synthetic */ C5586f(C5581a aVar) {
            this();
        }

        public void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) C5580m.f16116y.get();
            ArrayList arrayList2 = (ArrayList) C5580m.f16110A.get();
            int i = message.what;
            if (i == 0) {
                ArrayList arrayList3 = (ArrayList) C5580m.f16117z.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C5580m mVar = (C5580m) arrayList4.get(i2);
                        if (mVar.f16128q == 0) {
                            mVar.m23071N();
                        } else {
                            arrayList2.add(mVar);
                        }
                    }
                }
            } else if (i == 1) {
                z = true;
            } else {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) C5580m.f16112C.get();
            ArrayList arrayList6 = (ArrayList) C5580m.f16111B.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C5580m mVar2 = (C5580m) arrayList2.get(i3);
                if (mVar2.m23067B(currentAnimationTimeMillis)) {
                    arrayList5.add(mVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    C5580m mVar3 = (C5580m) arrayList5.get(i4);
                    mVar3.m23071N();
                    boolean unused = mVar3.f16125n = true;
                    arrayList2.remove(mVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                C5580m mVar4 = (C5580m) arrayList.get(i5);
                if (mVar4.mo16052z(currentAnimationTimeMillis)) {
                    arrayList6.add(mVar4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(mVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    ((C5580m) arrayList6.get(i6)).m23068C();
                }
                arrayList6.clear();
            }
            if (!z) {
                return;
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0, C5580m.f16114E - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    /* renamed from: g.e.a.m$g */
    public interface C5587g {
        /* renamed from: a */
        void mo16064a(C5580m mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean m23067B(long j) {
        if (!this.f16122k) {
            this.f16122k = true;
            this.f16123l = j;
            return false;
        }
        long j2 = j - this.f16123l;
        long j3 = this.f16128q;
        if (j2 <= j3) {
            return false;
        }
        this.f16118g = j - (j2 - j3);
        this.f16124m = 1;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m23068C() {
        ArrayList<C5544a.C5545a> arrayList;
        f16116y.get().remove(this);
        f16117z.get().remove(this);
        f16110A.get().remove(this);
        this.f16124m = 0;
        if (this.f16125n && (arrayList = this.f16030f) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((C5544a.C5545a) arrayList2.get(i)).mo565a(this);
            }
        }
        this.f16125n = false;
    }

    /* renamed from: F */
    public static C5580m m23069F(float... fArr) {
        C5580m mVar = new C5580m();
        mVar.mo15998K(fArr);
        return mVar;
    }

    /* renamed from: M */
    private void m23070M(boolean z) {
        if (Looper.myLooper() != null) {
            this.f16120i = z;
            this.f16121j = 0;
            this.f16124m = 0;
            this.f16122k = false;
            f16117z.get().add(this);
            if (this.f16128q == 0) {
                mo16049G(mo16048D());
                this.f16124m = 0;
                this.f16125n = true;
                ArrayList<C5544a.C5545a> arrayList = this.f16030f;
                if (arrayList != null) {
                    ArrayList arrayList2 = (ArrayList) arrayList.clone();
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((C5544a.C5545a) arrayList2.get(i)).mo567c(this);
                    }
                }
            }
            C5586f fVar = f16115x.get();
            if (fVar == null) {
                fVar = new C5586f((C5581a) null);
                f16115x.set(fVar);
            }
            fVar.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m23071N() {
        ArrayList<C5544a.C5545a> arrayList;
        mo15996E();
        f16116y.get().add(this);
        if (this.f16128q > 0 && (arrayList = this.f16030f) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((C5544a.C5545a) arrayList2.get(i)).mo567c(this);
            }
        }
    }

    /* renamed from: A */
    public C5580m clone() {
        C5580m mVar = (C5580m) super.clone();
        ArrayList<C5587g> arrayList = this.f16132u;
        if (arrayList != null) {
            mVar.f16132u = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mVar.f16132u.add(arrayList.get(i));
            }
        }
        mVar.f16119h = -1;
        mVar.f16120i = false;
        mVar.f16121j = 0;
        mVar.f16126o = false;
        mVar.f16124m = 0;
        mVar.f16122k = false;
        C5576k[] kVarArr = this.f16133v;
        if (kVarArr != null) {
            int length = kVarArr.length;
            mVar.f16133v = new C5576k[length];
            mVar.f16134w = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                C5576k c = kVarArr[i2].clone();
                mVar.f16133v[i2] = c;
                mVar.f16134w.put(c.mo16037g(), c);
            }
        }
        return mVar;
    }

    /* renamed from: D */
    public long mo16048D() {
        if (!this.f16126o || this.f16124m == 0) {
            return 0;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f16118g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo15996E() {
        if (!this.f16126o) {
            for (C5576k i : this.f16133v) {
                i.mo16038i();
            }
            this.f16126o = true;
        }
    }

    /* renamed from: G */
    public void mo16049G(long j) {
        mo15996E();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f16124m != 1) {
            this.f16119h = j;
            this.f16124m = 2;
        }
        this.f16118g = currentAnimationTimeMillis - j;
        mo16052z(currentAnimationTimeMillis);
    }

    /* renamed from: I */
    public C5580m mo15964f(long j) {
        if (j >= 0) {
            this.f16127p = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j);
    }

    /* renamed from: J */
    public void mo16050J(C5579l lVar) {
        C5576k[] kVarArr;
        if (lVar != null && (kVarArr = this.f16133v) != null && kVarArr.length > 0) {
            kVarArr[0].mo16040p(lVar);
        }
    }

    /* renamed from: K */
    public void mo15998K(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            C5576k[] kVarArr = this.f16133v;
            if (kVarArr == null || kVarArr.length == 0) {
                mo16051L(C5576k.m23045l(BuildConfig.FLAVOR, fArr));
            } else {
                kVarArr[0].mo16041q(fArr);
            }
            this.f16126o = false;
        }
    }

    /* renamed from: L */
    public void mo16051L(C5576k... kVarArr) {
        this.f16133v = kVarArr;
        this.f16134w = new HashMap<>(r0);
        for (C5576k kVar : kVarArr) {
            this.f16134w.put(kVar.mo16037g(), kVar);
        }
        this.f16126o = false;
    }

    /* renamed from: g */
    public void mo15965g(Interpolator interpolator) {
        if (interpolator == null) {
            interpolator = new LinearInterpolator();
        }
        this.f16131t = interpolator;
    }

    /* renamed from: i */
    public void mo15966i() {
        m23070M(false);
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f16133v != null) {
            for (int i = 0; i < this.f16133v.length; i++) {
                str = str + "\n    " + this.f16133v[i].toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo16004y(float f) {
        float interpolation = this.f16131t.getInterpolation(f);
        for (C5576k b : this.f16133v) {
            b.mo16033b(interpolation);
        }
        ArrayList<C5587g> arrayList = this.f16132u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f16132u.get(i).mo16064a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16052z(long r10) {
        /*
            r9 = this;
            int r0 = r9.f16124m
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001a
            r9.f16124m = r3
            long r4 = r9.f16119h
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r9.f16118g = r10
            goto L_0x001a
        L_0x0012:
            long r4 = r10 - r4
            r9.f16118g = r4
            r4 = -1
            r9.f16119h = r4
        L_0x001a:
            int r0 = r9.f16124m
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L_0x0023
            if (r0 == r4) goto L_0x0023
            goto L_0x0082
        L_0x0023:
            long r6 = r9.f16127p
            r0 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0032
            long r1 = r9.f16118g
            long r10 = r10 - r1
            float r10 = (float) r10
            float r11 = (float) r6
            float r10 = r10 / r11
            goto L_0x0034
        L_0x0032:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0034:
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0077
            int r11 = r9.f16121j
            int r1 = r9.f16129r
            if (r11 < r1) goto L_0x0047
            r11 = -1
            if (r1 != r11) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            float r10 = java.lang.Math.min(r10, r0)
            goto L_0x0078
        L_0x0047:
            java.util.ArrayList<g.e.a.a$a> r11 = r9.f16030f
            if (r11 == 0) goto L_0x0060
            int r11 = r11.size()
            r1 = 0
        L_0x0050:
            if (r1 >= r11) goto L_0x0060
            java.util.ArrayList<g.e.a.a$a> r2 = r9.f16030f
            java.lang.Object r2 = r2.get(r1)
            g.e.a.a$a r2 = (p148g.p325e.p326a.C5544a.C5545a) r2
            r2.mo566b(r9)
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0060:
            int r11 = r9.f16130s
            if (r11 != r4) goto L_0x0069
            boolean r11 = r9.f16120i
            r11 = r11 ^ r3
            r9.f16120i = r11
        L_0x0069:
            int r11 = r9.f16121j
            int r1 = (int) r10
            int r11 = r11 + r1
            r9.f16121j = r11
            float r10 = r10 % r0
            long r1 = r9.f16118g
            long r3 = r9.f16127p
            long r1 = r1 + r3
            r9.f16118g = r1
        L_0x0077:
            r3 = 0
        L_0x0078:
            boolean r11 = r9.f16120i
            if (r11 == 0) goto L_0x007e
            float r10 = r0 - r10
        L_0x007e:
            r9.mo16004y(r10)
            r5 = r3
        L_0x0082:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p325e.p326a.C5580m.mo16052z(long):boolean");
    }
}
