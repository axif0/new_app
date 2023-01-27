package com.journeyapps.barcodescanner;

/* renamed from: com.journeyapps.barcodescanner.l */
public class C2692l implements Comparable<C2692l> {

    /* renamed from: f */
    public final int f8612f;

    /* renamed from: g */
    public final int f8613g;

    public C2692l(int i, int i2) {
        this.f8612f = i;
        this.f8613g = i2;
    }

    /* renamed from: e */
    public int compareTo(C2692l lVar) {
        int i = this.f8613g * this.f8612f;
        int i2 = lVar.f8613g * lVar.f8612f;
        if (i2 < i) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2692l.class != obj.getClass()) {
            return false;
        }
        C2692l lVar = (C2692l) obj;
        return this.f8612f == lVar.f8612f && this.f8613g == lVar.f8613g;
    }

    /* renamed from: g */
    public C2692l mo9817g() {
        return new C2692l(this.f8613g, this.f8612f);
    }

    /* renamed from: h */
    public C2692l mo9818h(C2692l lVar) {
        int i = this.f8612f;
        int i2 = lVar.f8613g;
        int i3 = i * i2;
        int i4 = lVar.f8612f;
        int i5 = this.f8613g;
        return i3 <= i4 * i5 ? new C2692l(i4, (i5 * i4) / i) : new C2692l((i * i2) / i5, i2);
    }

    public int hashCode() {
        return (this.f8612f * 31) + this.f8613g;
    }

    /* renamed from: i */
    public C2692l mo9820i(C2692l lVar) {
        int i = this.f8612f;
        int i2 = lVar.f8613g;
        int i3 = i * i2;
        int i4 = lVar.f8612f;
        int i5 = this.f8613g;
        return i3 >= i4 * i5 ? new C2692l(i4, (i5 * i4) / i) : new C2692l((i * i2) / i5, i2);
    }

    public String toString() {
        return this.f8612f + "x" + this.f8613g;
    }
}
