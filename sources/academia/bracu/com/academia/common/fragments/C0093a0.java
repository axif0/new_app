package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p066m.C2987b;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: academia.bracu.com.academia.common.fragments.a0 */
public class C0093a0 extends Fragment {

    /* renamed from: b0 */
    private C2971d f395b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public Context f396c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public List<C2987b> f397d0 = new ArrayList();

    /* renamed from: academia.bracu.com.academia.common.fragments.a0$a */
    private class C0094a extends ArrayAdapter<C2987b> {
        C0094a() {
            super(C0093a0.this.f396c0, C2722R.layout.academia_link_item, C0093a0.this.f397d0);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0093a0.this.mo3143F().inflate(C2722R.layout.academia_link_item, viewGroup, false);
            }
            C2987b bVar = (C2987b) C0093a0.this.f397d0.get(i);
            ((TextView) view.findViewById(C2722R.C2724id.link_desc)).setText(bVar.mo10325d());
            ((TextView) view.findViewById(C2722R.C2724id.link_text)).setText(bVar.mo10322a());
            return view;
        }
    }

    /* renamed from: M1 */
    public static C0093a0 m369M1() {
        return new C0093a0();
    }

    /* renamed from: L1 */
    public /* synthetic */ void mo357L1(AdapterView adapterView, View view, int i, long j) {
        C2987b bVar = this.f397d0.get(i);
        if (bVar != null && !bVar.mo10322a().isEmpty()) {
            C3101n.m13325t(this.f396c0, bVar.mo10322a());
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f397d0.add(new C2987b("BRAC University website", "http://www.bracu.ac.bd", (int) C2722R.C2724id.id_bracu_website));
        this.f397d0.add(new C2987b("Ayesha Abed Library website", "http://library.bracu.ac.bd", (int) C2722R.C2724id.id_library));
        this.f397d0.add(new C2987b(mo3169S(C2722R.string.text_admission), "http://www.bracu.ac.bd/admissions", (int) C2722R.C2724id.id_admissions));
        this.f397d0.add(new C2987b(mo3169S(C2722R.string.apply_online), "http://admissions.bracu.ac.bd/academia/authentication/login", (int) C2722R.C2724id.id_apply));
        this.f397d0.add(new C2987b("University Grants Commission, Bangladesh", "http://www.ugc.gov.bd/", (int) C2722R.C2724id.id_ugc));
        this.f397d0.add(new C2987b("Ministry of Education, Bangladesh", "http://www.moedu.gov.bd/", (int) C2722R.C2724id.id_ministry));
        this.f397d0.add(new C2987b("BRAC", "http://www.brac.net/", (int) C2722R.C2724id.id_brac_net));
        this.f397d0.add(new C2987b("BRAC BANK", "http://www.bracbank.com/", (int) C2722R.C2724id.id_brac_bank));
        this.f397d0.add(new C2987b("BRAC ENTERPRISES", "http://www.brac.net/brac-enterprises/", (int) C2722R.C2724id.id_brac_enterprize));
        ListView listView = (ListView) view.findViewById(C2722R.C2724id.lv_links_list);
        listView.setOnItemClickListener(new C0100d(this));
        listView.setAdapter(new C0094a());
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f395b0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_links));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_links, viewGroup, false);
        this.f396c0 = mo3242y();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f395b0 = null;
    }
}
