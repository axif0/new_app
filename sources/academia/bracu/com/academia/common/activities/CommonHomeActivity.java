package academia.bracu.com.academia.common.activities;

import academia.bracu.com.academia.app.C0001a;
import academia.bracu.com.academia.app.MyApplication;
import academia.bracu.com.academia.common.fragments.C0107g0;
import academia.bracu.com.academia.faculty.activity.FacultyHomeActivity;
import academia.bracu.com.academia.service.C0175b;
import academia.bracu.com.academia.service.C0176c;
import academia.bracu.com.academia.splash.SplashActivity;
import academia.bracu.com.academia.student.activity.StudentHomeActivity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.C0263b;
import androidx.appcompat.app.C0271d;
import androidx.appcompat.app.C0273e;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p057f.C2835b;
import p048d.p049a.p050a.p051a.p059h.C2879b;
import p048d.p049a.p050a.p051a.p059h.C2884g;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2972e;
import p048d.p049a.p050a.p051a.p064k.C2973f;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p086f.p140p.p141a.C3465a;
import p148g.p189d.p190a.p271e.p272a.p273a.C5056a;
import p148g.p189d.p190a.p271e.p272a.p273a.C5058b;
import p148g.p189d.p190a.p271e.p272a.p273a.C5060c;
import p148g.p189d.p190a.p271e.p272a.p274b.C5086b;
import p148g.p189d.p190a.p271e.p272a.p274b.C5087c;
import p148g.p189d.p289c.C5221f;

public class CommonHomeActivity extends C0273e implements C2971d, C2973f, C5087c, C2972e {

    /* renamed from: A */
    private Snackbar f359A;

    /* renamed from: B */
    private BroadcastReceiver f360B;

    /* renamed from: C */
    private C2835b f361C;

    /* renamed from: x */
    private C5058b f362x;

    /* renamed from: y */
    private C5056a f363y;

    /* renamed from: z */
    private String f364z;

    /* renamed from: academia.bracu.com.academia.common.activities.CommonHomeActivity$a */
    class C0074a extends BroadcastReceiver {
        static {
            Class<CommonHomeActivity> cls = CommonHomeActivity.class;
        }

        C0074a() {
        }

