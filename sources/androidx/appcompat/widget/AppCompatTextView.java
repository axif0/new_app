package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0601b;
import androidx.core.widget.C0608i;
import androidx.core.widget.C0611k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p114f.C3292d;
import p086f.p111h.p120k.C3330c;
import p086f.p111h.p122m.C3402s;

public class AppCompatTextView extends TextView implements C3402s, C0611k, C0601b {

    /* renamed from: f */
    private final C0423e f1407f;

    /* renamed from: g */
    private final C0497x f1408g;

    /* renamed from: h */
    private final C0495w f1409h;

    /* renamed from: i */
    private Future<C3330c> f1410i;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0423e eVar = new C0423e(this);
        this.f1407f = eVar;
        eVar.mo2037e(attributeSet, i);
        C0497x xVar = new C0497x(this);
        this.f1408g = xVar;
        xVar.mo2445m(attributeSet, i);
        this.f1408g.mo2435b();
        this.f1409h = new C0495w(this);
    }

    /* renamed from: c */
    private void m1678c() {
        Future<C3330c> future = this.f1410i;
        if (future != null) {
            try {
                this.f1410i = null;
                C0608i.m2902p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            eVar.mo2034b();
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2435b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0601b.f2517a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            return xVar.mo2437e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0601b.f2517a) {
            return super.getAutoSizeMinTextSize();
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            return xVar.mo2438f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0601b.f2517a) {
            return super.getAutoSizeStepGranularity();
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            return xVar.mo2439g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0601b.f2517a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0497x xVar = this.f1408g;
        return xVar != null ? xVar.mo2440h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0601b.f2517a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            return xVar.mo2441i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0608i.m2888b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0608i.m2889c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1408g.mo2442j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1408g.mo2443k();
    }

    public CharSequence getText() {
        m1678c();
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1409h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.w r0 = r2.f1409h
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo2433a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public C3330c.C3331a getTextMetricsParamsCompat() {
        return C0608i.m2893g(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0447k.m2038a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2447o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1678c();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0497x xVar = this.f1408g;
        if (xVar != null && !C0601b.f2517a && xVar.mo2444l()) {
            this.f1408g.mo2436c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0601b.f2517a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2451s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0601b.f2517a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2452t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0601b.f2517a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2453u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2448p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2448p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C3133a.m13388d(context, i) : null;
        Drawable d2 = i2 != 0 ? C3133a.m13388d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C3133a.m13388d(context, i3) : null;
        if (i4 != 0) {
            drawable = C3133a.m13388d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2448p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2448p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C3133a.m13388d(context, i) : null;
        Drawable d2 = i2 != 0 ? C3133a.m13388d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C3133a.m13388d(context, i3) : null;
        if (i4 != 0) {
            drawable = C3133a.m13388d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2448p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2448p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0608i.m2905s(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0608i.m2899m(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0608i.m2900n(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0608i.m2901o(this, i);
    }

    public void setPrecomputedText(C3330c cVar) {
        C0608i.m2902p(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1407f;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1408g.mo2454v(colorStateList);
        this.f1408g.mo2435b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1408g.mo2455w(mode);
        this.f1408g.mo2435b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2449q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0495w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1409h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.mo2434b(textClassifier);
        }
    }

    public void setTextFuture(Future<C3330c> future) {
        this.f1410i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C3330c.C3331a aVar) {
        C0608i.m2904r(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0601b.f2517a) {
            super.setTextSize(i, f);
            return;
        }
        C0497x xVar = this.f1408g;
        if (xVar != null) {
            xVar.mo2456z(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C3292d.m14181a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }
}
