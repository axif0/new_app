package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p086f.p111h.p112e.p113c.C3286g;

public abstract class DialogPreference extends Preference {

    /* renamed from: U */
    private CharSequence f3003U;

    /* renamed from: V */
    private CharSequence f3004V;

    /* renamed from: W */
    private Drawable f3005W;

    /* renamed from: X */
    private CharSequence f3006X;

    /* renamed from: Y */
    private CharSequence f3007Y;

    /* renamed from: Z */
    private int f3008Z;

    /* renamed from: androidx.preference.DialogPreference$a */
    public interface C0747a {
        /* renamed from: e */
        <T extends Preference> T mo3745e(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3286g.m14139a(context, C0806m.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0813t.DialogPreference, i, i2);
        String o = C3286g.m14153o(obtainStyledAttributes, C0813t.DialogPreference_dialogTitle, C0813t.DialogPreference_android_dialogTitle);
        this.f3003U = o;
        if (o == null) {
            this.f3003U = mo3800H();
        }
        this.f3004V = C3286g.m14153o(obtainStyledAttributes, C0813t.DialogPreference_dialogMessage, C0813t.DialogPreference_android_dialogMessage);
        this.f3005W = C3286g.m14141c(obtainStyledAttributes, C0813t.DialogPreference_dialogIcon, C0813t.DialogPreference_android_dialogIcon);
        this.f3006X = C3286g.m14153o(obtainStyledAttributes, C0813t.DialogPreference_positiveButtonText, C0813t.DialogPreference_android_positiveButtonText);
        this.f3007Y = C3286g.m14153o(obtainStyledAttributes, C0813t.DialogPreference_negativeButtonText, C0813t.DialogPreference_android_negativeButtonText);
        this.f3008Z = C3286g.m14152n(obtainStyledAttributes, C0813t.DialogPreference_dialogLayout, C0813t.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J0 */
    public Drawable mo3738J0() {
        return this.f3005W;
    }

    /* renamed from: K0 */
    public int mo3739K0() {
        return this.f3008Z;
    }

    /* renamed from: L0 */
    public CharSequence mo3740L0() {
        return this.f3004V;
    }

    /* renamed from: M0 */
    public CharSequence mo3741M0() {
        return this.f3003U;
    }

    /* renamed from: N0 */
    public CharSequence mo3742N0() {
        return this.f3007Y;
    }

    /* renamed from: O0 */
    public CharSequence mo3743O0() {
        return this.f3006X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo3744X() {
        mo3795D().mo4001s(this);
    }
}
