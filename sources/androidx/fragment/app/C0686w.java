package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p118i.C3307a;

/* renamed from: androidx.fragment.app.w */
class C0686w extends C0692x {

    /* renamed from: androidx.fragment.app.w$a */
    class C0687a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2888a;

        C0687a(C0686w wVar, Rect rect) {
            this.f2888a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2888a;
        }
    }

    /* renamed from: androidx.fragment.app.w$b */
    class C0688b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2889a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2890b;

        C0688b(C0686w wVar, View view, ArrayList arrayList) {
            this.f2889a = view;
            this.f2890b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2889a.setVisibility(8);
            int size = this.f2890b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2890b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.w$c */
    class C0689c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2891a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2892b;

        /* renamed from: c */
        final /* synthetic */ Object f2893c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2894d;

        /* renamed from: e */
        final /* synthetic */ Object f2895e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2896f;

        C0689c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2891a = obj;
            this.f2892b = arrayList;
            this.f2893c = obj2;
            this.f2894d = arrayList2;
            this.f2895e = obj3;
            this.f2896f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2891a;
            if (obj != null) {
                C0686w.this.mo3588q(obj, this.f2892b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2893c;
            if (obj2 != null) {
                C0686w.this.mo3588q(obj2, this.f2894d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2895e;
            if (obj3 != null) {
                C0686w.this.mo3588q(obj3, this.f2896f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.w$d */
    class C0690d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f2898a;

        C0690d(C0686w wVar, Runnable runnable) {
            this.f2898a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2898a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.w$e */
    class C0691e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2899a;

        C0691e(C0686w wVar, Rect rect) {
            this.f2899a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2899a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2899a;
        }
    }

    C0686w() {
    }

    /* renamed from: C */
    private static boolean m3504C(Transition transition) {
        return !C0692x.m3525l(transition.getTargetIds()) || !C0692x.m3525l(transition.getTargetNames()) || !C0692x.m3525l(transition.getTargetTypes());
    }

    /* renamed from: A */
    public void mo3578A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3588q(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo3579B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo3580a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: b */
    public void mo3581b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3581b(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3504C(transition) && C0692x.m3525l(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3582c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public boolean mo3583e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: g */
    public Object mo3584g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo3585m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: n */
    public Object mo3586n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: p */
    public void mo3587p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: q */
    public void mo3588q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3588q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m3504C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    /* renamed from: r */
    public void mo3589r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0688b(this, view, arrayList));
    }

    /* renamed from: t */
    public void mo3590t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0689c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo3591u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0691e(this, rect));
        }
    }

    /* renamed from: v */
    public void mo3592v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3614k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0687a(this, rect));
        }
    }

    /* renamed from: w */
    public void mo3593w(Fragment fragment, Object obj, C3307a aVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0690d(this, runnable));
    }

    /* renamed from: z */
    public void mo3594z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0692x.m3522d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3581b(transitionSet, arrayList);
    }
}
