package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C2107h;
import p086f.p111h.p122m.C3403t;
import p148g.p189d.p190a.p252d.C5000f;
import p148g.p189d.p190a.p252d.C5002h;

/* renamed from: com.google.android.material.datepicker.n */
class C2131n extends RecyclerView.C0832g<C2133b> {

    /* renamed from: h */
    private final C2096a f7051h;

    /* renamed from: i */
    private final C2102d<?> f7052i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2107h.C2119l f7053j;

    /* renamed from: k */
    private final int f7054k;

    /* renamed from: com.google.android.material.datepicker.n$a */
    class C2132a implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f7055f;

        C2132a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7055f = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f7055f.getAdapter().mo8261j(i)) {
                C2131n.this.f7053j.mo8221a(this.f7055f.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    public static class C2133b extends RecyclerView.C0829d0 {

        /* renamed from: t */
        final TextView f7057t;

        /* renamed from: u */
        final MaterialCalendarGridView f7058u;

        C2133b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C5000f.month_title);
            this.f7057t = textView;
            C3403t.m14645j0(textView, true);
            this.f7058u = (MaterialCalendarGridView) linearLayout.findViewById(C5000f.month_grid);
            if (!z) {
                this.f7057t.setVisibility(8);
            }
        }
    }

    C2131n(Context context, C2102d<?> dVar, C2096a aVar, C2107h.C2119l lVar) {
        C2128l j = aVar.mo8178j();
        C2128l g = aVar.mo8174g();
        C2128l i = aVar.mo8177i();
        if (j.compareTo(i) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i.compareTo(g) <= 0) {
            this.f7054k = (C2130m.f7046j * C2107h.m9851Y1(context)) + (C2120i.m9886m2(context) ? C2107h.m9851Y1(context) : 0);
            this.f7051h = aVar;
            this.f7052i = dVar;
            this.f7053j = lVar;
            mo4374z(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C2128l mo8262C(int i) {
        return this.f7051h.mo8178j().mo8241n(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public CharSequence mo8263D(int i) {
        return mo8262C(i).mo8239l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo8264E(C2128l lVar) {
        return this.f7051h.mo8178j().mo8242o(lVar);
    }

    /* renamed from: F */
    public void mo3966q(C2133b bVar, int i) {
        C2128l n = this.f7051h.mo8178j().mo8241n(i);
        bVar.f7057t.setText(n.mo8239l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7058u.findViewById(C5000f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !n.equals(materialCalendarGridView.getAdapter().f7047f)) {
            C2130m mVar = new C2130m(n, this.f7052i, this.f7051h);
            materialCalendarGridView.setNumColumns(n.f7043j);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C2132a(materialCalendarGridView));
    }

    /* renamed from: G */
    public C2133b mo3967s(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C5002h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C2120i.m9886m2(viewGroup.getContext())) {
            return new C2133b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0848p(-1, this.f7054k));
        return new C2133b(linearLayout, true);
    }

    /* renamed from: e */
    public int mo3963e() {
        return this.f7051h.mo8175h();
    }

    /* renamed from: f */
    public long mo3964f(int i) {
        return this.f7051h.mo8178j().mo8241n(i).mo8240m();
    }
}
