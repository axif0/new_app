package com.google.firebase.components;

import java.util.Map;
import p148g.p189d.p281b.p284g.C5191a;
import p148g.p189d.p281b.p284g.C5192b;

/* renamed from: com.google.firebase.components.q */
final /* synthetic */ class C2529q implements Runnable {

    /* renamed from: f */
    private final Map.Entry f8211f;

    /* renamed from: g */
    private final C5191a f8212g;

    private C2529q(Map.Entry entry, C5191a aVar) {
        this.f8211f = entry;
        this.f8212g = aVar;
    }

    /* renamed from: a */
    public static Runnable m11332a(Map.Entry entry, C5191a aVar) {
        return new C2529q(entry, aVar);
    }

    public void run() {
        ((C5192b) this.f8211f.getKey()).mo9357a(this.f8212g);
    }
}
