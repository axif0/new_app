package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0588a;
import androidx.core.widget.C0602c;

/* renamed from: androidx.appcompat.widget.h */
class C0433h {

    /* renamed from: a */
    private final CompoundButton f1699a;

    /* renamed from: b */
    private ColorStateList f1700b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1701c = null;

    /* renamed from: d */
    private boolean f1702d = false;

    /* renamed from: e */
    private boolean f1703e = false;

    /* renamed from: f */
    private boolean f1704f;

    C0433h(CompoundButton compoundButton) {
        this.f1699a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2115a() {
        Drawable a = C0602c.m2871a(this.f1699a);
        if (a == null) {
            return;
        }
        if (this.f1702d || this.f1703e) {
            Drawable mutate = C0588a.m2775r(a).mutate();
            if (this.f1702d) {
                C0588a.m2772o(mutate, this.f1700b);
            }
            if (this.f1703e) {
                C0588a.m2773p(mutate, this.f1701c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1699a.getDrawableState());
            }
            this.f1699a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0602c.m2871a(r2.f1699a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo2116b(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1699a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0602c.m2871a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0433h.mo2116b(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2117c() {
        return this.f1700b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2118d() {
        return this.f1701c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[SYNTHETIC, Splitter:B:12:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[Catch:{ all -> 0x0092 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2119e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f1699a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p086f.p087a.C3132j.CompoundButton
            r2 = 0
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.C0479u0.m2148v(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f1699a
            android.content.Context r4 = r3.getContext()
            int[] r5 = p086f.p087a.C3132j.CompoundButton
            android.content.res.TypedArray r7 = r0.mo2360r()
            r9 = 0
            r6 = r11
            r8 = r12
            p086f.p111h.p122m.C3403t.m14639g0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = p086f.p087a.C3132j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo2361s(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0040
            int r11 = p086f.p087a.C3132j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0092 }
            int r11 = r0.mo2356n(r11, r2)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0040
            android.widget.CompoundButton r12 = r10.f1699a     // Catch:{ NotFoundException -> 0x0040 }
            android.widget.CompoundButton r1 = r10.f1699a     // Catch:{ NotFoundException -> 0x0040 }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x0040 }
            android.graphics.drawable.Drawable r11 = p086f.p087a.p088k.p089a.C3133a.m13388d(r1, r11)     // Catch:{ NotFoundException -> 0x0040 }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0040 }
            r11 = 1
            goto L_0x0041
        L_0x0040:
            r11 = 0
        L_0x0041:
            if (r11 != 0) goto L_0x0062
            int r11 = p086f.p087a.C3132j.CompoundButton_android_button     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo2361s(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0062
            int r11 = p086f.p087a.C3132j.CompoundButton_android_button     // Catch:{ all -> 0x0092 }
            int r11 = r0.mo2356n(r11, r2)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0062
            android.widget.CompoundButton r12 = r10.f1699a     // Catch:{ all -> 0x0092 }
            android.widget.CompoundButton r1 = r10.f1699a     // Catch:{ all -> 0x0092 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0092 }
            android.graphics.drawable.Drawable r11 = p086f.p087a.p088k.p089a.C3133a.m13388d(r1, r11)     // Catch:{ all -> 0x0092 }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x0092 }
        L_0x0062:
            int r11 = p086f.p087a.C3132j.CompoundButton_buttonTint     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo2361s(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0075
            android.widget.CompoundButton r11 = r10.f1699a     // Catch:{ all -> 0x0092 }
            int r12 = p086f.p087a.C3132j.CompoundButton_buttonTint     // Catch:{ all -> 0x0092 }
            android.content.res.ColorStateList r12 = r0.mo2345c(r12)     // Catch:{ all -> 0x0092 }
            androidx.core.widget.C0602c.m2873c(r11, r12)     // Catch:{ all -> 0x0092 }
        L_0x0075:
            int r11 = p086f.p087a.C3132j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo2361s(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x008e
            android.widget.CompoundButton r11 = r10.f1699a     // Catch:{ all -> 0x0092 }
            int r12 = p086f.p087a.C3132j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0092 }
            r1 = -1
            int r12 = r0.mo2353k(r12, r1)     // Catch:{ all -> 0x0092 }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.C0418c0.m1905e(r12, r1)     // Catch:{ all -> 0x0092 }
            androidx.core.widget.C0602c.m2874d(r11, r12)     // Catch:{ all -> 0x0092 }
        L_0x008e:
            r0.mo2362w()
            return
        L_0x0092:
            r11 = move-exception
            r0.mo2362w()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0433h.mo2119e(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2120f() {
        if (this.f1704f) {
            this.f1704f = false;
            return;
        }
        this.f1704f = true;
        mo2115a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2121g(ColorStateList colorStateList) {
        this.f1700b = colorStateList;
        this.f1702d = true;
        mo2115a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2122h(PorterDuff.Mode mode) {
        this.f1701c = mode;
        this.f1703e = true;
        mo2115a();
    }
}
