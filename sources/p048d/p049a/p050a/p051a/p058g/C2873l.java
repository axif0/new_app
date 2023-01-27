package p048d.p049a.p050a.p051a.p058g;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2845k;
import p048d.p049a.p050a.p051a.p071o.p072a.C3027j0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3029k0;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3418x;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.g.l */
public class C2873l extends Dialog {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Animation f9293f;

    /* renamed from: g */
    private Animation f9294g;

    /* renamed from: h */
    private Animation f9295h;

    /* renamed from: i */
    private Animation f9296i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f9297j;

    /* renamed from: k */
    private Dialog f9298k;

    /* renamed from: l */
    private Integer f9299l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2845k f9300m;

    /* renamed from: d.a.a.a.g.l$a */
    class C2874a implements C6314d<C3029k0> {
        C2874a() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3029k0> bVar, C6372r<C3029k0> rVar) {
            if (rVar.mo17995d()) {
                C3029k0 a = rVar.mo17993a();
                if (a != null) {
                    String c = a.mo10534c();
                    if (c != null && !c.isEmpty()) {
                        byte[] decode = Base64.decode(c, 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        if (decodeByteArray != null) {
                            C2873l.this.f9300m.f9110b.setImageBitmap(decodeByteArray);
                        }
                    }
                    if (a.mo10538g() != null && a.mo10538g().size() > 0) {
                        C3027j0 j0Var = a.mo10538g().get(0);
                        C2873l.this.f9300m.f9121m.setText(j0Var.mo10522b());
                        C2873l.this.f9300m.f9122n.setText(String.format("%s %s", new Object[]{C2873l.this.f9297j.getString(C2722R.string.text_program), j0Var.mo10527g()}));
                        C2873l.this.f9300m.f9120l.setText(String.format("%s %s", new Object[]{C2873l.this.f9297j.getString(C2722R.string.text_cell), j0Var.mo10523c()}));
                        C2873l.this.f9300m.f9118j.setText(String.format("%s %s", new Object[]{C2873l.this.f9297j.getString(C2722R.string.e_mail), j0Var.mo10521a()}));
                        C2873l.this.f9300m.f9119k.setText(String.format("%s %s", new Object[]{C2873l.this.f9297j.getString(C2722R.string.intake), a.mo10535d()}));
                        C2873l.this.f9300m.f9111c.setVisibility(8);
                        C2873l.this.f9300m.f9112d.setVisibility(0);
                        return;
                    }
                    return;
                }
                try {
                    ((Activity) C2873l.this.f9297j).runOnUiThread(new C2864d(this));
                } catch (Exception e) {
                    C3101n.m13300N(C2873l.this.f9297j, C2873l.this.f9297j.getString(C2722R.string.student_profile_cannot_be_loaded));
                    e.printStackTrace();
                }
            } else {
                ((Activity) C2873l.this.f9297j).runOnUiThread(new C2865e(this));
            }
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3029k0> bVar, Throwable th) {
            try {
                ((Activity) C2873l.this.f9297j).runOnUiThread(new C2863c(this));
            } catch (Exception e) {
                C3101n.m13300N(C2873l.this.f9297j, C2873l.this.f9297j.getString(C2722R.string.student_profile_cannot_be_loaded));
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public /* synthetic */ void mo10204c() {
            C2873l.this.f9300m.f9114f.setVisibility(8);
            C2873l.this.f9300m.f9117i.setText(C2722R.string.student_profile_cannot_be_loaded);
        }

        /* renamed from: d */
        public /* synthetic */ void mo10205d() {
            C2873l.this.f9300m.f9111c.setAlpha(1.0f);
            C2873l.this.f9300m.f9111c.startAnimation(C2873l.this.f9293f);
            C2873l.this.f9300m.f9114f.setVisibility(8);
            C2873l.this.f9300m.f9117i.setText(C2722R.string.student_profile_cannot_be_loaded);
        }

        /* renamed from: e */
        public /* synthetic */ void mo10206e() {
            C2873l.this.f9300m.f9114f.setVisibility(8);
            C2873l.this.f9300m.f9117i.setText(C2722R.string.student_profile_cannot_be_loaded);
        }
    }

    static {
        Class<C2873l> cls = C2873l.class;
    }

    public C2873l(Context context, Integer num) {
        super(context);
        this.f9297j = context;
        this.f9299l = num;
    }

    /* renamed from: d */
    private void m12440d() {
        ((C3051a) C3052b.m13111a(this.f9297j.getString(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10640j(C3097j.f9871c.mo10610a(), C3097j.f9871c.mo10611b(), BuildConfig.FLAVOR + C3097j.f9871c.mo10614e(), BuildConfig.FLAVOR + this.f9299l, "false", "true", "false").mo17940X(new C2874a());
    }

    /* renamed from: e */
    public /* synthetic */ void mo10200e() {
        this.f9298k.dismiss();
    }

    /* renamed from: f */
    public /* synthetic */ void mo10201f(View view) {
        this.f9300m.f9115g.startAnimation(this.f9296i);
        this.f9300m.f9110b.startAnimation(this.f9296i);
        this.f9300m.f9110b.setVisibility(8);
        this.f9300m.f9111c.setVisibility(8);
        C3418x c = C3403t.m14630c(this.f9300m.f9115g);
        c.mo11736h(500);
        c.mo11730a(0.0f);
        c.mo11738j();
        new Handler().postDelayed(new C2868h(this), 600);
    }

    /* renamed from: g */
    public /* synthetic */ void mo10202g(DialogInterface dialogInterface) {
        C6550a.m26771a("onShow: ", new Object[0]);
        m12440d();
        this.f9300m.f9110b.setVisibility(0);
        this.f9300m.f9110b.startAnimation(this.f9295h);
        this.f9300m.f9113e.setAlpha(1.0f);
        this.f9300m.f9113e.startAnimation(this.f9294g);
        this.f9300m.f9115g.setAlpha(1.0f);
        this.f9300m.f9115g.startAnimation(this.f9293f);
    }

    /* renamed from: h */
    public void mo10203h() {
        try {
            this.f9298k = new Dialog(this.f9297j, 16973835);
            C2845k c = C2845k.m12369c(getLayoutInflater());
            this.f9300m = c;
            this.f9298k.setContentView(c.mo10171b());
            this.f9298k.setCanceledOnTouchOutside(true);
            this.f9293f = AnimationUtils.loadAnimation(this.f9297j, C2722R.anim.fromsmall);
            this.f9294g = AnimationUtils.loadAnimation(this.f9297j, C2722R.anim.fromnothing);
            this.f9295h = AnimationUtils.loadAnimation(this.f9297j, C2722R.anim.forico);
            this.f9296i = AnimationUtils.loadAnimation(this.f9297j, C2722R.anim.togo);
            this.f9300m.f9115g.setAlpha(0.0f);
            this.f9300m.f9110b.setVisibility(8);
            this.f9300m.f9116h.setOnClickListener(new C2867g(this));
            Window window = this.f9298k.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            this.f9298k.setOnShowListener(new C2866f(this));
            this.f9298k.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
