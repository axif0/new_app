package p086f.p111h.p122m.p123c0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: f.h.m.c0.b */
public final class C3368b {
    /* renamed from: a */
    public static int m14437a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m14438b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
