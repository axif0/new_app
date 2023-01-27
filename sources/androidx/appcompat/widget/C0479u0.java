package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p086f.p111h.p112e.p113c.C3279f;

/* renamed from: androidx.appcompat.widget.u0 */
public class C0479u0 {

    /* renamed from: a */
    private final Context f1863a;

    /* renamed from: b */
    private final TypedArray f1864b;

    /* renamed from: c */
    private TypedValue f1865c;

    private C0479u0(Context context, TypedArray typedArray) {
        this.f1863a = context;
        this.f1864b = typedArray;
    }

    /* renamed from: t */
    public static C0479u0 m2146t(Context context, int i, int[] iArr) {
        return new C0479u0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C0479u0 m2147u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0479u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0479u0 m2148v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0479u0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo2343a(int i, boolean z) {
        return this.f1864b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo2344b(int i, int i2) {
        return this.f1864b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p086f.p087a.p088k.p089a.C3133a.m13387c(r2.f1863a, (r0 = r2.f1864b.getResourceId(r3, 0)));
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo2345c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1864b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1864b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1863a
            android.content.res.ColorStateList r0 = p086f.p087a.p088k.p089a.C3133a.m13387c(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1864b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0479u0.mo2345c(int):android.content.res.ColorStateList");
    }

    /* renamed from: d */
    public float mo2346d(int i, float f) {
        return this.f1864b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo2347e(int i, int i2) {
        return this.f1864b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo2348f(int i, int i2) {
        return this.f1864b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1864b.getResourceId(r3, 0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo2349g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1864b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1864b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1863a
            android.graphics.drawable.Drawable r3 = p086f.p087a.p088k.p089a.C3133a.m13388d(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1864b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0479u0.mo2349g(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: h */
    public Drawable mo2350h(int i) {
        int resourceId;
        if (!this.f1864b.hasValue(i) || (resourceId = this.f1864b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0441i.m2009b().mo2163d(this.f1863a, resourceId, true);
    }

    /* renamed from: i */
    public float mo2351i(int i, float f) {
        return this.f1864b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo2352j(int i, int i2, C3279f.C3280a aVar) {
        int resourceId = this.f1864b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1865c == null) {
            this.f1865c = new TypedValue();
        }
        return C3279f.m14128c(this.f1863a, resourceId, this.f1865c, i2, aVar);
    }

    /* renamed from: k */
    public int mo2353k(int i, int i2) {
        return this.f1864b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo2354l(int i, int i2) {
        return this.f1864b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo2355m(int i, int i2) {
        return this.f1864b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo2356n(int i, int i2) {
        return this.f1864b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo2357o(int i) {
        return this.f1864b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo2358p(int i) {
        return this.f1864b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo2359q(int i) {
        return this.f1864b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo2360r() {
        return this.f1864b;
    }

    /* renamed from: s */
    public boolean mo2361s(int i) {
        return this.f1864b.hasValue(i);
    }

    /* renamed from: w */
    public void mo2362w() {
        this.f1864b.recycle();
    }
}
