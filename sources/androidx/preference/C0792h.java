package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.C0798j;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.C0891f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p086f.p087a.p088k.p089a.C3133a;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.preference.h */
public class C0792h extends RecyclerView.C0832g<C0805l> implements Preference.C0761c {

    /* renamed from: h */
    private PreferenceGroup f3147h;

    /* renamed from: i */
    private List<Preference> f3148i;

    /* renamed from: j */
    private List<Preference> f3149j;

    /* renamed from: k */
    private List<C0796d> f3150k;

    /* renamed from: l */
    private Handler f3151l;

    /* renamed from: m */
    private Runnable f3152m = new C0793a();

    /* renamed from: androidx.preference.h$a */
    class C0793a implements Runnable {
        C0793a() {
        }

        public void run() {
            C0792h.this.mo3962I();
        }
    }

    /* renamed from: androidx.preference.h$b */
    class C0794b extends C0891f.C0893b {

        /* renamed from: a */
        final /* synthetic */ List f3154a;

        /* renamed from: b */
        final /* synthetic */ List f3155b;

        /* renamed from: c */
        final /* synthetic */ C0798j.C0802d f3156c;

        C0794b(C0792h hVar, List list, List list2, C0798j.C0802d dVar) {
            this.f3154a = list;
            this.f3155b = list2;
            this.f3156c = dVar;
        }

        /* renamed from: a */
        public boolean mo3969a(int i, int i2) {
            return this.f3156c.mo4002a((Preference) this.f3154a.get(i), (Preference) this.f3155b.get(i2));
        }

        /* renamed from: b */
        public boolean mo3970b(int i, int i2) {
            return this.f3156c.mo4003b((Preference) this.f3154a.get(i), (Preference) this.f3155b.get(i2));
        }

        /* renamed from: d */
        public int mo3971d() {
            return this.f3155b.size();
        }

        /* renamed from: e */
        public int mo3972e() {
            return this.f3154a.size();
        }
    }

    /* renamed from: androidx.preference.h$c */
    class C0795c implements Preference.C0763e {

        /* renamed from: a */
        final /* synthetic */ PreferenceGroup f3157a;

        C0795c(PreferenceGroup preferenceGroup) {
            this.f3157a = preferenceGroup;
        }

        /* renamed from: a */
        public boolean mo3861a(Preference preference) {
            this.f3157a.mo3873S0(Integer.MAX_VALUE);
            C0792h.this.mo3859a(preference);
            PreferenceGroup.C0766a N0 = this.f3157a.mo3868N0();
            if (N0 == null) {
                return true;
            }
            N0.mo3876a();
            return true;
        }
    }

    /* renamed from: androidx.preference.h$d */
    private static class C0796d {

        /* renamed from: a */
        int f3159a;

        /* renamed from: b */
        int f3160b;

        /* renamed from: c */
        String f3161c;

