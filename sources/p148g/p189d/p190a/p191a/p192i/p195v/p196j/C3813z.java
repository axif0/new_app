package p148g.p189d.p190a.p191a.p192i.p195v.p196j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p148g.p189d.p190a.p191a.C3727b;
import p148g.p189d.p190a.p191a.p192i.C3748g;
import p148g.p189d.p190a.p191a.p192i.C3749h;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.p193t.C3765a;
import p148g.p189d.p190a.p191a.p192i.p197w.C3818a;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;
import p148g.p189d.p190a.p191a.p192i.p199y.C3827a;

/* renamed from: g.d.a.a.i.v.j.z */
public class C3813z implements C3784c, C3819b {

    /* renamed from: j */
    private static final C3727b f11509j = C3727b.m15581b("proto");

    /* renamed from: f */
    private final C3790e0 f11510f;

    /* renamed from: g */
    private final C3821a f11511g;

    /* renamed from: h */
    private final C3821a f11512h;

    /* renamed from: i */
    private final C3786d f11513i;

    /* renamed from: g.d.a.a.i.v.j.z$b */
    interface C3815b<T, U> {
        /* renamed from: a */
        U mo12398a(T t);
    }

    /* renamed from: g.d.a.a.i.v.j.z$c */
    private static class C3816c {

        /* renamed from: a */
        final String f11514a;

        /* renamed from: b */
        final String f11515b;

        private C3816c(String str, String str2) {
            this.f11514a = str;
            this.f11515b = str2;
        }
    }

    /* renamed from: g.d.a.a.i.v.j.z$d */
    interface C3817d<T> {
        /* renamed from: a */
        T mo12399a();
    }

    C3813z(C3821a aVar, C3821a aVar2, C3786d dVar, C3790e0 e0Var) {
        this.f11510f = e0Var;
        this.f11511g = aVar;
        this.f11512h = aVar2;
        this.f11513i = dVar;
    }

    /* renamed from: H */
    static /* synthetic */ Object m15823H(Throwable th) {
        throw new C3818a("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: J */
    static /* synthetic */ SQLiteDatabase m15824J(Throwable th) {
        throw new C3818a("Timed out while trying to open db.", th);
    }

    /* renamed from: Q */
    static /* synthetic */ Long m15825Q(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0);
    }

    /* renamed from: S */
    static /* synthetic */ Long m15826S(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: V */
    static /* synthetic */ Boolean m15827V(C3813z zVar, C3755l lVar, SQLiteDatabase sQLiteDatabase) {
        Long r = zVar.m15848r(sQLiteDatabase, lVar);
        if (r == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m15847q0(zVar.m15840m().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{r.toString()}), C3806s.m15808b());
    }

    /* renamed from: X */
    static /* synthetic */ List m15828X(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C3755l.C3756a a = C3755l.m15675a();
            a.mo12325b(cursor.getString(1));
            a.mo12327d(C3827a.m15878b(cursor.getInt(2)));
            a.mo12326c(m15841m0(cursor.getString(3)));
            arrayList.add(a.mo12324a());
        }
        return arrayList;
    }

    /* renamed from: a0 */
    static /* synthetic */ List m15829a0(SQLiteDatabase sQLiteDatabase) {
        return (List) m15847q0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C3804q.m15804b());
    }

    /* renamed from: e0 */
    static /* synthetic */ List m15830e0(C3813z zVar, C3755l lVar, SQLiteDatabase sQLiteDatabase) {
        List<C3795h> k0 = zVar.m15838k0(sQLiteDatabase, lVar);
        zVar.m15851w(k0, zVar.m15839l0(sQLiteDatabase, k0));
        return k0;
    }

