package p086f.p087a.p094o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0339i;
import androidx.appcompat.view.menu.C0341j;
import androidx.appcompat.widget.C0418c0;
import androidx.appcompat.widget.C0479u0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p086f.p087a.C3132j;
import p086f.p111h.p115g.p116a.C3303a;
import p086f.p111h.p122m.C3353b;
import p086f.p111h.p122m.C3391h;

/* renamed from: f.a.o.g */
public class C3162g extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f10038e;

    /* renamed from: f */
    static final Class<?>[] f10039f;

    /* renamed from: a */
    final Object[] f10040a;

    /* renamed from: b */
    final Object[] f10041b;

    /* renamed from: c */
    Context f10042c;

    /* renamed from: d */
    private Object f10043d;

    /* renamed from: f.a.o.g$a */
    private static class C3163a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: h */
        private static final Class<?>[] f10044h = {MenuItem.class};

        /* renamed from: f */
        private Object f10045f;

        /* renamed from: g */
        private Method f10046g;

        public C3163a(Object obj, String str) {
            this.f10045f = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f10046g = cls.getMethod(str, f10044h);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f10046g.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f10046g.invoke(this.f10045f, new Object[]{menuItem})).booleanValue();
                }
                this.f10046g.invoke(this.f10045f, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: f.a.o.g$b */
    private class C3164b {

        /* renamed from: A */
        C3353b f10047A;

        /* renamed from: B */
        private CharSequence f10048B;

        /* renamed from: C */
        private CharSequence f10049C;

        /* renamed from: D */
        private ColorStateList f10050D = null;

        /* renamed from: E */
        private PorterDuff.Mode f10051E = null;

        /* renamed from: a */
        private Menu f10053a;

        /* renamed from: b */
        private int f10054b;

        /* renamed from: c */
        private int f10055c;

        /* renamed from: d */
        private int f10056d;

        /* renamed from: e */
        private int f10057e;

        /* renamed from: f */
        private boolean f10058f;

        /* renamed from: g */
        private boolean f10059g;

        /* renamed from: h */
        private boolean f10060h;

        /* renamed from: i */
        private int f10061i;

        /* renamed from: j */
        private int f10062j;

        /* renamed from: k */
        private CharSequence f10063k;

        /* renamed from: l */
        private CharSequence f10064l;

        /* renamed from: m */
        private int f10065m;

        /* renamed from: n */
        private char f10066n;

        /* renamed from: o */
        private int f10067o;

        /* renamed from: p */
        private char f10068p;

        /* renamed from: q */
        private int f10069q;

        /* renamed from: r */
        private int f10070r;

        /* renamed from: s */
        private boolean f10071s;

        /* renamed from: t */
        private boolean f10072t;

        /* renamed from: u */
        private boolean f10073u;

        /* renamed from: v */
        private int f10074v;

        /* renamed from: w */
        private int f10075w;

        /* renamed from: x */
        private String f10076x;

        /* renamed from: y */
        private String f10077y;

        /* renamed from: z */
        private String f10078z;

        public C3164b(Menu menu) {
            this.f10053a = menu;
            mo10947h();
        }

        /* renamed from: c */
        private char m13541c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m13542e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C3162g.this.f10042c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m13543i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f10071s).setVisible(this.f10072t).setEnabled(this.f10073u).setCheckable(this.f10070r >= 1).setTitleCondensed(this.f10064l).setIcon(this.f10065m);
            int i = this.f10074v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f10078z != null) {
                if (!C3162g.this.f10042c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C3163a(C3162g.this.mo10939b(), this.f10078z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f10070r >= 2) {
                if (menuItem instanceof C0339i) {
                    ((C0339i) menuItem).mo1326t(true);
                } else if (menuItem instanceof C0341j) {
                    ((C0341j) menuItem).mo1356h(true);
                }
            }
            String str = this.f10076x;
            if (str != null) {
                menuItem.setActionView((View) m13542e(str, C3162g.f10038e, C3162g.this.f10040a));
                z = true;
            }
            int i2 = this.f10075w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C3353b bVar = this.f10047A;
            if (bVar != null) {
                C3391h.m14558a(menuItem, bVar);
            }
            C3391h.m14560c(menuItem, this.f10048B);
            C3391h.m14564g(menuItem, this.f10049C);
            C3391h.m14559b(menuItem, this.f10066n, this.f10067o);
            C3391h.m14563f(menuItem, this.f10068p, this.f10069q);
            PorterDuff.Mode mode = this.f10051E;
            if (mode != null) {
                C3391h.m14562e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f10050D;
            if (colorStateList != null) {
                C3391h.m14561d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo10942a() {
            this.f10060h = true;
            m13543i(this.f10053a.add(this.f10054b, this.f10061i, this.f10062j, this.f10063k));
        }

        /* renamed from: b */
        public SubMenu mo10943b() {
            this.f10060h = true;
            SubMenu addSubMenu = this.f10053a.addSubMenu(this.f10054b, this.f10061i, this.f10062j, this.f10063k);
            m13543i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo10944d() {
            return this.f10060h;
        }

        /* renamed from: f */
        public void mo10945f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C3162g.this.f10042c.obtainStyledAttributes(attributeSet, C3132j.MenuGroup);
            this.f10054b = obtainStyledAttributes.getResourceId(C3132j.MenuGroup_android_id, 0);
            this.f10055c = obtainStyledAttributes.getInt(C3132j.MenuGroup_android_menuCategory, 0);
            this.f10056d = obtainStyledAttributes.getInt(C3132j.MenuGroup_android_orderInCategory, 0);
            this.f10057e = obtainStyledAttributes.getInt(C3132j.MenuGroup_android_checkableBehavior, 0);
            this.f10058f = obtainStyledAttributes.getBoolean(C3132j.MenuGroup_android_visible, true);
            this.f10059g = obtainStyledAttributes.getBoolean(C3132j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo10946g(AttributeSet attributeSet) {
            C0479u0 u = C0479u0.m2147u(C3162g.this.f10042c, attributeSet, C3132j.MenuItem);
            this.f10061i = u.mo2356n(C3132j.MenuItem_android_id, 0);
            this.f10062j = (u.mo2353k(C3132j.MenuItem_android_menuCategory, this.f10055c) & -65536) | (u.mo2353k(C3132j.MenuItem_android_orderInCategory, this.f10056d) & 65535);
            this.f10063k = u.mo2358p(C3132j.MenuItem_android_title);
            this.f10064l = u.mo2358p(C3132j.MenuItem_android_titleCondensed);
            this.f10065m = u.mo2356n(C3132j.MenuItem_android_icon, 0);
            this.f10066n = m13541c(u.mo2357o(C3132j.MenuItem_android_alphabeticShortcut));
            this.f10067o = u.mo2353k(C3132j.MenuItem_alphabeticModifiers, 4096);
            this.f10068p = m13541c(u.mo2357o(C3132j.MenuItem_android_numericShortcut));
            this.f10069q = u.mo2353k(C3132j.MenuItem_numericModifiers, 4096);
            this.f10070r = u.mo2361s(C3132j.MenuItem_android_checkable) ? u.mo2343a(C3132j.MenuItem_android_checkable, false) : this.f10057e;
            this.f10071s = u.mo2343a(C3132j.MenuItem_android_checked, false);
            this.f10072t = u.mo2343a(C3132j.MenuItem_android_visible, this.f10058f);
            this.f10073u = u.mo2343a(C3132j.MenuItem_android_enabled, this.f10059g);
            this.f10074v = u.mo2353k(C3132j.MenuItem_showAsAction, -1);
            this.f10078z = u.mo2357o(C3132j.MenuItem_android_onClick);
            this.f10075w = u.mo2356n(C3132j.MenuItem_actionLayout, 0);
            this.f10076x = u.mo2357o(C3132j.MenuItem_actionViewClass);
            String o = u.mo2357o(C3132j.MenuItem_actionProviderClass);
            this.f10077y = o;
            boolean z = o != null;
            if (z && this.f10075w == 0 && this.f10076x == null) {
                this.f10047A = (C3353b) m13542e(this.f10077y, C3162g.f10039f, C3162g.this.f10041b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f10047A = null;
            }
            this.f10048B = u.mo2358p(C3132j.MenuItem_contentDescription);
            this.f10049C = u.mo2358p(C3132j.MenuItem_tooltipText);
            if (u.mo2361s(C3132j.MenuItem_iconTintMode)) {
                this.f10051E = C0418c0.m1905e(u.mo2353k(C3132j.MenuItem_iconTintMode, -1), this.f10051E);
            } else {
                this.f10051E = null;
            }
            if (u.mo2361s(C3132j.MenuItem_iconTint)) {
                this.f10050D = u.mo2345c(C3132j.MenuItem_iconTint);
            } else {
                this.f10050D = null;
            }
            u.mo2362w();
            this.f10060h = false;
        }

        /* renamed from: h */
        public void mo10947h() {
            this.f10054b = 0;
            this.f10055c = 0;
            this.f10056d = 0;
            this.f10057e = 0;
            this.f10058f = true;
            this.f10059g = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f10038e = r0
            f10039f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p087a.p094o.C3162g.<clinit>():void");
    }

    public C3162g(Context context) {
        super(context);
        this.f10042c = context;
        Object[] objArr = {context};
        this.f10040a = objArr;
        this.f10041b = objArr;
    }

    /* renamed from: a */
    private Object m13538a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m13538a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m13539c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C3164b bVar = new C3164b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo10947h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo10944d()) {
                                C3353b bVar2 = bVar.f10047A;
                                if (bVar2 == null || !bVar2.mo1390a()) {
                                    bVar.mo10942a();
                                } else {
                                    bVar.mo10943b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo10945f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo10946g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m13539c(xmlPullParser, attributeSet, bVar.mo10943b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo10939b() {
        if (this.f10043d == null) {
            this.f10043d = m13538a(this.f10042c);
        }
        return this.f10043d;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C3303a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f10042c.getResources().getLayout(i);
            m13539c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
