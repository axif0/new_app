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
import p048d.p049a.p050a.p051a.p071o.p072a.C3030l;

/* renamed from: d.a.a.a.c.e */
public class C2802e extends ArrayAdapter<C3030l> {

    /* renamed from: f */
    private List<C3030l> f8973f;

    /* renamed from: g */
    private Context f8974g;

    /* renamed from: h */
    private int f8975h = -1;

    /* renamed from: d.a.a.a.c.e$b */
    private static class C2804b {

        /* renamed from: a */
        TextView f8976a;

        /* renamed from: b */
        TextView f8977b;

        /* renamed from: c */
        TextView f8978c;

        /* renamed from: d */
        TextView f8979d;

        private C2804b() {
        }
    }

    public C2802e(Context context, List<C3030l> list) {
        super(context, C2722R.layout.class_item_view, list);
        this.f8974g = context;
        this.f8973f = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2804b bVar;
        C3030l lVar = this.f8973f.get(i);
        if (view == null) {
            C2804b bVar2 = new C2804b();
            View inflate = LayoutInflater.from(getContext()).inflate(C2722R.layout.class_item_view, viewGroup, false);
            bVar2.f8976a = (TextView) inflate.findViewById(C2722R.C2724id.tv_course_code);
            bVar2.f8977b = (TextView) inflate.findViewById(C2722R.C2724id.tv_class_time);
            bVar2.f8978c = (TextView) inflate.findViewById(C2722R.C2724id.tv_class_room);
            bVar2.f8979d = (TextView) inflate.findViewById(C2722R.C2724id.tv_faculty_name);
            inflate.setTag(bVar2);
            View view2 = inflate;
            bVar = bVar2;
            view = view2;
        } else {
            bVar = (C2804b) view.getTag();
        }
        view.startAnimation(AnimationUtils.loadAnimation(this.f8974g, i > this.f8975h ? C2722R.anim.up_from_bottom : C2722R.anim.down_from_top));
        this.f8975h = i;
        bVar.f8976a.setText(lVar.mo10542c());
        bVar.f8977b.setText(String.format("%s - %s", new Object[]{lVar.mo10541b(), lVar.mo10540a()}));
        bVar.f8978c.setText(lVar.mo10544e());
        bVar.f8979d.setText(lVar.mo10543d());
        return view;
    }
}
