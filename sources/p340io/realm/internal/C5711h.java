package p340io.realm.internal;

import java.lang.ref.ReferenceQueue;

/* renamed from: io.realm.internal.h */
public class C5711h {

    /* renamed from: a */
    private static final ReferenceQueue<C5712i> f16510a = new ReferenceQueue<>();

    /* renamed from: b */
    private static final Thread f16511b = new Thread(new C5708e(f16510a));

    /* renamed from: c */
    public static final C5711h f16512c = new C5711h();

    static {
        f16511b.setName("RealmFinalizingDaemon");
        f16511b.start();
    }

    /* renamed from: a */
    public void mo16628a(C5712i iVar) {
        new NativeObjectReference(this, iVar, f16510a);
    }
}
