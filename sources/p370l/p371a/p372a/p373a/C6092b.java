package p370l.p371a.p372a.p373a;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: l.a.a.a.b */
public class C6092b {

    /* renamed from: l.a.a.a.b$a */
    static class C6093a extends C6091a {

        /* renamed from: g */
        final /* synthetic */ C6097e f17052g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6093a(Activity activity, C6097e eVar) {
            super(activity);
            this.f17052g = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo17187a() {
            this.f17052g.mo17196a();
        }
    }

    /* renamed from: l.a.a.a.b$b */
    static class C6094b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f */
        private final Rect f17053f = new Rect();

        /* renamed from: g */
        private boolean f17054g = false;

        /* renamed from: h */
        final /* synthetic */ View f17055h;

        /* renamed from: i */
        final /* synthetic */ C6095c f17056i;

        C6094b(View view, C6095c cVar) {
            this.f17055h = view;
            this.f17056i = cVar;
        }

        public void onGlobalLayout() {
            this.f17055h.getWindowVisibleDisplayFrame(this.f17053f);
            int height = this.f17055h.getRootView().getHeight();
            double d = (double) height;
            Double.isNaN(d);
            boolean z = ((double) (height - this.f17053f.height())) > d * 0.15d;
            if (z != this.f17054g) {
                this.f17054g = z;
                this.f17056i.mo340a(z);
            }
        }
    }

    /* renamed from: a */
    static View m24859a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    /* renamed from: b */
    public static C6097e m24860b(Activity activity, C6095c cVar) {
        if (activity == null) {
            throw new NullPointerException("Parameter:activity must not be null");
        } else if ((activity.getWindow().getAttributes().softInputMode & 240 & 48) == 48) {
            throw new IllegalArgumentException("Parameter:activity window SoftInputMethod is SOFT_INPUT_ADJUST_NOTHING. In this case window will not be resized");
        } else if (cVar != null) {
            View a = m24859a(activity);
            C6094b bVar = new C6094b(a, cVar);
            a.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
            return new C6096d(activity, bVar);
        } else {
            throw new NullPointerException("Parameter:listener must not be null");
        }
    }

    /* renamed from: c */
    public static void m24861c(Activity activity, C6095c cVar) {
        activity.getApplication().registerActivityLifecycleCallbacks(new C6093a(activity, m24860b(activity, cVar)));
    }
}
