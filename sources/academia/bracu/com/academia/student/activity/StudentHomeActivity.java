package academia.bracu.com.academia.student.activity;

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
import p048d.p049a.p050a.p051a.p053d.C2823b;
import p048d.p049a.p050a.p051a.p057f.C2839e;
import p048d.p049a.p050a.p051a.p058g.C2871k;
import p048d.p049a.p050a.p051a.p059h.C2879b;
import p048d.p049a.p050a.p051a.p059h.C2882e;
import p048d.p049a.p050a.p051a.p059h.C2884g;
import p048d.p049a.p050a.p051a.p064k.C2969b;
import p048d.p049a.p050a.p051a.p064k.C2971d;
import p048d.p049a.p050a.p051a.p064k.C2973f;
import p048d.p049a.p050a.p051a.p064k.C2976i;
import p048d.p049a.p050a.p051a.p067n.p069b.C3001i;
import p048d.p049a.p050a.p051a.p067n.p069b.C3002j;
import p048d.p049a.p050a.p051a.p067n.p070c.C3006c;
import p048d.p049a.p050a.p051a.p067n.p070c.C3007d;
import p048d.p049a.p050a.p051a.p071o.p072a.C3011b0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3027j0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3029k0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3046v;
import p048d.p049a.p050a.p051a.p075r.p077b.C3082r;
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

public class StudentHomeActivity extends C0273e implements C2971d, C2973f, C2969b, C5087c, C2976i {

    /* renamed from: A */
    private MediaPlayer f644A;

    /* renamed from: B */
    private C5058b f645B;

    /* renamed from: C */
    private C5056a f646C;

    /* renamed from: D */
    private Snackbar f647D;

    /* renamed from: E */
    private boolean f648E = false;

    /* renamed from: F */
    private BroadcastReceiver f649F;

    /* renamed from: G */
    private C2839e f650G;

    /* renamed from: x */
    private String f651x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public List<Integer> f652y = new ArrayList();

    /* renamed from: z */
    private boolean f653z = false;

    /* renamed from: academia.bracu.com.academia.student.activity.StudentHomeActivity$a */
    class C0187a extends BroadcastReceiver {

        /* renamed from: a */
        final /* synthetic */ C5221f f654a;

        static {
            Class<StudentHomeActivity> cls = StudentHomeActivity.class;
        }

        C0187a(C5221f fVar) {
            this.f654a = fVar;
        }

        public void onReceive(Context context, Intent intent) {
            C0176c cVar;
            String string = intent.getExtras().getString("notification");
            if (string != null && (cVar = (C0176c) this.f654a.mo15341i(string, C0176c.class)) != null) {
                C3101n.m13314h(StudentHomeActivity.this, 300);
                C0175b c2 = C0175b.m634c2(cVar);
                c2.mo3289S1(false);
                c2.mo3292W1(StudentHomeActivity.this.mo3317z(), C0175b.f608r0);
                NotificationManager notificationManager = (NotificationManager) StudentHomeActivity.this.getApplicationContext().getSystemService("notification");
                if (notificationManager != null) {
                    new Handler().postDelayed(new C0192a(notificationManager, cVar), 200);
                }
                if (!C3099l.m13277b(StudentHomeActivity.this).mo10691d(StudentHomeActivity.this.getString(C2722R.string.single_push_notification)).isEmpty()) {
                    C3099l.m13277b(StudentHomeActivity.this).mo10696i(StudentHomeActivity.this.getString(C2722R.string.single_push_notification), BuildConfig.FLAVOR);
                }
            }
        }
    }

    /* renamed from: academia.bracu.com.academia.student.activity.StudentHomeActivity$b */
    class C0188b implements DrawerLayout.C0616d {
        C0188b() {
        }

        /* renamed from: a */
        public void mo312a(int i) {
        }

        /* renamed from: b */
        public void mo313b(View view, float f) {
        }

        /* renamed from: c */
        public void mo314c(View view) {
            C3101n.m13327v(StudentHomeActivity.this);
        }

        /* renamed from: d */
        public void mo315d(View view) {
        }
    }

    /* renamed from: academia.bracu.com.academia.student.activity.StudentHomeActivity$c */
    class C0189c implements C0056g {
        C0189c() {
        }

