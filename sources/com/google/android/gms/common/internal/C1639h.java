package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class C1639h {

    /* renamed from: f */
    private static final Object f5510f = new Object();

    /* renamed from: g */
    private static C1639h f5511g;

    /* renamed from: com.google.android.gms.common.internal.h$a */
    protected static final class C1640a {

        /* renamed from: a */
        private final String f5512a;

        /* renamed from: b */
        private final String f5513b;

        /* renamed from: c */
        private final ComponentName f5514c = null;

        /* renamed from: d */
        private final int f5515d;

        public C1640a(String str, String str2, int i) {
            C1658o.m7841f(str);
            this.f5512a = str;
            C1658o.m7841f(str2);
            this.f5513b = str2;
            this.f5515d = i;
        }

        /* renamed from: a */
        public final ComponentName mo6538a() {
            return this.f5514c;
        }

        /* renamed from: b */
        public final String mo6539b() {
            return this.f5513b;
        }

        /* renamed from: c */
        public final Intent mo6540c(Context context) {
            return this.f5512a != null ? new Intent(this.f5512a).setPackage(this.f5513b) : new Intent().setComponent(this.f5514c);
        }

        /* renamed from: d */
        public final int mo6541d() {
            return this.f5515d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1640a)) {
                return false;
            }
            C1640a aVar = (C1640a) obj;
            return C1655n.m7832a(this.f5512a, aVar.f5512a) && C1655n.m7832a(this.f5513b, aVar.f5513b) && C1655n.m7832a(this.f5514c, aVar.f5514c) && this.f5515d == aVar.f5515d;
        }

        public final int hashCode() {
            return C1655n.m7833b(this.f5512a, this.f5513b, this.f5514c, Integer.valueOf(this.f5515d));
        }

        public final String toString() {
            String str = this.f5512a;
            return str == null ? this.f5514c.flattenToString() : str;
        }
    }

    /* renamed from: a */
    public static C1639h m7803a(Context context) {
        synchronized (f5510f) {
            if (f5511g == null) {
                f5511g = new C1630c0(context.getApplicationContext());
            }
        }
        return f5511g;
    }

    /* renamed from: b */
    public final void mo6537b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo6514d(new C1640a(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo6513c(C1640a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo6514d(C1640a aVar, ServiceConnection serviceConnection, String str);
}
