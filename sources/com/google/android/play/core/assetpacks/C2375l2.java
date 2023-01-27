package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.l2 */
final class C2375l2 {

    /* renamed from: a */
    private final int f7848a;

    /* renamed from: b */
    private final String f7849b;

    /* renamed from: c */
    private final long f7850c;

    /* renamed from: d */
    private final long f7851d;

    /* renamed from: e */
    private final int f7852e;

    C2375l2() {
    }

    C2375l2(int i, String str, long j, long j2, int i2) {
        this();
        this.f7848a = i;
        this.f7849b = str;
        this.f7850c = j;
        this.f7851d = j2;
        this.f7852e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9174a() {
        return this.f7848a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9175b() {
        return this.f7849b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo9176c() {
        return this.f7850c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo9177d() {
        return this.f7851d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo9178e() {
        return this.f7852e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f7849b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.C2375l2
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.l2 r8 = (com.google.android.play.core.assetpacks.C2375l2) r8
            int r1 = r7.f7848a
            int r3 = r8.mo9174a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f7849b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo9175b()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo9175b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f7850c
            long r5 = r8.mo9176c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f7851d
            long r5 = r8.mo9177d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f7852e
            int r8 = r8.mo9178e()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2375l2.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f7848a ^ 1000003) * 1000003;
        String str = this.f7849b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f7850c;
        long j2 = this.f7851d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f7852e;
    }

    public String toString() {
        int i = this.f7848a;
        String str = this.f7849b;
        long j = this.f7850c;
        long j2 = this.f7851d;
        int i2 = this.f7852e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
