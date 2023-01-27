package academia.bracu.com.academia.common.fragments;

import academia.bracu.com.academia.common.activities.RecoverPasswordActivity;
import academia.bracu.com.academia.service.C0175b;
import academia.bracu.com.academia.service.C0176c;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.C0636d;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2834a0;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2972e;
import p048d.p049a.p050a.p051a.p066m.C2988c;
import p048d.p049a.p050a.p051a.p074q.C3053a;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p148g.p189d.p289c.C5221f;
import p370l.p371a.p372a.p373a.C6092b;

/* renamed from: academia.bracu.com.academia.common.fragments.g0 */
public class C0107g0 extends C2961b {
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static volatile C2988c f415i0 = new C2988c(0, "Error", "Something went wrong");
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public static int f416j0 = 0;

    /* renamed from: d0 */
    private C2971d f417d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C2972e f418e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public Context f419f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public C0636d f420g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C2834a0 f421h0;

    /* renamed from: academia.bracu.com.academia.common.fragments.g0$a */
    private class C0108a extends AsyncTask<Void, Void, C2988c> {

        /* renamed from: a */
        private String f422a;

        /* renamed from: b */
        private String f423b;

        /* renamed from: c */
        private String f424c;

        /* renamed from: d */
        private String f425d;

        private C0108a() {
            this.f422a = C0107g0.this.f421h0.f9053e.getText().toString().trim();
            this.f423b = C0107g0.this.f421h0.f9052d.getText().toString();
            this.f424c = C3099l.m13277b(C0107g0.this.f419f0).mo10692e("firebase_token_synced", BuildConfig.FLAVOR);
            this.f425d = C3099l.m13277b(C0107g0.this.f419f0).mo10692e("firebase_token", BuildConfig.FLAVOR);
        }

