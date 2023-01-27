package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
final class C1997x3 extends SQLiteOpenHelper {

    /* renamed from: f */
    private final /* synthetic */ C2010y3 f6506f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1997x3(C2010y3 y3Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f6506f = y3Var;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f6506f.mo6709i().mo6764E().mo6885a("Opening the local database failed, dropping and recreating it");
            if (!this.f6506f.mo6710j().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f6506f.mo6709i().mo6764E().mo6886b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f6506f.mo6709i().mo6764E().mo6886b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1801h.m8528b(this.f6506f.mo6709i(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C1801h.m8529c(this.f6506f.mo6709i(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
