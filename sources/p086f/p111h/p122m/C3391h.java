package p086f.p111h.p122m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p086f.p111h.p115g.p116a.C3304b;

/* renamed from: f.h.m.h */
public final class C3391h {
    /* renamed from: a */
    public static MenuItem m14558a(MenuItem menuItem, C3353b bVar) {
        if (menuItem instanceof C3304b) {
            return ((C3304b) menuItem).mo1068a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m14559b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3304b) {
            ((C3304b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: c */
    public static void m14560c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3304b) {
            ((C3304b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m14561d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C3304b) {
            ((C3304b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m14562e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C3304b) {
            ((C3304b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m14563f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C3304b) {
            ((C3304b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: g */
    public static void m14564g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C3304b) {
            ((C3304b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
