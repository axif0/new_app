package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import android.database.sqlite.SQLiteDatabase;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3813z;

/* renamed from: g.d.a.a.i.v.j.l */
final /* synthetic */ class C3799l implements C3813z.C3815b {

    /* renamed from: a */
    private final long f11491a;

    private C3799l(long j) {
        this.f11491a = j;
    }

    /* renamed from: b */
    public static C3813z.C3815b m15794b(long j) {
        return new C3799l(j);
    }

    /* renamed from: a */
    public Object mo12398a(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f11491a)}));
    }
}
