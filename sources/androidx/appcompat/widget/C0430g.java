package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C0608i;
import p086f.p087a.p088k.p089a.C3133a;

/* renamed from: androidx.appcompat.widget.g */
public class C0430g extends CheckedTextView {

    /* renamed from: g */
    private static final int[] f1680g = {16843016};

    /* renamed from: f */
    private final C0497x f1681f;

    public C0430g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0430g(Context context, AttributeSet attributeSet, int i) {
        super(C0473r0.m2138b(context), attributeSet, i);
        C0469p0.m2126a(this, getContext());
        C0497x xVar = new C0497x(this);
        this.f1681f = xVar;
        xVar.mo2445m(attributeSet, i);
        this.f1681f.mo2435b();
        C0479u0 v = C0479u0.m2148v(getContext(), attributeSet, f1680g, i, 0);
        setCheckMarkDrawable(v.mo2349g(0));
        v.mo2362w();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0497x xVar = this.f1681f;
        if (xVar != null) {
            xVar.mo2435b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0447k.m2038a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C3133a.m13388d(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0608i.m2905s(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0497x xVar = this.f1681f;
        if (xVar != null) {
            xVar.mo2449q(context, i);
        }
    }
}
