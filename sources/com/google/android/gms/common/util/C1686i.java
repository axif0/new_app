package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C1686i {

    /* renamed from: a */
    private static Boolean f5566a;

    /* renamed from: b */
    private static Boolean f5567b;

    /* renamed from: c */
    private static Boolean f5568c;

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m7950a(Context context) {
        if (f5567b == null) {
            f5567b = Boolean.valueOf(C1689l.m7964g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f5567b.booleanValue();
    }

    /* renamed from: b */
    public static boolean m7951b() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m7952c(Context context) {
        if (f5566a == null) {
            f5566a = Boolean.valueOf(C1689l.m7963f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f5566a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m7953d(Context context) {
        if (!m7952c(context)) {
            return false;
        }
        if (C1689l.m7965h()) {
            return m7950a(context) && !C1689l.m7966i();
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m7954e(Context context) {
        if (f5568c == null) {
            f5568c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f5568c.booleanValue();
    }
}
