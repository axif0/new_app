package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import p086f.p111h.p112e.C3267a;
import p086f.p111h.p112e.p113c.C3286g;
import p086f.p111h.p122m.p123c0.C3369c;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: E0 */
    public boolean mo3751E0() {
        return !super.mo3804M();
    }

    /* renamed from: M */
    public boolean mo3804M() {
        return false;
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        TextView textView;
        super.mo3735W(lVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            lVar.f3359a.setAccessibilityHeading(true);
        } else if (i < 21) {
            TypedValue typedValue = new TypedValue();
            if (mo3831n().getTheme().resolveAttribute(C0806m.colorAccent, typedValue, true) && (textView = (TextView) lVar.mo4005M(16908310)) != null && textView.getCurrentTextColor() == C3267a.m14074d(mo3831n(), C0807n.preference_fallback_accent_color)) {
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Deprecated
    /* renamed from: b0 */
    public void mo3815b0(C3369c cVar) {
        C3369c.C3372c r;
        super.mo3815b0(cVar);
        if (Build.VERSION.SDK_INT < 28 && (r = cVar.mo11648r()) != null) {
            cVar.mo11626e0(C3369c.C3372c.m14527f(r.mo11672c(), r.mo11673d(), r.mo11670a(), r.mo11671b(), true, r.mo11674e()));
        }
    }
}
