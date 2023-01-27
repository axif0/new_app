package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
public final class C0588a {

    /* renamed from: a */
    private static Method f2442a;

    /* renamed from: b */
    private static boolean f2443b;

    /* renamed from: c */
    private static Method f2444c;

    /* renamed from: d */
    private static boolean f2445d;

    /* renamed from: a */
    public static void m2758a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: b */
    public static boolean m2759b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: c */
    public static void m2760c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable b;
        int i = Build.VERSION.SDK_INT;
        if (i < 23 && i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                b = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof C0590c) {
                b = ((C0590c) drawable).mo2891b();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable child = drawableContainerState.getChild(i2);
                    if (child != null) {
                        m2760c(child);
                    }
                }
                return;
            } else {
                return;
            }
            m2760c(b);
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m2761d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: e */
    public static ColorFilter m2762e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: f */
    public static int m2763f(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f2445d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2444c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f2445d = true;
            }
            Method method = f2444c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f2444c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m2764g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: h */
    public static boolean m2765h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: i */
    public static void m2766i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m2767j(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: k */
    public static void m2768k(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: l */
    public static void m2769l(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: m */
    public static boolean m2770m(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f2443b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f2442a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f2443b = true;
            }
            Method method = f2442a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f2442a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m2771n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0589b) {
            ((C0589b) drawable).setTint(i);
        }
    }

    /* renamed from: o */
    public static void m2772o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0589b) {
            ((C0589b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: p */
    public static void m2773p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0589b) {
            ((C0589b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: q */
    public static <T extends Drawable> T m2774q(Drawable drawable) {
        return drawable instanceof C0590c ? ((C0590c) drawable).mo2891b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m2775r(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof C0589b) ? new C0592e(drawable) : drawable : !(drawable instanceof C0589b) ? new C0591d(drawable) : drawable;
    }
}
