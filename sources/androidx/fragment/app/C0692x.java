package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p086f.p111h.p118i.C3307a;
import p086f.p111h.p122m.C3400q;
import p086f.p111h.p122m.C3403t;
import p086f.p111h.p122m.C3416v;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.x */
public abstract class C0692x {

    /* renamed from: androidx.fragment.app.x$a */
    class C0693a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f2900f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2901g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f2902h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f2903i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2904j;

        C0693a(C0692x xVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2900f = i;
            this.f2901g = arrayList;
            this.f2902h = arrayList2;
            this.f2903i = arrayList3;
            this.f2904j = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2900f; i++) {
                C3403t.m14675y0((View) this.f2901g.get(i), (String) this.f2902h.get(i));
                C3403t.m14675y0((View) this.f2903i.get(i), (String) this.f2904j.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    class C0694b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2905f;

        /* renamed from: g */
        final /* synthetic */ Map f2906g;

        C0694b(C0692x xVar, ArrayList arrayList, Map map) {
            this.f2905f = arrayList;
            this.f2906g = map;
        }

        public void run() {
            int size = this.f2905f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2905f.get(i);
                String G = C3403t.m14606G(view);
                if (G != null) {
                    C3403t.m14675y0(view, C0692x.m3524i(this.f2906g, G));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    class C0695c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2907f;

        /* renamed from: g */
        final /* synthetic */ Map f2908g;

        C0695c(C0692x xVar, ArrayList arrayList, Map map) {
            this.f2907f = arrayList;
            this.f2908g = map;
        }

        public void run() {
            int size = this.f2907f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2907f.get(i);
                C3403t.m14675y0(view, (String) this.f2908g.get(C3403t.m14606G(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m3522d(List<View> list, View view) {
        int size = list.size();
        if (!m3523h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m3523h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m3523h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m3524i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m3525l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo3578A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo3579B(Object obj);

    /* renamed from: a */
    public abstract void mo3580a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3581b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3582c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3583e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3612f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean a = C3416v.m14722a(viewGroup2);
                viewGroup = viewGroup2;
                if (!a) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        mo3612f(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    /* renamed from: g */
    public abstract Object mo3584g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3613j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String G = C3403t.m14606G(view);
            if (G != null) {
                map.put(G, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo3613j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3614k(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: m */
    public abstract Object mo3585m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo3586n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> mo3615o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C3403t.m14606G(view));
            C3403t.m14675y0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo3587p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo3588q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo3589r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3616s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C3400q.m14595a(viewGroup, new C0695c(this, arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo3590t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo3591u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo3592v(Object obj, View view);

    /* renamed from: w */
    public void mo3593w(Fragment fragment, Object obj, C3307a aVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3617x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C3400q.m14595a(view, new C0694b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3618y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String G = C3403t.m14606G(view2);
            arrayList4.add(G);
            if (G != null) {
                C3403t.m14675y0(view2, (String) null);
                String str = map.get(G);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C3403t.m14675y0(arrayList2.get(i2), G);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C3400q.m14595a(view, new C0693a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo3594z(Object obj, View view, ArrayList<View> arrayList);
}
