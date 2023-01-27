package com.bumptech.glide.load.p008o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.o.y */
class C1144y {

    /* renamed from: a */
    private boolean f4308a;

    /* renamed from: b */
    private final Handler f4309b = new Handler(Looper.getMainLooper(), new C1145a());

    /* renamed from: com.bumptech.glide.load.o.y$a */
    private static final class C1145a implements Handler.Callback {
        C1145a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1141v) message.obj).mo5422d();
            return true;
        }
    }

    C1144y() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo5451a(C1141v<?> vVar) {
        if (this.f4308a) {
            this.f4309b.obtainMessage(1, vVar).sendToTarget();
        } else {
            this.f4308a = true;
            vVar.mo5422d();
            this.f4308a = false;
        }
    }
}
