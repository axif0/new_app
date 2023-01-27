package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p086f.p111h.p112e.C3268b;

/* renamed from: androidx.appcompat.app.o */
class C0314o {

    /* renamed from: d */
    private static C0314o f1046d;

    /* renamed from: a */
    private final Context f1047a;

    /* renamed from: b */
    private final LocationManager f1048b;

    /* renamed from: c */
    private final C0315a f1049c = new C0315a();

    /* renamed from: androidx.appcompat.app.o$a */
    private static class C0315a {

        /* renamed from: a */
        boolean f1050a;

        /* renamed from: b */
        long f1051b;

        /* renamed from: c */
        long f1052c;

        /* renamed from: d */
        long f1053d;

        /* renamed from: e */
        long f1054e;

        /* renamed from: f */
        long f1055f;

        C0315a() {
        }
    }

    C0314o(Context context, LocationManager locationManager) {
        this.f1047a = context;
        this.f1048b = locationManager;
    }

    /* renamed from: a */
    static C0314o m1258a(Context context) {
        if (f1046d == null) {
            Context applicationContext = context.getApplicationContext();
            f1046d = new C0314o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1046d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m1259b() {
        Location location = null;
        Location c = C3268b.m14082b(this.f1047a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m1260c("network") : null;
        if (C3268b.m14082b(this.f1047a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m1260c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m1260c(String str) {
        try {
            if (this.f1048b.isProviderEnabled(str)) {
                return this.f1048b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m1261e() {
        return this.f1049c.f1055f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m1262f(Location location) {
        long j;
        C0315a aVar = this.f1049c;
        long currentTimeMillis = System.currentTimeMillis();
        C0313n b = C0313n.m1256b();
        C0313n nVar = b;
        nVar.mo998a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f1043a;
        nVar.mo998a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f1045c == 1;
        long j3 = b.f1044b;
        long j4 = j2;
        long j5 = b.f1043a;
        long j6 = j3;
        boolean z2 = z;
        b.mo998a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f1044b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f1050a = z2;
        aVar.f1051b = j4;
        aVar.f1052c = j6;
        aVar.f1053d = j5;
        aVar.f1054e = j7;
        aVar.f1055f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo999d() {
        C0315a aVar = this.f1049c;
        if (m1261e()) {
            return aVar.f1050a;
        }
        Location b = m1259b();
        if (b != null) {
            m1262f(b);
            return aVar.f1050a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
