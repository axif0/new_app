package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
class C0745c implements C0743a {

    /* renamed from: a */
    int f2997a = 0;

    /* renamed from: b */
    int f2998b = 0;

    /* renamed from: c */
    int f2999c = 0;

    /* renamed from: d */
    int f3000d = -1;

    C0745c() {
    }

    /* renamed from: a */
    public int mo3728a() {
        return this.f2998b;
    }

    /* renamed from: b */
    public int mo3729b() {
        int i = this.f2999c;
        int c = mo3730c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo3730c() {
        int i = this.f3000d;
        return i != -1 ? i : AudioAttributesCompat.m3678a(false, this.f2999c, this.f2997a);
    }

    /* renamed from: d */
    public int mo3731d() {
        return this.f2997a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0745c)) {
            return false;
        }
        C0745c cVar = (C0745c) obj;
        return this.f2998b == cVar.mo3728a() && this.f2999c == cVar.mo3729b() && this.f2997a == cVar.mo3731d() && this.f3000d == cVar.f3000d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2998b), Integer.valueOf(this.f2999c), Integer.valueOf(this.f2997a), Integer.valueOf(this.f3000d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3000d != -1) {
            sb.append(" stream=");
            sb.append(this.f3000d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m3679b(this.f2997a));
        sb.append(" content=");
        sb.append(this.f2998b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2999c).toUpperCase());
        return sb.toString();
    }
}
