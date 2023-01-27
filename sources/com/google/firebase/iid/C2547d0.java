package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.iid.C2554g0;
import p148g.p189d.p190a.p232c.p251i.C4940h;

/* renamed from: com.google.firebase.iid.d0 */
public class C2547d0 extends Binder {

    /* renamed from: a */
    private final C2548a f8259a;

    /* renamed from: com.google.firebase.iid.d0$a */
    public interface C2548a {
        /* renamed from: a */
        C4940h<Void> mo9442a(Intent intent);
    }

    public C2547d0(C2548a aVar) {
        this.f8259a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9441b(C2554g0.C2555a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            this.f8259a.mo9442a(aVar.f8274a).mo14864b(C2556h.m11429a(), new C2545c0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
