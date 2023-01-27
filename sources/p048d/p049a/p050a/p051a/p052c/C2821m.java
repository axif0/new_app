package p048d.p049a.p050a.p051a.p052c;

import android.content.Context;
import androidx.fragment.app.C0653m;
import androidx.fragment.app.C0669q;
import androidx.fragment.app.Fragment;
import com.karumi.dexter.C2722R;
import p048d.p049a.p050a.p051a.p063j.C2962c;
import p048d.p049a.p050a.p051a.p063j.C2965d;

/* renamed from: d.a.a.a.c.m */
public class C2821m extends C0669q {

    /* renamed from: h */
    private static final int[] f9016h = {C2722R.string.social_tab_text_1, C2722R.string.social_tab_text_2};

    /* renamed from: g */
    private final Context f9017g;

    public C2821m(Context context, C0653m mVar) {
        super(mVar, 1);
        this.f9017g = context;
    }

    /* renamed from: d */
    public int mo510d() {
        return 1;
    }

    /* renamed from: f */
    public CharSequence mo5007f(int i) {
        return this.f9017g.getResources().getString(f9016h[i]);
    }

    /* renamed from: s */
    public Fragment mo3514s(int i) {
        return i == 0 ? new C2965d() : new C2962c();
    }
}
