package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p086f.p111h.p112e.p113c.C3286g;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: Z */
    private final C0746a f3001Z;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C0746a implements CompoundButton.OnCheckedChangeListener {
        C0746a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo3819g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo3904K0(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3001Z = new C0746a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.CheckBoxPreference, i, i2);
        mo3907N0(C3286g.m14153o(obtainStyledAttributes, C0813t.CheckBoxPreference_summaryOn, C0813t.CheckBoxPreference_android_summaryOn));
        mo3906M0(C3286g.m14153o(obtainStyledAttributes, C0813t.CheckBoxPreference_summaryOff, C0813t.CheckBoxPreference_android_summaryOff));
        mo3905L0(C3286g.m14140b(obtainStyledAttributes, C0813t.CheckBoxPreference_disableDependentsState, C0813t.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Q0 */
    private void m3684Q0(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3106U);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f3001Z);
        }
    }

    /* renamed from: R0 */
    private void m3685R0(View view) {
        if (((AccessibilityManager) mo3831n().getSystemService("accessibility")).isEnabled()) {
            m3684Q0(view.findViewById(16908289));
            mo3908O0(view.findViewById(16908304));
        }
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        super.mo3735W(lVar);
        m3684Q0(lVar.mo4005M(16908289));
        mo3909P0(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo3736i0(View view) {
        super.mo3736i0(view);
        m3685R0(view);
    }
}
