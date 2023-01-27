package p048d.p049a.p050a.p051a.p060i.p061a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p048d.p049a.p050a.p051a.p058g.C2873l;
import p048d.p049a.p050a.p051a.p064k.C2976i;
import p048d.p049a.p050a.p051a.p071o.p072a.C3021g0;
import p048d.p049a.p050a.p051a.p078s.C3101n;

/* renamed from: d.a.a.a.i.a.f */
public class C2892f extends ArrayAdapter<C3021g0> {

    /* renamed from: f */
    private Context f9333f;

    /* renamed from: g */
    private List<C3021g0> f9334g;

    /* renamed from: h */
    private boolean f9335h = false;

    /* renamed from: i */
    private boolean f9336i = false;

    /* renamed from: j */
    private boolean f9337j = false;

    /* renamed from: k */
    private C2976i f9338k;

    /* renamed from: d.a.a.a.i.a.f$b */
    private static class C2894b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public AppCompatCheckBox f9339a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f9340b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextView f9341c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CardView f9342d;

        private C2894b() {
        }
    }

    public C2892f(Context context, List<C3021g0> list, C2976i iVar) {
        super(context, C2722R.layout.rv_student_item, list);
        this.f9333f = context;
        this.f9334g = list;
        this.f9338k = iVar;
    }

    /* renamed from: a */
    private boolean m12485a() {
        for (C3021g0 e : this.f9334g) {
            if (!e.mo10510e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public Map mo10218b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C3021g0 next : this.f9334g) {
            if (next.mo10510e()) {
                arrayList.add(next.mo10509d());
                arrayList2.add(next.mo10507b());
            }
        }
        hashMap.put("ids", arrayList);
        hashMap.put("numbers", arrayList2);
        return hashMap;
    }

    /* renamed from: c */
    public /* synthetic */ void mo10219c(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            this.f9334g.get(((Integer) compoundButton.getTag()).intValue()).mo10511f(z);
            this.f9337j = false;
            if (z || !this.f9335h) {
                this.f9338k.mo577p(m12485a());
            } else {
                this.f9338k.mo575m(z);
            }
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo10220d(C2894b bVar, View view) {
        if (!view.isPressed()) {
            return;
        }
        if (C3101n.m13328w(this.f9333f)) {
            new C2873l(this.f9333f, this.f9334g.get(((Integer) bVar.f9339a.getTag()).intValue()).mo10509d()).mo10203h();
        } else {
            C3101n.m13303R(this.f9333f);
        }
    }

    /* renamed from: e */
    public void mo10221e(boolean z) {
        this.f9335h = z;
        this.f9336i = !z;
        this.f9337j = true;
        for (C3021g0 f : this.f9334g) {
            f.mo10511f(z);
        }
        notifyDataSetChanged();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2894b bVar;
        boolean z = false;
        if (view == null) {
            C2894b bVar2 = new C2894b();
            View inflate = LayoutInflater.from(getContext()).inflate(C2722R.layout.rv_student_item, viewGroup, false);
            AppCompatCheckBox unused = bVar2.f9339a = (AppCompatCheckBox) inflate.findViewById(C2722R.C2724id.cb_selection);
            TextView unused2 = bVar2.f9340b = (TextView) inflate.findViewById(C2722R.C2724id.tv_student_id);
            TextView unused3 = bVar2.f9341c = (TextView) inflate.findViewById(C2722R.C2724id.tv_student_name);
            CardView unused4 = bVar2.f9342d = (CardView) inflate.findViewById(C2722R.C2724id.cv_item_parent);
            inflate.setTag(bVar2);
            View view2 = inflate;
            bVar = bVar2;
            view = view2;
        } else {
            bVar = (C2894b) view.getTag();
        }
        C3021g0 g0Var = this.f9334g.get(i);
        if (this.f9335h && this.f9337j) {
            z = true;
        } else if (!this.f9336i || !this.f9337j) {
            z = g0Var.mo10510e();
        }
        this.f9334g.get(i).mo10511f(z);
        bVar.f9339a.setTag(Integer.valueOf(i));
        bVar.f9339a.setChecked(z);
        bVar.f9340b.setText(g0Var.mo10508c());
        bVar.f9341c.setText(g0Var.mo10506a());
        bVar.f9339a.setOnCheckedChangeListener(new C2887c(this));
        bVar.f9342d.setOnClickListener(new C2886b(this, bVar));
        return view;
    }
}
