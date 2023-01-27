package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: f0 */
    private final Context f3009f0;

    /* renamed from: g0 */
    private final ArrayAdapter f3010g0;

    /* renamed from: h0 */
    private Spinner f3011h0;

    /* renamed from: i0 */
    private final AdapterView.OnItemSelectedListener f3012i0;

    /* renamed from: androidx.preference.DropDownPreference$a */
    class C0748a implements AdapterView.OnItemSelectedListener {
        C0748a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.mo3772S0()[i].toString();
                if (!charSequence.equals(DropDownPreference.this.mo3773T0()) && DropDownPreference.this.mo3819g(charSequence)) {
                    DropDownPreference.this.mo3774V0(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0806m.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3012i0 = new C0748a();
        this.f3009f0 = context;
        this.f3010g0 = mo3748X0();
        m3697Z0();
    }

    /* renamed from: Y0 */
    private int m3696Y0(String str) {
        CharSequence[] S0 = mo3772S0();
        if (str == null || S0 == null) {
            return -1;
        }
        for (int length = S0.length - 1; length >= 0; length--) {
            if (S0[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: Z0 */
    private void m3697Z0() {
        this.f3010g0.clear();
        if (mo3770Q0() != null) {
            for (CharSequence charSequence : mo3770Q0()) {
                this.f3010g0.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo3746Q() {
        super.mo3746Q();
        ArrayAdapter arrayAdapter = this.f3010g0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: W */
    public void mo3735W(C0805l lVar) {
        Spinner spinner = (Spinner) lVar.f3359a.findViewById(C0809p.spinner);
        this.f3011h0 = spinner;
        spinner.setAdapter(this.f3010g0);
        this.f3011h0.setOnItemSelectedListener(this.f3012i0);
        this.f3011h0.setSelection(m3696Y0(mo3773T0()));
        super.mo3735W(lVar);
    }

    /* renamed from: W0 */
    public void mo3747W0(int i) {
        mo3774V0(mo3772S0()[i].toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo3744X() {
        this.f3011h0.performClick();
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public ArrayAdapter mo3748X0() {
        return new ArrayAdapter(this.f3009f0, 17367049);
    }
}
