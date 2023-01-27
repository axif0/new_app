package p148g.p189d.p190a.p232c.p236c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: g.d.a.c.c.h */
final /* synthetic */ class C4345h implements Runnable {

    /* renamed from: f */
    private final C4334b f13853f;

    /* renamed from: g */
    private final Intent f13854g;

    /* renamed from: h */
    private final Context f13855h;

    /* renamed from: i */
    private final boolean f13856i;

    /* renamed from: j */
    private final BroadcastReceiver.PendingResult f13857j;

    C4345h(C4334b bVar, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f13853f = bVar;
        this.f13854g = intent;
        this.f13855h = context;
        this.f13856i = z;
        this.f13857j = pendingResult;
    }

    public final void run() {
        this.f13853f.mo13623f(this.f13854g, this.f13855h, this.f13856i, this.f13857j);
    }
}
