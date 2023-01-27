package com.google.firebase.components;

import java.util.Set;
import p148g.p189d.p281b.p286i.C5200a;

/* renamed from: com.google.firebase.components.a */
abstract class C2505a implements C2511e {
    C2505a() {
    }

    /* renamed from: a */
    public <T> T mo9362a(Class<T> cls) {
        C5200a<T> c = mo9377c(cls);
        if (c == null) {
            return null;
        }
        return c.get();
    }

    /* renamed from: b */
    public <T> Set<T> mo9363b(Class<T> cls) {
        return mo9378d(cls).get();
    }
}