        C0796d(Preference preference) {
            this.f3161c = preference.getClass().getName();
            this.f3159a = preference.mo3844v();
            this.f3160b = preference.mo3801J();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0796d)) {
                return false;
            }
            C0796d dVar = (C0796d) obj;
            return this.f3159a == dVar.f3159a && this.f3160b == dVar.f3160b && TextUtils.equals(this.f3161c, dVar.f3161c);
        }

        public int hashCode() {
            return ((((527 + this.f3159a) * 31) + this.f3160b) * 31) + this.f3161c.hashCode();
        }
    }

    public C0792h(PreferenceGroup preferenceGroup) {
        this.f3147h = preferenceGroup;
        this.f3151l = new Handler();
        this.f3147h.mo3847w0(this);
        this.f3148i = new ArrayList();
        this.f3149j = new ArrayList();
        this.f3150k = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f3147h;
        mo4374z(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).mo3882V0() : true);
        mo3962I();
    }

    /* renamed from: B */
    private C0778b m3980B(PreferenceGroup preferenceGroup, List<Preference> list) {
        C0778b bVar = new C0778b(preferenceGroup.mo3831n(), list, preferenceGroup.mo3837s());
        bVar.mo3851y0(new C0795c(preferenceGroup));
        return bVar;
    }

    /* renamed from: C */
    private List<Preference> m3981C(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int P0 = preferenceGroup.mo3870P0();
        int i = 0;
        for (int i2 = 0; i2 < P0; i2++) {
            Preference O0 = preferenceGroup.mo3869O0(i2);
            if (O0.mo3807P()) {
                if (!m3983F(preferenceGroup) || i < preferenceGroup.mo3867M0()) {
                    arrayList.add(O0);
                } else {
                    arrayList2.add(O0);
                }
                if (!(O0 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) O0;
                    if (!preferenceGroup2.mo3871Q0()) {
                        continue;
                    } else if (!m3983F(preferenceGroup) || !m3983F(preferenceGroup2)) {
                        for (Preference next : m3981C(preferenceGroup2)) {
                            if (!m3983F(preferenceGroup) || i < preferenceGroup.mo3867M0()) {
                                arrayList.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (m3983F(preferenceGroup) && i > preferenceGroup.mo3867M0()) {
            arrayList.add(m3980B(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    /* renamed from: D */
    private void m3982D(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.mo3875U0();
        int P0 = preferenceGroup.mo3870P0();
        for (int i = 0; i < P0; i++) {
            Preference O0 = preferenceGroup.mo3869O0(i);
            list.add(O0);
            C0796d dVar = new C0796d(O0);
            if (!this.f3150k.contains(dVar)) {
                this.f3150k.add(dVar);
            }
            if (O0 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) O0;
                if (preferenceGroup2.mo3871Q0()) {
                    m3982D(list, preferenceGroup2);
                }
            }
            O0.mo3847w0(this);
        }
    }

    /* renamed from: F */
    private boolean m3983F(PreferenceGroup preferenceGroup) {
        return preferenceGroup.mo3867M0() != Integer.MAX_VALUE;
    }

    /* renamed from: E */
    public Preference mo3959E(int i) {
        if (i < 0 || i >= mo3963e()) {
            return null;
        }
        return this.f3149j.get(i);
    }

    /* renamed from: G */
    public void mo3966q(C0805l lVar, int i) {
        mo3959E(i).mo3735W(lVar);
    }

    /* renamed from: H */
    public C0805l mo3967s(ViewGroup viewGroup, int i) {
        C0796d dVar = this.f3150k.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, C0813t.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0813t.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = C3133a.m13388d(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(dVar.f3159a, viewGroup, false);
        if (inflate.getBackground() == null) {
            C3403t.m14649l0(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = dVar.f3160b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0805l(inflate);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3962I() {
        for (Preference w0 : this.f3148i) {
            w0.mo3847w0((Preference.C0761c) null);
        }
        ArrayList arrayList = new ArrayList(this.f3148i.size());
        this.f3148i = arrayList;
        m3982D(arrayList, this.f3147h);
        List<Preference> list = this.f3149j;
        List<Preference> C = m3981C(this.f3147h);
        this.f3149j = C;
        C0798j D = this.f3147h.mo3795D();
        if (D == null || D.mo3990g() == null) {
            mo4360j();
        } else {
            C0891f.m4975a(new C0794b(this, list, C, D.mo3990g())).mo4764e(this);
        }
        for (Preference h : this.f3148i) {
            h.mo3821h();
        }
    }

    /* renamed from: a */
    public void mo3859a(Preference preference) {
        this.f3151l.removeCallbacks(this.f3152m);
        this.f3151l.post(this.f3152m);
    }

    /* renamed from: b */
    public void mo3860b(Preference preference) {
        int indexOf = this.f3149j.indexOf(preference);
        if (indexOf != -1) {
            mo4361k(indexOf, preference);
        }
    }

    /* renamed from: e */
    public int mo3963e() {
        return this.f3149j.size();
    }

    /* renamed from: f */
    public long mo3964f(int i) {
        if (!mo4359i()) {
            return -1;
        }
        return mo3959E(i).mo3837s();
    }

    /* renamed from: g */
    public int mo3965g(int i) {
        C0796d dVar = new C0796d(mo3959E(i));
        int indexOf = this.f3150k.indexOf(dVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f3150k.size();
        this.f3150k.add(dVar);
        return size;
    }
}
