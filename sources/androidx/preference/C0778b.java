package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.preference.b */
final class C0778b extends Preference {

    /* renamed from: U */
    private long f3114U;

    C0778b(Context context, List<Preference> list, long j) {
        super(context);
        m3909J0();
        m3910K0(list);
        this.f3114U = j + 1000000;
    }

    /* renamed from: J0 */
    private void m3909J0() {
        mo3845v0(C0810q.expand_button);
        mo3838s0(C0808o.ic_arrow_down_24dp);
        mo3794C0(C0811r.expand_button_title);
        mo3853z0(999);
    }

    /* renamed from: K0 */
    private void m3910K0(List<Preference> list) {
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = null;
        for (Preference next : list) {
            CharSequence H = next.mo3800H();
            boolean z = next instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(H)) {
                arrayList.add((PreferenceGroup) next);
            }
            if (arrayList.contains(next.mo3848x())) {
                if (z) {
                    arrayList.add((PreferenceGroup) next);
                }
            } else if (!TextUtils.isEmpty(H)) {
                if (charSequence == null) {
                    charSequence = H;
                } else {
                    charSequence = mo3831n().getString(C0811r.summary_collapsed_preference_list, new Object[]{charSequence, H});
                }
            }
        }
        mo3767A0(charSequence);
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        super.mo3735W(lVar);
        lVar.mo4008P(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public long mo3837s() {
        return this.f3114U;
    }
}
