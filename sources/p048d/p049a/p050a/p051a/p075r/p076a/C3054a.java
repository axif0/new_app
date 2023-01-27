package p048d.p049a.p050a.p051a.p075r.p076a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p071o.p072a.C3017e0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3032m;

/* renamed from: d.a.a.a.r.a.a */
public class C3054a extends BaseAdapter {

    /* renamed from: f */
    private List<C3017e0> f9749f;

    /* renamed from: g */
    private Context f9750g;

    /* renamed from: d.a.a.a.r.a.a$a */
    static class C3055a {

        /* renamed from: a */
        TextView f9751a;

        /* renamed from: b */
        TextView f9752b;

        /* renamed from: c */
        TextView f9753c;

        /* renamed from: d */
        TextView f9754d;

        /* renamed from: e */
        TextView f9755e;

        /* renamed from: f */
        TextView f9756f;

        /* renamed from: g */
        TextView f9757g;

        /* renamed from: h */
        LinearLayout f9758h;

        /* renamed from: i */
        LinearLayout f9759i;

        C3055a() {
        }
    }

    static {
        Class<C3054a> cls = C3054a.class;
    }

    public C3054a(Context context, List<C3017e0> list) {
        this.f9750g = context;
        this.f9749f = list;
    }

    public int getCount() {
        List<C3017e0> list = this.f9749f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f9749f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f9750g.getSystemService("layout_inflater")).inflate(C2722R.layout.rv_student_result_item, (ViewGroup) null);
            C3055a aVar = new C3055a();
            aVar.f9751a = (TextView) view.findViewById(C2722R.C2724id.tv_session_name);
            aVar.f9752b = (TextView) view.findViewById(C2722R.C2724id.tv_semester_attempted);
            aVar.f9753c = (TextView) view.findViewById(C2722R.C2724id.tv_semester_earned);
            aVar.f9754d = (TextView) view.findViewById(C2722R.C2724id.tv_semester_gpa);
            aVar.f9755e = (TextView) view.findViewById(C2722R.C2724id.tv_cumulative_attempted);
            aVar.f9756f = (TextView) view.findViewById(C2722R.C2724id.tv_cumulative_earned);
            aVar.f9757g = (TextView) view.findViewById(C2722R.C2724id.tv_cumulative_gpa);
            aVar.f9758h = (LinearLayout) view.findViewById(C2722R.C2724id.ll_result_cell);
            aVar.f9759i = (LinearLayout) view.findViewById(C2722R.C2724id.ll_item_parent);
            view.setTag(aVar);
        }
        C3055a aVar2 = (C3055a) view.getTag();
        C3017e0 e0Var = this.f9749f.get(i);
        aVar2.f9751a.setText(e0Var.mo10495c());
        aVar2.f9752b.setText(String.format("%s", new Object[]{e0Var.mo10496d()}));
        aVar2.f9753c.setText(String.format(Locale.getDefault(), "%s", new Object[]{e0Var.mo10497e()}));
        aVar2.f9754d.setText(String.format("%s", new Object[]{e0Var.mo10494b()}));
        aVar2.f9755e.setText(String.format(Locale.getDefault(), "%s", new Object[]{e0Var.mo10498f()}));
        aVar2.f9756f.setText(String.format(Locale.getDefault(), "%s", new Object[]{e0Var.mo10499g()}));
        aVar2.f9757g.setText(String.format("%s", new Object[]{e0Var.mo10493a()}));
        if (aVar2.f9758h.getChildCount() > 0) {
            aVar2.f9758h.removeAllViews();
        }
        for (C3032m next : e0Var.mo10500h()) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f9750g).inflate(C2722R.layout.result_cell, (ViewGroup) null);
            ((TextView) linearLayout.findViewById(C2722R.C2724id.tv_course_code)).setText(next.mo10548a());
            ((TextView) linearLayout.findViewById(C2722R.C2724id.tv_course_attempted)).setText(String.format("%s", new Object[]{next.mo10549b()}));
            ((TextView) linearLayout.findViewById(C2722R.C2724id.tv_course_earned)).setText(String.format("%s", new Object[]{next.mo10550c()}));
            ((TextView) linearLayout.findViewById(C2722R.C2724id.tv_course_grade)).setText(next.mo10551d());
            ((TextView) linearLayout.findViewById(C2722R.C2724id.tv_course_gpa)).setText(String.format("%s", new Object[]{next.mo10552e()}));
            aVar2.f9758h.addView(linearLayout);
        }
        return view;
    }
}
