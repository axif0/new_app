package p148g.p189d.p190a.p252d.p269y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import p086f.p111h.p112e.p113c.C3279f;
import p148g.p189d.p190a.p252d.C5006l;

/* renamed from: g.d.a.d.y.d */
public class C5047d {

    /* renamed from: a */
    public final float f15030a;

    /* renamed from: b */
    public final ColorStateList f15031b;

    /* renamed from: c */
    public final int f15032c;

    /* renamed from: d */
    public final int f15033d;

    /* renamed from: e */
    public final String f15034e;

    /* renamed from: f */
    public final ColorStateList f15035f;

    /* renamed from: g */
    public final float f15036g;

    /* renamed from: h */
    public final float f15037h;

    /* renamed from: i */
    public final float f15038i;

    /* renamed from: j */
    private final int f15039j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f15040k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Typeface f15041l;

    /* renamed from: g.d.a.d.y.d$a */
    class C5048a extends C3279f.C3280a {

        /* renamed from: a */
        final /* synthetic */ C5051f f15042a;

        C5048a(C5051f fVar) {
            this.f15042a = fVar;
        }

        /* renamed from: c */
        public void mo2457c(int i) {
            boolean unused = C5047d.this.f15040k = true;
            this.f15042a.mo7993a(i);
        }

        /* renamed from: d */
        public void mo2458d(Typeface typeface) {
            C5047d dVar = C5047d.this;
            Typeface unused = dVar.f15041l = Typeface.create(typeface, dVar.f15032c);
            boolean unused2 = C5047d.this.f15040k = true;
            this.f15042a.mo7994b(C5047d.this.f15041l, false);
        }
    }

    /* renamed from: g.d.a.d.y.d$b */
    class C5049b extends C5051f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f15044a;

        /* renamed from: b */
        final /* synthetic */ C5051f f15045b;

        C5049b(TextPaint textPaint, C5051f fVar) {
            this.f15044a = textPaint;
            this.f15045b = fVar;
        }

        /* renamed from: a */
        public void mo7993a(int i) {
            this.f15045b.mo7993a(i);
        }

        /* renamed from: b */
        public void mo7994b(Typeface typeface, boolean z) {
            C5047d.this.mo15133k(this.f15044a, typeface);
            this.f15045b.mo7994b(typeface, z);
        }
    }

    public C5047d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5006l.TextAppearance);
        this.f15030a = obtainStyledAttributes.getDimension(C5006l.TextAppearance_android_textSize, 0.0f);
        this.f15031b = C5046c.m21335a(context, obtainStyledAttributes, C5006l.TextAppearance_android_textColor);
        C5046c.m21335a(context, obtainStyledAttributes, C5006l.TextAppearance_android_textColorHint);
        C5046c.m21335a(context, obtainStyledAttributes, C5006l.TextAppearance_android_textColorLink);
        this.f15032c = obtainStyledAttributes.getInt(C5006l.TextAppearance_android_textStyle, 0);
        this.f15033d = obtainStyledAttributes.getInt(C5006l.TextAppearance_android_typeface, 1);
        int e = C5046c.m21339e(obtainStyledAttributes, C5006l.TextAppearance_fontFamily, C5006l.TextAppearance_android_fontFamily);
        this.f15039j = obtainStyledAttributes.getResourceId(e, 0);
        this.f15034e = obtainStyledAttributes.getString(e);
        obtainStyledAttributes.getBoolean(C5006l.TextAppearance_textAllCaps, false);
        this.f15035f = C5046c.m21335a(context, obtainStyledAttributes, C5006l.TextAppearance_android_shadowColor);
        this.f15036g = obtainStyledAttributes.getFloat(C5006l.TextAppearance_android_shadowDx, 0.0f);
        this.f15037h = obtainStyledAttributes.getFloat(C5006l.TextAppearance_android_shadowDy, 0.0f);
        this.f15038i = obtainStyledAttributes.getFloat(C5006l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m21344d() {
        String str;
        if (this.f15041l == null && (str = this.f15034e) != null) {
            this.f15041l = Typeface.create(str, this.f15032c);
        }
        if (this.f15041l == null) {
            int i = this.f15033d;
            this.f15041l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f15041l = Typeface.create(this.f15041l, this.f15032c);
        }
    }

    /* renamed from: e */
    public Typeface mo15127e() {
        m21344d();
        return this.f15041l;
    }

    /* renamed from: f */
    public Typeface mo15128f(Context context) {
        if (this.f15040k) {
            return this.f15041l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b = C3279f.m14127b(context, this.f15039j);
                this.f15041l = b;
                if (b != null) {
                    this.f15041l = Typeface.create(b, this.f15032c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f15034e, e);
            }
        }
        m21344d();
        this.f15040k = true;
        return this.f15041l;
    }

    /* renamed from: g */
    public void mo15129g(Context context, TextPaint textPaint, C5051f fVar) {
        mo15133k(textPaint, mo15127e());
        mo15130h(context, new C5049b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo15130h(Context context, C5051f fVar) {
        if (C5050e.m21356a()) {
            mo15128f(context);
        } else {
            m21344d();
        }
        if (this.f15039j == 0) {
            this.f15040k = true;
        }
        if (this.f15040k) {
            fVar.mo7994b(this.f15041l, true);
            return;
        }
        try {
            C3279f.m14129d(context, this.f15039j, new C5048a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f15040k = true;
            fVar.mo7993a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f15034e, e);
            this.f15040k = true;
            fVar.mo7993a(-3);
        }
    }

    /* renamed from: i */
    public void mo15131i(Context context, TextPaint textPaint, C5051f fVar) {
        mo15132j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f15031b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f15038i;
        float f2 = this.f15036g;
        float f3 = this.f15037h;
        ColorStateList colorStateList2 = this.f15035f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void mo15132j(Context context, TextPaint textPaint, C5051f fVar) {
        if (C5050e.m21356a()) {
            mo15133k(textPaint, mo15128f(context));
        } else {
            mo15129g(context, textPaint, fVar);
        }
    }

    /* renamed from: k */
    public void mo15133k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f15032c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f15030a);
    }
}
