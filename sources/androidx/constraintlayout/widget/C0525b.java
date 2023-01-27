package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0525b {

    /* renamed from: a */
    String f2113a;

    /* renamed from: b */
    private C0527b f2114b;

    /* renamed from: c */
    private int f2115c;

    /* renamed from: d */
    private float f2116d;

    /* renamed from: e */
    private String f2117e;

    /* renamed from: f */
    boolean f2118f;

    /* renamed from: g */
    private int f2119g;

    /* renamed from: androidx.constraintlayout.widget.b$a */
    static /* synthetic */ class C0526a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2120a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.b$b[] r0 = androidx.constraintlayout.widget.C0525b.C0527b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2120a = r0
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2120a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2120a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2120a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2120a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2120a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2120a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.b$b r1 = androidx.constraintlayout.widget.C0525b.C0527b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0525b.C0526a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    public enum C0527b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0525b(C0525b bVar, Object obj) {
        this.f2113a = bVar.f2113a;
        this.f2114b = bVar.f2114b;
        mo2624d(obj);
    }

    public C0525b(String str, C0527b bVar, Object obj) {
        this.f2113a = str;
        this.f2114b = bVar;
        mo2624d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0525b> m2459a(HashMap<String, C0525b> hashMap, View view) {
        C0525b bVar;
        HashMap<String, C0525b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0525b bVar2 = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    bVar = new C0525b(bVar2, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()));
                } else {
                    bVar = new C0525b(bVar2, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0]));
                }
                hashMap2.put(next, bVar);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m2460b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0525b> hashMap) {
        C0527b bVar;
        Object string;
        int integer;
        C0527b bVar2;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0544k.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0527b bVar3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0544k.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C0544k.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = C0527b.BOOLEAN_TYPE;
            } else {
                if (index == C0544k.CustomAttribute_customColorValue) {
                    bVar = C0527b.COLOR_TYPE;
                } else if (index == C0544k.CustomAttribute_customColorDrawableValue) {
                    bVar = C0527b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C0544k.CustomAttribute_customPixelDimension) {
                        bVar2 = C0527b.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C0544k.CustomAttribute_customDimension) {
                        bVar2 = C0527b.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C0544k.CustomAttribute_customFloatValue) {
                        bVar2 = C0527b.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == C0544k.CustomAttribute_customIntegerValue) {
                        bVar = C0527b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        bVar3 = bVar;
                        obj = obj2;
                    } else if (index == C0544k.CustomAttribute_customStringValue) {
                        bVar = C0527b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        bVar3 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    bVar3 = bVar;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                bVar3 = bVar;
                obj = obj2222;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C0525b(str, bVar3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m2461c(View view, HashMap<String, C0525b> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            C0525b bVar = hashMap.get(next);
            String str = "set" + next;
            try {
                switch (C0526a.f2120a[bVar.f2114b.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f2119g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f2119g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(bVar.f2115c)});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.f2116d)});
                        break;
                    case 5:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{bVar.f2117e});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(bVar.f2118f)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(bVar.f2116d)});
                        break;
                }
            } catch (NoSuchMethodException e) {
                Log.e("TransitionLayout", e.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e2) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void mo2624d(Object obj) {
        switch (C0526a.f2120a[this.f2114b.ordinal()]) {
            case 1:
            case 2:
                this.f2119g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f2115c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f2116d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f2117e = (String) obj;
                return;
            case 6:
                this.f2118f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
