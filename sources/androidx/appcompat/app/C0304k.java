package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0419d;
import androidx.appcompat.widget.C0426f;
import androidx.appcompat.widget.C0430g;
import androidx.appcompat.widget.C0444j;
import androidx.appcompat.widget.C0455l;
import androidx.appcompat.widget.C0459n;
import androidx.appcompat.widget.C0465o;
import androidx.appcompat.widget.C0472r;
import androidx.appcompat.widget.C0473r0;
import androidx.appcompat.widget.C0474s;
import androidx.appcompat.widget.C0476t;
import androidx.appcompat.widget.C0480v;
import androidx.appcompat.widget.C0507z;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p086f.p087a.C3132j;
import p086f.p087a.p094o.C3158d;
import p086f.p102e.C3203g;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.app.k */
public class C0304k {

    /* renamed from: b */
    private static final Class<?>[] f1011b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f1012c = {16843375};

    /* renamed from: d */
    private static final String[] f1013d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C3203g<String, Constructor<? extends View>> f1014e = new C3203g<>();

    /* renamed from: a */
    private final Object[] f1015a = new Object[2];

    /* renamed from: androidx.appcompat.app.k$a */
    private static class C0305a implements View.OnClickListener {

        /* renamed from: f */
        private final View f1016f;

        /* renamed from: g */
        private final String f1017g;

        /* renamed from: h */
        private Method f1018h;

        /* renamed from: i */
        private Context f1019i;

        public C0305a(View view, String str) {
            this.f1016f = view;
            this.f1017g = str;
        }

        /* renamed from: a */
        private void m1224a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1017g, new Class[]{View.class})) != null) {
                        this.f1018h = method;
                        this.f1019i = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1016f.getId();
            if (id == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f1016f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1017g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1016f.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f1018h == null) {
                m1224a(this.f1016f.getContext());
            }
            try {
                this.f1018h.invoke(this.f1019i, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m1203a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C3403t.m14609J(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1012c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0305a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m1204r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends U> constructor = f1014e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1011b);
            f1014e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1015a);
    }

    /* renamed from: s */
    private View m1205s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f1015a[0] = context;
            this.f1015a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String r : f1013d) {
                    View r2 = m1204r(context, str, r);
                    if (r2 != null) {
                        return r2;
                    }
                }
                Object[] objArr = this.f1015a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View r3 = m1204r(context, str, (String) null);
            Object[] objArr2 = this.f1015a;
            objArr2[0] = null;
            objArr2[1] = null;
            return r3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.f1015a;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m1206t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3132j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C3132j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C3132j.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C3158d) || ((C3158d) context).mo10914c() != resourceId) ? new C3158d(context, resourceId) : context : context;
    }

    /* renamed from: u */
    private void m1207u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0419d mo975b(Context context, AttributeSet attributeSet) {
        return new C0419d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0426f mo976c(Context context, AttributeSet attributeSet) {
        return new C0426f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatCheckBox mo977d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0430g mo978e(Context context, AttributeSet attributeSet) {
        return new C0430g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0444j mo979f(Context context, AttributeSet attributeSet) {
        return new C0444j(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0455l mo980g(Context context, AttributeSet attributeSet) {
        return new C0455l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0459n mo981h(Context context, AttributeSet attributeSet) {
        return new C0459n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0465o mo982i(Context context, AttributeSet attributeSet) {
        return new C0465o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0472r mo983j(Context context, AttributeSet attributeSet) {
        return new C0472r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0474s mo984k(Context context, AttributeSet attributeSet) {
        return new C0474s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0476t mo985l(Context context, AttributeSet attributeSet) {
        return new C0476t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0480v mo986m(Context context, AttributeSet attributeSet) {
        return new C0480v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatTextView mo987n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0507z mo988o(Context context, AttributeSet attributeSet) {
        return new C0507z(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public View mo989p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final View mo990q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1206t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0473r0.m2138b(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo987n(context2, attributeSet);
                break;
            case 1:
                view2 = mo981h(context2, attributeSet);
                break;
            case 2:
                view2 = mo976c(context2, attributeSet);
                break;
            case 3:
                view2 = mo979f(context2, attributeSet);
                break;
            case 4:
                view2 = mo986m(context2, attributeSet);
                break;
            case 5:
                view2 = mo980g(context2, attributeSet);
                break;
            case 6:
                view2 = mo977d(context2, attributeSet);
                break;
            case 7:
                view2 = mo983j(context2, attributeSet);
                break;
            case 8:
                view2 = mo978e(context2, attributeSet);
                break;
            case 9:
                view2 = mo975b(context2, attributeSet);
                break;
            case 10:
                view2 = mo982i(context2, attributeSet);
                break;
            case 11:
                view2 = mo984k(context2, attributeSet);
                break;
            case 12:
                view2 = mo985l(context2, attributeSet);
                break;
            case 13:
                view2 = mo988o(context2, attributeSet);
                break;
            default:
                view2 = mo989p(context2, str, attributeSet);
                break;
        }
        m1207u(view2, str);
        if (view2 == null && context != context2) {
            view2 = m1205s(context2, str, attributeSet);
        }
        if (view2 != null) {
            m1203a(view2, attributeSet);
        }
        return view2;
    }
}
