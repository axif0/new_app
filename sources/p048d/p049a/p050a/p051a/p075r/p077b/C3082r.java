package p048d.p049a.p050a.p051a.p075r.p077b;

import academia.bracu.com.academia.service.C0175b;
import academia.bracu.com.academia.service.C0176c;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C0636d;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.io.File;
import java.util.List;
import java.util.Locale;
import p048d.p049a.p050a.p051a.p052c.C2802e;
import p048d.p049a.p050a.p051a.p052c.C2805f;
import p048d.p049a.p050a.p051a.p052c.C2818l;
import p048d.p049a.p050a.p051a.p057f.C2859y;
import p048d.p049a.p050a.p051a.p059h.C2882e;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2976i;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3027j0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3029k0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3030l;
import p048d.p049a.p050a.p051a.p071o.p072a.C3031l0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3038p;
import p048d.p049a.p050a.p051a.p071o.p072a.C3041q0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3048x;
import p048d.p049a.p050a.p051a.p071o.p072a.C3050z;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p340io.realm.C5648d0;
import p340io.realm.C5781q;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: d.a.a.a.r.b.r */
public class C3082r extends C2961b {

    /* renamed from: A0 */
    private static String f9815A0;

    /* renamed from: d0 */
    private C2971d f9816d0;

    /* renamed from: e0 */
    private C2969b f9817e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C2976i f9818f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C0636d f9819g0;

    /* renamed from: h0 */
    private NestedScrollView f9820h0;

    /* renamed from: i0 */
    private boolean f9821i0 = true;

    /* renamed from: j0 */
    private boolean f9822j0 = true;

    /* renamed from: k0 */
    private boolean f9823k0 = true;

    /* renamed from: l0 */
    private List<C3050z> f9824l0;

    /* renamed from: m0 */
    private List<C3030l> f9825m0;

    /* renamed from: n0 */
    private List<C3038p> f9826n0;

    /* renamed from: o0 */
    private C2818l f9827o0;

    /* renamed from: p0 */
    private C2802e f9828p0;

    /* renamed from: q0 */
    private C2805f f9829q0;

    /* renamed from: r0 */
    private boolean f9830r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public boolean f9831s0 = true;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C5221f f9832t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public String f9833u0;

    /* renamed from: v0 */
    private C6311b<C3048x> f9834v0;

    /* renamed from: w0 */
    private C5648d0 f9835w0;

    /* renamed from: x0 */
    private C2859y f9836x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public C3029k0 f9837y0;

    /* renamed from: z0 */
    private Snackbar f9838z0;

    /* renamed from: d.a.a.a.r.b.r$a */
    class C3083a extends ClickableSpan {

        /* renamed from: f */
        final /* synthetic */ String f9839f;

        C3083a(String str) {
            this.f9839f = str;
        }

