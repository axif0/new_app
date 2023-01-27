package com.google.android.play.core.assetpacks;

import java.io.File;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.s0 */
final class C2403s0 {

    /* renamed from: f */
    private static final C5100f f7947f = new C5100f("ExtractChunkTaskHandler");

    /* renamed from: a */
    private final byte[] f7948a = new byte[8192];

    /* renamed from: b */
    private final C2328c0 f7949b;

    /* renamed from: c */
    private final C5099e0<C2371k3> f7950c;

    /* renamed from: d */
    private final C5099e0<C2418w> f7951d;

    /* renamed from: e */
    private final C2427y0 f7952e;

    C2403s0(C2328c0 c0Var, C5099e0<C2371k3> e0Var, C5099e0<C2418w> e0Var2, C2427y0 y0Var) {
        this.f7949b = c0Var;
        this.f7950c = e0Var;
        this.f7951d = e0Var2;
        this.f7952e = y0Var;
    }

    /* renamed from: b */
    private final File m11024b(C2399r0 r0Var) {
        File c = this.f7949b.mo9115c(r0Var.f7879b, r0Var.f7932c, r0Var.f7933d, r0Var.f7934e);
        if (!c.exists()) {
            c.mkdirs();
        }
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a4 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d8 A[Catch:{ all -> 0x032f, all -> 0x0335, IOException -> 0x033b }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0293 A[SYNTHETIC, Splitter:B:93:0x0293] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9231a(com.google.android.play.core.assetpacks.C2399r0 r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.m2 r0 = new com.google.android.play.core.assetpacks.m2
            com.google.android.play.core.assetpacks.c0 r4 = r1.f7949b
            java.lang.String r5 = r2.f7879b
            int r6 = r2.f7932c
            long r7 = r2.f7933d
            java.lang.String r9 = r2.f7934e
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.c0 r10 = r1.f7949b
            java.lang.String r11 = r2.f7879b
            int r12 = r2.f7932c
            long r13 = r2.f7933d
            java.lang.String r15 = r2.f7934e
            java.io.File r3 = r10.mo9134y(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.f7940k     // Catch:{ IOException -> 0x033b }
            int r4 = r2.f7935f     // Catch:{ IOException -> 0x033b }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x0040
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x033b }
            byte[] r5 = r1.f7948a     // Catch:{ IOException -> 0x033b }
            int r5 = r5.length     // Catch:{ IOException -> 0x033b }
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x033b }
            r15 = r4
        L_0x0040:
            int r3 = r2.f7936g     // Catch:{ all -> 0x032f }
            r16 = 0
            if (r3 <= 0) goto L_0x017c
            com.google.android.play.core.assetpacks.l2 r3 = r0.mo9211a()     // Catch:{ all -> 0x032f }
            int r4 = r3.mo9178e()     // Catch:{ all -> 0x032f }
            int r5 = r2.f7936g     // Catch:{ all -> 0x032f }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015c
            int r4 = r3.mo9174a()     // Catch:{ all -> 0x032f }
            if (r4 == r13) goto L_0x00d9
            if (r4 == r12) goto L_0x009c
            if (r4 != r11) goto L_0x0082
            g.d.a.e.a.c.f r4 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo15203c(r5, r6)     // Catch:{ all -> 0x032f }
            long r3 = r3.mo9176c()     // Catch:{ all -> 0x032f }
            r0.mo9214d(r15, r3)     // Catch:{ all -> 0x032f }
            boolean r3 = r23.mo9229a()     // Catch:{ all -> 0x032f }
            if (r3 == 0) goto L_0x0078
        L_0x0074:
            r4 = r16
            goto L_0x017d
        L_0x0078:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f7878a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x0082:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x032f }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032f }
            int r3 = r3.mo9174a()     // Catch:{ all -> 0x032f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032f }
            r4[r14] = r3     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032f }
            int r4 = r2.f7878a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x009c:
            g.d.a.e.a.c.f r3 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo15203c(r4, r5)     // Catch:{ all -> 0x032f }
            com.google.android.play.core.assetpacks.c0 r3 = r1.f7949b     // Catch:{ all -> 0x032f }
            java.lang.String r4 = r2.f7879b     // Catch:{ all -> 0x032f }
            int r5 = r2.f7932c     // Catch:{ all -> 0x032f }
            long r6 = r2.f7933d     // Catch:{ all -> 0x032f }
            java.lang.String r8 = r2.f7934e     // Catch:{ all -> 0x032f }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.mo9128s(r17, r18, r19, r21)     // Catch:{ all -> 0x032f }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x00cf
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032f }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032f }
            r5.<init>(r3)     // Catch:{ all -> 0x032f }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032f }
            goto L_0x017d
        L_0x00cf:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f7878a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x00d9:
            g.d.a.e.a.c.f r4 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032f }
            java.lang.String r6 = r3.mo9175b()     // Catch:{ all -> 0x032f }
            r5[r14] = r6     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo15203c(r6, r5)     // Catch:{ all -> 0x032f }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032f }
            java.lang.String r5 = r3.mo9175b()     // Catch:{ all -> 0x032f }
            r4.<init>(r5)     // Catch:{ all -> 0x032f }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032f }
            if (r5 == 0) goto L_0x0152
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032f }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032f }
            long r6 = r3.mo9176c()     // Catch:{ all -> 0x032f }
            r5.seek(r6)     // Catch:{ all -> 0x032f }
            long r6 = r3.mo9177d()     // Catch:{ all -> 0x032f }
        L_0x0109:
            byte[] r3 = r1.f7948a     // Catch:{ all -> 0x032f }
            int r3 = r3.length     // Catch:{ all -> 0x032f }
            long r8 = (long) r3     // Catch:{ all -> 0x032f }
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032f }
            int r3 = (int) r8     // Catch:{ all -> 0x032f }
            byte[] r8 = r1.f7948a     // Catch:{ all -> 0x032f }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032f }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032f }
            if (r8 <= 0) goto L_0x0123
            byte[] r9 = r1.f7948a     // Catch:{ all -> 0x032f }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032f }
        L_0x0123:
            long r10 = (long) r8     // Catch:{ all -> 0x032f }
            long r10 = r6 - r10
            r6 = 0
            int r9 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0132
            if (r8 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r6 = r10
            r11 = 3
            goto L_0x0109
        L_0x0132:
            long r6 = r5.length()     // Catch:{ all -> 0x032f }
            r5.close()     // Catch:{ all -> 0x032f }
            if (r8 == r3) goto L_0x017c
            g.d.a.e.a.c.f r3 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo15203c(r5, r8)     // Catch:{ all -> 0x032f }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032f }
            int r9 = r2.f7936g     // Catch:{ all -> 0x032f }
            r3 = r0
            r5 = r6
            r7 = r10
            r3.mo9215e(r4, r5, r7, r9)     // Catch:{ all -> 0x032f }
            goto L_0x0074
        L_0x0152:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f7878a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x015c:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032f }
            r6[r14] = r5     // Catch:{ all -> 0x032f }
            int r3 = r3.mo9178e()     // Catch:{ all -> 0x032f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032f }
            r6[r13] = r3     // Catch:{ all -> 0x032f }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032f }
            int r4 = r2.f7878a     // Catch:{ all -> 0x032f }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x017c:
            r4 = r15
        L_0x017d:
            if (r4 == 0) goto L_0x028a
            com.google.android.play.core.assetpacks.l0 r3 = new com.google.android.play.core.assetpacks.l0     // Catch:{ all -> 0x032f }
            r3.<init>(r4)     // Catch:{ all -> 0x032f }
            java.io.File r5 = r22.m11024b(r23)     // Catch:{ all -> 0x032f }
        L_0x0188:
            com.google.android.play.core.assetpacks.s2 r6 = r3.mo9168h()     // Catch:{ all -> 0x032f }
            boolean r7 = r6.mo9239g()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01df
            boolean r7 = r3.mo9170o()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01df
            boolean r7 = r6.mo9234c()     // Catch:{ all -> 0x032f }
            if (r7 == 0) goto L_0x01d8
            boolean r7 = r6.mo9233b()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01d8
            byte[] r7 = r6.mo9242i()     // Catch:{ all -> 0x032f }
            r0.mo9216f(r7)     // Catch:{ all -> 0x032f }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032f }
            java.lang.String r8 = r6.mo9235d()     // Catch:{ all -> 0x032f }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032f }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032f }
            r8.mkdirs()     // Catch:{ all -> 0x032f }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032f }
            r8.<init>(r7)     // Catch:{ all -> 0x032f }
            byte[] r7 = r1.f7948a     // Catch:{ all -> 0x032f }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032f }
        L_0x01c6:
            if (r7 <= 0) goto L_0x01d4
            byte[] r9 = r1.f7948a     // Catch:{ all -> 0x032f }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032f }
            byte[] r7 = r1.f7948a     // Catch:{ all -> 0x032f }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032f }
            goto L_0x01c6
        L_0x01d4:
            r8.close()     // Catch:{ all -> 0x032f }
            goto L_0x01df
        L_0x01d8:
            byte[] r7 = r6.mo9242i()     // Catch:{ all -> 0x032f }
            r0.mo9218h(r7, r3)     // Catch:{ all -> 0x032f }
        L_0x01df:
            boolean r7 = r3.mo9169m()     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x01eb
            boolean r7 = r3.mo9170o()     // Catch:{ all -> 0x032f }
            if (r7 == 0) goto L_0x0188
        L_0x01eb:
            boolean r5 = r3.mo9170o()     // Catch:{ all -> 0x032f }
            if (r5 == 0) goto L_0x0201
            g.d.a.e.a.c.f r5 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r5.mo15203c(r7, r8)     // Catch:{ all -> 0x032f }
            byte[] r5 = r6.mo9242i()     // Catch:{ all -> 0x032f }
            r0.mo9218h(r5, r4)     // Catch:{ all -> 0x032f }
        L_0x0201:
            boolean r4 = r23.mo9229a()     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x028a
            boolean r4 = r6.mo9239g()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x0220
            g.d.a.e.a.c.f r3 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo15203c(r4, r5)     // Catch:{ all -> 0x032f }
            byte[] r3 = r6.mo9242i()     // Catch:{ all -> 0x032f }
            int r4 = r2.f7936g     // Catch:{ all -> 0x032f }
            r0.mo9217g(r3, r4)     // Catch:{ all -> 0x032f }
            goto L_0x028a
        L_0x0220:
            boolean r4 = r3.mo9170o()     // Catch:{ all -> 0x032f }
            if (r4 == 0) goto L_0x0235
            g.d.a.e.a.c.f r3 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r3.mo15203c(r4, r5)     // Catch:{ all -> 0x032f }
            int r3 = r2.f7936g     // Catch:{ all -> 0x032f }
            r0.mo9212b(r3)     // Catch:{ all -> 0x032f }
            goto L_0x028a
        L_0x0235:
            int r4 = r6.mo9238f()     // Catch:{ all -> 0x032f }
            if (r4 != 0) goto L_0x026b
            g.d.a.e.a.c.f r4 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo15203c(r5, r7)     // Catch:{ all -> 0x032f }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032f }
            java.io.File r5 = r22.m11024b(r23)     // Catch:{ all -> 0x032f }
            java.lang.String r7 = r6.mo9235d()     // Catch:{ all -> 0x032f }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032f }
            long r5 = r6.mo9236e()     // Catch:{ all -> 0x032f }
            long r7 = r3.mo9171q()     // Catch:{ all -> 0x032f }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032f }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0263
            goto L_0x027c
        L_0x0263:
            com.google.android.play.core.assetpacks.u0 r0 = new com.google.android.play.core.assetpacks.u0     // Catch:{ all -> 0x032f }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032f }
            throw r0     // Catch:{ all -> 0x032f }
        L_0x026b:
            g.d.a.e.a.c.f r4 = f7947f     // Catch:{ all -> 0x032f }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032f }
            r4.mo15203c(r5, r6)     // Catch:{ all -> 0x032f }
            java.io.File r4 = r0.mo9219i()     // Catch:{ all -> 0x032f }
            long r5 = r4.length()     // Catch:{ all -> 0x032f }
        L_0x027c:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032f }
            long r7 = r3.mo9171q()     // Catch:{ all -> 0x032f }
            int r9 = r2.f7936g     // Catch:{ all -> 0x032f }
            r3 = r0
            r3.mo9215e(r4, r5, r7, r9)     // Catch:{ all -> 0x032f }
        L_0x028a:
            r15.close()     // Catch:{ IOException -> 0x033b }
            boolean r3 = r23.mo9229a()
            if (r3 == 0) goto L_0x02b3
            int r3 = r2.f7936g     // Catch:{ IOException -> 0x0299 }
            r0.mo9220j(r3)     // Catch:{ IOException -> 0x0299 }
            goto L_0x02b3
        L_0x0299:
            r0 = move-exception
            g.d.a.e.a.c.f r3 = f7947f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.mo15205e(r5, r4)
            com.google.android.play.core.assetpacks.u0 r3 = new com.google.android.play.core.assetpacks.u0
            int r2 = r2.f7878a
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b3:
            g.d.a.e.a.c.f r0 = f7947f
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f7936g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f7934e
            r3[r13] = r4
            java.lang.String r4 = r2.f7879b
            r3[r12] = r4
            int r4 = r2.f7878a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo15206f(r4, r3)
            g.d.a.e.a.c.e0<com.google.android.play.core.assetpacks.k3> r0 = r1.f7950c
            java.lang.Object r0 = r0.mo15202d()
            com.google.android.play.core.assetpacks.k3 r0 = (com.google.android.play.core.assetpacks.C2371k3) r0
            int r3 = r2.f7878a
            java.lang.String r4 = r2.f7879b
            java.lang.String r5 = r2.f7934e
            int r6 = r2.f7936g
            r0.mo9167x(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.f7940k     // Catch:{ IOException -> 0x02ef }
            r0.close()     // Catch:{ IOException -> 0x02ef }
            goto L_0x0309
        L_0x02ef:
            g.d.a.e.a.c.f r0 = f7947f
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f7936g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f7934e
            r4[r13] = r3
            java.lang.String r3 = r2.f7879b
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo15207g(r3, r4)
        L_0x0309:
            int r0 = r2.f7939j
            r3 = 3
            if (r0 != r3) goto L_0x032e
            g.d.a.e.a.c.e0<com.google.android.play.core.assetpacks.w> r0 = r1.f7951d
            java.lang.Object r0 = r0.mo15202d()
            com.google.android.play.core.assetpacks.w r0 = (com.google.android.play.core.assetpacks.C2418w) r0
            java.lang.String r3 = r2.f7879b
            long r7 = r2.f7938i
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.y0 r6 = r1.f7952e
            double r9 = r6.mo9265a(r3, r2)
            r11 = 1
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.c r2 = com.google.android.play.core.assetpacks.C2327c.m10811c(r2, r3, r4, r5, r7, r9, r11)
            r0.mo9255j(r2)
        L_0x032e:
            return
        L_0x032f:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0335 }
            goto L_0x033a
        L_0x0335:
            r0 = move-exception
            r4 = r0
            p148g.p189d.p190a.p271e.p272a.p276c.C5097d0.m21473a(r3, r4)     // Catch:{ IOException -> 0x033b }
        L_0x033a:
            throw r3     // Catch:{ IOException -> 0x033b }
        L_0x033b:
            r0 = move-exception
            g.d.a.e.a.c.f r3 = f7947f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.mo15205e(r5, r4)
            com.google.android.play.core.assetpacks.u0 r3 = new com.google.android.play.core.assetpacks.u0
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.f7936g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.f7934e
            r4[r13] = r5
            java.lang.String r5 = r2.f7879b
            r4[r12] = r5
            int r5 = r2.f7878a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.f7878a
            r3.<init>(r4, r0, r2)
            goto L_0x0376
        L_0x0375:
            throw r3
        L_0x0376:
            goto L_0x0375
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C2403s0.mo9231a(com.google.android.play.core.assetpacks.r0):void");
    }
}