        /* synthetic */ C0108a(C0107g0 g0Var, C0105f0 f0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[SYNTHETIC, Splitter:B:10:0x003e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p048d.p049a.p050a.p051a.p066m.C2988c doInBackground(java.lang.Void... r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this
                android.content.res.Resources r0 = r0.mo3158M()
                r1 = 2131886132(0x7f120034, float:1.9406834E38)
                java.lang.String r0 = r0.getString(r1)
                r4.append(r0)
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this
                r1 = 2131886211(0x7f120083, float:1.9406994E38)
                java.lang.String r0 = r0.mo3169S(r1)
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r0 = 0
                java.lang.Thread r1 = new java.lang.Thread     // Catch:{ Exception -> 0x0037 }
                academia.bracu.com.academia.common.fragments.q r2 = new academia.bracu.com.academia.common.fragments.q     // Catch:{ Exception -> 0x0037 }
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0037 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0037 }
                r1.start()     // Catch:{ Exception -> 0x0034 }
                goto L_0x003c
            L_0x0034:
                r4 = move-exception
                r0 = r1
                goto L_0x0038
            L_0x0037:
                r4 = move-exception
            L_0x0038:
                r4.printStackTrace()
                r1 = r0
            L_0x003c:
                if (r1 == 0) goto L_0x0046
                r1.join()     // Catch:{ Exception -> 0x0042 }
                goto L_0x0046
            L_0x0042:
                r4 = move-exception
                r4.printStackTrace()
            L_0x0046:
                d.a.a.a.m.c r4 = academia.bracu.com.academia.common.fragments.C0107g0.f415i0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.common.fragments.C0107g0.C0108a.doInBackground(java.lang.Void[]):d.a.a.a.m.c");
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0097 A[Catch:{ Exception -> 0x0275 }, LOOP:0: B:11:0x0091->B:13:0x0097, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab A[Catch:{ Exception -> 0x0275 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x026c A[Catch:{ Exception -> 0x0275 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x009e A[EDGE_INSN: B:51:0x009e->B:14:0x009e ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ void mo379b(java.lang.String r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.String r2 = "app_accessibility"
                java.lang.String r0 = "ROLE_STUDENT"
                java.lang.String r3 = "true"
                java.lang.String r4 = "resetPassword"
                java.lang.String r5 = "AX32WOHH231FDS2158N14L8N"
                java.lang.String r6 = "Error"
                r7 = 0
                r8 = 1
                d.a.a.a.s.k r9 = p048d.p049a.p050a.p051a.p078s.C3098k.m13276a()     // Catch:{ Exception -> 0x0275 }
                org.apache.http.client.methods.HttpPost r10 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0275 }
                r11 = r17
                r10.<init>(r11)     // Catch:{ Exception -> 0x0275 }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0275 }
                r11.<init>()     // Catch:{ Exception -> 0x0275 }
                org.apache.http.message.BasicNameValuePair r12 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0275 }
                java.lang.String r13 = "j_username"
                java.lang.String r14 = r1.f422a     // Catch:{ Exception -> 0x0275 }
                r12.<init>(r13, r14)     // Catch:{ Exception -> 0x0275 }
                r11.add(r12)     // Catch:{ Exception -> 0x0275 }
                org.apache.http.message.BasicNameValuePair r12 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0275 }
                java.lang.String r13 = "j_password"
                java.lang.String r14 = r1.f423b     // Catch:{ Exception -> 0x0275 }
                r12.<init>(r13, r14)     // Catch:{ Exception -> 0x0275 }
                r11.add(r12)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r12 = r1.f425d     // Catch:{ Exception -> 0x0275 }
                boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x0275 }
                java.lang.String r13 = "notificationToken"
                java.lang.String r14 = ""
                if (r12 != 0) goto L_0x0054
                java.lang.String r12 = r1.f425d     // Catch:{ Exception -> 0x0275 }
                java.lang.String r15 = r1.f424c     // Catch:{ Exception -> 0x0275 }
                boolean r12 = r12.equals(r15)     // Catch:{ Exception -> 0x0275 }
                if (r12 != 0) goto L_0x0054
                java.lang.String r12 = r1.f425d     // Catch:{ Exception -> 0x0275 }
                r10.addHeader(r13, r12)     // Catch:{ Exception -> 0x0275 }
                goto L_0x0057
            L_0x0054:
                r10.addHeader(r13, r14)     // Catch:{ Exception -> 0x0275 }
            L_0x0057:
                java.lang.String r12 = "appKey"
                r10.addHeader(r12, r5)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r12 = "isLatest"
                java.lang.String r13 = p048d.p049a.p050a.p051a.p078s.C3097j.f9870b     // Catch:{ Exception -> 0x0275 }
                r10.addHeader(r12, r13)     // Catch:{ Exception -> 0x0275 }
                r10.addHeader(r4, r3)     // Catch:{ Exception -> 0x0275 }
                org.apache.http.client.entity.UrlEncodedFormEntity r12 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0275 }
                java.lang.String r13 = "UTF-8"
                r12.<init>(r11, r13)     // Catch:{ Exception -> 0x0275 }
                r10.setEntity(r12)     // Catch:{ Exception -> 0x0275 }
                org.apache.http.HttpResponse r9 = r9.execute(r10)     // Catch:{ Exception -> 0x0275 }
                java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0275 }
                java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0275 }
                org.apache.http.HttpEntity r9 = r9.getEntity()     // Catch:{ Exception -> 0x0275 }
                java.io.InputStream r9 = r9.getContent()     // Catch:{ Exception -> 0x0275 }
                r11.<init>(r9)     // Catch:{ Exception -> 0x0275 }
                r10.<init>(r11)     // Catch:{ Exception -> 0x0275 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0275 }
                r9.<init>()     // Catch:{ Exception -> 0x0275 }
                java.lang.String r11 = "line.separator"
                java.lang.String r11 = java.lang.System.getProperty(r11)     // Catch:{ Exception -> 0x0275 }
            L_0x0091:
                java.lang.String r12 = r10.readLine()     // Catch:{ Exception -> 0x0275 }
                if (r12 == 0) goto L_0x009e
                r9.append(r12)     // Catch:{ Exception -> 0x0275 }
                r9.append(r11)     // Catch:{ Exception -> 0x0275 }
                goto L_0x0091
            L_0x009e:
                r10.close()     // Catch:{ Exception -> 0x0275 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0275 }
                int r10 = academia.bracu.com.academia.common.fragments.C0107g0.f416j0     // Catch:{ Exception -> 0x0275 }
                if (r10 <= 0) goto L_0x026c
                java.lang.String r10 = "loginResponse: %s"
                java.lang.Object[] r13 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0275 }
                r13[r7] = r9     // Catch:{ Exception -> 0x0275 }
                p390p.p391a.C6550a.m26771a(r10, r13)     // Catch:{ Exception -> 0x0275 }
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0275 }
                r10.<init>(r9)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r13 = "status"
                java.lang.String r13 = r10.getString(r13)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r15 = "success"
                boolean r13 = r13.equals(r15)     // Catch:{ Exception -> 0x0275 }
                r11 = 0
                if (r13 == 0) goto L_0x025f
                g.d.c.f r13 = new g.d.c.f     // Catch:{ Exception -> 0x0275 }
                r13.<init>()     // Catch:{ Exception -> 0x0275 }
                java.lang.Class<d.a.a.a.o.a.v> r15 = p048d.p049a.p050a.p051a.p071o.p072a.C3046v.class
                java.lang.Object r13 = r13.mo15341i(r9, r15)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.o.a.v r13 = (p048d.p049a.p050a.p051a.p071o.p072a.C3046v) r13     // Catch:{ Exception -> 0x0275 }
                p048d.p049a.p050a.p051a.p078s.C3097j.f9871c = r13     // Catch:{ Exception -> 0x0275 }
                r13.mo10615f(r5)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.o.a.v r5 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c     // Catch:{ Exception -> 0x0275 }
                java.util.List r5 = r5.mo10612c()     // Catch:{ Exception -> 0x0275 }
                boolean r5 = r5.contains(r0)     // Catch:{ Exception -> 0x0275 }
                if (r5 != 0) goto L_0x0109
                d.a.a.a.o.a.v r5 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c     // Catch:{ Exception -> 0x0275 }
                java.util.List r5 = r5.mo10612c()     // Catch:{ Exception -> 0x0275 }
                java.lang.String r13 = "ROLE_FACULTY_MEMBER"
                boolean r5 = r5.contains(r13)     // Catch:{ Exception -> 0x0275 }
                if (r5 == 0) goto L_0x00f6
                goto L_0x0109
            L_0x00f6:
                d.a.a.a.m.c r0 = new d.a.a.a.m.c     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r2 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                r3 = 2131886500(0x7f1201a4, float:1.940758E38)
                java.lang.String r2 = r2.mo3169S(r3)     // Catch:{ Exception -> 0x0275 }
                r0.<init>(r11, r6, r2)     // Catch:{ Exception -> 0x0275 }
            L_0x0104:
                p048d.p049a.p050a.p051a.p066m.C2988c unused = academia.bracu.com.academia.common.fragments.C0107g0.f415i0 = r0     // Catch:{ Exception -> 0x0275 }
                goto L_0x0292
            L_0x0109:
                d.a.a.a.q.a r5 = new d.a.a.a.q.a     // Catch:{ Exception -> 0x0275 }
                r5.<init>()     // Catch:{ Exception -> 0x0275 }
                java.lang.String r11 = r1.f423b     // Catch:{ Exception -> 0x0275 }
                java.lang.String r5 = r5.mo10646c(r11)     // Catch:{ Exception -> 0x0275 }
                r11 = 4
                java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r12 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                r13 = 2131886366(0x7f12011e, float:1.9407309E38)
                java.lang.String r12 = r12.mo3169S(r13)     // Catch:{ Exception -> 0x0275 }
                r11[r7] = r12     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r12 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                r13 = 2131886365(0x7f12011d, float:1.9407307E38)
                java.lang.String r12 = r12.mo3169S(r13)     // Catch:{ Exception -> 0x0275 }
                r11[r8] = r12     // Catch:{ Exception -> 0x0275 }
                r12 = 2
                academia.bracu.com.academia.common.fragments.g0 r13 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                r15 = 2131886363(0x7f12011b, float:1.9407303E38)
                java.lang.String r13 = r13.mo3169S(r15)     // Catch:{ Exception -> 0x0275 }
                r11[r12] = r13     // Catch:{ Exception -> 0x0275 }
                r12 = 3
                academia.bracu.com.academia.common.fragments.g0 r13 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                r15 = 2131886364(0x7f12011c, float:1.9407305E38)
                java.lang.String r13 = r13.mo3169S(r15)     // Catch:{ Exception -> 0x0275 }
                r11[r12] = r13     // Catch:{ Exception -> 0x0275 }
                java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ Exception -> 0x0275 }
                java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0275 }
                r12.<init>()     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r13 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.f.a0 r13 = r13.f421h0     // Catch:{ Exception -> 0x0275 }
                androidx.appcompat.widget.AppCompatCheckBox r13 = r13.f9051c     // Catch:{ Exception -> 0x0275 }
                boolean r13 = r13.isChecked()     // Catch:{ Exception -> 0x0275 }
                if (r13 == 0) goto L_0x015f
                java.lang.String r14 = p048d.p049a.p050a.p051a.p074q.C3053a.f9748c     // Catch:{ Exception -> 0x0275 }
                goto L_0x0165
            L_0x015f:
                r1.f422a = r14     // Catch:{ Exception -> 0x0275 }
                r1.f423b = r14     // Catch:{ Exception -> 0x0275 }
                java.lang.String r3 = "false"
            L_0x0165:
                java.lang.String r13 = r1.f422a     // Catch:{ Exception -> 0x0275 }
                r12.add(r13)     // Catch:{ Exception -> 0x0275 }
                r12.add(r5)     // Catch:{ Exception -> 0x0275 }
                r12.add(r14)     // Catch:{ Exception -> 0x0275 }
                r12.add(r3)     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r3 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r3 = r3.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r3 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r3)     // Catch:{ Exception -> 0x0275 }
                r3.mo10697j(r11, r12)     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r3 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r3 = r3.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r3 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r3)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r5 = "firebase_token_synced"
                java.lang.String r11 = r1.f425d     // Catch:{ Exception -> 0x0275 }
                r3.mo10696i(r5, r11)     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r3 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r3 = r3.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r3 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r3)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r5 = "authentication_api_key"
                d.a.a.a.o.a.v r11 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c     // Catch:{ Exception -> 0x0275 }
                java.lang.String r11 = r11.mo10610a()     // Catch:{ Exception -> 0x0275 }
                r3.mo10696i(r5, r11)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.o.a.v r3 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c     // Catch:{ Exception -> 0x0275 }
                java.util.List r3 = r3.mo10612c()     // Catch:{ Exception -> 0x0275 }
                boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r3 = "logged_in_user_type"
                if (r0 == 0) goto L_0x01d9
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r0 = r0.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r0 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r0)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r5 = "student_login_json"
                r0.mo10696i(r5, r9)     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r0 = r0.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r0 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r0)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.h.g r5 = p048d.p049a.p050a.p051a.p059h.C2884g.STUDENT     // Catch:{ Exception -> 0x0275 }
                int r5 = r5.ordinal()     // Catch:{ Exception -> 0x0275 }
                r0.mo10695h(r3, r5)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.h.g r0 = p048d.p049a.p050a.p051a.p059h.C2884g.STUDENT     // Catch:{ Exception -> 0x0275 }
                goto L_0x01fd
            L_0x01d9:
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r0 = r0.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r0 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r0)     // Catch:{ Exception -> 0x0275 }
                java.lang.String r5 = "faculty_login_json"
                r0.mo10696i(r5, r9)     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                android.content.Context r0 = r0.f419f0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r0 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r0)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.h.g r5 = p048d.p049a.p050a.p051a.p059h.C2884g.FACULTY     // Catch:{ Exception -> 0x0275 }
                int r5 = r5.ordinal()     // Catch:{ Exception -> 0x0275 }
                r0.mo10695h(r3, r5)     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.h.g r0 = p048d.p049a.p050a.p051a.p059h.C2884g.FACULTY     // Catch:{ Exception -> 0x0275 }
            L_0x01fd:
                r3 = r0
                java.lang.String r0 = r10.getString(r4)     // Catch:{ JSONException -> 0x0238 }
                if (r0 == 0) goto L_0x0221
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ JSONException -> 0x0238 }
                if (r0 == 0) goto L_0x0221
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ JSONException -> 0x0238 }
                androidx.fragment.app.d r0 = r0.f420g0     // Catch:{ JSONException -> 0x0238 }
                android.content.Intent r4 = new android.content.Intent     // Catch:{ JSONException -> 0x0238 }
                academia.bracu.com.academia.common.fragments.g0 r5 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ JSONException -> 0x0238 }
                androidx.fragment.app.d r5 = r5.f420g0     // Catch:{ JSONException -> 0x0238 }
                java.lang.Class<academia.bracu.com.academia.common.activities.ResetPasswordActivity> r9 = academia.bracu.com.academia.common.activities.ResetPasswordActivity.class
                r4.<init>(r5, r9)     // Catch:{ JSONException -> 0x0238 }
                r0.startActivity(r4)     // Catch:{ JSONException -> 0x0238 }
                goto L_0x0252
            L_0x0221:
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ JSONException -> 0x0238 }
                androidx.fragment.app.d r0 = r0.f420g0     // Catch:{ JSONException -> 0x0238 }
                d.a.a.a.s.l r0 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r0)     // Catch:{ JSONException -> 0x0238 }
                r0.mo10694g(r2, r8)     // Catch:{ JSONException -> 0x0238 }
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ JSONException -> 0x0238 }
                d.a.a.a.k.e r0 = r0.f418e0     // Catch:{ JSONException -> 0x0238 }
                r0.mo304l(r3)     // Catch:{ JSONException -> 0x0238 }
                goto L_0x0252
            L_0x0238:
                r0 = move-exception
                r0.printStackTrace()     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                androidx.fragment.app.d r0 = r0.f420g0     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.s.l r0 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r0)     // Catch:{ Exception -> 0x0275 }
                r0.mo10694g(r2, r8)     // Catch:{ Exception -> 0x0275 }
                academia.bracu.com.academia.common.fragments.g0 r0 = academia.bracu.com.academia.common.fragments.C0107g0.this     // Catch:{ Exception -> 0x0275 }
                d.a.a.a.k.e r0 = r0.f418e0     // Catch:{ Exception -> 0x0275 }
                r0.mo304l(r3)     // Catch:{ Exception -> 0x0275 }
            L_0x0252:
                d.a.a.a.m.c r0 = new d.a.a.a.m.c     // Catch:{ Exception -> 0x0275 }
                java.lang.String r2 = "No Error"
                java.lang.String r3 = "Successful login"
                r4 = 1
                r0.<init>(r4, r2, r3)     // Catch:{ Exception -> 0x0275 }
                goto L_0x0104
            L_0x025f:
                d.a.a.a.m.c r0 = new d.a.a.a.m.c     // Catch:{ Exception -> 0x0275 }
                java.lang.String r2 = "msg"
                java.lang.String r2 = r10.getString(r2)     // Catch:{ Exception -> 0x0275 }
                r0.<init>(r11, r6, r2)     // Catch:{ Exception -> 0x0275 }
                goto L_0x0104
            L_0x026c:
                d.a.a.a.m.c r0 = new d.a.a.a.m.c     // Catch:{ Exception -> 0x0275 }
                r2 = 1
                r0.<init>(r2, r14, r14)     // Catch:{ Exception -> 0x0275 }
                goto L_0x0104
            L_0x0275:
                r0 = move-exception
                r0.printStackTrace()
                java.lang.Object[] r2 = new java.lang.Object[r8]
                java.lang.String r0 = r0.getMessage()
                r2[r7] = r0
                java.lang.String r0 = "loginFailed: %s"
                p390p.p391a.C6550a.m26771a(r0, r2)
                d.a.a.a.m.c r0 = new d.a.a.a.m.c
                r2 = 2
                java.lang.String r4 = "Server not found"
                r0.<init>(r2, r6, r4)
                p048d.p049a.p050a.p051a.p066m.C2988c unused = academia.bracu.com.academia.common.fragments.C0107g0.f415i0 = r0
            L_0x0292:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.common.fragments.C0107g0.C0108a.mo379b(java.lang.String):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(C2988c cVar) {
            try {
                if (C0107g0.f416j0 > 0) {
                    C0107g0.this.mo10294J1();
                    if (cVar.mo10326a() == 0 || cVar.mo10326a() == 2) {
                        C0107g0.this.m417c2(cVar.mo10328c());
                    }
                } else if (C0107g0.f416j0 == 0) {
                    new C0108a().execute(new Void[0]);
                    C0107g0.m409R1();
                }
            } catch (Exception e) {
                C0107g0 g0Var = C0107g0.this;
                g0Var.m417c2(g0Var.mo3169S(C2722R.string.login_failed_message));
                e.printStackTrace();
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C0107g0 g0Var = C0107g0.this;
            g0Var.mo10296L1(g0Var.mo3169S(C2722R.string.loading_wait_message));
        }
    }

    static {
        Class<C0107g0> cls = C0107g0.class;
    }

    /* renamed from: R1 */
    static /* synthetic */ int m409R1() {
        int i = f416j0;
        f416j0 = i + 1;
        return i;
    }

    /* renamed from: V1 */
    private void m413V1() {
        if (!m418d2()) {
            return;
        }
        if (C3101n.m13328w(this.f419f0)) {
            C3101n.m13326u(this.f421h0.f9052d, this.f420g0);
            new C0108a(this, (C0105f0) null).execute(new Void[0]);
            return;
        }
        C3101n.m13302Q(this.f419f0);
    }

    /* renamed from: W1 */
    private void m414W1() {
        this.f421h0.f9050b.setOnClickListener(new C0121s(this));
        this.f421h0.f9057i.setOnClickListener(new C0120r(this));
        C6092b.m24861c(this.f420g0, new C0122t(this));
    }

    /* renamed from: a2 */
    public static C0107g0 m415a2() {
        return new C0107g0();
    }

    /* renamed from: b2 */
    private void m416b2(View view) {
        if (view.requestFocus()) {
            this.f420g0.getWindow().setSoftInputMode(5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public void m417c2(String str) {
        C3101n.m13321p().mo10700U(this.f420g0, str);
    }

    /* renamed from: d2 */
    private boolean m418d2() {
        TextInputEditText textInputEditText;
        TextInputLayout textInputLayout;
        String S;
        String trim = this.f421h0.f9053e.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            textInputLayout = this.f421h0.f9056h;
            S = mo3169S(C2722R.string.text_edit_field_error);
        } else {
            this.f421h0.f9056h.setError((CharSequence) null);
            if (C3101n.m13329x(trim)) {
                textInputLayout = this.f421h0.f9055g;
                S = mo3169S(C2722R.string.enter_valid_email_address);
            } else {
                this.f421h0.f9055g.setError((CharSequence) null);
                if (TextUtils.isEmpty(this.f421h0.f9052d.getText().toString())) {
                    this.f421h0.f9055g.setError(mo3169S(C2722R.string.text_edit_field_error));
                    textInputEditText = this.f421h0.f9052d;
                    m416b2(textInputEditText);
                    return false;
                }
                this.f421h0.f9055g.setError((CharSequence) null);
                return true;
            }
        }
        textInputLayout.setError(S);
        textInputEditText = this.f421h0.f9053e;
        m416b2(textInputEditText);
        return false;
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        C0176c cVar;
        super.mo341O0(view, bundle);
        m414W1();
        try {
            if (C3099l.m13277b(this.f419f0).mo10692e(mo3169S(C2722R.string.pref_is_remember), BuildConfig.FLAVOR).equals("true")) {
                C3053a aVar = new C3053a(C3099l.m13277b(this.f419f0).mo10692e(mo3169S(C2722R.string.pref_encryption_key), BuildConfig.FLAVOR));
                String e = C3099l.m13277b(this.f419f0).mo10692e(mo3169S(C2722R.string.pref_username), BuildConfig.FLAVOR);
                String a = aVar.mo10644a(C3099l.m13277b(this.f419f0).mo10692e(mo3169S(C2722R.string.pref_password), BuildConfig.FLAVOR));
                this.f421h0.f9053e.setText(e);
                this.f421h0.f9052d.setText(a);
                this.f421h0.f9051c.setChecked(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            String d = C3099l.m13277b(this.f420g0).mo10691d(mo3169S(C2722R.string.single_push_notification));
            if (!d.isEmpty() && (cVar = (C0176c) new C5221f().mo15341i(d, C0176c.class)) != null) {
                C3099l.m13277b(this.f420g0).mo10696i(mo3169S(C2722R.string.single_push_notification), BuildConfig.FLAVOR);
                C0175b c2 = C0175b.m634c2(cVar);
                c2.mo3289S1(false);
                c2.mo3292W1(mo3240x(), C0175b.f608r0);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: X1 */
    public /* synthetic */ void mo375X1(View view) {
        m413V1();
    }

    /* renamed from: Y1 */
    public /* synthetic */ void mo376Y1(View view) {
        if (C3101n.m13328w(this.f419f0)) {
            mo3142E1(new Intent(this.f419f0, RecoverPasswordActivity.class));
        } else {
            C3101n.m13303R(this.f419f0);
        }
    }

    /* renamed from: Z1 */
    public /* synthetic */ void mo377Z1(boolean z) {
        ImageView imageView;
        int i;
        if (z) {
            imageView = this.f421h0.f9054f;
            i = 8;
        } else {
            imageView = this.f421h0.f9054f;
            i = 0;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f417d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.text_user_login));
            if (context instanceof C2972e) {
                this.f418e0 = (C2972e) context;
                return;
            }
            throw new RuntimeException(context.toString() + " must implement OnLoginSuccessfulListener");
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f421h0 = C2834a0.m12340c(layoutInflater);
        this.f419f0 = mo3242y();
        this.f420g0 = mo3215o();
        return this.f421h0.mo10165b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f417d0 = null;
        this.f418e0 = null;
    }
}
