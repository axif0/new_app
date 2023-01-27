package p086f.p111h.p122m;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: f.h.m.w */
public final class C3417w {
    /* renamed from: a */
    public static boolean m14723a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (viewParent instanceof C3397n) {
            return ((C3397n) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m14724b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (viewParent instanceof C3397n) {
            return ((C3397n) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static void m14725c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C3395l) {
            ((C3395l) viewParent).mo1527j(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
                }
            } else if (viewParent instanceof C3397n) {
                ((C3397n) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: d */
    public static void m14726d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C3396m) {
            ((C3396m) viewParent2).mo1530m(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C3395l) {
            ((C3395l) viewParent2).mo1531n(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    AbstractMethodError abstractMethodError = e;
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            } else if (viewParent2 instanceof C3397n) {
                ((C3397n) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: e */
    public static void m14727e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C3395l) {
            ((C3395l) viewParent).mo1511c(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
                }
            } else if (viewParent instanceof C3397n) {
                ((C3397n) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: f */
    public static boolean m14728f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C3395l) {
            return ((C3395l) viewParent).mo1532o(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        } else if (viewParent instanceof C3397n) {
            return ((C3397n) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public static void m14729g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C3395l) {
            ((C3395l) viewParent).mo1526i(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
                }
            } else if (viewParent instanceof C3397n) {
                ((C3397n) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m14730h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
