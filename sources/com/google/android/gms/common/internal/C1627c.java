package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C1547a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p086f.p102e.C3192b;
import p148g.p189d.p190a.p232c.p248g.C4910a;

/* renamed from: com.google.android.gms.common.internal.c */
public final class C1627c {

    /* renamed from: a */
    private final Account f5461a;

    /* renamed from: b */
    private final Set<Scope> f5462b;

    /* renamed from: c */
    private final Set<Scope> f5463c;

    /* renamed from: d */
    private final Map<C1547a<?>, C1629b> f5464d;

    /* renamed from: e */
    private final View f5465e;

    /* renamed from: f */
    private final String f5466f;

    /* renamed from: g */
    private final String f5467g;

    /* renamed from: h */
    private final C4910a f5468h;

    /* renamed from: i */
    private Integer f5469i;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public static final class C1628a {

        /* renamed from: a */
        private Account f5470a;

        /* renamed from: b */
        private C3192b<Scope> f5471b;

        /* renamed from: c */
        private Map<C1547a<?>, C1629b> f5472c;

        /* renamed from: d */
        private int f5473d = 0;

        /* renamed from: e */
        private View f5474e;

        /* renamed from: f */
        private String f5475f;

        /* renamed from: g */
        private String f5476g;

        /* renamed from: h */
        private C4910a f5477h = C4910a.f14708i;

        /* renamed from: i */
        private boolean f5478i;

        /* renamed from: a */
        public final C1628a mo6508a(Collection<Scope> collection) {
            if (this.f5471b == null) {
                this.f5471b = new C3192b<>();
            }
            this.f5471b.addAll(collection);
            return this;
        }

        /* renamed from: b */
        public final C1627c mo6509b() {
            return new C1627c(this.f5470a, this.f5471b, this.f5472c, this.f5473d, this.f5474e, this.f5475f, this.f5476g, this.f5477h, this.f5478i);
        }

        /* renamed from: c */
        public final C1628a mo6510c(Account account) {
            this.f5470a = account;
            return this;
        }

        /* renamed from: d */
        public final C1628a mo6511d(String str) {
            this.f5476g = str;
            return this;
        }

        /* renamed from: e */
        public final C1628a mo6512e(String str) {
            this.f5475f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public static final class C1629b {

        /* renamed from: a */
        public final Set<Scope> f5479a;
    }

    public C1627c(Account account, Set<Scope> set, Map<C1547a<?>, C1629b> map, int i, View view, String str, String str2, C4910a aVar, boolean z) {
        this.f5461a = account;
        this.f5462b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f5464d = map == null ? Collections.EMPTY_MAP : map;
        this.f5465e = view;
        this.f5466f = str;
        this.f5467g = str2;
        this.f5468h = aVar;
        HashSet hashSet = new HashSet(this.f5462b);
        for (C1629b bVar : this.f5464d.values()) {
            hashSet.addAll(bVar.f5479a);
        }
        this.f5463c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final Account mo6499a() {
        return this.f5461a;
    }

    /* renamed from: b */
    public final Account mo6500b() {
        Account account = this.f5461a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> mo6501c() {
        return this.f5463c;
    }

    /* renamed from: d */
    public final Integer mo6502d() {
        return this.f5469i;
    }

    /* renamed from: e */
    public final String mo6503e() {
        return this.f5467g;
    }

    /* renamed from: f */
    public final String mo6504f() {
        return this.f5466f;
    }

    /* renamed from: g */
    public final Set<Scope> mo6505g() {
        return this.f5462b;
    }

    /* renamed from: h */
    public final C4910a mo6506h() {
        return this.f5468h;
    }

    /* renamed from: i */
    public final void mo6507i(Integer num) {
        this.f5469i = num;
    }
}
