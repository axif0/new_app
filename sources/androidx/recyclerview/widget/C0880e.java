package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086f.p111h.p122m.C3403t;

/* renamed from: androidx.recyclerview.widget.e */
public class C0880e extends C0919q {

    /* renamed from: s */
    private static TimeInterpolator f3529s;

    /* renamed from: h */
    private ArrayList<RecyclerView.C0829d0> f3530h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.C0829d0> f3531i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0890j> f3532j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0889i> f3533k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.C0829d0>> f3534l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0890j>> f3535m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0889i>> f3536n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.C0829d0> f3537o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.C0829d0> f3538p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.C0829d0> f3539q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.C0829d0> f3540r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    class C0881a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3541f;

        C0881a(ArrayList arrayList) {
            this.f3541f = arrayList;
        }

        public void run() {
            Iterator it = this.f3541f.iterator();
            while (it.hasNext()) {
                C0890j jVar = (C0890j) it.next();
                C0880e.this.mo4737S(jVar.f3575a, jVar.f3576b, jVar.f3577c, jVar.f3578d, jVar.f3579e);
            }
            this.f3541f.clear();
            C0880e.this.f3535m.remove(this.f3541f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    class C0882b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3543f;

        C0882b(ArrayList arrayList) {
            this.f3543f = arrayList;
        }

        public void run() {
            Iterator it = this.f3543f.iterator();
            while (it.hasNext()) {
                C0880e.this.mo4736R((C0889i) it.next());
            }
            this.f3543f.clear();
            C0880e.this.f3536n.remove(this.f3543f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    class C0883c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f3545f;

        C0883c(ArrayList arrayList) {
            this.f3545f = arrayList;
        }

        public void run() {
            Iterator it = this.f3545f.iterator();
            while (it.hasNext()) {
                C0880e.this.mo4735Q((RecyclerView.C0829d0) it.next());
            }
            this.f3545f.clear();
            C0880e.this.f3534l.remove(this.f3545f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    class C0884d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0829d0 f3547a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3548b;

        /* renamed from: c */
        final /* synthetic */ View f3549c;

        C0884d(RecyclerView.C0829d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3547a = d0Var;
            this.f3548b = viewPropertyAnimator;
            this.f3549c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3548b.setListener((Animator.AnimatorListener) null);
            this.f3549c.setAlpha(1.0f);
            C0880e.this.mo4836G(this.f3547a);
            C0880e.this.f3539q.remove(this.f3547a);
            C0880e.this.mo4739V();
        }

        public void onAnimationStart(Animator animator) {
            C0880e.this.mo4837H(this.f3547a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e */
    class C0885e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0829d0 f3551a;

        /* renamed from: b */
        final /* synthetic */ View f3552b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3553c;

        C0885e(RecyclerView.C0829d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3551a = d0Var;
            this.f3552b = view;
            this.f3553c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3552b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3553c.setListener((Animator.AnimatorListener) null);
            C0880e.this.mo4830A(this.f3551a);
            C0880e.this.f3537o.remove(this.f3551a);
            C0880e.this.mo4739V();
        }

        public void onAnimationStart(Animator animator) {
            C0880e.this.mo4831B(this.f3551a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$f */
    class C0886f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0829d0 f3555a;

        /* renamed from: b */
        final /* synthetic */ int f3556b;

        /* renamed from: c */
        final /* synthetic */ View f3557c;

        /* renamed from: d */
        final /* synthetic */ int f3558d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3559e;

        C0886f(RecyclerView.C0829d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3555a = d0Var;
            this.f3556b = i;
            this.f3557c = view;
            this.f3558d = i2;
            this.f3559e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3556b != 0) {
                this.f3557c.setTranslationX(0.0f);
            }
            if (this.f3558d != 0) {
                this.f3557c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3559e.setListener((Animator.AnimatorListener) null);
            C0880e.this.mo4834E(this.f3555a);
            C0880e.this.f3538p.remove(this.f3555a);
            C0880e.this.mo4739V();
        }

        public void onAnimationStart(Animator animator) {
            C0880e.this.mo4835F(this.f3555a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$g */
    class C0887g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0889i f3561a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3562b;

        /* renamed from: c */
        final /* synthetic */ View f3563c;

        C0887g(C0889i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3561a = iVar;
            this.f3562b = viewPropertyAnimator;
            this.f3563c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3562b.setListener((Animator.AnimatorListener) null);
            this.f3563c.setAlpha(1.0f);
            this.f3563c.setTranslationX(0.0f);
            this.f3563c.setTranslationY(0.0f);
            C0880e.this.mo4832C(this.f3561a.f3569a, true);
            C0880e.this.f3540r.remove(this.f3561a.f3569a);
            C0880e.this.mo4739V();
        }

        public void onAnimationStart(Animator animator) {
            C0880e.this.mo4833D(this.f3561a.f3569a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$h */
    class C0888h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0889i f3565a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3566b;

        /* renamed from: c */
        final /* synthetic */ View f3567c;

        C0888h(C0889i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3565a = iVar;
            this.f3566b = viewPropertyAnimator;
            this.f3567c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3566b.setListener((Animator.AnimatorListener) null);
            this.f3567c.setAlpha(1.0f);
            this.f3567c.setTranslationX(0.0f);
            this.f3567c.setTranslationY(0.0f);
            C0880e.this.mo4832C(this.f3565a.f3570b, false);
            C0880e.this.f3540r.remove(this.f3565a.f3570b);
            C0880e.this.mo4739V();
        }

        public void onAnimationStart(Animator animator) {
            C0880e.this.mo4833D(this.f3565a.f3570b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$i */
    private static class C0889i {

        /* renamed from: a */
        public RecyclerView.C0829d0 f3569a;

        /* renamed from: b */
        public RecyclerView.C0829d0 f3570b;

        /* renamed from: c */
        public int f3571c;

        /* renamed from: d */
        public int f3572d;

        /* renamed from: e */
        public int f3573e;

        /* renamed from: f */
        public int f3574f;

        private C0889i(RecyclerView.C0829d0 d0Var, RecyclerView.C0829d0 d0Var2) {
            this.f3569a = d0Var;
            this.f3570b = d0Var2;
        }

        C0889i(RecyclerView.C0829d0 d0Var, RecyclerView.C0829d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f3571c = i;
            this.f3572d = i2;
            this.f3573e = i3;
            this.f3574f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3569a + ", newHolder=" + this.f3570b + ", fromX=" + this.f3571c + ", fromY=" + this.f3572d + ", toX=" + this.f3573e + ", toY=" + this.f3574f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$j */
    private static class C0890j {

        /* renamed from: a */
        public RecyclerView.C0829d0 f3575a;

        /* renamed from: b */
        public int f3576b;

        /* renamed from: c */
        public int f3577c;

        /* renamed from: d */
        public int f3578d;

        /* renamed from: e */
        public int f3579e;

        C0890j(RecyclerView.C0829d0 d0Var, int i, int i2, int i3, int i4) {
            this.f3575a = d0Var;
            this.f3576b = i;
            this.f3577c = i2;
            this.f3578d = i3;
            this.f3579e = i4;
        }
    }

    /* renamed from: T */
    private void m4956T(RecyclerView.C0829d0 d0Var) {
        View view = d0Var.f3359a;
        ViewPropertyAnimator animate = view.animate();
        this.f3539q.add(d0Var);
        animate.setDuration(mo4402o()).alpha(0.0f).setListener(new C0884d(d0Var, animate, view)).start();
    }

    /* renamed from: W */
    private void m4957W(List<C0889i> list, RecyclerView.C0829d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0889i iVar = list.get(size);
            if (m4959Y(iVar, d0Var) && iVar.f3569a == null && iVar.f3570b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: X */
    private void m4958X(C0889i iVar) {
        RecyclerView.C0829d0 d0Var = iVar.f3569a;
        if (d0Var != null) {
            m4959Y(iVar, d0Var);
        }
        RecyclerView.C0829d0 d0Var2 = iVar.f3570b;
        if (d0Var2 != null) {
            m4959Y(iVar, d0Var2);
        }
    }

    /* renamed from: Y */
    private boolean m4959Y(C0889i iVar, RecyclerView.C0829d0 d0Var) {
        boolean z = false;
        if (iVar.f3570b == d0Var) {
            iVar.f3570b = null;
        } else if (iVar.f3569a != d0Var) {
            return false;
        } else {
            iVar.f3569a = null;
            z = true;
        }
        d0Var.f3359a.setAlpha(1.0f);
        d0Var.f3359a.setTranslationX(0.0f);
        d0Var.f3359a.setTranslationY(0.0f);
        mo4832C(d0Var, z);
        return true;
    }

    /* renamed from: Z */
    private void m4960Z(RecyclerView.C0829d0 d0Var) {
        if (f3529s == null) {
            f3529s = new ValueAnimator().getInterpolator();
        }
        d0Var.f3359a.animate().setInterpolator(f3529s);
        mo4397j(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo4735Q(RecyclerView.C0829d0 d0Var) {
        View view = d0Var.f3359a;
        ViewPropertyAnimator animate = view.animate();
        this.f3537o.add(d0Var);
        animate.alpha(1.0f).setDuration(mo4399l()).setListener(new C0885e(d0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo4736R(C0889i iVar) {
        RecyclerView.C0829d0 d0Var = iVar.f3569a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f3359a;
        RecyclerView.C0829d0 d0Var2 = iVar.f3570b;
        if (d0Var2 != null) {
            view = d0Var2.f3359a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo4400m());
            this.f3540r.add(iVar.f3569a);
            duration.translationX((float) (iVar.f3573e - iVar.f3571c));
            duration.translationY((float) (iVar.f3574f - iVar.f3572d));
            duration.alpha(0.0f).setListener(new C0887g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f3540r.add(iVar.f3570b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4400m()).alpha(1.0f).setListener(new C0888h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo4737S(RecyclerView.C0829d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3359a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3538p.add(d0Var);
        animate.setDuration(mo4401n()).setListener(new C0886f(d0Var, i5, view, i6, animate)).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo4738U(List<RecyclerView.C0829d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3359a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo4739V() {
        if (!mo4403p()) {
            mo4396i();
        }
    }

    /* renamed from: g */
    public boolean mo4394g(RecyclerView.C0829d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4394g(d0Var, list);
    }

    /* renamed from: j */
    public void mo4397j(RecyclerView.C0829d0 d0Var) {
        View view = d0Var.f3359a;
        view.animate().cancel();
        int size = this.f3532j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3532j.get(size).f3575a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo4834E(d0Var);
                this.f3532j.remove(size);
            }
        }
        m4957W(this.f3533k, d0Var);
        if (this.f3530h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo4836G(d0Var);
        }
        if (this.f3531i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo4830A(d0Var);
        }
        for (int size2 = this.f3536n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3536n.get(size2);
            m4957W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3536n.remove(size2);
            }
        }
        for (int size3 = this.f3535m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3535m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0890j) arrayList2.get(size4)).f3575a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo4834E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3535m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3534l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3534l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo4830A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3534l.remove(size5);
                }
            }
        }
        this.f3539q.remove(d0Var);
        this.f3537o.remove(d0Var);
        this.f3540r.remove(d0Var);
        this.f3538p.remove(d0Var);
        mo4739V();
    }

    /* renamed from: k */
    public void mo4398k() {
        int size = this.f3532j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0890j jVar = this.f3532j.get(size);
            View view = jVar.f3575a.f3359a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo4834E(jVar.f3575a);
            this.f3532j.remove(size);
        }
        for (int size2 = this.f3530h.size() - 1; size2 >= 0; size2--) {
            mo4836G(this.f3530h.get(size2));
            this.f3530h.remove(size2);
        }
        int size3 = this.f3531i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0829d0 d0Var = this.f3531i.get(size3);
            d0Var.f3359a.setAlpha(1.0f);
            mo4830A(d0Var);
            this.f3531i.remove(size3);
        }
        for (int size4 = this.f3533k.size() - 1; size4 >= 0; size4--) {
            m4958X(this.f3533k.get(size4));
        }
        this.f3533k.clear();
        if (mo4403p()) {
            for (int size5 = this.f3535m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3535m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0890j jVar2 = (C0890j) arrayList.get(size6);
                    View view2 = jVar2.f3575a.f3359a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo4834E(jVar2.f3575a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3535m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3534l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3534l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C0829d0 d0Var2 = (RecyclerView.C0829d0) arrayList2.get(size8);
                    d0Var2.f3359a.setAlpha(1.0f);
                    mo4830A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3534l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3536n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3536n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m4958X((C0889i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3536n.remove(arrayList3);
                    }
                }
            }
            mo4738U(this.f3539q);
            mo4738U(this.f3538p);
            mo4738U(this.f3537o);
            mo4738U(this.f3540r);
            mo4396i();
        }
    }

    /* renamed from: p */
    public boolean mo4403p() {
        return !this.f3531i.isEmpty() || !this.f3533k.isEmpty() || !this.f3532j.isEmpty() || !this.f3530h.isEmpty() || !this.f3538p.isEmpty() || !this.f3539q.isEmpty() || !this.f3537o.isEmpty() || !this.f3540r.isEmpty() || !this.f3535m.isEmpty() || !this.f3534l.isEmpty() || !this.f3536n.isEmpty();
    }

    /* renamed from: u */
    public void mo4408u() {
        boolean z = !this.f3530h.isEmpty();
        boolean z2 = !this.f3532j.isEmpty();
        boolean z3 = !this.f3533k.isEmpty();
        boolean z4 = !this.f3531i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0829d0> it = this.f3530h.iterator();
            while (it.hasNext()) {
                m4956T(it.next());
            }
            this.f3530h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3532j);
                this.f3535m.add(arrayList);
                this.f3532j.clear();
                C0881a aVar = new C0881a(arrayList);
                if (z) {
                    C3403t.m14629b0(((C0890j) arrayList.get(0)).f3575a.f3359a, aVar, mo4402o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3533k);
                this.f3536n.add(arrayList2);
                this.f3533k.clear();
                C0882b bVar = new C0882b(arrayList2);
                if (z) {
                    C3403t.m14629b0(((C0889i) arrayList2.get(0)).f3569a.f3359a, bVar, mo4402o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3531i);
                this.f3534l.add(arrayList3);
                this.f3531i.clear();
                C0883c cVar = new C0883c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long o = z ? mo4402o() : 0;
                    long n = z2 ? mo4401n() : 0;
                    if (z3) {
                        j = mo4400m();
                    }
                    C3403t.m14629b0(((RecyclerView.C0829d0) arrayList3.get(0)).f3359a, cVar, o + Math.max(n, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: w */
    public boolean mo4740w(RecyclerView.C0829d0 d0Var) {
        m4960Z(d0Var);
        d0Var.f3359a.setAlpha(0.0f);
        this.f3531i.add(d0Var);
        return true;
    }

    /* renamed from: x */
    public boolean mo4741x(RecyclerView.C0829d0 d0Var, RecyclerView.C0829d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo4742y(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f3359a.getTranslationX();
        float translationY = d0Var.f3359a.getTranslationY();
        float alpha = d0Var.f3359a.getAlpha();
        m4960Z(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f3359a.setTranslationX(translationX);
        d0Var.f3359a.setTranslationY(translationY);
        d0Var.f3359a.setAlpha(alpha);
        if (d0Var2 != null) {
            m4960Z(d0Var2);
            d0Var2.f3359a.setTranslationX((float) (-i5));
            d0Var2.f3359a.setTranslationY((float) (-i6));
            d0Var2.f3359a.setAlpha(0.0f);
        }
        this.f3533k.add(new C0889i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: y */
    public boolean mo4742y(RecyclerView.C0829d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f3359a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f3359a.getTranslationY());
        m4960Z(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo4834E(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f3532j.add(new C0890j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: z */
    public boolean mo4743z(RecyclerView.C0829d0 d0Var) {
        m4960Z(d0Var);
        this.f3530h.add(d0Var);
        return true;
    }
}
