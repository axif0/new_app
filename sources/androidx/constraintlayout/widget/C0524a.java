package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p086f.p103f.p107b.p108k.C3223a;
import p086f.p103f.p107b.p108k.C3229e;

/* renamed from: androidx.constraintlayout.widget.a */
public class C0524a extends C0528c {

    /* renamed from: m */
    private int f2110m;

    /* renamed from: n */
    private int f2111n;

    /* renamed from: o */
    private C3223a f2112o;

    public C0524a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2455o(p086f.p103f.p107b.p108k.C3229e r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.f2111n = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L_0x0016
            int r7 = r5.f2110m
            if (r7 != r3) goto L_0x0013
        L_0x0010:
            r5.f2111n = r1
            goto L_0x0028
        L_0x0013:
            if (r7 != r2) goto L_0x0028
        L_0x0015:
            goto L_0x001c
        L_0x0016:
            int r7 = r5.f2110m
            if (r8 == 0) goto L_0x0022
            if (r7 != r3) goto L_0x001f
        L_0x001c:
            r5.f2111n = r0
            goto L_0x0028
        L_0x001f:
            if (r7 != r2) goto L_0x0028
            goto L_0x0010
        L_0x0022:
            if (r7 != r3) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            if (r7 != r2) goto L_0x0028
            goto L_0x0015
        L_0x0028:
            boolean r7 = r6 instanceof p086f.p103f.p107b.p108k.C3223a
            if (r7 == 0) goto L_0x0033
            f.f.b.k.a r6 = (p086f.p103f.p107b.p108k.C3223a) r6
            int r7 = r5.f2111n
            r6.mo11254M0(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0524a.m2455o(f.f.b.k.e, int, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo2615g(AttributeSet attributeSet) {
        super.mo2615g(attributeSet);
        this.f2112o = new C3223a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0544k.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0544k.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0544k.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2112o.mo11253L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0544k.ConstraintLayout_Layout_barrierMargin) {
                    this.f2112o.mo11255N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f2132i = this.f2112o;
        mo2632m();
    }

    public int getMargin() {
        return this.f2112o.mo11251J0();
    }

    public int getType() {
        return this.f2110m;
    }

    /* renamed from: h */
    public void mo2618h(C3229e eVar, boolean z) {
        m2455o(eVar, this.f2110m, z);
    }

    /* renamed from: n */
    public boolean mo2619n() {
        return this.f2112o.mo11249H0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2112o.mo11253L0(z);
    }

    public void setDpMargin(int i) {
        C3223a aVar = this.f2112o;
        aVar.mo11255N0((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2112o.mo11255N0(i);
    }

    public void setType(int i) {
        this.f2110m = i;
    }
}
