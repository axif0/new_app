package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.C0610j;
import p086f.p087a.C3123a;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3402s;

/* renamed from: androidx.appcompat.widget.r */
public class C0472r extends RadioButton implements C0610j, C3402s {

    /* renamed from: f */
    private final C0433h f1843f;

    /* renamed from: g */
    private final C0423e f1844g;

    /* renamed from: h */
    private final C0497x f1845h;

    public C0472r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.radioButtonStyle);
    }

    public C0472r(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0433h hVar = new C0433h(this);
        this.f1843f = hVar;
        hVar.mo2119e(attributeSet, i);
        C0423e eVar = new C0423e(this);
        this.f1844g = eVar;
        eVar.mo2037e(attributeSet, i);
        C0497x xVar = new C0497x(this);
        this.f1845h = xVar;
        xVar.mo2445m(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            eVar.mo2034b();
        }
        C0497x xVar = this.f1845h;
        if (xVar != null) {
            xVar.mo2435b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0433h hVar = this.f1843f;
        return hVar != null ? hVar.mo2116b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0433h hVar = this.f1843f;
        if (hVar != null) {
            return hVar.mo2117c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0433h hVar = this.f1843f;
        if (hVar != null) {
            return hVar.mo2118d();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C3133a.m13388d(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0433h hVar = this.f1843f;
        if (hVar != null) {
            hVar.mo2120f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1844g;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0433h hVar = this.f1843f;
        if (hVar != null) {
            hVar.mo2121g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0433h hVar = this.f1843f;
        if (hVar != null) {
            hVar.mo2122h(mode);
        }
    }
}
