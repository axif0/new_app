package academia.bracu.com.academia.common.fragments;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0636d;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import p048d.p049a.p050a.p051a.p057f.C2856v;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3009a0;
import p048d.p049a.p050a.p051a.p078s.C3098k;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p390p.p391a.C6550a;

public class RecoverPasswordFragment extends C2961b {
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C0636d f387d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public Snackbar f388e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C2856v f389f0;

    /* renamed from: academia.bracu.com.academia.common.fragments.RecoverPasswordFragment$a */
    class C0090a implements TextWatcher {
        C0090a() {
        }

        public void afterTextChanged(Editable editable) {
            if (!editable.toString().isEmpty()) {
                RecoverPasswordFragment.this.f389f0.f9222f.setError((CharSequence) null);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: academia.bracu.com.academia.common.fragments.RecoverPasswordFragment$b */
    private class C0091b extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        String f391a;

        /* renamed from: b */
        String f392b;

        C0091b(String str, String str2) {
            this.f391a = str;
            this.f392b = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            try {
                String concat = RecoverPasswordFragment.this.mo3158M().getString(C2722R.string.base_url).concat(RecoverPasswordFragment.this.mo3169S(C2722R.string.endpoint_user_password_recover));
                C3098k a = C3098k.m13276a();
                HttpPost httpPost = new HttpPost(concat);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BasicNameValuePair("userName", this.f391a));
                arrayList.add(new BasicNameValuePair("dateOfBirth", this.f392b));
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

        /* renamed from: b */
        public /* synthetic */ void mo351b(C3009a0 a0Var, View view) {
            if (a0Var.mo10467b().longValue() == 1) {
                RecoverPasswordFragment.this.f387d0.finish();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            RecoverPasswordFragment.this.mo10294J1();
            C6550a.m26771a("onPostExecute: " + str, new Object[0]);
            C3009a0 a0Var = (C3009a0) new C5221f().mo15341i(str, C3009a0.class);
            if (a0Var != null) {
                try {
                    Snackbar unused = RecoverPasswordFragment.this.f388e0 = C3101n.m13306V(RecoverPasswordFragment.this.f387d0, a0Var.mo10466a().get(0), RecoverPasswordFragment.this.mo3169S(C2722R.string.action_ok), new C0109h(this, a0Var));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            RecoverPasswordFragment recoverPasswordFragment = RecoverPasswordFragment.this;
            recoverPasswordFragment.mo10296L1(recoverPasswordFragment.mo3169S(C2722R.string.loading_wait_message));
        }
    }

    static {
        Class<RecoverPasswordFragment> cls = RecoverPasswordFragment.class;
    }

    /* renamed from: S1 */
    private void m356S1(View view) {
        if (view.requestFocus()) {
            this.f387d0.getWindow().setSoftInputMode(5);
        }
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f389f0.f9219c.setTooltipText(mo3169S(C2722R.string.enter_your_birth_date));
        }
        this.f389f0.f9218b.setOnClickListener(new C0106g(this));
        this.f389f0.f9222f.setEndIconOnClickListener(new C0111i(this));
        this.f389f0.f9219c.addTextChangedListener(new C0090a());
    }

    /* renamed from: P1 */
    public /* synthetic */ void mo342P1(Date date) {
        String obj = ((Editable) Objects.requireNonNull(this.f389f0.f9219c.getText())).toString();
        if (date != null) {
            try {
                obj = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f389f0.f9219c.setText(obj);
    }

    /* renamed from: Q1 */
    public /* synthetic */ void mo343Q1(View view) {
        C3101n.m13326u(this.f389f0.f9220d, this.f387d0);
        String obj = ((Editable) Objects.requireNonNull(this.f389f0.f9220d.getText())).toString();
        if (TextUtils.isEmpty(obj)) {
            this.f389f0.f9223g.setError(mo3169S(C2722R.string.text_edit_field_error));
            m356S1(this.f389f0.f9220d);
            return;
        }
        this.f389f0.f9223g.setError((CharSequence) null);
        if (C3101n.m13329x(obj)) {
            this.f389f0.f9223g.setError(mo3169S(C2722R.string.enter_valid_email_address));
            m356S1(this.f389f0.f9220d);
            return;
        }
        this.f389f0.f9223g.setError((CharSequence) null);
        String obj2 = this.f389f0.f9219c.getText().toString();
        if (TextUtils.isEmpty(obj2)) {
            this.f389f0.f9222f.setError(mo3169S(C2722R.string.text_edit_field_error));
            return;
        }
        this.f389f0.f9222f.setError((CharSequence) null);
        if (C3101n.m13328w(this.f387d0)) {
            new C0091b(obj, obj2).execute(new Void[0]);
        } else {
            C3101n.m13303R(this.f387d0);
        }
    }

    /* renamed from: R1 */
    public /* synthetic */ void mo344R1(View view) {
        String lowerCase = ((Editable) Objects.requireNonNull(this.f389f0.f9219c.getText())).toString().toLowerCase();
        C0636d dVar = this.f387d0;
        if (lowerCase.isEmpty()) {
            lowerCase = BuildConfig.FLAVOR;
        }
        C3101n.m13312e(dVar, C3101n.m13316j(lowerCase, "dd-MM-yyyy"), new C0112j(this));
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f389f0 = C2856v.m12413c(layoutInflater);
        this.f387d0 = mo3215o();
        return this.f389f0.mo10182b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        Snackbar snackbar = this.f388e0;
        if (snackbar != null && snackbar.mo8657G()) {
            try {
                this.f388e0.mo8667t();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
