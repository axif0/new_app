package academia.bracu.com.academia.common.activities;

import academia.bracu.com.academia.faculty.activity.FacultyHomeActivity;
import academia.bracu.com.academia.student.activity.StudentHomeActivity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.app.C0259a;
import androidx.appcompat.app.C0273e;
import com.google.android.material.textfield.TextInputEditText;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import p048d.p049a.p050a.p051a.p057f.C2838d;
import p048d.p049a.p050a.p051a.p059h.C2884g;
import p048d.p049a.p050a.p051a.p071o.p072a.C3009a0;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p370l.p371a.p372a.p373a.C6092b;
import p390p.p391a.C6550a;

public class ResetPasswordActivity extends C0273e {
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C2838d f367x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C0273e f368y;

    /* renamed from: academia.bracu.com.academia.common.activities.ResetPasswordActivity$a */
    class C0076a implements TextWatcher {
        C0076a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputEditText textInputEditText;
            String obj = editable.toString();
            if (!obj.isEmpty()) {
                if (C3101n.m13331z(true, true, true, 6, 16, obj)) {
                    ResetPasswordActivity.this.f367x.f9071b.f9089d.setCompoundDrawablesRelativeWithIntrinsicBounds(C2722R.C2723drawable.ic_payment_complete, 0, 0, 0);
                    if (obj.equals(((Editable) Objects.requireNonNull(ResetPasswordActivity.this.f367x.f9071b.f9088c.getText())).toString())) {
                        ResetPasswordActivity.this.f367x.f9071b.f9088c.setCompoundDrawablesRelativeWithIntrinsicBounds(C2722R.C2723drawable.ic_payment_complete, 0, 0, 0);
                        return;
                    }
                    textInputEditText = ResetPasswordActivity.this.f367x.f9071b.f9088c;
                } else {
                    textInputEditText = ResetPasswordActivity.this.f367x.f9071b.f9089d;
                }
                textInputEditText.setCompoundDrawablesRelativeWithIntrinsicBounds(C2722R.C2723drawable.ic_payment_incomplete, 0, 0, 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: academia.bracu.com.academia.common.activities.ResetPasswordActivity$b */
    class C0077b implements TextWatcher {
        C0077b() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputEditText textInputEditText;
            int i;
            String obj = editable.toString();
            if (!obj.isEmpty()) {
                if (!C3101n.m13331z(true, true, true, 6, 16, obj) || !obj.equals(((Editable) Objects.requireNonNull(ResetPasswordActivity.this.f367x.f9071b.f9089d.getText())).toString())) {
                    textInputEditText = ResetPasswordActivity.this.f367x.f9071b.f9088c;
                    i = C2722R.C2723drawable.ic_payment_incomplete;
                } else {
                    textInputEditText = ResetPasswordActivity.this.f367x.f9071b.f9088c;
                    i = C2722R.C2723drawable.ic_payment_complete;
                }
                textInputEditText.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: academia.bracu.com.academia.common.activities.ResetPasswordActivity$c */
    private class C0078c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        String f371a;

        C0078c(String str) {
            this.f371a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            try {
                String concat = ResetPasswordActivity.this.getResources().getString(C2722R.string.base_url).concat(ResetPasswordActivity.this.getString(C2722R.string.endpoint_user_password_reset));
                C3098k a = C3098k.m13276a();
                HttpPost httpPost = new HttpPost(concat);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BasicNameValuePair("passwd", this.f371a));
                arrayList.add(new BasicNameValuePair("id", BuildConfig.FLAVOR + C3097j.f9871c.mo10614e()));
                arrayList.add(new BasicNameValuePair("appKey", "true"));
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.execute(httpPost).getEntity().getContent()));
                StringBuilder sb = new StringBuilder();
                String property = System.getProperty("line.separator");
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append(property);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return BuildConfig.FLAVOR;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            C3009a0 a0Var;
            C3101n.m13313g();
            C6550a.m26771a("onPostExecute: " + str, new Object[0]);
            try {
                a0Var = (C3009a0) new C5221f().mo15341i(str, C3009a0.class);
            } catch (C5241t e) {
                e.printStackTrace();
                a0Var = null;
            }
            if (a0Var == null) {
                C3101n.m13321p().mo10700U(ResetPasswordActivity.this.f368y, ResetPasswordActivity.this.getString(C2722R.string.reset_password_failed_message));
            } else if (a0Var.mo10467b().longValue() == 1) {
                ResetPasswordActivity.this.m345W();
            } else {
                C3101n.m13321p().mo10700U(ResetPasswordActivity.this.f368y, a0Var.mo10466a().get(0));
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C3101n.m13304S(ResetPasswordActivity.this.f368y, ResetPasswordActivity.this.getString(C2722R.string.loading_wait_message));
        }
    }

    /* renamed from: V */
    private void m344V() {
        int i;
        C3101n nVar;
        String obj = ((Editable) Objects.requireNonNull(this.f367x.f9071b.f9089d.getText())).toString();
        String obj2 = ((Editable) Objects.requireNonNull(this.f367x.f9071b.f9088c.getText())).toString();
        if (!C3101n.m13331z(true, true, true, 6, 16, obj)) {
            nVar = C3101n.m13321p();
            i = C2722R.string.invalid_password_message;
        } else if (obj2.equals(obj)) {
            new C0078c(obj).execute(new Void[0]);
            return;
        } else {
            nVar = C3101n.m13321p();
            i = C2722R.string.password_not_matched;
        }
        nVar.mo10700U(this, getString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m345W() {
        Intent intent;
        if (C3099l.m13277b(this).mo10692e("authentication_api_key", BuildConfig.FLAVOR).isEmpty()) {
            intent = new Intent(this, CommonHomeActivity.class);
        } else {
            C3099l.m13277b(this).mo10694g("app_accessibility", true);
            int c = C3099l.m13277b(this).mo10690c("logged_in_user_type", -1);
            intent = c == C2884g.STUDENT.ordinal() ? new Intent(this, StudentHomeActivity.class) : c == C2884g.FACULTY.ordinal() ? new Intent(this, FacultyHomeActivity.class) : new Intent(this, CommonHomeActivity.class);
        }
        intent.setFlags(335544320);
        startActivity(intent);
        finish();
    }

    /* renamed from: X */
    public /* synthetic */ void mo317X(View view) {
        C3101n.m13326u(this.f367x.f9071b.f9088c, this);
        m344V();
    }

    /* renamed from: Y */
    public /* synthetic */ void mo318Y(boolean z) {
        if (z) {
            this.f367x.f9071b.f9090e.setVisibility(8);
            this.f367x.f9071b.f9091f.setVisibility(0);
            return;
        }
        this.f367x.f9071b.f9090e.setVisibility(0);
        this.f367x.f9071b.f9091f.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2838d c = C2838d.m12353c(getLayoutInflater());
        this.f367x = c;
        setContentView((View) c.mo10168b());
        mo835P(this.f367x.f9072c);
        C0259a I = mo829I();
        if (I != null) {
            I.mo782s(true);
        }
        this.f368y = this;
        this.f367x.f9071b.f9087b.setOnClickListener(new C0088j(this));
        this.f367x.f9071b.f9089d.addTextChangedListener(new C0076a());
        this.f367x.f9071b.f9088c.addTextChangedListener(new C0077b());
        C6092b.m24861c(this, new C0089k(this));
    }
}
