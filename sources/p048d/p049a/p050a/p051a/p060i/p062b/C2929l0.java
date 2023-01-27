package p048d.p049a.p050a.p051a.p060i.p062b;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0636d;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.p057f.C2853s;
import p048d.p049a.p050a.p051a.p059h.C2878a;
import p048d.p049a.p050a.p051a.p059h.C2882e;
import p048d.p049a.p050a.p051a.p060i.p061a.C2889e;
import p048d.p049a.p050a.p051a.p063j.C2961b;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3008a;
import p048d.p049a.p050a.p051a.p071o.p072a.C3010b;
import p048d.p049a.p050a.p051a.p071o.p072a.C3011b0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3012c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3014d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3016e;
import p048d.p049a.p050a.p051a.p071o.p072a.C3018f;
import p048d.p049a.p050a.p051a.p071o.p072a.C3020g;
import p048d.p049a.p050a.p051a.p071o.p072a.C3024i;
import p048d.p049a.p050a.p051a.p071o.p072a.C3026j;
import p086f.p111h.p112e.C3267a;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5241t;
import p370l.p371a.p372a.p373a.C6092b;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.i.b.l0 */
public class C2929l0 extends C2961b implements C2969b {

    /* renamed from: d0 */
    private Context f9419d0;

    /* renamed from: e0 */
    private C0636d f9420e0;

    /* renamed from: f0 */
    private C2971d f9421f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public int f9422g0;

    /* renamed from: h0 */
    private int f9423h0;

    /* renamed from: i0 */
    private int f9424i0;

    /* renamed from: j0 */
    private int f9425j0;

    /* renamed from: k0 */
    private int f9426k0;

    /* renamed from: l0 */
    private List<C3018f> f9427l0;

    /* renamed from: m0 */
    private List<C3008a> f9428m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C2889e f9429n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public ArrayAdapter<String> f9430o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public ArrayList<String> f9431p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ArrayAdapter<String> f9432q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ArrayList<String> f9433r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public List<C3011b0> f9434s0;

    /* renamed from: t0 */
    private C5221f f9435t0;

    /* renamed from: u0 */
    private MenuItem f9436u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public C2853s f9437v0;

