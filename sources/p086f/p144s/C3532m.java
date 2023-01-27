package p086f.p144s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086f.p102e.C3190a;
import p086f.p102e.C3195d;
import p086f.p102e.C3203g;
import p086f.p111h.p122m.C3403t;

/* renamed from: f.s.m */
public abstract class C3532m implements Cloneable {

    /* renamed from: L */
    private static final int[] f10982L = {2, 1, 3, 4};

    /* renamed from: M */
    private static final C3517g f10983M = new C3533a();

    /* renamed from: N */
    private static ThreadLocal<C3190a<Animator, C3536d>> f10984N = new ThreadLocal<>();

    /* renamed from: A */
    boolean f10985A = false;

    /* renamed from: B */
    ArrayList<Animator> f10986B = new ArrayList<>();

    /* renamed from: C */
    private int f10987C = 0;

    /* renamed from: D */
    private boolean f10988D = false;

    /* renamed from: E */
    private boolean f10989E = false;

    /* renamed from: F */
    private ArrayList<C3538f> f10990F = null;

    /* renamed from: G */
    private ArrayList<Animator> f10991G = new ArrayList<>();

    /* renamed from: H */
    C3544p f10992H;

    /* renamed from: I */
    private C3537e f10993I;

    /* renamed from: J */
    private C3190a<String, String> f10994J;

    /* renamed from: K */
    private C3517g f10995K = f10983M;

    /* renamed from: f */
    private String f10996f = getClass().getName();

    /* renamed from: g */
    private long f10997g = -1;

    /* renamed from: h */
    long f10998h = -1;

    /* renamed from: i */
    private TimeInterpolator f10999i = null;

    /* renamed from: j */
    ArrayList<Integer> f11000j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<View> f11001k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<String> f11002l = null;

    /* renamed from: m */
    private ArrayList<Class<?>> f11003m = null;

    /* renamed from: n */
    private ArrayList<Integer> f11004n = null;

    /* renamed from: o */
    private ArrayList<View> f11005o = null;

    /* renamed from: p */
    private ArrayList<Class<?>> f11006p = null;

    /* renamed from: q */
    private ArrayList<String> f11007q = null;

    /* renamed from: r */
    private ArrayList<Integer> f11008r = null;

    /* renamed from: s */
    private ArrayList<View> f11009s = null;

    /* renamed from: t */
    private ArrayList<Class<?>> f11010t = null;

    /* renamed from: u */
    private C3550t f11011u = new C3550t();

    /* renamed from: v */
    private C3550t f11012v = new C3550t();

    /* renamed from: w */
    C3545q f11013w = null;

    /* renamed from: x */
    private int[] f11014x = f10982L;

    /* renamed from: y */
    private ArrayList<C3549s> f11015y;

    /* renamed from: z */
    private ArrayList<C3549s> f11016z;

    /* renamed from: f.s.m$a */
    static class C3533a extends C3517g {
        C3533a() {
        }

        /* renamed from: a */
        public Path mo11929a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: f.s.m$b */
    class C3534b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3190a f11017a;

        C3534b(C3190a aVar) {
            this.f11017a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11017a.remove(animator);
            C3532m.this.f10986B.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C3532m.this.f10986B.add(animator);
        }
    }

    /* renamed from: f.s.m$c */
    class C3535c extends AnimatorListenerAdapter {
        C3535c() {
        }

        public void onAnimationEnd(Animator animator) {
            C3532m.this.mo11983t();
            animator.removeListener(this);
        }
    }

    /* renamed from: f.s.m$d */
    private static class C3536d {

        /* renamed from: a */
        View f11020a;

        /* renamed from: b */
        String f11021b;

        /* renamed from: c */
        C3549s f11022c;

        /* renamed from: d */
        C3539m0 f11023d;

        /* renamed from: e */
        C3532m f11024e;

        C3536d(View view, String str, C3532m mVar, C3539m0 m0Var, C3549s sVar) {
            this.f11020a = view;
            this.f11021b = str;
            this.f11022c = sVar;
            this.f11023d = m0Var;
            this.f11024e = mVar;
        }
    }

