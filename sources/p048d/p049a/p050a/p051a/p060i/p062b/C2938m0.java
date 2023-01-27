package p048d.p049a.p050a.p051a.p060i.p062b;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0636d;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p048d.p049a.p050a.p051a.p057f.C2854t;
import p048d.p049a.p050a.p051a.p059h.C2878a;
import p048d.p049a.p050a.p051a.p059h.C2881d;
import p048d.p049a.p050a.p051a.p060i.p061a.C2892f;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2976i;
import p048d.p049a.p050a.p051a.p064k.C2977j;
import p048d.p049a.p050a.p051a.p071o.p072a.C3008a;
import p048d.p049a.p050a.p051a.p071o.p072a.C3010b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3014d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3016e;
import p048d.p049a.p050a.p051a.p071o.p072a.C3018f;
import p048d.p049a.p050a.p051a.p071o.p072a.C3020g;
import p048d.p049a.p050a.p051a.p071o.p072a.C3021g0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3022h;
import p048d.p049a.p050a.p051a.p071o.p072a.C3024i;
import p048d.p049a.p050a.p051a.p071o.p072a.C3026j;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p086f.p111h.p112e.C3267a;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.i.b.m0 */
public class C2938m0 extends C2961b implements C2977j {

    /* renamed from: d0 */
    private C2971d f9452d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C0636d f9453e0;

    /* renamed from: f0 */
    private Context f9454f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public int f9455g0;

    /* renamed from: h0 */
    private int f9456h0;

    /* renamed from: i0 */
    private int f9457i0;

    /* renamed from: j0 */
    private int f9458j0;

    /* renamed from: k0 */
    private int f9459k0;

    /* renamed from: l0 */
    private List<C3018f> f9460l0;

    /* renamed from: m0 */
    private List<C3008a> f9461m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C2892f f9462n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public boolean f9463o0 = true;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public ArrayAdapter<String> f9464p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ArrayList<String> f9465q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ArrayAdapter<String> f9466r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public ArrayList<String> f9467s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public List<C3021g0> f9468t0;

    /* renamed from: u0 */
    private C5221f f9469u0;

    /* renamed from: v0 */
    private MenuItem f9470v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C2854t f9471w0;

    /* renamed from: d.a.a.a.i.b.m0$a */
    class C2939a implements C2976i {
        C2939a() {
        }

        /* renamed from: m */
        public void mo575m(boolean z) {
            if (!z && !C2938m0.this.f9463o0) {
                C2938m0.this.f9471w0.f9190b.setText(C2938m0.this.mo3169S(C2722R.string.select_all));
                boolean unused = C2938m0.this.f9463o0 = true;
            }
        }

        /* renamed from: p */
        public void mo577p(boolean z) {
            C2938m0 m0Var;
            boolean z2;
            if (z) {
                C2938m0.this.f9471w0.f9190b.setText(C2938m0.this.mo3169S(C2722R.string.unselect_all));
                m0Var = C2938m0.this;
                z2 = false;
            } else {
                C2938m0.this.f9471w0.f9190b.setText(C2938m0.this.mo3169S(C2722R.string.select_all));
                m0Var = C2938m0.this;
                z2 = true;
            }
            boolean unused = m0Var.f9463o0 = z2;
        }
    }