        /* renamed from: a */
        public void mo274a(int i, C0027a aVar) {
            StudentHomeActivity studentHomeActivity = StudentHomeActivity.this;
            studentHomeActivity.mo302f(((Integer) studentHomeActivity.f652y.get(i)).intValue());
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

    /* renamed from: academia.bracu.com.academia.student.activity.StudentHomeActivity$d */
    class C0190d implements C2871k.C2872a {
        C0190d() {
        }

        /* renamed from: a */
        public void mo430a(Dialog dialog) {
            dialog.dismiss();
        }

        /* renamed from: b */
        public void mo431b(Dialog dialog) {
            C3101n.m13310c(StudentHomeActivity.this, C2884g.STUDENT);
            StudentHomeActivity.this.m693Y();
            dialog.dismiss();
        }
    }

    /* renamed from: academia.bracu.com.academia.student.activity.StudentHomeActivity$e */
    class C0191e implements PermissionListener {
        C0191e() {
        }

        public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
            if (permissionDeniedResponse.isPermanentlyDenied()) {
                StudentHomeActivity studentHomeActivity = StudentHomeActivity.this;
                C3101n.m13305T(studentHomeActivity, studentHomeActivity);
            }
        }

        public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
            StudentHomeActivity.this.m698k0();
        }

        public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
            permissionToken.continuePermissionRequest();
        }
    }

    static {
        Class<StudentHomeActivity> cls = StudentHomeActivity.class;
    }

    /* renamed from: S */
    private void m687S() {
        if (Build.VERSION.SDK_INT < 23 || C3267a.m14071a(this, "android.permission.CAMERA") == 0) {
            m698k0();
        } else {
            Dexter.withActivity(this).withPermission("android.permission.CAMERA").withListener(new C0191e()).check();
        }
    }

    /* renamed from: W */
    private void m691W() {
        new C2871k(this, getString(C2722R.string.text_confirmation), getString(C2722R.string.asking_logout_consent), getString(C2722R.string.text_ok), true, new C0190d()).mo10199c();
    }

    /* renamed from: X */
    private void m692X() {
        this.f645B.mo15167b().mo15249d(new C0193b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m693Y() {
        Intent intent = new Intent(this, CommonHomeActivity.class);
        intent.putExtra("common_nav_menu_id", C2722R.C2724id.nav_common_user_access);
        intent.setFlags(603979776);
        startActivity(intent);
        finish();
    }

    /* renamed from: Z */
    private void m694Z() {
        C5058b a = C5060c.m21393a(this);
        this.f645B = a;
        a.mo15168c(this);
        m692X();
    }

    /* renamed from: a0 */
    private void m695a0() {
        mo835P(this.f650G.f9074b.f9084b.f9048b);
        C3101n.m13321p().mo10701f(this.f650G.f9076d);
        this.f650G.f9076d.setItemIconTintList((ColorStateList) null);
        C2839e eVar = this.f650G;
        C0263b bVar = new C0263b(this, eVar.f9075c, eVar.f9074b.f9084b.f9048b, C2722R.string.navigation_drawer_open, C2722R.string.navigation_drawer_close);
        this.f650G.f9075c.mo3053a(bVar);
        bVar.mo798i();
        this.f650G.f9075c.mo3053a(new C0188b());
        this.f650G.f9076d.setNavigationItemSelectedListener(new C0198g(this));
        BoomMenuButton boomMenuButton = (BoomMenuButton) findViewById(C2722R.C2724id.bmb_student_home);
        for (int i = 0; i < boomMenuButton.getPiecePlaceEnum().pieceNumber(); i++) {
            boomMenuButton.mo13H(C2823b.m12325b(getResources().getColor(C2722R.color.colorCardsDialogs)));
        }
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_announcements));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_calendar));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_news));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_events));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_admissions));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_library));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_social));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_location_map));
        this.f652y.add(Integer.valueOf(C2722R.C2724id.nav_common_contacts));
        boomMenuButton.setDraggable(true);
        boomMenuButton.setOnBoomListener(new C0189c());
        m694Z();
    }

    /* renamed from: f0 */
    static /* synthetic */ void m696f0(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        dialogInterface.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007e, code lost:
        if (p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r10).mo10344a(p048d.p049a.p050a.p051a.p078s.C3097j.f9871c.mo10614e().longValue(), getString(com.karumi.dexter.C2722R.string.endpoint_student_profile)) != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008c, code lost:
        r0.putBoolean("individual_fragment_data_availability", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a2, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0104, code lost:
        if (r1.mo10590a().size() > 0) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013f, code lost:
        if (p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r1.mo10417V()) <= p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(0))) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0187, code lost:
        if (((p048d.p049a.p050a.p051a.p071o.p072a.C3023h0) r1.mo15341i(r2.mo10416U(), p048d.p049a.p050a.p051a.p071o.p072a.C3023h0.class)) != null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005b, code lost:
        if (p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r1.mo10417V()) <= p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(0))) goto L_0x019c;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m697i0(int r11) {
        /*
            r10 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            g.d.c.f r1 = new g.d.c.f
            r1.<init>()
            r2 = 2131362323(0x7f0a0213, float:1.8344423E38)
            r3 = 1
            java.lang.String r4 = "individual_fragment_data_availability"
            if (r11 == r2) goto L_0x018a
            r2 = 7
            r5 = 2131886132(0x7f120034, float:1.9406834E38)
            r6 = 0
            switch(r11) {
                case 2131362336: goto L_0x0142;
                case 2131362337: goto L_0x0108;
                case 2131362338: goto L_0x00a5;
                case 2131362339: goto L_0x009f;
                case 2131362340: goto L_0x0091;
                case 2131362341: goto L_0x0088;
                case 2131362342: goto L_0x0082;
                case 2131362343: goto L_0x005f;
                case 2131362344: goto L_0x0024;
                default: goto L_0x001a;
            }
        L_0x001a:
            d.a.a.a.s.n r0 = p048d.p049a.p050a.p051a.p078s.C3101n.m13321p()
            androidx.fragment.app.Fragment r11 = r0.mo10702o(r10, r11)
            goto L_0x01a2
        L_0x0024:
            d.a.a.a.r.b.s r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3086s.m13265U1()
            java.lang.String r1 = r10.getString(r5)
            r5 = 2131886209(0x7f120081, float:1.940699E38)
            java.lang.String r5 = r10.getString(r5)
            java.lang.String r1 = r1.concat(r5)
            d.a.a.a.n.b.i r5 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r10)
            d.a.a.a.o.a.v r7 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r7 = r7.mo10614e()
            long r7 = r7.longValue()
            d.a.a.a.n.c.c r1 = r5.mo10345b(r7, r1, r2)
            if (r1 == 0) goto L_0x008c
            java.util.Date r1 = r1.mo10417V()
            int r1 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r1)
            java.util.Date r2 = p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(r6)
            int r2 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r2)
            if (r1 > r2) goto L_0x008c
            goto L_0x019c
        L_0x005f:
            boolean r11 = r10.f648E
            d.a.a.a.r.b.r r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3082r.m13235m2(r6, r11)
            r1 = 2131886208(0x7f120080, float:1.9406988E38)
            java.lang.String r1 = r10.getString(r1)
            d.a.a.a.n.b.i r2 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r10)
            d.a.a.a.o.a.v r5 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r5 = r5.mo10614e()
            long r7 = r5.longValue()
            d.a.a.a.n.c.c r1 = r2.mo10344a(r7, r1)
            if (r1 == 0) goto L_0x008c
            goto L_0x019c
        L_0x0082:
            d.a.a.a.r.b.q r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3079q.m13195Y1()
            goto L_0x019c
        L_0x0088:
            d.a.a.a.r.b.p r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3076p.m13180Q1()
        L_0x008c:
            r0.putBoolean(r4, r6)
            goto L_0x019f
        L_0x0091:
            academia.bracu.com.academia.common.fragments.b0 r11 = academia.bracu.com.academia.common.fragments.C0096b0.m376d2(r3)
            androidx.fragment.app.m r0 = r10.mo3317z()
            java.lang.String r1 = academia.bracu.com.academia.common.fragments.C0096b0.f400s0
            r11.mo3292W1(r0, r1)
            goto L_0x00a2
        L_0x009f:
            r10.m691W()
        L_0x00a2:
            r11 = 0
            goto L_0x01a2
        L_0x00a5:
            d.a.a.a.r.b.o r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3074o.m13165T1()
            java.lang.String r5 = r10.getString(r5)
            r7 = 2131886206(0x7f12007e, float:1.9406984E38)
            java.lang.String r7 = r10.getString(r7)
            java.lang.String r5 = r5.concat(r7)
            d.a.a.a.n.b.i r7 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r10)
            d.a.a.a.o.a.v r8 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r8 = r8.mo10614e()
            long r8 = r8.longValue()
            d.a.a.a.n.c.c r2 = r7.mo10345b(r8, r5, r2)
            if (r2 == 0) goto L_0x008c
            java.util.Date r5 = r2.mo10417V()
            int r5 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r5)
            java.util.Date r7 = p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(r6)
            int r7 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r7)
            if (r5 > r7) goto L_0x008c
            java.lang.String r2 = r2.mo10416U()
            java.lang.Class<d.a.a.a.o.a.q> r5 = p048d.p049a.p050a.p051a.p071o.p072a.C3040q.class
            java.lang.Object r1 = r1.mo15341i(r2, r5)
            d.a.a.a.o.a.q r1 = (p048d.p049a.p050a.p051a.p071o.p072a.C3040q) r1
            if (r1 == 0) goto L_0x008c
            java.util.List r2 = r1.mo10590a()
            if (r2 == 0) goto L_0x008c
            java.lang.Boolean r2 = r1.mo10591b()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x008c
            java.util.List r1 = r1.mo10590a()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x008c
            goto L_0x019c
        L_0x0108:
            d.a.a.a.r.b.n r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3071n.m13146V1()
            java.lang.String r1 = r10.getString(r5)
            r5 = 2131886205(0x7f12007d, float:1.9406982E38)
            java.lang.String r5 = r10.getString(r5)
            java.lang.String r1 = r1.concat(r5)
            d.a.a.a.n.b.i r5 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r10)
            d.a.a.a.o.a.v r7 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r7 = r7.mo10614e()
            long r7 = r7.longValue()
            d.a.a.a.n.c.c r1 = r5.mo10345b(r7, r1, r2)
            if (r1 == 0) goto L_0x008c
            java.util.Date r1 = r1.mo10417V()
            int r1 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r1)
            java.util.Date r2 = p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(r6)
            int r2 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r2)
            if (r1 > r2) goto L_0x008c
            goto L_0x019c
        L_0x0142:
            d.a.a.a.r.b.m r11 = p048d.p049a.p050a.p051a.p075r.p077b.C3068m.m13127U1()
            java.lang.String r5 = r10.getString(r5)
            r7 = 2131886204(0x7f12007c, float:1.940698E38)
            java.lang.String r7 = r10.getString(r7)
            java.lang.String r5 = r5.concat(r7)
            d.a.a.a.n.b.i r7 = p048d.p049a.p050a.p051a.p067n.p069b.C3001i.m12806f(r10)
            d.a.a.a.o.a.v r8 = p048d.p049a.p050a.p051a.p078s.C3097j.f9871c
            java.lang.Long r8 = r8.mo10614e()
            long r8 = r8.longValue()
            d.a.a.a.n.c.c r2 = r7.mo10345b(r8, r5, r2)
            if (r2 == 0) goto L_0x008c
            java.util.Date r5 = r2.mo10417V()
            int r5 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r5)
            java.util.Date r7 = p048d.p049a.p050a.p051a.p078s.C3101n.m13317k(r6)
            int r7 = p048d.p049a.p050a.p051a.p078s.C3101n.m13319m(r7)
            if (r5 > r7) goto L_0x008c
            java.lang.String r2 = r2.mo10416U()
            java.lang.Class<d.a.a.a.o.a.h0> r5 = p048d.p049a.p050a.p051a.p071o.p072a.C3023h0.class
            java.lang.Object r1 = r1.mo15341i(r2, r5)
            d.a.a.a.o.a.h0 r1 = (p048d.p049a.p050a.p051a.p071o.p072a.C3023h0) r1
            if (r1 == 0) goto L_0x008c
            goto L_0x019c
        L_0x018a:
            academia.bracu.com.academia.common.fragments.c0 r11 = academia.bracu.com.academia.common.fragments.C0099c0.m386Q1()
            d.a.a.a.f.e r1 = r10.f650G
            d.a.a.a.f.h r1 = r1.f9074b
            d.a.a.a.f.a r1 = r1.f9084b
            androidx.appcompat.widget.Toolbar r1 = r1.f9048b
            r2 = 2131886118(0x7f120026, float:1.9406806E38)
            r1.setTitle((int) r2)
        L_0x019c:
            r0.putBoolean(r4, r3)
        L_0x019f:
            r11.mo3233u1(r0)
        L_0x01a2:
            if (r11 == 0) goto L_0x01a7
            r10.m701n0(r11)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: academia.bracu.com.academia.student.activity.StudentHomeActivity.m697i0(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m698k0() {
        new C5441a(this).mo15746e();
    }

    /* renamed from: l0 */
    private void m699l0() {
        Snackbar Z = Snackbar.m10402Z(getWindow().getDecorView().findViewById(16908290), getString(C2722R.string.restart_to_update), -2);
        Z.mo8710a0(getString(C2722R.string.action_restart), new C0199h(this));
        Z.mo8654C().setBackgroundColor(C3267a.m14074d(this, C2722R.color.colorAccent));
        Z.mo8663P();
    }

    /* renamed from: m0 */
    private void m700m0(C5056a aVar) {
        try {
            this.f645B.mo15169d(aVar, 0, this, 111);
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n0 */
    private void m701n0(Fragment fragment) {
        Bundle w;
        if (!C3101n.m13328w(this) && ((w = fragment.mo3237w()) == null || !w.getBoolean("individual_fragment_data_availability"))) {
            this.f647D = C3101n.m13306V(this, getString(C2722R.string.internet_connection_warning_message), getString(C2722R.string.text_retry), new C0195d(this, fragment));
        } else {
            C3101n.m13311d(this, fragment, C2879b.STUDENT);
        }
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo568b0(C5056a aVar) {
        if (aVar.mo15162r() == 2 && aVar.mo15158n(0)) {
            this.f646C = aVar;
            m700m0(aVar);
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ boolean mo569c0(MenuItem menuItem) {
        m697i0(menuItem.getItemId());
        onBackPressed();
        return true;
    }

    /* renamed from: d0 */
    public /* synthetic */ void mo570d0(View view) {
        m700m0(this.f646C);
    }

    /* renamed from: e */
    public void mo301e(String str) {
        this.f650G.f9074b.f9084b.f9048b.setTitle((CharSequence) str);
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo571e0(String str, String str2, DialogInterface dialogInterface, int i) {
        if (str.equals("Go to link")) {
            dialogInterface.dismiss();
            C3101n.m13325t(this, str2);
            return;
        }
        dialogInterface.cancel();
        dialogInterface.dismiss();
        m687S();
    }

    /* renamed from: f */
    public void mo302f(int i) {
        if (i == C2722R.C2724id.nav_common_bracu_anthem) {
            try {
                if (!this.f653z) {
                    MediaPlayer create = MediaPlayer.create(this, C2722R.raw.bracu_anthem);
                    this.f644A = create;
                    create.start();
                    this.f653z = true;
                    return;
                }
                this.f653z = false;
                this.f644A.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == C2722R.C2724id.nav_common_qr_reader) {
            m687S();
        } else {
            m697i0(i);
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo572g0(View view) {
        this.f645B.mo15166a();
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo573h0(Fragment fragment, View view) {
        m701n0(fragment);
    }

    /* renamed from: j0 */
    public void mo303k(C5086b bVar) {
        if (bVar.mo15193d() == 11) {
            m699l0();
        }
    }

    /* renamed from: m */
    public void mo575m(boolean z) {
        this.f648E = z;
    }

    /* renamed from: n */
    public void mo424n(C2882e eVar) {
        C3027j0 j0Var;
        Bitmap decodeFile;
        C6550a.m26771a("onProfileUpdated", new Object[0]);
        View f = this.f650G.f9076d.mo8615f(0);
        CircleImageView circleImageView = (CircleImageView) f.findViewById(C2722R.C2724id.imv_profile_picture);
        TextView textView = (TextView) f.findViewById(C2722R.C2724id.tv_profile_name);
        TextView textView2 = (TextView) f.findViewById(C2722R.C2724id.tv_profile_email);
        LinearLayout linearLayout = (LinearLayout) f.findViewById(C2722R.C2724id.ll_profile_info);
        C5221f fVar = new C5221f();
        try {
            String string = getString(C2722R.string.endpoint_student_profile);
            C3046v vVar = (C3046v) fVar.mo15341i(C3099l.m13277b(this).mo10691d("student_login_json"), C3046v.class);
            C3097j.f9871c = vVar;
            vVar.mo10615f("AX32WOHH231FDS2158N14L8N");
            C3006c a = C3001i.m12806f(this).mo10344a(C3097j.f9871c.mo10614e().longValue(), string);
            if (a != null && (j0Var = ((C3029k0) fVar.mo15341i(a.mo10416U(), C3029k0.class)).mo10538g().get(0)) != null) {
                if ((eVar == C2882e.LOGIN && C3097j.f9871c.mo10613d().equals(j0Var.mo10526f())) || eVar == C2882e.PROFILE) {
                    String str = this.f651x;
                    File file = new File(str, j0Var.mo10526f() + ".png");
                    if (file.exists() && (decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath())) != null) {
                        circleImageView.setImageBitmap(decodeFile);
                    }
                    textView.setText(j0Var.mo10522b());
                    textView2.setText(j0Var.mo10521a());
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
                    builder.setPositiveButton(string, new C0197f(this, string, a)).setNegativeButton("Close", C0194c.f663f);
                    builder.create().show();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i2 != -1) {
            Toast.makeText(this, "Update flow failed!", 0).show();
            if (this.f646C != null) {
                Snackbar Z = Snackbar.m10402Z(getWindow().getDecorView().findViewById(16908290), getString(C2722R.string.retry_to_update), 0);
                Z.mo8710a0(getString(C2722R.string.text_retry), new C0196e(this));
                Z.mo8654C().setBackgroundColor(C3267a.m14074d(this, C2722R.color.colorAccent));
                Z.mo8663P();
            }
        }
    }

    public void onBackPressed() {
        Fragment s = C3101n.m13324s(this);
        if (this.f650G.f9075c.mo3038C(8388611)) {
            this.f650G.f9075c.mo3060d(8388611);
        } else if (s == null || s.mo3171T() == null || s.mo3171T().equals(C3082r.class.getSimpleName())) {
            C3101n.m13321p().mo10699P(this, this);
        } else {
            C3101n.m13311d(this, C3082r.m13235m2(false, this.f648E), C2879b.STUDENT);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2839e c = C2839e.m12357c(getLayoutInflater());
        this.f650G = c;
        setContentView((View) c.mo10169b());
        C3101n.m13301O(this, this.f650G.f9075c);
        m695a0();
        C5221f fVar = new C5221f();
        C3046v vVar = (C3046v) fVar.mo15341i(C3099l.m13277b(this).mo10691d("student_login_json"), C3046v.class);
        C3097j.f9871c = vVar;
        vVar.mo10615f("AX32WOHH231FDS2158N14L8N");
        C3101n.m13311d(this, C3082r.m13235m2(true, this.f648E), C2879b.STUDENT);
        File dir = new ContextWrapper(getApplicationContext()).getDir("images", 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        this.f651x = dir.toString();
        this.f649F = new C0187a(fVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C5058b bVar = this.f645B;
        if (bVar != null) {
            bVar.mo15170e(this);
        }
        Snackbar snackbar = this.f647D;
        if (snackbar != null && snackbar.mo8657G()) {
            try {
                this.f647D.mo8667t();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f649F != null) {
            C3465a.m14960b(this).mo11861e(this.f649F);
            this.f649F = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        Fragment s = C3101n.m13324s(this);
        if (!C3101n.m13328w(this) && s != null && s.mo3171T() != null && !s.mo3171T().equals(C3082r.class.getSimpleName())) {
            try {
                finish();
                startActivity(new Intent(this, StudentHomeActivity.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3465a.m14960b(this).mo11859c(this.f649F, new IntentFilter("academia.bracu.com.academia.action.push"));
        if (this.f645B != null) {
            m692X();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        MediaPlayer mediaPlayer = this.f644A;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f644A.stop();
        }
    }

    /* renamed from: p */
    public void mo577p(boolean z) {
    }

    /* renamed from: r */
    public void mo427r(List<C3011b0> list) {
    }

    /* renamed from: t */
    public void mo428t() {
        String str;
        try {
            MenuItem findItem = this.f650G.f9076d.getMenu().findItem(C2722R.C2724id.nav_student_notifications);
            C5782q0<C3007d> c = C3002j.m12812k(this).mo10349c(C3097j.f9871c.mo10614e().longValue());
            if (c == null || c.size() <= 0) {
                str = " (0)";
            } else {
                str = " (" + c.size() + ")";
            }
            findItem.setTitle(getString(C2722R.string.text_notifications) + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
