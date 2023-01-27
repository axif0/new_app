package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p086f.p111h.p112e.p113c.C3286g;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: Z */
    private final C0773a f3098Z;

    /* renamed from: a0 */
    private CharSequence f3099a0;

    /* renamed from: b0 */
    private CharSequence f3100b0;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C0773a implements CompoundButton.OnCheckedChangeListener {
        C0773a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo3819g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo3904K0(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.switchPreferenceStyle, 16843629));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3098Z = new C0773a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.SwitchPreference, i, i2);
        mo3907N0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreference_summaryOn, C0813t.SwitchPreference_android_summaryOn));
        mo3906M0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreference_summaryOff, C0813t.SwitchPreference_android_summaryOff));
        mo3898R0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreference_switchTextOn, C0813t.SwitchPreference_android_switchTextOn));
        mo3897Q0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreference_switchTextOff, C0813t.SwitchPreference_android_switchTextOff));
        mo3905L0(C3286g.m14140b(obtainStyledAttributes, C0813t.SwitchPreference_disableDependentsState, C0813t.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S0 */
    private void m3875S0(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3106U);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f3099a0);
            switchR.setTextOff(this.f3100b0);
            switchR.setOnCheckedChangeListener(this.f3098Z);
        }
    }

    /* renamed from: T0 */
    private void m3876T0(View view) {
        if (((AccessibilityManager) mo3831n().getSystemService("accessibility")).isEnabled()) {
            m3875S0(view.findViewById(16908352));
            mo3908O0(view.findViewById(16908304));
        }
    }

    /* renamed from: Q0 */
    public void mo3897Q0(CharSequence charSequence) {
        this.f3100b0 = charSequence;
        mo3746Q();
    }

    /* renamed from: R0 */
    public void mo3898R0(CharSequence charSequence) {
        this.f3099a0 = charSequence;
        mo3746Q();
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        super.mo3735W(lVar);
        m3875S0(lVar.mo4005M(16908352));
        mo3909P0(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo3736i0(View view) {
        super.mo3736i0(view);
        m3876T0(view);
    }
}