        public void onClick(View view) {
            try {
                C3082r.this.m13237o2(this.f9839f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: d.a.a.a.r.b.r$b */
    class C3084b implements C6314d<C3029k0> {

        /* renamed from: a */
        final /* synthetic */ boolean f9841a;

        C3084b(boolean z) {
            this.f9841a = z;
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3029k0> bVar, C6372r<C3029k0> rVar) {
            if (this.f9841a) {
                C3082r.this.m13228a2(true);
            } else {
                C3082r.this.mo10294J1();
            }
            if (rVar.mo17995d()) {
                C3029k0 unused = C3082r.this.f9837y0 = rVar.mo17993a();
                if (C3082r.this.f9837y0 == null || C3082r.this.f9837y0.mo10536e().booleanValue()) {
                    C3082r.this.m13240r2(true);
                    return;
                }
                C3001i.m12806f(C3082r.this.f9819g0).mo10346e(C3097j.f9871c.mo10614e().longValue(), C3082r.this.f9833u0, C3082r.this.f9832t0.mo15349r(C3082r.this.f9837y0));
                boolean unused2 = C3082r.this.f9831s0 = false;
                C3082r.this.f9818f0.mo575m(C3082r.this.f9831s0);
                C3082r rVar2 = C3082r.this;
                rVar2.m13234l2(rVar2.f9837y0);
                return;
            }
            C3082r.this.m13240r2(false);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3029k0> bVar, Throwable th) {
            C3082r.this.mo10294J1();
            th.printStackTrace();
            C3082r.this.m13240r2(false);
        }
    }

    /* renamed from: d.a.a.a.r.b.r$c */
    class C3085c implements C6314d<C3048x> {

        /* renamed from: a */
        final /* synthetic */ boolean f9843a;

        C3085c(boolean z) {
            this.f9843a = z;
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3048x> bVar, C6372r<C3048x> rVar) {
            C3048x a;
            if (this.f9843a) {
                C3082r.this.mo10294J1();
            }
            if (rVar.mo17995d() && (a = rVar.mo17993a()) != null && a.mo10624a() != null && a.mo10624a().size() > 0) {
                C3082r.this.m13232e2(a);
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3048x> bVar, Throwable th) {
            if (this.f9843a) {
                C3082r.this.mo10294J1();
            }
            th.printStackTrace();
        }
    }

    static {
        Class<C3082r> cls = C3082r.class;
    }

    /* renamed from: Z1 */
    private void m13227Z1(boolean z) {
        String str;
        String c;
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        C3029k0 k0Var = this.f9837y0;
        if (!(k0Var == null || (c = k0Var.mo10534c()) == null || c.isEmpty())) {
            String str2 = f9815A0;
            File file = new File(str2, this.f9837y0.mo10538g().get(0).mo10526f() + ".png");
            if (file.exists() && BitmapFactory.decodeFile(file.getAbsolutePath()) != null) {
                str = "true";
                String str3 = str;
                String a = C3097j.f9871c.mo10610a();
                String b = C3097j.f9871c.mo10611b();
                ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10631a(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), "true", str3).mo17940X(new C3084b(z));
            }
        }
        str = "false";
        String str32 = str;
        String a2 = C3097j.f9871c.mo10610a();
        String b2 = C3097j.f9871c.mo10611b();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10631a(a2, b2, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), "true", str32).mo17940X(new C3084b(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m13228a2(boolean z) {
        String a = C3097j.f9871c.mo10610a();
        String b = C3097j.f9871c.mo10611b();
        C6311b<C3048x> m = ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10643m(a, b, BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), String.valueOf(0), "received");
        this.f9834v0 = m;
        m.mo17940X(new C3085c(z));
    }

    /* renamed from: b2 */
    private void m13229b2() {
        String S = mo3169S(C2722R.string.feedback_email);
        String str = mo3169S(C2722R.string.profile_data_precaution_message) + " ";
        String str2 = str + S;
        this.f9836x0.f9239E.setText(str2);
        SpannableString spannableString = new SpannableString(str2);
        C3083a aVar = new C3083a(S);
        int length = str.length();
        spannableString.setSpan(aVar, length, S.length() + length, 33);
        this.f9836x0.f9239E.setText(spannableString);
        this.f9836x0.f9239E.setMovementMethod(LinkMovementMethod.getInstance());
        this.f9836x0.f9239E.setHighlightColor(mo3158M().getColor(C2722R.color.colorAccent));
    }

    /* renamed from: c2 */
    private void m13230c2(View view) {
        int i;
        LinearLayout linearLayout;
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(C2722R.C2724id.nsv_profile_parent_layout);
        this.f9820h0 = nestedScrollView;
        nestedScrollView.setAlpha(0.01f);
        View view2 = new View(this.f9819g0);
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        if (C3099l.m13277b(this.f9819g0).mo10689a("enable_show_cgpa")) {
            linearLayout = this.f9836x0.f9252i;
            i = 0;
        } else {
            linearLayout = this.f9836x0.f9252i;
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.f9836x0.f9259p.addFooterView(view2);
        this.f9836x0.f9261r.addFooterView(view2);
        if (this.f9836x0.f9255l.getVisibility() == 0) {
            this.f9836x0.f9260q.addFooterView(view2);
            this.f9836x0.f9248e.setOnClickListener(new C3066k(this));
        }
        this.f9836x0.f9246c.setOnClickListener(new C3065j(this));
        this.f9836x0.f9247d.setOnClickListener(new C3062g(this));
        try {
            m13229b2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d2 */
    private void m13231d2(boolean z, boolean z2) {
        C3006c a = C3001i.m12806f(this.f9819g0).mo10344a(C3097j.f9871c.mo10614e().longValue(), this.f9833u0);
        if (a != null) {
            this.f9837y0 = (C3029k0) this.f9832t0.mo15341i(a.mo10416U(), C3029k0.class);
        }
        if (!this.f9830r0 && !z2) {
            C3029k0 k0Var = this.f9837y0;
            if (k0Var != null) {
                m13234l2(k0Var);
            }
        } else if (C3101n.m13328w(this.f9819g0)) {
            m13227Z1(z);
        } else {
            C3029k0 k0Var2 = this.f9837y0;
            if (k0Var2 != null) {
                m13234l2(k0Var2);
            }
            this.f9818f0.mo575m(this.f9831s0);
            this.f9838z0 = C3101n.m13306V(this.f9819g0, mo3169S(C2722R.string.internet_connection_warning_message), mo3169S(C2722R.string.text_retry), new C3063h(this, z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public void m13232e2(C3048x xVar) {
        for (C3041q0 next : xVar.mo10624a()) {
            if (next.mo10596e() != null && !next.mo10596e().isEmpty() && next.mo10595d() != null && !next.mo10595d().isEmpty() && !C3002j.m12812k(this.f9819g0).mo10352f(next.mo10592a().longValue())) {
                next.mo10597f(next.mo10594c() + " 00:00:00");
                C3007d a = C3002j.m12812k(this.f9819g0).mo10347a(C3097j.f9871c.mo10614e().longValue(), next);
                if (a != null) {
                    this.f9835w0.mo16275m0(new C3067l(a));
                }
            }
        }
        this.f9817e0.mo428t();
    }

    /* renamed from: j2 */
    static /* synthetic */ void m13233j2(C3007d dVar, C5648d0 d0Var) {
        C3007d dVar2 = (C3007d) d0Var.mo16272g0(dVar, new C5781q[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m13234l2(C3029k0 k0Var) {
        Bitmap decodeFile;
        Bitmap decodeFile2;
        if (k0Var.mo10538g() != null && k0Var.mo10538g().size() > 0) {
            C3027j0 j0Var = k0Var.mo10538g().get(0);
            String c = k0Var.mo10534c();
            if (c == null || c.isEmpty()) {
                String str = f9815A0;
                File file = new File(str, j0Var.mo10526f() + ".png");
                if (file.exists() && (decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath())) != null) {
                    this.f9836x0.f9249f.setImageBitmap(decodeFile);
                }
            } else {
                String str2 = f9815A0;
                File file2 = new File(str2, j0Var.mo10526f() + ".png");
                if (!file2.exists() || (decodeFile2 = BitmapFactory.decodeFile(file2.getAbsolutePath())) == null) {
                    m13236n2(j0Var, c);
                } else {
                    this.f9836x0.f9249f.setImageBitmap(decodeFile2);
                }
            }
            this.f9836x0.f9242H.setText(j0Var.mo10526f());
            this.f9836x0.f9240F.setText(j0Var.mo10522b());
            this.f9836x0.f9241G.setText(j0Var.mo10527g());
            this.f9836x0.f9268y.setText(j0Var.mo10523c());
            this.f9836x0.f9266w.setText(j0Var.mo10521a());
            if (j0Var.mo10528h() == null || j0Var.mo10528h().isEmpty()) {
                this.f9836x0.f9237C.setVisibility(0);
                this.f9836x0.f9254k.setVisibility(8);
            } else {
                this.f9836x0.f9236B.setText(j0Var.mo10528h());
                this.f9836x0.f9269z.setText(j0Var.mo10525e());
                this.f9836x0.f9235A.setText(C3101n.m13318l(j0Var.mo10524d(), "yyyy-MM-dd HH:mm:ss"));
                this.f9836x0.f9237C.setVisibility(8);
                this.f9836x0.f9254k.setVisibility(0);
            }
            C2969b bVar = this.f9817e0;
            if (bVar != null) {
                bVar.mo424n(C2882e.PROFILE);
            }
        }
        if (this.f9831s0) {
            this.f9836x0.f9245b.setVisibility(8);
            this.f9836x0.f9250g.setVisibility(8);
            this.f9836x0.f9239E.setVisibility(8);
        } else {
            this.f9836x0.f9245b.setVisibility(0);
            this.f9836x0.f9250g.setVisibility(0);
            this.f9836x0.f9239E.setVisibility(0);
            if (k0Var.mo10539h() == null || k0Var.mo10539h().size() <= 0) {
                this.f9836x0.f9263t.setText("0");
                this.f9836x0.f9264u.setText("0");
                this.f9836x0.f9265v.setText("0");
            } else {
                C3031l0 l0Var = k0Var.mo10539h().get(0);
                this.f9836x0.f9263t.setText(String.format(Locale.getDefault(), "%s", new Object[]{l0Var.mo10546b()}));
                this.f9836x0.f9264u.setText(String.format(Locale.getDefault(), "%s", new Object[]{l0Var.mo10547c()}));
                this.f9836x0.f9265v.setText(String.format("%s", new Object[]{l0Var.mo10545a()}));
            }
            List<C3030l> a = k0Var.mo10532a();
            this.f9825m0 = a;
            if (a == null || a.size() <= 0) {
                this.f9836x0.f9243I.setVisibility(0);
                this.f9836x0.f9258o.setVisibility(8);
            } else {
                if (this.f9825m0.size() > 1) {
                    this.f9828p0 = new C2802e(this.f9819g0, this.f9825m0.subList(0, 1));
                    this.f9836x0.f9246c.setVisibility(0);
                } else {
                    this.f9828p0 = new C2802e(this.f9819g0, this.f9825m0);
                    this.f9836x0.f9246c.setVisibility(8);
                }
                this.f9836x0.f9261r.setAdapter(this.f9828p0);
                this.f9836x0.f9243I.setVisibility(8);
                this.f9836x0.f9258o.setVisibility(0);
            }
            List<C3038p> b = k0Var.mo10533b();
            this.f9826n0 = b;
            if (b == null || b.size() <= 0) {
                this.f9836x0.f9267x.setVisibility(0);
                this.f9836x0.f9253j.setVisibility(8);
            } else {
                if (this.f9826n0.size() > 1) {
                    this.f9829q0 = new C2805f(this.f9819g0, this.f9826n0.subList(0, 1));
                    this.f9836x0.f9247d.setVisibility(0);
                } else {
                    this.f9829q0 = new C2805f(this.f9819g0, this.f9826n0);
                    this.f9836x0.f9247d.setVisibility(8);
                }
                this.f9836x0.f9259p.setAdapter(this.f9829q0);
                this.f9836x0.f9267x.setVisibility(8);
                this.f9836x0.f9253j.setVisibility(0);
            }
            if (this.f9836x0.f9255l.getVisibility() == 0) {
                List<C3050z> f = k0Var.mo10537f();
                this.f9824l0 = f;
                if (f == null || f.size() <= 0) {
                    this.f9836x0.f9238D.setVisibility(0);
                    this.f9836x0.f9256m.setVisibility(8);
                } else {
                    if (this.f9824l0.size() > 1) {
                        this.f9827o0 = new C2818l(this.f9819g0, this.f9824l0.subList(0, 1));
                        this.f9836x0.f9248e.setVisibility(0);
                    } else {
                        this.f9827o0 = new C2818l(this.f9819g0, this.f9824l0);
                        this.f9836x0.f9248e.setVisibility(8);
                    }
                    this.f9836x0.f9260q.setAdapter(this.f9827o0);
                    this.f9836x0.f9238D.setVisibility(8);
                    this.f9836x0.f9256m.setVisibility(0);
                }
            }
        }
        this.f9820h0.setAlpha(1.0f);
    }

    /* renamed from: m2 */
    public static C3082r m13235m2(boolean z, boolean z2) {
        C3082r rVar = new C3082r();
        rVar.m13238p2(z, z2);
        return rVar;
    }

    /* renamed from: n2 */
    private void m13236n2(C3027j0 j0Var, String str) {
        byte[] decode = Base64.decode(str, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        if (decodeByteArray != null) {
            this.f9836x0.f9249f.setImageBitmap(decodeByteArray);
            try {
                C3101n.m13298L(decodeByteArray, j0Var.mo10526f(), "images");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public void m13237o2(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, (String) null));
        intent.putExtra("android.intent.extra.SUBJECT", "Inquery");
        intent.putExtra("android.intent.extra.TEXT", "Dear, <br/>");
        this.f9819g0.startActivity(Intent.createChooser(intent, "Send email"));
    }

    /* renamed from: p2 */
    private void m13238p2(boolean z, boolean z2) {
        this.f9830r0 = z;
        if (!z) {
            this.f9831s0 = z2;
        }
    }

    /* renamed from: q2 */
    private void m13239q2(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            int i = 0;
            for (int i2 = 0; i2 < count; i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                view.measure(View.MeasureSpec.makeMeasureSpec((int) (listView.getResources().getDisplayMetrics().density * 500.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                i += view.getMeasuredHeight();
            }
            int dividerHeight = listView.getDividerHeight() * (count - 1);
            int paddingTop = listView.getPaddingTop() + listView.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = i + dividerHeight + paddingTop;
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m13240r2(boolean z) {
        if (z) {
            Toast.makeText(this.f9819g0, mo3169S(C2722R.string.no_data_found), 1).show();
        } else {
            C3101n.m13300N(this.f9819g0, mo3169S(C2722R.string.student_profile_cannot_be_loaded));
        }
        if (this.f9837y0 != null) {
            this.f9831s0 = true;
            this.f9818f0.mo575m(true);
            m13234l2(this.f9837y0);
        }
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_refresh) {
            return super.mo396D0(menuItem);
        }
        if (!C3101n.m13328w(this.f9819g0)) {
            C3101n.m13303R(this.f9819g0);
            return true;
        }
        m13231d2(false, true);
        return true;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        File dir = new ContextWrapper(this.f9819g0.getApplicationContext()).getDir("images", 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        f9815A0 = dir.toString();
        m13230c2(view);
        this.f9835w0 = C3002j.m12812k(this.f9819g0).mo10351e();
        this.f9832t0 = new C5221f();
        this.f9833u0 = mo3169S(C2722R.string.endpoint_student_profile);
        m13231d2(true, false);
        new Handler().postDelayed(new C3064i(this), 200);
    }

    /* renamed from: f2 */
    public /* synthetic */ void mo10673f2(View view) {
        if (this.f9821i0) {
            this.f9821i0 = false;
            this.f9836x0.f9248e.setImageResource(C2722R.C2723drawable.ic_arrow_up_white);
            this.f9827o0 = new C2818l(this.f9819g0, this.f9824l0);
        } else {
            this.f9821i0 = true;
            this.f9836x0.f9248e.setImageResource(C2722R.C2723drawable.ic_arrow_down_white);
            this.f9827o0 = new C2818l(this.f9819g0, this.f9824l0.subList(0, 1));
        }
        this.f9836x0.f9260q.setAdapter(this.f9827o0);
        m13239q2(this.f9836x0.f9260q);
    }

    /* renamed from: g2 */
    public /* synthetic */ void mo10674g2(View view) {
        if (this.f9822j0) {
            this.f9822j0 = false;
            this.f9836x0.f9246c.setImageResource(C2722R.C2723drawable.ic_arrow_up_white);
            this.f9828p0 = new C2802e(this.f9819g0, this.f9825m0);
        } else {
            this.f9822j0 = true;
            this.f9836x0.f9246c.setImageResource(C2722R.C2723drawable.ic_arrow_down_white);
            this.f9828p0 = new C2802e(this.f9819g0, this.f9825m0.subList(0, 1));
        }
        this.f9836x0.f9261r.setAdapter(this.f9828p0);
        m13239q2(this.f9836x0.f9261r);
    }

    /* renamed from: h2 */
    public /* synthetic */ void mo10675h2(View view) {
        if (this.f9823k0) {
            this.f9823k0 = false;
            this.f9836x0.f9247d.setImageResource(C2722R.C2723drawable.ic_arrow_up_white);
            this.f9829q0 = new C2805f(this.f9819g0, this.f9826n0);
        } else {
            this.f9823k0 = true;
            this.f9836x0.f9247d.setImageResource(C2722R.C2723drawable.ic_arrow_down_white);
            this.f9829q0 = new C2805f(this.f9819g0, this.f9826n0.subList(0, 1));
        }
        this.f9836x0.f9259p.setAdapter(this.f9829q0);
        m13239q2(this.f9836x0.f9259p);
    }

    /* renamed from: i2 */
    public /* synthetic */ void mo10676i2(boolean z, View view) {
        m13231d2(z, false);
    }

    /* renamed from: k2 */
    public /* synthetic */ void mo10677k2() {
        C0176c cVar;
        String d = C3099l.m13277b(this.f9819g0).mo10691d(mo3169S(C2722R.string.single_push_notification));
        if (!d.isEmpty() && (cVar = (C0176c) new C5221f().mo15341i(d, C0176c.class)) != null) {
            C3099l.m13277b(this.f9819g0).mo10696i(mo3169S(C2722R.string.single_push_notification), BuildConfig.FLAVOR);
            C0175b c2 = C0175b.m634c2(cVar);
            c2.mo3289S1(false);
            c2.mo3292W1(mo3240x(), C0175b.f608r0);
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9816d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.menu_my_profile));
            if (context instanceof C2969b) {
                this.f9817e0 = (C2969b) context;
                if (context instanceof C2976i) {
                    this.f9818f0 = (C2976i) context;
                    return;
                }
                throw new RuntimeException(context.toString() + " must implement OnToggledListener");
            }
            throw new RuntimeException(context.toString() + " must implement OnDataChangedListener");
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        mo3236v1(true);
    }

    /* renamed from: s0 */
    public void mo397s0(Menu menu, MenuInflater menuInflater) {
        super.mo397s0(menu, menuInflater);
        menuInflater.inflate(C2722R.C2725menu.menu_refresh, menu);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9836x0 = C2859y.m12425c(layoutInflater);
        this.f9819g0 = mo3215o();
        return this.f9836x0.mo10185b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9816d0 = null;
        this.f9817e0 = null;
        C6311b<C3048x> bVar = this.f9834v0;
        if (bVar != null) {
            try {
                bVar.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Snackbar snackbar = this.f9838z0;
        if (snackbar != null && snackbar.mo8657G()) {
            try {
                this.f9838z0.mo8667t();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
