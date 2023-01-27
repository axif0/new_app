package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.w0 */
public class C0496w0 {
    /* renamed from: a */
    public static void m2250a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0499x0.m2285f(view, charSequence);
        }
    }
}
