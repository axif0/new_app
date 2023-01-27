package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.o */
final /* synthetic */ class C1523o implements Runnable {

    /* renamed from: f */
    private final C1525q f5130f;

    private C1523o(C1525q qVar) {
        this.f5130f = qVar;
    }

    /* renamed from: a */
    public static Runnable m7336a(C1525q qVar) {
        return new C1523o(qVar);
    }

    public void run() {
        this.f5130f.f5135d.mo12400a(C1524p.m7337a(this.f5130f));
    }
}
