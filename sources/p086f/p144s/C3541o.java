package p086f.p144s;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p086f.p102e.C3190a;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.s.o */
public class C3541o {

    /* renamed from: a */
    private static C3532m f11025a = new C3488b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C3190a<ViewGroup, ArrayList<C3532m>>>> f11026b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f11027c = new ArrayList<>();

    /* renamed from: f.s.o$a */
    private static class C3542a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        C3532m f11028f;

        /* renamed from: g */
        ViewGroup f11029g;

        /* renamed from: f.s.o$a$a */
        class C3543a extends C3540n {

            /* renamed from: a */
            final /* synthetic */ C3190a f11030a;

            C3543a(C3190a aVar) {
                this.f11030a = aVar;
            }

            /* renamed from: e */
            public void mo11906e(C3532m mVar) {
                ((ArrayList) this.f11030a.get(C3542a.this.f11029g)).remove(mVar);
                mVar.mo11961Y(this);
            }
        }

        C3542a(C3532m mVar, ViewGroup viewGroup) {
            this.f11028f = mVar;
            this.f11029g = viewGroup;
        }

        /* renamed from: a */
        private void m15201a() {
            this.f11029g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f11029g.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m15201a();
            if (!C3541o.f11027c.remove(this.f11029g)) {
                return true;
            }
            C3190a<ViewGroup, ArrayList<C3532m>> b = C3541o.m15198b();
            ArrayList arrayList = b.get(this.f11029g);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b.put(this.f11029g, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f11028f);
            this.f11028f.mo11964b(new C3543a(b));
            this.f11028f.mo11979n(this.f11029g, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C3532m) it.next()).mo11963a0(this.f11029g);
                }
            }
            this.f11028f.mo11960W(this.f11029g);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m15201a();
            C3541o.f11027c.remove(this.f11029g);
            ArrayList arrayList = C3541o.m15198b().get(this.f11029g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C3532m) it.next()).mo11963a0(this.f11029g);
                }
            }
            this.f11028f.mo11980p(true);
        }
    }

    /* renamed from: a */
    public static void m15197a(ViewGroup viewGroup, C3532m mVar) {
        if (!f11027c.contains(viewGroup) && C3403t.m14614O(viewGroup)) {
            f11027c.add(viewGroup);
            if (mVar == null) {
                mVar = f11025a;
            }
            C3532m q = mVar.clone();
            m15200d(viewGroup, q);
            C3530l.m15132c(viewGroup, (C3530l) null);
            m15199c(viewGroup, q);
        }
    }

    /* renamed from: b */
    static C3190a<ViewGroup, ArrayList<C3532m>> m15198b() {
        C3190a<ViewGroup, ArrayList<C3532m>> aVar;
        WeakReference weakReference = f11026b.get();
        if (weakReference != null && (aVar = (C3190a) weakReference.get()) != null) {
            return aVar;
        }
        C3190a<ViewGroup, ArrayList<C3532m>> aVar2 = new C3190a<>();
        f11026b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: c */
    private static void m15199c(ViewGroup viewGroup, C3532m mVar) {
        if (mVar != null && viewGroup != null) {
            C3542a aVar = new C3542a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: d */
    private static void m15200d(ViewGroup viewGroup, C3532m mVar) {
        ArrayList arrayList = m15198b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C3532m) it.next()).mo11959V(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo11979n(viewGroup, true);
        }
        C3530l b = C3530l.m15131b(viewGroup);
        if (b != null) {
            b.mo11947a();
        }
    }
}
