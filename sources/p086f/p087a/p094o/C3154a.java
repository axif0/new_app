package p086f.p087a.p094o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p086f.p087a.C3123a;
import p086f.p087a.C3124b;
import p086f.p087a.C3126d;
import p086f.p087a.C3132j;

/* renamed from: f.a.o.a */
public class C3154a {

    /* renamed from: a */
    private Context f10018a;

    private C3154a(Context context) {
        this.f10018a = context;
    }

    /* renamed from: b */
    public static C3154a m13480b(Context context) {
        return new C3154a(context);
    }

    /* renamed from: a */
    public boolean mo10902a() {
        return this.f10018a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo10903c() {
        return this.f10018a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo10904d() {
        Configuration configuration = this.f10018a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo10905e() {
        return this.f10018a.getResources().getDimensionPixelSize(C3126d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo10906f() {
        TypedArray obtainStyledAttributes = this.f10018a.obtainStyledAttributes((AttributeSet) null, C3132j.ActionBar, C3123a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C3132j.ActionBar_height, 0);
        Resources resources = this.f10018a.getResources();
        if (!mo10907g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C3126d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo10907g() {
        return this.f10018a.getResources().getBoolean(C3124b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo10908h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f10018a).hasPermanentMenuKey();
    }
}
