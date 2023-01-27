package p048d.p049a.p050a.p051a.p052c;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import p048d.p049a.p050a.p051a.p058g.C2871k;
import p048d.p049a.p050a.p051a.p064k.C2974g;
import p048d.p049a.p050a.p051a.p067n.p068a.C2992d;
import p048d.p049a.p050a.p051a.p067n.p069b.C3000h;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3039p0;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.c.h */
public class C2809h extends C2992d<C3005b> {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f8988i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2974g f8989j;

    /* renamed from: d.a.a.a.c.h$a */
    class C2810a implements C6314d<C3039p0> {

        /* renamed from: a */
        final /* synthetic */ C3005b f8990a;

        C2810a(C3005b bVar) {
            this.f8990a = bVar;
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3039p0> bVar, C6372r<C3039p0> rVar) {
            C3039p0 a;
            if (rVar.mo17995d() && (a = rVar.mo17993a()) != null && a.mo10589a().booleanValue()) {
                C3000h.m12796j(C2809h.this.f8988i).mo10343i(this.f8990a);
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3039p0> bVar, Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d.a.a.a.c.h$b */
    private static class C2811b extends RecyclerView.C0829d0 {
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final LinearLayout f8992t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final TextView f8993u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final TextView f8994v;

        private C2811b(View view) {
            super(view);
            this.f8992t = (LinearLayout) view.findViewById(C2722R.C2724id.ll_item_parent);
            this.f8993u = (TextView) view.findViewById(C2722R.C2724id.tv_notification_title);
            this.f8994v = (TextView) view.findViewById(C2722R.C2724id.tv_notification_message);
        }

        /* synthetic */ C2811b(View view, C2808g gVar) {
            this(view);
        }
    }

    public C2809h(Context context, C2974g gVar) {
        this.f8988i = context;
        this.f8989j = gVar;
    }

    /* renamed from: H */
    private void m12291H(C3005b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(bVar.mo10380V()));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(this.f8988i.getString(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10633c(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), arrayList.toString()).mo17940X(new C2810a(bVar));
    }

    /* renamed from: G */
    public /* synthetic */ void mo10146G(C2811b bVar, View view) {
        C3005b bVar2 = (C3005b) mo10331B(((Integer) bVar.f8992t.getTag()).intValue());
        m12291H(bVar2);
        String W = bVar2.mo10381W();
        String U = bVar2.mo10379U();
        Context context = this.f8988i;
        new C2871k(context, W, U, context.getString(C2722R.string.text_ok), false, new C2808g(this, bVar2)).mo10199c();
    }

    /* renamed from: e */
    public int mo3963e() {
        if (mo10332C() != null) {
            return Math.min(mo10332C().getCount(), 10);
        }
        return 0;
    }

    /* renamed from: q */
    public void mo3966q(RecyclerView.C0829d0 d0Var, int i) {
        int i2;
        Resources resources;
        LinearLayout linearLayout;
        C2811b bVar = (C2811b) d0Var;
        C3005b bVar2 = (C3005b) mo10331B(i);
        bVar.f8993u.setText(bVar2.mo10381W());
        bVar.f8994v.setText(bVar2.mo10379U());
        if (bVar2.mo10382X()) {
            linearLayout = bVar.f8992t;
            resources = this.f8988i.getResources();
            i2 = C2722R.color.color_item_synced_background;
        } else {
            linearLayout = bVar.f8992t;
            resources = this.f8988i.getResources();
            i2 = C2722R.color.color_item_not_synced_background;
        }
        linearLayout.setBackgroundColor(resources.getColor(i2));
        bVar.f8992t.setTag(Integer.valueOf(i));
        bVar.f8992t.setOnClickListener(new C2798a(this, bVar));
    }

    /* renamed from: s */
    public RecyclerView.C0829d0 mo3967s(ViewGroup viewGroup, int i) {
        return new C2811b(LayoutInflater.from(viewGroup.getContext()).inflate(C2722R.layout.rv_notification_item, viewGroup, false), (C2808g) null);
    }
}
