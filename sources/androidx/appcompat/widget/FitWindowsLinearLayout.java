package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0424e0;

public class FitWindowsLinearLayout extends LinearLayout implements C0424e0 {

    /* renamed from: f */
    private C0424e0.C0425a f1423f;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0424e0.C0425a aVar = this.f1423f;
        if (aVar != null) {
            aVar.mo924a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0424e0.C0425a aVar) {
        this.f1423f = aVar;
    }
}
