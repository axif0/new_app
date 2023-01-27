package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: g.d.a.a.i.v.j.e0 */
final class C3790e0 extends SQLiteOpenHelper {

    /* renamed from: h */
    static int f11475h = 3;

    /* renamed from: i */
    private static final C3791a f11476i = C3783b0.m15743b();

    /* renamed from: j */
    private static final C3791a f11477j = C3785c0.m15754b();

    /* renamed from: k */
    private static final C3791a f11478k;

    /* renamed from: l */
    private static final List<C3791a> f11479l;

    /* renamed from: f */
    private final int f11480f;

    /* renamed from: g */
    private boolean f11481g = false;

    /* renamed from: g.d.a.a.i.v.j.e0$a */
    public interface C3791a {
        /* renamed from: a */
        void mo12380a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C3791a b = C3788d0.m15766b();
        f11478k = b;
        f11479l = Arrays.asList(new C3791a[]{f11476i, f11477j, b});
    }

    C3790e0(Context context, int i) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i);
        this.f11480f = i;
    }

    /* renamed from: a */
    private void m15770a(SQLiteDatabase sQLiteDatabase) {
        if (!this.f11481g) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m15771h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: j */
    static /* synthetic */ void m15772j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: o */
    private void m15774o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 <= f11479l.size()) {
            while (i < i2) {
                f11479l.get(i).mo12380a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + f11479l.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f11481g = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m15770a(sQLiteDatabase);
        m15774o(sQLiteDatabase, 0, this.f11480f);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m15770a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m15770a(sQLiteDatabase);
        m15774o(sQLiteDatabase, i, i2);
    }
}