    /* renamed from: f.s.m$e */
    public static abstract class C3537e {
    }

    /* renamed from: f.s.m$f */
    public interface C3538f {
        /* renamed from: a */
        void mo11925a(C3532m mVar);

        /* renamed from: b */
        void mo11903b(C3532m mVar);

        /* renamed from: c */
        void mo11904c(C3532m mVar);

        /* renamed from: d */
        void mo11905d(C3532m mVar);

        /* renamed from: e */
        void mo11906e(C3532m mVar);
    }

    /* renamed from: C */
    private static C3190a<Animator, C3536d> m15134C() {
        C3190a<Animator, C3536d> aVar = f10984N.get();
        if (aVar != null) {
            return aVar;
        }
        C3190a<Animator, C3536d> aVar2 = new C3190a<>();
        f10984N.set(aVar2);
        return aVar2;
    }

    /* renamed from: N */
    private static boolean m15135N(C3549s sVar, C3549s sVar2, String str) {
        Object obj = sVar.f11042a.get(str);
        Object obj2 = sVar2.f11042a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: O */
    private void m15136O(C3190a<View, C3549s> aVar, C3190a<View, C3549s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo11958M(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo11958M(view)) {
                C3549s sVar = aVar.get(valueAt);
                C3549s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f11015y.add(sVar);
                    this.f11016z.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    private void m15137P(C3190a<View, C3549s> aVar, C3190a<View, C3549s> aVar2) {
        C3549s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i = aVar.mo11139i(size);
            if (i != null && mo11958M(i) && (remove = aVar2.remove(i)) != null && mo11958M(remove.f11043b)) {
                this.f11015y.add(aVar.mo5868k(size));
                this.f11016z.add(remove);
            }
        }
    }

    /* renamed from: R */
    private void m15138R(C3190a<View, C3549s> aVar, C3190a<View, C3549s> aVar2, C3195d<View> dVar, C3195d<View> dVar2) {
        View f;
        int q = dVar.mo11057q();
        for (int i = 0; i < q; i++) {
            View r = dVar.mo11058r(i);
            if (r != null && mo11958M(r) && (f = dVar2.mo11050f(dVar.mo11053k(i))) != null && mo11958M(f)) {
                C3549s sVar = aVar.get(r);
                C3549s sVar2 = aVar2.get(f);
                if (!(sVar == null || sVar2 == null)) {
                    this.f11015y.add(sVar);
                    this.f11016z.add(sVar2);
                    aVar.remove(r);
                    aVar2.remove(f);
                }
            }
        }
    }

    /* renamed from: T */
    private void m15139T(C3190a<View, C3549s> aVar, C3190a<View, C3549s> aVar2, C3190a<String, View> aVar3, C3190a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View m = aVar3.mo11141m(i);
            if (m != null && mo11958M(m) && (view = aVar4.get(aVar3.mo11139i(i))) != null && mo11958M(view)) {
                C3549s sVar = aVar.get(m);
                C3549s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f11015y.add(sVar);
                    this.f11016z.add(sVar2);
                    aVar.remove(m);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: U */
    private void m15140U(C3550t tVar, C3550t tVar2) {
        C3190a aVar = new C3190a((C3203g) tVar.f11045a);
        C3190a aVar2 = new C3190a((C3203g) tVar2.f11045a);
        int i = 0;
        while (true) {
            int[] iArr = this.f11014x;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m15137P(aVar, aVar2);
                } else if (i2 == 2) {
                    m15139T(aVar, aVar2, tVar.f11048d, tVar2.f11048d);
                } else if (i2 == 3) {
                    m15136O(aVar, aVar2, tVar.f11046b, tVar2.f11046b);
                } else if (i2 == 4) {
                    m15138R(aVar, aVar2, tVar.f11047c, tVar2.f11047c);
                }
                i++;
            } else {
                m15142d(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: b0 */
    private void m15141b0(Animator animator, C3190a<Animator, C3536d> aVar) {
        if (animator != null) {
            animator.addListener(new C3534b(aVar));
            mo11971f(animator);
        }
    }

    /* renamed from: d */
    private void m15142d(C3190a<View, C3549s> aVar, C3190a<View, C3549s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C3549s m = aVar.mo11141m(i);
            if (mo11958M(m.f11043b)) {
                this.f11015y.add(m);
                this.f11016z.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C3549s m2 = aVar2.mo11141m(i2);
            if (mo11958M(m2.f11043b)) {
                this.f11016z.add(m2);
                this.f11015y.add((Object) null);
            }
        }
    }

    /* renamed from: e */
    private static void m15143e(C3550t tVar, View view, C3549s sVar) {
        tVar.f11045a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f11046b.indexOfKey(id) >= 0) {
                tVar.f11046b.put(id, (Object) null);
            } else {
                tVar.f11046b.put(id, view);
            }
        }
        String G = C3403t.m14606G(view);
        if (G != null) {
            if (tVar.f11048d.containsKey(G)) {
                tVar.f11048d.put(G, null);
            } else {
                tVar.f11048d.put(G, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f11047c.mo11052i(itemIdAtPosition) >= 0) {
                    View f = tVar.f11047c.mo11050f(itemIdAtPosition);
                    if (f != null) {
                        C3403t.m14661r0(f, false);
                        tVar.f11047c.mo11054l(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C3403t.m14661r0(view, true);
                tVar.f11047c.mo11054l(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: i */
    private void m15144i(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f11004n;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f11005o;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f11006p;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f11006p.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C3549s sVar = new C3549s(view);
                        if (z) {
                            mo11874l(sVar);
                        } else {
                            mo11873g(sVar);
                        }
                        sVar.f11044c.add(this);
                        mo11977k(sVar);
                        m15143e(z ? this.f11011u : this.f11012v, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f11008r;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f11009s;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f11010t;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f11010t.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m15144i(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public C3517g mo11950A() {
        return this.f10995K;
    }

    /* renamed from: B */
    public C3544p mo11951B() {
        return this.f10992H;
    }

    /* renamed from: D */
    public long mo11952D() {
        return this.f10997g;
    }

    /* renamed from: E */
    public List<Integer> mo11953E() {
        return this.f11000j;
    }

    /* renamed from: F */
    public List<String> mo11954F() {
        return this.f11002l;
    }

    /* renamed from: G */
    public List<Class<?>> mo11955G() {
        return this.f11003m;
    }

    /* renamed from: I */
    public List<View> mo11956I() {
        return this.f11001k;
    }

    /* renamed from: J */
    public String[] mo11872J() {
        return null;
    }

    /* renamed from: K */
    public C3549s mo11957K(View view, boolean z) {
        C3545q qVar = this.f11013w;
        if (qVar != null) {
            return qVar.mo11957K(view, z);
        }
        return (z ? this.f11011u : this.f11012v).f11045a.get(view);
    }

    /* renamed from: L */
    public boolean mo11935L(C3549s sVar, C3549s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] J = mo11872J();
        if (J != null) {
            int length = J.length;
            int i = 0;
            while (i < length) {
                if (!m15135N(sVar, sVar2, J[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String N : sVar.f11042a.keySet()) {
            if (m15135N(sVar, sVar2, N)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo11958M(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f11004n;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f11005o;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f11006p;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f11006p.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f11007q != null && C3403t.m14606G(view) != null && this.f11007q.contains(C3403t.m14606G(view))) {
            return false;
        }
        if ((this.f11000j.size() == 0 && this.f11001k.size() == 0 && (((arrayList = this.f11003m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11002l) == null || arrayList2.isEmpty()))) || this.f11000j.contains(Integer.valueOf(id)) || this.f11001k.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f11002l;
        if (arrayList6 != null && arrayList6.contains(C3403t.m14606G(view))) {
            return true;
        }
        if (this.f11003m != null) {
            for (int i2 = 0; i2 < this.f11003m.size(); i2++) {
                if (this.f11003m.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: V */
    public void mo11959V(View view) {
        if (!this.f10989E) {
            C3190a<Animator, C3536d> C = m15134C();
            int size = C.size();
            C3539m0 d = C3502c0.m15039d(view);
            for (int i = size - 1; i >= 0; i--) {
                C3536d m = C.mo11141m(i);
                if (m.f11020a != null && d.equals(m.f11023d)) {
                    C3485a.m15004b(C.mo11139i(i));
                }
            }
            ArrayList<C3538f> arrayList = this.f10990F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10990F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C3538f) arrayList2.get(i2)).mo11904c(this);
                }
            }
            this.f10988D = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo11960W(ViewGroup viewGroup) {
        C3536d dVar;
        this.f11015y = new ArrayList<>();
        this.f11016z = new ArrayList<>();
        m15140U(this.f11011u, this.f11012v);
        C3190a<Animator, C3536d> C = m15134C();
        int size = C.size();
        C3539m0 d = C3502c0.m15039d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator i2 = C.mo11139i(i);
            if (!(i2 == null || (dVar = C.get(i2)) == null || dVar.f11020a == null || !d.equals(dVar.f11023d))) {
                C3549s sVar = dVar.f11022c;
                View view = dVar.f11020a;
                C3549s K = mo11957K(view, true);
                C3549s y = mo11988y(view, true);
                if (K == null && y == null) {
                    y = this.f11012v.f11045a.get(view);
                }
                if (!(K == null && y == null) && dVar.f11024e.mo11935L(sVar, y)) {
                    if (i2.isRunning() || i2.isStarted()) {
                        i2.cancel();
                    } else {
                        C.remove(i2);
                    }
                }
            }
        }
        mo11982s(viewGroup, this.f11011u, this.f11012v, this.f11015y, this.f11016z);
        mo11966c0();
    }

    /* renamed from: Y */
    public C3532m mo11961Y(C3538f fVar) {
        ArrayList<C3538f> arrayList = this.f10990F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f10990F.size() == 0) {
            this.f10990F = null;
        }
        return this;
    }

    /* renamed from: Z */
    public C3532m mo11962Z(View view) {
        this.f11001k.remove(view);
        return this;
    }

    /* renamed from: a0 */
    public void mo11963a0(View view) {
        if (this.f10988D) {
            if (!this.f10989E) {
                C3190a<Animator, C3536d> C = m15134C();
                int size = C.size();
                C3539m0 d = C3502c0.m15039d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C3536d m = C.mo11141m(i);
                    if (m.f11020a != null && d.equals(m.f11023d)) {
                        C3485a.m15005c(C.mo11139i(i));
                    }
                }
                ArrayList<C3538f> arrayList = this.f10990F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f10990F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C3538f) arrayList2.get(i2)).mo11905d(this);
                    }
                }
            }
            this.f10988D = false;
        }
    }

    /* renamed from: b */
    public C3532m mo11964b(C3538f fVar) {
        if (this.f10990F == null) {
            this.f10990F = new ArrayList<>();
        }
        this.f10990F.add(fVar);
        return this;
    }

    /* renamed from: c */
    public C3532m mo11965c(View view) {
        this.f11001k.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public void mo11966c0() {
        mo11976j0();
        C3190a<Animator, C3536d> C = m15134C();
        Iterator<Animator> it = this.f10991G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (C.containsKey(next)) {
                mo11976j0();
                m15141b0(next, C);
            }
        }
        this.f10991G.clear();
        mo11983t();
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f10986B.size() - 1; size >= 0; size--) {
            this.f10986B.get(size).cancel();
        }
        ArrayList<C3538f> arrayList = this.f10990F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f10990F.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C3538f) arrayList2.get(i)).mo11903b(this);
            }
        }
    }

    /* renamed from: d0 */
    public C3532m mo11969d0(long j) {
        this.f10998h = j;
        return this;
    }

    /* renamed from: e0 */
    public void mo11970e0(C3537e eVar) {
        this.f10993I = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11971f(Animator animator) {
        if (animator == null) {
            mo11983t();
            return;
        }
        if (mo11985u() >= 0) {
            animator.setDuration(mo11985u());
        }
        if (mo11952D() >= 0) {
            animator.setStartDelay(mo11952D() + animator.getStartDelay());
        }
        if (mo11987x() != null) {
            animator.setInterpolator(mo11987x());
        }
        animator.addListener(new C3535c());
        animator.start();
    }

    /* renamed from: f0 */
    public C3532m mo11972f0(TimeInterpolator timeInterpolator) {
        this.f10999i = timeInterpolator;
        return this;
    }

    /* renamed from: g */
    public abstract void mo11873g(C3549s sVar);

    /* renamed from: g0 */
    public void mo11973g0(C3517g gVar) {
        if (gVar == null) {
            gVar = f10983M;
        }
        this.f10995K = gVar;
    }

    /* renamed from: h0 */
    public void mo11974h0(C3544p pVar) {
        this.f10992H = pVar;
    }

    /* renamed from: i0 */
    public C3532m mo11975i0(long j) {
        this.f10997g = j;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo11976j0() {
        if (this.f10987C == 0) {
            ArrayList<C3538f> arrayList = this.f10990F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10990F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C3538f) arrayList2.get(i)).mo11925a(this);
                }
            }
            this.f10989E = false;
        }
        this.f10987C++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo11977k(C3549s sVar) {
        String[] b;
        if (this.f10992H != null && !sVar.f11042a.isEmpty() && (b = this.f10992H.mo11997b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!sVar.f11042a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f10992H.mo11996a(sVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public String mo11978k0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f10998h != -1) {
            str2 = str2 + "dur(" + this.f10998h + ") ";
        }
        if (this.f10997g != -1) {
            str2 = str2 + "dly(" + this.f10997g + ") ";
        }
        if (this.f10999i != null) {
            str2 = str2 + "interp(" + this.f10999i + ") ";
        }
        if (this.f11000j.size() <= 0 && this.f11001k.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f11000j.size() > 0) {
            for (int i = 0; i < this.f11000j.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f11000j.get(i);
            }
        }
        if (this.f11001k.size() > 0) {
            for (int i2 = 0; i2 < this.f11001k.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f11001k.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: l */
    public abstract void mo11874l(C3549s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo11979n(ViewGroup viewGroup, boolean z) {
        C3190a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo11980p(z);
        if ((this.f11000j.size() > 0 || this.f11001k.size() > 0) && (((arrayList = this.f11002l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11003m) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f11000j.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f11000j.get(i).intValue());
                if (findViewById != null) {
                    C3549s sVar = new C3549s(findViewById);
                    if (z) {
                        mo11874l(sVar);
                    } else {
                        mo11873g(sVar);
                    }
                    sVar.f11044c.add(this);
                    mo11977k(sVar);
                    m15143e(z ? this.f11011u : this.f11012v, findViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.f11001k.size(); i2++) {
                View view = this.f11001k.get(i2);
                C3549s sVar2 = new C3549s(view);
                if (z) {
                    mo11874l(sVar2);
                } else {
                    mo11873g(sVar2);
                }
                sVar2.f11044c.add(this);
                mo11977k(sVar2);
                m15143e(z ? this.f11011u : this.f11012v, view, sVar2);
            }
        } else {
            m15144i(viewGroup, z);
        }
        if (!z && (aVar = this.f10994J) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f11011u.f11048d.remove(this.f10994J.mo11139i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f11011u.f11048d.put(this.f10994J.mo11141m(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo11980p(boolean z) {
        C3550t tVar;
        if (z) {
            this.f11011u.f11045a.clear();
            this.f11011u.f11046b.clear();
            tVar = this.f11011u;
        } else {
            this.f11012v.f11045a.clear();
            this.f11012v.f11046b.clear();
            tVar = this.f11012v;
        }
        tVar.f11047c.mo11047c();
    }

    /* renamed from: q */
    public C3532m clone() {
        try {
            C3532m mVar = (C3532m) super.clone();
            mVar.f10991G = new ArrayList<>();
            mVar.f11011u = new C3550t();
            mVar.f11012v = new C3550t();
            mVar.f11015y = null;
            mVar.f11016z = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public Animator mo11875r(ViewGroup viewGroup, C3549s sVar, C3549s sVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo11982s(ViewGroup viewGroup, C3550t tVar, C3550t tVar2, ArrayList<C3549s> arrayList, ArrayList<C3549s> arrayList2) {
        int i;
        int i2;
        Animator r;
        View view;
        Animator animator;
        C3549s sVar;
        C3549s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C3190a<Animator, C3536d> C = m15134C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C3549s sVar3 = arrayList.get(i3);
            C3549s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f11044c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f11044c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || mo11935L(sVar3, sVar4)) && (r = mo11875r(viewGroup2, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f11043b;
                        String[] J = mo11872J();
                        if (J != null && J.length > 0) {
                            sVar2 = new C3549s(view);
                            Animator animator3 = r;
                            i2 = size;
                            C3549s sVar5 = tVar2.f11045a.get(view);
                            if (sVar5 != null) {
                                int i4 = 0;
                                while (i4 < J.length) {
                                    sVar2.f11042a.put(J[i4], sVar5.f11042a.get(J[i4]));
                                    i4++;
                                    ArrayList<C3549s> arrayList3 = arrayList2;
                                    i3 = i3;
                                    sVar5 = sVar5;
                                }
                            }
                            i = i3;
                            int size2 = C.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C3536d dVar = C.get(C.mo11139i(i5));
                                if (dVar.f11022c != null && dVar.f11020a == view && dVar.f11021b.equals(mo11989z()) && dVar.f11022c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = r;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = sVar3.f11043b;
                        animator = r;
                        sVar = null;
                    }
                    if (animator != null) {
                        C3544p pVar = this.f10992H;
                        if (pVar != null) {
                            long c = pVar.mo11998c(viewGroup2, this, sVar3, sVar4);
                            sparseIntArray.put(this.f10991G.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        C.put(animator, new C3536d(view, mo11989z(), this, C3502c0.m15039d(viewGroup), sVar));
                        this.f10991G.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f10991G.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo11983t() {
        int i = this.f10987C - 1;
        this.f10987C = i;
        if (i == 0) {
            ArrayList<C3538f> arrayList = this.f10990F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10990F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C3538f) arrayList2.get(i2)).mo11906e(this);
                }
            }
            for (int i3 = 0; i3 < this.f11011u.f11047c.mo11057q(); i3++) {
                View r = this.f11011u.f11047c.mo11058r(i3);
                if (r != null) {
                    C3403t.m14661r0(r, false);
                }
            }
            for (int i4 = 0; i4 < this.f11012v.f11047c.mo11057q(); i4++) {
                View r2 = this.f11012v.f11047c.mo11058r(i4);
                if (r2 != null) {
                    C3403t.m14661r0(r2, false);
                }
            }
            this.f10989E = true;
        }
    }

    public String toString() {
        return mo11978k0(BuildConfig.FLAVOR);
    }

    /* renamed from: u */
    public long mo11985u() {
        return this.f10998h;
    }

    /* renamed from: v */
    public C3537e mo11986v() {
        return this.f10993I;
    }

    /* renamed from: x */
    public TimeInterpolator mo11987x() {
        return this.f10999i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C3549s mo11988y(View view, boolean z) {
        C3545q qVar = this.f11013w;
        if (qVar != null) {
            return qVar.mo11988y(view, z);
        }
        ArrayList<C3549s> arrayList = z ? this.f11015y : this.f11016z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C3549s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f11043b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f11016z : this.f11015y).get(i);
    }

    /* renamed from: z */
    public String mo11989z() {
        return this.f10996f;
    }
}
