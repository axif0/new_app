package p048d.p049a.p050a.p051a.p052c;

import androidx.fragment.app.C0653m;
import androidx.fragment.app.C0669q;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d.a.a.a.c.d */
public class C2801d extends C0669q {

    /* renamed from: g */
    private final List<Fragment> f8971g = new ArrayList();

    /* renamed from: h */
    private final List<String> f8972h = new ArrayList();

    public C2801d(C0653m mVar) {
        super(mVar);
    }

    /* renamed from: d */
    public int mo510d() {
        return this.f8971g.size();
    }

    /* renamed from: f */
    public CharSequence mo5007f(int i) {
        return this.f8972h.get(i);
    }

    /* renamed from: s */
    public Fragment mo3514s(int i) {
        return this.f8971g.get(i);
    }

    /* renamed from: v */
    public void mo10143v(Fragment fragment, String str) {
        this.f8971g.add(fragment);
        this.f8972h.add(str);
    }
}
