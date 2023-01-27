package p048d.p049a.p050a.p051a.p060i.p062b;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.fragment.app.C0636d;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p057f.C2851q;
import p048d.p049a.p050a.p051a.p060i.p061a.C2895g;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3019f0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3047w;
import p048d.p049a.p050a.p051a.p071o.p072a.C3049y;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p086f.p111h.p112e.C3267a;
import p370l.p371a.p372a.p373a.C6092b;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.i.b.j0 */
public class C2921j0 extends C2961b implements View.OnClickListener {

    /* renamed from: d0 */
    private C2971d f9395d0;

    /* renamed from: e0 */
    private C2851q f9396e0;

    /* renamed from: f0 */
    private Context f9397f0;

    /* renamed from: g0 */
    private int f9398g0 = -1;

    /* renamed from: h0 */
    private int f9399h0 = -1;

    /* renamed from: i0 */
    private int f9400i0 = -1;

    /* renamed from: j0 */
    private int f9401j0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C0636d f9402k0;

    /* renamed from: l0 */
    private int f9403l0 = 0;

    /* renamed from: m0 */
    private MenuItem f9404m0;

    /* renamed from: d.a.a.a.i.b.j0$a */
    class C2922a implements C6314d<C3049y> {
        C2922a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3049y> bVar, C6372r<C3049y> rVar) {
            C3049y a;
            C2921j0.this.mo10294J1();
            if (!rVar.mo17995d() || (a = rVar.mo17993a()) == null || a.mo10625a().booleanValue()) {
                C3101n.m13321p().mo10700U(C2921j0.this.f9402k0, C2921j0.this.mo3169S(C2722R.string.no_data_found));
            } else {
                C2921j0.this.m12573b2(a);
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3049y> bVar, Throwable th) {
            C2921j0.this.mo10294J1();
            C3101n.m13321p().mo10700U(C2921j0.this.f9402k0, C2921j0.this.mo3169S(C2722R.string.no_data_found));
            th.printStackTrace();
        }
    }

    /* renamed from: d.a.a.a.i.b.j0$b */
    class C2923b implements C6314d<C3019f0> {
        C2923b() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3019f0> bVar, C6372r<C3019f0> rVar) {
            C3019f0 a;
            C2921j0.this.mo10294J1();
            if (!rVar.mo17995d() || (a = rVar.mo17993a()) == null || a.mo10504b().booleanValue()) {
                C3101n.m13321p().mo10700U(C2921j0.this.f9402k0, C2921j0.this.mo3169S(C2722R.string.sms_sent_failed));
            } else {
                C3101n.m13321p().mo10700U(C2921j0.this.f9402k0, a.mo10503a());
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3019f0> bVar, Throwable th) {
            C2921j0.this.mo10294J1();
            C3101n.m13321p().mo10700U(C2921j0.this.f9402k0, C2921j0.this.mo3169S(C2722R.string.sms_sent_failed));
            th.printStackTrace();
        }
    }

    static {
        Class<C2921j0> cls = C2921j0.class;
        Class<C2921j0> cls2 = C2921j0.class;
    }

