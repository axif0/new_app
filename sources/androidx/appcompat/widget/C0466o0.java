package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.karumi.dexter.BuildConfig;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p086f.p087a.C3123a;
import p086f.p087a.C3128f;
import p086f.p111h.p112e.C3267a;
import p086f.p124i.p125a.C3429c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.o0 */
class C0466o0 extends C3429c implements View.OnClickListener {

    /* renamed from: A */
    private int f1812A = -1;

    /* renamed from: B */
    private int f1813B = -1;

    /* renamed from: C */
    private int f1814C = -1;

    /* renamed from: D */
    private int f1815D = -1;

    /* renamed from: q */
    private final SearchView f1816q;

    /* renamed from: r */
    private final SearchableInfo f1817r;

    /* renamed from: s */
    private final Context f1818s;

    /* renamed from: t */
    private final WeakHashMap<String, Drawable.ConstantState> f1819t;

    /* renamed from: u */
    private final int f1820u;

    /* renamed from: v */
    private boolean f1821v = false;

    /* renamed from: w */
    private int f1822w = 1;

    /* renamed from: x */
    private ColorStateList f1823x;

    /* renamed from: y */
    private int f1824y = -1;

    /* renamed from: z */
    private int f1825z = -1;

    /* renamed from: androidx.appcompat.widget.o0$a */
    private static final class C0467a {

        /* renamed from: a */
        public final TextView f1826a;

        /* renamed from: b */
        public final TextView f1827b;

        /* renamed from: c */
        public final ImageView f1828c;

        /* renamed from: d */
        public final ImageView f1829d;

        /* renamed from: e */
        public final ImageView f1830e;

        public C0467a(View view) {
            this.f1826a = (TextView) view.findViewById(16908308);
            this.f1827b = (TextView) view.findViewById(16908309);
            this.f1828c = (ImageView) view.findViewById(16908295);
            this.f1829d = (ImageView) view.findViewById(16908296);
            this.f1830e = (ImageView) view.findViewById(C3128f.edit_query);
        }
    }

    public C0466o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1816q = searchView;
        this.f1817r = searchableInfo;
        this.f1820u = searchView.getSuggestionCommitIconResId();
        this.f1818s = context;
        this.f1819t = weakHashMap;
    }

    /* renamed from: A */
    private void m2101A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1819t.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m2102B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: k */
    private Drawable m2103k(String str) {
        Drawable.ConstantState constantState = this.f1819t.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m2104l(CharSequence charSequence) {
        if (this.f1823x == null) {
            TypedValue typedValue = new TypedValue();
            this.f10738i.getTheme().resolveAttribute(C3123a.textColorSearchUrl, typedValue, true);
            this.f1823x = this.f10738i.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1823x, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m2105m(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f10738i.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: n */
    private Drawable m2106n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1819t.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1819t.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1818s.getResources());
        }
        Drawable m = m2105m(componentName);
        if (m != null) {
            constantState = m.getConstantState();
        }
        this.f1819t.put(flattenToShortString, constantState);
        return m;
    }

    /* renamed from: o */
    public static String m2107o(Cursor cursor, String str) {
        return m2113w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m2108p() {
        Drawable n = m2106n(this.f1817r.getSearchActivity());
        return n != null ? n : this.f10738i.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2109q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo2313r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1818s     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0466o0.m2109q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    private Drawable m2110s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1818s.getPackageName() + "/" + parseInt;
            Drawable k = m2103k(str2);
            if (k != null) {
                return k;
            }
            Drawable f = C3267a.m14076f(this.f1818s, parseInt);
            m2101A(str2, f);
            return f;
        } catch (NumberFormatException unused) {
            Drawable k2 = m2103k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = m2109q(Uri.parse(str));
            m2101A(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: t */
    private Drawable m2111t(Cursor cursor) {
        int i = this.f1813B;
        if (i == -1) {
            return null;
        }
        Drawable s = m2110s(cursor.getString(i));
        return s != null ? s : m2108p();
    }

    /* renamed from: u */
    private Drawable m2112u(Cursor cursor) {
        int i = this.f1814C;
        if (i == -1) {
            return null;
        }
        return m2110s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m2113w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m2114y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m2115z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    public void mo2302a(Cursor cursor) {
        if (this.f1821v) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2302a(cursor);
            if (cursor != null) {
                this.f1824y = cursor.getColumnIndex("suggest_text_1");
                this.f1825z = cursor.getColumnIndex("suggest_text_2");
                this.f1812A = cursor.getColumnIndex("suggest_text_2_url");
                this.f1813B = cursor.getColumnIndex("suggest_icon_1");
                this.f1814C = cursor.getColumnIndex("suggest_icon_2");
                this.f1815D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: c */
    public CharSequence mo2303c(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = m2107o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.f1817r.shouldRewriteQueryFromData() && (o2 = m2107o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.f1817r.shouldRewriteQueryFromText() || (o = m2107o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    /* renamed from: d */
    public Cursor mo2304d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f1816q.getVisibility() == 0 && this.f1816q.getWindowVisibility() == 0) {
            try {
                Cursor v = mo2314v(this.f1817r, charSequence2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo2305e(View view, Context context, Cursor cursor) {
        C0467a aVar = (C0467a) view.getTag();
        int i = this.f1815D;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1826a != null) {
            m2115z(aVar.f1826a, m2113w(cursor, this.f1824y));
        }
        if (aVar.f1827b != null) {
            String w = m2113w(cursor, this.f1812A);
            CharSequence l = w != null ? m2104l(w) : m2113w(cursor, this.f1825z);
            if (TextUtils.isEmpty(l)) {
                TextView textView = aVar.f1826a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1826a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1826a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1826a.setMaxLines(1);
                }
            }
            m2115z(aVar.f1827b, l);
        }
        ImageView imageView = aVar.f1828c;
        if (imageView != null) {
            m2114y(imageView, m2111t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1829d;
        if (imageView2 != null) {
            m2114y(imageView2, m2112u(cursor), 8);
        }
        int i3 = this.f1822w;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1830e.setVisibility(0);
            aVar.f1830e.setTag(aVar.f1826a.getText());
            aVar.f1830e.setOnClickListener(this);
            return;
        }
        aVar.f1830e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo11746g(this.f10738i, this.f10737h, viewGroup);
            if (g != null) {
                ((C0467a) g.getTag()).f1826a.setText(e.toString());
            }
            return g;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo2308h(this.f10738i, this.f10737h, viewGroup);
            if (h != null) {
                ((C0467a) h.getTag()).f1826a.setText(e.toString());
            }
            return h;
        }
    }

    /* renamed from: h */
    public View mo2308h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo2308h(context, cursor, viewGroup);
        h.setTag(new C0467a(h));
        ((ImageView) h.findViewById(C3128f.edit_query)).setImageResource(this.f1820u);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2102B(mo11744b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2102B(mo11744b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1816q.mo1684U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Drawable mo2313r(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f10738i.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Cursor mo2314v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f10738i.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: x */
    public void mo2315x(int i) {
        this.f1822w = i;
    }
}