        public void onReceive(Context context, Intent intent) {
            C0176c cVar;
            String string = intent.getExtras().getString("notification");
            if (string != null && (cVar = (C0176c) new C5221f().mo15341i(string, C0176c.class)) != null) {
                C3101n.m13314h(CommonHomeActivity.this, 300);
                C0175b c2 = C0175b.m634c2(cVar);
                c2.mo3289S1(false);
                c2.mo3292W1(CommonHomeActivity.this.mo3317z(), C0175b.f608r0);
                NotificationManager notificationManager = (NotificationManager) CommonHomeActivity.this.getApplicationContext().getSystemService("notification");
                if (notificationManager != null) {
                    new Handler().postDelayed(new C0080b(notificationManager, cVar), 200);
                }
                if (!C3099l.m13277b(CommonHomeActivity.this).mo10691d(CommonHomeActivity.this.getString(C2722R.string.single_push_notification)).isEmpty()) {
                    C3099l.m13277b(CommonHomeActivity.this).mo10696i(CommonHomeActivity.this.getString(C2722R.string.single_push_notification), BuildConfig.FLAVOR);
                }
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.common.activities.CommonHomeActivity$b */
    class C0075b implements DrawerLayout.C0616d {
        C0075b() {
        }

        /* renamed from: a */
        public void mo312a(int i) {
        }

        /* renamed from: b */
        public void mo313b(View view, float f) {
        }

        /* renamed from: c */
        public void mo314c(View view) {
            C3101n.m13327v(CommonHomeActivity.this);
        }

        /* renamed from: d */
        public void mo315d(View view) {
        }
    }

    static {
        Class<CommonHomeActivity> cls = CommonHomeActivity.class;
    }

    /* renamed from: S */
    private void m317S() {
        this.f362x.mo15167b().mo15249d(new C0083e(this));
    }

    /* renamed from: T */
    private void m318T() {
        C3101n.m13311d(this, C0107g0.m415a2(), C2879b.COMMON);
        m319U();
    }

    /* renamed from: U */
    private void m319U() {
        C5058b a = C5060c.m21393a(this);
        this.f362x = a;
        a.mo15168c(this);
        m317S();
    }

    /* renamed from: V */
    private void m320V() {
        mo835P(this.f361C.f9059b.f9078b.f9048b);
        NavigationView navigationView = (NavigationView) findViewById(C2722R.C2724id.nav_view);
        C3101n.m13321p().mo10701f(navigationView);
        navigationView.setItemIconTintList((ColorStateList) null);
        C2835b bVar = this.f361C;
        C0263b bVar2 = new C0263b(this, bVar.f9060c, bVar.f9059b.f9078b.f9048b, C2722R.string.navigation_drawer_open, C2722R.string.navigation_drawer_close);
        this.f361C.f9060c.mo3053a(bVar2);
        bVar2.mo798i();
        this.f361C.f9060c.mo3053a(new C0075b());
        navigationView.setNavigationItemSelectedListener(new C0084f(this));
    }

    /* renamed from: a0 */
    static /* synthetic */ void m321a0(int[] iArr, DialogInterface dialogInterface, int i) {
        iArr[0] = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r5 == null) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m322c0(int r5) {
        /*
            r4 = this;
            r0 = 2131362323(0x7f0a0213, float:1.8344423E38)
            r1 = 0
            if (r5 == r0) goto L_0x0067
            r0 = 2131362325(0x7f0a0215, float:1.8344427E38)
            if (r5 == r0) goto L_0x0016
            d.a.a.a.s.n r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13321p()
            androidx.fragment.app.Fragment r5 = r0.mo10702o(r4, r5)
            if (r5 != 0) goto L_0x0079
            goto L_0x0062
        L_0x0016:
            d.a.a.a.s.l r5 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r4)
            java.lang.String r0 = "authentication_api_key"
            java.lang.String r2 = ""
            java.lang.String r5 = r5.mo10692e(r0, r2)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0062
            d.a.a.a.s.l r5 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r4)
            java.lang.String r0 = "app_accessibility"
            boolean r5 = r5.mo10689a(r0)
            if (r5 != 0) goto L_0x0035
            goto L_0x0062
        L_0x0035:
            d.a.a.a.s.l r5 = p048d.p049a.p050a.p051a.p078s.C3099l.m13277b(r4)
            r0 = -1
            java.lang.String r2 = "logged_in_user_type"
            int r5 = r5.mo10690c(r2, r0)
            d.a.a.a.h.g r0 = p048d.p049a.p050a.p051a.p059h.C2884g.STUDENT
            int r0 = r0.ordinal()
            if (r5 != r0) goto L_0x0050
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<academia.bracu.com.academia.student.activity.StudentHomeActivity> r0 = academia.bracu.com.academia.student.activity.StudentHomeActivity.class
            r5.<init>(r4, r0)
            goto L_0x007c
        L_0x0050:
            d.a.a.a.h.g r0 = p048d.p049a.p050a.p051a.p059h.C2884g.FACULTY
            int r0 = r0.ordinal()
            if (r5 != r0) goto L_0x0060
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<academia.bracu.com.academia.faculty.activity.FacultyHomeActivity> r0 = academia.bracu.com.academia.faculty.activity.FacultyHomeActivity.class
            r5.<init>(r4, r0)
            goto L_0x007c
        L_0x0060:
            r5 = r1
            goto L_0x007c
        L_0x0062:
            academia.bracu.com.academia.common.fragments.g0 r5 = academia.bracu.com.academia.common.fragments.C0107g0.m415a2()
            goto L_0x0079
        L_0x0067:
            academia.bracu.com.academia.common.fragments.c0 r5 = academia.bracu.com.academia.common.fragments.C0099c0.m386Q1()
            d.a.a.a.f.b r0 = r4.f361C
            d.a.a.a.f.f r0 = r0.f9059b
            d.a.a.a.f.a r0 = r0.f9078b
            androidx.appcompat.widget.Toolbar r0 = r0.f9048b
            r2 = 2131886118(0x7f120026, float:1.9406806E38)
            r0.setTitle((int) r2)
        L_0x0079:
            r3 = r1
            r1 = r5
            r5 = r3
        L_0x007c:
            boolean r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13328w(r4)
            if (r0 == 0) goto L_0x0090
            if (r1 == 0) goto L_0x008a
            d.a.a.a.h.b r5 = p048d.p049a.p050a.p051a.p059h.C2879b.COMMON
            p048d.p049a.p050a.p051a.p078s.C3101n.m13311d(r4, r1, r5)
            goto L_0x0093
        L_0x008a:
            if (r5 == 0) goto L_0x0093
            r4.startActivity(r5)
            goto L_0x0093
        L_0x0090:
            p048d.p049a.p050a.p051a.p078s.C3101n.m13303R(r4)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.common.activities.CommonHomeActivity.m322c0(int):void");
    }

    /* renamed from: e0 */
    private void m323e0() {
        C0271d.C0272a aVar = new C0271d.C0272a(this);
        aVar.mo824m(C2722R.string.choose_theme);
        String[] stringArray = getResources().getStringArray(C2722R.array.theme_list_array);
        String[] stringArray2 = getResources().getStringArray(C2722R.array.theme_entry_array);
        int[] iArr = {1};
        aVar.mo823l(stringArray, iArr[0], new C0086h(iArr));
        aVar.mo821j(getString(C2722R.string.action_ok), new C0081c(this, iArr, stringArray2));
        C0271d a = aVar.mo812a();
        a.setCancelable(false);
        a.setCanceledOnTouchOutside(false);
        a.show();
    }

    /* renamed from: f0 */
    private void m324f0(C5056a aVar) {
        try {
            this.f362x.mo15169d(aVar, 0, this, 111);
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: W */
    public /* synthetic */ void mo295W(C5056a aVar) {
        if (aVar.mo15162r() == 2 && aVar.mo15158n(0)) {
            this.f363y = aVar;
            m324f0(aVar);
        }
    }

    /* renamed from: X */
    public /* synthetic */ boolean mo296X(MenuItem menuItem) {
        m322c0(menuItem.getItemId());
        onBackPressed();
        return true;
    }

    /* renamed from: Y */
    public /* synthetic */ void mo297Y(View view) {
        m324f0(this.f363y);
    }

    /* renamed from: Z */
    public /* synthetic */ void mo298Z(View view) {
        this.f362x.mo15166a();
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo299b0(int[] iArr, String[] strArr, DialogInterface dialogInterface, int i) {
        C3099l.m13277b(this).mo10694g("app_already_running", true);
        if (iArr[0] < strArr.length) {
            String str = strArr[iArr[0]];
            C3099l.m13277b(this).mo10696i(getString(C2722R.string.theme_pref_key), str);
            C0001a.f0a.mo3a(str);
        }
        if (iArr[0] == 1) {
            m318T();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: d0 */
    public void mo303k(C5086b bVar) {
        if (bVar.mo15193d() == 11) {
            this.f359A = C3101n.m13306V(this, getString(C2722R.string.restart_to_update), getString(C2722R.string.action_restart), new C0085g(this));
        }
    }

    /* renamed from: e */
    public void mo301e(String str) {
        this.f361C.f9059b.f9078b.f9048b.setTitle((CharSequence) str);
    }

    /* renamed from: f */
    public void mo302f(int i) {
        m322c0(i);
    }

    /* renamed from: l */
    public void mo304l(C2884g gVar) {
        this.f364z = C3099l.m13277b(this).mo10691d("authentication_api_key");
        Intent intent = gVar == C2884g.STUDENT ? new Intent(this, StudentHomeActivity.class) : gVar == C2884g.FACULTY ? new Intent(this, FacultyHomeActivity.class) : null;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 111 && i2 != -1) {
            Toast.makeText(this, "Update flow failed!", 0).show();
            if (this.f363y != null) {
                this.f359A = C3101n.m13306V(this, getString(C2722R.string.retry_to_update), getString(C2722R.string.text_retry), new C0082d(this));
            }
        }
    }

    public void onBackPressed() {
        Fragment s = C3101n.m13324s(this);
        if (this.f361C.f9060c.mo3038C(8388611)) {
            this.f361C.f9060c.mo3060d(8388611);
        } else if (s == null || s.mo3171T() == null || s.mo3171T().equals(C0107g0.class.getSimpleName())) {
            C3101n.m13321p().mo10699P(this, this);
        } else {
            C3101n.m13311d(this, C0107g0.m415a2(), C2879b.COMMON);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2835b c = C2835b.m12344c(getLayoutInflater());
        this.f361C = c;
        setContentView((View) c.mo10166b());
        C3101n.m13301O(this, findViewById(C2722R.C2724id.drawer_common_layout));
        String e = C3099l.m13277b(this).mo10692e("ah_firebase", BuildConfig.FLAVOR);
        this.f364z = C3099l.m13277b(this).mo10691d("authentication_api_key");
        if (!e.isEmpty()) {
            try {
                MyApplication.m1a(getBaseContext());
                Intent intent = new Intent(this, SplashActivity.class);
                intent.addFlags(268435456);
                startActivity(intent);
                finish();
                Runtime.getRuntime().exit(0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            m320V();
            if (!C3099l.m13277b(this).mo10689a("app_already_running")) {
                m323e0();
            } else {
                m318T();
            }
        }
        this.f360B = new C0074a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5058b bVar = this.f362x;
        if (bVar != null) {
            bVar.mo15170e(this);
        }
        Snackbar snackbar = this.f359A;
        if (snackbar != null && snackbar.mo8657G()) {
            try {
                this.f359A.mo8667t();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f360B != null) {
            C3465a.m14960b(this).mo11861e(this.f360B);
            this.f360B = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        if (this.f364z.isEmpty()) {
            return;
        }
        if (C3099l.m13277b(this).mo10691d("authentication_api_key").isEmpty() || !C3099l.m13277b(this).mo10689a("app_accessibility")) {
            C3101n.m13311d(this, C0107g0.m415a2(), C2879b.COMMON);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3465a.m14960b(this).mo11859c(this.f360B, new IntentFilter("academia.bracu.com.academia.action.push"));
        if (this.f362x != null) {
            m317S();
        }
    }
}
