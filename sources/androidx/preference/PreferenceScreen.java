package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.C0798j;
import p086f.p111h.p112e.p113c.C3286g;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: b0 */
    private boolean f3080b0 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C3286g.m14139a(context, C0806m.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public boolean mo3871Q0() {
        return false;
    }

    /* renamed from: V0 */
    public boolean mo3882V0() {
        return this.f3080b0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo3744X() {
        C0798j.C0800b e;
        if (mo3839t() == null && mo3836r() == null && mo3870P0() != 0 && (e = mo3795D().mo3988e()) != null) {
            e.mo3947h(this);
        }
    }
}
