package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import p048d.p049a.p050a.p051a.p054e.p055a.C2827d;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p066m.C2986a;

/* renamed from: academia.bracu.com.academia.common.fragments.y */
public class C0134y extends Fragment {

    /* renamed from: b0 */
    private C2971d f478b0;

    /* renamed from: c0 */
    private C0636d f479c0;

    /* renamed from: d0 */
    private Context f480d0;

    /* renamed from: J1 */
    public static C0134y m485J1() {
        return new C0134y();
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        TextView textView = (TextView) view.findViewById(C2722R.C2724id.addressTitle);
        textView.setText(Html.fromHtml("<b>University Address :</b>"));
        textView.setPadding(15, 20, 0, 0);
        TextView textView2 = (TextView) view.findViewById(C2722R.C2724id.addressLine1);
        textView2.setText(Html.fromHtml("66 Mohakhali"));
        textView2.setPadding(15, 0, 0, 0);
        TextView textView3 = (TextView) view.findViewById(C2722R.C2724id.addressLine2);
        textView3.setText(Html.fromHtml("Dhaka 1212"));
        textView3.setPadding(15, 0, 0, 0);
        TextView textView4 = (TextView) view.findViewById(C2722R.C2724id.addressLine3);
        textView4.setText(Html.fromHtml("Bangladesh"));
        textView4.setPadding(15, 0, 0, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2986a(mo3169S(C2722R.string.information_desk), "info@bracu.ac.bd", "+880-2-9844051 (Ext. 4003)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.admission_label), "admissions@bracu.ac.bd", "+880-2-9844051 (Ext. 4036)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.academic_records), "academic.records@bracu.ac.bd", "+880-2-9844051 (Ext. 4011)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.university_medical_centre), "doctor@bracu.ac.bd", "+880-2-9844051 (Ext. 4016)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.university_library), "librarian@bracu.ac.bd", "+880-2-9844051 (Ext. 4051)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.office_career_services_alumni_relations), "csoadmin@bracu.ac.bd", "+880-2-9844051 (Ext. 4055)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.office_of_communications), "communications@bracu.ac.bd", "+880-2-9844051 (Ext. 4045)"));
        arrayList.add(new C2986a(mo3169S(C2722R.string.university_registrar), "registrar@bracu.ac.bd", "+880-2-9844051 (Ext. 4008)"));
        ((ListView) view.findViewById(C2722R.C2724id.lv_contact_list)).setAdapter(new C2827d(this.f479c0, this.f480d0, C2722R.layout.rv_contact_item, arrayList));
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f478b0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_contacts));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_contacts, viewGroup, false);
        this.f479c0 = mo3215o();
        this.f480d0 = mo3242y();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f478b0 = null;
    }
}