    /* renamed from: d.a.a.a.i.b.l0$a */
    class C2930a implements TextWatcher {
        C2930a() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            if (obj.isEmpty()) {
                C2929l0.this.f9437v0.f9183j.f9063b.setCompoundDrawablesWithIntrinsicBounds(C2722R.C2723drawable.ic_search, 0, 0, 0);
            } else {
                C2929l0.this.f9437v0.f9183j.f9063b.setCompoundDrawablesWithIntrinsicBounds(C2722R.C2723drawable.ic_search, 0, C2722R.C2723drawable.ic_close_white, 0);
            }
            if (C2929l0.this.f9434s0 != null && C2929l0.this.f9434s0.size() > 0) {
                C2929l0.this.f9429n0.getFilter().filter(obj);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: d.a.a.a.i.b.l0$b */
    class C2931b extends ArrayAdapter<String> {
        C2931b(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2929l0.this.f9422g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.l0$c */
    class C2932c extends ArrayAdapter<String> {
        C2932c(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2929l0.this.f9422g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.l0$d */
    class C2933d extends ArrayAdapter<String> {
        C2933d(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2929l0.this.f9422g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.l0$e */
    class C2934e extends ArrayAdapter<String> {
        C2934e(Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            ((TextView) view2.findViewById(16908308)).setTextColor(C2929l0.this.f9422g0);
            return view2;
        }
    }

    /* renamed from: d.a.a.a.i.b.l0$f */
    static /* synthetic */ class C2935f {

        /* renamed from: a */
        static final /* synthetic */ int[] f9443a;

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
                f9443a = r0
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.SESSION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9443a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.COURSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9443a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.SECTION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9443a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.STUDENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9443a     // Catch:{ NoSuchFieldError -> 0x003e }
                d.a.a.a.h.a r1 = p048d.p049a.p050a.p051a.p059h.C2878a.YEAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.C2935f.<clinit>():void");
        }
    }

    /* renamed from: d.a.a.a.i.b.l0$g */
    private class C2936g extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        String f9444a;

        /* renamed from: b */
        String f9445b;

        /* renamed from: c */
        String f9446c;

        /* renamed from: d */
        String f9447d;

        /* renamed from: e */
        C2878a f9448e;

        /* renamed from: f */
        ProgressBar f9449f;

        C2936g() {
            this.f9448e = C2878a.YEAR;
            this.f9449f = C2929l0.this.f9437v0.f9180g;
        }

        C2936g(String str) {
            this.f9444a = str;
            this.f9448e = C2878a.SESSION;
            this.f9449f = C2929l0.this.f9437v0.f9179f;
        }

        C2936g(String str, String str2) {
            this.f9444a = str;
            this.f9445b = str2;
            this.f9448e = C2878a.COURSE;
            this.f9449f = C2929l0.this.f9437v0.f9177d;
        }

        C2936g(String str, String str2, String str3) {
            this.f9444a = str;
            this.f9445b = str2;
            this.f9446c = str3;
            this.f9448e = C2878a.SECTION;
            this.f9449f = C2929l0.this.f9437v0.f9178e;
        }

        C2936g(String str, String str2, String str3, String str4) {
            this.f9444a = str;
            this.f9445b = str2;
            this.f9446c = str3;
            this.f9447d = str4;
            this.f9448e = C2878a.STUDENT;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0119 A[Catch:{ Exception -> 0x0159 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x014a A[Catch:{ Exception -> 0x0159 }, LOOP:0: B:19:0x0144->B:21:0x014a, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0151 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r6) {
            /*
                r5 = this;
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                org.apache.http.message.BasicNameValuePair r0 = new org.apache.http.message.BasicNameValuePair
                d.a.a.a.o.a.v r1 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
                java.lang.String r1 = r1.mo10610a()
                java.lang.String r2 = "apiKey"
                r0.<init>(r2, r1)
                r6.add(r0)
                org.apache.http.message.BasicNameValuePair r0 = new org.apache.http.message.BasicNameValuePair
                d.a.a.a.o.a.v r1 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
                java.lang.String r1 = r1.mo10611b()
                java.lang.String r2 = "appKey"
                r0.<init>(r2, r1)
                r6.add(r0)
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
                r6.add(r0)
                int[] r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.C2935f.f9443a
                d.a.a.a.h.a r1 = r5.f9448e
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                r3 = 2131886132(0x7f120034, float:1.9406834E38)
                if (r0 == r1) goto L_0x00e7
                r1 = 2
                if (r0 == r1) goto L_0x00c6
                r1 = 3
                if (r0 == r1) goto L_0x0099
                r1 = 4
                if (r0 == r1) goto L_0x0078
                d.a.a.a.i.b.l0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.l0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                r3 = 2131886197(0x7f120075, float:1.9406966E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                goto L_0x010a
            L_0x0078:
                d.a.a.a.i.b.l0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.l0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                r3 = 2131886199(0x7f120077, float:1.940697E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r5.f9447d
                java.lang.String r4 = "academicSectionId"
                r1.<init>(r4, r3)
                goto L_0x0107
            L_0x0099:
                d.a.a.a.i.b.l0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.l0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                r3 = 2131886195(0x7f120073, float:1.9406962E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r5.f9445b
                java.lang.String r4 = "academicSession"
                r1.<init>(r4, r3)
                r6.add(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r5.f9446c
                java.lang.String r4 = "academicCourse"
                r1.<init>(r4, r3)
                goto L_0x0107
            L_0x00c6:
                d.a.a.a.i.b.l0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.l0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                r3 = 2131886194(0x7f120072, float:1.940696E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r5.f9445b
                java.lang.String r4 = "academiaSession"
                r1.<init>(r4, r3)
                goto L_0x0107
            L_0x00e7:
                d.a.a.a.i.b.l0 r0 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                android.content.res.Resources r0 = r0.mo3158M()
                java.lang.String r0 = r0.getString(r3)
                d.a.a.a.i.b.l0 r1 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.this
                r3 = 2131886196(0x7f120074, float:1.9406964E38)
                java.lang.String r1 = r1.mo3169S(r3)
                java.lang.String r0 = r0.concat(r1)
                org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair
                java.lang.String r3 = r5.f9444a
                java.lang.String r4 = "year"
                r1.<init>(r4, r3)
            L_0x0107:
                r6.add(r1)
            L_0x010a:
                d.a.a.a.s.k r1 = p048d.p049a.p050a.p051a.p078s.C3098k.m13276a()     // Catch:{ Exception -> 0x0159 }
                org.apache.http.client.methods.HttpPost r3 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0159 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x0159 }
                int r0 = r6.size()     // Catch:{ Exception -> 0x0159 }
                if (r0 <= 0) goto L_0x0123
                org.apache.http.client.entity.UrlEncodedFormEntity r0 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0159 }
                java.lang.String r4 = "UTF-8"
                r0.<init>(r6, r4)     // Catch:{ Exception -> 0x0159 }
                r3.setEntity(r0)     // Catch:{ Exception -> 0x0159 }
            L_0x0123:
                org.apache.http.HttpResponse r6 = r1.execute(r3)     // Catch:{ Exception -> 0x0159 }
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0159 }
                java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0159 }
                org.apache.http.HttpEntity r6 = r6.getEntity()     // Catch:{ Exception -> 0x0159 }
                java.io.InputStream r6 = r6.getContent()     // Catch:{ Exception -> 0x0159 }
                r1.<init>(r6)     // Catch:{ Exception -> 0x0159 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0159 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159 }
                r6.<init>()     // Catch:{ Exception -> 0x0159 }
                java.lang.String r1 = "line.separator"
                java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ Exception -> 0x0159 }
            L_0x0144:
                java.lang.String r3 = r0.readLine()     // Catch:{ Exception -> 0x0159 }
                if (r3 == 0) goto L_0x0151
                r6.append(r3)     // Catch:{ Exception -> 0x0159 }
                r6.append(r1)     // Catch:{ Exception -> 0x0159 }
                goto L_0x0144
            L_0x0151:
                r0.close()     // Catch:{ Exception -> 0x0159 }
                java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x0159 }
                goto L_0x015d
            L_0x0159:
                r6 = move-exception
                r6.printStackTrace()
            L_0x015d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.C2936g.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            C6550a.m26771a("onPostExecute: " + str, new Object[0]);
            ProgressBar progressBar = this.f9449f;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            int i = C2935f.f9443a[this.f9448e.ordinal()];
            if (i == 1) {
                C2929l0.this.m12645i2(str);
                if (C2929l0.this.f9431p0 != null && C2929l0.this.f9431p0.size() > 0) {
                    C2929l0.this.f9431p0.clear();
                    C2929l0.this.f9430o0.notifyDataSetChanged();
                }
                if (C2929l0.this.f9433r0 != null && C2929l0.this.f9433r0.size() > 0) {
                    C2929l0.this.f9433r0.clear();
                    C2929l0.this.f9432q0.notifyDataSetChanged();
                }
                if (C2929l0.this.f9434s0 == null || C2929l0.this.f9434s0.size() <= 0) {
                    return;
                }
            } else if (i == 2) {
                C2929l0.this.m12643g2(str);
                if (C2929l0.this.f9433r0 != null && C2929l0.this.f9433r0.size() > 0) {
                    C2929l0.this.f9433r0.clear();
                    C2929l0.this.f9432q0.notifyDataSetChanged();
                }
                if (C2929l0.this.f9434s0 == null || C2929l0.this.f9434s0.size() <= 0) {
                    return;
                }
            } else if (i == 3) {
                C2929l0.this.m12644h2(str);
                if (C2929l0.this.f9434s0 == null || C2929l0.this.f9434s0.size() <= 0) {
                    return;
                }
            } else if (i == 4) {
                C2929l0.this.mo10294J1();
                C2929l0.this.m12646j2(str);
                return;
            } else if (i == 5) {
                C2929l0.this.m12647k2(str);
                return;
            } else {
                return;
            }
            C2929l0.this.f9434s0.clear();
            C2929l0.this.f9437v0.f9181h.setVisibility(4);
            C2929l0.this.f9429n0.mo4360j();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C6550a.m26771a("onPreExecute: started", new Object[0]);
            ProgressBar progressBar = this.f9449f;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            if (this.f9448e == C2878a.STUDENT) {
                C2929l0 l0Var = C2929l0.this;
                l0Var.mo10296L1(l0Var.mo3169S(C2722R.string.loading_wait_message));
            }
        }
    }

    static {
        Class<C2929l0> cls = C2929l0.class;
    }

    /* renamed from: Z1 */
    private void m12641Z1() {
        this.f9437v0.f9183j.f9063b.addTextChangedListener(new C2930a());
        this.f9437v0.f9183j.f9063b.setOnTouchListener(new C2956w(this));
        C6092b.m24861c(this.f9420e0, new C2954u(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m12643g2(String str) {
        C3010b bVar;
        try {
            bVar = (C3010b) this.f9435t0.mo15341i(str, C3010b.class);
        } catch (C5241t e) {
            e.printStackTrace();
            bVar = null;
        }
        if (bVar == null) {
            Toast.makeText(this.f9419d0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        this.f9428m0 = bVar.mo10468a();
        this.f9425j0 = 0;
        this.f9431p0 = new ArrayList<>();
        for (C3008a a : this.f9428m0) {
            this.f9431p0.add(String.valueOf(a.mo10464a()));
        }
        C2932c cVar = new C2932c(this.f9419d0, 17367048, 16908308, this.f9431p0);
        this.f9430o0 = cVar;
        cVar.setDropDownViewResource(17367049);
        this.f9437v0.f9184k.setAdapter((SpinnerAdapter) this.f9430o0);
        this.f9437v0.f9184k.setOnItemClickListener(new C2957x(this));
        this.f9437v0.f9184k.setSelection(this.f9425j0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public void m12644h2(String str) {
        C3016e eVar;
        Class cls = C3016e.class;
        try {
            eVar = (C3016e) this.f9435t0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            eVar = null;
        }
        if (eVar == null) {
            Toast.makeText(this.f9419d0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        List<C3014d> a = ((C3016e) this.f9435t0.mo15341i(str, cls)).mo10492a();
        this.f9426k0 = 0;
        this.f9433r0 = new ArrayList<>();
        for (C3014d b : a) {
            this.f9433r0.add(String.valueOf(b.mo10488b()));
        }
        C2931b bVar = new C2931b(this.f9419d0, 17367048, 16908308, this.f9433r0);
        this.f9432q0 = bVar;
        bVar.setDropDownViewResource(17367049);
        this.f9437v0.f9185l.setAdapter((SpinnerAdapter) this.f9432q0);
        this.f9437v0.f9185l.setOnItemClickListener(new C2953t(this, a));
        this.f9437v0.f9185l.setSelection(this.f9426k0);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m12645i2(String str) {
        C3020g gVar;
        Class cls = C3020g.class;
        try {
            gVar = (C3020g) this.f9435t0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            gVar = null;
        }
        if (gVar == null) {
            Toast.makeText(this.f9419d0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        this.f9427l0 = ((C3020g) this.f9435t0.mo15341i(str, cls)).mo10505a();
        this.f9424i0 = 0;
        ArrayList arrayList = new ArrayList();
        for (C3018f b : this.f9427l0) {
            arrayList.add(String.valueOf(b.mo10502b()));
        }
        C2933d dVar = new C2933d(this.f9419d0, 17367048, 16908308, arrayList);
        dVar.setDropDownViewResource(17367049);
        this.f9437v0.f9186m.setAdapter((SpinnerAdapter) dVar);
        this.f9437v0.f9186m.setOnItemClickListener(new C2958y(this));
        this.f9437v0.f9186m.setSelection(this.f9424i0);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public void m12646j2(String str) {
        C3012c cVar;
        Class cls = C3012c.class;
        try {
            cVar = (C3012c) this.f9435t0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            cVar = null;
        }
        if (cVar == null) {
            Toast.makeText(this.f9419d0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        List<C3011b0> a = ((C3012c) this.f9435t0.mo15341i(str, cls)).mo10475a();
        this.f9434s0 = a;
        if (a.size() > 0) {
            m12649m2(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f9419d0, 1, false);
        this.f9437v0.f9182i.setHasFixedSize(true);
        this.f9437v0.f9182i.setLayoutManager(linearLayoutManager);
        C2889e eVar = new C2889e(this.f9434s0, this);
        this.f9429n0 = eVar;
        this.f9437v0.f9182i.setAdapter(eVar);
        List<C3011b0> list = this.f9434s0;
        if (list == null || list.size() > 0) {
            this.f9437v0.f9181h.setVisibility(0);
            return;
        }
        this.f9437v0.f9181h.setVisibility(4);
        Toast.makeText(this.f9419d0, mo3169S(C2722R.string.no_data_found), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m12647k2(String str) {
        C3026j jVar;
        Class cls = C3026j.class;
        try {
            jVar = (C3026j) this.f9435t0.mo15341i(str, cls);
        } catch (C5241t e) {
            e.printStackTrace();
            jVar = null;
        }
        if (jVar == null) {
            Toast.makeText(this.f9419d0, mo3169S(C2722R.string.server_connection_error), 0).show();
            return;
        }
        this.f9423h0 = 0;
        ArrayList arrayList = new ArrayList();
        for (C3024i a : ((C3026j) this.f9435t0.mo15341i(str, cls)).mo10520a()) {
            arrayList.add(String.valueOf(a.mo10514a()));
        }
        C2934e eVar = new C2934e(this.f9419d0, 17367048, 16908308, arrayList);
        eVar.setDropDownViewResource(17367049);
        this.f9437v0.f9187n.setAdapter((SpinnerAdapter) eVar);
        this.f9437v0.f9187n.setOnItemClickListener(new C2955v(this, arrayList));
        this.f9437v0.f9187n.setSelection(this.f9423h0);
    }

    /* renamed from: l2 */
    public static C2929l0 m12648l2() {
        return new C2929l0();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public void m12649m2(boolean z) {
        MenuItem menuItem;
        int i;
        Context context;
        if (z) {
            this.f9437v0.f9176c.setVisibility(8);
            menuItem = this.f9436u0;
            context = this.f9419d0;
            i = C2722R.C2723drawable.ic_arrow_up;
        } else {
            this.f9437v0.f9176c.setVisibility(0);
            menuItem = this.f9436u0;
            context = this.f9419d0;
            i = C2722R.C2723drawable.ic_arrow_down;
        }
        menuItem.setIcon(C3267a.m14076f(context, i));
    }

    /* renamed from: D0 */
    public boolean mo396D0(MenuItem menuItem) {
        boolean z = false;
        C6550a.m26771a("onItemClicked", new Object[0]);
        if (menuItem.getItemId() != C2722R.C2724id.action_toggle_top) {
            return super.mo396D0(menuItem);
        }
        if (this.f9437v0.f9176c.getVisibility() != 8) {
            z = true;
        }
        m12649m2(z);
        return true;
    }

    /* renamed from: H0 */
    public void mo3149H0(Menu menu) {
        super.mo3149H0(menu);
        C6550a.m26771a("onPrepared", new Object[0]);
        this.f9436u0 = menu.findItem(C2722R.C2724id.action_toggle_top);
    }

    /* renamed from: O0 */
    public void mo341O0(View view, Bundle bundle) {
        super.mo341O0(view, bundle);
        this.f9435t0 = new C5221f();
        this.f9422g0 = mo3158M().getColor(C2722R.color.colorSubtitle);
        m12641Z1();
        new C2936g().execute(new Void[0]);
    }

    /* renamed from: b2 */
    public /* synthetic */ boolean mo10250b2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || this.f9437v0.f9183j.f9063b.getCompoundDrawables()[2] == null || motionEvent.getRawX() < ((float) (this.f9437v0.f9183j.f9063b.getRight() - this.f9437v0.f9183j.f9063b.getCompoundDrawables()[2].getBounds().width()))) {
            return false;
        }
        this.f9437v0.f9183j.f9063b.setText(BuildConfig.FLAVOR);
        return true;
    }

    /* renamed from: c2 */
    public /* synthetic */ void mo10251c2(int i) {
        this.f9425j0 = i;
        new C2936g(BuildConfig.FLAVOR, String.valueOf(this.f9427l0.get(this.f9424i0).mo10501a()), String.valueOf(this.f9428m0.get(i).mo10465b())).execute(new Void[0]);
    }

    /* renamed from: d2 */
    public /* synthetic */ void mo10252d2(List list, int i) {
        this.f9426k0 = i;
        new C2936g(BuildConfig.FLAVOR, String.valueOf(this.f9427l0.get(this.f9424i0).mo10501a()), String.valueOf(this.f9428m0.get(this.f9425j0).mo10465b()), String.valueOf(((C3014d) list.get(i)).mo10487a())).execute(new Void[0]);
    }

    /* renamed from: e2 */
    public /* synthetic */ void mo10253e2(int i) {
        this.f9424i0 = i;
        new C2936g(BuildConfig.FLAVOR, String.valueOf(this.f9427l0.get(i).mo10501a())).execute(new Void[0]);
    }

    /* renamed from: f2 */
    public /* synthetic */ void mo10254f2(List list, int i) {
        this.f9423h0 = i;
        new C2936g((String) list.get(i)).execute(new Void[0]);
    }

    /* renamed from: m0 */
    public void mo358m0(Context context) {
        super.mo358m0(context);
        if (context instanceof C2971d) {
            C2971d dVar = (C2971d) context;
            this.f9421f0 = dVar;
            dVar.mo301e(mo3169S(C2722R.string.menu_explore_results));
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    /* renamed from: n */
    public void mo424n(C2882e eVar) {
    }

    /* renamed from: p0 */
    public void mo362p0(Bundle bundle) {
        super.mo362p0(bundle);
        mo3236v1(true);
    }

    /* renamed from: r */
    public void mo427r(List<C3011b0> list) {
        C2889e eVar = this.f9429n0;
        if (eVar != null) {
            eVar.mo10214G(list);
            this.f9437v0.f9182i.setAdapter(this.f9429n0);
        }
    }

    /* renamed from: s0 */
    public void mo397s0(Menu menu, MenuInflater menuInflater) {
        super.mo397s0(menu, menuInflater);
        C6550a.m26771a("onCreate", new Object[0]);
        menuInflater.inflate(C2722R.C2725menu.menu_outbox, menu);
    }

    /* renamed from: t */
    public void mo428t() {
    }

    /* renamed from: t0 */
    public View mo345t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9437v0 = C2853s.m12401c(layoutInflater);
        this.f9419d0 = mo3242y();
        this.f9420e0 = mo3215o();
        return this.f9437v0.mo10179b();
    }

    /* renamed from: x0 */
    public void mo346x0() {
        super.mo346x0();
        this.f9421f0 = null;
    }
}
