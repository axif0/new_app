package p148g.p189d.p190a.p271e.p272a.p276c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: g.d.a.e.a.c.o */
final class C5118o implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C5120p f15146a;

    /* synthetic */ C5118o(C5120p pVar) {
        this.f15146a = pVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f15146a.f15149b.mo15206f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f15146a.m21514h(new C5114m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15146a.f15149b.mo15206f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f15146a.m21514h(new C5116n(this));
    }
}
