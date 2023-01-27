package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.Fragment;
import com.google.android.youtube.player.C2452a;
import com.google.android.youtube.player.C2453b;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p064k.C2971d;

/* renamed from: academia.bracu.com.academia.common.fragments.h0 */
public class C0110h0 extends Fragment {

    /* renamed from: b0 */
    private C2971d f429b0;

    /* renamed from: c0 */
    private C0636d f430c0;

    /* renamed from: d0 */
    private Context f431d0;

    /* renamed from: J1 */
    public static C0110h0 m429J1() {
        return new C0110h0();
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        C2453b b = C2452a.m11125b(this.f431d0);
        if (b != C2453b.SUCCESS) {
            try {
                b.mo9300e(this.f430c0, 0).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f429b0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_videos));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_youtube_videos, viewGroup, false);
        this.f430c0 = mo3215o();
        this.f431d0 = mo3242y();
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f429b0 = null;
    }
}
