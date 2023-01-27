package p086f.p111h.p122m;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p086f.p111h.C3265c;
import p086f.p111h.p122m.C3350a;
import p086f.p111h.p122m.p123c0.C3369c;
import p086f.p111h.p122m.p123c0.C3377f;

/* renamed from: f.h.m.t */
public class C3403t {

    /* renamed from: a */
    private static Field f10706a;

    /* renamed from: b */
    private static boolean f10707b;

    /* renamed from: c */
    private static Field f10708c;

    /* renamed from: d */
    private static boolean f10709d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f10710e;

    /* renamed from: f */
    private static WeakHashMap<View, C3418x> f10711f = null;

    /* renamed from: g */
    private static Field f10712g;

    /* renamed from: h */
    private static boolean f10713h = false;

    /* renamed from: i */
    private static ThreadLocal<Rect> f10714i;

    /* renamed from: f.h.m.t$a */
    class C3404a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ C3399p f10715a;

        C3404a(C3399p pVar) {
            this.f10715a = pVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f10715a.mo923a(view, C3356b0.m14388p(windowInsets)).mo11572o();
        }
    }

    /* renamed from: f.h.m.t$b */
    class C3405b extends C3409f<Boolean> {
        C3405b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo11709d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo11710e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo11711h(Boolean bool, Boolean bool2) {
            return !mo11724a(bool, bool2);
        }
    }

    /* renamed from: f.h.m.t$c */
    class C3406c extends C3409f<CharSequence> {
        C3406c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo11709d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo11710e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo11711h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: f.h.m.t$d */
    class C3407d extends C3409f<Boolean> {
        C3407d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo11709d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo11710e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo11711h(Boolean bool, Boolean bool2) {
            return !mo11724a(bool, bool2);
        }
    }

    /* renamed from: f.h.m.t$e */
    static class C3408e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f10716f = new WeakHashMap<>();

        C3408e() {
        }

        /* renamed from: a */
        private void m14696a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C3403t.m14618S(view, 16);
                }
                this.f10716f.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m14697b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            for (Map.Entry next : this.f10716f.entrySet()) {
                m14696a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m14697b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: f.h.m.t$f */
    static abstract class C3409f<T> {

        /* renamed from: a */
        private final int f10717a;

        /* renamed from: b */
        private final Class<T> f10718b;

        /* renamed from: c */
        private final int f10719c;

        C3409f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        C3409f(int i, Class<T> cls, int i2, int i3) {
            this.f10717a = i;
            this.f10718b = cls;
            this.f10719c = i3;
        }

        /* renamed from: b */
        private boolean m14698b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m14699c() {
            return Build.VERSION.SDK_INT >= this.f10719c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11724a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo11709d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo11710e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo11725f(View view) {
            if (m14699c()) {
                return mo11709d(view);
            }
            if (!m14698b()) {
                return null;
            }
            T tag = view.getTag(this.f10717a);
            if (this.f10718b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo11726g(View view, T t) {
            if (m14699c()) {
                mo11710e(view, t);
            } else if (m14698b() && mo11711h(mo11725f(view), t)) {
                C3403t.m14601B(view);
                view.setTag(this.f10717a, t);
                C3403t.m14618S(view, 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo11711h(T t, T t2);
    }

    /* renamed from: f.h.m.t$g */
    private static class C3410g {
        /* renamed from: a */
        static C3356b0 m14706a(View view, C3356b0 b0Var, Rect rect) {
            WindowInsets o = b0Var.mo11572o();
            if (o != null) {
                return C3356b0.m14388p(view.computeSystemWindowInsets(o, rect));
            }
            rect.setEmpty();
            return b0Var;
        }
    }

    /* renamed from: f.h.m.t$h */
    private static class C3411h {
        /* renamed from: a */
        public static WindowInsets m14707a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* renamed from: f.h.m.t$i */
    private static class C3412i {
        /* renamed from: a */
        static void m14708a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: f.h.m.t$j */
    public interface C3413j {
        /* renamed from: a */
        boolean mo11727a(View view, KeyEvent keyEvent);
    }

    /* renamed from: f.h.m.t$k */
    static class C3414k {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f10720d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f10721a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f10722b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f10723c = null;

        C3414k() {
        }

        /* renamed from: a */
        static C3414k m14710a(View view) {
            C3414k kVar = (C3414k) view.getTag(C3265c.tag_unhandled_key_event_manager);
            if (kVar != null) {
                return kVar;
            }
            C3414k kVar2 = new C3414k();
            view.setTag(C3265c.tag_unhandled_key_event_manager, kVar2);
            return kVar2;
        }

        /* renamed from: c */
        private View m14711c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f10721a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m14711c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m14713e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m14712d() {
            if (this.f10722b == null) {
                this.f10722b = new SparseArray<>();
            }
            return this.f10722b;
        }

        /* renamed from: e */
        private boolean m14713e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C3265c.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C3413j) arrayList.get(size)).mo11727a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m14714g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f10721a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f10720d.isEmpty()) {
                synchronized (f10720d) {
                    if (this.f10721a == null) {
                        this.f10721a = new WeakHashMap<>();
                    }
                    for (int size = f10720d.size() - 1; size >= 0; size--) {
                        View view = (View) f10720d.get(size).get();
                        if (view == null) {
                            f10720d.remove(size);
                        } else {
                            this.f10721a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f10721a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo11728b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m14714g();
            }
            View c = m14711c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m14712d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo11729f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f10723c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f10723c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m14712d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C3403t.m14613N(view)) {
                m14713e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new C3408e();
    }

    /* renamed from: A */
    public static int m14599A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f10707b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f10706a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10707b = true;
        }
        Field field = f10706a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: A0 */
    private static void m14600A0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: B */
    static C3350a m14601B(View view) {
        C3350a j = m14644j(view);
        if (j == null) {
            j = new C3350a();
        }
        m14643i0(view, j);
        return j;
    }

    /* renamed from: C */
    public static int m14602C(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: D */
    public static int m14603D(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: E */
    public static ViewParent m14604E(View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    /* renamed from: F */
    public static C3356b0 m14605F(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C3356b0.m14388p(C3411h.m14707a(view));
        }
        return null;
    }

    /* renamed from: G */
    public static String m14606G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f10710e;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: H */
    public static int m14607H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: I */
    public static float m14608I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: J */
    public static boolean m14609J(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m14610K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m14611L(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m14612M(View view) {
        Boolean f = m14626a().mo11725f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: N */
    public static boolean m14613N(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: O */
    public static boolean m14614O(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: P */
    public static boolean m14615P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C3393j) {
            return ((C3393j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m14616Q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m14617R(View view) {
        Boolean f = m14641h0().mo11725f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: S */
    static void m14618S(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m14652n(view) != null;
            if (m14650m(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: T */
    public static void m14619T(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect u = m14666u();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m14632d(view, i);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
            }
        } else {
            m14632d(view, i);
        }
    }

    /* renamed from: U */
    public static void m14620U(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect u = m14666u();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m14634e(view, i);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
            }
        } else {
            m14634e(view, i);
        }
    }

    /* renamed from: V */
    public static C3356b0 m14621V(View view, C3356b0 b0Var) {
        WindowInsets o;
        if (Build.VERSION.SDK_INT >= 21 && (o = b0Var.mo11572o()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(o);
            if (!onApplyWindowInsets.equals(o)) {
                return C3356b0.m14388p(onApplyWindowInsets);
            }
        }
        return b0Var;
    }

    /* renamed from: W */
    public static void m14622W(View view, C3369c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo11599C0());
    }

    /* renamed from: X */
    private static C3409f<CharSequence> m14623X() {
        return new C3406c(C3265c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: Y */
    public static boolean m14624Y(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: Z */
    public static void m14625Z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    private static C3409f<Boolean> m14626a() {
        return new C3407d(C3265c.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m14627a0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: b */
    private static void m14628b(View view, C3369c.C3370a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m14601B(view);
            m14633d0(aVar.mo11665b(), view);
            m14654o(view).add(aVar);
            m14618S(view, 0);
        }
    }

    /* renamed from: b0 */
    public static void m14629b0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: c */
    public static C3418x m14630c(View view) {
        if (f10711f == null) {
            f10711f = new WeakHashMap<>();
        }
        C3418x xVar = f10711f.get(view);
        if (xVar != null) {
            return xVar;
        }
        C3418x xVar2 = new C3418x(view);
        f10711f.put(view, xVar2);
        return xVar2;
    }

    /* renamed from: c0 */
    public static void m14631c0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m14633d0(i, view);
            m14618S(view, 0);
        }
    }

    /* renamed from: d */
    private static void m14632d(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m14600A0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m14600A0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    private static void m14633d0(int i, View view) {
        List<C3369c.C3370a> o = m14654o(view);
        for (int i2 = 0; i2 < o.size(); i2++) {
            if (o.get(i2).mo11665b() == i) {
                o.remove(i2);
                return;
            }
        }
    }

    /* renamed from: e */
    private static void m14634e(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m14600A0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m14600A0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m14635e0(View view, C3369c.C3370a aVar, CharSequence charSequence, C3377f fVar) {
        if (fVar == null && charSequence == null) {
            m14631c0(view, aVar.mo11665b());
        } else {
            m14628b(view, aVar.mo11664a(charSequence, fVar));
        }
    }

    /* renamed from: f */
    public static C3356b0 m14636f(View view, C3356b0 b0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C3410g.m14706a(view, b0Var, rect) : b0Var;
    }

    /* renamed from: f0 */
    public static void m14637f0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.mo11572o();
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p086f.p111h.p122m.C3356b0 m14638g(android.view.View r2, p086f.p111h.p122m.C3356b0 r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x001b
            android.view.WindowInsets r0 = r3.mo11572o()
            if (r0 == 0) goto L_0x001b
            android.view.WindowInsets r2 = r2.dispatchApplyWindowInsets(r0)
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x001b
            f.h.m.b0 r2 = p086f.p111h.p122m.C3356b0.m14388p(r0)
            return r2
        L_0x001b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p122m.C3403t.m14638g(android.view.View, f.h.m.b0):f.h.m.b0");
    }

    /* renamed from: g0 */
    public static void m14639g0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C3412i.m14708a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: h */
    static boolean m14640h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3414k.m14710a(view).mo11728b(view, keyEvent);
    }

    /* renamed from: h0 */
    private static C3409f<Boolean> m14641h0() {
        return new C3405b(C3265c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: i */
    static boolean m14642i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3414k.m14710a(view).mo11729f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m14643i0(View view, C3350a aVar) {
        if (aVar == null && (m14646k(view) instanceof C3350a.C3351a)) {
            aVar = new C3350a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo11545d());
    }

    /* renamed from: j */
    public static C3350a m14644j(View view) {
        View.AccessibilityDelegate k = m14646k(view);
        if (k == null) {
            return null;
        }
        return k instanceof C3350a.C3351a ? ((C3350a.C3351a) k).f10646a : new C3350a(k);
    }

    /* renamed from: j0 */
    public static void m14645j0(View view, boolean z) {
        m14626a().mo11726g(view, Boolean.valueOf(z));
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m14646k(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m14648l(view);
    }

    /* renamed from: k0 */
    public static void m14647k0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: l */
    private static View.AccessibilityDelegate m14648l(View view) {
        if (f10713h) {
            return null;
        }
        if (f10712g == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f10712g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f10713h = true;
                return null;
            }
        }
        try {
            Object obj = f10712g.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f10713h = true;
            return null;
        }
    }

    /* renamed from: l0 */
    public static void m14649l0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: m */
    public static int m14650m(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: m0 */
    public static void m14651m0(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C3402s) {
            ((C3402s) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: n */
    public static CharSequence m14652n(View view) {
        return m14623X().mo11725f(view);
    }

    /* renamed from: n0 */
    public static void m14653n0(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C3402s) {
            ((C3402s) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: o */
    private static List<C3369c.C3370a> m14654o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C3265c.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C3265c.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: o0 */
    public static void m14655o0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: p */
    public static ColorStateList m14656p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C3402s) {
            return ((C3402s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: p0 */
    public static void m14657p0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: q */
    public static PorterDuff.Mode m14658q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C3402s) {
            return ((C3402s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    @Deprecated
    /* renamed from: q0 */
    public static void m14659q0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: r */
    public static Rect m14660r(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: r0 */
    public static void m14661r0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: s */
    public static Display m14662s(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m14613N(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m14663s0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: t */
    public static float m14664t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: t0 */
    public static void m14665t0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: u */
    private static Rect m14666u() {
        if (f10714i == null) {
            f10714i = new ThreadLocal<>();
        }
        Rect rect = f10714i.get();
        if (rect == null) {
            rect = new Rect();
            f10714i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: u0 */
    public static void m14667u0(View view, C3399p pVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (pVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new C3404a(pVar));
        }
    }

    /* renamed from: v */
    public static boolean m14668v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: v0 */
    public static void m14669v0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: w */
    public static int m14670w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: w0 */
    public static void m14671w0(View view, C3401r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (rVar != null ? rVar.mo11707a() : null));
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x */
    public static int m14672x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: x0 */
    public static void m14673x0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: y */
    public static int m14674y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: y0 */
    public static void m14675y0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f10710e == null) {
            f10710e = new WeakHashMap<>();
        }
        f10710e.put(view, str);
    }

    /* renamed from: z */
    public static int m14676z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f10709d) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f10708c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10709d = true;
        }
        Field field = f10708c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: z0 */
    public static void m14677z0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C3393j) {
            ((C3393j) view).stopNestedScroll();
        }
    }
}
