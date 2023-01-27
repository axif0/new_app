package p148g.p325e.p326a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p148g.p325e.p326a.C5544a;

/* renamed from: g.e.a.c */
public final class C5547c extends C5544a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<C5544a> f16031g = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public HashMap<C5544a, C5553f> f16032h = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<C5553f> f16033i = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ArrayList<C5553f> f16034j = new ArrayList<>();

    /* renamed from: k */
    private boolean f16035k = true;

    /* renamed from: l */
    private C5549b f16036l = null;

    /* renamed from: m */
    boolean f16037m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f16038n;

    /* renamed from: o */
    private long f16039o = 0;

    /* renamed from: p */
    private C5580m f16040p = null;

    /* renamed from: g.e.a.c$a */
    class C5548a extends C5546b {

        /* renamed from: a */
        boolean f16041a = false;

        /* renamed from: b */
        final /* synthetic */ ArrayList f16042b;

        C5548a(ArrayList arrayList) {
            this.f16042b = arrayList;
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            if (!this.f16041a) {
                int size = this.f16042b.size();
                for (int i = 0; i < size; i++) {
                    C5553f fVar = (C5553f) this.f16042b.get(i);
                    fVar.f16053f.mo15966i();
                    C5547c.this.f16031g.add(fVar.f16053f);
                }
            }
        }
    }

    /* renamed from: g.e.a.c$b */
    private class C5549b implements C5544a.C5545a {

        /* renamed from: a */
        private C5547c f16044a;

        C5549b(C5547c cVar) {
            this.f16044a = cVar;
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            aVar.mo15963e(this);
            C5547c.this.f16031g.remove(aVar);
            boolean z = true;
            ((C5553f) this.f16044a.f16032h.get(aVar)).f16058k = true;
            if (!C5547c.this.f16037m) {
                ArrayList n = this.f16044a.f16034j;
                int size = n.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (!((C5553f) n.get(i)).f16058k) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    ArrayList<C5544a.C5545a> arrayList = C5547c.this.f16030f;
                    if (arrayList != null) {
                        ArrayList arrayList2 = (ArrayList) arrayList.clone();
                        int size2 = arrayList2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((C5544a.C5545a) arrayList2.get(i2)).mo565a(this.f16044a);
                        }
                    }
                    boolean unused = this.f16044a.f16038n = false;
                }
            }
        }

        /* renamed from: b */
        public void mo566b(C5544a aVar) {
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
        }
    }

    /* renamed from: g.e.a.c$c */
    public class C5550c {

        /* renamed from: a */
        private C5553f f16046a;

        C5550c(C5544a aVar) {
            C5553f fVar = (C5553f) C5547c.this.f16032h.get(aVar);
            this.f16046a = fVar;
            if (fVar == null) {
                this.f16046a = new C5553f(aVar);
                C5547c.this.f16032h.put(aVar, this.f16046a);
                C5547c.this.f16033i.add(this.f16046a);
            }
        }

        /* renamed from: a */
        public C5550c mo15972a(C5544a aVar) {
            C5553f fVar = (C5553f) C5547c.this.f16032h.get(aVar);
            if (fVar == null) {
                fVar = new C5553f(aVar);
                C5547c.this.f16032h.put(aVar, fVar);
                C5547c.this.f16033i.add(fVar);
            }
            fVar.mo15973b(new C5551d(this.f16046a, 0));
            return this;
        }
    }

    /* renamed from: g.e.a.c$d */
    private static class C5551d {

        /* renamed from: a */
        public C5553f f16048a;

        /* renamed from: b */
        public int f16049b;

        public C5551d(C5553f fVar, int i) {
            this.f16048a = fVar;
            this.f16049b = i;
        }
    }

    /* renamed from: g.e.a.c$e */
    private static class C5552e implements C5544a.C5545a {

        /* renamed from: a */
        private C5547c f16050a;

        /* renamed from: b */
        private C5553f f16051b;

        /* renamed from: c */
        private int f16052c;

        public C5552e(C5547c cVar, C5553f fVar, int i) {
            this.f16050a = cVar;
            this.f16051b = fVar;
            this.f16052c = i;
        }

        /* renamed from: d */
        private void m22946d(C5544a aVar) {
            if (!this.f16050a.f16037m) {
                C5551d dVar = null;
                int size = this.f16051b.f16055h.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C5551d dVar2 = this.f16051b.f16055h.get(i);
                    if (dVar2.f16049b == this.f16052c && dVar2.f16048a.f16053f == aVar) {
                        aVar.mo15963e(this);
                        dVar = dVar2;
                        break;
                    }
                    i++;
                }
                this.f16051b.f16055h.remove(dVar);
                if (this.f16051b.f16055h.size() == 0) {
                    this.f16051b.f16053f.mo15966i();
                    this.f16050a.f16031g.add(this.f16051b.f16053f);
                }
            }
        }

        /* renamed from: a */
        public void mo565a(C5544a aVar) {
            if (this.f16052c == 1) {
                m22946d(aVar);
            }
        }

        /* renamed from: b */
        public void mo566b(C5544a aVar) {
        }

        /* renamed from: c */
        public void mo567c(C5544a aVar) {
            if (this.f16052c == 0) {
                m22946d(aVar);
            }
        }
    }

    /* renamed from: g.e.a.c$f */
    private static class C5553f implements Cloneable {

        /* renamed from: f */
        public C5544a f16053f;

        /* renamed from: g */
        public ArrayList<C5551d> f16054g = null;

        /* renamed from: h */
        public ArrayList<C5551d> f16055h = null;

        /* renamed from: i */
        public ArrayList<C5553f> f16056i = null;

        /* renamed from: j */
        public ArrayList<C5553f> f16057j = null;

        /* renamed from: k */
        public boolean f16058k = false;

        public C5553f(C5544a aVar) {
            this.f16053f = aVar;
        }

        /* renamed from: b */
        public void mo15973b(C5551d dVar) {
            if (this.f16054g == null) {
                this.f16054g = new ArrayList<>();
                this.f16056i = new ArrayList<>();
            }
            this.f16054g.add(dVar);
            if (!this.f16056i.contains(dVar.f16048a)) {
                this.f16056i.add(dVar.f16048a);
            }
            C5553f fVar = dVar.f16048a;
            if (fVar.f16057j == null) {
                fVar.f16057j = new ArrayList<>();
            }
            fVar.f16057j.add(this);
        }

        /* renamed from: c */
        public C5553f clone() {
            try {
                C5553f fVar = (C5553f) super.clone();
                fVar.f16053f = this.f16053f.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: x */
    private void m22931x() {
        if (this.f16035k) {
            this.f16034j.clear();
            ArrayList arrayList = new ArrayList();
            int size = this.f16033i.size();
            for (int i = 0; i < size; i++) {
                C5553f fVar = this.f16033i.get(i);
                ArrayList<C5551d> arrayList2 = fVar.f16054g;
                if (arrayList2 == null || arrayList2.size() == 0) {
                    arrayList.add(fVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C5553f fVar2 = (C5553f) arrayList.get(i2);
                    this.f16034j.add(fVar2);
                    ArrayList<C5553f> arrayList4 = fVar2.f16057j;
                    if (arrayList4 != null) {
                        int size3 = arrayList4.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            C5553f fVar3 = fVar2.f16057j.get(i3);
                            fVar3.f16056i.remove(fVar2);
                            if (fVar3.f16056i.size() == 0) {
                                arrayList3.add(fVar3);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList3);
                arrayList3.clear();
            }
            this.f16035k = false;
            if (this.f16034j.size() != this.f16033i.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.f16033i.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C5553f fVar4 = this.f16033i.get(i4);
            ArrayList<C5551d> arrayList5 = fVar4.f16054g;
            if (arrayList5 != null && arrayList5.size() > 0) {
                int size5 = fVar4.f16054g.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C5551d dVar = fVar4.f16054g.get(i5);
                    if (fVar4.f16056i == null) {
                        fVar4.f16056i = new ArrayList<>();
                    }
                    if (!fVar4.f16056i.contains(dVar.f16048a)) {
                        fVar4.f16056i.add(dVar.f16048a);
                    }
                }
            }
            fVar4.f16058k = false;
        }
    }

    /* renamed from: g */
    public void mo15965g(Interpolator interpolator) {
        Iterator<C5553f> it = this.f16033i.iterator();
        while (it.hasNext()) {
            it.next().f16053f.mo15965g(interpolator);
        }
    }

    /* renamed from: i */
    public void mo15966i() {
        ArrayList<C5544a.C5545a> arrayList;
        this.f16037m = false;
        m22931x();
        int size = this.f16034j.size();
        for (int i = 0; i < size; i++) {
            C5553f fVar = this.f16034j.get(i);
            ArrayList<C5544a.C5545a> d = fVar.f16053f.mo15962d();
            if (d != null && d.size() > 0) {
                Iterator it = new ArrayList(d).iterator();
                while (it.hasNext()) {
                    C5544a.C5545a aVar = (C5544a.C5545a) it.next();
                    if ((aVar instanceof C5552e) || (aVar instanceof C5549b)) {
                        fVar.f16053f.mo15963e(aVar);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            C5553f fVar2 = this.f16034j.get(i2);
            if (this.f16036l == null) {
                this.f16036l = new C5549b(this);
            }
            ArrayList<C5551d> arrayList3 = fVar2.f16054g;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(fVar2);
            } else {
                int size2 = fVar2.f16054g.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C5551d dVar = fVar2.f16054g.get(i3);
                    dVar.f16048a.f16053f.mo15959b(new C5552e(this, fVar2, dVar.f16049b));
                }
                fVar2.f16055h = (ArrayList) fVar2.f16054g.clone();
            }
            fVar2.f16053f.mo15959b(this.f16036l);
        }
        if (this.f16039o <= 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C5553f fVar3 = (C5553f) it2.next();
                fVar3.f16053f.mo15966i();
                this.f16031g.add(fVar3.f16053f);
            }
        } else {
            C5580m F = C5580m.m23069F(0.0f, 1.0f);
            this.f16040p = F;
            F.mo15964f(this.f16039o);
            this.f16040p.mo15959b(new C5548a(arrayList2));
            this.f16040p.mo15966i();
        }
        ArrayList<C5544a.C5545a> arrayList4 = this.f16030f;
        if (arrayList4 != null) {
            ArrayList arrayList5 = (ArrayList) arrayList4.clone();
            int size3 = arrayList5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((C5544a.C5545a) arrayList5.get(i4)).mo567c(this);
            }
        }
        if (this.f16033i.size() == 0 && this.f16039o == 0 && (arrayList = this.f16030f) != null) {
            ArrayList arrayList6 = (ArrayList) arrayList.clone();
            int size4 = arrayList6.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((C5544a.C5545a) arrayList6.get(i5)).mo565a(this);
            }
        }
    }

    /* renamed from: r */
    public C5547c clone() {
        C5547c cVar = (C5547c) super.clone();
        cVar.f16035k = true;
        cVar.f16037m = false;
        cVar.f16038n = false;
        cVar.f16031g = new ArrayList<>();
        cVar.f16032h = new HashMap<>();
        cVar.f16033i = new ArrayList<>();
        cVar.f16034j = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<C5553f> it = this.f16033i.iterator();
        while (it.hasNext()) {
            C5553f next = it.next();
            C5553f c = next.clone();
            hashMap.put(next, c);
            cVar.f16033i.add(c);
            cVar.f16032h.put(c.f16053f, c);
            ArrayList arrayList = null;
            c.f16054g = null;
            c.f16055h = null;
            c.f16057j = null;
            c.f16056i = null;
            ArrayList<C5544a.C5545a> d = c.f16053f.mo15962d();
            if (d != null) {
                Iterator<C5544a.C5545a> it2 = d.iterator();
                while (it2.hasNext()) {
                    C5544a.C5545a next2 = it2.next();
                    if (next2 instanceof C5549b) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        d.remove((C5544a.C5545a) it3.next());
                    }
                }
            }
        }
        Iterator<C5553f> it4 = this.f16033i.iterator();
        while (it4.hasNext()) {
            C5553f next3 = it4.next();
            C5553f fVar = (C5553f) hashMap.get(next3);
            ArrayList<C5551d> arrayList2 = next3.f16054g;
            if (arrayList2 != null) {
                Iterator<C5551d> it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    C5551d next4 = it5.next();
                    fVar.mo15973b(new C5551d((C5553f) hashMap.get(next4.f16048a), next4.f16049b));
                }
            }
        }
        return cVar;
    }

    /* renamed from: s */
    public C5550c mo15968s(C5544a aVar) {
        if (aVar == null) {
            return null;
        }
        this.f16035k = true;
        return new C5550c(aVar);
    }

    /* renamed from: t */
    public void mo15969t(C5544a... aVarArr) {
        if (aVarArr != null) {
            this.f16035k = true;
            C5550c s = mo15968s(aVarArr[0]);
            for (int i = 1; i < aVarArr.length; i++) {
                s.mo15972a(aVarArr[i]);
            }
        }
    }

    /* renamed from: u */
    public C5547c mo15964f(long j) {
        if (j >= 0) {
            Iterator<C5553f> it = this.f16033i.iterator();
            while (it.hasNext()) {
                it.next().f16053f.mo15964f(j);
            }
            return this;
        }
        throw new IllegalArgumentException("duration must be a value of zero or greater");
    }

    /* renamed from: v */
    public void mo15971v(long j) {
        this.f16039o = j;
    }
}
