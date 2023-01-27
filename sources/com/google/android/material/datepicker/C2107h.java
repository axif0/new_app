package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C0909k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p086f.p111h.p121l.C3345d;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.p123c0.C3369c;
import p148g.p189d.p190a.p252d.C4998d;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5001g;
import p148g.p189d.p190a.p252d.C5002h;
import p148g.p189d.p190a.p252d.C5004j;

/* renamed from: com.google.android.material.datepicker.h */
public final class C2107h<S> extends C2135p<S> {

    /* renamed from: m0 */
    static final Object f6978m0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n0 */
    static final Object f6979n0 = "NAVIGATION_PREV_TAG";

    /* renamed from: o0 */
    static final Object f6980o0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: p0 */
    static final Object f6981p0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0 */
    private int f6982c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C2102d<S> f6983d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C2096a f6984e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C2128l f6985f0;

    /* renamed from: g0 */
    private C2118k f6986g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2101c f6987h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public RecyclerView f6988i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public RecyclerView f6989j0;

    /* renamed from: k0 */
    private View f6990k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public View f6991l0;

    /* renamed from: com.google.android.material.datepicker.h$a */
    class C2108a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f6992f;

        C2108a(int i) {
            this.f6992f = i;
        }

        public void run() {
            C2107h.this.f6989j0.mo4225q1(this.f6992f);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    class C2109b extends C3350a {
        C2109b(C2107h hVar) {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            super.mo2997g(view, cVar);
            cVar.mo11625d0((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    class C2110c extends C2136q {

        /* renamed from: I */
        final /* synthetic */ int f6994I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2110c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f6994I = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M1 */
        public void mo4058M1(RecyclerView.C0823a0 a0Var, int[] iArr) {
            if (this.f6994I == 0) {
                iArr[0] = C2107h.this.f6989j0.getWidth();
                iArr[1] = C2107h.this.f6989j0.getWidth();
                return;
            }
            iArr[0] = C2107h.this.f6989j0.getHeight();
            iArr[1] = C2107h.this.f6989j0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    class C2111d implements C2119l {
        C2111d() {
        }

        /* renamed from: a */
        public void mo8221a(long j) {
            if (C2107h.this.f6984e0.mo8173f().mo8187u(j)) {
                C2107h.this.f6983d0.mo8193V(j);
                Iterator it = C2107h.this.f7059b0.iterator();
                while (it.hasNext()) {
                    ((C2134o) it.next()).mo8229a(C2107h.this.f6983d0.mo8192J());
                }
                C2107h.this.f6989j0.getAdapter().mo4360j();
                if (C2107h.this.f6988i0 != null) {
                    C2107h.this.f6988i0.getAdapter().mo4360j();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$e */
    class C2112e extends RecyclerView.C0842n {

        /* renamed from: a */
        private final Calendar f6997a = C2139s.m9957l();

        /* renamed from: b */
        private final Calendar f6998b = C2139s.m9957l();

        C2112e() {
        }

        /* renamed from: g */
        public void mo4416g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0823a0 a0Var) {
            if ((recyclerView.getAdapter() instanceof C2140t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C2140t tVar = (C2140t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C3345d next : C2107h.this.f6983d0.mo8197t()) {
                    F f = next.f10638a;
                    if (!(f == null || next.f10639b == null)) {
                        this.f6997a.setTimeInMillis(((Long) f).longValue());
                        this.f6998b.setTimeInMillis(((Long) next.f10639b).longValue());
                        int D = tVar.mo8272D(this.f6997a.get(1));
                        int D2 = tVar.mo8272D(this.f6998b.get(1));
                        View C = gridLayoutManager.mo4051C(D);
                        View C2 = gridLayoutManager.mo4051C(D2);
                        int X2 = D / gridLayoutManager.mo4027X2();
                        int X22 = D2 / gridLayoutManager.mo4027X2();
                        int i = X2;
                        while (i <= X22) {
                            View C3 = gridLayoutManager.mo4051C(gridLayoutManager.mo4027X2() * i);
                            if (C3 != null) {
                                canvas.drawRect((float) (i == X2 ? C.getLeft() + (C.getWidth() / 2) : 0), (float) (C3.getTop() + C2107h.this.f6987h0.f6968d.mo8189c()), (float) (i == X22 ? C2.getLeft() + (C2.getWidth() / 2) : recyclerView.getWidth()), (float) (C3.getBottom() - C2107h.this.f6987h0.f6968d.mo8188b()), C2107h.this.f6987h0.f6972h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$f */
    class C2113f extends C3350a {
        C2113f() {
        }

        /* renamed from: g */
        public void mo2997g(View view, C3369c cVar) {
            C2107h hVar;
            int i;
            super.mo2997g(view, cVar);
            if (C2107h.this.f6991l0.getVisibility() == 0) {
                hVar = C2107h.this;
                i = C5004j.mtrl_picker_toggle_to_year_selection;
            } else {
                hVar = C2107h.this;
                i = C5004j.mtrl_picker_toggle_to_day_selection;
            }
            cVar.mo11640m0(hVar.mo3169S(i));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$g */
    class C2114g extends RecyclerView.C0852t {

        /* renamed from: a */
        final /* synthetic */ C2131n f7001a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f7002b;

        C2114g(C2131n nVar, MaterialButton materialButton) {
            this.f7001a = nVar;
            this.f7002b = materialButton;
        }

        /* renamed from: a */
        public void mo4527a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f7002b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: b */
        public void mo4528b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager Z1 = C2107h.this.mo8216Z1();
            int Z12 = i < 0 ? Z1.mo4065Z1() : Z1.mo4068c2();
            C2128l unused = C2107h.this.f6985f0 = this.f7001a.mo8262C(Z12);
            this.f7002b.setText(this.f7001a.mo8263D(Z12));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    class C2115h implements View.OnClickListener {
        C2115h() {
        }

        public void onClick(View view) {
            C2107h.this.mo8219e2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$i */
    class C2116i implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2131n f7005f;

        C2116i(C2131n nVar) {
            this.f7005f = nVar;
        }

        public void onClick(View view) {
            int Z1 = C2107h.this.mo8216Z1().mo4065Z1() + 1;
            if (Z1 < C2107h.this.f6989j0.getAdapter().mo3963e()) {
                C2107h.this.mo8217c2(this.f7005f.mo8262C(Z1));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$j */
    class C2117j implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C2131n f7007f;

        C2117j(C2131n nVar) {
            this.f7007f = nVar;
        }

        public void onClick(View view) {
            int c2 = C2107h.this.mo8216Z1().mo4068c2() - 1;
            if (c2 >= 0) {
                C2107h.this.mo8217c2(this.f7007f.mo8262C(c2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$k */
    enum C2118k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.h$l */
    interface C2119l {
        /* renamed from: a */
        void mo8221a(long j);
    }

    /* renamed from: S1 */
    private void m9849S1(View view, C2131n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C5000f.month_navigation_fragment_toggle);
        materialButton.setTag(f6981p0);
        C3403t.m14643i0(materialButton, new C2113f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C5000f.month_navigation_previous);
        materialButton2.setTag(f6979n0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C5000f.month_navigation_next);
        materialButton3.setTag(f6980o0);
        this.f6990k0 = view.findViewById(C5000f.mtrl_calendar_year_selector_frame);
        this.f6991l0 = view.findViewById(C5000f.mtrl_calendar_day_selector_frame);
        mo8218d2(C2118k.DAY);
        materialButton.setText(this.f6985f0.mo8239l());
        this.f6989j0.mo4199k(new C2114g(nVar, materialButton));
        materialButton.setOnClickListener(new C2115h());
        materialButton3.setOnClickListener(new C2116i(nVar));
        materialButton2.setOnClickListener(new C2117j(nVar));
    }

    /* renamed from: T1 */
    private RecyclerView.C0842n m9850T1() {
        return new C2112e();
    }

    /* renamed from: Y1 */
    static int m9851Y1(Context context) {
        return context.getResources().getDimensionPixelSize(C4998d.mtrl_calendar_day_height);
    }

    /* renamed from: a2 */
    static <T> C2107h<T> m9852a2(C2102d<T> dVar, int i, C2096a aVar) {
        C2107h<T> hVar = new C2107h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.mo8177i());
        hVar.mo3233u1(bundle);
        return hVar;
    }

    /* renamed from: b2 */
    private void m9853b2(int i) {
        this.f6989j0.post(new C2108a(i));
    }

    /* renamed from: L0 */
    public void mo541L0(Bundle bundle) {
        super.mo541L0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f6982c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6983d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6984e0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6985f0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U1 */
    public C2096a mo8212U1() {
        return this.f6984e0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public C2101c mo8213V1() {
        return this.f6987h0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public C2128l mo8214W1() {
        return this.f6985f0;
    }

    /* renamed from: X1 */
    public C2102d<S> mo8215X1() {
        return this.f6983d0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public LinearLayoutManager mo8216Z1() {
        return (LinearLayoutManager) this.f6989j0.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c2 */
    public void mo8217c2(C2128l lVar) {
        RecyclerView recyclerView;
        int i;
        C2131n nVar = (C2131n) this.f6989j0.getAdapter();
        int E = nVar.mo8264E(lVar);
        int E2 = E - nVar.mo8264E(this.f6985f0);
        boolean z = true;
        boolean z2 = Math.abs(E2) > 3;
        if (E2 <= 0) {
            z = false;
        }
        this.f6985f0 = lVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f6989j0;
                i = E + 3;
            }
            m9853b2(E);
        }
        recyclerView = this.f6989j0;
        i = E - 3;
        recyclerView.mo4195i1(i);
        m9853b2(E);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public void mo8218d2(C2118k kVar) {
        this.f6986g0 = kVar;
        if (kVar == C2118k.YEAR) {
            this.f6988i0.getLayoutManager().mo4084x1(((C2140t) this.f6988i0.getAdapter()).mo8272D(this.f6985f0.f7042i));
            this.f6990k0.setVisibility(0);
            this.f6991l0.setVisibility(8);
        } else if (kVar == C2118k.DAY) {
            this.f6990k0.setVisibility(8);
            this.f6991l0.setVisibility(0);
            mo8217c2(this.f6985f0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public void mo8219e2() {
        C2118k kVar;
        C2118k kVar2 = this.f6986g0;
        if (kVar2 == C2118k.YEAR) {
            kVar = C2118k.DAY;
        } else if (kVar2 == C2118k.DAY) {
            kVar = C2118k.YEAR;
        } else {
            return;
        }
        mo8218d2(kVar);
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        if (bundle == null) {
            bundle = mo3237w();
        }
        this.f6982c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6983d0 = (C2102d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6984e0 = (C2096a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6985f0 = (C2128l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo3242y(), this.f6982c0);
        this.f6987h0 = new C2101c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C2128l j = this.f6984e0.mo8178j();
        if (C2120i.m9886m2(contextThemeWrapper)) {
            i2 = C5002h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C5002h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C5000f.mtrl_calendar_days_of_week);
        C3403t.m14643i0(gridView, new C2109b(this));
        gridView.setAdapter(new C2106g());
        gridView.setNumColumns(j.f7043j);
        gridView.setEnabled(false);
        this.f6989j0 = (RecyclerView) inflate.findViewById(C5000f.mtrl_calendar_months);
        this.f6989j0.setLayoutManager(new C2110c(mo3242y(), i, false, i));
        this.f6989j0.setTag(f6978m0);
        C2131n nVar = new C2131n(contextThemeWrapper, this.f6983d0, this.f6984e0, new C2111d());
        this.f6989j0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(C5001g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C5000f.mtrl_calendar_year_selector_frame);
        this.f6988i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f6988i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f6988i0.setAdapter(new C2140t(this));
            this.f6988i0.mo4191h(m9850T1());
        }
        if (inflate.findViewById(C5000f.month_navigation_fragment_toggle) != null) {
            m9849S1(inflate, nVar);
        }
        if (!C2120i.m9886m2(contextThemeWrapper)) {
            new C0909k().mo4846b(this.f6989j0);
        }
        this.f6989j0.mo4195i1(nVar.mo8264E(this.f6985f0));
        return inflate;
    }
}
