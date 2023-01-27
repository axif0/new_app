package academia.bracu.com.academia.faculty.activity;

import academia.bracu.com.academia.boommenu.BoomMenuButton;
import academia.bracu.com.academia.boommenu.C0056g;
import academia.bracu.com.academia.boommenu.p002c.C0027a;
import academia.bracu.com.academia.common.activities.CommonHomeActivity;
import academia.bracu.com.academia.service.C0175b;
import academia.bracu.com.academia.service.C0176c;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.media.ToneGenerator;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0263b;
import androidx.appcompat.app.C0273e;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p048d.p049a.p050a.p051a.p053d.C2822a;
import p048d.p049a.p050a.p051a.p057f.C2837c;
import p048d.p049a.p050a.p051a.p058g.C2871k;
import p048d.p049a.p050a.p051a.p059h.C2879b;
import p048d.p049a.p050a.p051a.p059h.C2882e;
import p048d.p049a.p050a.p051a.p059h.C2884g;
import p048d.p049a.p050a.p051a.p060i.p062b.C2925k0;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2973f;
import p048d.p049a.p050a.p051a.p067n.p069b.C3000h;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p070c.C3005b;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p071o.p072a.C3011b0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3042r;
import p048d.p049a.p050a.p051a.p071o.p072a.C3043s;
import p048d.p049a.p050a.p051a.p071o.p072a.C3046v;
import p048d.p049a.p050a.p051a.p078s.C3097j;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p048d.p049a.p050a.p051a.p078s.C3101n;
import p081de.hdodenhof.circleimageview.CircleImageView;
import p086f.p111h.p112e.C3267a;
import p086f.p140p.p141a.C3465a;
import p148g.p189d.p190a.p271e.p272a.p273a.C5056a;
import p148g.p189d.p190a.p271e.p272a.p273a.C5058b;
import p148g.p189d.p190a.p271e.p272a.p273a.C5060c;
import p148g.p189d.p190a.p271e.p272a.p274b.C5086b;
import p148g.p189d.p190a.p271e.p272a.p274b.C5087c;
import p148g.p189d.p289c.C5221f;
import p148g.p189d.p296d.p310u.p311a.C5441a;
import p340io.realm.C5782q0;
import p390p.p391a.C6550a;

public class FacultyHomeActivity extends C0273e implements C2971d, C2973f, C2969b, C5087c {

    /* renamed from: A */
    private boolean f488A = false;

    /* renamed from: B */
    private MediaPlayer f489B;

    /* renamed from: C */
    private C5058b f490C;

    /* renamed from: D */
    private C5056a f491D;

    /* renamed from: E */
    private Snackbar f492E;

    /* renamed from: F */
    private BroadcastReceiver f493F;

    /* renamed from: G */
    private C2837c f494G;

    /* renamed from: x */
    private String f495x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public List<Integer> f496y = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C5221f f497z;

    /* renamed from: academia.bracu.com.academia.faculty.activity.FacultyHomeActivity$a */
    class C0138a extends BroadcastReceiver {
        static {
            Class<FacultyHomeActivity> cls = FacultyHomeActivity.class;
        }

        C0138a() {
        }

