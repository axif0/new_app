package p086f.p111h.p122m.p123c0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p086f.p111h.C3265c;
import p086f.p111h.p122m.p123c0.C3377f;

/* renamed from: f.h.m.c0.c */
public class C3369c {

    /* renamed from: d */
    private static int f10667d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f10668a;

    /* renamed from: b */
    public int f10669b = -1;

    /* renamed from: c */
    private int f10670c = -1;

    /* renamed from: f.h.m.c0.c$a */
    public static class C3370a {

        /* renamed from: e */
        public static final C3370a f10671e = new C3370a(1, (CharSequence) null);

        /* renamed from: f */
        public static final C3370a f10672f = new C3370a(2, (CharSequence) null);

        /* renamed from: g */
        public static final C3370a f10673g = new C3370a(16, (CharSequence) null);

        /* renamed from: h */
        public static final C3370a f10674h = new C3370a(4096, (CharSequence) null);

        /* renamed from: i */
        public static final C3370a f10675i = new C3370a(8192, (CharSequence) null);

        /* renamed from: j */
        public static final C3370a f10676j = new C3370a(262144, (CharSequence) null);

        /* renamed from: k */
        public static final C3370a f10677k = new C3370a(524288, (CharSequence) null);

        /* renamed from: l */
        public static final C3370a f10678l = new C3370a(1048576, (CharSequence) null);

        /* renamed from: m */
        public static final C3370a f10679m = new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);

