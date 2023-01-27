package p086f.p144s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p086f.p144s.C3485a;
import p086f.p144s.C3532m;

/* renamed from: f.s.j0 */
public abstract class C3524j0 extends C3532m {

    /* renamed from: P */
    private static final String[] f10959P = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: O */
    private int f10960O = 3;

    /* renamed from: f.s.j0$a */
    class C3525a extends C3540n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f10961a;

        /* renamed from: b */
        final /* synthetic */ View f10962b;

        /* renamed from: c */
        final /* synthetic */ View f10963c;

        C3525a(ViewGroup viewGroup, View view, View view2) {
            this.f10961a = viewGroup;
            this.f10962b = view;
            this.f10963c = view2;
        }

        /* renamed from: c */
        public void mo11904c(C3532m mVar) {
            C3554x.m15253a(this.f10961a).mo12014c(this.f10962b);
        }

        /* renamed from: d */
        public void mo11905d(C3532m mVar) {
            if (this.f10962b.getParent() == null) {
                C3554x.m15253a(this.f10961a).mo12013a(this.f10962b);
            } else {
                C3524j0.this.cancel();
            }
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            this.f10963c.setTag(C3523j.save_overlay_view, (Object) null);
            C3554x.m15253a(this.f10961a).mo12014c(this.f10962b);
            mVar.mo11961Y(this);
        }
    }

    /* renamed from: f.s.j0$b */
    private static class C3526b extends AnimatorListenerAdapter implements C3532m.C3538f, C3485a.C3486a {

        /* renamed from: a */
        private final View f10965a;

        /* renamed from: b */
        private final int f10966b;

        /* renamed from: c */
        private final ViewGroup f10967c;

        /* renamed from: d */
        private final boolean f10968d;

        /* renamed from: e */
        private boolean f10969e;

        /* renamed from: f */
        boolean f10970f = false;

        C3526b(View view, int i, boolean z) {
            this.f10965a = view;
            this.f10966b = i;
            this.f10967c = (ViewGroup) view.getParent();
            this.f10968d = z;
            m15124g(true);
        }

        /* renamed from: f */
        private void m15123f() {
            if (!this.f10970f) {
                C3502c0.m15043h(this.f10965a, this.f10966b);
                ViewGroup viewGroup = this.f10967c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m15124g(false);
        }

        /* renamed from: g */
        private void m15124g(boolean z) {
            ViewGroup viewGroup;
            if (this.f10968d && this.f10969e != z && (viewGroup = this.f10967c) != null) {
                this.f10969e = z;
                C3554x.m15255c(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo11925a(C3532m mVar) {
        }

        /* renamed from: b */
        public void mo11903b(C3532m mVar) {
        }

        /* renamed from: c */
        public void mo11904c(C3532m mVar) {
            m15124g(false);
        }

        /* renamed from: d */
        public void mo11905d(C3532m mVar) {
            m15124g(true);
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            m15123f();
            mVar.mo11961Y(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f10970f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m15123f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f10970f) {
                C3502c0.m15043h(this.f10965a, this.f10966b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f10970f) {
                C3502c0.m15043h(this.f10965a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: f.s.j0$c */
    private static class C3527c {

        /* renamed from: a */
        boolean f10971a;

        /* renamed from: b */
        boolean f10972b;

        /* renamed from: c */
        int f10973c;

        /* renamed from: d */
        int f10974d;

        /* renamed from: e */
        ViewGroup f10975e;

        /* renamed from: f */
        ViewGroup f10976f;

        C3527c() {
        }
    }

    /* renamed from: l0 */
    private void m15108l0(C3549s sVar) {
        sVar.f11042a.put("android:visibility:visibility", Integer.valueOf(sVar.f11043b.getVisibility()));
        sVar.f11042a.put("android:visibility:parent", sVar.f11043b.getParent());
        int[] iArr = new int[2];
        sVar.f11043b.getLocationOnScreen(iArr);
        sVar.f11042a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r9 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        if (r0.f10975e == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r0.f10973c == 0) goto L_0x0097;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p086f.p144s.C3524j0.C3527c m15109m0(p086f.p144s.C3549s r8, p086f.p144s.C3549s r9) {
        /*
            r7 = this;
            f.s.j0$c r0 = new f.s.j0$c
            r0.<init>()
            r1 = 0
            r0.f10971a = r1
            r0.f10972b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f11042a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f11042a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f10973c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f11042a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f10975e = r6
            goto L_0x0037
        L_0x0033:
            r0.f10973c = r4
            r0.f10975e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f11042a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f11042a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f10974d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f11042a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f10976f = r2
            goto L_0x005e
        L_0x005a:
            r0.f10974d = r4
            r0.f10976f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0086
            int r8 = r0.f10973c
            int r9 = r0.f10974d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r8 = r0.f10975e
            android.view.ViewGroup r9 = r0.f10976f
            if (r8 != r9) goto L_0x0070
            return r0
        L_0x0070:
            int r8 = r0.f10973c
            int r9 = r0.f10974d
            if (r8 == r9) goto L_0x007c
            if (r8 != 0) goto L_0x0079
            goto L_0x0097
        L_0x0079:
            if (r9 != 0) goto L_0x009a
            goto L_0x008c
        L_0x007c:
            android.view.ViewGroup r8 = r0.f10976f
            if (r8 != 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            android.view.ViewGroup r8 = r0.f10975e
            if (r8 != 0) goto L_0x009a
            goto L_0x008c
        L_0x0086:
            if (r8 != 0) goto L_0x0091
            int r8 = r0.f10974d
            if (r8 != 0) goto L_0x0091
        L_0x008c:
            r0.f10972b = r2
        L_0x008e:
            r0.f10971a = r2
            goto L_0x009a
        L_0x0091:
            if (r9 != 0) goto L_0x009a
            int r8 = r0.f10973c
            if (r8 != 0) goto L_0x009a
        L_0x0097:
            r0.f10972b = r1
            goto L_0x008e
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p144s.C3524j0.m15109m0(f.s.s, f.s.s):f.s.j0$c");
    }

    /* renamed from: J */
    public String[] mo11872J() {
        return f10959P;
    }

    /* renamed from: L */
    public boolean mo11935L(C3549s sVar, C3549s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f11042a.containsKey("android:visibility:visibility") != sVar.f11042a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C3527c m0 = m15109m0(sVar, sVar2);
        if (m0.f10971a) {
            return m0.f10973c == 0 || m0.f10974d == 0;
        }
        return false;
    }

    /* renamed from: g */
    public void mo11873g(C3549s sVar) {
        m15108l0(sVar);
    }

    /* renamed from: l */
    public void mo11874l(C3549s sVar) {
        m15108l0(sVar);
    }

    /* renamed from: n0 */
    public abstract Animator mo11917n0(ViewGroup viewGroup, View view, C3549s sVar, C3549s sVar2);

    /* renamed from: o0 */
    public Animator mo11936o0(ViewGroup viewGroup, C3549s sVar, int i, C3549s sVar2, int i2) {
        if ((this.f10960O & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f11043b.getParent();
            if (m15109m0(mo11988y(view, false), mo11957K(view, false)).f10971a) {
                return null;
            }
        }
        return mo11917n0(viewGroup, sVar2.f11043b, sVar, sVar2);
    }

    /* renamed from: p0 */
    public abstract Animator mo11918p0(ViewGroup viewGroup, View view, C3549s sVar, C3549s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r10.f10985A != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo11937q0(android.view.ViewGroup r11, p086f.p144s.C3549s r12, int r13, p086f.p144s.C3549s r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.f10960O
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.f11043b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.f11043b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = p086f.p144s.C3523j.save_overlay_view
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = 1
            goto L_0x0089
        L_0x0023:
            if (r2 == 0) goto L_0x0036
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x003b
        L_0x0032:
            r3 = r2
            r6 = 0
            r2 = r1
            goto L_0x003e
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r3 = r1
            r6 = 0
            goto L_0x003e
        L_0x003b:
            r2 = r1
            r3 = r2
            r6 = 1
        L_0x003e:
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0081
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0085
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            f.s.s r7 = r10.mo11957K(r6, r5)
            f.s.s r8 = r10.mo11988y(r6, r5)
            f.s.j0$c r7 = r10.m15109m0(r7, r8)
            boolean r7 = r7.f10971a
            if (r7 != 0) goto L_0x006a
            android.view.View r2 = p086f.p144s.C3548r.m15241a(r11, r13, r6)
            goto L_0x0085
        L_0x006a:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0085
            r6 = -1
            if (r7 == r6) goto L_0x0085
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0085
            boolean r6 = r10.f10985A
            if (r6 == 0) goto L_0x0085
        L_0x0081:
            r2 = r3
            r6 = 0
            r3 = r13
            goto L_0x0089
        L_0x0085:
            r6 = 0
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0089:
            if (r3 == 0) goto L_0x00db
            if (r6 != 0) goto L_0x00bd
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.f11042a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            f.s.w r15 = p086f.p144s.C3554x.m15253a(r11)
            r15.mo12013a(r3)
        L_0x00bd:
            android.animation.Animator r12 = r10.mo11918p0(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00da
            if (r12 != 0) goto L_0x00cd
            f.s.w r11 = p086f.p144s.C3554x.m15253a(r11)
            r11.mo12014c(r3)
            goto L_0x00da
        L_0x00cd:
            int r14 = p086f.p144s.C3523j.save_overlay_view
            r13.setTag(r14, r3)
            f.s.j0$a r14 = new f.s.j0$a
            r14.<init>(r11, r3, r13)
            r10.mo11964b(r14)
        L_0x00da:
            return r12
        L_0x00db:
            if (r2 == 0) goto L_0x00fd
            int r13 = r2.getVisibility()
            p086f.p144s.C3502c0.m15043h(r2, r4)
            android.animation.Animator r11 = r10.mo11918p0(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f9
            f.s.j0$b r12 = new f.s.j0$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            p086f.p144s.C3485a.m15003a(r11, r12)
            r10.mo11964b(r12)
            goto L_0x00fc
        L_0x00f9:
            p086f.p144s.C3502c0.m15043h(r2, r13)
        L_0x00fc:
            return r11
        L_0x00fd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p144s.C3524j0.mo11937q0(android.view.ViewGroup, f.s.s, int, f.s.s, int):android.animation.Animator");
    }

    /* renamed from: r */
    public Animator mo11875r(ViewGroup viewGroup, C3549s sVar, C3549s sVar2) {
        C3527c m0 = m15109m0(sVar, sVar2);
        if (!m0.f10971a) {
            return null;
        }
        if (m0.f10975e == null && m0.f10976f == null) {
            return null;
        }
        if (m0.f10972b) {
            return mo11936o0(viewGroup, sVar, m0.f10973c, sVar2, m0.f10974d);
        }
        return mo11937q0(viewGroup, sVar, m0.f10973c, sVar2, m0.f10974d);
    }

    /* renamed from: r0 */
    public void mo11938r0(int i) {
        if ((i & -4) == 0) {
            this.f10960O = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
