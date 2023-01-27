package p048d.p049a.p050a.p051a.p052c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.List;
import p048d.p049a.p050a.p051a.p071o.p072a.C3050z;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: d.a.a.a.c.l */
public class C2818l extends ArrayAdapter<C3050z> {

    /* renamed from: f */
    private List<C3050z> f9008f;

    /* renamed from: g */
    private Context f9009g;

    /* renamed from: h */
    private int f9010h = -1;

    /* renamed from: d.a.a.a.c.l$b */
    private static class C2820b {

        /* renamed from: a */
        ImageView f9011a;

        /* renamed from: b */
        TextView f9012b;

        /* renamed from: c */
        TextView f9013c;

        /* renamed from: d */
        TextView f9014d;

        /* renamed from: e */
        TextView f9015e;

        private C2820b() {
        }
    }

    public C2818l(Context context, List<C3050z> list) {
        super(context, C2722R.layout.payment_item_view, list);
        this.f9009g = context;
        this.f9008f = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2820b bVar;
        ImageView imageView;
        int i2;
        C3050z zVar = this.f9008f.get(i);
        if (view == null) {
            C2820b bVar2 = new C2820b();
            View inflate = LayoutInflater.from(getContext()).inflate(C2722R.layout.payment_item_view, viewGroup, false);
            bVar2.f9011a = (ImageView) inflate.findViewById(C2722R.C2724id.imv_item_icon);
            bVar2.f9012b = (TextView) inflate.findViewById(C2722R.C2724id.tv_payment_program_name);
            bVar2.f9013c = (TextView) inflate.findViewById(C2722R.C2724id.tv_payment_transaction_no);
            bVar2.f9014d = (TextView) inflate.findViewById(C2722R.C2724id.tv_payment_status);
            bVar2.f9015e = (TextView) inflate.findViewById(C2722R.C2724id.tv_payment_time);
            inflate.setTag(bVar2);
            View view2 = inflate;
            bVar = bVar2;
            view = view2;
        } else {
            bVar = (C2820b) view.getTag();
        }
        view.startAnimation(AnimationUtils.loadAnimation(this.f9009g, i > this.f9010h ? C2722R.anim.up_from_bottom : C2722R.anim.down_from_top));
        this.f9010h = i;
        if (zVar.mo10628b().toLowerCase().equals("paid")) {
            imageView = bVar.f9011a;
            i2 = C2722R.C2723drawable.ic_payment_complete;
        } else {
            imageView = bVar.f9011a;
            i2 = C2722R.C2723drawable.ic_payment_incomplete;
        }
        imageView.setImageResource(i2);
        bVar.f9012b.setText(zVar.mo10629c().trim());
        bVar.f9013c.setText(zVar.mo10630d().trim());
        bVar.f9014d.setText(zVar.mo10628b().trim().toUpperCase());
        bVar.f9015e.setText(C3101n.m13318l(zVar.mo10627a().trim(), "yyyy-MM-dd HH:mm:ss"));
        return view;
    }
}
