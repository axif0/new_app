package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
final class C1489c extends C1496h {

    /* renamed from: a */
    private final Context f5055a;

    /* renamed from: b */
    private final C3821a f5056b;

    /* renamed from: c */
    private final C3821a f5057c;

    /* renamed from: d */
    private final String f5058d;

    C1489c(Context context, C3821a aVar, C3821a aVar2, String str) {
        if (context != null) {
            this.f5055a = context;
            if (aVar != null) {
                this.f5056b = aVar;
                if (aVar2 != null) {
                    this.f5057c = aVar2;
                    if (str != null) {
                        this.f5058d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: b */
    public Context mo6131b() {
        return this.f5055a;
    }

    /* renamed from: c */
    public String mo6132c() {
        return this.f5058d;
    }

    /* renamed from: d */
    public C3821a mo6133d() {
        return this.f5057c;
    }

    /* renamed from: e */
    public C3821a mo6134e() {
        return this.f5056b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1496h)) {
            return false;
        }
        C1496h hVar = (C1496h) obj;
        return this.f5055a.equals(hVar.mo6131b()) && this.f5056b.equals(hVar.mo6134e()) && this.f5057c.equals(hVar.mo6133d()) && this.f5058d.equals(hVar.mo6132c());
    }

    public int hashCode() {
        return ((((((this.f5055a.hashCode() ^ 1000003) * 1000003) ^ this.f5056b.hashCode()) * 1000003) ^ this.f5057c.hashCode()) * 1000003) ^ this.f5058d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5055a + ", wallClock=" + this.f5056b + ", monotonicClock=" + this.f5057c + ", backendName=" + this.f5058d + "}";
    }
}
