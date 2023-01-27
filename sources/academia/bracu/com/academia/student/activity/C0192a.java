package academia.bracu.com.academia.student.activity;

import academia.bracu.com.academia.service.C0176c;
import android.app.NotificationManager;

/* renamed from: academia.bracu.com.academia.student.activity.a */
/* compiled from: lambda */
public final /* synthetic */ class C0192a implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ NotificationManager f660f;

    /* renamed from: g */
    public final /* synthetic */ C0176c f661g;

    public /* synthetic */ C0192a(NotificationManager notificationManager, C0176c cVar) {
        this.f660f = notificationManager;
        this.f661g = cVar;
    }

    public final void run() {
        this.f660f.cancel(this.f661g.mo521b());
    }
}
