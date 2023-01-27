package com.bumptech.glide.load.p012p;

import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p008o.C1134q;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p029s.C1401j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.p.q */
class C1194q<Model, Data> implements C1188n<Model, Data> {

    /* renamed from: a */
    private final List<C1188n<Model, Data>> f4367a;

    /* renamed from: b */
    private final C3346e<List<Throwable>> f4368b;

    /* renamed from: com.bumptech.glide.load.p.q$a */
    static class C1195a<Data> implements C1010d<Data>, C1010d.C1011a<Data> {

        /* renamed from: f */
        private final List<C1010d<Data>> f4369f;

        /* renamed from: g */
        private final C3346e<List<Throwable>> f4370g;

        /* renamed from: h */
        private int f4371h = 0;

        /* renamed from: i */
        private C0969f f4372i;

        /* renamed from: j */
        private C1010d.C1011a<? super Data> f4373j;

        /* renamed from: k */
        private List<Throwable> f4374k;

        /* renamed from: l */
        private boolean f4375l;

        C1195a(List<C1010d<Data>> list, C3346e<List<Throwable>> eVar) {
            this.f4370g = eVar;
            C1401j.m6971c(list);
            this.f4369f = list;
        }

        /* renamed from: g */
        private void m6162g() {
            if (!this.f4375l) {
                if (this.f4371h < this.f4369f.size() - 1) {
                    this.f4371h++;
                    mo5172f(this.f4372i, this.f4373j);
                    return;
                }
                C1401j.m6972d(this.f4374k);
                this.f4373j.mo5178c(new C1134q("Fetch failed", (List<Throwable>) new ArrayList(this.f4374k)));
            }
        }

        /* renamed from: a */
        public Class<Data> mo5162a() {
            return this.f4369f.get(0).mo5162a();
        }

        /* renamed from: b */
        public void mo5167b() {
            List<Throwable> list = this.f4374k;
            if (list != null) {
                this.f4370g.mo5908a(list);
            }
            this.f4374k = null;
            for (C1010d<Data> b : this.f4369f) {
                b.mo5167b();
            }
        }

        /* renamed from: c */
        public void mo5178c(Exception exc) {
            List<Throwable> list = this.f4374k;
            C1401j.m6972d(list);
            list.add(exc);
            m6162g();
        }

        public void cancel() {
            this.f4375l = true;
            for (C1010d<Data> cancel : this.f4369f) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public void mo5179d(Data data) {
            if (data != null) {
                this.f4373j.mo5179d(data);
            } else {
                m6162g();
            }
        }

        /* renamed from: e */
        public C0992a mo5171e() {
            return this.f4369f.get(0).mo5171e();
        }

        /* renamed from: f */
        public void mo5172f(C0969f fVar, C1010d.C1011a<? super Data> aVar) {
            this.f4372i = fVar;
            this.f4373j = aVar;
            this.f4374k = this.f4370g.mo5909b();
            this.f4369f.get(this.f4371h).mo5172f(fVar, this);
            if (this.f4375l) {
                cancel();
            }
        }
    }

    C1194q(List<C1188n<Model, Data>> list, C3346e<List<Throwable>> eVar) {
        this.f4367a = list;
        this.f4368b = eVar;
    }

    /* renamed from: a */
    public C1188n.C1189a<Data> mo5453a(Model model, int i, int i2, C1002i iVar) {
        C1188n.C1189a a;
        int size = this.f4367a.size();
        ArrayList arrayList = new ArrayList(size);
        C0998g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1188n nVar = this.f4367a.get(i3);
            if (nVar.mo5454b(model) && (a = nVar.mo5453a(model, i, i2, iVar)) != null) {
                gVar = a.f4360a;
                arrayList.add(a.f4362c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new C1188n.C1189a<>(gVar, new C1195a(arrayList, this.f4368b));
    }

    /* renamed from: b */
    public boolean mo5454b(Model model) {
        for (C1188n<Model, Data> b : this.f4367a) {
            if (b.mo5454b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f4367a.toArray()) + '}';
    }
}