    /* renamed from: d.a.a.a.i.b.m0$b */
    class C2940b extends ArrayAdapter<String> {
        C2940b(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2938m0.this.f9455g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.m0$c */
    class C2941c extends ArrayAdapter<String> {
        C2941c(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2938m0.this.f9455g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.m0$d */
    class C2942d extends ArrayAdapter<String> {
        C2942d(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2938m0.this.f9455g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.m0$e */
    class C2943e extends ArrayAdapter<String> {
        C2943e(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2938m0.this.f9455g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.m0$f */
    static /* synthetic */ class C2944f {

        /* renamed from: a */
        static final /* synthetic */ int[] f9477a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d.a.a.a.h.a[] r0 = p048d.p049a.p050a.p051a.p059h.C2878a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9477a = r0
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.SESSION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9477a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.COURSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9477a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.SECTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9477a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.STUDENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9477a     // Catch:{ NoSuchFieldError -> 0x003e }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.YEAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.C2944f.<clinit>():void");
        }
    }

    /* renamed from: d.a.a.a.i.b.m0$g */
    private class C2945g extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        String f9478a;

        /* renamed from: b */
        String f9479b;

        /* renamed from: c */
        String f9480c;

        /* renamed from: d */
        String f9481d;

        /* renamed from: e */
        C2878a f9482e;

        /* renamed from: f */
        ProgressBar f9483f;

        /* renamed from: d.a.a.a.i.b.m0$g$a */
        class C2946a implements Runnable {
            C2946a() {
            }

            public void run() {
                C2938m0 m0Var = C2938m0.this;
                m0Var.mo10296L1(m0Var.mo3169S(C2722R.string.loading_wait_message));
            }
        }

        C2945g() {
            this.f9482e = C2878a.YEAR;
            this.f9483f = C2938m0.this.f9471w0.f9198j;
        }

        C2945g(String str) {
            this.f9478a = str;
            this.f9482e = C2878a.SESSION;
            this.f9483f = C2938m0.this.f9471w0.f9197i;
        }

        C2945g(String str, String str2) {
            this.f9478a = str;
            this.f9479b = str2;
            this.f9482e = C2878a.COURSE;
            this.f9483f = C2938m0.this.f9471w0.f9195g;
        }

        C2945g(String str, String str2, String str3) {
            this.f9478a = str;
            this.f9479b = str2;
            this.f9480c = str3;
            this.f9482e = C2878a.SECTION;
            this.f9483f = C2938m0.this.f9471w0.f9196h;
        }

        C2945g(String str, String str2, String str3, String str4) {
            this.f9478a = str;
            this.f9479b = str2;
            this.f9480c = str3;
            this.f9481d = str4;
            this.f9482e = C2878a.STUDENT;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x012d A[Catch:{ Exception -> 0x016d }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x015e A[Catch:{ Exception -> 0x016d }, LOOP:0: B:19:0x0158->B:21:0x015e, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0165 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r7) {
            /*
                r6 = this;
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                org.apache.http.message.BasicNameValuePair r0 = new org.apache.http.message.BasicNameValuePair
                d.a.a.a.o.a.v r1 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
                java.lang.String r1 = r1.mo10610a()
                java.lang.String r2 = "apiKey"
                r0.<init>(r2, r1)
                r7.add(r0)
                org.apache.http.message.BasicNameValuePair r0 = new org.apache.http.message.BasicNameValuePair
                d.a.a.a.o.a.v r1 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
                java.lang.String r1 = r1.mo10611b()
                java.lang.String r2 = "appKey"
                r0.<init>(r2, r1)
                r7.add(r0)
                org.apache.http.message.BasicNameValuePair r0 = new org.apache.http.message.BasicNameValuePair
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ""
                r1.append(r2)
                d.a.a.a.o.a.v r3 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
                java.lang.Long r3 = r3.mo10614e()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "systemUserId"
                r0.<init>(r3, r1)
                r7.add(r0)
                int[] r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.C2944f.f9477a
                d.a.a.a.h.a r1 = r6.f9482e
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                r3 = 2131886132(0x7f120034, float:1.9406834E38)
                if (r0 == r1) goto L_0x00fb
                r1 = 2
                java.lang.String r4 = "academiaSession"
                if (r0 == r1) goto L_0x00dc
                r1 = 3
                java.lang.String r5 = "academicCourse"
                if (r0 == r1) goto L_0x00b1
                r1 = 4
                if (r0 == r1) goto L_0x007c
                d.a.a.a.i.b.m0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.m0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                r3 = 2131886197(0x7f120075, float:1.9406966E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                goto L_0x011e
            L_0x007c:
                d.a.a.a.i.b.m0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.m0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                r3 = 2131886198(0x7f120076, float:1.9406968E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9479b
                r1.<init>(r4, r3)
                r7.add(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9480c
                r1.<init>(r5, r3)
                r7.add(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9481d
                java.lang.String r4 = "academicSectionId"
                r1.<init>(r4, r3)
                goto L_0x011b
            L_0x00b1:
                d.a.a.a.i.b.m0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.m0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                r3 = 2131886195(0x7f120073, float:1.9406962E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9479b
                java.lang.String r4 = "academicSession"
                r1.<init>(r4, r3)
                r7.add(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9480c
                r1.<init>(r5, r3)
                goto L_0x011b
            L_0x00dc:
                d.a.a.a.i.b.m0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.m0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                r3 = 2131886194(0x7f120072, float:1.940696E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9479b
                r1.<init>(r4, r3)
                goto L_0x011b
            L_0x00fb:
                d.a.a.a.i.b.m0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.m0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.this
                r3 = 2131886196(0x7f120074, float:1.9406964E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r6.f9478a
                java.lang.String r4 = "year"
                r1.<init>(r4, r3)
            L_0x011b:
                r7.add(r1)
            L_0x011e:
                d.a.a.a.s.k r1 = p048d.p049a.p050a.p051a.p078s.C3098k.m13276a()     // Catch:{ Exception -> 0x016d }
                org.apache.http.client.methods.HttpPost r3 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x016d }
                r3.<init>(r0)     // Catch:{ Exception -> 0x016d }
                int r0 = r7.size()     // Catch:{ Exception -> 0x016d }
                if (r0 <= 0) goto L_0x0137
                org.apache.http.client.entity.UrlEncodedFormEntity r0 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x016d }
                java.lang.String r4 = "UTF-8"
                r0.<init>(r7, r4)     // Catch:{ Exception -> 0x016d }
                r3.setEntity(r0)     // Catch:{ Exception -> 0x016d }
            L_0x0137:
                org.apache.http.HttpResponse r7 = r1.execute(r3)     // Catch:{ Exception -> 0x016d }
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x016d }
                java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x016d }
                org.apache.http.HttpEntity r7 = r7.getEntity()     // Catch:{ Exception -> 0x016d }
                java.io.InputStream r7 = r7.getContent()     // Catch:{ Exception -> 0x016d }
                r1.<init>(r7)     // Catch:{ Exception -> 0x016d }
                r0.<init>(r1)     // Catch:{ Exception -> 0x016d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
                r7.<init>()     // Catch:{ Exception -> 0x016d }
                java.lang.String r1 = "line.separator"
                java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ Exception -> 0x016d }
            L_0x0158:
                java.lang.String r3 = r0.readLine()     // Catch:{ Exception -> 0x016d }
                if (r3 == 0) goto L_0x0165
                r7.append(r3)     // Catch:{ Exception -> 0x016d }
                r7.append(r1)     // Catch:{ Exception -> 0x016d }
                goto L_0x0158
            L_0x0165:
                r0.close()     // Catch:{ Exception -> 0x016d }
                java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x016d }
                goto L_0x0171
            L_0x016d:
                r7 = move-exception
                r7.printStackTrace()
            L_0x0171:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.C2945g.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            C6550a.m26771a("onPostExecute: " + str, new Object[0]);
            ProgressBar progressBar = this.f9483f;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            C2938m0.this.mo10294J1();
            int i = C2944f.f9477a[this.f9482e.ordinal()];
            if (i == 1) {
                C2938m0.this.m12686m2(str);
                if (C2938m0.this.f9465q0 != null && C2938m0.this.f9465q0.size() > 0) {
                    C2938m0.this.f9465q0.clear();
                    C2938m0.this.f9464p0.notifyDataSetChanged();
                }
                if (C2938m0.this.f9467s0 != null && C2938m0.this.f9467s0.size() > 0) {
                    C2938m0.this.f9467s0.clear();
                    C2938m0.this.f9466r0.notifyDataSetChanged();
                }
                if (C2938m0.this.f9468t0 == null || C2938m0.this.f9468t0.size() <= 0) {
                    return;
                }
            } else if (i == 2) {
                C2938m0.this.m12684k2(str);
                if (C2938m0.this.f9467s0 != null && C2938m0.this.f9467s0.size() > 0) {
                    C2938m0.this.f9467s0.clear();
                    C2938m0.this.f9466r0.notifyDataSetChanged();
                }
                if (C2938m0.this.f9468t0 == null || C2938m0.this.f9468t0.size() <= 0) {
                    return;
                }
            } else if (i == 3) {
                C2938m0.this.m12685l2(str);
                if (C2938m0.this.f9468t0 == null || C2938m0.this.f9468t0.size() <= 0) {
                    return;
                }
            } else if (i == 4) {
                C2938m0.this.m12687n2(str);
                return;
            } else if (i == 5) {
                C2938m0.this.m12688o2(str);
                return;
            } else {
                return;
            }
            C2938m0.this.f9468t0.clear();
            C2938m0.this.f9462n0.notifyDataSetChanged();
            C2938m0.this.f9471w0.f9192d.setVisibility(8);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C6550a.m26771a("onPreExecute: started", new Object[0]);
            ProgressBar progressBar = this.f9483f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            if (this.f9482e == C2878a.STUDENT) {
                C6550a.m26771a("onPreExecute: student", new Object[0]);
                C2938m0.this.f9453e0.runOnUiThread(new C2946a());
            }
        }
    }

    static {
        Class<C2938m0> cls = C2938m0.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m12684k2(String str) {
        C3010b bVar;
        try {
            bVar = (C3010b) this.f9469u0.mo15341i(str, C3010b.class);
        } catch (C5241t e) {
            e.printStackTrace();
            bVar = null;
        }
        if (bVar == null) {
            Toast.makeText(this.f9454f0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        this.f9461m0 = bVar.mo10468a();
        this.f9458j0 = 0;
        this.f9465q0 = new ArrayList<>();
        for (C3008a a : this.f9461m0) {
            this.f9465q0.add(String.valueOf(a.mo10464a()));
        }
        C2941c cVar = new C2941c(this.f9454f0, 17367048, 16908308, this.f9465q0);
        this.f9464p0 = cVar;
        cVar.setDropDownViewResource(17367049);
        this.f9471w0.f9199k.setAdapter((SpinnerAdapter) this.f9464p0);
        this.f9471w0.f9199k.setOnItemClickListener(new C2909f0(this));
        this.f9471w0.f9199k.setSelection(this.f9458j0);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m12685l2(String str) {
        C3016e eVar;
        Class cls = C3016e.class;
        try {
            eVar = (C3016e) this.f9469u0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            eVar = null;
        }
        if (eVar == null) {
            Toast.makeText(this.f9454f0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        List<C3014d> a = ((C3016e) this.f9469u0.mo15341i(str, cls)).mo10492a();
        this.f9459k0 = 0;
        this.f9467s0 = new ArrayList<>();
        for (C3014d b : a) {
            this.f9467s0.add(String.valueOf(b.mo10488b()));
        }
        C2940b bVar = new C2940b(this.f9454f0, 17367048, 16908308, this.f9467s0);
        this.f9466r0 = bVar;
        bVar.setDropDownViewResource(17367049);
        this.f9471w0.f9200l.setAdapter((SpinnerAdapter) this.f9466r0);
        this.f9471w0.f9200l.setOnItemClickListener(new C2903c0(this, a));
        this.f9471w0.f9200l.setSelection(this.f9459k0);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public void m12686m2(String str) {
        C3020g gVar;
        Class cls = C3020g.class;
        try {
            gVar = (C3020g) this.f9469u0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            gVar = null;
        }
        if (gVar == null) {
            Toast.makeText(this.f9454f0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        this.f9460l0 = ((C3020g) this.f9469u0.mo15341i(str, cls)).mo10505a();
        this.f9457i0 = 0;
        ArrayList arrayList = new ArrayList();
        for (C3018f b : this.f9460l0) {
            arrayList.add(String.valueOf(b.mo10502b()));
        }
        C2942d dVar = new C2942d(this.f9454f0, 17367048, 16908308, arrayList);
        dVar.setDropDownViewResource(17367049);
        this.f9471w0.f9201m.setAdapter((SpinnerAdapter) dVar);
        this.f9471w0.f9201m.setOnItemClickListener(new C2911g0(this));
        this.f9471w0.f9201m.setSelection(this.f9457i0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m12687n2(String str) {
        C3022h hVar;
        Class cls = C3022h.class;
        try {
            hVar = (C3022h) this.f9469u0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            hVar = null;
        }
        if (hVar == null) {
            Toast.makeText(this.f9454f0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        if (!this.f9463o0) {
            this.f9471w0.f9190b.setText(mo3169S(C2722R.string.select_all));
            this.f9463o0 = true;
        }
        List<C3021g0> a = ((C3022h) this.f9469u0.mo15341i(str, cls)).mo10512a();
        this.f9468t0 = a;
        if (a == null || a.size() <= 0) {
            Toast.makeText(this.f9454f0, mo3169S(C2722R.string.no_data_found), 0).show();
            this.f9471w0.f9192d.setVisibility(0);
            if (this.f9471w0.f9193e.getVisibility() == 8) {
                this.f9471w0.f9193e.setVisibility(0);
            }
        } else {
            this.f9471w0.f9192d.setVisibility(0);
            if (this.f9471w0.f9193e.getVisibility() != 8) {
                this.f9471w0.f9193e.setVisibility(8);
            }
        }
        C2892f fVar = new C2892f(this.f9454f0, this.f9468t0, new C2939a());
        this.f9462n0 = fVar;
        this.f9471w0.f9194f.setAdapter(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public void m12688o2(String str) {
        C3026j jVar;
        Class cls = C3026j.class;
        try {
            jVar = (C3026j) this.f9469u0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            jVar = null;
        }
        if (jVar == null) {
            Toast.makeText(this.f9454f0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        this.f9456h0 = 0;
        ArrayList arrayList = new ArrayList();
        for (C3024i a : ((C3026j) this.f9469u0.mo15341i(str, cls)).mo10520a()) {
            arrayList.add(String.valueOf(a.mo10514a()));
        }
        C2943e eVar = new C2943e(this.f9454f0, 17367048, 16908308, arrayList);
        eVar.setDropDownViewResource(17367049);
        this.f9471w0.f9202n.setAdapter((SpinnerAdapter) eVar);
        this.f9471w0.f9202n.setOnItemClickListener(new C2907e0(this, arrayList));
        this.f9471w0.f9202n.setSelection(this.f9456h0);
    }

    /* renamed from: p2 */
    public static C2938m0 m12689p2() {
        return new C2938m0();
    }

    /* renamed from: q2 */
    private void m12690q2() {
        Map b = this.f9462n0.mo10218b();
        if (b.get("ids") != null) {
            List list = (List) b.get("ids");
            List list2 = (List) b.get("numbers");
            if (list == null || list.size() <= 0) {
                C3101n.m13300N(this.f9454f0, mo3169S(C2722R.string.select_student_first));
            } else {
                C3101n.m13299M(this.f9453e0, list, list2, this);
            }
        }
    }

    /* renamed from: r2 */
    private void m12691r2(boolean z) {
        MenuItem menuItem;
        int i;
        Context context;
        if (z) {
            this.f9471w0.f9193e.setVisibility(8);
            menuItem = this.f9470v0;
            context = this.f9454f0;
            i = C2722R.C2723drawable.ic_arrow_up;
        } else {
            this.f9471w0.f9193e.setVisibility(0);
            menuItem = this.f9470v0;
            context = this.f9454f0;
            i = C2722R.C2723drawable.ic_arrow_down;
        }
        menuItem.setIcon(C3267a.m14076f(context, i));
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        if (menuItem.getItemId() != C2722R.C2724id.action_toggle_top) {
            return super.mo396D0(menuItem);
        }
        m12691r2(this.f9471w0.f9193e.getVisibility() != 8);
        return true;
    }

    /* renamed from: H0 */
    public void mo3149H0(Menu menu) {
        super.mo3149H0(menu);
        this.f9470v0 = menu.findItem(C2722R.C2724id.action_toggle_top);
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9469u0 = new C5221f();
        this.f9455g0 = mo3158M().getColor(C2722R.color.colorSubtitle);
        view.findViewById(C2722R.C2724id.btn_send_notification).setOnClickListener(new C2899a0(this));
        this.f9471w0.f9190b.setOnClickListener(new C2905d0(this));
        new C2945g().execute(new Void[0]);
    }

    /* renamed from: b */
    public void mo10268b(C2881d dVar) {
        C3101n.m13321p().mo10700U(this.f9453e0, mo3169S(dVar == C2881d.PUSH_SUCCESSFUL ? C2722R.string.notification_sent_successfully : C2722R.string.notification_sent_failed));
        new Handler().postDelayed(new C2901b0(this), 300);
    }

    /* renamed from: c2 */
    public /* synthetic */ void mo10269c2(int i) {
        this.f9458j0 = i;
        if (C3101n.m13328w(this.f9454f0)) {
            new C2945g(BuildConfig.FLAVOR, String.valueOf(this.f9460l0.get(this.f9457i0).mo10501a()), String.valueOf(this.f9461m0.get(i).mo10465b())).execute(new Void[0]);
        } else {
            C3101n.m13302Q(this.f9454f0);
        }
    }

    /* renamed from: d2 */
    public /* synthetic */ void mo10270d2(List list, int i) {
        this.f9459k0 = i;
        if (C3101n.m13328w(this.f9454f0)) {
            new C2945g(BuildConfig.FLAVOR, String.valueOf(this.f9460l0.get(this.f9457i0).mo10501a()), String.valueOf(this.f9461m0.get(this.f9458j0).mo10465b()), String.valueOf(((C3014d) list.get(i)).mo10487a())).execute(new Void[0]);
            return;
        }
        C3101n.m13302Q(this.f9454f0);
    }

    /* renamed from: e2 */
    public /* synthetic */ void mo10271e2(int i) {
        this.f9457i0 = i;
        if (C3101n.m13328w(this.f9454f0)) {
            new C2945g(BuildConfig.FLAVOR, String.valueOf(this.f9460l0.get(i).mo10501a())).execute(new Void[0]);
        } else {
            C3101n.m13302Q(this.f9454f0);
        }
    }

    /* renamed from: f2 */
    public /* synthetic */ void mo10272f2(List list, int i) {
        this.f9456h0 = i;
        if (C3101n.m13328w(this.f9454f0)) {
            new C2945g((String) list.get(i)).execute(new Void[0]);
        } else {
            C3101n.m13302Q(this.f9454f0);
        }
    }

    /* renamed from: g2 */
    public /* synthetic */ void mo10273g2() {
        C3101n.m13297K(this.f9453e0, C2938m0.class.getSimpleName());
    }

    /* renamed from: h2 */
    public /* synthetic */ void mo10274h2() {
        this.f9453e0.runOnUiThread(new C2959z(this));
    }

    /* renamed from: i2 */
    public /* synthetic */ void mo10275i2(View view) {
        if (this.f9462n0 != null) {
            m12690q2();
        } else {
            C3101n.m13300N(this.f9454f0, mo3169S(C2722R.string.select_student_first));
        }
    }

    /* renamed from: j2 */
    public /* synthetic */ void mo10276j2(View view) {
        Button button;
        int i;
        C2892f fVar = this.f9462n0;
        if (fVar != null && fVar.getCount() > 0) {
            this.f9462n0.mo10221e(this.f9463o0);
            boolean z = !this.f9463o0;
            this.f9463o0 = z;
            if (z) {
                button = this.f9471w0.f9190b;
                i = C2722R.string.select_all;
            } else {
                button = this.f9471w0.f9190b;
                i = C2722R.string.unselect_all;
            }
            button.setText(mo3169S(i));
        }
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9452d0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.send_notification));
            return;
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
        menuInflater.inflate(C2722R.C2725menu.menu_outbox, menu);
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9471w0 = C2854t.m12405c(layoutInflater);
        this.f9453e0 = mo3215o();
        this.f9454f0 = mo3242y();
        return this.f9471w0.mo10180b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9452d0 = null;
    }
}
