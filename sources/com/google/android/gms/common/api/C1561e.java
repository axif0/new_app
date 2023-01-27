package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.C1547a.C1551d;
import com.google.android.gms.common.api.internal.C1572b;
import com.google.android.gms.common.api.internal.C1580d0;
import com.google.android.gms.common.api.internal.C1601v;
import com.google.android.gms.common.internal.C1627c;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.e */
public class C1561e<O extends C1547a.C1551d> {

    /* renamed from: a */
    private final Context f5318a;

    /* renamed from: b */
    private final C1547a<O> f5319b;

    /* renamed from: c */
    private final O f5320c;

    /* renamed from: d */
    private final C1580d0<O> f5321d;

    /* renamed from: e */
    private final int f5322e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1627c.C1628a mo6344a() {
        Account account;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        C1627c.C1628a aVar = new C1627c.C1628a();
        O o = this.f5320c;
        if (!(o instanceof C1547a.C1551d.C1553b) || (a2 = ((C1547a.C1551d.C1553b) o).mo6327a()) == null) {
            O o2 = this.f5320c;
            account = o2 instanceof C1547a.C1551d.C1552a ? ((C1547a.C1551d.C1552a) o2).mo6326k() : null;
        } else {
            account = a2.mo6290d();
        }
        aVar.mo6510c(account);
        O o3 = this.f5320c;
        aVar.mo6508a((!(o3 instanceof C1547a.C1551d.C1553b) || (a = ((C1547a.C1551d.C1553b) o3).mo6327a()) == null) ? Collections.emptySet() : a.mo6300w());
        aVar.mo6511d(this.f5318a.getClass().getName());
        aVar.mo6512e(this.f5318a.getPackageName());
        return aVar;
    }

    /* renamed from: b */
    public final int mo6345b() {
        return this.f5322e;
    }

    /* renamed from: c */
    public C1547a.C1555f mo6346c(Looper looper, C1572b.C1573a<O> aVar) {
        return this.f5319b.mo6324b().mo6325a(this.f5318a, looper, mo6344a().mo6509b(), this.f5320c, aVar, aVar);
    }

    /* renamed from: d */
    public C1601v mo6347d(Context context, Handler handler) {
        return new C1601v(context, handler, mo6344a().mo6509b());
    }

    /* renamed from: e */
    public final C1580d0<O> mo6348e() {
        return this.f5321d;
    }
}
