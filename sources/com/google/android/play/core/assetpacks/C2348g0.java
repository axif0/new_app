package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.g0 */
final class C2348g0 extends C2322b {

    /* renamed from: a */
    private final int f7768a;

    /* renamed from: b */
    private final String f7769b;

    /* renamed from: c */
    private final String f7770c;

    C2348g0(int i, String str, String str2) {
        this.f7768a = i;
        this.f7769b = str;
        this.f7770c = str2;
    }

    /* renamed from: b */
    public final String mo9100b() {
        return this.f7770c;
    }

    /* renamed from: c */
    public final int mo9101c() {
        return this.f7768a;
    }

    /* renamed from: d */
    public final String mo9102d() {
        return this.f7769b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2322b) {
            C2322b bVar = (C2322b) obj;
            if (this.f7768a == bVar.mo9101c() && ((str = this.f7769b) != null ? str.equals(bVar.mo9102d()) : bVar.mo9102d() == null)) {
                String str2 = this.f7770c;
                String b = bVar.mo9100b();
                if (str2 != null ? str2.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f7768a ^ 1000003) * 1000003;
        String str = this.f7769b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f7770c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f7768a;
        String str = this.f7769b;
        String str2 = this.f7770c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
