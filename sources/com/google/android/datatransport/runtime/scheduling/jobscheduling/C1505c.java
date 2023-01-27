package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1511g;
import java.util.Map;
import p148g.p189d.p190a.p191a.C3729d;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
final class C1505c extends C1511g {

    /* renamed from: a */
    private final C3821a f5082a;

    /* renamed from: b */
    private final Map<C3729d, C1511g.C1513b> f5083b;

    C1505c(C3821a aVar, Map<C3729d, C1511g.C1513b> map) {
        if (aVar != null) {
            this.f5082a = aVar;
            if (map != null) {
                this.f5083b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C3821a mo6150d() {
        return this.f5082a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1511g)) {
            return false;
        }
        C1511g gVar = (C1511g) obj;
        return this.f5082a.equals(gVar.mo6150d()) && this.f5083b.equals(gVar.mo6152g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<C3729d, C1511g.C1513b> mo6152g() {
        return this.f5083b;
    }

    public int hashCode() {
        return ((this.f5082a.hashCode() ^ 1000003) * 1000003) ^ this.f5083b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f5082a + ", values=" + this.f5083b + "}";
    }
}
