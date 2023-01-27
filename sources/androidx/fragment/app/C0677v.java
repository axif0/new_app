package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0585l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p086f.p102e.C3190a;
import p086f.p111h.p118i.C3307a;
import p086f.p111h.p122m.C3400q;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.fragment.app.v */
class C0677v {

    /* renamed from: a */
    private static final int[] f2845a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0692x f2846b = (Build.VERSION.SDK_INT >= 21 ? new C0686w() : null);

    /* renamed from: c */
    private static final C0692x f2847c = m3499x();

    /* renamed from: androidx.fragment.app.v$a */
    static class C0678a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0684g f2848f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2849g;

        /* renamed from: h */
        final /* synthetic */ C3307a f2850h;

        C0678a(C0684g gVar, Fragment fragment, C3307a aVar) {
            this.f2848f = gVar;
            this.f2849g = fragment;
            this.f2850h = aVar;
        }

        public void run() {
            this.f2848f.mo3467a(this.f2849g, this.f2850h);
        }
    }

    /* renamed from: androidx.fragment.app.v$b */
    static class C0679b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2851f;

        C0679b(ArrayList arrayList) {
            this.f2851f = arrayList;
        }

        public void run() {
            C0677v.m3474B(this.f2851f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.v$c */
    static class C0680c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0684g f2852f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2853g;

        /* renamed from: h */
        final /* synthetic */ C3307a f2854h;

        C0680c(C0684g gVar, Fragment fragment, C3307a aVar) {
            this.f2852f = gVar;
            this.f2853g = fragment;
            this.f2854h = aVar;
        }

        public void run() {
            this.f2852f.mo3467a(this.f2853g, this.f2854h);
        }
    }

    /* renamed from: androidx.fragment.app.v$d */
    static class C0681d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2855f;

        /* renamed from: g */
        final /* synthetic */ C0692x f2856g;

        /* renamed from: h */
        final /* synthetic */ View f2857h;

        /* renamed from: i */
        final /* synthetic */ Fragment f2858i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2859j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f2860k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f2861l;

        /* renamed from: m */
        final /* synthetic */ Object f2862m;

        C0681d(Object obj, C0692x xVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2855f = obj;
            this.f2856g = xVar;
            this.f2857h = view;
            this.f2858i = fragment;
            this.f2859j = arrayList;
            this.f2860k = arrayList2;
            this.f2861l = arrayList3;
            this.f2862m = obj2;
        }

        public void run() {
            Object obj = this.f2855f;
            if (obj != null) {
                this.f2856g.mo3587p(obj, this.f2857h);
                this.f2860k.addAll(C0677v.m3486k(this.f2856g, this.f2855f, this.f2858i, this.f2859j, this.f2857h));
            }
            if (this.f2861l != null) {
                if (this.f2862m != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2857h);
                    this.f2856g.mo3588q(this.f2862m, this.f2861l, arrayList);
                }
                this.f2861l.clear();
                this.f2861l.add(this.f2857h);
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$e */
    static class C0682e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f2863f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2864g;

        /* renamed from: h */
        final /* synthetic */ boolean f2865h;

        /* renamed from: i */
        final /* synthetic */ C3190a f2866i;

        /* renamed from: j */
        final /* synthetic */ View f2867j;

        /* renamed from: k */
        final /* synthetic */ C0692x f2868k;

        /* renamed from: l */
        final /* synthetic */ Rect f2869l;

        C0682e(Fragment fragment, Fragment fragment2, boolean z, C3190a aVar, View view, C0692x xVar, Rect rect) {
            this.f2863f = fragment;
            this.f2864g = fragment2;
            this.f2865h = z;
            this.f2866i = aVar;
            this.f2867j = view;
            this.f2868k = xVar;
            this.f2869l = rect;
        }

        public void run() {
            C0677v.m3481f(this.f2863f, this.f2864g, this.f2865h, this.f2866i, false);
            View view = this.f2867j;
            if (view != null) {
                this.f2868k.mo3614k(view, this.f2869l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$f */
    static class C0683f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0692x f2870f;

        /* renamed from: g */
        final /* synthetic */ C3190a f2871g;

        /* renamed from: h */
        final /* synthetic */ Object f2872h;

        /* renamed from: i */
        final /* synthetic */ C0685h f2873i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2874j;

        /* renamed from: k */
        final /* synthetic */ View f2875k;

        /* renamed from: l */
        final /* synthetic */ Fragment f2876l;

        /* renamed from: m */
        final /* synthetic */ Fragment f2877m;

        /* renamed from: n */
        final /* synthetic */ boolean f2878n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f2879o;

        /* renamed from: p */
        final /* synthetic */ Object f2880p;

        /* renamed from: q */
        final /* synthetic */ Rect f2881q;

        C0683f(C0692x xVar, C3190a aVar, Object obj, C0685h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2870f = xVar;
            this.f2871g = aVar;
            this.f2872h = obj;
            this.f2873i = hVar;
            this.f2874j = arrayList;
            this.f2875k = view;
            this.f2876l = fragment;
            this.f2877m = fragment2;
            this.f2878n = z;
            this.f2879o = arrayList2;
            this.f2880p = obj2;
            this.f2881q = rect;
        }

        public void run() {
            C3190a<String, View> h = C0677v.m3483h(this.f2870f, this.f2871g, this.f2872h, this.f2873i);
            if (h != null) {
                this.f2874j.addAll(h.values());
                this.f2874j.add(this.f2875k);
            }
            C0677v.m3481f(this.f2876l, this.f2877m, this.f2878n, h, false);
            Object obj = this.f2872h;
            if (obj != null) {
                this.f2870f.mo3578A(obj, this.f2879o, this.f2874j);
                View t = C0677v.m3495t(h, this.f2873i, this.f2880p, this.f2878n);
                if (t != null) {
                    this.f2870f.mo3614k(t, this.f2881q);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.v$g */
    interface C0684g {
        /* renamed from: a */
        void mo3467a(Fragment fragment, C3307a aVar);

        /* renamed from: b */
        void mo3468b(Fragment fragment, C3307a aVar);
    }

    /* renamed from: androidx.fragment.app.v$h */
    static class C0685h {

        /* renamed from: a */
        public Fragment f2882a;

        /* renamed from: b */
        public boolean f2883b;

        /* renamed from: c */
        public C0628a f2884c;

        /* renamed from: d */
        public Fragment f2885d;

        /* renamed from: e */
        public boolean f2886e;

        /* renamed from: f */
        public C0628a f2887f;

        C0685h() {
        }
    }

    /* renamed from: A */
    private static void m3473A(C0692x xVar, Object obj, Object obj2, C3190a<String, View> aVar, boolean z, C0628a aVar2) {
        ArrayList<String> arrayList = aVar2.f2833n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z ? aVar2.f2834o : aVar2.f2833n).get(0));
            xVar.mo3592v(obj, view);
            if (obj2 != null) {
                xVar.mo3592v(obj2, view);
            }
        }
    }

    /* renamed from: B */
    static void m3474B(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: C */
    static void m3475C(C0653m mVar, ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0684g gVar) {
        C0653m mVar2 = mVar;
        ArrayList<C0628a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (mVar2.f2757n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                C0628a aVar = arrayList3.get(i4);
                if (arrayList4.get(i4).booleanValue()) {
                    m3480e(aVar, sparseArray, z2);
                } else {
                    m3478c(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(mVar2.f2758o.mo3377h());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    C3190a<String, String> d = m3479d(keyAt, arrayList3, arrayList4, i, i3);
                    C0685h hVar = (C0685h) sparseArray.valueAt(i5);
                    C0653m mVar3 = mVar;
                    View view2 = view;
                    C0684g gVar2 = gVar;
                    if (z2) {
                        m3490o(mVar3, keyAt, hVar, view2, d, gVar2);
                    } else {
                        m3489n(mVar3, keyAt, hVar, view2, d, gVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3476a(ArrayList<View> arrayList, C3190a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m = aVar.mo11141m(size);
            if (collection.contains(C3403t.m14606G(m))) {
                arrayList.add(m);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f2629p != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.f2596D == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3477b(androidx.fragment.app.C0628a r8, androidx.fragment.app.C0675u.C0676a r9, android.util.SparseArray<androidx.fragment.app.C0677v.C0685h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f2838b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f2594B
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f2845a
            int r9 = r9.f2837a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f2837a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f2609Q
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.f2596D
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f2629p
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.f2596D
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f2609Q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2629p
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2596D
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f2629p
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2596D
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.f2629p
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f2604L
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f2610R
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2596D
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.f2608P
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f2629p
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f2596D
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0090:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.v$h r6 = (androidx.fragment.app.C0677v.C0685h) r6
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.v$h r6 = m3491p(r6, r10, r1)
            r6.f2882a = r0
            r6.f2883b = r11
            r6.f2884c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            if (r6 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r9 = r6.f2885d
            if (r9 != r0) goto L_0x00af
            r6.f2885d = r2
        L_0x00af:
            androidx.fragment.app.m r9 = r8.f2661r
            int r7 = r0.f2619f
            if (r7 >= r3) goto L_0x00c3
            int r7 = r9.f2757n
            if (r7 < r3) goto L_0x00c3
            boolean r7 = r8.f2835p
            if (r7 != 0) goto L_0x00c3
            r9.mo3458u0(r0)
            r9.mo3396A0(r0, r3)
        L_0x00c3:
            if (r5 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r9 = r6.f2885d
            if (r9 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.v$h r6 = m3491p(r6, r10, r1)
            r6.f2885d = r0
            r6.f2886e = r11
            r6.f2887f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r6.f2882a
            if (r8 != r0) goto L_0x00e1
            r6.f2882a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0677v.m3477b(androidx.fragment.app.a, androidx.fragment.app.u$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m3478c(C0628a aVar, SparseArray<C0685h> sparseArray, boolean z) {
        int size = aVar.f2820a.size();
        for (int i = 0; i < size; i++) {
            m3477b(aVar, aVar.f2820a.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C3190a<String, String> m3479d(int i, ArrayList<C0628a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C3190a<String, String> aVar = new C3190a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0628a aVar2 = arrayList.get(i4);
            if (aVar2.mo3255C(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2833n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2833n;
                        arrayList4 = aVar2.f2834o;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2833n;
                        arrayList3 = aVar2.f2834o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static void m3480e(C0628a aVar, SparseArray<C0685h> sparseArray, boolean z) {
        if (aVar.f2661r.f2759p.mo3250f()) {
            for (int size = aVar.f2820a.size() - 1; size >= 0; size--) {
                m3477b(aVar, aVar.f2820a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: f */
    static void m3481f(Fragment fragment, Fragment fragment2, boolean z, C3190a<String, View> aVar, boolean z2) {
        C0585l A = z ? fragment2.mo3129A() : fragment.mo3129A();
        if (A != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo11139i(i));
                arrayList.add(aVar.mo11141m(i));
            }
            if (z2) {
                A.mo2871c(arrayList2, arrayList, (List<View>) null);
            } else {
                A.mo2870b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: g */
    private static boolean m3482g(C0692x xVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!xVar.mo3583e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C3190a<String, View> m3483h(C0692x xVar, C3190a<String, String> aVar, Object obj, C0685h hVar) {
        C0585l lVar;
        ArrayList<String> arrayList;
        String q;
        Fragment fragment = hVar.f2882a;
        View V = fragment.mo3175V();
        if (aVar.isEmpty() || obj == null || V == null) {
            aVar.clear();
            return null;
        }
        C3190a<String, View> aVar2 = new C3190a<>();
        xVar.mo3613j(aVar2, V);
        C0628a aVar3 = hVar.f2884c;
        if (hVar.f2883b) {
            lVar = fragment.mo3135C();
            arrayList = aVar3.f2833n;
        } else {
            lVar = fragment.mo3129A();
            arrayList = aVar3.f2834o;
        }
        if (arrayList != null) {
            aVar2.mo11014o(arrayList);
            aVar2.mo11014o(aVar.values());
        }
        if (lVar != null) {
            lVar.mo2869a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    String q2 = m3492q(aVar, str);
                    if (q2 != null) {
                        aVar.remove(q2);
                    }
                } else if (!str.equals(C3403t.m14606G(view)) && (q = m3492q(aVar, str)) != null) {
                    aVar.put(q, C3403t.m14606G(view));
                }
            }
        } else {
            m3500y(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: i */
    private static C3190a<String, View> m3484i(C0692x xVar, C3190a<String, String> aVar, Object obj, C0685h hVar) {
        C0585l lVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2885d;
        C3190a<String, View> aVar2 = new C3190a<>();
        xVar.mo3613j(aVar2, fragment.mo3222p1());
        C0628a aVar3 = hVar.f2887f;
        if (hVar.f2886e) {
            lVar = fragment.mo3129A();
            arrayList = aVar3.f2834o;
        } else {
            lVar = fragment.mo3135C();
            arrayList = aVar3.f2833n;
        }
        if (arrayList != null) {
            aVar2.mo11014o(arrayList);
        }
        if (lVar != null) {
            lVar.mo2869a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C3403t.m14606G(view))) {
                    aVar.put(C3403t.m14606G(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo11014o(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: j */
    private static C0692x m3485j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object B = fragment.mo3132B();
            if (B != null) {
                arrayList.add(B);
            }
            Object O = fragment.mo3162O();
            if (O != null) {
                arrayList.add(O);
            }
            Object Q = fragment.mo3165Q();
            if (Q != null) {
                arrayList.add(Q);
            }
        }
        if (fragment2 != null) {
            Object z = fragment2.mo3245z();
            if (z != null) {
                arrayList.add(z);
            }
            Object L = fragment2.mo3157L();
            if (L != null) {
                arrayList.add(L);
            }
            Object P = fragment2.mo3163P();
            if (P != null) {
                arrayList.add(P);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0692x xVar = f2846b;
        if (xVar != null && m3482g(xVar, arrayList)) {
            return f2846b;
        }
        C0692x xVar2 = f2847c;
        if (xVar2 != null && m3482g(xVar2, arrayList)) {
            return f2847c;
        }
        if (f2846b == null && f2847c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m3486k(C0692x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View V = fragment.mo3175V();
        if (V != null) {
            xVar.mo3612f(arrayList2, V);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        xVar.mo3581b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m3487l(C0692x xVar, ViewGroup viewGroup, View view, C3190a<String, String> aVar, C0685h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C3190a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0692x xVar2 = xVar;
        C0685h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2882a;
        Fragment fragment2 = hVar2.f2885d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2883b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m3496u(xVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C3190a<String, View> i = m3484i(xVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m3481f(fragment, fragment2, z, i, true);
        if (obj4 != null) {
            rect = new Rect();
            xVar2.mo3594z(obj4, view, arrayList3);
            m3473A(xVar, obj4, obj2, i, hVar2.f2886e, hVar2.f2887f);
            if (obj5 != null) {
                xVar2.mo3591u(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0683f fVar = r0;
        C0683f fVar2 = new C0683f(xVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C3400q.m14595a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: m */
    private static Object m3488m(C0692x xVar, ViewGroup viewGroup, View view, C3190a<String, String> aVar, C0685h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C0692x xVar2 = xVar;
        View view3 = view;
        C3190a<String, String> aVar2 = aVar;
        C0685h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f2882a;
        Fragment fragment2 = hVar2.f2885d;
        if (fragment != null) {
            fragment.mo3222p1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2883b;
        Object u = aVar.isEmpty() ? null : m3496u(xVar, fragment, fragment2, z);
        C3190a<String, View> i = m3484i(xVar, aVar2, u, hVar2);
        C3190a<String, View> h = m3483h(xVar, aVar2, u, hVar2);
        if (aVar.isEmpty()) {
            if (i != null) {
                i.clear();
            }
            if (h != null) {
                h.clear();
            }
            obj3 = null;
        } else {
            m3476a(arrayList3, i, aVar.keySet());
            m3476a(arrayList4, h, aVar.values());
            obj3 = u;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m3481f(fragment, fragment2, z, i, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            xVar.mo3594z(obj3, view3, arrayList3);
            m3473A(xVar, obj3, obj2, i, hVar2.f2886e, hVar2.f2887f);
            Rect rect2 = new Rect();
            View t = m3495t(h, hVar2, obj4, z);
            if (t != null) {
                xVar.mo3591u(obj4, rect2);
            }
            rect = rect2;
            view2 = t;
        } else {
            view2 = null;
            rect = null;
        }
        C3400q.m14595a(viewGroup, new C0682e(fragment, fragment2, z, h, view2, xVar, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m3489n(C0653m mVar, int i, C0685h hVar, View view, C3190a<String, String> aVar, C0684g gVar) {
        Fragment fragment;
        Fragment fragment2;
        C0692x j;
        Object obj;
        C0653m mVar2 = mVar;
        C0685h hVar2 = hVar;
        View view2 = view;
        C3190a<String, String> aVar2 = aVar;
        C0684g gVar2 = gVar;
        ViewGroup viewGroup = mVar2.f2759p.mo3250f() ? (ViewGroup) mVar2.f2759p.mo3249e(i) : null;
        if (viewGroup != null && (j = m3485j(fragment2, fragment)) != null) {
            boolean z = hVar2.f2883b;
            boolean z2 = hVar2.f2886e;
            Object r = m3493r(j, (fragment = hVar2.f2882a), z);
            Object s = m3494s(j, (fragment2 = hVar2.f2885d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = s;
            Object obj3 = r;
            C0692x xVar = j;
            Fragment fragment3 = fragment2;
            Object l = m3487l(j, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
            Object obj4 = obj3;
            if (obj4 == null && l == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k = m3486k(xVar, obj, fragment3, arrayList4, view2);
            Object obj5 = (k == null || k.isEmpty()) ? null : obj;
            xVar.mo3580a(obj4, view2);
            Object v = m3497v(xVar, obj4, obj5, l, fragment, hVar2.f2883b);
            if (!(fragment3 == null || k == null || (k.size() <= 0 && arrayList4.size() <= 0))) {
                C3307a aVar3 = new C3307a();
                gVar2.mo3468b(fragment3, aVar3);
                xVar.mo3593w(fragment3, v, aVar3, new C0680c(gVar2, fragment3, aVar3));
            }
            if (v != null) {
                ArrayList arrayList5 = new ArrayList();
                C0692x xVar2 = xVar;
                xVar2.mo3590t(v, obj4, arrayList5, obj5, k, l, arrayList2);
                m3501z(xVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, k);
                ArrayList arrayList6 = arrayList2;
                C3190a<String, String> aVar4 = aVar;
                xVar.mo3617x(viewGroup, arrayList6, aVar4);
                xVar.mo3582c(viewGroup, v);
                xVar.mo3616s(viewGroup, arrayList6, aVar4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r4.f2882a;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3490o(androidx.fragment.app.C0653m r17, int r18, androidx.fragment.app.C0677v.C0685h r19, android.view.View r20, p086f.p102e.C3190a<java.lang.String, java.lang.String> r21, androidx.fragment.app.C0677v.C0684g r22) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            r10 = r22
            androidx.fragment.app.f r1 = r0.f2759p
            boolean r1 = r1.mo3250f()
            if (r1 == 0) goto L_0x001b
            androidx.fragment.app.f r0 = r0.f2759p
            r1 = r18
            android.view.View r0 = r0.mo3249e(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r11 = r0
            if (r11 != 0) goto L_0x0020
            return
        L_0x0020:
            androidx.fragment.app.Fragment r12 = r4.f2882a
            androidx.fragment.app.Fragment r13 = r4.f2885d
            androidx.fragment.app.x r14 = m3485j(r13, r12)
            if (r14 != 0) goto L_0x002b
            return
        L_0x002b:
            boolean r15 = r4.f2883b
            boolean r0 = r4.f2886e
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Object r6 = m3493r(r14, r12, r15)
            java.lang.Object r5 = m3494s(r14, r13, r0)
            r0 = r14
            r1 = r11
            r2 = r20
            r3 = r21
            r4 = r19
            r17 = r5
            r5 = r7
            r18 = r6
            r6 = r8
            r16 = r11
            r11 = r7
            r7 = r18
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m3488m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0066
            if (r8 != 0) goto L_0x0066
            r7 = r17
            if (r7 != 0) goto L_0x0068
            return
        L_0x0066:
            r7 = r17
        L_0x0068:
            java.util.ArrayList r5 = m3486k(r14, r7, r13, r11, r9)
            java.util.ArrayList r9 = m3486k(r14, r6, r12, r10, r9)
            r0 = 4
            m3474B(r9, r0)
            r0 = r14
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r12
            r12 = r5
            r5 = r15
            java.lang.Object r15 = m3497v(r0, r1, r2, r3, r4, r5)
            if (r13 == 0) goto L_0x00a1
            if (r12 == 0) goto L_0x00a1
            int r0 = r12.size()
            if (r0 > 0) goto L_0x008f
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
        L_0x008f:
            f.h.i.a r0 = new f.h.i.a
            r0.<init>()
            r1 = r22
            r1.mo3468b(r13, r0)
            androidx.fragment.app.v$a r2 = new androidx.fragment.app.v$a
            r2.<init>(r1, r13, r0)
            r14.mo3593w(r13, r15, r0, r2)
        L_0x00a1:
            if (r15 == 0) goto L_0x00cb
            m3498w(r14, r7, r13, r12)
            java.util.ArrayList r13 = r14.mo3615o(r10)
            r0 = r14
            r1 = r15
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r12
            r6 = r8
            r7 = r10
            r0.mo3590t(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r14.mo3582c(r0, r15)
            r1 = r14
            r2 = r0
            r3 = r11
            r4 = r10
            r5 = r13
            r6 = r21
            r1.mo3618y(r2, r3, r4, r5, r6)
            r0 = 0
            m3474B(r9, r0)
            r14.mo3578A(r8, r11, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0677v.m3490o(androidx.fragment.app.m, int, androidx.fragment.app.v$h, android.view.View, f.e.a, androidx.fragment.app.v$g):void");
    }

    /* renamed from: p */
    private static C0685h m3491p(C0685h hVar, SparseArray<C0685h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0685h hVar2 = new C0685h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static String m3492q(C3190a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo11141m(i))) {
                return aVar.mo11139i(i);
            }
        }
        return null;
    }

    /* renamed from: r */
    private static Object m3493r(C0692x xVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return xVar.mo3584g(z ? fragment.mo3157L() : fragment.mo3245z());
    }

    /* renamed from: s */
    private static Object m3494s(C0692x xVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return xVar.mo3584g(z ? fragment.mo3162O() : fragment.mo3132B());
    }

    /* renamed from: t */
    static View m3495t(C3190a<String, View> aVar, C0685h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0628a aVar2 = hVar.f2884c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2833n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.f2833n : aVar2.f2834o).get(0));
    }

    /* renamed from: u */
    private static Object m3496u(C0692x xVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return xVar.mo3579B(xVar.mo3584g(z ? fragment2.mo3165Q() : fragment.mo3163P()));
    }

    /* renamed from: v */
    private static Object m3497v(C0692x xVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo3227s() : fragment.mo3221p() ? xVar.mo3586n(obj2, obj, obj3) : xVar.mo3585m(obj2, obj, obj3);
    }

    /* renamed from: w */
    private static void m3498w(C0692x xVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2629p && fragment.f2596D && fragment.f2609Q) {
            fragment.mo3239w1(true);
            xVar.mo3589r(obj, fragment.mo3175V(), arrayList);
            C3400q.m14595a(fragment.f2603K, new C0679b(arrayList));
        }
    }

    /* renamed from: x */
    private static C0692x m3499x() {
        try {
            return (C0692x) Class.forName("f.s.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: y */
    private static void m3500y(C3190a<String, String> aVar, C3190a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo11141m(size))) {
                aVar.mo5868k(size);
            }
        }
    }

    /* renamed from: z */
    private static void m3501z(C0692x xVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C3400q.m14595a(viewGroup, new C0681d(obj, xVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
