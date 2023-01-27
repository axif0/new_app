package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p086f.p111h.p112e.p113c.C3286g;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: Z */
    private final C0774a f3102Z;

    /* renamed from: a0 */
    private CharSequence f3103a0;

    /* renamed from: b0 */
    private CharSequence f3104b0;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C0774a implements CompoundButton.OnCheckedChangeListener {
        C0774a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo3819g(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo3904K0(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3102Z = new C0774a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.SwitchPreferenceCompat, i, i2);
        mo3907N0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreferenceCompat_summaryOn, C0813t.SwitchPreferenceCompat_android_summaryOn));
        mo3906M0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreferenceCompat_summaryOff, C0813t.SwitchPreferenceCompat_android_summaryOff));
        mo3901R0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreferenceCompat_switchTextOn, C0813t.SwitchPreferenceCompat_android_switchTextOn));
        mo3900Q0(C3286g.m14153o(obtainStyledAttributes, C0813t.SwitchPreferenceCompat_switchTextOff, C0813t.SwitchPreferenceCompat_android_switchTextOff));
        mo3905L0(C3286g.m14140b(obtainStyledAttributes, C0813t.SwitchPreferenceCompat_disableDependentsState, C0813t.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S0 */
    private void m3881S0(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f3106U);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f3103a0);
            switchCompat.setTextOff(this.f3104b0);
            switchCompat.setOnCheckedChangeListener(this.f3102Z);
        }
    }

    /* renamed from: T0 */
    private void m3882T0(View view) {
        if (((AccessibilityManager) mo3831n().getSystemService("accessibility")).isEnabled()) {
            m3881S0(view.findViewById(C0809p.switchWidget));
            mo3908O0(view.findViewById(16908304));
        }
    }

    /* renamed from: Q0 */
    public void mo3900Q0(CharSequence charSequence) {
        this.f3104b0 = charSequence;
        mo3746Q();
    }

    /* renamed from: R0 */
    public void mo3901R0(CharSequence charSequence) {
        this.f3103a0 = charSequence;
        mo3746Q();
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        super.mo3735W(lVar);
        m3881S0(lVar.mo4005M(C0809p.switchWidget));
        mo3909P0(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo3736i0(View view) {
        super.mo3736i0(view);
        m3882T0(view);
    }
}
