package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p086f.p087a.C3123a;
import p086f.p087a.C3126d;
import p086f.p087a.C3128f;
import p086f.p087a.C3129g;
import p086f.p087a.C3130h;
import p086f.p087a.C3132j;
import p086f.p087a.p094o.C3157c;
import p086f.p111h.p122m.C3403t;
import p086f.p124i.p125a.C3424a;
import p086f.p126j.p127a.C3430a;

public class SearchView extends C0431g0 implements C3157c {

    /* renamed from: v0 */
    static final C0387n f1424v0 = (Build.VERSION.SDK_INT < 29 ? new C0387n() : null);

    /* renamed from: A */
    final ImageView f1425A;

    /* renamed from: B */
    final ImageView f1426B;

    /* renamed from: C */
    private final View f1427C;

    /* renamed from: D */
    private C0390p f1428D;

    /* renamed from: E */
    private Rect f1429E;

    /* renamed from: F */
    private Rect f1430F;

    /* renamed from: G */
    private int[] f1431G;

    /* renamed from: H */
    private int[] f1432H;

    /* renamed from: I */
    private final ImageView f1433I;

    /* renamed from: J */
    private final Drawable f1434J;

    /* renamed from: K */
    private final int f1435K;

    /* renamed from: L */
    private final int f1436L;

    /* renamed from: M */
    private final Intent f1437M;

    /* renamed from: N */
    private final Intent f1438N;

    /* renamed from: O */
    private final CharSequence f1439O;

    /* renamed from: P */
    private C0385l f1440P;

    /* renamed from: Q */
    private C0384k f1441Q;

    /* renamed from: R */
    View.OnFocusChangeListener f1442R;

    /* renamed from: S */
    private C0386m f1443S;

    /* renamed from: T */
    private View.OnClickListener f1444T;

    /* renamed from: U */
    private boolean f1445U;

    /* renamed from: V */
    private boolean f1446V;

    /* renamed from: W */
    C3424a f1447W;

    /* renamed from: a0 */
    private boolean f1448a0;

    /* renamed from: b0 */
    private CharSequence f1449b0;

    /* renamed from: c0 */
    private boolean f1450c0;

    /* renamed from: d0 */
    private boolean f1451d0;

    /* renamed from: e0 */
    private int f1452e0;

    /* renamed from: f0 */
    private boolean f1453f0;

    /* renamed from: g0 */
    private CharSequence f1454g0;

    /* renamed from: h0 */
    private CharSequence f1455h0;

    /* renamed from: i0 */
    private boolean f1456i0;

    /* renamed from: j0 */
    private int f1457j0;

    /* renamed from: k0 */
    SearchableInfo f1458k0;

    /* renamed from: l0 */
    private Bundle f1459l0;

    /* renamed from: m0 */
    private final Runnable f1460m0;

    /* renamed from: n0 */
    private Runnable f1461n0;

    /* renamed from: o0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1462o0;

    /* renamed from: p0 */
    private final View.OnClickListener f1463p0;

    /* renamed from: q0 */
    View.OnKeyListener f1464q0;

    /* renamed from: r0 */
    private final TextView.OnEditorActionListener f1465r0;

    /* renamed from: s0 */
    private final AdapterView.OnItemClickListener f1466s0;

    /* renamed from: t0 */
    private final AdapterView.OnItemSelectedListener f1467t0;

    /* renamed from: u */
    final SearchAutoComplete f1468u;

    /* renamed from: u0 */
    private TextWatcher f1469u0;

    /* renamed from: v */
    private final View f1470v;

    /* renamed from: w */
    private final View f1471w;

    /* renamed from: x */
    private final View f1472x;

    /* renamed from: y */
    final ImageView f1473y;

    /* renamed from: z */
    final ImageView f1474z;

    public static class SearchAutoComplete extends C0419d {

        /* renamed from: i */
        private int f1475i;

        /* renamed from: j */
        private SearchView f1476j;

        /* renamed from: k */
        private boolean f1477k;

