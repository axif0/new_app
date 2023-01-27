package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import android.database.sqlite.SQLiteDatabase;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3790e0;

/* renamed from: g.d.a.a.i.v.j.d0 */
final /* synthetic */ class C3788d0 implements C3790e0.C3791a {

    /* renamed from: a */
    private static final C3788d0 f11474a = new C3788d0();

    private C3788d0() {
    }

    /* renamed from: b */
    public static C3790e0.C3791a m15766b() {
        return f11474a;
    }

    /* renamed from: a */
    public void mo12380a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
