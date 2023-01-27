package p048d.p049a.p050a.p051a.p060i.p061a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p064k.C2968a;
import p048d.p049a.p050a.p051a.p071o.p072a.C3047w;

/* renamed from: d.a.a.a.i.a.g */
public class C2895g extends RecyclerView.C0832g<RecyclerView.C0829d0> {

    /* renamed from: h */
    private List<C3047w> f9343h;

    /* renamed from: i */
    private Context f9344i;

    /* renamed from: j */
    private C2968a f9345j;

    /* renamed from: d.a.a.a.i.a.g$b */
    private static class C2897b extends RecyclerView.C0829d0 {
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final TextView f9346t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final TextView f9347u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final TextView f9348v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public final TextView f9349w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public final TextView f9350x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public final Button f9351y;

        private C2897b(View view) {
            super(view);
            this.f9346t = (TextView) view.findViewById(C2722R.C2724id.tv_student_id);
            this.f9347u = (TextView) view.findViewById(C2722R.C2724id.tv_student_name);
            this.f9348v = (TextView) view.findViewById(C2722R.C2724id.tv_message_subject);
            this.f9349w = (TextView) view.findViewById(C2722R.C2724id.tv_message_delivery_date);
            this.f9351y = (Button) view.findViewById(C2722R.C2724id.btn_resend);
            this.f9350x = (TextView) view.findViewById(C2722R.C2724id.tv_message_delivery_status);
        }
    }

    public C2895g(List<C3047w> list, C2968a aVar) {
        this.f9343h = list;
        this.f9345j = aVar;
    }

    /* renamed from: B */
    public /* synthetic */ void mo10223B(C2897b bVar, View view) {
        if (view.isPressed()) {
            this.f9345j.mo10287a(this.f9343h.get(((Integer) bVar.f9351y.getTag()).intValue()));
        }
    }

    /* renamed from: e */
    public int mo3963e() {
        List<C3047w> list = this.f9343h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: q */
    public void mo3966q(RecyclerView.C0829d0 d0Var, int i) {
        C2897b bVar = (C2897b) d0Var;
        bVar.mo4303G(false);
        C3047w wVar = this.f9343h.get(i);
        try {
            bVar.f9346t.setText(String.format("ID: %s", new Object[]{wVar.mo10621f()}));
            bVar.f9347u.setText(String.format("Name: %s", new Object[]{wVar.mo10617b()}));
            bVar.f9349w.setText(String.format(Locale.getDefault(), "Date: %s", new Object[]{wVar.mo10616a()}));
            bVar.f9348v.setText(String.format("Subject: %s", new Object[]{wVar.mo10622g()}));
            if (wVar.mo10618c().booleanValue()) {
                bVar.f9350x.setText(this.f9344i.getString(C2722R.string.delivered));
                bVar.f9350x.setCompoundDrawablesWithIntrinsicBounds(C2722R.C2723drawable.ic_payment_complete, 0, 0, 0);
                bVar.f9351y.setEnabled(false);
            } else {
                bVar.f9350x.setText(this.f9344i.getString(C2722R.string.not_delivered));
                bVar.f9350x.setCompoundDrawablesWithIntrinsicBounds(C2722R.C2723drawable.ic_payment_incomplete, 0, 0, 0);
                bVar.f9351y.setEnabled(true);
            }
        } catch (Exception unused) {
        }
        bVar.f9351y.setTag(Integer.valueOf(i));
        bVar.f9351y.setOnClickListener(new C2888d(this, bVar));
    }

    /* renamed from: s */
    public RecyclerView.C0829d0 mo3967s(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C2722R.layout.rv_message_outbox_item, viewGroup, false);
        this.f9344i = inflate.getContext();
        return new C2897b(inflate);
    }
}
