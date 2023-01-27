package p337i.p338a.p339a;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import java.lang.ref.WeakReference;
import p148g.p325e.p326a.C5544a;
import p148g.p325e.p326a.C5560i;
import p337i.p338a.p339a.C5602a;

/* renamed from: i.a.a.e */
public class C5614e {

    /* renamed from: a */
    private static final boolean f16186a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: i.a.a.e$a */
    static class C5615a implements C5544a.C5545a {
        C5615a() {
        }

        /* renamed from: b */
        public void mo566b(C5544a aVar) {
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public static C5608b m23232a(View view, int i, int i2, float f, float f2) {
        if (view.getParent() instanceof C5602a) {
            C5602a aVar = (C5602a) view.getParent();
            aVar.mo16128b(new C5602a.C5606d(i, i2, f, f2, new WeakReference(view)));
            if (f16186a) {
                return new C5610c(ViewAnimationUtils.createCircularReveal(view, i, i2, f, f2), aVar);
            }
            C5560i P = C5560i.m22976P(aVar, C5602a.f16175b, f, f2);
            P.mo15959b(m23233b(aVar));
            return new C5612d(P, aVar);
        }
        throw new IllegalArgumentException("View must be inside RevealFrameLayout or RevealLinearLayout.");
    }

    /* renamed from: b */
    private static C5544a.C5545a m23233b(C5602a aVar) {
        int i = Build.VERSION.SDK_INT;
        return i >= 18 ? new C5602a.C5605c(aVar) : i >= 14 ? new C5602a.C5604b(aVar) : new C5602a.C5603a(aVar);
    }
}
