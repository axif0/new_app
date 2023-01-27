package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C2107h;
import java.util.Calendar;
import java.util.Locale;
import p148g.p189d.p190a.p252d.C5002h;
import p148g.p189d.p190a.p252d.C5004j;

/* renamed from: com.google.android.material.datepicker.t */
class C2140t extends RecyclerView.C0832g<C2142b> {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2107h<?> f7064h;

    /* renamed from: com.google.android.material.datepicker.t$a */
    class C2141a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f7065f;

        C2141a(int i) {
            this.f7065f = i;
        }

        public void onClick(View view) {
            C2140t.this.f7064h.mo8217c2(C2140t.this.f7064h.mo8212U1().mo8171e(C2128l.m9906g(this.f7065f, C2140t.this.f7064h.mo8214W1().f7041h)));
            C2140t.this.f7064h.mo8218d2(C2107h.C2118k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.t$b */
    public static class C2142b extends RecyclerView.C0829d0 {

        /* renamed from: t */
        final TextView f7067t;

        C2142b(TextView textView) {
            super(textView);
            this.f7067t = textView;
        }
    }

    C2140t(C2107h<?> hVar) {
        this.f7064h = hVar;
    }

    /* renamed from: C */
    private View.OnClickListener m9963C(int i) {
        return new C2141a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo8272D(int i) {
        return i - this.f7064h.mo8212U1().mo8178j().f7042i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public int mo8273E(int i) {
        return this.f7064h.mo8212U1().mo8178j().f7042i + i;
    }

    /* renamed from: F */
    public void mo3966q(C2142b bVar, int i) {
        int E = mo8273E(i);
        String string = bVar.f7067t.getContext().getString(C5004j.mtrl_picker_navigate_to_year_description);
        bVar.f7067t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(E)}));
        bVar.f7067t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(E)}));
        C2101c V1 = this.f7064h.mo8213V1();
        Calendar j = C2139s.m9955j();
        C2100b bVar2 = j.get(1) == E ? V1.f6970f : V1.f6968d;
        for (Long longValue : this.f7064h.mo8215X1().mo8191D()) {
            j.setTimeInMillis(longValue.longValue());
            if (j.get(1) == E) {
                bVar2 = V1.f6969e;
            }
        }
        bVar2.mo8190d(bVar.f7067t);
        bVar.f7067t.setOnClickListener(m9963C(E));
    }

    /* renamed from: G */
    public C2142b mo3967s(ViewGroup viewGroup, int i) {
        return new C2142b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5002h.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: e */
    public int mo3963e() {
        return this.f7064h.mo8212U1().mo8179k();
    }
}
