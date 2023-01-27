package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C0601b;
import androidx.core.widget.C0608i;
import androidx.core.widget.C0611k;
import p086f.p087a.C3123a;
import p086f.p111h.p122m.C3402s;

/* renamed from: androidx.appcompat.widget.f */
public class C0426f extends Button implements C3402s, C0601b, C0611k {

    /* renamed from: f */
    private final C0423e f1667f;

    /* renamed from: g */
    private final C0497x f1668g;

    public C0426f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.buttonStyle);
    }

    public C0426f(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0423e eVar = new C0423e(this);
        this.f1667f = eVar;
        eVar.mo2037e(attributeSet, i);
        C0497x xVar = new C0497x(this);
        this.f1668g = xVar;
        xVar.mo2445m(attributeSet, i);
        this.f1668g.mo2435b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            eVar.mo2034b();
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2435b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0601b.f2517a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            return xVar.mo2437e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0601b.f2517a) {
            return super.getAutoSizeMinTextSize();
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            return xVar.mo2438f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0601b.f2517a) {
            return super.getAutoSizeStepGranularity();
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            return xVar.mo2439g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0601b.f2517a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0497x xVar = this.f1668g;
        return xVar != null ? xVar.mo2440h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0601b.f2517a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            return xVar.mo2441i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1668g.mo2442j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1668g.mo2443k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2447o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0497x xVar = this.f1668g;
        if (xVar != null && !C0601b.f2517a && xVar.mo2444l()) {
            this.f1668g.mo2436c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0601b.f2517a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2451s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0601b.f2517a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2452t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0601b.f2517a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2453u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0608i.m2905s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2450r(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1667f;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1668g.mo2454v(colorStateList);
        this.f1668g.mo2435b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1668g.mo2455w(mode);
        this.f1668g.mo2435b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2449q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0601b.f2517a) {
            super.setTextSize(i, f);
            return;
        }
        C0497x xVar = this.f1668g;
        if (xVar != null) {
            xVar.mo2456z(i, f);
        }
    }
}
