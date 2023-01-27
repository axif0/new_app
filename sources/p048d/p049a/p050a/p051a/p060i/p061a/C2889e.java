package p048d.p049a.p050a.p051a.p060i.p061a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.p058g.C2873l;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3011b0;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: d.a.a.a.i.a.e */
public class C2889e extends RecyclerView.C0832g<RecyclerView.C0829d0> implements Filterable {

    /* renamed from: h */
    private List<C3011b0> f9321h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C3011b0> f9322i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<C3011b0> f9323j;

    /* renamed from: k */
    private Context f9324k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2969b f9325l;

    /* renamed from: d.a.a.a.i.a.e$a */
    class C2890a extends Filter {
        C2890a() {
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String charSequence2 = charSequence.toString();
            ArrayList arrayList = new ArrayList();
            String lowerCase = charSequence2.toLowerCase();
            for (C3011b0 b0Var : C2889e.this.f9323j) {
                if (b0Var.mo10473e().contains(lowerCase) || b0Var.mo10469a().toLowerCase().contains(lowerCase)) {
                    arrayList.add(b0Var);
                }
            }
            List unused = C2889e.this.f9322i = arrayList;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = C2889e.this.f9322i;
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            List unused = C2889e.this.f9322i = (List) filterResults.values;
            if (C2889e.this.f9322i != null) {
                C2889e.this.f9325l.mo427r(C2889e.this.f9322i);
            }
        }
    }

    /* renamed from: d.a.a.a.i.a.e$b */
    private static class C2891b extends RecyclerView.C0829d0 {
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final TextView f9327t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final TextView f9328u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final TextView f9329v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public final TextView f9330w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public final TextView f9331x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public final CardView f9332y;

        private C2891b(View view) {
            super(view);
            this.f9327t = (TextView) view.findViewById(C2722R.C2724id.tv_student_id);
            this.f9328u = (TextView) view.findViewById(C2722R.C2724id.tv_student_name);
            this.f9329v = (TextView) view.findViewById(C2722R.C2724id.tv_result_grade_point);
            this.f9330w = (TextView) view.findViewById(C2722R.C2724id.tv_result_grade);
            this.f9331x = (TextView) view.findViewById(C2722R.C2724id.tv_result_marks);
            this.f9332y = (CardView) view.findViewById(C2722R.C2724id.cv_item_parent);
        }

        /* synthetic */ C2891b(View view, C2890a aVar) {
            this(view);
        }
    }

    static {
        Class<C2889e> cls = C2889e.class;
    }

    public C2889e(List<C3011b0> list, C2969b bVar) {
        this.f9321h = list;
        this.f9323j = list;
        this.f9325l = bVar;
    }

    /* renamed from: F */
    public /* synthetic */ void mo10213F(C2891b bVar, View view) {
        if (!view.isPressed()) {
            return;
        }
        if (C3101n.m13328w(this.f9324k)) {
            new C2873l(this.f9324k, this.f9321h.get(((Integer) bVar.f9332y.getTag()).intValue()).mo10474f()).mo10203h();
        } else {
            C3101n.m13303R(this.f9324k);
        }
    }

    /* renamed from: G */
    public void mo10214G(List<C3011b0> list) {
        this.f9321h = list;
        mo4360j();
    }

    /* renamed from: e */
    public int mo3963e() {
        List<C3011b0> list = this.f9321h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Filter getFilter() {
        return new C2890a();
    }

    /* renamed from: q */
    public void mo3966q(RecyclerView.C0829d0 d0Var, int i) {
        C2891b bVar = (C2891b) d0Var;
        bVar.mo4303G(false);
        C3011b0 b0Var = this.f9321h.get(i);
        try {
            bVar.f9327t.setText(String.format("ID: %s", new Object[]{b0Var.mo10473e()}));
            bVar.f9328u.setText(String.format("Name: %s", new Object[]{b0Var.mo10469a()}));
            bVar.f9331x.setText(String.format("Marks: %s", new Object[]{b0Var.mo10472d()}));
            bVar.f9329v.setText(String.format("Grade Point: %s", new Object[]{b0Var.mo10471c()}));
            bVar.f9330w.setText(String.format("Grade: %s", new Object[]{b0Var.mo10470b()}));
        } catch (Exception unused) {
        }
        bVar.f9332y.setTag(Integer.valueOf(i));
        bVar.f9332y.setOnClickListener(new C2885a(this, bVar));
    }

    /* renamed from: s */
    public RecyclerView.C0829d0 mo3967s(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C2722R.layout.rv_faculty_student_result_item, viewGroup, false);
        this.f9324k = inflate.getContext();
        return new C2891b(inflate, (C2890a) null);
    }
}
