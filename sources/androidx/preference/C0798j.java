package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import p086f.p111h.p112e.C3267a;

/* renamed from: androidx.preference.j */
public class C0798j {

    /* renamed from: a */
    private Context f3170a;

    /* renamed from: b */
    private long f3171b = 0;

    /* renamed from: c */
    private SharedPreferences f3172c;

    /* renamed from: d */
    private C0783e f3173d;

    /* renamed from: e */
    private SharedPreferences.Editor f3174e;

    /* renamed from: f */
    private boolean f3175f;

    /* renamed from: g */
    private String f3176g;

    /* renamed from: h */
    private int f3177h;

    /* renamed from: i */
    private int f3178i = 0;

    /* renamed from: j */
    private PreferenceScreen f3179j;

    /* renamed from: k */
    private C0802d f3180k;

    /* renamed from: l */
    private C0801c f3181l;

    /* renamed from: m */
    private C0799a f3182m;

    /* renamed from: n */
    private C0800b f3183n;

    /* renamed from: androidx.preference.j$a */
    public interface C0799a {
        /* renamed from: g */
        void mo3946g(Preference preference);
    }

    /* renamed from: androidx.preference.j$b */
    public interface C0800b {
        /* renamed from: h */
        void mo3947h(PreferenceScreen preferenceScreen);
    }

    /* renamed from: androidx.preference.j$c */
    public interface C0801c {
        /* renamed from: i */
        boolean mo3948i(Preference preference);
    }

    /* renamed from: androidx.preference.j$d */
    public static abstract class C0802d {
        /* renamed from: a */
        public abstract boolean mo4002a(Preference preference, Preference preference2);

        /* renamed from: b */
        public abstract boolean mo4003b(Preference preference, Preference preference2);
    }

    public C0798j(Context context) {
        this.f3170a = context;
        mo3999q(m4011b(context));
    }

    /* renamed from: b */
    private static String m4011b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    /* renamed from: l */
    private void m4012l(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f3174e) != null) {
            editor.apply();
        }
        this.f3175f = z;
    }

    /* renamed from: a */
    public <T extends Preference> T mo3985a(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f3179j;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.mo3866L0(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SharedPreferences.Editor mo3986c() {
        if (this.f3173d != null) {
            return null;
        }
        if (!this.f3175f) {
            return mo3993j().edit();
        }
        if (this.f3174e == null) {
            this.f3174e = mo3993j().edit();
        }
        return this.f3174e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo3987d() {
        long j;
        synchronized (this) {
            j = this.f3171b;
            this.f3171b = 1 + j;
        }
        return j;
    }

    /* renamed from: e */
    public C0800b mo3988e() {
        return this.f3183n;
    }

    /* renamed from: f */
    public C0801c mo3989f() {
        return this.f3181l;
    }

    /* renamed from: g */
    public C0802d mo3990g() {
        return this.f3180k;
    }

    /* renamed from: h */
    public C0783e mo3991h() {
        return this.f3173d;
    }

    /* renamed from: i */
    public PreferenceScreen mo3992i() {
        return this.f3179j;
    }

    /* renamed from: j */
    public SharedPreferences mo3993j() {
        if (mo3991h() != null) {
            return null;
        }
        if (this.f3172c == null) {
            this.f3172c = (this.f3178i != 1 ? this.f3170a : C3267a.m14072b(this.f3170a)).getSharedPreferences(this.f3176g, this.f3177h);
        }
        return this.f3172c;
    }

    /* renamed from: k */
    public PreferenceScreen mo3994k(Context context, int i, PreferenceScreen preferenceScreen) {
        m4012l(true);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) new C0797i(context, this).mo3976d(i, preferenceScreen);
        preferenceScreen2.mo3811U(this);
        m4012l(false);
        return preferenceScreen2;
    }

    /* renamed from: m */
    public void mo3995m(C0799a aVar) {
        this.f3182m = aVar;
    }

    /* renamed from: n */
    public void mo3996n(C0800b bVar) {
        this.f3183n = bVar;
    }

    /* renamed from: o */
    public void mo3997o(C0801c cVar) {
        this.f3181l = cVar;
    }

    /* renamed from: p */
    public boolean mo3998p(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f3179j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.mo3814Z();
        }
        this.f3179j = preferenceScreen;
        return true;
    }

    /* renamed from: q */
    public void mo3999q(String str) {
        this.f3176g = str;
        this.f3172c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4000r() {
        return !this.f3175f;
    }

    /* renamed from: s */
    public void mo4001s(Preference preference) {
        C0799a aVar = this.f3182m;
        if (aVar != null) {
            aVar.mo3946g(preference);
        }
    }
}
