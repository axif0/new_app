package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p086f.p087a.C3132j;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.appcompat.widget.y */
class C0502y {

    /* renamed from: l */
    private static final RectF f1949l = new RectF();

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1950m = new ConcurrentHashMap<>();

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1951n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1952a = 0;

    /* renamed from: b */
    private boolean f1953b = false;

    /* renamed from: c */
    private float f1954c = -1.0f;

    /* renamed from: d */
    private float f1955d = -1.0f;

    /* renamed from: e */
    private float f1956e = -1.0f;

    /* renamed from: f */
    private int[] f1957f = new int[0];

    /* renamed from: g */
    private boolean f1958g = false;

    /* renamed from: h */
    private TextPaint f1959h;

    /* renamed from: i */
    private final TextView f1960i;

    /* renamed from: j */
    private final Context f1961j;

    /* renamed from: k */
    private final C0505c f1962k;

    /* renamed from: androidx.appcompat.widget.y$a */
    private static class C0503a extends C0505c {
        C0503a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2481a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0502y.m2303r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    private static class C0504b extends C0503a {
        C0504b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2481a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2482b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: androidx.appcompat.widget.y$c */
    private static class C0505c {
        C0505c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2481a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2482b(TextView textView) {
            return ((Boolean) C0502y.m2303r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    C0502y(TextView textView) {
        this.f1960i = textView;
        this.f1961j = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        this.f1962k = i >= 29 ? new C0504b() : i >= 23 ? new C0503a() : new C0505c();
    }

    /* renamed from: A */
    private void m2289A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1957f = m2295c(iArr);
            m2290B();
        }
    }

    /* renamed from: B */
    private boolean m2290B() {
        int length = this.f1957f.length;
        boolean z = length > 0;
        this.f1958g = z;
        if (z) {
            this.f1952a = 1;
            int[] iArr = this.f1957f;
            this.f1955d = (float) iArr[0];
            this.f1956e = (float) iArr[length - 1];
            this.f1954c = -1.0f;
        }
        return this.f1958g;
    }

    /* renamed from: C */
    private boolean m2291C(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1960i.getText();
        TransformationMethod transformationMethod = this.f1960i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1960i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1960i.getMaxLines() : -1;
        mo2474q(i);
        StaticLayout e = mo2468e(text, (Layout.Alignment) m2303r(this.f1960i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == text.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    /* renamed from: D */
    private boolean m2292D() {
        return !(this.f1960i instanceof C0444j);
    }

    /* renamed from: E */
    private void m2293E(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1952a = 1;
            this.f1955d = f;
            this.f1956e = f2;
            this.f1954c = f3;
            this.f1958g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private static <T> T m2294a(Object obj, String str, T t) {
        try {
            Field o = m2301o(str);
            return o == null ? t : o.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    /* renamed from: c */
    private int[] m2295c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: d */
    private void m2296d() {
        this.f1952a = 0;
        this.f1955d = -1.0f;
        this.f1956e = -1.0f;
        this.f1954c = -1.0f;
        this.f1957f = new int[0];
        this.f1953b = false;
    }

    /* renamed from: f */
    private StaticLayout m2297f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1959h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1960i.getLineSpacingExtra(), this.f1960i.getLineSpacingMultiplier()).setIncludePad(this.f1960i.getIncludeFontPadding()).setBreakStrategy(this.f1960i.getBreakStrategy()).setHyphenationFrequency(this.f1960i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1962k.mo2481a(obtain, this.f1960i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: g */
    private StaticLayout m2298g(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1959h, i, alignment, ((Float) m2294a(this.f1960i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) m2294a(this.f1960i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) m2294a(this.f1960i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    /* renamed from: h */
    private StaticLayout m2299h(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1959h, i, alignment, this.f1960i.getLineSpacingMultiplier(), this.f1960i.getLineSpacingExtra(), this.f1960i.getIncludeFontPadding());
    }

    /* renamed from: i */
    private int m2300i(RectF rectF) {
        int length = this.f1957f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m2291C(this.f1957f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1957f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: o */
    private static Field m2301o(String str) {
        try {
            Field field = f1951n.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1951n.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    /* renamed from: p */
    private static Method m2302p(String str) {
        try {
            Method method = f1950m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1950m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: r */
    static <T> T m2303r(Object obj, String str, T t) {
        try {
            return m2302p(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: x */
    private void m2304x(float f) {
        if (f != this.f1960i.getPaint().getTextSize()) {
            this.f1960i.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1960i.isInLayout() : false;
            if (this.f1960i.getLayout() != null) {
                this.f1953b = false;
                try {
                    Method p = m2302p("nullLayouts");
                    if (p != null) {
                        p.invoke(this.f1960i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1960i.requestLayout();
                } else {
                    this.f1960i.forceLayout();
                }
                this.f1960i.invalidate();
            }
        }
    }

    /* renamed from: z */
    private boolean m2305z() {
        if (!m2292D() || this.f1952a != 1) {
            this.f1953b = false;
        } else {
            if (!this.f1958g || this.f1957f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1956e - this.f1955d) / this.f1954c))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1955d + (((float) i) * this.f1954c));
                }
                this.f1957f = m2295c(iArr);
            }
            this.f1953b = true;
        }
        return this.f1953b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2467b() {
        if (mo2475s()) {
            if (this.f1953b) {
                if (this.f1960i.getMeasuredHeight() > 0 && this.f1960i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1962k.mo2482b(this.f1960i) ? 1048576 : (this.f1960i.getMeasuredWidth() - this.f1960i.getTotalPaddingLeft()) - this.f1960i.getTotalPaddingRight();
                    int height = (this.f1960i.getHeight() - this.f1960i.getCompoundPaddingBottom()) - this.f1960i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f1949l) {
                            f1949l.setEmpty();
                            f1949l.right = (float) measuredWidth;
                            f1949l.bottom = (float) height;
                            float i = (float) m2300i(f1949l);
                            if (i != this.f1960i.getTextSize()) {
                                mo2480y(0, i);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1953b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public StaticLayout mo2468e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 23 ? m2297f(charSequence, alignment, i, i2) : i3 >= 16 ? m2299h(charSequence, alignment, i) : m2298g(charSequence, alignment, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo2469j() {
        return Math.round(this.f1956e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2470k() {
        return Math.round(this.f1955d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2471l() {
        return Math.round(this.f1954c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int[] mo2472m() {
        return this.f1957f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo2473n() {
        return this.f1952a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2474q(int i) {
        TextPaint textPaint = this.f1959h;
        if (textPaint == null) {
            this.f1959h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1959h.set(this.f1960i.getPaint());
        this.f1959h.setTextSize((float) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo2475s() {
        return m2292D() && this.f1952a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2476t(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1961j.obtainStyledAttributes(attributeSet, C3132j.AppCompatTextView, i, 0);
        TextView textView = this.f1960i;
        C3403t.m14639g0(textView, textView.getContext(), C3132j.AppCompatTextView, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTextView_autoSizeTextType)) {
            this.f1952a = obtainStyledAttributes.getInt(C3132j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C3132j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C3132j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C3132j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C3132j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C3132j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C3132j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C3132j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C3132j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m2289A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m2292D()) {
            this.f1952a = 0;
        } else if (this.f1952a == 1) {
            if (!this.f1958g) {
                DisplayMetrics displayMetrics = this.f1961j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m2293E(dimension2, dimension3, dimension);
            }
            m2305z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2477u(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m2292D()) {
            DisplayMetrics displayMetrics = this.f1961j.getResources().getDisplayMetrics();
            m2293E(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m2305z()) {
                mo2467b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2478v(int[] iArr, int i) throws IllegalArgumentException {
        if (m2292D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1961j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1957f = m2295c(iArr2);
                if (!m2290B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1958g = false;
            }
            if (m2305z()) {
                mo2467b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2479w(int i) {
        if (!m2292D()) {
            return;
        }
        if (i == 0) {
            m2296d();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1961j.getResources().getDisplayMetrics();
            m2293E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m2305z()) {
                mo2467b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2480y(int i, float f) {
        Context context = this.f1961j;
        m2304x(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
