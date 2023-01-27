package p086f.p126j.p128b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p086f.p102e.C3204h;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3417w;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3373d;
import p086f.p111h.p122m.p123c0.C3376e;
import p086f.p126j.p128b.C3437b;

/* renamed from: f.j.b.a */
public abstract class C3433a extends C3350a {

    /* renamed from: n */
    private static final Rect f10751n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C3437b.C3438a<C3369c> f10752o = new C3434a();

    /* renamed from: p */
    private static final C3437b.C3439b<C3204h<C3369c>, C3369c> f10753p = new C3435b();

    /* renamed from: d */
    private final Rect f10754d = new Rect();

    /* renamed from: e */
    private final Rect f10755e = new Rect();

    /* renamed from: f */
    private final Rect f10756f = new Rect();

    /* renamed from: g */
    private final int[] f10757g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f10758h;

    /* renamed from: i */
    private final View f10759i;

    /* renamed from: j */
    private C3436c f10760j;

    /* renamed from: k */
    int f10761k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f10762l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f10763m = Integer.MIN_VALUE;

    /* renamed from: f.j.b.a$a */
    static class C3434a implements C3437b.C3438a<C3369c> {
        C3434a() {
        }

        /* renamed from: b */
        public void mo11780a(C3369c cVar, Rect rect) {
            cVar.mo11639m(rect);
        }
    }

    /* renamed from: f.j.b.a$b */
    static class C3435b implements C3437b.C3439b<C3204h<C3369c>, C3369c> {
        C3435b() {
        }

        /* renamed from: c */
        public C3369c mo11782a(C3204h<C3369c> hVar, int i) {
            return hVar.mo11161r(i);
        }

        /* renamed from: d */
        public int mo11783b(C3204h<C3369c> hVar) {
            return hVar.mo11160q();
        }
    }

    /* renamed from: f.j.b.a$c */
    private class C3436c extends C3373d {
        C3436c() {
        }

        /* renamed from: a */
        public C3369c mo11675a(int i) {
            return C3369c.m14443Q(C3433a.this.mo11769H(i));
        }

        /* renamed from: c */
        public C3369c mo11677c(int i) {
            int i2 = i == 2 ? C3433a.this.f10761k : C3433a.this.f10762l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo11675a(i2);
        }

        /* renamed from: e */
        public boolean mo11679e(int i, int i2, Bundle bundle) {
            return C3433a.this.mo11773P(i, i2, bundle);
        }
    }

