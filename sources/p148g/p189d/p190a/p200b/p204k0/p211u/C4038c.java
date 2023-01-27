package p148g.p189d.p190a.p200b.p204k0.p211u;

import android.util.Log;
import java.io.IOException;
import p148g.p189d.p190a.p200b.C4313u;
import p148g.p189d.p190a.p200b.p204k0.C3916f;
import p148g.p189d.p190a.p200b.p230r0.C4260a;
import p148g.p189d.p190a.p200b.p230r0.C4274m;
import p148g.p189d.p190a.p200b.p230r0.C4284w;

/* renamed from: g.d.a.b.k0.u.c */
final class C4038c {

    /* renamed from: g.d.a.b.k0.u.c$a */
    private static final class C4039a {

        /* renamed from: a */
        public final int f12735a;

        /* renamed from: b */
        public final long f12736b;

        private C4039a(int i, long j) {
            this.f12735a = i;
            this.f12736b = j;
        }

        /* renamed from: a */
        public static C4039a m17056a(C3916f fVar, C4274m mVar) throws IOException, InterruptedException {
            fVar.mo12727i(mVar.f13643a, 0, 8);
            mVar.mo13454J(0);
            return new C4039a(mVar.mo13464i(), mVar.mo13469n());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p148g.p189d.p190a.p200b.p204k0.p211u.C4037b m17054a(p148g.p189d.p190a.p200b.p204k0.C3916f r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r0 = r17
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18073e(r17)
            g.d.a.b.r0.m r1 = new g.d.a.b.r0.m
            r2 = 16
            r1.<init>((int) r2)
            g.d.a.b.k0.u.c$a r3 = p148g.p189d.p190a.p200b.p204k0.p211u.C4038c.C4039a.m17056a(r0, r1)
            int r3 = r3.f12735a
            java.lang.String r4 = "RIFF"
            int r4 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18249o(r4)
            r5 = 0
            if (r3 == r4) goto L_0x001c
            return r5
        L_0x001c:
            byte[] r3 = r1.f13643a
            r4 = 0
            r6 = 4
            r0.mo12727i(r3, r4, r6)
            r1.mo13454J(r4)
            int r3 = r1.mo13464i()
            java.lang.String r7 = "WAVE"
            int r7 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18249o(r7)
            java.lang.String r8 = "WavHeaderReader"
            if (r3 == r7) goto L_0x0049
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported RIFF format: "
            r0.append(r1)
            r0.append(r3)
        L_0x0041:
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r8, r0)
            return r5
        L_0x0049:
            g.d.a.b.k0.u.c$a r3 = p148g.p189d.p190a.p200b.p204k0.p211u.C4038c.C4039a.m17056a(r0, r1)
            int r7 = r3.f12735a
            java.lang.String r9 = "fmt "
            int r9 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18249o(r9)
            if (r7 == r9) goto L_0x005e
            long r9 = r3.f12736b
            int r3 = (int) r9
            r0.mo12728j(r3)
            goto L_0x0049
        L_0x005e:
            long r9 = r3.f12736b
            r11 = 16
            r7 = 1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0069
            r9 = 1
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            p148g.p189d.p190a.p200b.p230r0.C4260a.m18074f(r9)
            byte[] r9 = r1.f13643a
            r0.mo12727i(r9, r4, r2)
            r1.mo13454J(r4)
            int r9 = r1.mo13471p()
            int r11 = r1.mo13471p()
            int r12 = r1.mo13470o()
            int r13 = r1.mo13470o()
            int r14 = r1.mo13471p()
            int r15 = r1.mo13471p()
            int r1 = r11 * r15
            int r1 = r1 / 8
            if (r14 != r1) goto L_0x00d9
            if (r9 == r7) goto L_0x00b3
            r1 = 3
            if (r9 == r1) goto L_0x00ab
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r9 == r1) goto L_0x00b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported WAV format type: "
        L_0x00a4:
            r0.append(r1)
            r0.append(r9)
            goto L_0x0041
        L_0x00ab:
            r1 = 32
            if (r15 != r1) goto L_0x00b0
            r4 = 4
        L_0x00b0:
            r16 = r4
            goto L_0x00b9
        L_0x00b3:
            int r1 = p148g.p189d.p190a.p200b.p230r0.C4284w.m18251q(r15)
            r16 = r1
        L_0x00b9:
            if (r16 != 0) goto L_0x00cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported WAV bit depth "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " for type "
            goto L_0x00a4
        L_0x00cb:
            long r3 = r3.f12736b
            int r1 = (int) r3
            int r1 = r1 - r2
            r0.mo12728j(r1)
            g.d.a.b.k0.u.b r0 = new g.d.a.b.k0.u.b
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r0
        L_0x00d9:
            g.d.a.b.u r0 = new g.d.a.b.u
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected block alignment: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "; got: "
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            goto L_0x00f9
        L_0x00f8:
            throw r0
        L_0x00f9:
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p190a.p200b.p204k0.p211u.C4038c.m17054a(g.d.a.b.k0.f):g.d.a.b.k0.u.b");
    }

    /* renamed from: b */
    public static void m17055b(C3916f fVar, C4037b bVar) throws IOException, InterruptedException {
        C4260a.m18073e(fVar);
        C4260a.m18073e(bVar);
        fVar.mo12723e();
        C4274m mVar = new C4274m(8);
        while (true) {
            C4039a a = C4039a.m17056a(fVar, mVar);
            if (a.f12735a != C4284w.m18249o("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.f12735a);
                long j = a.f12736b + 8;
                if (a.f12735a == C4284w.m18249o("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    fVar.mo12724f((int) j);
                } else {
                    throw new C4313u("Chunk is too large (~2GB+) to skip; id: " + a.f12735a);
                }
            } else {
                fVar.mo12724f(8);
                bVar.mo12896k(fVar.mo12729k(), a.f12736b);
                return;
            }
        }
    }
}
