package com.bumptech.glide.load.p012p;

import com.bumptech.glide.load.C0998g;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.p029s.C1401j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.n */
public interface C1188n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.p.n$a */
    public static class C1189a<Data> {

        /* renamed from: a */
        public final C0998g f4360a;

        /* renamed from: b */
        public final List<C0998g> f4361b;

        /* renamed from: c */
        public final C1010d<Data> f4362c;

        public C1189a(C0998g gVar, C1010d<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public C1189a(C0998g gVar, List<C0998g> list, C1010d<Data> dVar) {
            C1401j.m6972d(gVar);
            this.f4360a = gVar;
            C1401j.m6972d(list);
            this.f4361b = list;
            C1401j.m6972d(dVar);
            this.f4362c = dVar;
        }
    }

    /* renamed from: a */
    C1189a<Data> mo5453a(Model model, int i, int i2, C1002i iVar);

    /* renamed from: b */
    boolean mo5454b(Model model);
}
