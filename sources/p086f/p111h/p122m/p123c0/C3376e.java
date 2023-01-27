package p086f.p111h.p122m.p123c0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: f.h.m.c0.e */
public class C3376e {
    /* renamed from: a */
    public static void m14538a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m14539b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: c */
    public static void m14540c(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }
}
