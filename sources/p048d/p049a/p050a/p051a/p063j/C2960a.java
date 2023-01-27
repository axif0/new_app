package p048d.p049a.p050a.p051a.p063j;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p064k.C2971d;

/* renamed from: d.a.a.a.j.a */
public class C2960a extends Fragment {

    /* renamed from: b0 */
    private C2971d f9501b0;

    /* renamed from: J1 */
    public static C2960a m12720J1() {
        return new C2960a();
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9501b0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_about));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C2722R.layout.fragment_about_bracu, viewGroup, false);
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9501b0 = null;
    }
}