        public void onReceive(Context context, Intent intent) {
            C0176c cVar;
            String string = intent.getExtras().getString("notification");
            if (string != null && (cVar = (C0176c) FacultyHomeActivity.this.f497z.mo15341i(string, C0176c.class)) != null) {
                C3101n.m13314h(FacultyHomeActivity.this, 300);
                C0175b c2 = C0175b.m634c2(cVar);
                c2.mo3289S1(false);
                c2.mo3292W1(FacultyHomeActivity.this.mo3317z(), C0175b.f608r0);
                NotificationManager notificationManager = (NotificationManager) FacultyHomeActivity.this.getApplicationContext().getSystemService("notification");
                if (notificationManager != null) {
                    new Handler().postDelayed(new C0145c(notificationManager, cVar), 200);
                }
                if (!C3099l.m13277b(FacultyHomeActivity.this).mo10691d(FacultyHomeActivity.this.getString(C2722R.string.single_push_notification)).isEmpty()) {
                    C3099l.m13277b(FacultyHomeActivity.this).mo10696i(FacultyHomeActivity.this.getString(C2722R.string.single_push_notification), BuildConfig.FLAVOR);
                }
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.faculty.activity.FacultyHomeActivity$b */
    class C0139b implements DrawerLayout.C0616d {
        C0139b() {
        }

        /* renamed from: a */
        public void mo312a(int i) {
        }

        /* renamed from: b */
        public void mo313b(View view, float f) {
        }

        /* renamed from: c */
        public void mo314c(View view) {
            C3101n.m13327v(FacultyHomeActivity.this);
        }

        /* renamed from: d */
        public void mo315d(View view) {
        }
    }

    /* renamed from: academia.bracu.com.academia.faculty.activity.FacultyHomeActivity$c */
    class C0140c implements C0056g {
        C0140c() {
        }

        /* renamed from: a */
        public void mo274a(int i, C0027a aVar) {
            FacultyHomeActivity facultyHomeActivity = FacultyHomeActivity.this;
            facultyHomeActivity.mo302f(((Integer) facultyHomeActivity.f496y.get(i)).intValue());
        }

        /* renamed from: b */
        public void mo275b() {
        }

        /* renamed from: c */
        public void mo276c() {
        }

        /* renamed from: d */
        public void mo277d() {
        }

        /* renamed from: e */
        public void mo278e() {
        }

        /* renamed from: f */
        public void mo279f() {
        }
    }

    /* renamed from: academia.bracu.com.academia.faculty.activity.FacultyHomeActivity$d */
    class C0141d implements C2871k.C2872a {
        C0141d() {
        }

        /* renamed from: a */
        public void mo430a(Dialog dialog) {
            dialog.dismiss();
        }

        /* renamed from: b */
        public void mo431b(Dialog dialog) {
            C3101n.m13310c(FacultyHomeActivity.this, C2884g.FACULTY);
            FacultyHomeActivity.this.m515Z();
            dialog.dismiss();
        }
    }

    /* renamed from: academia.bracu.com.academia.faculty.activity.FacultyHomeActivity$e */
    class C0142e implements PermissionListener {
        C0142e() {
        }

        public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
            if (permissionDeniedResponse.isPermanentlyDenied()) {
                FacultyHomeActivity facultyHomeActivity = FacultyHomeActivity.this;
                C3101n.m13305T(facultyHomeActivity, facultyHomeActivity);
            }
        }

        public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
            FacultyHomeActivity.this.m520l0();
        }

        public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
            permissionToken.continuePermissionRequest();
        }
    }

    static {
        Class<FacultyHomeActivity> cls = FacultyHomeActivity.class;
    }

    /* renamed from: S */
    private void m508S() {
        if (Build.VERSION.SDK_INT < 23 || C3267a.m14071a(this, "android.permission.CAMERA") == 0) {
            m520l0();
        } else {
            Dexter.withActivity(this).withPermission("android.permission.CAMERA").withListener(new C0142e()).check();
        }
    }

    /* renamed from: X */
    private void m513X() {
        new C2871k(this, getString(C2722R.string.text_confirmation), getString(C2722R.string.asking_logout_consent), getString(C2722R.string.text_ok), true, new C0141d()).mo10199c();
    }

