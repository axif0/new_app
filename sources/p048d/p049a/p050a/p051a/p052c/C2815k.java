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
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3039p0;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.c.k */
public class C2815k extends C2992d<C3007d> {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f9001i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C2974g f9002j;

    /* renamed from: d.a.a.a.c.k$a */
    class C2816a implements C6314d<C3039p0> {

        /* renamed from: a */
        final /* synthetic */ C3007d f9003a;

        C2816a(C3007d dVar) {
            this.f9003a = dVar;
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3039p0> bVar, C6372r<C3039p0> rVar) {
            C3039p0 a;
            if (rVar.mo17995d() && (a = rVar.mo17993a()) != null && a.mo10589a().booleanValue()) {
                C3002j.m12812k(C2815k.this.f9001i).mo10354j(this.f9003a);
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3039p0> bVar, Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: d.a.a.a.c.k$b */
    private static class C2817b extends RecyclerView.C0829d0 {
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final LinearLayout f9005t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public final TextView f9006u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public final TextView f9007v;

        private C2817b(View view) {
            super(view);
            this.f9005t = (LinearLayout) view.findViewById(C2722R.C2724id.ll_item_parent);
            this.f9006u = (TextView) view.findViewById(C2722R.C2724id.tv_notification_title);
            this.f9007v = (TextView) view.findViewById(C2722R.C2724id.tv_notification_message);
        }

        /* synthetic */ C2817b(View view, C2814j jVar) {
            this(view);
        }
    }

    public C2815k(Context context, C2974g gVar) {
        this.f9001i = context;
        this.f9002j = gVar;
    }

    /* renamed from: H */
    private void m12309H(C3007d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(dVar.mo10431V()));
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(this.f9001i.getString(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10633c(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), arrayList.toString()).mo17940X(new C2816a(dVar));
    }

    /* renamed from: G */
    public /* synthetic */ void mo10153G(C2817b bVar, View view) {
        C3007d dVar = (C3007d) mo10331B(((Integer) bVar.f9005t.getTag()).intValue());
        m12309H(dVar);
        String W = dVar.mo10432W();
        String U = dVar.mo10430U();
        Context context = this.f9001i;
        new C2871k(context, W, U, context.getString(C2722R.string.text_ok), false, new C2814j(this, dVar)).mo10199c();
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
        C2817b bVar = (C2817b) d0Var;
        C3007d dVar = (C3007d) mo10331B(i);
        bVar.f9006u.setText(dVar.mo10432W());
        bVar.f9007v.setText(dVar.mo10430U());
        if (dVar.mo10433X()) {
            linearLayout = bVar.f9005t;
            resources = this.f9001i.getResources();
            i2 = C2722R.color.color_item_synced_background;
        } else {
            linearLayout = bVar.f9005t;
            resources = this.f9001i.getResources();
            i2 = C2722R.color.color_item_not_synced_background;
        }
        linearLayout.setBackgroundColor(resources.getColor(i2));
        bVar.f9005t.setTag(Integer.valueOf(i));
        bVar.f9005t.setOnClickListener(new C2800c(this, bVar));
    }

    /* renamed from: s */
    public RecyclerView.C0829d0 mo3967s(ViewGroup viewGroup, int i) {
        return new C2817b(LayoutInflater.from(viewGroup.getContext()).inflate(C2722R.layout.rv_notification_item, viewGroup, false), (C2814j) null);
    }
}
