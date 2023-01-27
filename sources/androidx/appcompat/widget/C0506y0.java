package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p086f.p087a.C3126d;
import p086f.p087a.C3128f;
import p086f.p087a.C3129g;
import p086f.p087a.C3131i;

/* renamed from: androidx.appcompat.widget.y0 */
class C0506y0 {

    /* renamed from: a */
    private final Context f1963a;

    /* renamed from: b */
    private final View f1964b;

    /* renamed from: c */
    private final TextView f1965c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1966d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1967e = new Rect();

    /* renamed from: f */
    private final int[] f1968f = new int[2];

    /* renamed from: g */
    private final int[] f1969g = new int[2];

    C0506y0(Context context) {
        this.f1963a = context;
        View inflate = LayoutInflater.from(context).inflate(C3129g.abc_tooltip, (ViewGroup) null);
        this.f1964b = inflate;
        this.f1965c = (TextView) inflate.findViewById(C3128f.message);
        this.f1966d.setTitle(C0506y0.class.getSimpleName());
        this.f1966d.packageName = this.f1963a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1966d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C3131i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m2325a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1963a.getResources().getDimensionPixelOffset(C3126d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1963a.getResources().getDimensionPixelOffset(C3126d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1963a.getResources().getDimensionPixelOffset(z ? C3126d.tooltip_y_offset_touch : C3126d.tooltip_y_offset_non_touch);
        View b = m2326b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1967e);
        Rect rect = this.f1967e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1963a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1967e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1969g);
        view.getLocationOnScreen(this.f1968f);
        int[] iArr = this.f1968f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1969g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1964b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1964b.getMeasuredHeight();
        int[] iArr3 = this.f1968f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i7 > this.f1967e.height() : i6 >= 0) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i7;
        }
    }

    /* renamed from: b */
    private static View m2326b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2483c() {
        if (mo2484d()) {
            ((WindowManager) this.f1963a.getSystemService("window")).removeView(this.f1964b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2484d() {
        return this.f1964b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2485e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2484d()) {
            mo2483c();
        }
        this.f1965c.setText(charSequence);
        m2325a(view, i, i2, z, this.f1966d);
        ((WindowManager) this.f1963a.getSystemService("window")).addView(this.f1964b, this.f1966d);
    }
}