    /* renamed from: Y */
    private void m514Y() {
        this.f490C.mo15167b().mo15249d(new C0146d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m515Z() {
        Intent intent = new Intent(this, CommonHomeActivity.class);
        intent.putExtra("common_nav_menu_id", C2722R.C2724id.nav_common_user_access);
        intent.setFlags(603979776);
        startActivity(intent);
        finish();
    }

    /* renamed from: a0 */
    private void m516a0() {
        C5058b a = C5060c.m21393a(this);
        this.f490C = a;
        a.mo15168c(this);
        m514Y();
    }

    /* renamed from: b0 */
    private void m517b0() {
        mo835P(this.f494G.f9067b.f9081b.f9048b);
        C3101n.m13321p().mo10701f(this.f494G.f9069d);
        this.f494G.f9069d.setItemIconTintList((ColorStateList) null);
        C2837c cVar = this.f494G;
        C0263b bVar = new C0263b(this, cVar.f9068c, cVar.f9067b.f9081b.f9048b, C2722R.string.navigation_drawer_open, C2722R.string.navigation_drawer_close);
        this.f494G.f9068c.mo3053a(bVar);
        bVar.mo798i();
        this.f494G.f9068c.mo3053a(new C0139b());
        this.f494G.f9069d.setNavigationItemSelectedListener(new C0144b(this));
        BoomMenuButton boomMenuButton = (BoomMenuButton) findViewById(C2722R.C2724id.bmb_faculty_home);
        for (int i = 0; i < boomMenuButton.getPiecePlaceEnum().pieceNumber(); i++) {
            boomMenuButton.mo13H(C2822a.m12323b(getResources().getColor(C2722R.color.colorCardsDialogs)));
        }
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_announcements));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_calendar));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_news));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_events));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_admissions));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_library));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_social));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_location_map));
        this.f496y.add(Integer.valueOf(C2722R.C2724id.nav_common_contacts));
        boomMenuButton.setDraggable(true);
        boomMenuButton.setOnBoomListener(new C0140c());
        m516a0();
    }

    /* renamed from: g0 */
    static /* synthetic */ void m518g0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        dialogInterface.dismiss();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        if (r0.mo10604a().size() > 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2917i0.m12546Z1(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dd, code lost:
        if (p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r0.mo10417V()) <= p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(0))) goto L_0x00f2;
     */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m519j0(int r8) {
        /*
            r7 = this;
            g.d.c.f r0 = new g.d.c.f
            r0.<init>()
            r1 = 2131362323(0x7f0a0213, float:1.8344423E38)
            r2 = 1
            r3 = 0
            if (r8 == r1) goto L_0x00e0
            switch(r8) {
                case 2131362327: goto L_0x00a2;
                case 2131362328: goto L_0x009d;
                case 2131362329: goto L_0x008f;
                case 2131362330: goto L_0x008a;
                case 2131362331: goto L_0x0083;
                case 2131362332: goto L_0x003b;
                case 2131362333: goto L_0x0036;
                case 2131362334: goto L_0x0031;
                case 2131362335: goto L_0x002e;
                default: goto L_0x000f;
            }
        L_0x000f:
            d.a.a.a.s.n r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13321p()
            androidx.fragment.app.Fragment r8 = r0.mo10702o(r7, r8)
            if (r8 == 0) goto L_0x002b
            android.os.Bundle r0 = r8.mo3237w()
            if (r0 == 0) goto L_0x002b
            android.os.Bundle r0 = r8.mo3237w()
            java.lang.String r1 = "individual_fragment_data_availability"
            boolean r2 = r0.getBoolean(r1)
            goto L_0x00f2
        L_0x002b:
            r2 = 0
            goto L_0x00f2
        L_0x002e:
            d.a.a.a.h.c r8 = p048d.p049a.p050a.p051a.p059h.C2880c.SENT
            goto L_0x0085
        L_0x0031:
            d.a.a.a.i.b.m0 r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2938m0.m12689p2()
            goto L_0x002b
        L_0x0036:
            d.a.a.a.i.b.l0 r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2929l0.m12648l2()
            goto L_0x002b
        L_0x003b:
            d.a.a.a.i.b.k0 r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2925k0.m12613a2()
            r1 = 2131886192(0x7f120070, float:1.9406956E38)
            java.lang.String r1 = r7.getString(r1)
            d.a.a.a.n.b.i r4 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r7)
            d.a.a.a.o.a.v r5 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r5 = r5.mo10614e()
            long r5 = r5.longValue()
            d.a.a.a.n.c.c r1 = r4.mo10344a(r5, r1)
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r1.mo10416U()
            java.lang.Class<d.a.a.a.o.a.s> r4 = p048d.p049a.p050a.p051a.p071o.p072a.C3043s.class
            java.lang.Object r0 = r0.mo15341i(r1, r4)
            d.a.a.a.o.a.s r0 = (p048d.p049a.p050a.p051a.p071o.p072a.C3043s) r0
            if (r0 == 0) goto L_0x002b
            java.lang.Boolean r1 = r0.mo10605b()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x002b
            java.util.List r1 = r0.mo10604a()
            if (r1 == 0) goto L_0x002b
            java.util.List r0 = r0.mo10604a()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x002b
            goto L_0x00f2
        L_0x0083:
            d.a.a.a.h.c r8 = p048d.p049a.p050a.p051a.p059h.C2880c.INBOX
        L_0x0085:
            d.a.a.a.i.b.i0 r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2917i0.m12546Z1(r8)
            goto L_0x00f2
        L_0x008a:
            d.a.a.a.i.b.j0 r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2921j0.m12574c2()
            goto L_0x002b
        L_0x008f:
            academia.bracu.com.academia.common.fragments.b0 r8 = academia.bracu.com.academia.common.fragments.C0096b0.m376d2(r2)
            androidx.fragment.app.m r0 = r7.mo3317z()
            java.lang.String r1 = academia.bracu.com.academia.common.fragments.C0096b0.f400s0
            r8.mo3292W1(r0, r1)
            goto L_0x00a0
        L_0x009d:
            r7.m513X()
        L_0x00a0:
            r8 = 0
            goto L_0x002b
        L_0x00a2:
            d.a.a.a.i.b.h0 r8 = p048d.p049a.p050a.p051a.p060i.p062b.C2913h0.m12524V1()
            r0 = 2131886132(0x7f120034, float:1.9406834E38)
            java.lang.String r0 = r7.getString(r0)
            r1 = 2131886191(0x7f12006f, float:1.9406954E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r0 = r0.concat(r1)
            d.a.a.a.n.b.i r1 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r7)
            d.a.a.a.o.a.v r4 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r4 = r4.mo10614e()
            long r4 = r4.longValue()
            r6 = 7
            d.a.a.a.n.c.c r0 = r1.mo10345b(r4, r0, r6)
            if (r0 == 0) goto L_0x002b
            java.util.Date r0 = r0.mo10417V()
            int r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r0)
            java.util.Date r1 = p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(r3)
            int r1 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r1)
            if (r0 > r1) goto L_0x002b
            goto L_0x00f2
        L_0x00e0:
            academia.bracu.com.academia.common.fragments.c0 r8 = academia.bracu.com.academia.common.fragments.C0099c0.m386Q1()
            d.a.a.a.f.c r0 = r7.f494G
            d.a.a.a.f.g r0 = r0.f9067b
            d.a.a.a.f.a r0 = r0.f9081b
            androidx.appcompat.widget.Toolbar r0 = r0.f9048b
            r1 = 2131886118(0x7f120026, float:1.9406806E38)
            r0.setTitle((int) r1)
        L_0x00f2:
            if (r8 == 0) goto L_0x00f7
            r7.m523o0(r8, r2)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.faculty.activity.FacultyHomeActivity.m519j0(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m520l0() {
        new C5441a(this).mo15746e();
    }

    /* renamed from: m0 */
    private void m521m0() {
        Snackbar Z = Snackbar.m10402Z(getWindow().getDecorView().findViewById(16908290), getString(C2722R.string.restart_to_update), -2);
        Z.mo8710a0(getString(C2722R.string.action_restart), new C0147e(this));
        Z.mo8654C().setBackgroundColor(C3267a.m14074d(this, C2722R.color.colorAccent));
        Z.mo8663P();
    }

    /* renamed from: n0 */
    private void m522n0(C5056a aVar) {
        try {
            this.f490C.mo15169d(aVar, 0, this, 111);
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o0 */
    private void m523o0(Fragment fragment, boolean z) {
        if (!C3101n.m13328w(this) && !z) {
            this.f492E = C3101n.m13306V(this, getString(C2722R.string.internet_connection_warning_message), getString(C2722R.string.text_retry), new C0143a(this, fragment, z));
        } else {
            C3101n.m13311d(this, fragment, C2879b.FACULTY);
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo417c0(C5056a aVar) {
        if (aVar.mo15162r() == 2 && aVar.mo15158n(0)) {
            this.f491D = aVar;
            m522n0(aVar);
        }
    }

    /* renamed from: d0 */
    public /* synthetic */ boolean mo418d0(MenuItem menuItem) {
        m519j0(menuItem.getItemId());
        onBackPressed();
        return true;
    }

    /* renamed from: e */
    public void mo301e(String str) {
        this.f494G.f9067b.f9081b.f9048b.setTitle((CharSequence) str);
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo419e0(View view) {
        m522n0(this.f491D);
    }

    /* renamed from: f */
    public void mo302f(int i) {
        if (i == C2722R.C2724id.nav_common_bracu_anthem) {
            try {
                if (!this.f488A) {
                    MediaPlayer create = MediaPlayer.create(this, C2722R.raw.bracu_anthem);
                    this.f489B = create;
                    create.start();
                    this.f488A = true;
                    return;
                }
                this.f488A = false;
                this.f489B.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == C2722R.C2724id.nav_common_qr_reader) {
            m508S();
        } else {
            m519j0(i);
        }
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo420f0(String str, String str2, DialogInterface dialogInterface, int i) {
        if (str.equals("Go to link")) {
            dialogInterface.dismiss();
            C3101n.m13325t(this, str2);
            return;
        }
        dialogInterface.cancel();
        dialogInterface.dismiss();
        m508S();
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo421h0(View view) {
        this.f490C.mo15166a();
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo422i0(Fragment fragment, boolean z, View view) {
        m523o0(fragment, z);
    }

    /* renamed from: k0 */
    public void mo303k(C5086b bVar) {
        if (bVar.mo15193d() == 11) {
            m521m0();
        }
    }

    /* renamed from: n */
    public void mo424n(C2882e eVar) {
        C3042r rVar;
        Bitmap decodeFile;
        C6550a.m26771a("onProfileUpdated", new Object[0]);
        View f = this.f494G.f9069d.mo8615f(0);
        CircleImageView circleImageView = (CircleImageView) f.findViewById(C2722R.C2724id.imv_profile_picture);
        TextView textView = (TextView) f.findViewById(C2722R.C2724id.tv_profile_name);
        TextView textView2 = (TextView) f.findViewById(C2722R.C2724id.tv_profile_email);
        LinearLayout linearLayout = (LinearLayout) f.findViewById(C2722R.C2724id.ll_profile_info);
        try {
            C3006c a = C3001i.m12806f(this).mo10344a(C3097j.f9871c.mo10614e().longValue(), getString(C2722R.string.endpoint_faculty_profile));
            if (a != null && (rVar = ((C3043s) this.f497z.mo15341i(a.mo10416U(), C3043s.class)).mo10604a().get(0)) != null) {
                if ((eVar == C2882e.LOGIN && C3097j.f9871c.mo10614e().longValue() == rVar.mo10603f().longValue()) || eVar == C2882e.PROFILE) {
                    String str = this.f495x;
                    File file = new File(str, rVar.mo10603f() + ".png");
                    if (file.exists() && (decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath())) != null) {
                        circleImageView.setImageBitmap(decodeFile);
                    }
                    textView.setText(rVar.mo10600c());
                    textView2.setText(rVar.mo10598a());
                    linearLayout.setVisibility(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 111) {
            try {
                String a = C5441a.m22440g(i, i2, intent).mo15748a();
                if (a != null) {
                    new ToneGenerator(3, 100).startTone(88, 150);
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Scan Result");
                    builder.setMessage(a);
                    String string = getString(C2722R.string.text_retry);
                    if (a.contains("http")) {
                        string = "Go to link";
                    }
                    builder.setPositiveButton(string, new C0148f(this, string, a)).setNegativeButton("Close", C0149g.f514f);
                    builder.create().show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i2 != -1) {
            Toast.makeText(this, "Update flow failed!", 0).show();
            if (this.f491D != null) {
                Snackbar Z = Snackbar.m10402Z(getWindow().getDecorView().findViewById(16908290), getString(C2722R.string.retry_to_update), 0);
                Z.mo8710a0(getString(C2722R.string.text_retry), new C0150h(this));
                Z.mo8654C().setBackgroundColor(C3267a.m14074d(this, C2722R.color.colorAccent));
                Z.mo8663P();
            }
        }
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(C2722R.C2724id.drawer_layout);
        Fragment s = C3101n.m13324s(this);
        if (drawerLayout.mo3038C(8388611)) {
            drawerLayout.mo3060d(8388611);
        } else if (s.mo3171T() == null || s.mo3171T().equals(C2925k0.class.getSimpleName())) {
            C3101n.m13321p().mo10699P(this, this);
        } else {
            C3101n.m13311d(this, C2925k0.m12613a2(), C2879b.FACULTY);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2837c c = C2837c.m12349c(getLayoutInflater());
        this.f494G = c;
        setContentView((View) c.mo10167b());
        C3101n.m13301O(this, findViewById(C2722R.C2724id.drawer_layout));
        m517b0();
        C3101n.m13311d(this, C2925k0.m12613a2(), C2879b.FACULTY);
        File dir = new ContextWrapper(getApplicationContext()).getDir("images", 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        this.f495x = dir.toString();
        this.f497z = new C5221f();
        C3046v vVar = (C3046v) this.f497z.mo15341i(C3099l.m13277b(this).mo10691d("faculty_login_json"), C3046v.class);
        C3097j.f9871c = vVar;
        vVar.mo10615f("AX32WOHH231FDS2158N14L8N");
        this.f493F = new C0138a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5058b bVar = this.f490C;
        if (bVar != null) {
            bVar.mo15170e(this);
        }
        Snackbar snackbar = this.f492E;
        if (snackbar != null && snackbar.mo8657G()) {
            try {
                this.f492E.mo8667t();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f493F != null) {
            C3465a.m14960b(this).mo11861e(this.f493F);
            this.f493F = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        Fragment s = C3101n.m13324s(this);
        if (!C3101n.m13328w(this) && s != null && s.mo3171T() != null && !s.mo3171T().equals(C2925k0.class.getSimpleName())) {
            try {
                finish();
                startActivity(new Intent(this, FacultyHomeActivity.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3465a.m14960b(this).mo11859c(this.f493F, new IntentFilter("academia.bracu.com.academia.action.push"));
        if (this.f490C != null) {
            m514Y();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        MediaPlayer mediaPlayer = this.f489B;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f489B.stop();
        }
    }

    /* renamed from: r */
    public void mo427r(List<C3011b0> list) {
    }

    /* renamed from: t */
    public void mo428t() {
        String str;
        try {
            MenuItem findItem = this.f494G.f9069d.getMenu().findItem(C2722R.C2724id.nav_notification);
            C5782q0<C3005b> c = C3000h.m12796j(this).mo10339c(C3097j.f9871c.mo10614e().longValue());
            if (c == null || c.size() <= 0) {
                str = " (0)";
            } else {
                str = " (" + c.size() + ")";
            }
            findItem.setTitle(getString(C2722R.string.received_messages) + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
