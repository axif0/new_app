package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.C2575y;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.C3731f;
import p148g.p189d.p190a.p191a.C3732g;

public class FirebaseMessagingService extends C2631g {

    /* renamed from: k */
    private static final Queue<String> f8421k = new ArrayDeque(10);

    /* renamed from: j */
    private boolean m11664j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!f8421k.contains(str)) {
            if (f8421k.size() >= 10) {
                f8421k.remove();
            }
            f8421k.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
            return true;
        }
    }

    /* renamed from: k */
    private void m11665k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C2644p.m11762t(extras)) {
            C2644p pVar = new C2644p(extras);
            ExecutorService c = C2633h.m11714c();
            try {
                if (!new C2627c(this, pVar, c).mo9576a()) {
                    if (C2643o.m11733B(intent)) {
                        C2643o.m11754u(intent);
                    }
                } else {
                    return;
                }
            } finally {
                c.shutdown();
            }
        }
        mo516p(new C2645q(extras));
    }

    /* renamed from: l */
    private String m11666l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: m */
    private void m11667m(Intent intent) {
        if (!m11664j(intent.getStringExtra("google.message_id"))) {
            m11669t(intent);
        }
    }

    /* renamed from: n */
    private void m11668n(Intent intent) {
        if (C2643o.m11733B(intent)) {
            C2643o.m11755v(intent);
        }
    }

    /* renamed from: t */
    private void m11669t(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 1;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 0;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 3;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            if (C2643o.m11733B(intent)) {
                C2643o.m11756w(intent, (C3731f<String>) null);
            }
            if (C2643o.m11732A(intent)) {
                C3732g a = FirebaseMessaging.m11659a();
                if (a != null) {
                    C2643o.m11756w(intent, a.mo9569a("FCM_CLIENT_EVENT_LOGGING", String.class, C3727b.m15581b("json"), C2636k.f8444a));
                } else {
                    Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                }
            }
            m11665k(intent);
        } else if (c == 1) {
            mo9573o();
        } else if (c == 2) {
            mo9574q(intent.getStringExtra("google.message_id"));
        } else if (c != 3) {
            String valueOf = String.valueOf(stringExtra);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Received message with unknown type: ".concat(valueOf) : new String("Received message with unknown type: "));
        } else {
            mo9575s(m11666l(intent), new C2649s(intent.getStringExtra("error")));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Intent mo9570c(Intent intent) {
        return C2575y.m11465b().mo9471c();
    }

    /* renamed from: d */
    public void mo9571d(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            m11667m(intent);
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(action)) {
            if (C2643o.m11733B(intent)) {
                C2643o.m11753t(intent);
            }
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            mo517r(intent.getStringExtra("token"));
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Unknown intent action: ".concat(valueOf) : new String("Unknown intent action: "));
        }
    }

    /* renamed from: e */
    public boolean mo9572e(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        m11668n(intent);
        return true;
    }

    /* renamed from: o */
    public void mo9573o() {
    }

    /* renamed from: p */
    public void mo516p(C2645q qVar) {
    }

    /* renamed from: q */
    public void mo9574q(String str) {
    }

    /* renamed from: r */
    public void mo517r(String str) {
    }

    /* renamed from: s */
    public void mo9575s(String str, Exception exc) {
    }
}
