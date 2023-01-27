package p048d.p049a.p050a.p051a.p052c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.List;
import p048d.p049a.p050a.p051a.p071o.p072a.C3038p;
import p048d.p049a.p050a.p051a.p078s.C3105o;

/* renamed from: d.a.a.a.c.f */
public class C2805f extends ArrayAdapter<C3038p> {

    /* renamed from: f */
    private List<C3038p> f8980f;

    /* renamed from: g */
    private Context f8981g;

    /* renamed from: h */
    private int f8982h = -1;

    /* renamed from: d.a.a.a.c.f$b */
    private static class C2807b {

        /* renamed from: a */
        TextView f8983a;

        /* renamed from: b */
        TextView f8984b;

        /* renamed from: c */
        TextView f8985c;

        private C2807b() {
        }
    }

    public C2805f(Context context, List<C3038p> list) {
        super(context, C2722R.layout.exam_item_view, list);
        this.f8981g = context;
        this.f8980f = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2807b bVar;
        C3038p pVar = this.f8980f.get(i);
        if (view == null) {
            C2807b bVar2 = new C2807b();
            View inflate = LayoutInflater.from(getContext()).inflate(C2722R.layout.exam_item_view, viewGroup, false);
            bVar2.f8983a = (TextView) inflate.findViewById(C2722R.C2724id.tv_exam_course_code);
            bVar2.f8984b = (TextView) inflate.findViewById(C2722R.C2724id.tv_exam_time_table);
            bVar2.f8985c = (TextView) inflate.findViewById(C2722R.C2724id.tv_exam_date);
            inflate.setTag(bVar2);
            View view2 = inflate;
            bVar = bVar2;
            view = view2;
        } else {
            bVar = (C2807b) view.getTag();
        }
        view.startAnimation(AnimationUtils.loadAnimation(this.f8981g, i > this.f8982h ? C2722R.anim.up_from_bottom : C2722R.anim.down_from_top));
        this.f8982h = i;
        bVar.f8983a.setText(pVar.mo10585a());
        bVar.f8984b.setText(String.format("%s - %s", new Object[]{pVar.mo10588d(), pVar.mo10586b()}));
        TextView textView = bVar.f8985c;
        textView.setText(C3105o.m13340d(pVar.mo10587c().trim() + " 00:00:00", "yyyy-MM-dd HH:mm:ss"));
        return view;
    }
}
