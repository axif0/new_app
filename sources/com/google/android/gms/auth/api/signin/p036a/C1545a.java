package com.google.android.gms.auth.api.signin.p036a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.a.a */
public class C1545a {

    /* renamed from: c */
    private static final Lock f5301c = new ReentrantLock();

    /* renamed from: d */
    private static C1545a f5302d;

    /* renamed from: a */
    private final Lock f5303a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f5304b;

    private C1545a(Context context) {
        this.f5304b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C1545a m7490a(Context context) {
        C1658o.m7845j(context);
        f5301c.lock();
        try {
            if (f5302d == null) {
                f5302d = new C1545a(context.getApplicationContext());
            }
            return f5302d;
        } finally {
            f5301c.unlock();
        }
    }

    /* renamed from: c */
    private static String m7491c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    private final GoogleSignInAccount m7492d(String str) {
        String e;
        if (!TextUtils.isEmpty(str) && (e = m7493e(m7491c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m7478B(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private final String m7493e(String str) {
        this.f5303a.lock();
        try {
            return this.f5304b.getString(str, (String) null);
        } finally {
            this.f5303a.unlock();
        }
    }

    /* renamed from: b */
    public GoogleSignInAccount mo6302b() {
        return m7492d(m7493e("defaultGoogleSignInAccount"));
    }
}
