package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p086f.p111h.p112e.C3267a;

/* renamed from: com.google.android.gms.measurement.internal.m */
public final class C1861m extends C1760d6 {

    /* renamed from: c */
    private long f6035c;

    /* renamed from: d */
    private String f6036d;

    /* renamed from: e */
    private Boolean f6037e;

    /* renamed from: f */
    private AccountManager f6038f;

    /* renamed from: g */
    private Boolean f6039g;

    /* renamed from: h */
    private long f6040h;

    C1861m(C1807h5 h5Var) {
        super(h5Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo6689r() {
        Calendar instance = Calendar.getInstance();
        this.f6035c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f6036d = sb.toString();
        return false;
    }

    /* renamed from: t */
    public final boolean mo7231t(Context context) {
        if (this.f6037e == null) {
            this.f6037e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f6037e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f6037e.booleanValue();
    }

    /* renamed from: u */
    public final long mo7232u() {
        mo6864o();
        return this.f6035c;
    }

    /* renamed from: v */
    public final String mo7233v() {
        mo6864o();
        return this.f6036d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final long mo7234w() {
        mo6700b();
        return this.f6040h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo7235x() {
        mo6700b();
        this.f6039g = null;
        this.f6040h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo7236y() {
        mo6700b();
        long c = mo6708g().mo6587c();
        if (c - this.f6040h > 86400000) {
            this.f6039g = null;
        }
        Boolean bool = this.f6039g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C3267a.m14071a(mo6710j(), "android.permission.GET_ACCOUNTS") != 0) {
            mo6709i().mo6768I().mo6885a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f6038f == null) {
                this.f6038f = AccountManager.get(mo6710j());
            }
            try {
                Account[] result = this.f6038f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f6038f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f6039g = Boolean.TRUE;
                        this.f6040h = c;
                        return true;
                    }
                } else {
                    this.f6039g = Boolean.TRUE;
                    this.f6040h = c;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                mo6709i().mo6765F().mo6886b("Exception checking account types", e);
            }
        }
        this.f6040h = c;
        this.f6039g = Boolean.FALSE;
        return false;
    }
}
