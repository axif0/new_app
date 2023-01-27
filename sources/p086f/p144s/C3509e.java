package p086f.p144s;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0692x;
import java.util.ArrayList;
import java.util.List;
import p086f.p144s.C3532m;

@SuppressLint({"RestrictedApi"})
/* renamed from: f.s.e */
public class C3509e extends C0692x {

    /* renamed from: f.s.e$a */
    class C3510a extends C3532m.C3537e {
        C3510a(C3509e eVar, Rect rect) {
        }
    }

    /* renamed from: f.s.e$b */
    class C3511b implements C3532m.C3538f {

        /* renamed from: a */
        final /* synthetic */ View f10936a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f10937b;

        C3511b(C3509e eVar, View view, ArrayList arrayList) {
            this.f10936a = view;
            this.f10937b = arrayList;
        }

        /* renamed from: a */
        public void mo11925a(C3532m mVar) {
        }

        /* renamed from: b */
        public void mo11903b(C3532m mVar) {
        }

        /* renamed from: c */
        public void mo11904c(C3532m mVar) {
        }

        /* renamed from: d */
        public void mo11905d(C3532m mVar) {
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            mVar.mo11961Y(this);
            this.f10936a.setVisibility(8);
            int size = this.f10937b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f10937b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: f.s.e$c */
    class C3512c extends C3540n {

        /* renamed from: a */
        final /* synthetic */ Object f10938a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f10939b;

        /* renamed from: c */
        final /* synthetic */ Object f10940c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f10941d;

        /* renamed from: e */
        final /* synthetic */ Object f10942e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f10943f;

        C3512c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10938a = obj;
            this.f10939b = arrayList;
            this.f10940c = obj2;
            this.f10941d = arrayList2;
            this.f10942e = obj3;
            this.f10943f = arrayList3;
        }

        /* renamed from: a */
        public void mo11925a(C3532m mVar) {
            Object obj = this.f10938a;
            if (obj != null) {
                C3509e.this.mo3588q(obj, this.f10939b, (ArrayList<View>) null);
            }
            Object obj2 = this.f10940c;
            if (obj2 != null) {
                C3509e.this.mo3588q(obj2, this.f10941d, (ArrayList<View>) null);
            }
            Object obj3 = this.f10942e;
            if (obj3 != null) {
                C3509e.this.mo3588q(obj3, this.f10943f, (ArrayList<View>) null);
            }
        }

        /* renamed from: e */
        public void mo11906e(C3532m mVar) {
            mVar.mo11961Y(this);
        }
    }

    /* renamed from: f.s.e$d */
    class C3513d extends C3532m.C3537e {
        C3513d(C3509e eVar, Rect rect) {
        }
    }

    /* renamed from: C */
    private static boolean m15060C(C3532m mVar) {
        return !C0692x.m3525l(mVar.mo11953E()) || !C0692x.m3525l(mVar.mo11954F()) || !C0692x.m3525l(mVar.mo11955G());
    }

    /* renamed from: A */
    public void mo3578A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C3545q qVar = (C3545q) obj;
        if (qVar != null) {
            qVar.mo11956I().clear();
            qVar.mo11956I().addAll(arrayList2);
            mo3588q(qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: B */
    public Object mo3579B(Object obj) {
        if (obj == null) {
            return null;
        }
        C3545q qVar = new C3545q();
        qVar.mo12001n0((C3532m) obj);
        return qVar;
    }

    /* renamed from: a */
    public void mo3580a(Object obj, View view) {
        if (obj != null) {
            ((C3532m) obj).mo11965c(view);
        }
    }

    /* renamed from: b */
    public void mo3581b(Object obj, ArrayList<View> arrayList) {
        C3532m mVar = (C3532m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C3545q) {
                C3545q qVar = (C3545q) mVar;
                int q0 = qVar.mo12003q0();
                while (i < q0) {
                    mo3581b(qVar.mo12002p0(i), arrayList);
                    i++;
                }
            } else if (!m15060C(mVar) && C0692x.m3525l(mVar.mo11956I())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo11965c(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3582c(ViewGroup viewGroup, Object obj) {
        C3541o.m15197a(viewGroup, (C3532m) obj);
    }

    /* renamed from: e */
    public boolean mo3583e(Object obj) {
        return obj instanceof C3532m;
    }

    /* renamed from: g */
    public Object mo3584g(Object obj) {
        if (obj != null) {
            return ((C3532m) obj).clone();
        }
        return null;
    }

    /* renamed from: m */
    public Object mo3585m(Object obj, Object obj2, Object obj3) {
        C3532m mVar = (C3532m) obj;
        C3532m mVar2 = (C3532m) obj2;
        C3532m mVar3 = (C3532m) obj3;
        if (mVar != null && mVar2 != null) {
            C3545q qVar = new C3545q();
            qVar.mo12001n0(mVar);
            qVar.mo12001n0(mVar2);
            qVar.mo12008v0(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C3545q qVar2 = new C3545q();
        if (mVar != null) {
            qVar2.mo12001n0(mVar);
        }
        qVar2.mo12001n0(mVar3);
        return qVar2;
    }

    /* renamed from: n */
    public Object mo3586n(Object obj, Object obj2, Object obj3) {
        C3545q qVar = new C3545q();
        if (obj != null) {
            qVar.mo12001n0((C3532m) obj);
        }
        if (obj2 != null) {
            qVar.mo12001n0((C3532m) obj2);
        }
        if (obj3 != null) {
            qVar.mo12001n0((C3532m) obj3);
        }
        return qVar;
    }

    /* renamed from: p */
    public void mo3587p(Object obj, View view) {
        if (obj != null) {
            ((C3532m) obj).mo11962Z(view);
        }
    }

    /* renamed from: q */
    public void mo3588q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C3532m mVar = (C3532m) obj;
        int i = 0;
        if (mVar instanceof C3545q) {
            C3545q qVar = (C3545q) mVar;
            int q0 = qVar.mo12003q0();
            while (i < q0) {
                mo3588q(qVar.mo12002p0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m15060C(mVar)) {
            List<View> I = mVar.mo11956I();
            if (I.size() == arrayList.size() && I.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.mo11965c(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.mo11962Z(arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: r */
    public void mo3589r(Object obj, View view, ArrayList<View> arrayList) {
        ((C3532m) obj).mo11964b(new C3511b(this, view, arrayList));
    }

    /* renamed from: t */
    public void mo3590t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C3532m) obj).mo11964b(new C3512c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: u */
    public void mo3591u(Object obj, Rect rect) {
        if (obj != null) {
            ((C3532m) obj).mo11970e0(new C3513d(this, rect));
        }
    }

    /* renamed from: v */
    public void mo3592v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo3614k(view, rect);
            ((C3532m) obj).mo11970e0(new C3510a(this, rect));
        }
    }

    /* renamed from: z */
    public void mo3594z(Object obj, View view, ArrayList<View> arrayList) {
        C3545q qVar = (C3545q) obj;
        List<View> I = qVar.mo11956I();
        I.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0692x.m3522d(I, arrayList.get(i));
        }
        I.add(view);
        arrayList.add(view);
        mo3581b(qVar, arrayList);
    }
}
