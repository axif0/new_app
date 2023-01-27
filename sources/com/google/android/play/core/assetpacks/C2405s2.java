package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.s2 */
final class C2405s2 {

    /* renamed from: a */
    private final String f7954a;

    /* renamed from: b */
    private final long f7955b;

    /* renamed from: c */
    private final int f7956c;

    /* renamed from: d */
    private final boolean f7957d;

    /* renamed from: e */
    private final boolean f7958e;

    /* renamed from: f */
    private final byte[] f7959f;

    C2405s2() {
    }

    C2405s2(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f7954a = str;
        this.f7955b = j;
        this.f7956c = i;
        this.f7957d = z;
        this.f7958e = z2;
        this.f7959f = bArr;
    }

    /* renamed from: a */
    static C2405s2 m11026a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C2405s2(str, j, i, z, z2, bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo9233b() {
        if (mo9235d() == null) {
            return false;
        }
        return mo9235d().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo9234c() {
        return mo9238f() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9235d() {
        return this.f7954a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo9236e() {
        return this.f7955b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2405s2) {
            C2405s2 s2Var = (C2405s2) obj;
            String str = this.f7954a;
            if (str != null ? str.equals(s2Var.mo9235d()) : s2Var.mo9235d() == null) {
                if (this.f7955b == s2Var.mo9236e() && this.f7956c == s2Var.mo9238f() && this.f7957d == s2Var.mo9239g() && this.f7958e == s2Var.mo9240h()) {
                    if (Arrays.equals(this.f7959f, s2Var instanceof C2405s2 ? s2Var.f7959f : s2Var.mo9242i())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9238f() {
        return this.f7956c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo9239g() {
        return this.f7957d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9240h() {
        return this.f7958e;
    }

    public int hashCode() {
        String str = this.f7954a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f7955b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f7956c) * 1000003) ^ (true != this.f7957d ? 1237 : 1231)) * 1000003;
        if (true == this.f7958e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f7959f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte[] mo9242i() {
        return this.f7959f;
    }

    public String toString() {
        String str = this.f7954a;
        long j = this.f7955b;
        int i = this.f7956c;
        boolean z = this.f7957d;
        boolean z2 = this.f7958e;
        String arrays = Arrays.toString(this.f7959f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
