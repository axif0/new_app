package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C2074b;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p054e.p055a.C2830e;
import p048d.p049a.p050a.p051a.p054e.p056b.C2832a;
import p048d.p049a.p050a.p051a.p064k.C2973f;
import p048d.p049a.p050a.p051a.p078s.C3100m;

/* renamed from: academia.bracu.com.academia.common.fragments.b0 */
public class C0096b0 extends C2074b {

    /* renamed from: s0 */
    public static final String f400s0 = C0096b0.class.getSimpleName();

    /* renamed from: q0 */
    private int f401q0 = 1;

    /* renamed from: r0 */
    private C2973f f402r0;

    /* renamed from: academia.bracu.com.academia.common.fragments.b0$a */
    public interface C0097a {
        /* renamed from: i */
        void mo363i(int i);
    }

    /* renamed from: d2 */
    public static C0096b0 m376d2(int i) {
        C0096b0 b0Var = new C0096b0();
        Bundle bundle = new Bundle();
        bundle.putInt("column-count", i);
        b0Var.mo3233u1(bundle);
        return b0Var;
    }

    /* renamed from: b2 */
    public /* synthetic */ void mo360b2(int i) {
        this.f402r0.mo302f(i);
        mo3284L1();
    }

    /* renamed from: c2 */
    public /* synthetic */ void mo361c2(View view) {
        mo3284L1();
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2973f) {
            this.f402r0 = (C2973f) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnMenuItemClickListener");
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        if (mo3237w() != null) {
            this.f401q0 = mo3237w().getInt("column-count");
        }
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2722R.layout.fragment_miscellaneous_list, viewGroup, false);
        Context context = inflate.getContext();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C2722R.C2724id.rv_miscellaneous_list);
        recyclerView.mo4191h(new C3100m(mo3158M().getDrawable(C2722R.C2723drawable.rv_horizontal_divider_gray)));
        int i = this.f401q0;
        if (i <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, i));
        }
        recyclerView.setAdapter(new C2830e(new C2832a(context).mo10164b(), new C0104f(this)));
        inflate.findViewById(C2722R.C2724id.imv_action_close).setOnClickListener(new C0102e(this));
        return inflate;
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f402r0 = null;
    }
}
