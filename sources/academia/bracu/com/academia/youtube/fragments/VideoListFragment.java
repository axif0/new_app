package academia.bracu.com.academia.youtube.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.C0697z;
import com.google.android.youtube.player.C2456c;
import com.google.android.youtube.player.C2457d;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p079t.C3107a;
import p048d.p049a.p050a.p051a.p079t.p080b.C3110b;
import p048d.p049a.p050a.p051a.p079t.p080b.C3111c;
import p048d.p049a.p050a.p051a.p079t.p080b.C3112d;

public class VideoListFragment extends C0697z {

    /* renamed from: m0 */
    private Context f672m0;

    /* renamed from: n0 */
    private C0636d f673n0;

    /* renamed from: K1 */
    public void mo585K1(ListView listView, View view, int i, long j) {
        String S = mo3169S(C2722R.string.DEVELOPER_KEY);
        C3112d dVar = C3111c.f9893a.get(i);
        if (C2456c.m11133f(this.f672m0)) {
            mo3142E1(C2457d.m11136b(this.f673n0, S, dVar.mo10715U(), 0, true, true));
        }
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        this.f672m0 = mo3242y();
        this.f673n0 = mo3215o();
        if (C3111c.f9893a.size() == 0) {
            new C3110b(this, this.f672m0).execute(new Void[0]);
            return;
        }
        new C3110b(mo3215o()).execute(new Void[0]);
        mo3625L1(new C3107a(mo3215o()));
    }
}