    public C3433a(View view) {
        if (view != null) {
            this.f10759i = view;
            this.f10758h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C3403t.m14670w(view) == 0) {
                C3403t.m14663s0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m14769D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m14770E(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f10759i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f10759i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p126j.p128b.C3433a.m14770E(android.graphics.Rect):boolean");
    }

    /* renamed from: F */
    private static int m14771F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m14772G(int i, Rect rect) {
        Object obj;
        C3204h<C3369c> y = m14784y();
        int i2 = this.f10762l;
        int i3 = Integer.MIN_VALUE;
        C3369c f = i2 == Integer.MIN_VALUE ? null : y.mo11153f(i2);
        if (i == 1 || i == 2) {
            obj = C3437b.m14819d(y, f10753p, f10752o, f, i, C3403t.m14674y(this.f10759i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f10762l;
            if (i4 != Integer.MIN_VALUE) {
                m14785z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m14769D(this.f10759i, i, rect2);
            }
            obj = C3437b.m14818c(y, f10753p, f10752o, f, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C3369c cVar = (C3369c) obj;
        if (cVar != null) {
            i3 = y.mo11157l(y.mo11156k(cVar));
        }
        return mo11774T(i3);
    }

    /* renamed from: Q */
    private boolean m14773Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo7998J(i, i2, bundle) : m14777n(i) : m14775S(i) : mo11776o(i) : mo11774T(i);
    }

    /* renamed from: R */
    private boolean m14774R(int i, Bundle bundle) {
        return C3403t.m14624Y(this.f10759i, i, bundle);
    }

    /* renamed from: S */
    private boolean m14775S(int i) {
        int i2;
        if (!this.f10758h.isEnabled() || !this.f10758h.isTouchExplorationEnabled() || (i2 = this.f10761k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m14777n(i2);
        }
        this.f10761k = i;
        this.f10759i.invalidate();
        mo11775U(i, 32768);
        return true;
    }

    /* renamed from: V */
    private void m14776V(int i) {
        int i2 = this.f10763m;
        if (i2 != i) {
            this.f10763m = i;
            mo11775U(i, 128);
            mo11775U(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m14777n(int i) {
        if (this.f10761k != i) {
            return false;
        }
        this.f10761k = Integer.MIN_VALUE;
        this.f10759i.invalidate();
        mo11775U(i, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m14778p() {
        int i = this.f10762l;
        return i != Integer.MIN_VALUE && mo7998J(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    private AccessibilityEvent m14779q(int i, int i2) {
        return i != -1 ? m14780r(i, i2) : m14781s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m14780r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C3369c H = mo11769H(i);
        obtain.getText().add(H.mo11659x());
        obtain.setContentDescription(H.mo11650s());
        obtain.setScrollable(H.mo11607K());
        obtain.setPassword(H.mo11606J());
        obtain.setEnabled(H.mo11602F());
        obtain.setChecked(H.mo11600D());
        mo11772L(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.mo11645p());
            C3376e.m14540c(obtain, this.f10759i, i);
            obtain.setPackageName(this.f10759i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m14781s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f10759i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C3369c m14782t(int i) {
        C3369c O = C3369c.m14441O();
        O.mo11631h0(true);
        O.mo11635j0(true);
        O.mo11621b0("android.view.View");
        O.mo11615X(f10751n);
        O.mo11616Y(f10751n);
        O.mo11649r0(this.f10759i);
        mo8000N(i, O);
        if (O.mo11659x() == null && O.mo11650s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        O.mo11639m(this.f10755e);
        if (!this.f10755e.equals(f10751n)) {
            int k = O.mo11636k();
            if ((k & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k & 128) == 0) {
                O.mo11646p0(this.f10759i.getContext().getPackageName());
                O.mo11663z0(this.f10759i, i);
                if (this.f10761k == i) {
                    O.mo11614V(true);
                    O.mo11618a(128);
                } else {
                    O.mo11614V(false);
                    O.mo11618a(64);
                }
                boolean z = this.f10762l == i;
                if (z) {
                    O.mo11618a(2);
                } else if (O.mo11603G()) {
                    O.mo11618a(1);
                }
                O.mo11637k0(z);
                this.f10759i.getLocationOnScreen(this.f10757g);
                O.mo11641n(this.f10754d);
                if (this.f10754d.equals(f10751n)) {
                    O.mo11639m(this.f10754d);
                    if (O.f10669b != -1) {
                        C3369c O2 = C3369c.m14441O();
                        for (int i2 = O.f10669b; i2 != -1; i2 = O2.f10669b) {
                            O2.mo11651s0(this.f10759i, -1);
                            O2.mo11615X(f10751n);
                            mo8000N(i2, O2);
                            O2.mo11639m(this.f10755e);
                            Rect rect = this.f10754d;
                            Rect rect2 = this.f10755e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        O2.mo11612S();
                    }
                    this.f10754d.offset(this.f10757g[0] - this.f10759i.getScrollX(), this.f10757g[1] - this.f10759i.getScrollY());
                }
                if (this.f10759i.getLocalVisibleRect(this.f10756f)) {
                    this.f10756f.offset(this.f10757g[0] - this.f10759i.getScrollX(), this.f10757g[1] - this.f10759i.getScrollY());
                    if (this.f10754d.intersect(this.f10756f)) {
                        O.mo11616Y(this.f10754d);
                        if (m14770E(this.f10754d)) {
                            O.mo11597B0(true);
                        }
                    }
                }
                return O;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private C3369c m14783u() {
        C3369c P = C3369c.m14442P(this.f10759i);
        C3403t.m14622W(this.f10759i, P);
        ArrayList arrayList = new ArrayList();
        mo7997C(arrayList);
        if (P.mo11643o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                P.mo11624d(this.f10759i, ((Integer) arrayList.get(i)).intValue());
            }
            return P;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C3204h<C3369c> m14784y() {
        ArrayList arrayList = new ArrayList();
        mo7997C(arrayList);
        C3204h<C3369c> hVar = new C3204h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo11158n(i, m14782t(i));
        }
        return hVar;
    }

    /* renamed from: z */
    private void m14785z(int i, Rect rect) {
        mo11769H(i).mo11639m(rect);
    }

    /* renamed from: A */
    public final int mo11768A() {
        return this.f10762l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo7996B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo7997C(List<Integer> list);

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C3369c mo11769H(int i) {
        return i == -1 ? m14783u() : m14782t(i);
    }

    /* renamed from: I */
    public final void mo11770I(boolean z, int i, Rect rect) {
        int i2 = this.f10762l;
        if (i2 != Integer.MIN_VALUE) {
            mo11776o(i2);
        }
        if (z) {
            m14772G(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract boolean mo7998J(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo11771K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo11772L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo7999M(C3369c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo8000N(int i, C3369c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo8001O(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo11773P(int i, int i2, Bundle bundle) {
        return i != -1 ? m14773Q(i, i2, bundle) : m14774R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean mo11774T(int i) {
        int i2;
        if ((!this.f10759i.isFocused() && !this.f10759i.requestFocus()) || (i2 = this.f10762l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo11776o(i2);
        }
        this.f10762l = i;
        mo8001O(i, true);
        mo11775U(i, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean mo11775U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f10758h.isEnabled() || (parent = this.f10759i.getParent()) == null) {
            return false;
        }
        return C3417w.m14730h(parent, this.f10759i, m14779q(i, i2));
    }

    /* renamed from: b */
    public C3373d mo4824b(View view) {
        if (this.f10760j == null) {
            this.f10760j = new C3436c();
        }
        return this.f10760j;
    }

    /* renamed from: f */
    public void mo2996f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2996f(view, accessibilityEvent);
        mo11771K(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2997g(View view, C3369c cVar) {
        super.mo2997g(view, cVar);
        mo7999M(cVar);
    }

    /* renamed from: o */
    public final boolean mo11776o(int i) {
        if (this.f10762l != i) {
            return false;
        }
        this.f10762l = Integer.MIN_VALUE;
        mo8001O(i, false);
        mo11775U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo11777v(MotionEvent motionEvent) {
        if (!this.f10758h.isEnabled() || !this.f10758h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo7996B(motionEvent.getX(), motionEvent.getY());
            m14776V(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.f10763m == Integer.MIN_VALUE) {
            return false;
        } else {
            m14776V(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo11778w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = m14771F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m14772G(F, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m14778p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m14772G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m14772G(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo11779x() {
        return this.f10761k;
    }
}
