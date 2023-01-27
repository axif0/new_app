package academia.bracu.com.academia.common.fragments;

import academia.bracu.com.academia.common.activities.CafeteriaLocationsActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p064k.C2971d;

/* renamed from: academia.bracu.com.academia.common.fragments.u */
public class C0123u extends Fragment {

    /* renamed from: b0 */
    private C2971d f445b0;

    /* renamed from: academia.bracu.com.academia.common.fragments.u$a */
    class C0124a implements View.OnClickListener {
        C0124a() {
        }

        public void onClick(View view) {
            C0123u.this.mo3142E1(new Intent(C0123u.this.mo3242y(), CafeteriaLocationsActivity.class));
        }
    }

    /* renamed from: J1 */
    public static C0123u m440J1() {
        return new C0123u();
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        ((TextView) view.findViewById(C2722R.C2724id.cafe_header)).setText(Html.fromHtml(mo3169S(C2722R.string.cafe_header)));
        ((TextView) view.findViewById(C2722R.C2724id.cafe_schedule)).setText(Html.fromHtml(mo3169S(C2722R.string.cafe_schedule)));
        ((Button) view.findViewById(C2722R.C2724id.button_location)).setOnClickListener(new C0124a());
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f445b0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_cafeteria_title));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_cafeteria, viewGroup, false);
        mo3242y();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f445b0 = null;
    }
}