        /* renamed from: l */
        final Runnable f1478l;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0373a implements Runnable {
            C0373a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1725c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C3123a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1478l = new C0373a();
            this.f1475i = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1723a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1424v0.mo1758c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1724b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1725c() {
            if (this.f1477k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1477k = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1475i <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1477k) {
                removeCallbacks(this.f1478l);
                post(this.f1478l);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1476j.mo1689Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1476j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1476j.hasFocus() && getVisibility() == 0) {
                this.f1477k = true;
                if (SearchView.m1692M(getContext())) {
                    mo1723a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1477k = false;
                removeCallbacks(this.f1478l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1477k = false;
                removeCallbacks(this.f1478l);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1477k = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1476j = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1475i = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0374a implements TextWatcher {
        C0374a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1688Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0375b implements Runnable {
        C0375b() {
        }

        public void run() {
            SearchView.this.mo1693f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0376c implements Runnable {
        C0376c() {
        }

        public void run() {
            C3424a aVar = SearchView.this.f1447W;
            if (aVar instanceof C0466o0) {
                aVar.mo2302a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0377d implements View.OnFocusChangeListener {
        C0377d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1442R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0378e implements View.OnLayoutChangeListener {
        C0378e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1677B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0379f implements View.OnClickListener {
        C0379f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1473y) {
                searchView.mo1685V();
            } else if (view == searchView.f1425A) {
                searchView.mo1681R();
            } else if (view == searchView.f1474z) {
                searchView.mo1686W();
            } else if (view == searchView.f1426B) {
                searchView.mo1690a0();
            } else if (view == searchView.f1468u) {
                searchView.mo1678H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0380g implements View.OnKeyListener {
        C0380g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1458k0 == null) {
                return false;
            }
            if (searchView.f1468u.isPopupShowing() && SearchView.this.f1468u.getListSelection() != -1) {
                return SearchView.this.mo1687X(view, i, keyEvent);
            }
            if (SearchView.this.f1468u.mo1724b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1680P(0, (String) null, searchView2.f1468u.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0381h implements TextView.OnEditorActionListener {
        C0381h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1686W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0382i implements AdapterView.OnItemClickListener {
        C0382i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1682S(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0383j implements AdapterView.OnItemSelectedListener {
        C0383j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1683T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0384k {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0385l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0386m {
        /* renamed from: a */
        boolean mo1754a(int i);

        /* renamed from: b */
        boolean mo1755b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0387n {

        /* renamed from: a */
        private Method f1490a = null;

        /* renamed from: b */
        private Method f1491b = null;

        /* renamed from: c */
        private Method f1492c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0387n() {
            m1728d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1490a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1491b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1492c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1728d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1756a(AutoCompleteTextView autoCompleteTextView) {
            m1728d();
            Method method = this.f1491b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1757b(AutoCompleteTextView autoCompleteTextView) {
            m1728d();
            Method method = this.f1490a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1758c(AutoCompleteTextView autoCompleteTextView) {
            m1728d();
            Method method = this.f1492c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    static class C0388o extends C3430a {
        public static final Parcelable.Creator<C0388o> CREATOR = new C0389a();

        /* renamed from: h */
        boolean f1493h;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        class C0389a implements Parcelable.ClassLoaderCreator<C0388o> {
            C0389a() {
            }

            /* renamed from: a */
            public C0388o createFromParcel(Parcel parcel) {
                return new C0388o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0388o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0388o(parcel, classLoader);
            }

            /* renamed from: c */
            public C0388o[] newArray(int i) {
                return new C0388o[i];
            }
        }

        public C0388o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1493h = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C0388o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1493h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1493h));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0390p extends TouchDelegate {

        /* renamed from: a */
        private final View f1494a;

        /* renamed from: b */
        private final Rect f1495b = new Rect();

        /* renamed from: c */
        private final Rect f1496c = new Rect();

        /* renamed from: d */
        private final Rect f1497d = new Rect();

        /* renamed from: e */
        private final int f1498e;

        /* renamed from: f */
        private boolean f1499f;

        public C0390p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1498e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1767a(rect, rect2);
            this.f1494a = view;
        }

        /* renamed from: a */
        public void mo1767a(Rect rect, Rect rect2) {
            this.f1495b.set(rect);
            this.f1497d.set(rect);
            Rect rect3 = this.f1497d;
            int i = this.f1498e;
            rect3.inset(-i, -i);
            this.f1496c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f1499f
                r7.f1499f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f1499f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f1497d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f1495b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f1499f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f1496c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f1494a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f1494a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f1496c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f1494a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0390p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3123a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1429E = new Rect();
        this.f1430F = new Rect();
        this.f1431G = new int[2];
        this.f1432H = new int[2];
        this.f1460m0 = new C0375b();
        this.f1461n0 = new C0376c();
        this.f1462o0 = new WeakHashMap<>();
        this.f1463p0 = new C0379f();
        this.f1464q0 = new C0380g();
        this.f1465r0 = new C0381h();
        this.f1466s0 = new C0382i();
        this.f1467t0 = new C0383j();
        this.f1469u0 = new C0374a();
        C0479u0 v = C0479u0.m2148v(context, attributeSet, C3132j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(v.mo2356n(C3132j.SearchView_layout, C3129g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C3128f.search_src_text);
        this.f1468u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1470v = findViewById(C3128f.search_edit_frame);
        this.f1471w = findViewById(C3128f.search_plate);
        this.f1472x = findViewById(C3128f.submit_area);
        this.f1473y = (ImageView) findViewById(C3128f.search_button);
        this.f1474z = (ImageView) findViewById(C3128f.search_go_btn);
        this.f1425A = (ImageView) findViewById(C3128f.search_close_btn);
        this.f1426B = (ImageView) findViewById(C3128f.search_voice_btn);
        this.f1433I = (ImageView) findViewById(C3128f.search_mag_icon);
        C3403t.m14649l0(this.f1471w, v.mo2349g(C3132j.SearchView_queryBackground));
        C3403t.m14649l0(this.f1472x, v.mo2349g(C3132j.SearchView_submitBackground));
        this.f1473y.setImageDrawable(v.mo2349g(C3132j.SearchView_searchIcon));
        this.f1474z.setImageDrawable(v.mo2349g(C3132j.SearchView_goIcon));
        this.f1425A.setImageDrawable(v.mo2349g(C3132j.SearchView_closeIcon));
        this.f1426B.setImageDrawable(v.mo2349g(C3132j.SearchView_voiceIcon));
        this.f1433I.setImageDrawable(v.mo2349g(C3132j.SearchView_searchIcon));
        this.f1434J = v.mo2349g(C3132j.SearchView_searchHintIcon);
        C0496w0.m2250a(this.f1473y, getResources().getString(C3130h.abc_searchview_description_search));
        this.f1435K = v.mo2356n(C3132j.SearchView_suggestionRowLayout, C3129g.abc_search_dropdown_item_icons_2line);
        this.f1436L = v.mo2356n(C3132j.SearchView_commitIcon, 0);
        this.f1473y.setOnClickListener(this.f1463p0);
        this.f1425A.setOnClickListener(this.f1463p0);
        this.f1474z.setOnClickListener(this.f1463p0);
        this.f1426B.setOnClickListener(this.f1463p0);
        this.f1468u.setOnClickListener(this.f1463p0);
        this.f1468u.addTextChangedListener(this.f1469u0);
        this.f1468u.setOnEditorActionListener(this.f1465r0);
        this.f1468u.setOnItemClickListener(this.f1466s0);
        this.f1468u.setOnItemSelectedListener(this.f1467t0);
        this.f1468u.setOnKeyListener(this.f1464q0);
        this.f1468u.setOnFocusChangeListener(new C0377d());
        setIconifiedByDefault(v.mo2343a(C3132j.SearchView_iconifiedByDefault, true));
        int f = v.mo2348f(C3132j.SearchView_android_maxWidth, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f1439O = v.mo2358p(C3132j.SearchView_defaultQueryHint);
        this.f1449b0 = v.mo2358p(C3132j.SearchView_queryHint);
        int k = v.mo2353k(C3132j.SearchView_android_imeOptions, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo2353k(C3132j.SearchView_android_inputType, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo2343a(C3132j.SearchView_android_focusable, true));
        v.mo2362w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1437M = intent;
        intent.addFlags(268435456);
        this.f1437M.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1438N = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.f1468u.getDropDownAnchor());
        this.f1427C = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new C0378e());
        }
        m1703k0(this.f1445U);
        m1699g0();
    }

    /* renamed from: C */
    private Intent m1684C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1455h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1459l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1458k0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m1685D(Cursor cursor, int i, String str) {
        int i2;
        String o;
        try {
            String o2 = C0466o0.m2107o(cursor, "suggest_intent_action");
            if (o2 == null) {
                o2 = this.f1458k0.getSuggestIntentAction();
            }
            if (o2 == null) {
                o2 = "android.intent.action.SEARCH";
            }
            String str2 = o2;
            String o3 = C0466o0.m2107o(cursor, "suggest_intent_data");
            if (o3 == null) {
                o3 = this.f1458k0.getSuggestIntentData();
            }
            if (!(o3 == null || (o = C0466o0.m2107o(cursor, "suggest_intent_data_id")) == null)) {
                o3 = o3 + "/" + Uri.encode(o);
            }
            return m1684C(str2, o3 == null ? null : Uri.parse(o3), C0466o0.m2107o(cursor, "suggest_intent_extra_data"), C0466o0.m2107o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m1686E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1459l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m1687F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m1688G() {
        this.f1468u.dismissDropDown();
    }

    /* renamed from: I */
    private void m1689I(View view, Rect rect) {
        view.getLocationInWindow(this.f1431G);
        getLocationInWindow(this.f1432H);
        int[] iArr = this.f1431G;
        int i = iArr[1];
        int[] iArr2 = this.f1432H;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m1690J(CharSequence charSequence) {
        if (!this.f1445U || this.f1434J == null) {
            return charSequence;
        }
        double textSize = (double) this.f1468u.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f1434J.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1434J), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m1691K() {
        SearchableInfo searchableInfo = this.f1458k0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1458k0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1437M;
        } else if (this.f1458k0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1438N;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m1692M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m1693N() {
        return (this.f1448a0 || this.f1453f0) && !mo1679L();
    }

    /* renamed from: O */
    private void m1694O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m1695Q(int i, int i2, String str) {
        Cursor b = this.f1447W.mo11744b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m1694O(m1685D(b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m1696b0() {
        post(this.f1460m0);
    }

    /* renamed from: c0 */
    private void m1697c0(int i) {
        CharSequence c;
        Editable text = this.f1468u.getText();
        Cursor b = this.f1447W.mo11744b();
        if (b != null) {
            if (!b.moveToPosition(i) || (c = this.f1447W.mo2303c(b)) == null) {
                setQuery(text);
            } else {
                setQuery(c);
            }
        }
    }

    /* renamed from: e0 */
    private void m1698e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1468u.getText());
        int i = 0;
        if (!z2 && (!this.f1445U || this.f1456i0)) {
            z = false;
        }
        ImageView imageView = this.f1425A;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1425A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m1699g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1468u;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(m1690J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C3126d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C3126d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m1700h0() {
        this.f1468u.setThreshold(this.f1458k0.getSuggestThreshold());
        this.f1468u.setImeOptions(this.f1458k0.getImeOptions());
        int inputType = this.f1458k0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1458k0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1468u.setInputType(inputType);
        C3424a aVar = this.f1447W;
        if (aVar != null) {
            aVar.mo2302a((Cursor) null);
        }
        if (this.f1458k0.getSuggestAuthority() != null) {
            C0466o0 o0Var = new C0466o0(getContext(), this, this.f1458k0, this.f1462o0);
            this.f1447W = o0Var;
            this.f1468u.setAdapter(o0Var);
            C0466o0 o0Var2 = (C0466o0) this.f1447W;
            if (this.f1450c0) {
                i = 2;
            }
            o0Var2.mo2315x(i);
        }
    }

    /* renamed from: i0 */
    private void m1701i0() {
        this.f1472x.setVisibility((!m1693N() || !(this.f1474z.getVisibility() == 0 || this.f1426B.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m1702j0(boolean z) {
        this.f1474z.setVisibility((!this.f1448a0 || !m1693N() || !hasFocus() || (!z && this.f1453f0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m1703k0(boolean z) {
        this.f1446V = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1468u.getText());
        this.f1473y.setVisibility(i2);
        m1702j0(z2);
        this.f1470v.setVisibility(z ? 8 : 0);
        if (this.f1433I.getDrawable() == null || this.f1445U) {
            i = 8;
        }
        this.f1433I.setVisibility(i);
        m1698e0();
        m1704l0(!z2);
        m1701i0();
    }

    /* renamed from: l0 */
    private void m1704l0(boolean z) {
        int i = 8;
        if (this.f1453f0 && !mo1679L() && z) {
            this.f1474z.setVisibility(8);
            i = 0;
        }
        this.f1426B.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1468u.setText(charSequence);
        this.f1468u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1677B() {
        if (this.f1427C.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1471w.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0404a1.m1828b(this);
            int dimensionPixelSize = this.f1445U ? resources.getDimensionPixelSize(C3126d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C3126d.abc_dropdownitem_text_padding_left) : 0;
            this.f1468u.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f1468u.setDropDownHorizontalOffset(b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f1468u.setDropDownWidth((((this.f1427C.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1678H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1468u.refreshAutoCompleteResults();
            return;
        }
        f1424v0.mo1757b(this.f1468u);
        f1424v0.mo1756a(this.f1468u);
    }

    /* renamed from: L */
    public boolean mo1679L() {
        return this.f1446V;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1680P(int i, String str, String str2) {
        getContext().startActivity(m1684C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1681R() {
        if (!TextUtils.isEmpty(this.f1468u.getText())) {
            this.f1468u.setText(BuildConfig.FLAVOR);
            this.f1468u.requestFocus();
            this.f1468u.setImeVisibility(true);
        } else if (this.f1445U) {
            C0384k kVar = this.f1441Q;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                m1703k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1682S(int i, int i2, String str) {
        C0386m mVar = this.f1443S;
        if (mVar != null && mVar.mo1755b(i)) {
            return false;
        }
        m1695Q(i, 0, (String) null);
        this.f1468u.setImeVisibility(false);
        m1688G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1683T(int i) {
        C0386m mVar = this.f1443S;
        if (mVar != null && mVar.mo1754a(i)) {
            return false;
        }
        m1697c0(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1684U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1685V() {
        m1703k0(false);
        this.f1468u.requestFocus();
        this.f1468u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1444T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1686W() {
        Editable text = this.f1468u.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0385l lVar = this.f1440P;
            if (lVar == null || !lVar.onQueryTextSubmit(text.toString())) {
                if (this.f1458k0 != null) {
                    mo1680P(0, (String) null, text.toString());
                }
                this.f1468u.setImeVisibility(false);
                m1688G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1687X(View view, int i, KeyEvent keyEvent) {
        if (this.f1458k0 != null && this.f1447W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1682S(this.f1468u.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f1468u.setSelection(i == 21 ? 0 : this.f1468u.length());
                this.f1468u.setListSelection(0);
                this.f1468u.clearListSelection();
                this.f1468u.mo1723a();
                return true;
            } else if (i != 19 || this.f1468u.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1688Y(CharSequence charSequence) {
        Editable text = this.f1468u.getText();
        this.f1455h0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1702j0(z);
        m1704l0(!z);
        m1698e0();
        m1701i0();
        if (this.f1440P != null && !TextUtils.equals(charSequence, this.f1454g0)) {
            this.f1440P.onQueryTextChange(charSequence.toString());
        }
        this.f1454g0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1689Z() {
        m1703k0(mo1679L());
        m1696b0();
        if (this.f1468u.hasFocus()) {
            mo1678H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1690a0() {
        Intent E;
        SearchableInfo searchableInfo = this.f1458k0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    E = m1687F(this.f1437M, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    E = m1686E(this.f1438N, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(E);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: c */
    public void mo1400c() {
        if (!this.f1456i0) {
            this.f1456i0 = true;
            int imeOptions = this.f1468u.getImeOptions();
            this.f1457j0 = imeOptions;
            this.f1468u.setImeOptions(imeOptions | 33554432);
            this.f1468u.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f1451d0 = true;
        super.clearFocus();
        this.f1468u.clearFocus();
        this.f1468u.setImeVisibility(false);
        this.f1451d0 = false;
    }

    /* renamed from: d0 */
    public void mo1692d0(CharSequence charSequence, boolean z) {
        this.f1468u.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1468u;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1455h0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1686W();
        }
    }

    /* renamed from: f */
    public void mo1401f() {
        mo1692d0(BuildConfig.FLAVOR, false);
        clearFocus();
        m1703k0(true);
        this.f1468u.setImeOptions(this.f1457j0);
        this.f1456i0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1693f0() {
        int[] iArr = this.f1468u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1471w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1472x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1468u.getImeOptions();
    }

    public int getInputType() {
        return this.f1468u.getInputType();
    }

    public int getMaxWidth() {
        return this.f1452e0;
    }

    public CharSequence getQuery() {
        return this.f1468u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1449b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1458k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1439O : getContext().getText(this.f1458k0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1436L;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1435K;
    }

    public C3424a getSuggestionsAdapter() {
        return this.f1447W;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1460m0);
        post(this.f1461n0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1689I(this.f1468u, this.f1429E);
            Rect rect = this.f1430F;
            Rect rect2 = this.f1429E;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0390p pVar = this.f1428D;
            if (pVar == null) {
                C0390p pVar2 = new C0390p(this.f1430F, this.f1429E, this.f1468u);
                this.f1428D = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo1767a(this.f1430F, this.f1429E);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo1679L()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f1452e0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f1452e0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f1452e0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0388o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0388o oVar = (C0388o) parcelable;
        super.onRestoreInstanceState(oVar.mo11760a());
        m1703k0(oVar.f1493h);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0388o oVar = new C0388o(super.onSaveInstanceState());
        oVar.f1493h = mo1679L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1696b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1451d0 || !isFocusable()) {
            return false;
        }
        if (mo1679L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1468u.requestFocus(i, rect);
        if (requestFocus) {
            m1703k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1459l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1681R();
        } else {
            mo1685V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1445U != z) {
            this.f1445U = z;
            m1703k0(z);
            m1699g0();
        }
    }

    public void setImeOptions(int i) {
        this.f1468u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1468u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1452e0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0384k kVar) {
        this.f1441Q = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1442R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0385l lVar) {
        this.f1440P = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1444T = onClickListener;
    }

    public void setOnSuggestionListener(C0386m mVar) {
        this.f1443S = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1449b0 = charSequence;
        m1699g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1450c0 = z;
        C3424a aVar = this.f1447W;
        if (aVar instanceof C0466o0) {
            ((C0466o0) aVar).mo2315x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1458k0 = searchableInfo;
        if (searchableInfo != null) {
            m1700h0();
            m1699g0();
        }
        boolean K = m1691K();
        this.f1453f0 = K;
        if (K) {
            this.f1468u.setPrivateImeOptions("nm");
        }
        m1703k0(mo1679L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1448a0 = z;
        m1703k0(mo1679L());
    }

    public void setSuggestionsAdapter(C3424a aVar) {
        this.f1447W = aVar;
        this.f1468u.setAdapter(aVar);
    }
}
