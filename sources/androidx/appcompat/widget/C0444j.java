package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.C0608i;
import p086f.p087a.C3123a;
import p086f.p111h.p122m.C3402s;

/* renamed from: androidx.appcompat.widget.j */
public class C0444j extends EditText implements C3402s {

    /* renamed from: f */
    private final C0423e f1754f;

    /* renamed from: g */
    private final C0497x f1755g;

    /* renamed from: h */
    private final C0495w f1756h;

    public C0444j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.editTextStyle);
    }

    public C0444j(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0423e eVar = new C0423e(this);
        this.f1754f = eVar;
        eVar.mo2037e(attributeSet, i);
        C0497x xVar = new C0497x(this);
        this.f1755g = xVar;
        xVar.mo2445m(attributeSet, i);
        this.f1755g.mo2435b();
        this.f1756h = new C0495w(this);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            eVar.mo2034b();
        }
        C0497x xVar = this.f1755g;
        if (xVar != null) {
            xVar.mo2435b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            return eVar.mo2035c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            return eVar.mo2036d();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1756h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.w r0 = r2.f1756h
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.mo2433a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0444j.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0447k.m2038a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            eVar.mo2038f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            eVar.mo2039g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0608i.m2905s(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            eVar.mo2041i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0423e eVar = this.f1754f;
        if (eVar != null) {
            eVar.mo2042j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0497x xVar = this.f1755g;
        if (xVar != null) {
            xVar.mo2449q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0495w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1756h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.mo2434b(textClassifier);
        }
    }
}
