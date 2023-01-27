package com.bumptech.glide.p025q.p026j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C0970g;
import com.bumptech.glide.p025q.C1361c;
import com.bumptech.glide.p029s.C1401j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.q.j.i */
public abstract class C1378i<T extends View, Z> extends C1370a<Z> {

    /* renamed from: k */
    private static int f4759k = C0970g.glide_custom_view_target_tag;

    /* renamed from: f */
    protected final T f4760f;

    /* renamed from: g */
    private final C1379a f4761g;

    /* renamed from: h */
    private View.OnAttachStateChangeListener f4762h;

    /* renamed from: i */
    private boolean f4763i;

    /* renamed from: j */
    private boolean f4764j;

    /* renamed from: com.bumptech.glide.q.j.i$a */
    static final class C1379a {

        /* renamed from: e */
        static Integer f4765e;

        /* renamed from: a */
        private final View f4766a;

        /* renamed from: b */
        private final List<C1376g> f4767b = new ArrayList();

        /* renamed from: c */
        boolean f4768c;

        /* renamed from: d */
        private C1380a f4769d;

        /* renamed from: com.bumptech.glide.q.j.i$a$a */
        private static final class C1380a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: f */
            private final WeakReference<C1379a> f4770f;

            C1380a(C1379a aVar) {
                this.f4770f = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C1379a aVar = (C1379a) this.f4770f.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo5849a();
                return true;
            }
        }

        C1379a(View view) {
            this.f4766a = view;
        }

        /* renamed from: c */
        private static int m6919c(Context context) {
            if (f4765e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C1401j.m6972d(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4765e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4765e.intValue();
        }

        /* renamed from: e */
        private int m6920e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f4768c && this.f4766a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f4766a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m6919c(this.f4766a.getContext());
        }

        /* renamed from: f */
        private int m6921f() {
            int paddingTop = this.f4766a.getPaddingTop() + this.f4766a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f4766a.getLayoutParams();
            return m6920e(this.f4766a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        private int m6922g() {
            int paddingLeft = this.f4766a.getPaddingLeft() + this.f4766a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f4766a.getLayoutParams();
            return m6920e(this.f4766a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        private boolean m6923h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        private boolean m6924i(int i, int i2) {
            return m6923h(i) && m6923h(i2);
        }

        /* renamed from: j */
        private void m6925j(int i, int i2) {
            Iterator it = new ArrayList(this.f4767b).iterator();
            while (it.hasNext()) {
                ((C1376g) it.next()).mo5835d(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5849a() {
            if (!this.f4767b.isEmpty()) {
                int g = m6922g();
                int f = m6921f();
                if (m6924i(g, f)) {
                    m6925j(g, f);
                    mo5850b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5850b() {
            ViewTreeObserver viewTreeObserver = this.f4766a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4769d);
            }
            this.f4769d = null;
            this.f4767b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5851d(C1376g gVar) {
            int g = m6922g();
            int f = m6921f();
            if (m6924i(g, f)) {
                gVar.mo5835d(g, f);
                return;
            }
            if (!this.f4767b.contains(gVar)) {
                this.f4767b.add(gVar);
            }
            if (this.f4769d == null) {
                ViewTreeObserver viewTreeObserver = this.f4766a.getViewTreeObserver();
                C1380a aVar = new C1380a(this);
                this.f4769d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5852k(C1376g gVar) {
            this.f4767b.remove(gVar);
        }
    }

    public C1378i(T t) {
        C1401j.m6972d(t);
        this.f4760f = (View) t;
        this.f4761g = new C1379a(t);
    }

    /* renamed from: l */
    private Object m6909l() {
        return this.f4760f.getTag(f4759k);
    }

    /* renamed from: m */
    private void m6910m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4762h;
        if (onAttachStateChangeListener != null && !this.f4764j) {
            this.f4760f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4764j = true;
        }
    }

    /* renamed from: n */
    private void m6911n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4762h;
        if (onAttachStateChangeListener != null && this.f4764j) {
            this.f4760f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f4764j = false;
        }
    }

    /* renamed from: o */
    private void m6912o(Object obj) {
        this.f4760f.setTag(f4759k, obj);
    }

    /* renamed from: b */
    public void mo5841b(C1376g gVar) {
        this.f4761g.mo5852k(gVar);
    }

    /* renamed from: f */
    public void mo5838f(Drawable drawable) {
        super.mo5838f(drawable);
        m6910m();
    }

    /* renamed from: g */
    public C1361c mo5842g() {
        Object l = m6909l();
        if (l == null) {
            return null;
        }
        if (l instanceof C1361c) {
            return (C1361c) l;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: h */
    public void mo5662h(Drawable drawable) {
        super.mo5662h(drawable);
        this.f4761g.mo5850b();
        if (!this.f4763i) {
            m6911n();
        }
    }

    /* renamed from: i */
    public void mo5843i(C1376g gVar) {
        this.f4761g.mo5851d(gVar);
    }

    /* renamed from: j */
    public void mo5844j(C1361c cVar) {
        m6912o(cVar);
    }

    public String toString() {
        return "Target for: " + this.f4760f;
    }
}
