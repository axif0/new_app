package p086f.p144s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.s.z */
class C3557z implements C3489b0 {

    /* renamed from: a */
    protected C3558a f11056a;

    /* renamed from: f.s.z$a */
    static class C3558a extends ViewGroup {

        /* renamed from: f */
        ViewGroup f11057f;

        /* renamed from: g */
        View f11058g;

        /* renamed from: h */
        ArrayList<Drawable> f11059h = null;

        /* renamed from: i */
        C3557z f11060i;

        /* renamed from: j */
        private boolean f11061j;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C3558a(Context context, ViewGroup viewGroup, View view, C3557z zVar) {
            super(context);
            this.f11057f = viewGroup;
            this.f11058g = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f11060i = zVar;
        }

        /* renamed from: c */
        private void m15262c() {
            if (this.f11061j) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m15263d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f11059h;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f11061j = true;
                    this.f11057f.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m15264e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f11057f.getLocationOnScreen(iArr2);
            this.f11058g.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo12016a(Drawable drawable) {
            m15262c();
            if (this.f11059h == null) {
                this.f11059h = new ArrayList<>();
            }
            if (!this.f11059h.contains(drawable)) {
                this.f11059h.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo12017b(View view) {
            m15262c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f11057f || viewGroup.getParent() == null || !C3403t.m14613N(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f11057f.getLocationOnScreen(iArr2);
                    C3403t.m14619T(view, iArr[0] - iArr2[0]);
                    C3403t.m14620U(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f11057f.getLocationOnScreen(iArr);
            this.f11058g.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f11058g.getWidth(), this.f11058g.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f11059h;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f11059h.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo12020f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f11059h;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m15263d();
            }
        }

        /* renamed from: g */
        public void mo12021g(View view) {
            super.removeView(view);
            m15263d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f11057f == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f11057f instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m15264e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f11059h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f11059h
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p144s.C3557z.C3558a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C3557z(Context context, ViewGroup viewGroup, View view) {
        this.f11056a = new C3558a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C3557z m15258e(View view) {
        ViewGroup f = m15259f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C3558a) {
                return ((C3558a) childAt).f11060i;
            }
        }
        return new C3551u(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m15259f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo11870b(Drawable drawable) {
        this.f11056a.mo12016a(drawable);
    }

    /* renamed from: d */
    public void mo11871d(Drawable drawable) {
        this.f11056a.mo12020f(drawable);
    }
}