        /* renamed from: n */
        public static final C3370a f10680n = new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);

        /* renamed from: a */
        final Object f10681a;

        /* renamed from: b */
        private final int f10682b;

        /* renamed from: c */
        private final Class<? extends C3377f.C3378a> f10683c;

        /* renamed from: d */
        protected final C3377f f10684d;

        static {
            Class<C3377f.C3380c> cls = C3377f.C3380c.class;
            Class<C3377f.C3379b> cls2 = C3377f.C3379b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new C3370a(4, (CharSequence) null);
            new C3370a(8, (CharSequence) null);
            new C3370a(32, (CharSequence) null);
            new C3370a(64, (CharSequence) null);
            new C3370a(128, (CharSequence) null);
            new C3370a(256, (CharSequence) null, cls2);
            new C3370a(512, (CharSequence) null, cls2);
            new C3370a(1024, (CharSequence) null, cls);
            new C3370a(2048, (CharSequence) null, cls);
            new C3370a(16384, (CharSequence) null);
            new C3370a(32768, (CharSequence) null);
            new C3370a(65536, (CharSequence) null);
            new C3370a(131072, (CharSequence) null, C3377f.C3384g.class);
            new C3370a(2097152, (CharSequence) null, C3377f.C3385h.class);
            new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (C3377f) null, C3377f.C3382e.class);
            new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            new C3370a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (C3377f) null, C3377f.C3383f.class);
            new C3370a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (C3377f) null, C3377f.C3381d.class);
            new C3370a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new C3370a(accessibilityAction, 16908357, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
        }

        public C3370a(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
        }

        private C3370a(int i, CharSequence charSequence, Class<? extends C3377f.C3378a> cls) {
            this((Object) null, i, charSequence, (C3377f) null, cls);
        }

        C3370a(Object obj) {
            this(obj, 0, (CharSequence) null, (C3377f) null, (Class<? extends C3377f.C3378a>) null);
        }

        C3370a(Object obj, int i, CharSequence charSequence, C3377f fVar, Class<? extends C3377f.C3378a> cls) {
            this.f10682b = i;
            this.f10684d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f10681a = obj;
            this.f10683c = cls;
        }

        /* renamed from: a */
        public C3370a mo11664a(CharSequence charSequence, C3377f fVar) {
            return new C3370a((Object) null, this.f10682b, charSequence, fVar, this.f10683c);
        }

        /* renamed from: b */
        public int mo11665b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f10681a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo11666c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f10681a).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo11667d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                f.h.m.c0.f r0 = r4.f10684d
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends f.h.m.c0.f$a> r2 = r4.f10683c
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                f.h.m.c0.f$a r1 = (p086f.p111h.p122m.p123c0.C3377f.C3378a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo11684a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends f.h.m.c0.f$a> r1 = r4.f10683c
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                f.h.m.c0.f r6 = r4.f10684d
                boolean r5 = r6.mo7550a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p122m.p123c0.C3369c.C3370a.mo11667d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C3370a)) {
                return false;
            }
            Object obj2 = this.f10681a;
            Object obj3 = ((C3370a) obj).f10681a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f10681a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: f.h.m.c0.c$b */
    public static class C3371b {

        /* renamed from: a */
        final Object f10685a;

        C3371b(Object obj) {
            this.f10685a = obj;
        }

        /* renamed from: a */
        public static C3371b m14525a(int i, int i2, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new C3371b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C3371b((Object) null);
        }

        /* renamed from: b */
        public static C3371b m14526b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C3371b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C3371b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C3371b((Object) null);
        }
    }

    /* renamed from: f.h.m.c0.c$c */
    public static class C3372c {

        /* renamed from: a */
        final Object f10686a;

        C3372c(Object obj) {
            this.f10686a = obj;
        }

        /* renamed from: f */
        public static C3372c m14527f(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C3372c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C3372c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C3372c((Object) null);
        }

        /* renamed from: a */
        public int mo11670a() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10686a).getColumnIndex();
            }
            return 0;
        }

        /* renamed from: b */
        public int mo11671b() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10686a).getColumnSpan();
            }
            return 0;
        }

        /* renamed from: c */
        public int mo11672c() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10686a).getRowIndex();
            }
            return 0;
        }

        /* renamed from: d */
        public int mo11673d() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10686a).getRowSpan();
            }
            return 0;
        }

        /* renamed from: e */
        public boolean mo11674e() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10686a).isSelected();
            }
            return false;
        }
    }

    private C3369c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f10668a = accessibilityNodeInfo;
    }

    /* renamed from: A */
    private int m14439A(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f10667d;
        f10667d = i2 + 1;
        return i2;
    }

    /* renamed from: D0 */
    public static C3369c m14440D0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3369c(accessibilityNodeInfo);
    }

    /* renamed from: O */
    public static C3369c m14441O() {
        return m14440D0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: P */
    public static C3369c m14442P(View view) {
        return m14440D0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: Q */
    public static C3369c m14443Q(C3369c cVar) {
        return m14440D0(AccessibilityNodeInfo.obtain(cVar.f10668a));
    }

    /* renamed from: U */
    private void m14444U(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = m14453w(view);
        if (w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < w.size(); i++) {
                if (w.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                w.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: W */
    private void m14445W(int i, boolean z) {
        Bundle t = mo11652t();
        if (t != null) {
            int i2 = t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            t.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m14446e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m14447g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f10668a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f10668a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f10668a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f10668a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m14448h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f10668a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f10668a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m14449j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m14450l(int i) {
        Bundle t = mo11652t();
        return t != null && (t.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: q */
    public static ClickableSpan[] m14451q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m14452u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w = m14453w(view);
        if (w != null) {
            return w;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C3265c.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: w */
    private SparseArray<WeakReference<ClickableSpan>> m14453w(View view) {
        return (SparseArray) view.getTag(C3265c.tag_accessibility_clickable_spans);
    }

    /* renamed from: z */
    private boolean m14454z() {
        return !m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: A0 */
    public void mo11595A0(CharSequence charSequence) {
        this.f10668a.setText(charSequence);
    }

    /* renamed from: B */
    public boolean mo11596B() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f10668a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: B0 */
    public void mo11597B0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f10668a.setVisibleToUser(z);
        }
    }

    /* renamed from: C */
    public boolean mo11598C() {
        return this.f10668a.isCheckable();
    }

    /* renamed from: C0 */
    public AccessibilityNodeInfo mo11599C0() {
        return this.f10668a;
    }

    /* renamed from: D */
    public boolean mo11600D() {
        return this.f10668a.isChecked();
    }

    /* renamed from: E */
    public boolean mo11601E() {
        return this.f10668a.isClickable();
    }

    /* renamed from: F */
    public boolean mo11602F() {
        return this.f10668a.isEnabled();
    }

    /* renamed from: G */
    public boolean mo11603G() {
        return this.f10668a.isFocusable();
    }

    /* renamed from: H */
    public boolean mo11604H() {
        return this.f10668a.isFocused();
    }

    /* renamed from: I */
    public boolean mo11605I() {
        return this.f10668a.isLongClickable();
    }

    /* renamed from: J */
    public boolean mo11606J() {
        return this.f10668a.isPassword();
    }

    /* renamed from: K */
    public boolean mo11607K() {
        return this.f10668a.isScrollable();
    }

    /* renamed from: L */
    public boolean mo11608L() {
        return this.f10668a.isSelected();
    }

    /* renamed from: M */
    public boolean mo11609M() {
        return Build.VERSION.SDK_INT >= 26 ? this.f10668a.isShowingHintText() : m14450l(4);
    }

    /* renamed from: N */
    public boolean mo11610N() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f10668a.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: R */
    public boolean mo11611R(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f10668a.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: S */
    public void mo11612S() {
        this.f10668a.recycle();
    }

    /* renamed from: T */
    public boolean mo11613T(C3370a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f10668a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f10681a);
        }
        return false;
    }

    /* renamed from: V */
    public void mo11614V(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f10668a.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: X */
    public void mo11615X(Rect rect) {
        this.f10668a.setBoundsInParent(rect);
    }

    /* renamed from: Y */
    public void mo11616Y(Rect rect) {
        this.f10668a.setBoundsInScreen(rect);
    }

    /* renamed from: Z */
    public void mo11617Z(boolean z) {
        this.f10668a.setCheckable(z);
    }

    /* renamed from: a */
    public void mo11618a(int i) {
        this.f10668a.addAction(i);
    }

    /* renamed from: a0 */
    public void mo11619a0(boolean z) {
        this.f10668a.setChecked(z);
    }

    /* renamed from: b */
    public void mo11620b(C3370a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10668a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f10681a);
        }
    }

    /* renamed from: b0 */
    public void mo11621b0(CharSequence charSequence) {
        this.f10668a.setClassName(charSequence);
    }

    /* renamed from: c */
    public void mo11622c(View view) {
        this.f10668a.addChild(view);
    }

    /* renamed from: c0 */
    public void mo11623c0(boolean z) {
        this.f10668a.setClickable(z);
    }

    /* renamed from: d */
    public void mo11624d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f10668a.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void mo11625d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f10668a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C3371b) obj).f10685a);
        }
    }

    /* renamed from: e0 */
    public void mo11626e0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f10668a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C3372c) obj).f10686a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3369c)) {
            return false;
        }
        C3369c cVar = (C3369c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10668a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f10668a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f10668a)) {
            return false;
        }
        return this.f10670c == cVar.f10670c && this.f10669b == cVar.f10669b;
    }

    /* renamed from: f */
    public void mo11628f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m14447g();
            m14444U(view);
            ClickableSpan[] q = m14451q(charSequence);
            if (q != null && q.length > 0) {
                mo11652t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C3265c.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> u = m14452u(view);
                int i2 = 0;
                while (q != null && i2 < q.length) {
                    int A = m14439A(q[i2], u);
                    u.put(A, new WeakReference(q[i2]));
                    m14446e(q[i2], (Spanned) charSequence, A);
                    i2++;
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo11629f0(CharSequence charSequence) {
        this.f10668a.setContentDescription(charSequence);
    }

    /* renamed from: g0 */
    public void mo11630g0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f10668a.setDismissable(z);
        }
    }

    /* renamed from: h0 */
    public void mo11631h0(boolean z) {
        this.f10668a.setEnabled(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10668a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C3370a> mo11633i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f10668a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3370a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void mo11634i0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10668a.setError(charSequence);
        }
    }

    /* renamed from: j0 */
    public void mo11635j0(boolean z) {
        this.f10668a.setFocusable(z);
    }

    /* renamed from: k */
    public int mo11636k() {
        return this.f10668a.getActions();
    }

    /* renamed from: k0 */
    public void mo11637k0(boolean z) {
        this.f10668a.setFocused(z);
    }

    /* renamed from: l0 */
    public void mo11638l0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10668a.setHeading(z);
        } else {
            m14445W(2, z);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void mo11639m(Rect rect) {
        this.f10668a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void mo11640m0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f10668a.setHintText(charSequence);
        } else if (i >= 19) {
            this.f10668a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: n */
    public void mo11641n(Rect rect) {
        this.f10668a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void mo11642n0(boolean z) {
        this.f10668a.setLongClickable(z);
    }

    /* renamed from: o */
    public int mo11643o() {
        return this.f10668a.getChildCount();
    }

    /* renamed from: o0 */
    public void mo11644o0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10668a.setMaxTextLength(i);
        }
    }

    /* renamed from: p */
    public CharSequence mo11645p() {
        return this.f10668a.getClassName();
    }

    /* renamed from: p0 */
    public void mo11646p0(CharSequence charSequence) {
        this.f10668a.setPackageName(charSequence);
    }

    /* renamed from: q0 */
    public void mo11647q0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f10668a.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f10668a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: r */
    public C3372c mo11648r() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f10668a.getCollectionItemInfo()) == null) {
            return null;
        }
        return new C3372c(collectionItemInfo);
    }

    /* renamed from: r0 */
    public void mo11649r0(View view) {
        this.f10669b = -1;
        this.f10668a.setParent(view);
    }

    /* renamed from: s */
    public CharSequence mo11650s() {
        return this.f10668a.getContentDescription();
    }

    /* renamed from: s0 */
    public void mo11651s0(View view, int i) {
        this.f10669b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f10668a.setParent(view, i);
        }
    }

    /* renamed from: t */
    public Bundle mo11652t() {
        return Build.VERSION.SDK_INT >= 19 ? this.f10668a.getExtras() : new Bundle();
    }

    /* renamed from: t0 */
    public void mo11653t0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f10668a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo11639m(rect);
        sb.append("; boundsInParent: " + rect);
        mo11641n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo11656v());
        sb.append("; className: ");
        sb.append(mo11645p());
        sb.append("; text: ");
        sb.append(mo11659x());
        sb.append("; contentDescription: ");
        sb.append(mo11650s());
        sb.append("; viewId: ");
        sb.append(mo11661y());
        sb.append("; checkable: ");
        sb.append(mo11598C());
        sb.append("; checked: ");
        sb.append(mo11600D());
        sb.append("; focusable: ");
        sb.append(mo11603G());
        sb.append("; focused: ");
        sb.append(mo11604H());
        sb.append("; selected: ");
        sb.append(mo11608L());
        sb.append("; clickable: ");
        sb.append(mo11601E());
        sb.append("; longClickable: ");
        sb.append(mo11605I());
        sb.append("; enabled: ");
        sb.append(mo11602F());
        sb.append("; password: ");
        sb.append(mo11606J());
        sb.append("; scrollable: " + mo11607K());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C3370a> i = mo11633i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C3370a aVar = i.get(i2);
                String j = m14449j(aVar.mo11665b());
                if (j.equals("ACTION_UNKNOWN") && aVar.mo11666c() != null) {
                    j = aVar.mo11666c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = mo11636k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= numberOfTrailingZeros ^ -1;
                sb.append(m14449j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public void mo11655u0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10668a.setScreenReaderFocusable(z);
        } else {
            m14445W(1, z);
        }
    }

    /* renamed from: v */
    public CharSequence mo11656v() {
        return this.f10668a.getPackageName();
    }

    /* renamed from: v0 */
    public void mo11657v0(boolean z) {
        this.f10668a.setScrollable(z);
    }

    /* renamed from: w0 */
    public void mo11658w0(boolean z) {
        this.f10668a.setSelected(z);
    }

    /* renamed from: x */
    public CharSequence mo11659x() {
        if (!m14454z()) {
            return this.f10668a.getText();
        }
        List<Integer> h = m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = m14448h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f10668a.getText(), 0, this.f10668a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C3367a(h4.get(i).intValue(), this, mo11652t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: x0 */
    public void mo11660x0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f10668a.setShowingHintText(z);
        } else {
            m14445W(4, z);
        }
    }

    /* renamed from: y */
    public String mo11661y() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f10668a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: y0 */
    public void mo11662y0(View view) {
        this.f10670c = -1;
        this.f10668a.setSource(view);
    }

    /* renamed from: z0 */
    public void mo11663z0(View view, int i) {
        this.f10670c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f10668a.setSource(view, i);
        }
    }
}
