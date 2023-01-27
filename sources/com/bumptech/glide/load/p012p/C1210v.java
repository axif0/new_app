package com.bumptech.glide.load.p012p;

import com.bumptech.glide.C0969f;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1010d;
import com.bumptech.glide.load.p012p.C1188n;
import com.bumptech.glide.p028r.C1387b;

/* renamed from: com.bumptech.glide.load.p.v */
public class C1210v<Model> implements C1188n<Model, Model> {

    /* renamed from: a */
    private static final C1210v<?> f4393a = new C1210v<>();

    /* renamed from: com.bumptech.glide.load.p.v$a */
    public static class C1211a<Model> implements C1190o<Model, Model> {

        /* renamed from: a */
        private static final C1211a<?> f4394a = new C1211a<>();

        /* renamed from: a */
        public static <T> C1211a<T> m6204a() {
            return f4394a;
        }

        /* renamed from: b */
        public C1188n<Model, Model> mo5458b(C1196r rVar) {
            return C1210v.m6201c();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.v$b */
    private static class C1212b<Model> implements C1010d<Model> {

        /* renamed from: f */
        private final Model f4395f;

        C1212b(Model model) {
            this.f4395f = model;
        }

        /* renamed from: a */
        public Class<Model> mo5162a() {
            return this.f4395f.getClass();
        }

        /* renamed from: b */
        public void mo5167b() {
        }

        public void cancel() {
        }

        /* renamed from: e */
        public C0992a mo5171e() {
            return C0992a.LOCAL;
        }

        /* renamed from: f */
        public void mo5172f(C0969f fVar, C1010d.C1011a<? super Model> aVar) {
            aVar.mo5179d(this.f4395f);
        }
    }

    /* renamed from: c */
    public static <T> C1210v<T> m6201c() {
        return f4393a;
    }

    /* renamed from: a */
    public C1188n.C1189a<Model> mo5453a(Model model, int i, int i2, C1002i iVar) {
        return new C1188n.C1189a<>(new C1387b(model), new C1212b(model));
    }

    /* renamed from: b */
    public boolean mo5454b(Model model) {
        return true;
    }
}
