package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0936a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C0936a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2323a = (IconCompat) aVar.mo4921v(remoteActionCompat.f2323a, 1);
        remoteActionCompat.f2324b = aVar.mo4911l(remoteActionCompat.f2324b, 2);
        remoteActionCompat.f2325c = aVar.mo4911l(remoteActionCompat.f2325c, 3);
        remoteActionCompat.f2326d = (PendingIntent) aVar.mo4917r(remoteActionCompat.f2326d, 4);
        remoteActionCompat.f2327e = aVar.mo4907h(remoteActionCompat.f2327e, 5);
        remoteActionCompat.f2328f = aVar.mo4907h(remoteActionCompat.f2328f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C0936a aVar) {
        aVar.mo4923x(false, false);
        aVar.mo4902M(remoteActionCompat.f2323a, 1);
        aVar.mo4893D(remoteActionCompat.f2324b, 2);
        aVar.mo4893D(remoteActionCompat.f2325c, 3);
        aVar.mo4897H(remoteActionCompat.f2326d, 4);
        aVar.mo4925z(remoteActionCompat.f2327e, 5);
        aVar.mo4925z(remoteActionCompat.f2328f, 6);
    }
}
