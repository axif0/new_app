package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p120k.C3330c;
import p086f.p111h.p121l.C3349h;

/* renamed from: androidx.core.widget.i */
public final class C0608i {

    /* renamed from: a */
    private static Field f2525a;

    /* renamed from: b */
    private static boolean f2526b;

    /* renamed from: c */
    private static Field f2527c;

    /* renamed from: d */
    private static boolean f2528d;

    /* renamed from: androidx.core.widget.i$a */
    private static class C0609a implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f2529a;

        /* renamed from: b */
        private final TextView f2530b;

        /* renamed from: c */
        private Class<?> f2531c;

        /* renamed from: d */
        private Method f2532d;

        /* renamed from: e */
        private boolean f2533e;

        /* renamed from: f */
        private boolean f2534f = false;

        C0609a(ActionMode.Callback callback, TextView textView) {
            this.f2529a = callback;
            this.f2530b = textView;
        }

        /* renamed from: a */
        private Intent m2906a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m2907b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m2906a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m2909d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m2908c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m2906a(), 0)) {
                if (m2910e(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m2909d(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: e */
        private boolean m2910e(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: f */
        private void m2911f(Menu menu) {
            Method method;
            Context context = this.f2530b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2534f) {
                this.f2534f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2531c = cls;
                    this.f2532d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2533e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2531c = null;
                    this.f2532d = null;
                    this.f2533e = false;
                }
            }
            try {
                if (!this.f2533e || !this.f2531c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2532d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = m2908c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m2907b(resolveInfo, this.f2530b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2529a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2529a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2529a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m2911f(menu);
            return this.f2529a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m2887a(TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static int m2888b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m2889c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m2890d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f2528d) {
            f2527c = m2894h("mMaxMode");
            f2528d = true;
        }
        Field field = f2527c;
        if (field == null || m2895i(field, textView) != 1) {
            return -1;
        }
        if (!f2526b) {
            f2525a = m2894h("mMaximum");
            f2526b = true;
        }
        Field field2 = f2525a;
        if (field2 != null) {
            return m2895i(field2, textView);
        }
        return -1;
    }

    /* renamed from: e */
    private static int m2891e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m2892f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: g */
    public static C3330c.C3331a m2893g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C3330c.C3331a(textView.getTextMetricsParams());
        }
        C3330c.C3331a.C3332a aVar = new C3330c.C3331a.C3332a(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            aVar.mo11533b(textView.getBreakStrategy());
            aVar.mo11534c(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            aVar.mo11535d(m2892f(textView));
        }
        return aVar.mo11532a();
    }

    /* renamed from: h */
    private static Field m2894h(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e("TextViewCompat", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: i */
    private static int m2895i(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            Log.d("TextViewCompat", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: j */
    public static void m2896j(TextView textView, ColorStateList colorStateList) {
        C3349h.m14361c(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof C0611k) {
            ((C0611k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: k */
    public static void m2897k(TextView textView, PorterDuff.Mode mode) {
        C3349h.m14361c(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof C0611k) {
            ((C0611k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: l */
    public static void m2898l(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: m */
    public static void m2899m(TextView textView, int i) {
        C3349h.m14360b(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: n */
    public static void m2900n(TextView textView, int i) {
        C3349h.m14360b(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: o */
    public static void m2901o(TextView textView, int i) {
        C3349h.m14360b(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: p */
    public static void m2902p(TextView textView, C3330c cVar) {
        Spanned spanned;
        if (Build.VERSION.SDK_INT >= 29) {
            spanned = cVar.mo11512b();
        } else {
            boolean a = m2893g(textView).mo11524a(cVar.mo11511a());
            spanned = cVar;
            if (!a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(spanned);
    }

    /* renamed from: q */
    public static void m2903q(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: r */
    public static void m2904r(TextView textView, C3330c.C3331a aVar) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m2891e(aVar.mo11527d()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo11528e().getTextScaleX();
            textView.getPaint().set(aVar.mo11528e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo11528e());
        textView.setBreakStrategy(aVar.mo11525b());
        textView.setHyphenationFrequency(aVar.mo11526c());
    }

    /* renamed from: s */
    public static ActionMode.Callback m2905s(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0609a)) ? callback : new C0609a(callback, textView);
    }
}
