package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0271d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.preference.d */
public class C0781d extends C0784f {

    /* renamed from: A0 */
    CharSequence[] f3119A0;

    /* renamed from: x0 */
    Set<String> f3120x0 = new HashSet();

    /* renamed from: y0 */
    boolean f3121y0;

    /* renamed from: z0 */
    CharSequence[] f3122z0;

    /* renamed from: androidx.preference.d$a */
    class C0782a implements DialogInterface.OnMultiChoiceClickListener {
        C0782a() {
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean z3;
            C0781d dVar = C0781d.this;
            if (z) {
                z2 = dVar.f3121y0;
                z3 = dVar.f3120x0.add(dVar.f3119A0[i].toString());
            } else {
                z2 = dVar.f3121y0;
                z3 = dVar.f3120x0.remove(dVar.f3119A0[i].toString());
            }
            dVar.f3121y0 = z3 | z2;
        }
    }

    /* renamed from: e2 */
    private MultiSelectListPreference m3919e2() {
        return (MultiSelectListPreference) mo3930X1();
    }

    /* renamed from: f2 */
    public static C0781d m3920f2(String str) {
        C0781d dVar = new C0781d();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        dVar.mo3233u1(bundle);
        return dVar;
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f3120x0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f3121y0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f3122z0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f3119A0);
    }

    /* renamed from: b2 */
    public void mo3918b2(boolean z) {
        if (z && this.f3121y0) {
            MultiSelectListPreference e2 = m3919e2();
            if (e2.mo3819g(this.f3120x0)) {
                e2.mo3784S0(this.f3120x0);
            }
        }
        this.f3121y0 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public void mo3919c2(C0271d.C0272a aVar) {
        super.mo3919c2(aVar);
        int length = this.f3119A0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f3120x0.contains(this.f3119A0[i].toString());
        }
        aVar.mo818g(this.f3122z0, zArr, new C0782a());
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        if (bundle == null) {
            MultiSelectListPreference e2 = m3919e2();
            if (e2.mo3781P0() == null || e2.mo3782Q0() == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f3120x0.clear();
            this.f3120x0.addAll(e2.mo3783R0());
            this.f3121y0 = false;
            this.f3122z0 = e2.mo3781P0();
            this.f3119A0 = e2.mo3782Q0();
            return;
        }
        this.f3120x0.clear();
        this.f3120x0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f3121y0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f3122z0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f3119A0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }
}
