package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
public class C0891f {

    /* renamed from: a */
    private static final Comparator<C0897f> f3580a = new C0892a();

    /* renamed from: androidx.recyclerview.widget.f$a */
    static class C0892a implements Comparator<C0897f> {
        C0892a() {
        }

        /* renamed from: a */
        public int compare(C0897f fVar, C0897f fVar2) {
            int i = fVar.f3595a - fVar2.f3595a;
            return i == 0 ? fVar.f3596b - fVar2.f3596b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    public static abstract class C0893b {
        /* renamed from: a */
        public abstract boolean mo3969a(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo3970b(int i, int i2);

        /* renamed from: c */
        public Object mo4762c(int i, int i2) {
            return null;
        }

        /* renamed from: d */
        public abstract int mo3971d();

        /* renamed from: e */
        public abstract int mo3972e();
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    public static class C0894c {

        /* renamed from: a */
        private final List<C0897f> f3581a;

        /* renamed from: b */
        private final int[] f3582b;

        /* renamed from: c */
        private final int[] f3583c;

        /* renamed from: d */
        private final C0893b f3584d;

        /* renamed from: e */
        private final int f3585e;

        /* renamed from: f */
        private final int f3586f;

        /* renamed from: g */
        private final boolean f3587g;

        C0894c(C0893b bVar, List<C0897f> list, int[] iArr, int[] iArr2, boolean z) {
            this.f3581a = list;
            this.f3582b = iArr;
            this.f3583c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.f3583c, 0);
            this.f3584d = bVar;
            this.f3585e = bVar.mo3972e();
            this.f3586f = bVar.mo3971d();
            this.f3587g = z;
            m4984a();
            m4989h();
        }

        /* renamed from: a */
        private void m4984a() {
            C0897f fVar = this.f3581a.isEmpty() ? null : this.f3581a.get(0);
            if (fVar == null || fVar.f3595a != 0 || fVar.f3596b != 0) {
                C0897f fVar2 = new C0897f();
                fVar2.f3595a = 0;
                fVar2.f3596b = 0;
                fVar2.f3598d = false;
                fVar2.f3597c = 0;
                fVar2.f3599e = false;
                this.f3581a.add(0, fVar2);
            }
        }

        /* renamed from: b */
        private void m4985b(List<C0895d> list, C0910l lVar, int i, int i2, int i3) {
            if (!this.f3587g) {
                lVar.mo4706c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f3583c[i5] & 31;
                if (i6 == 0) {
                    lVar.mo4706c(i, 1);
                    for (C0895d dVar : list) {
                        dVar.f3589b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f3583c[i5] >> 5;
                    lVar.mo4705b(m4991j(list, i7, true).f3589b, i);
                    if (i6 == 4) {
                        lVar.mo4707d(i, 1, this.f3584d.mo4762c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C0895d(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: c */
        private void m4986c(List<C0895d> list, C0910l lVar, int i, int i2, int i3) {
            if (!this.f3587g) {
                lVar.mo4704a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f3582b[i5] & 31;
                if (i6 == 0) {
                    lVar.mo4704a(i + i4, 1);
                    for (C0895d dVar : list) {
                        dVar.f3589b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f3582b[i5] >> 5;
                    C0895d j = m4991j(list, i7, false);
                    lVar.mo4705b(i + i4, j.f3589b - 1);
                    if (i6 == 4) {
                        lVar.mo4707d(j.f3589b - 1, 1, this.f3584d.mo4762c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C0895d(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        /* renamed from: f */
        private void m4987f(int i, int i2, int i3) {
            if (this.f3582b[i - 1] == 0) {
                m4988g(i, i2, i3, false);
            }
        }

        /* renamed from: g */
        private boolean m4988g(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C0897f fVar = this.f3581a.get(i3);
                int i6 = fVar.f3595a;
                int i7 = fVar.f3597c;
                int i8 = i6 + i7;
                int i9 = fVar.f3596b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.f3584d.mo3970b(i11, i5)) {
                            if (!this.f3584d.mo3969a(i11, i5)) {
                                i10 = 4;
                            }
                            this.f3583c[i5] = (i11 << 5) | 16;
                            this.f3582b[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f3584d.mo3970b(i5, i12)) {
                            if (!this.f3584d.mo3969a(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f3582b[i13] = (i12 << 5) | 16;
                            this.f3583c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = fVar.f3595a;
                i2 = fVar.f3596b;
                i3--;
            }
            return false;
        }

        /* renamed from: h */
        private void m4989h() {
            int i = this.f3585e;
            int i2 = this.f3586f;
            for (int size = this.f3581a.size() - 1; size >= 0; size--) {
                C0897f fVar = this.f3581a.get(size);
                int i3 = fVar.f3595a;
                int i4 = fVar.f3597c;
                int i5 = i3 + i4;
                int i6 = fVar.f3596b + i4;
                if (this.f3587g) {
                    while (i > i5) {
                        m4987f(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m4990i(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < fVar.f3597c; i7++) {
                    int i8 = fVar.f3595a + i7;
                    int i9 = fVar.f3596b + i7;
                    int i10 = this.f3584d.mo3969a(i8, i9) ? 1 : 2;
                    this.f3582b[i8] = (i9 << 5) | i10;
                    this.f3583c[i9] = (i8 << 5) | i10;
                }
                i = fVar.f3595a;
                i2 = fVar.f3596b;
            }
        }

        /* renamed from: i */
        private void m4990i(int i, int i2, int i3) {
            if (this.f3583c[i2 - 1] == 0) {
                m4988g(i, i2, i3, true);
            }
        }

        /* renamed from: j */
        private static C0895d m4991j(List<C0895d> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0895d dVar = list.get(size);
                if (dVar.f3588a == i && dVar.f3590c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f3589b += z ? 1 : -1;
                        size++;
                    }
                    return dVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: d */
        public void mo4763d(C0910l lVar) {
            C0876c cVar = lVar instanceof C0876c ? (C0876c) lVar : new C0876c(lVar);
            ArrayList arrayList = new ArrayList();
            int i = this.f3585e;
            int i2 = this.f3586f;
            for (int size = this.f3581a.size() - 1; size >= 0; size--) {
                C0897f fVar = this.f3581a.get(size);
                int i3 = fVar.f3597c;
                int i4 = fVar.f3595a + i3;
                int i5 = fVar.f3596b + i3;
                if (i4 < i) {
                    m4986c(arrayList, cVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m4985b(arrayList, cVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f3582b;
                    int i7 = fVar.f3595a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        cVar.mo4707d(i7 + i6, 1, this.f3584d.mo4762c(i7 + i6, fVar.f3596b + i6));
                    }
                }
                i = fVar.f3595a;
                i2 = fVar.f3596b;
            }
            cVar.mo4708e();
        }

        /* renamed from: e */
        public void mo4764e(RecyclerView.C0832g gVar) {
            mo4763d(new C0875b(gVar));
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    private static class C0895d {

        /* renamed from: a */
        int f3588a;

        /* renamed from: b */
        int f3589b;

        /* renamed from: c */
        boolean f3590c;

        public C0895d(int i, int i2, boolean z) {
            this.f3588a = i;
            this.f3589b = i2;
            this.f3590c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    static class C0896e {

        /* renamed from: a */
        int f3591a;

        /* renamed from: b */
        int f3592b;

        /* renamed from: c */
        int f3593c;

        /* renamed from: d */
        int f3594d;

        public C0896e() {
        }

        public C0896e(int i, int i2, int i3, int i4) {
            this.f3591a = i;
            this.f3592b = i2;
            this.f3593c = i3;
            this.f3594d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    static class C0897f {

        /* renamed from: a */
        int f3595a;

        /* renamed from: b */
        int f3596b;

        /* renamed from: c */
        int f3597c;

        /* renamed from: d */
        boolean f3598d;

        /* renamed from: e */
        boolean f3599e;

        C0897f() {
        }
    }

    /* renamed from: a */
    public static C0894c m4975a(C0893b bVar) {
        return m4976b(bVar, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.C0891f.C0894c m4976b(androidx.recyclerview.widget.C0891f.C0893b r15, boolean r16) {
        /*
            int r0 = r15.mo3972e()
            int r1 = r15.mo3971d()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.f$e r3 = new androidx.recyclerview.widget.f$e
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r3 = r3 + r0
            int r0 = r3 * 2
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.f$e r14 = (androidx.recyclerview.widget.C0891f.C0896e) r14
            int r6 = r14.f3591a
            int r7 = r14.f3592b
            int r8 = r14.f3593c
            int r9 = r14.f3594d
            r5 = r15
            r10 = r1
            r11 = r0
            r12 = r3
            androidx.recyclerview.widget.f$f r5 = m4977c(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.f3597c
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.f3595a
            int r7 = r14.f3591a
            int r6 = r6 + r7
            r5.f3595a = r6
            int r6 = r5.f3596b
            int r7 = r14.f3593c
            int r6 = r6 + r7
            r5.f3596b = r6
            boolean r6 = r13.isEmpty()
            if (r6 == 0) goto L_0x0074
            androidx.recyclerview.widget.f$e r6 = new androidx.recyclerview.widget.f$e
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r13.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r13.remove(r6)
            androidx.recyclerview.widget.f$e r6 = (androidx.recyclerview.widget.C0891f.C0896e) r6
        L_0x0080:
            int r7 = r14.f3591a
            r6.f3591a = r7
            int r7 = r14.f3593c
            r6.f3593c = r7
            boolean r7 = r5.f3599e
            if (r7 == 0) goto L_0x0095
            int r7 = r5.f3595a
        L_0x008e:
            r6.f3592b = r7
            int r7 = r5.f3596b
        L_0x0092:
            r6.f3594d = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.f3598d
            if (r7 == 0) goto L_0x009e
            int r7 = r5.f3595a
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.f3595a
            r6.f3592b = r7
            int r7 = r5.f3596b
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.f3599e
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.f3598d
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.f3595a
            int r7 = r5.f3597c
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.f3595a
            int r7 = r5.f3597c
            int r6 = r6 + r7
            r14.f3591a = r6
            int r5 = r5.f3596b
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.f3595a
            int r7 = r5.f3597c
            int r6 = r6 + r7
        L_0x00cc:
            r14.f3591a = r6
            int r5 = r5.f3596b
            int r5 = r5 + r7
        L_0x00d1:
            r14.f3593c = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r13.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<androidx.recyclerview.widget.f$f> r2 = f3580a
            java.util.Collections.sort(r4, r2)
            androidx.recyclerview.widget.f$c r8 = new androidx.recyclerview.widget.f$c
            r2 = r8
            r3 = r15
            r5 = r1
            r6 = r0
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0891f.m4976b(androidx.recyclerview.widget.f$b, boolean):androidx.recyclerview.widget.f$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:10:0x0033->B:33:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C0891f.C0897f m4977c(androidx.recyclerview.widget.C0891f.C0893b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo3970b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r3 = r2[r5]
            r0.f3595a = r3
            int r3 = r3 - r12
            r0.f3596b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f3597c = r1
            r0.f3598d = r14
            r13 = 0
            r0.f3599e = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a0:
            r13 = 0
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = 1
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = 0
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.mo3970b(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.f$f r0 = new androidx.recyclerview.widget.f$f
            r0.<init>()
            r4 = r2[r3]
            r0.f3595a = r4
            int r4 = r4 - r10
            r0.f3596b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f3597c = r1
            r0.f3598d = r14
            r3 = 1
            r0.f3599e = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0891f.m4977c(androidx.recyclerview.widget.f$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.f$f");
    }
}
