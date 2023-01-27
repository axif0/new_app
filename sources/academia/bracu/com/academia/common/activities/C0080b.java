package academia.bracu.com.academia.common.activities;

import academia.bracu.com.academia.service.C0176c;
import android.app.NotificationManager;

/* renamed from: academia.bracu.com.academia.common.activities.b */
/* compiled from: lambda */
public final /* synthetic */ class C0080b implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ NotificationManager f374f;

    /* renamed from: g */
    public final /* synthetic */ C0176c f375g;

    public /* synthetic */ C0080b(NotificationManager notificationManager, C0176c cVar) {
        this.f374f = notificationManager;
        this.f375g = cVar;
    }

    public final void run() {
        this.f374f.cancel(this.f375g.mo521b());
    }
}
