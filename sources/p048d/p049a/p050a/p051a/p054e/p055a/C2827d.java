package p048d.p049a.p050a.p051a.p054e.p055a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.C2722R;
import java.util.List;
import p048d.p049a.p050a.p051a.p066m.C2986a;

/* renamed from: d.a.a.a.e.a.d */
public class C2827d extends ArrayAdapter<C2986a> {

    /* renamed from: f */
    private List<C2986a> f9027f;

    /* renamed from: g */
    private Context f9028g;

    /* renamed from: h */
    private int f9029h = -1;

    /* renamed from: i */
    private int f9030i;

    /* renamed from: j */
    private Activity f9031j;

    /* renamed from: d.a.a.a.e.a.d$b */
    private static class C2829b {

        /* renamed from: a */
        ImageView f9032a;

        /* renamed from: b */
        ImageView f9033b;

        /* renamed from: c */
        TextView f9034c;

        /* renamed from: d */
        TextView f9035d;

        /* renamed from: e */
        TextView f9036e;

        private C2829b() {
        }
    }

    public C2827d(Activity activity, Context context, int i, List<C2986a> list) {
        super(context, i, list);
        this.f9031j = activity;
        this.f9028g = context;
        this.f9030i = i;
        this.f9027f = list;
    }

    /* renamed from: a */
    private void m12326a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:+88029844051"));
        this.f9031j.startActivity(intent);
    }

    /* renamed from: d */
    private void m12327d(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, (String) null));
        intent.putExtra("android.intent.extra.SUBJECT", "Inquiry");
        intent.putExtra("android.intent.extra.TEXT", "Dear Sir, <br/>");
        this.f9031j.startActivity(Intent.createChooser(intent, "Send email"));
    }

    /* renamed from: b */
    public /* synthetic */ void mo10158b(View view) {
        try {
            m12326a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo10159c(C2986a aVar, View view) {
        try {
            m12327d(aVar.mo10319a().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2829b bVar;
        C2986a aVar = this.f9027f.get(i);
        if (view == null) {
            C2829b bVar2 = new C2829b();
            View inflate = LayoutInflater.from(getContext()).inflate(this.f9030i, viewGroup, false);
            bVar2.f9032a = (ImageView) inflate.findViewById(C2722R.C2724id.imv_call);
            bVar2.f9033b = (ImageView) inflate.findViewById(C2722R.C2724id.imv_email);
            bVar2.f9034c = (TextView) inflate.findViewById(C2722R.C2724id.tv_item_title);
            bVar2.f9035d = (TextView) inflate.findViewById(C2722R.C2724id.tv_phone_number);
            bVar2.f9036e = (TextView) inflate.findViewById(C2722R.C2724id.tv_email_address);
            inflate.setTag(bVar2);
            View view2 = inflate;
            bVar = bVar2;
            view = view2;
        } else {
            bVar = (C2829b) view.getTag();
        }
        view.startAnimation(AnimationUtils.loadAnimation(this.f9028g, i > this.f9029h ? C2722R.anim.up_from_bottom : C2722R.anim.down_from_top));
        this.f9029h = i;
        bVar.f9034c.setText(aVar.mo10321c());
        bVar.f9035d.setText(aVar.mo10320b());
        bVar.f9036e.setText(aVar.mo10319a());
        view.setOnClickListener((View.OnClickListener) null);
        bVar.f9032a.setOnClickListener(new C2824a(this));
        bVar.f9033b.setOnClickListener(new C2825b(this, aVar));
        return view;
    }
}
