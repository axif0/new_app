package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0271d;

/* renamed from: androidx.preference.c */
public class C0779c extends C0784f {

    /* renamed from: x0 */
    int f3115x0;

    /* renamed from: y0 */
    private CharSequence[] f3116y0;

    /* renamed from: z0 */
    private CharSequence[] f3117z0;

    /* renamed from: androidx.preference.c$a */
    class C0780a implements DialogInterface.OnClickListener {
        C0780a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0779c cVar = C0779c.this;
            cVar.f3115x0 = i;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: e2 */
    private ListPreference m3913e2() {
        return (ListPreference) mo3930X1();
    }

    /* renamed from: f2 */
    public static C0779c m3914f2(String str) {
        C0779c cVar = new C0779c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.mo3233u1(bundle);
        return cVar;
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f3115x0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f3116y0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f3117z0);
    }

    /* renamed from: b2 */
    public void mo3918b2(boolean z) {
        int i;
        if (z && (i = this.f3115x0) >= 0) {
            String charSequence = this.f3117z0[i].toString();
            ListPreference e2 = m3913e2();
            if (e2.mo3819g(charSequence)) {
                e2.mo3774V0(charSequence);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public void mo3919c2(C0271d.C0272a aVar) {
        super.mo3919c2(aVar);
        aVar.mo823l(this.f3116y0, this.f3115x0, new C0780a());
        aVar.mo821j((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        if (bundle == null) {
            ListPreference e2 = m3913e2();
            if (e2.mo3770Q0() == null || e2.mo3772S0() == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f3115x0 = e2.mo3769P0(e2.mo3773T0());
            this.f3116y0 = e2.mo3770Q0();
            this.f3117z0 = e2.mo3772S0();
            return;
        }
        this.f3115x0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f3116y0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f3117z0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }
}
