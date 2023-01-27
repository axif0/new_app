package academia.bracu.com.academia.faculty.activity;

import academia.bracu.com.academia.service.C0176c;
import android.app.NotificationManager;

/* renamed from: academia.bracu.com.academia.faculty.activity.c */
/* compiled from: lambda */
public final /* synthetic */ class C0145c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ NotificationManager f507f;

    /* renamed from: g */
    public final /* synthetic */ C0176c f508g;

    public /* synthetic */ C0145c(NotificationManager notificationManager, C0176c cVar) {
        this.f507f = notificationManager;
        this.f508g = cVar;
    }

    public final void run() {
        this.f507f.cancel(this.f508g.mo521b());
    }
}
