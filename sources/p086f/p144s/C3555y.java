package p086f.p144s;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.s.y */
class C3555y {

    /* renamed from: a */
    private static LayoutTransition f11051a;

    /* renamed from: b */
    private static Field f11052b;

    /* renamed from: c */
    private static boolean f11053c;

    /* renamed from: d */
    private static Method f11054d;

    /* renamed from: e */
    private static boolean f11055e;

    /* renamed from: f.s.y$a */
    static class C3556a extends LayoutTransition {
        C3556a() {
        }

        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m15256a(LayoutTransition layoutTransition) {
        if (!f11055e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f11054d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f11055e = true;
        }
        Method method = f11054d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m15257b(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = f11051a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0028
            f.s.y$a r0 = new f.s.y$a
            r0.<init>()
            f11051a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f11051a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = f11051a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = f11051a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = f11051a
            r4 = 4
            r0.setAnimator(r4, r3)
        L_0x0028:
            if (r6 == 0) goto L_0x0048
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L_0x0042
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L_0x0039
            m15256a(r6)
        L_0x0039:
            android.animation.LayoutTransition r0 = f11051a
            if (r6 == r0) goto L_0x0042
            int r0 = p086f.p144s.C3523j.transition_layout_save
            r5.setTag(r0, r6)
        L_0x0042:
            android.animation.LayoutTransition r6 = f11051a
        L_0x0044:
            r5.setLayoutTransition(r6)
            goto L_0x0094
        L_0x0048:
            r5.setLayoutTransition(r3)
            boolean r6 = f11053c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L_0x0066
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x005f }
            f11052b = r6     // Catch:{ NoSuchFieldException -> 0x005f }
            r6.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x005f }
            goto L_0x0064
        L_0x005f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x0064:
            f11053c = r1
        L_0x0066:
            java.lang.reflect.Field r6 = f11052b
            if (r6 == 0) goto L_0x007f
            boolean r6 = r6.getBoolean(r5)     // Catch:{ IllegalAccessException -> 0x007a }
            if (r6 == 0) goto L_0x0078
            java.lang.reflect.Field r1 = f11052b     // Catch:{ IllegalAccessException -> 0x0076 }
            r1.setBoolean(r5, r2)     // Catch:{ IllegalAccessException -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            r2 = r6
            goto L_0x007a
        L_0x0078:
            r2 = r6
            goto L_0x007f
        L_0x007a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L_0x007f:
            if (r2 == 0) goto L_0x0084
            r5.requestLayout()
        L_0x0084:
            int r6 = p086f.p144s.C3523j.transition_layout_save
            java.lang.Object r6 = r5.getTag(r6)
            android.animation.LayoutTransition r6 = (android.animation.LayoutTransition) r6
            if (r6 == 0) goto L_0x0094
            int r0 = p086f.p144s.C3523j.transition_layout_save
            r5.setTag(r0, r3)
            goto L_0x0044
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p144s.C3555y.m15257b(android.view.ViewGroup, boolean):void");
    }
}