    /* renamed from: O1 */
    private boolean m12569O1(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        try {
            return simpleDateFormat.parse(str).after(simpleDateFormat.parse(str2));
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: P1 */
    private void m12570P1(int i) {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10638h(C3097j.f9871c.mo10610a(), C3097j.f9871c.mo10611b(), BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), this.f9396e0.f9156l.f9063b.getText().toString(), this.f9396e0.f9149e.getText().toString(), this.f9396e0.f9151g.getText().toString(), this.f9396e0.f9150f.getText().toString(), this.f9396e0.f9152h.getText().toString(), BuildConfig.FLAVOR + this.f9396e0.f9158n.isChecked(), BuildConfig.FLAVOR + i).mo17940X(new C2922a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public void m12573b2(C3049y yVar) {
        Button button;
        List<C3047w> b = yVar.mo10626b();
        this.f9396e0.f9157m.setAdapter(new C2895g(b, new C2947n(this)));
        if (b.size() > 0) {
            m12576e2(true);
            if (b.size() >= 10) {
                this.f9396e0.f9153i.setVisibility(0);
                this.f9396e0.f9146b.setEnabled(true);
                if (this.f9403l0 > 0) {
                    this.f9396e0.f9147c.setEnabled(true);
                    return;
                }
                button = this.f9396e0.f9147c;
            } else if (this.f9403l0 > 0) {
                button = this.f9396e0.f9146b;
            } else {
                this.f9396e0.f9153i.setVisibility(8);
                return;
            }
            button.setEnabled(false);
            return;
        }
        C3101n.m13321p().mo10700U(this.f9402k0, mo3169S(C2722R.string.no_data_found));
    }

    /* renamed from: c2 */
    public static C2921j0 m12574c2() {
        return new C2921j0();
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public void m12575d2(C3047w wVar) {
        mo10296L1(mo3169S(C2722R.string.sending_sms));
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVar.mo10623h());
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10641k(C3097j.f9871c.mo10610a(), C3097j.f9871c.mo10611b(), BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), BuildConfig.FLAVOR + arrayList.toString(), wVar.mo10620e(), wVar.mo10622g(), wVar.mo10619d(), "true", "false").mo17940X(new C2923b());
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public void m12576e2(boolean z) {
        MenuItem menuItem;
        int i;
        Context context;
        if (z) {
            this.f9396e0.f9155k.setVisibility(8);
            menuItem = this.f9404m0;
            context = this.f9397f0;
            i = C2722R.C2723drawable.ic_arrow_up;
        } else {
            this.f9396e0.f9155k.setVisibility(0);
            menuItem = this.f9404m0;
            context = this.f9397f0;
            i = C2722R.C2723drawable.ic_arrow_down;
        }
        menuItem.setIcon(C3267a.m14076f(context, i));
    }

    /* renamed from: f2 */
    private boolean m12577f2() {
        C3101n p;
        C0636d dVar;
        int i;
        if (this.f9396e0.f9159o.isChecked() && !this.f9396e0.f9149e.getText().toString().isEmpty() && !this.f9396e0.f9151g.getText().toString().isEmpty()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            try {
                Date parse = simpleDateFormat.parse(this.f9396e0.f9149e.getText().toString());
                if (parse.getTime() > simpleDateFormat.parse(this.f9396e0.f9151g.getText().toString()).getTime()) {
                    C3101n.m13321p().mo10700U(this.f9402k0, mo3169S(C2722R.string.start_date_cannot_be_after_to_date));
                    return false;
                } else if (parse.getTime() >= C3101n.m13317k(30).getTime()) {
                    return true;
                } else {
                    C3101n.m13321p().mo10700U(this.f9402k0, mo3169S(C2722R.string.start_date_must_be_within_n_days));
                    return false;
                }
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }
        } else if (!this.f9396e0.f9160p.isChecked()) {
            return true;
        } else {
            String obj = this.f9396e0.f9150f.getText().toString();
            String obj2 = this.f9396e0.f9152h.getText().toString();
            if (obj.isEmpty()) {
                p = C3101n.m13321p();
                dVar = this.f9402k0;
                i = C2722R.string.from_time_cannot_be_empty;
            } else if (obj2.isEmpty()) {
                p = C3101n.m13321p();
                dVar = this.f9402k0;
                i = C2722R.string.to_time_cannot_be_empty;
            } else if (!m12569O1(obj, obj2)) {
                return true;
            } else {
                p = C3101n.m13321p();
                dVar = this.f9402k0;
                i = C2722R.string.start_time_cannot_be_after_to_time;
            }
            p.mo10700U(dVar, mo3169S(i));
            return false;
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        boolean z = false;
        C6550a.m26771a("onItemClicked", new Object[0]);
        if (menuItem.getItemId() != C2722R.C2724id.action_toggle_top) {
            return super.mo396D0(menuItem);
        }
        if (this.f9396e0.f9155k.getVisibility() != 8) {
            z = true;
        }
        m12576e2(z);
        return true;
    }

    /* renamed from: H0 */
    public void mo3149H0(Menu menu) {
        super.mo3149H0(menu);
        C6550a.m26771a("onPrepared", new Object[0]);
        this.f9404m0 = menu.findItem(C2722R.C2724id.action_toggle_top);
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9397f0, 1, false);
        this.f9396e0.f9157m.setHasFixedSize(true);
        this.f9396e0.f9157m.setLayoutManager(linearLayoutManager);
        this.f9396e0.f9150f.setOnClickListener(this);
        this.f9396e0.f9152h.setOnClickListener(this);
        this.f9396e0.f9148d.setOnClickListener(new C2937m(this));
        this.f9396e0.f9159o.setOnCheckedChangeListener(new C2949p(this));
        this.f9396e0.f9160p.setOnCheckedChangeListener(new C2950q(this));
        this.f9396e0.f9147c.setOnClickListener(new C2920j(this));
        this.f9396e0.f9146b.setOnClickListener(new C2948o(this));
        C6092b.m24861c(this.f9402k0, new C2916i(this));
    }

    /* renamed from: R1 */
    public /* synthetic */ void mo10239R1(Date date) {
        if (date != null) {
            this.f9396e0.f9149e.setText(C3101n.m13320n(date, "yyyy-MM-dd"));
        }
    }

    /* renamed from: S1 */
    public /* synthetic */ void mo10240S1(Date date) {
        if (date != null) {
            this.f9396e0.f9151g.setText(C3101n.m13320n(date, "yyyy-MM-dd"));
        }
    }

    /* renamed from: T1 */
    public /* synthetic */ void mo10241T1(int i, int i2) {
        if (i != -1) {
            this.f9398g0 = i;
            this.f9399h0 = i2;
            this.f9396e0.f9150f.setText(String.format("%s:%s:00", new Object[]{C3101n.m13323r(i), C3101n.m13323r(i2)}));
        }
    }

    /* renamed from: U1 */
    public /* synthetic */ void mo10242U1(int i, int i2) {
        if (i != -1) {
            this.f9400i0 = i;
            this.f9401j0 = i2;
            this.f9396e0.f9152h.setText(String.format("%s:%s:00", new Object[]{C3101n.m13323r(i), C3101n.m13323r(i2)}));
        }
    }

    /* renamed from: V1 */
    public /* synthetic */ void mo10243V1(View view) {
        C3101n.m13326u(this.f9396e0.f9156l.f9063b, this.f9402k0);
        if (m12577f2()) {
            m12570P1(0);
        }
    }

    /* renamed from: W1 */
    public /* synthetic */ void mo10244W1(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            this.f9396e0.f9160p.toggle();
        }
        EditText editText = this.f9396e0.f9149e;
        if (z) {
            editText.setOnClickListener(this);
            this.f9396e0.f9151g.setOnClickListener(this);
            return;
        }
        editText.setOnClickListener((View.OnClickListener) null);
        this.f9396e0.f9151g.setOnClickListener((View.OnClickListener) null);
        this.f9396e0.f9149e.setText(BuildConfig.FLAVOR);
        this.f9396e0.f9151g.setText(BuildConfig.FLAVOR);
    }

    /* renamed from: X1 */
    public /* synthetic */ void mo10245X1(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            this.f9396e0.f9159o.toggle();
        }
        EditText editText = this.f9396e0.f9150f;
        if (z) {
            editText.setOnClickListener(this);
            this.f9396e0.f9152h.setOnClickListener(this);
            return;
        }
        editText.setOnClickListener((View.OnClickListener) null);
        this.f9396e0.f9152h.setOnClickListener((View.OnClickListener) null);
        this.f9396e0.f9150f.setText(BuildConfig.FLAVOR);
        this.f9396e0.f9152h.setText(BuildConfig.FLAVOR);
        this.f9398g0 = -1;
        this.f9399h0 = -1;
        this.f9400i0 = -1;
        this.f9401j0 = -1;
    }

    /* renamed from: Y1 */
    public /* synthetic */ void mo10246Y1(View view) {
        if (this.f9403l0 < 10) {
            this.f9403l0 = 0;
            this.f9396e0.f9147c.setEnabled(false);
        }
        this.f9403l0 -= 10;
        if (C3101n.m13328w(this.f9397f0)) {
            C3101n.m13326u(this.f9396e0.f9156l.f9063b, this.f9402k0);
            if (m12577f2()) {
                m12570P1(this.f9403l0);
                return;
            }
            return;
        }
        C3101n.m13303R(this.f9397f0);
    }

    /* renamed from: Z1 */
    public /* synthetic */ void mo10247Z1(View view) {
        this.f9403l0 += 10;
        if (C3101n.m13328w(this.f9397f0)) {
            C3101n.m13326u(this.f9396e0.f9156l.f9063b, this.f9402k0);
            if (m12577f2()) {
                m12570P1(this.f9403l0);
                return;
            }
            return;
        }
        C3101n.m13303R(this.f9397f0);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9395d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.message_outbox));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        p048d.p049a.p050a.p051a.p078s.C3101n.m13307W(r5, r1, r2, true, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        p048d.p049a.p050a.p051a.p078s.C3101n.m13312e(r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
            r4 = this;
            int r5 = r5.getId()
            r0 = 1
            java.lang.String r1 = "yyyy-MM-dd"
            switch(r5) {
                case 2131362072: goto L_0x003e;
                case 2131362073: goto L_0x002f;
                case 2131362083: goto L_0x0017;
                case 2131362084: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0058
        L_0x000b:
            android.content.Context r5 = r4.f9397f0
            int r1 = r4.f9400i0
            int r2 = r4.f9401j0
            d.a.a.a.i.b.h r3 = new d.a.a.a.i.b.h
            r3.<init>(r4)
            goto L_0x003a
        L_0x0017:
            android.content.Context r5 = r4.f9397f0
            d.a.a.a.f.q r0 = r4.f9396e0
            android.widget.EditText r0 = r0.f9151g
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.util.Date r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13316j(r0, r1)
            d.a.a.a.i.b.g r1 = new d.a.a.a.i.b.g
            r1.<init>(r4)
            goto L_0x0055
        L_0x002f:
            android.content.Context r5 = r4.f9397f0
            int r1 = r4.f9398g0
            int r2 = r4.f9399h0
            d.a.a.a.i.b.l r3 = new d.a.a.a.i.b.l
            r3.<init>(r4)
        L_0x003a:
            p048d.p049a.p050a.p051a.p078s.C3101n.m13307W(r5, r1, r2, r0, r3)
            goto L_0x0058
        L_0x003e:
            android.content.Context r5 = r4.f9397f0
            d.a.a.a.f.q r0 = r4.f9396e0
            android.widget.EditText r0 = r0.f9149e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.util.Date r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13316j(r0, r1)
            d.a.a.a.i.b.k r1 = new d.a.a.a.i.b.k
            r1.<init>(r4)
        L_0x0055:
            p048d.p049a.p050a.p051a.p078s.C3101n.m13312e(r5, r0, r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p060i.p062b.C2921j0.onClick(android.view.View):void");
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        mo3236v1(true);
    }

    /* renamed from: s0 */
    public void mo397s0(Menu menu, MenuInflater menuInflater) {
        super.mo397s0(menu, menuInflater);
        C6550a.m26771a("onCreate", new Object[0]);
        menuInflater.inflate(C2722R.C2725menu.menu_outbox, menu);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9396e0 = C2851q.m12393c(layoutInflater);
        this.f9397f0 = mo3242y();
        this.f9402k0 = mo3215o();
        return this.f9396e0.mo10177b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9395d0 = null;
    }
}
