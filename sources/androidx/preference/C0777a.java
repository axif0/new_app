package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* renamed from: androidx.preference.a */
public class C0777a extends C0784f {

    /* renamed from: x0 */
    private EditText f3112x0;

    /* renamed from: y0 */
    private CharSequence f3113y0;

    /* renamed from: e2 */
    private EditTextPreference m3902e2() {
        return (EditTextPreference) mo3930X1();
    }

    /* renamed from: f2 */
    public static C0777a m3903f2(String str) {
        C0777a aVar = new C0777a();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        aVar.mo3233u1(bundle);
        return aVar;
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f3113y0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public boolean mo3916Y1() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public void mo3917Z1(View view) {
        super.mo3917Z1(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f3112x0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f3112x0.setText(this.f3113y0);
            EditText editText2 = this.f3112x0;
            editText2.setSelection(editText2.getText().length());
            if (m3902e2().mo3752P0() != null) {
                m3902e2().mo3752P0().mo3759a(this.f3112x0);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* renamed from: b2 */
    public void mo3918b2(boolean z) {
        if (z) {
            String obj = this.f3112x0.getText().toString();
            EditTextPreference e2 = m3902e2();
            if (e2.mo3819g(obj)) {
                e2.mo3754R0(obj);
            }
        }
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        this.f3113y0 = bundle == null ? m3902e2().mo3753Q0() : bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }
}
