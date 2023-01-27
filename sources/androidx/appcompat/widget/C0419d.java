package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.C0608i;
import p086f.p087a.C3123a;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3402s;

/* renamed from: androidx.appcompat.widget.d */
public class C0419d extends AutoCompleteTextView implements C3402s {

    /* renamed from: h */
    private static final int[] f1642h = {16843126};

    /* renamed from: f */
    private final C0423e f1643f;

    /* renamed from: g */
    private final C0497x f1644g;

    public C0419d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.autoCompleteTextViewStyle);
    }

    public C0419d(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0479u0 v = C0479u0.m2148v(getContext(), attributeSet, f1642h, i, 0);
        if (v.mo2361s(0)) {
            setDropDownBackgroundDrawable(v.mo2349g(0));
        }
        v.mo2362w();
        C0423e eVar = new C0423e(this);
        this.f1643f = eVar;
        eVar.mo2037e(attributeSet, i);
        C0497x xVar = new C0497x(this);
        this.f1644g = xVar;
        xVar.mo2445m(attributeSet, i);
        this.f1644g.mo2435b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            eVar.mo2034b();
        }
        C0497x xVar = this.f1644g;
        if (xVar != null) {
            xVar.mo2435b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0447k.m2038a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0608i.m2905s(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C3133a.m13388d(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1643f;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0497x xVar = this.f1644g;
        if (xVar != null) {
            xVar.mo2449q(context, i);
        }
    }
}