    /* renamed from: f0 */
    static /* synthetic */ Object m15831f0(List list, C3755l lVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            C3749h.C3750a a = C3749h.m15635a();
            a.mo12303j(cursor.getString(1));
            a.mo12302i(cursor.getLong(2));
            a.mo12304k(cursor.getLong(3));
            a.mo12301h(new C3748g(m15844o0(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                a.mo12300g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(C3795h.m15784a(j, lVar, a.mo12297d()));
        }
        return null;
    }

    /* renamed from: g0 */
    static /* synthetic */ Object m15832g0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C3816c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: h */
    private void m15833h(SQLiteDatabase sQLiteDatabase) {
        m15842n0(C3802o.m15800b(sQLiteDatabase), C3803p.m15802b());
    }

    /* renamed from: h0 */
    static /* synthetic */ Long m15834h0(C3813z zVar, C3755l lVar, C3749h hVar, SQLiteDatabase sQLiteDatabase) {
        if (zVar.m15850u()) {
            return -1L;
        }
        long j = zVar.m15836j(sQLiteDatabase, lVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(j));
        contentValues.put("transport_name", hVar.mo12294j());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.mo12292f()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.mo12295k()));
        contentValues.put("payload_encoding", hVar.mo12290e().mo12334b().mo12283a());
        contentValues.put("payload", hVar.mo12290e().mo12333a());
        contentValues.put("code", hVar.mo12289d());
        contentValues.put("num_attempts", 0);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        for (Map.Entry next : hVar.mo12341i().entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("event_id", Long.valueOf(insert));
            contentValues2.put("name", (String) next.getKey());
            contentValues2.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues2);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: i0 */
    static /* synthetic */ Object m15835i0(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* renamed from: j */
    private long m15836j(SQLiteDatabase sQLiteDatabase, C3755l lVar) {
        Long r = m15848r(sQLiteDatabase, lVar);
        if (r != null) {
            return r.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", lVar.mo12319b());
        contentValues.put("priority", Integer.valueOf(C3827a.m15877a(lVar.mo12321d())));
        contentValues.put("next_request_ms", 0);
        if (lVar.mo12320c() != null) {
            contentValues.put("extras", Base64.encodeToString(lVar.mo12320c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    /* renamed from: j0 */
    static /* synthetic */ Object m15837j0(long j, C3755l lVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{lVar.mo12319b(), String.valueOf(C3827a.m15877a(lVar.mo12321d()))}) < 1) {
            contentValues.put("backend_name", lVar.mo12319b());
            contentValues.put("priority", Integer.valueOf(C3827a.m15877a(lVar.mo12321d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* renamed from: k0 */
    private List<C3795h> m15838k0(SQLiteDatabase sQLiteDatabase, C3755l lVar) {
        ArrayList arrayList = new ArrayList();
        Long r = m15848r(sQLiteDatabase, lVar);
        if (r == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        m15847q0(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new String[]{r.toString()}, (String) null, (String) null, (String) null, String.valueOf(this.f11513i.mo12363d())), C3800m.m15796b(arrayList, lVar));
        return arrayList;
    }

    /* renamed from: l0 */
    private Map<Long, Set<C3816c>> m15839l0(SQLiteDatabase sQLiteDatabase, List<C3795h> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo12375c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m15847q0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), C3801n.m15798b(hashMap));
        return hashMap;
    }

    /* renamed from: m */
    private SQLiteDatabase m15840m() {
        C3790e0 e0Var = this.f11510f;
        e0Var.getClass();
        return (SQLiteDatabase) m15842n0(C3805r.m15806b(e0Var), C3807t.m15810b());
    }

    /* renamed from: m0 */
    private static byte[] m15841m0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: n0 */
    private <T> T m15842n0(C3817d<T> dVar, C3815b<Throwable, T> bVar) {
        long a = this.f11512h.mo12402a();
        while (true) {
            try {
                return dVar.mo12399a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f11512h.mo12402a() >= ((long) this.f11513i.mo12361b()) + a) {
                    return bVar.mo12398a(e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    /* renamed from: o */
    private long m15843o() {
        return m15840m().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: o0 */
    private static C3727b m15844o0(String str) {
        return str == null ? f11509j : C3727b.m15581b(str);
    }

    /* renamed from: p0 */
    private static String m15845p0(Iterable<C3795h> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<C3795h> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo12375c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: q */
    private long m15846q() {
        return m15840m().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: q0 */
    private static <T> T m15847q0(Cursor cursor, C3815b<Cursor, T> bVar) {
        try {
            return bVar.mo12398a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: r */
    private Long m15848r(SQLiteDatabase sQLiteDatabase, C3755l lVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{lVar.mo12319b(), String.valueOf(C3827a.m15877a(lVar.mo12321d()))}));
        if (lVar.mo12320c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(lVar.mo12320c(), 0));
        }
        return (Long) m15847q0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), C3809v.m15814b());
    }

    /* renamed from: t */
    private <T> T m15849t(C3815b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m = m15840m();
        m.beginTransaction();
        try {
            T a = bVar.mo12398a(m);
            m.setTransactionSuccessful();
            return a;
        } finally {
            m.endTransaction();
        }
    }

    /* renamed from: u */
    private boolean m15850u() {
        return m15843o() * m15846q() >= this.f11513i.mo12364e();
    }

    /* renamed from: w */
    private List<C3795h> m15851w(List<C3795h> list, Map<Long, Set<C3816c>> map) {
        ListIterator<C3795h> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C3795h next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo12375c()))) {
                C3749h.C3750a l = next.mo12374b().mo12342l();
                for (C3816c cVar : map.get(Long.valueOf(next.mo12375c()))) {
                    l.mo12345c(cVar.f11514a, cVar.f11515b);
                }
                listIterator.set(C3795h.m15784a(next.mo12375c(), next.mo12376d(), l.mo12297d()));
            }
        }
        return list;
    }

    /* renamed from: E */
    public C3795h mo12381E(C3755l lVar, C3749h hVar) {
        C3765a.m15705b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", lVar.mo12321d(), hVar.mo12294j(), lVar.mo12319b());
        long longValue = ((Long) m15849t(C3808u.m15812b(this, lVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C3795h.m15784a(longValue, lVar, hVar);
    }

    /* renamed from: F */
    public Iterable<C3755l> mo12382F() {
        return (Iterable) m15849t(C3798k.m15792b());
    }

    /* renamed from: N */
    public long mo12383N(C3755l lVar) {
        return ((Long) m15847q0(m15840m().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{lVar.mo12319b(), String.valueOf(C3827a.m15877a(lVar.mo12321d()))}), C3811x.m15818b())).longValue();
    }

    /* renamed from: T */
    public boolean mo12384T(C3755l lVar) {
        return ((Boolean) m15849t(C3812y.m15820b(this, lVar))).booleanValue();
    }

    /* renamed from: U */
    public void mo12385U(Iterable<C3795h> iterable) {
        if (iterable.iterator().hasNext()) {
            m15849t(C3810w.m15816b("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m15845p0(iterable)));
        }
    }

    /* renamed from: a */
    public <T> T mo12400a(C3819b.C3820a<T> aVar) {
        SQLiteDatabase m = m15840m();
        m15833h(m);
        try {
            T execute = aVar.execute();
            m.setTransactionSuccessful();
            return execute;
        } finally {
            m.endTransaction();
        }
    }

    public void close() {
        this.f11510f.close();
    }

    /* renamed from: e */
    public int mo12386e() {
        return ((Integer) m15849t(C3799l.m15794b(this.f11511g.mo12402a() - this.f11513i.mo12362c()))).intValue();
    }

    /* renamed from: g */
    public void mo12387g(Iterable<C3795h> iterable) {
        if (iterable.iterator().hasNext()) {
            m15840m().compileStatement("DELETE FROM events WHERE _id in " + m15845p0(iterable)).execute();
        }
    }

    /* renamed from: p */
    public Iterable<C3795h> mo12388p(C3755l lVar) {
        return (Iterable) m15849t(C3797j.m15790b(this, lVar));
    }

    /* renamed from: z */
    public void mo12389z(C3755l lVar, long j) {
        m15849t(C3796i.m15788b(j, lVar));
    }
}
