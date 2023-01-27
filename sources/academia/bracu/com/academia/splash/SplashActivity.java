package academia.bracu.com.academia.splash;

import academia.bracu.com.academia.common.activities.CommonHomeActivity;
import academia.bracu.com.academia.faculty.activity.FacultyHomeActivity;
import academia.bracu.com.academia.service.C0176c;
import academia.bracu.com.academia.student.activity.StudentHomeActivity;
import android.content.Intent;
import android.os.Bundle;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.HashMap;
import java.util.Set;
import p048d.p049a.p050a.p051a.p059h.C2884g;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p148g.p149a.p150a.p151a.C3582b;
import p148g.p189d.p289c.C5221f;
import p148g.p330f.p331a.p332a.p333b.C5595a;
import p390p.p391a.C6550a;

public class SplashActivity extends C0182a {
    static {
        Class<SplashActivity> cls = SplashActivity.class;
    }

    /* renamed from: U */
    public void mo552U() {
        Intent intent;
        StringBuilder sb;
        if (C3099l.m13277b(this).mo10692e("authentication_api_key", BuildConfig.FLAVOR).isEmpty() || !C3099l.m13277b(this).mo10689a("app_accessibility")) {
            intent = new Intent(this, CommonHomeActivity.class);
        } else {
            int c = C3099l.m13277b(this).mo10690c("logged_in_user_type", -1);
            intent = c == C2884g.STUDENT.ordinal() ? new Intent(this, StudentHomeActivity.class) : c == C2884g.FACULTY.ordinal() ? new Intent(this, FacultyHomeActivity.class) : new Intent(this, CommonHomeActivity.class);
        }
        Bundle extras = getIntent().getExtras();
        String d = C3099l.m13277b(this).mo10691d(getString(C2722R.string.single_push_notification));
        if (extras != null && d.isEmpty()) {
            C5221f fVar = new C5221f();
            C0176c cVar = new C0176c();
            Set<String> keySet = extras.keySet();
            HashMap hashMap = new HashMap();
            for (String str : keySet) {
                Object obj = extras.get(str);
                C6550a.m26771a("Key: " + str + " Value: " + obj, new Object[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BuildConfig.FLAVOR);
                sb2.append(obj);
                hashMap.put(str, sb2.toString());
                if (str.equals("title")) {
                    sb = new StringBuilder();
                } else if (str.equals("message")) {
                    sb = new StringBuilder();
                }
                sb.append(BuildConfig.FLAVOR);
                sb.append(obj);
                cVar.mo526g(sb.toString());
            }
            cVar.mo523d(hashMap);
            if (!cVar.mo522c().isEmpty() && !cVar.mo520a().isEmpty()) {
                C3099l.m13277b(this).mo10696i(getString(C2722R.string.single_push_notification), fVar.mo15349r(cVar));
            }
        }
        startActivity(intent);
        finish();
    }

    /* renamed from: W */
    public void mo553W(C5595a aVar) {
        aVar.mo16126z(C2722R.color.colorBackground);
        aVar.mo16120t(1500);
        aVar.mo16100F(4);
        aVar.mo16101G(2);
        aVar.mo16096A(C2722R.C2723drawable.ic_bracu_logo_blue);
        aVar.mo16121u(2000);
        aVar.mo16122v(C3582b.Bounce);
        aVar.mo16097B(400);
        aVar.mo16098D(400);
        aVar.mo16124x(2000);
        aVar.mo16099E(3);
        aVar.mo16123w(2000);
        aVar.mo16125y(200);
    }
}
