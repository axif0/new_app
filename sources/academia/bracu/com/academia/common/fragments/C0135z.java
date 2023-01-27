package academia.bracu.com.academia.common.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.C0636d;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2855u;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3045u;
import p048d.p049a.p050a.p051a.p073p.C3051a;
import p048d.p049a.p050a.p051a.p073p.C3052b;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p386o.C6311b;
import p386o.C6314d;
import p386o.C6372r;

/* renamed from: academia.bracu.com.academia.common.fragments.z */
public class C0135z extends C2961b {

    /* renamed from: d0 */
    private C2971d f481d0;

    /* renamed from: e0 */
    private Context f482e0;

    /* renamed from: f0 */
    private C0636d f483f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C2855u f484g0;

    /* renamed from: academia.bracu.com.academia.common.fragments.z$a */
    class C0136a extends ClickableSpan {

        /* renamed from: f */
        final /* synthetic */ String f485f;

        C0136a(String str) {
            this.f485f = str;
        }

        public void onClick(View view) {
            try {
                C0135z.this.m499W1(this.f485f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: academia.bracu.com.academia.common.fragments.z$b */
    class C0137b implements C6314d<C3045u> {
        C0137b() {
        }

        /* renamed from: a */
        public void mo415a(C6311b<C3045u> bVar, C6372r<C3045u> rVar) {
            C3045u a;
            C0135z.this.mo10294J1();
            if (!rVar.mo17995d() || (a = rVar.mo17993a()) == null || a.mo10608a().booleanValue()) {
                C0135z zVar = C0135z.this;
                zVar.m493P1(zVar.mo3169S(C2722R.string.something_went_wrong));
                return;
            }
            C0135z.this.m493P1(a.mo10609b());
            C0135z.this.f484g0.f9209e.setText(BuildConfig.FLAVOR);
            C0135z.this.f484g0.f9207c.setText(BuildConfig.FLAVOR);
            C0135z.this.f484g0.f9210f.setText(BuildConfig.FLAVOR);
            C0135z.this.f484g0.f9208d.setText(BuildConfig.FLAVOR);
        }

        /* renamed from: b */
        public void mo416b(C6311b<C3045u> bVar, Throwable th) {
            C0135z.this.mo10294J1();
            C0135z zVar = C0135z.this;
            zVar.m493P1(zVar.mo3169S(C2722R.string.something_went_wrong));
            th.printStackTrace();
        }
    }

    static {
        Class<C0135z> cls = C0135z.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public void m493P1(String str) {
        Toast.makeText(this.f482e0, str, 1).show();
    }

    /* renamed from: Q1 */
    private void m494Q1() {
        mo10296L1(mo3169S(C2722R.string.loading_wait_message));
        String obj = this.f484g0.f9209e.getText().toString();
        String obj2 = this.f484g0.f9207c.getText().toString();
        String obj3 = this.f484g0.f9210f.getText().toString();
        String obj4 = this.f484g0.f9208d.getText().toString();
        ((C3051a) C3052b.m13111a(mo3169S(C2722R.string.base_url) + "/").mo17999b(C3051a.class)).mo10637g(obj, obj2, obj3, obj4).mo17940X(new C0137b());
    }

    /* renamed from: R1 */
    private void m495R1() {
        if (!m500X1()) {
            return;
        }
        if (C3101n.m13328w(this.f482e0)) {
            m494Q1();
        } else {
            C3101n.m13302Q(this.f482e0);
        }
    }

    /* renamed from: S1 */
    private void m496S1() {
        String S = mo3169S(C2722R.string.feedback_email);
        String str = mo3169S(C2722R.string.feedback) + ":\n\n ";
        String str2 = str + S;
        this.f484g0.f9216l.setText(str2);
        SpannableString spannableString = new SpannableString(str2);
        C0136a aVar = new C0136a(S);
        int length = str.length();
        spannableString.setSpan(aVar, length, S.length() + length, 33);
        this.f484g0.f9216l.setText(spannableString);
        this.f484g0.f9216l.setMovementMethod(LinkMovementMethod.getInstance());
        this.f484g0.f9216l.setHighlightColor(this.f482e0.getResources().getColor(C2722R.color.colorAccent));
    }

    /* renamed from: U1 */
    public static C0135z m497U1() {
        return new C0135z();
    }

    /* renamed from: V1 */
    private void m498V1(View view) {
        if (view.requestFocus()) {
            this.f483f0.getWindow().setSoftInputMode(5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m499W1(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", str, (String) null));
        intent.putExtra("android.intent.extra.SUBJECT", "Inquery");
        intent.putExtra("android.intent.extra.TEXT", "Dear, <br/>");
        this.f483f0.startActivity(Intent.createChooser(intent, "Send email"));
    }

    /* renamed from: X1 */
    private boolean m500X1() {
        if (TextUtils.isEmpty(this.f484g0.f9209e.getText().toString())) {
            this.f484g0.f9209e.setError(mo3169S(C2722R.string.error_message_name));
            m498V1(this.f484g0.f9209e);
            return false;
        }
        String obj = this.f484g0.f9207c.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            this.f484g0.f9207c.setError(mo3169S(C2722R.string.error_message_email));
            m498V1(this.f484g0.f9207c);
            return false;
        } else if (C3101n.m13329x(obj)) {
            this.f484g0.f9207c.setError(mo3169S(C2722R.string.enter_valid_email_address));
            m498V1(this.f484g0.f9207c);
            return false;
        } else {
            String obj2 = this.f484g0.f9210f.getText().toString();
            if (TextUtils.isEmpty(obj2)) {
                this.f484g0.f9210f.setError(mo3169S(C2722R.string.error_message_mobile));
                m498V1(this.f484g0.f9210f);
                return false;
            } else if (C3101n.m13330y(obj2)) {
                this.f484g0.f9210f.setError(mo3169S(C2722R.string.enter_valid_phone_number));
                this.f484g0.f9210f.requestFocus();
                return false;
            } else if (!TextUtils.isEmpty(this.f484g0.f9208d.getText().toString())) {
                return true;
            } else {
                this.f484g0.f9208d.setError(mo3169S(C2722R.string.error_message_comment));
                m498V1(this.f484g0.f9208d);
                return false;
            }
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f484g0.f9206b.setOnClickListener(new C0098c(this));
        try {
            m496S1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: T1 */
    public /* synthetic */ void mo412T1(View view) {
        C3101n.m13327v(this.f483f0);
        m495R1();
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f481d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_feedback));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f484g0 = C2855u.m12409c(layoutInflater);
        this.f482e0 = mo3242y();
        this.f483f0 = mo3215o();
        return this.f484g0.mo10181b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f481d0 = null;
    }
}
