package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import android.database.sqlite.SQLiteDatabase;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3813z;

/* renamed from: g.d.a.a.i.v.j.o */
final /* synthetic */ class C3802o implements C3813z.C3817d {

    /* renamed from: a */
    private final SQLiteDatabase f11495a;

    private C3802o(SQLiteDatabase sQLiteDatabase) {
        this.f11495a = sQLiteDatabase;
    }

    /* renamed from: b */
    public static C3813z.C3817d m15800b(SQLiteDatabase sQLiteDatabase) {
        return new C3802o(sQLiteDatabase);
    }

    /* renamed from: a */
    public Object mo12399a() {
        return this.f11495a.beginTransaction();
    }
}
