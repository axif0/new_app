package academia.bracu.com.academia.service;

import academia.bracu.com.academia.splash.SplashActivity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.C0575h;
import com.google.firebase.messaging.C2645q;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.util.Calendar;
import java.util.Map;
import p048d.p049a.p050a.p051a.p078s.C3099l;
import p086f.p140p.p141a.C3465a;
import p148g.p189d.p289c.C5221f;
import p390p.p391a.C6550a;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    static {
        Class<MyFirebaseMessagingService> cls = MyFirebaseMessagingService.class;
    }

    /* renamed from: u */
    private void m630u(int i, String str, String str2) {
        C6550a.m26771a("sendNotification: ", new Object[0]);
        Intent intent = new Intent(this, SplashActivity.class);
        intent.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1073741824);
        String string = getString(C2722R.string.default_notification_channel_id);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        C0575h.C0580e eVar = new C0575h.C0580e(this, string);
        eVar.mo2855u(C2722R.C2723drawable.ic_stat_bracu_notification);
        eVar.mo2846k(str);
        eVar.mo2845j(str2);
        eVar.mo2841f(true);
        eVar.mo2856v(defaultUri);
        eVar.mo2844i(activity);
        if (Build.VERSION.SDK_INT >= 21) {
            eVar.mo2843h(getResources().getColor(C2722R.color.color_white_100));
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(string, "Channel human readable title", 3);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        if (notificationManager != null) {
            notificationManager.notify(i, eVar.mo2839b());
        }
    }

    /* renamed from: v */
    private void m631v(String str) {
        C6550a.m26771a("sendTokenToServer: %s", str);
        C3099l.m13277b(getApplicationContext()).mo10696i("firebase_token", str);
    }

    /* renamed from: p */
    public void mo516p(C2645q qVar) {
        String str;
        String str2;
        super.mo516p(qVar);
        C6550a.m26771a("onMessageReceived: ", new Object[0]);
        Calendar instance = Calendar.getInstance();
        C0176c cVar = new C0176c();
        C2645q.C2647b f = qVar.mo9617f();
        String str3 = BuildConfig.FLAVOR;
        if (f != null) {
            try {
                str2 = qVar.mo9617f().mo9620c();
            } catch (Exception e) {
                e.printStackTrace();
                str2 = str3;
            }
            try {
                str3 = qVar.mo9617f().mo9619a();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            String str4 = str3;
            str3 = str2;
            str = str4;
        } else {
            str = str3;
        }
        Map<String, String> d = qVar.mo9616d();
        if (d.size() > 0) {
            for (String next : d.keySet()) {
                C6550a.m26771a("Key: " + next + " Value: " + d.get(next), new Object[0]);
            }
        }
        cVar.mo526g(str3);
        cVar.mo524e(str);
        cVar.mo523d(d);
        cVar.mo525f((int) instance.getTimeInMillis());
        Context applicationContext = getApplicationContext();
        String r = new C5221f().mo15349r(cVar);
        C3099l.m13277b(applicationContext).mo10696i(applicationContext.getString(C2722R.string.single_push_notification), r);
        m630u(cVar.mo521b(), str3, str);
        C3465a b = C3465a.m14960b(this);
        Intent intent = new Intent("academia.bracu.com.academia.action.push");
        intent.putExtra("notification", r);
        b.mo11860d(intent);
    }

    /* renamed from: r */
    public void mo517r(String str) {
        super.mo517r(str);
        m631v(str);
    }
}
