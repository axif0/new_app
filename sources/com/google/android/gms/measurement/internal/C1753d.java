package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p241f.p247f.C4499d1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4608j0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4628k0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4645l0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4684n0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4884yc;
import p148g.p189d.p190a.p232c.p241f.p247f.C4888z0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;

/* renamed from: com.google.android.gms.measurement.internal.d */
final class C1753d extends C1967u9 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f5713f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f5714g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f5715h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f5716i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f5717j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f5718k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f5719l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f5720m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C1813i f5721d = new C1813i(this, mo6710j(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1919q9 f5722e = new C1919q9(mo6708g());

    C1753d(C2003x9 x9Var) {
        super(x9Var);
    }

    /* renamed from: F */
    private final Object m8244F(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo6709i().mo6764E().mo6885a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                mo6709i().mo6764E().mo6886b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo6709i().mo6764E().mo6885a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* renamed from: H */
    private final String m8245H(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo6844v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                String string = rawQuery.getString(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return string;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str2;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: M */
    private static void m8246M(ContentValues contentValues, String str, Object obj) {
        C1658o.m7841f(str);
        C1658o.m7845j(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: V */
    private final boolean m8247V(String str, int i, C4628k0 k0Var) {
        mo7366r();
        mo6700b();
        C1658o.m7841f(str);
        C1658o.m7845j(k0Var);
        Integer num = null;
        if (TextUtils.isEmpty(k0Var.mo14314J())) {
            C1770e4 H = mo6709i().mo6767H();
            Object w = C1746c4.m8178w(str);
            Integer valueOf = Integer.valueOf(i);
            if (k0Var.mo14312G()) {
                num = Integer.valueOf(k0Var.mo14313I());
            }
            H.mo6888d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
            return false;
        }
        byte[] k = k0Var.mo14268k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", k0Var.mo14312G() ? Integer.valueOf(k0Var.mo14313I()) : null);
        contentValues.put("event_name", k0Var.mo14314J());
        contentValues.put("session_scoped", k0Var.mo14321R() ? Boolean.valueOf(k0Var.mo14322T()) : null);
        contentValues.put("data", k);
        try {
            if (mo6844v().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo6709i().mo6764E().mo6886b("Failed to insert event filter (got -1). appId", C1746c4.m8178w(str));
            return true;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing event filter. appId", C1746c4.m8178w(str), e);
            return false;
        }
    }

    /* renamed from: W */
    private final boolean m8248W(String str, int i, C4684n0 n0Var) {
        mo7366r();
        mo6700b();
        C1658o.m7841f(str);
        C1658o.m7845j(n0Var);
        Integer num = null;
        if (TextUtils.isEmpty(n0Var.mo14469F())) {
            C1770e4 H = mo6709i().mo6767H();
            Object w = C1746c4.m8178w(str);
            Integer valueOf = Integer.valueOf(i);
            if (n0Var.mo14467D()) {
                num = Integer.valueOf(n0Var.mo14468E());
            }
            H.mo6888d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
            return false;
        }
        byte[] k = n0Var.mo14268k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", n0Var.mo14467D() ? Integer.valueOf(n0Var.mo14468E()) : null);
        contentValues.put("property_name", n0Var.mo14469F());
        contentValues.put("session_scoped", n0Var.mo14473K() ? Boolean.valueOf(n0Var.mo14474L()) : null);
        contentValues.put("data", k);
        try {
            if (mo6844v().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo6709i().mo6764E().mo6886b("Failed to insert property filter (got -1). appId", C1746c4.m8178w(str));
            return false;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing property filter. appId", C1746c4.m8178w(str), e);
            return false;
        }
    }

    /* renamed from: h0 */
    private final boolean m8257h0() {
        return mo6710j().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: i0 */
    private final long m8258i0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo6844v().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: m0 */
    private final boolean m8259m0(String str, List<Integer> list) {
        C1658o.m7841f(str);
        mo7366r();
        mo6700b();
        SQLiteDatabase v = mo6844v();
        try {
            long i0 = m8258i0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo6712l().mo7417u(str, C1957u.f6317F)));
            if (i0 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Database error querying filters. appId", C1746c4.m8178w(str), e);
            return false;
        }
    }

    /* renamed from: z */
    private final long m8260z(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo6844v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<p148g.p189d.p190a.p232c.p241f.p247f.C4888z0, java.lang.Long> mo6804A(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo6700b()
            r7.mo7366r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo6844v()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.c4 r8 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6772M()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r9 = "Main event not found"
            r8.mo6885a(r9)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0076 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0076 }
            g.d.a.c.f.f.z0$a r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.m20752d0()     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r4, r2)     // Catch:{ IOException -> 0x005e }
            g.d.a.c.f.f.z0$a r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r4     // Catch:{ IOException -> 0x005e }
            g.d.a.c.f.f.l8 r2 = r4.mo14350h()     // Catch:{ IOException -> 0x005e }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ IOException -> 0x005e }
            g.d.a.c.f.f.z0 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r2     // Catch:{ IOException -> 0x005e }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            return r8
        L_0x005e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.c4 r3 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r8)     // Catch:{ SQLiteException -> 0x0076 }
            r3.mo6888d(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r8 = move-exception
            goto L_0x007c
        L_0x0078:
            r8 = move-exception
            goto L_0x0091
        L_0x007a:
            r8 = move-exception
            r1 = r0
        L_0x007c:
            com.google.android.gms.measurement.internal.c4 r9 = r7.mo6709i()     // Catch:{ all -> 0x008f }
            com.google.android.gms.measurement.internal.e4 r9 = r9.mo6764E()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Error selecting main event"
            r9.mo6886b(r2, r8)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            return r0
        L_0x008f:
            r8 = move-exception
            r0 = r1
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6804A(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public final long mo6805A0(String str, String str2) {
        long z;
        String str3 = str;
        String str4 = str2;
        C1658o.m7841f(str);
        C1658o.m7841f(str2);
        mo6700b();
        mo7366r();
        SQLiteDatabase v = mo6844v();
        v.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                z = m8260z(sb.toString(), new String[]{str3}, -1);
                if (z == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (v.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        mo6709i().mo6764E().mo6887c("Failed to insert column (got -1). appId", C1746c4.m8178w(str), str4);
                        v.endTransaction();
                        return -1;
                    }
                    z = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo6709i().mo6764E().mo6888d("Error inserting column. appId", C1746c4.m8178w(str), str4, e);
                    v.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    v.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str3);
                contentValues2.put(str4, Long.valueOf(1 + z));
                if (((long) v.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    mo6709i().mo6764E().mo6887c("Failed to update column (got 0). appId", C1746c4.m8178w(str), str4);
                    v.endTransaction();
                    return -1;
                }
                v.setTransactionSuccessful();
                v.endTransaction();
                return z;
            } catch (SQLiteException e2) {
                e = e2;
                j = z;
                mo6709i().mo6764E().mo6888d("Error inserting column. appId", C1746c4.m8178w(str), str4, e);
                v.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo6709i().mo6764E().mo6888d("Error inserting column. appId", C1746c4.m8178w(str), str4, e);
            v.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            v.endTransaction();
            throw th;
        }
    }

    /* renamed from: B */
    public final C1789g mo6806B(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C1658o.m7841f(str);
        mo6700b();
        mo7366r();
        String[] strArr = {str};
        C1789g gVar = new C1789g();
        Cursor cursor = null;
        try {
            SQLiteDatabase v = mo6844v();
            cursor = v.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                mo6709i().mo6767H().mo6886b("Not updating daily counts, app is not known. appId", C1746c4.m8178w(str));
                if (cursor != null) {
                    cursor.close();
                }
                return gVar;
            }
            if (cursor.getLong(0) == j) {
                gVar.f5829b = cursor.getLong(1);
                gVar.f5828a = cursor.getLong(2);
                gVar.f5830c = cursor.getLong(3);
                gVar.f5831d = cursor.getLong(4);
                gVar.f5832e = cursor.getLong(5);
            }
            if (z) {
                gVar.f5829b += j2;
            }
            if (z2) {
                gVar.f5828a += j2;
            }
            if (z3) {
                gVar.f5830c += j2;
            }
            if (z4) {
                gVar.f5831d += j2;
            }
            if (z5) {
                gVar.f5832e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(gVar.f5828a));
            contentValues.put("daily_events_count", Long.valueOf(gVar.f5829b));
            contentValues.put("daily_conversions_count", Long.valueOf(gVar.f5830c));
            contentValues.put("daily_error_events_count", Long.valueOf(gVar.f5831d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.f5832e));
            v.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error updating daily counts. appId", C1746c4.m8178w(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return gVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8  */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo6807B0(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo6700b()
            r7.mo7366r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo6844v()     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x00bf, all -> 0x00bd }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00bb }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.c4 r8 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x00bb }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6772M()     // Catch:{ SQLiteException -> 0x00bb }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo6885a(r2)     // Catch:{ SQLiteException -> 0x00bb }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x00bb }
            g.d.a.c.f.f.z0$a r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.m20752d0()     // Catch:{ IOException -> 0x00a3 }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r3, r2)     // Catch:{ IOException -> 0x00a3 }
            g.d.a.c.f.f.z0$a r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r3     // Catch:{ IOException -> 0x00a3 }
            g.d.a.c.f.f.l8 r2 = r3.mo14350h()     // Catch:{ IOException -> 0x00a3 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ IOException -> 0x00a3 }
            g.d.a.c.f.f.z0 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r2     // Catch:{ IOException -> 0x00a3 }
            r7.mo7383m()     // Catch:{ SQLiteException -> 0x00bb }
            java.util.List r8 = r2.mo14782C()     // Catch:{ SQLiteException -> 0x00bb }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00bb }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00bb }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00bb }
        L_0x0055:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00bb }
            if (r3 == 0) goto L_0x009d
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00bb }
            g.d.a.c.f.f.b1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r3     // Catch:{ SQLiteException -> 0x00bb }
            java.lang.String r4 = r3.mo13813N()     // Catch:{ SQLiteException -> 0x00bb }
            boolean r5 = r3.mo13820c0()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x0073
            double r5 = r3.mo13821d0()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x0073:
            boolean r5 = r3.mo13818a0()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x0081
            float r3 = r3.mo13819b0()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x0081:
            boolean r5 = r3.mo13814U()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.mo13815V()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x008f:
            boolean r5 = r3.mo13816Y()     // Catch:{ SQLiteException -> 0x00bb }
            if (r5 == 0) goto L_0x0055
            long r5 = r3.mo13817Z()     // Catch:{ SQLiteException -> 0x00bb }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00bb }
            goto L_0x0055
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            return r2
        L_0x00a3:
            r2 = move-exception
            com.google.android.gms.measurement.internal.c4 r3 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x00bb }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ SQLiteException -> 0x00bb }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r8)     // Catch:{ SQLiteException -> 0x00bb }
            r3.mo6887c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00bb }
            if (r1 == 0) goto L_0x00ba
            r1.close()
        L_0x00ba:
            return r0
        L_0x00bb:
            r8 = move-exception
            goto L_0x00c1
        L_0x00bd:
            r8 = move-exception
            goto L_0x00d6
        L_0x00bf:
            r8 = move-exception
            r1 = r0
        L_0x00c1:
            com.google.android.gms.measurement.internal.c4 r2 = r7.mo6709i()     // Catch:{ all -> 0x00d4 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ all -> 0x00d4 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo6886b(r3, r8)     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d3
            r1.close()
        L_0x00d3:
            return r0
        L_0x00d4:
            r8 = move-exception
            r0 = r1
        L_0x00d6:
            if (r0 == 0) goto L_0x00db
            r0.close()
        L_0x00db:
            goto L_0x00dd
        L_0x00dc:
            throw r8
        L_0x00dd:
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6807B0(java.lang.String):android.os.Bundle");
    }

    /* renamed from: C */
    public final C1789g mo6808C(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo6806B(j, str, 1, false, false, z3, false, z5);
    }

    /* renamed from: C0 */
    public final C1765e mo6809C0(String str) {
        C1658o.m7845j(str);
        mo6700b();
        mo7366r();
        return C1765e.m8334b(m8245H("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1885o mo6810D(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.C1658o.m7841f(r26)
            com.google.android.gms.common.internal.C1658o.m7841f(r27)
            r25.mo6700b()
            r25.mo7366r()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.mo6844v()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 != 0) goto L_0x005c
            if (r14 == 0) goto L_0x005b
            r14.close()
        L_0x005b:
            return r18
        L_0x005c:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r2 = 0
            if (r1 == 0) goto L_0x0074
            r16 = r2
            goto L_0x007a
        L_0x0074:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r16 = r0
        L_0x007a:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 == 0) goto L_0x0084
            r0 = r18
            goto L_0x008c
        L_0x0084:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x008c:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x0096
            r19 = r18
            goto L_0x00a0
        L_0x0096:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r19 = r1
        L_0x00a0:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00aa
            r20 = r18
            goto L_0x00b4
        L_0x00aa:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r20 = r1
        L_0x00b4:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 != 0) goto L_0x00d0
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cd }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
            r9 = 1
        L_0x00c6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cd }
            r21 = r1
            goto L_0x00d2
        L_0x00cd:
            r0 = move-exception
            goto L_0x012a
        L_0x00d0:
            r21 = r18
        L_0x00d2:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00dc
            r8 = r2
            goto L_0x00e1
        L_0x00dc:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r8 = r1
        L_0x00e1:
            com.google.android.gms.measurement.internal.o r22 = new com.google.android.gms.measurement.internal.o     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.c4 r0 = r25.mo6709i()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r26)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.mo6886b(r1, r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r23 == 0) goto L_0x0114
            r23.close()
        L_0x0114:
            return r22
        L_0x0115:
            r0 = move-exception
            goto L_0x011e
        L_0x0117:
            r0 = move-exception
            r14 = r23
            goto L_0x012a
        L_0x011b:
            r0 = move-exception
            r23 = r14
        L_0x011e:
            r18 = r23
            goto L_0x014e
        L_0x0121:
            r0 = move-exception
            r23 = r14
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x014e
        L_0x0127:
            r0 = move-exception
            r14 = r18
        L_0x012a:
            com.google.android.gms.measurement.internal.c4 r1 = r25.mo6709i()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r26)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.a4 r4 = r25.mo6705d()     // Catch:{ all -> 0x014b }
            r5 = r27
            java.lang.String r4 = r4.mo6692v(r5)     // Catch:{ all -> 0x014b }
            r1.mo6888d(r2, r3, r4, r0)     // Catch:{ all -> 0x014b }
            if (r14 == 0) goto L_0x014a
            r14.close()
        L_0x014a:
            return r18
        L_0x014b:
            r0 = move-exception
            r18 = r14
        L_0x014e:
            if (r18 == 0) goto L_0x0153
            r18.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6810D(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final void mo6811D0() {
        int delete;
        mo6700b();
        mo7366r();
        if (m8257h0()) {
            long a = mo6711k().f6137h.mo7343a();
            long a2 = mo6708g().mo6585a();
            if (Math.abs(a2 - a) > C1957u.f6402y.mo7323a(null).longValue()) {
                mo6711k().f6137h.mo7344b(a2);
                mo6700b();
                mo7366r();
                if (m8257h0() && (delete = mo6844v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo6708g().mo6587c()), String.valueOf(C1992wa.m9065J())})) > 0) {
                    mo6709i().mo6772M().mo6886b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    /* renamed from: E0 */
    public final long mo6812E0() {
        return m8260z("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    /* renamed from: F0 */
    public final long mo6813F0() {
        return m8260z("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo6814G(long r5) {
        /*
            r4 = this;
            r4.mo6700b()
            r4.mo7366r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo6844v()     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.c4 r6 = r4.mo6709i()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo6885a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            goto L_0x0059
        L_0x0042:
            r6 = move-exception
            r5 = r0
        L_0x0044:
            com.google.android.gms.measurement.internal.c4 r1 = r4.mo6709i()     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo6886b(r2, r6)     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0056
            r5.close()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
            r0 = r5
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6814G(long):java.lang.String");
    }

    /* renamed from: G0 */
    public final boolean mo6815G0() {
        return m8258i0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: H0 */
    public final boolean mo6816H0() {
        return m8258i0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C1800ga> mo6817I(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.C1658o.m7841f(r14)
            r13.mo6700b()
            r13.mo7366r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.mo6844v()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.m8244F(r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.c4 r3 = r13.mo6709i()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.mo6886b(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.ga r3 = new com.google.android.gms.measurement.internal.ga     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0086
        L_0x0082:
            r14 = move-exception
            goto L_0x00bb
        L_0x0084:
            r0 = move-exception
            r2 = r1
        L_0x0086:
            com.google.android.gms.measurement.internal.c4 r3 = r13.mo6709i()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r14)     // Catch:{ all -> 0x00b9 }
            r3.mo6887c(r4, r5, r0)     // Catch:{ all -> 0x00b9 }
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b3
            com.google.android.gms.measurement.internal.wa r0 = r13.mo6712l()     // Catch:{ all -> 0x00b9 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ all -> 0x00b9 }
            boolean r14 = r0.mo7398C(r14, r3)     // Catch:{ all -> 0x00b9 }
            if (r14 == 0) goto L_0x00b3
            java.util.List r14 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00b2
            r2.close()
        L_0x00b2:
            return r14
        L_0x00b3:
            if (r2 == 0) goto L_0x00b8
            r2.close()
        L_0x00b8:
            return r1
        L_0x00b9:
            r14 = move-exception
            r1 = r2
        L_0x00bb:
            if (r1 == 0) goto L_0x00c0
            r1.close()
        L_0x00c0:
            goto L_0x00c2
        L_0x00c1:
            throw r14
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6817I(java.lang.String):java.util.List");
    }

    /* renamed from: I0 */
    public final long mo6818I0() {
        Cursor cursor = null;
        try {
            cursor = mo6844v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6886b("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[LOOP:0: B:18:0x0054->B:42:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[EDGE_INSN: B:56:0x00c6->B:43:0x00c6 ?: BREAK  , SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<p148g.p189d.p190a.p232c.p241f.p247f.C4499d1, java.lang.Long>> mo6819J(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.mo6700b()
            r12.mo7366r()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C1658o.m7836a(r2)
            if (r15 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.google.android.gms.common.internal.C1658o.m7836a(r2)
            com.google.android.gms.common.internal.C1658o.m7841f(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.mo6844v()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ce }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00ce }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00ce }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ce }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ce }
            if (r14 != 0) goto L_0x004e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00ce }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r13
        L_0x004e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ce }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00ce }
            r3 = 0
        L_0x0054:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00ce }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ae }
            com.google.android.gms.measurement.internal.ba r7 = r12.mo7383m()     // Catch:{ IOException -> 0x00ae }
            byte[] r6 = r7.mo6755V(r6)     // Catch:{ IOException -> 0x00ae }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00ce }
            if (r7 != 0) goto L_0x006e
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c6
        L_0x006e:
            g.d.a.c.f.f.d1$a r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.m19022P0()     // Catch:{ IOException -> 0x009b }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r7, r6)     // Catch:{ IOException -> 0x009b }
            g.d.a.c.f.f.d1$a r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.C4500a) r7     // Catch:{ IOException -> 0x009b }
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch:{ SQLiteException -> 0x00ce }
            if (r9 != 0) goto L_0x0085
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00ce }
            r7.mo14019r0(r8)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x0085:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r3 = r3 + r6
            g.d.a.c.f.f.l8 r6 = r7.mo14350h()     // Catch:{ SQLiteException -> 0x00ce }
            g.d.a.c.f.f.z6 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r6     // Catch:{ SQLiteException -> 0x00ce }
            g.d.a.c.f.f.d1 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r6     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ce }
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch:{ SQLiteException -> 0x00ce }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x009b:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r5 = r12.mo6709i()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6764E()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x00aa:
            r5.mo6887c(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x00ae:
            r4 = move-exception
            com.google.android.gms.measurement.internal.c4 r5 = r12.mo6709i()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6764E()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00aa
        L_0x00be:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ce }
            if (r4 == 0) goto L_0x00c6
            if (r3 <= r15) goto L_0x0054
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.close()
        L_0x00cb:
            return r14
        L_0x00cc:
            r13 = move-exception
            goto L_0x00ea
        L_0x00ce:
            r14 = move-exception
            com.google.android.gms.measurement.internal.c4 r15 = r12.mo6709i()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.e4 r15 = r15.mo6764E()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ all -> 0x00cc }
            r15.mo6887c(r0, r13, r14)     // Catch:{ all -> 0x00cc }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00e9
            r2.close()
        L_0x00e9:
            return r13
        L_0x00ea:
            if (r2 == 0) goto L_0x00ef
            r2.close()
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
            throw r13
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6819J(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fb, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fc, code lost:
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r12 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013c, code lost:
        r9.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C1800ga> mo6820K(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r20 = this;
            r8 = r21
            com.google.android.gms.common.internal.C1658o.m7841f(r21)
            r20.mo6700b()
            r20.mo7366r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r10 = 3
            r1.<init>(r10)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            r1.add(r8)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            java.lang.String r3 = "app_id=?"
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            boolean r3 = android.text.TextUtils.isEmpty(r22)     // Catch:{ SQLiteException -> 0x00ff, all -> 0x00fb }
            if (r3 != 0) goto L_0x0032
            r3 = r22
            r1.add(r3)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r4 = " and origin=?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            goto L_0x0034
        L_0x0032:
            r3 = r22
        L_0x0034:
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = java.lang.String.valueOf(r23)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r5 = "*"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r1.add(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r4 = " and name glob ?"
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
        L_0x004c:
            int r4 = r1.size()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r15 = r1
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            android.database.sqlite.SQLiteDatabase r11 = r20.mo6844v()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r12 = "user_attributes"
            java.lang.String r1 = "name"
            java.lang.String r4 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r1, r4, r5, r6}     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            java.lang.String r14 = r2.toString()     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "1001"
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x00f7, all -> 0x00fb }
            boolean r1 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            if (r1 != 0) goto L_0x0087
            if (r11 == 0) goto L_0x0086
            r11.close()
        L_0x0086:
            return r0
        L_0x0087:
            int r1 = r0.size()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L_0x00a3
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo6709i()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1.mo6886b(r4, r2)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r12 = r20
            goto L_0x00e2
        L_0x00a3:
            r1 = 0
            java.lang.String r4 = r11.getString(r1)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1 = 1
            long r5 = r11.getLong(r1)     // Catch:{ SQLiteException -> 0x00f3, all -> 0x00ef }
            r1 = 2
            r12 = r20
            java.lang.Object r7 = r12.m8244F(r11, r1)     // Catch:{ SQLiteException -> 0x00ed }
            java.lang.String r13 = r11.getString(r10)     // Catch:{ SQLiteException -> 0x00ed }
            if (r7 != 0) goto L_0x00ce
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo6709i()     // Catch:{ SQLiteException -> 0x00ea }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r2 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r21)     // Catch:{ SQLiteException -> 0x00ea }
            r14 = r23
            r1.mo6888d(r2, r3, r13, r14)     // Catch:{ SQLiteException -> 0x00ea }
            goto L_0x00dc
        L_0x00ce:
            r14 = r23
            com.google.android.gms.measurement.internal.ga r15 = new com.google.android.gms.measurement.internal.ga     // Catch:{ SQLiteException -> 0x00ea }
            r1 = r15
            r2 = r21
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x00ea }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00ea }
        L_0x00dc:
            boolean r1 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x00ea }
            if (r1 != 0) goto L_0x00e8
        L_0x00e2:
            if (r11 == 0) goto L_0x00e7
            r11.close()
        L_0x00e7:
            return r0
        L_0x00e8:
            r3 = r13
            goto L_0x0087
        L_0x00ea:
            r0 = move-exception
            r3 = r13
            goto L_0x0105
        L_0x00ed:
            r0 = move-exception
            goto L_0x0105
        L_0x00ef:
            r0 = move-exception
            r12 = r20
            goto L_0x0139
        L_0x00f3:
            r0 = move-exception
            r12 = r20
            goto L_0x0105
        L_0x00f7:
            r0 = move-exception
            r12 = r20
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            r12 = r20
            goto L_0x013a
        L_0x00ff:
            r0 = move-exception
            r12 = r20
            r3 = r22
        L_0x0104:
            r11 = r9
        L_0x0105:
            com.google.android.gms.measurement.internal.c4 r1 = r20.mo6709i()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r21)     // Catch:{ all -> 0x0138 }
            r1.mo6888d(r2, r4, r3, r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.wa r0 = r20.mo6712l()     // Catch:{ all -> 0x0138 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ all -> 0x0138 }
            boolean r0 = r0.mo7398C(r8, r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0132
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0138 }
            if (r11 == 0) goto L_0x0131
            r11.close()
        L_0x0131:
            return r0
        L_0x0132:
            if (r11 == 0) goto L_0x0137
            r11.close()
        L_0x0137:
            return r9
        L_0x0138:
            r0 = move-exception
        L_0x0139:
            r9 = r11
        L_0x013a:
            if (r9 == 0) goto L_0x013f
            r9.close()
        L_0x013f:
            goto L_0x0141
        L_0x0140:
            throw r0
        L_0x0141:
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6820K(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: L */
    public final List<C1968ua> mo6821L(String str, String[] strArr) {
        mo6700b();
        mo7366r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = mo6844v().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object F = m8244F(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    long j2 = cursor.getLong(8);
                    long j3 = cursor.getLong(10);
                    boolean z2 = z;
                    C1968ua uaVar = r3;
                    C1968ua uaVar2 = new C1968ua(string, string2, new C1776ea(string3, j3, F, string2), j2, z2, string4, (C1933s) mo7383m().mo6759w(cursor.getBlob(7), C1933s.CREATOR), j, (C1933s) mo7383m().mo6759w(cursor.getBlob(9), C1933s.CREATOR), cursor.getLong(11), (C1933s) mo7383m().mo6759w(cursor.getBlob(12), C1933s.CREATOR));
                    arrayList.add(uaVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    mo6709i().mo6764E().mo6886b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6886b("Error querying conditional user property value", e);
            List<C1968ua> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: N */
    public final void mo6822N(C1885o oVar) {
        C1658o.m7845j(oVar);
        mo6700b();
        mo7366r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.f6090a);
        contentValues.put("name", oVar.f6091b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.f6092c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.f6093d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f6095f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.f6096g));
        contentValues.put("last_bundled_day", oVar.f6097h);
        contentValues.put("last_sampled_complex_event_id", oVar.f6098i);
        contentValues.put("last_sampling_rate", oVar.f6099j);
        contentValues.put("current_session_count", Long.valueOf(oVar.f6094e));
        Boolean bool = oVar.f6100k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo6844v().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                mo6709i().mo6764E().mo6886b("Failed to insert/update event aggregates (got -1). appId", C1746c4.m8178w(oVar.f6090a));
            }
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing event aggregates. appId", C1746c4.m8178w(oVar.f6090a), e);
        }
    }

    /* renamed from: O */
    public final void mo6823O(C1782f4 f4Var) {
        C1658o.m7845j(f4Var);
        mo6700b();
        mo7366r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.mo6956t());
        contentValues.put("app_instance_id", f4Var.mo6960x());
        contentValues.put("gmp_app_id", f4Var.mo6898A());
        contentValues.put("resettable_device_id_hash", f4Var.mo6907J());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.mo6935f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.mo6913P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.mo6915R()));
        contentValues.put("app_version", f4Var.mo6917T());
        contentValues.put("app_store", f4Var.mo6921X());
        contentValues.put("gmp_version", Long.valueOf(f4Var.mo6923Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.mo6927b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.mo6933e0()));
        contentValues.put("day", Long.valueOf(f4Var.mo6943j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.mo6945k0()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.mo6947l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.mo6949m0()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.mo6937g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.mo6939h0()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.mo6919V()));
        contentValues.put("firebase_instance_id", f4Var.mo6910M());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.mo6938h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.mo6936g()));
        contentValues.put("health_monitor_sample", f4Var.mo6940i());
        contentValues.put("android_id", Long.valueOf(f4Var.mo6944k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.mo6946l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.mo6948m()));
        contentValues.put("admob_app_id", f4Var.mo6901D());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.mo6931d0()));
        if (f4Var.mo6951o() != null) {
            if (f4Var.mo6951o().size() == 0) {
                mo6709i().mo6767H().mo6886b("Safelisted events should not be an empty list. appId", f4Var.mo6956t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.mo6951o()));
            }
        }
        if (C4884yc.m20730b() && mo6712l().mo7398C(f4Var.mo6956t(), C1957u.f6375k0)) {
            contentValues.put("ga_app_id", f4Var.mo6904G());
        }
        try {
            SQLiteDatabase v = mo6844v();
            if (((long) v.update("apps", contentValues, "app_id = ?", new String[]{f4Var.mo6956t()})) == 0 && v.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                mo6709i().mo6764E().mo6886b("Failed to insert/update app (got -1). appId", C1746c4.m8178w(f4Var.mo6956t()));
            }
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing app. appId", C1746c4.m8178w(f4Var.mo6956t()), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo6824P(String str, List<C4608j0> list) {
        boolean z;
        C1770e4 H;
        String str2;
        Object w;
        Integer valueOf;
        boolean z2;
        String str3 = str;
        List<C4608j0> list2 = list;
        C1658o.m7845j(list);
        for (int i = 0; i < list.size(); i++) {
            C4608j0.C4609a aVar = (C4608j0.C4609a) list2.get(i).mo14813x();
            if (aVar.mo14258A() != 0) {
                for (int i2 = 0; i2 < aVar.mo14258A(); i2++) {
                    C4628k0.C4629a aVar2 = (C4628k0.C4629a) aVar.mo14259B(i2).mo14813x();
                    C4628k0.C4629a aVar3 = (C4628k0.C4629a) ((C4895z6.C4897b) aVar2.clone());
                    String b = C1772e6.m8358b(aVar2.mo14327z());
                    if (b != null) {
                        aVar3.mo14325x(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < aVar2.mo14323A(); i3++) {
                        C4645l0 y = aVar2.mo14326y(i3);
                        String a = C1820i6.m8613a(y.mo14375L());
                        if (a != null) {
                            C4645l0.C4646a aVar4 = (C4645l0.C4646a) y.mo14813x();
                            aVar4.mo14376v(a);
                            aVar3.mo14324v(i3, (C4645l0) ((C4895z6) aVar4.mo14350h()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVar.mo14261x(i2, aVar3);
                        list2.set(i, (C4608j0) ((C4895z6) aVar.mo14350h()));
                    }
                }
            }
            if (aVar.mo14260v() != 0) {
                for (int i4 = 0; i4 < aVar.mo14260v(); i4++) {
                    C4684n0 z3 = aVar.mo14263z(i4);
                    String a2 = C1808h6.m8583a(z3.mo14469F());
                    if (a2 != null) {
                        C4684n0.C4685a aVar5 = (C4684n0.C4685a) z3.mo14813x();
                        aVar5.mo14475v(a2);
                        aVar.mo14262y(i4, aVar5);
                        list2.set(i, (C4608j0) ((C4895z6) aVar.mo14350h()));
                    }
                }
            }
        }
        mo7366r();
        mo6700b();
        C1658o.m7841f(str);
        C1658o.m7845j(list);
        SQLiteDatabase v = mo6844v();
        v.beginTransaction();
        try {
            mo7366r();
            mo6700b();
            C1658o.m7841f(str);
            SQLiteDatabase v2 = mo6844v();
            v2.delete("property_filters", "app_id=?", new String[]{str3});
            v2.delete("event_filters", "app_id=?", new String[]{str3});
            for (C4608j0 next : list) {
                mo7366r();
                mo6700b();
                C1658o.m7841f(str);
                C1658o.m7845j(next);
                if (next.mo14251G()) {
                    int I = next.mo14252I();
                    Iterator<C4628k0> it = next.mo14256M().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().mo14312G()) {
                                H = mo6709i().mo6767H();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                w = C1746c4.m8178w(str);
                                valueOf = Integer.valueOf(I);
                                break;
                            }
                        } else {
                            for (C4684n0 D : next.mo14254K()) {
                                if (!D.mo14467D()) {
                                    H = mo6709i().mo6767H();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    w = C1746c4.m8178w(str);
                                    valueOf = Integer.valueOf(I);
                                }
                            }
                            Iterator<C4628k0> it2 = next.mo14256M().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!m8247V(str3, I, it2.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<C4684n0> it3 = next.mo14254K().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!m8248W(str3, I, it3.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                mo7366r();
                                mo6700b();
                                C1658o.m7841f(str);
                                SQLiteDatabase v3 = mo6844v();
                                v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str3, String.valueOf(I)});
                                v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str3, String.valueOf(I)});
                            }
                        }
                    }
                    H.mo6887c(str2, w, valueOf);
                    break;
                }
                mo6709i().mo6767H().mo6886b("Audience with no ID. appId", C1746c4.m8178w(str));
            }
            ArrayList arrayList = new ArrayList();
            for (C4608j0 next2 : list) {
                arrayList.add(next2.mo14251G() ? Integer.valueOf(next2.mo14252I()) : null);
            }
            m8259m0(str3, arrayList);
            v.setTransactionSuccessful();
        } finally {
            v.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo6825Q(List<Long> list) {
        mo6700b();
        mo7366r();
        C1658o.m7845j(list);
        C1658o.m7847l(list.size());
        if (m8257h0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m8258i0(sb3.toString(), (String[]) null) > 0) {
                mo6709i().mo6767H().mo6885a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = mo6844v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo6709i().mo6764E().mo6886b("Error incrementing retry count. error", e);
            }
        }
    }

    /* renamed from: R */
    public final boolean mo6826R(C4499d1 d1Var, boolean z) {
        C1770e4 E;
        Object w;
        String str;
        mo6700b();
        mo7366r();
        C1658o.m7845j(d1Var);
        C1658o.m7841f(d1Var.mo13926U2());
        C1658o.m7848m(d1Var.mo13956t2());
        mo6811D0();
        long c = mo6708g().mo6587c();
        if (d1Var.mo13958u2() < c - C1992wa.m9065J() || d1Var.mo13958u2() > C1992wa.m9065J() + c) {
            mo6709i().mo6767H().mo6888d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C1746c4.m8178w(d1Var.mo13926U2()), Long.valueOf(c), Long.valueOf(d1Var.mo13958u2()));
        }
        try {
            byte[] W = mo7383m().mo6756W(d1Var.mo14268k());
            mo6709i().mo6772M().mo6886b("Saving bundle, size", Integer.valueOf(W.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", d1Var.mo13926U2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(d1Var.mo13958u2()));
            contentValues.put("data", W);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (d1Var.mo13962x0()) {
                contentValues.put("retry_count", Integer.valueOf(d1Var.mo13909I0()));
            }
            try {
                if (mo6844v().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                mo6709i().mo6764E().mo6886b("Failed to insert bundle (got -1). appId", C1746c4.m8178w(d1Var.mo13926U2()));
                return false;
            } catch (SQLiteException e) {
                e = e;
                E = mo6709i().mo6764E();
                w = C1746c4.m8178w(d1Var.mo13926U2());
                str = "Error storing bundle. appId";
                E.mo6887c(str, w, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            E = mo6709i().mo6764E();
            w = C1746c4.m8178w(d1Var.mo13926U2());
            str = "Data loss. Failed to serialize bundle. appId";
            E.mo6887c(str, w, e);
            return false;
        }
    }

    /* renamed from: S */
    public final boolean mo6827S(C1849l lVar, long j, boolean z) {
        mo6700b();
        mo7366r();
        C1658o.m7845j(lVar);
        C1658o.m7841f(lVar.f5977a);
        byte[] k = mo7383m().mo6760x(lVar).mo14268k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.f5977a);
        contentValues.put("name", lVar.f5978b);
        contentValues.put("timestamp", Long.valueOf(lVar.f5980d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", k);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo6844v().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            mo6709i().mo6764E().mo6886b("Failed to insert raw event (got -1). appId", C1746c4.m8178w(lVar.f5977a));
            return false;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing raw event. appId", C1746c4.m8178w(lVar.f5977a), e);
            return false;
        }
    }

    /* renamed from: T */
    public final boolean mo6828T(C1800ga gaVar) {
        C1658o.m7845j(gaVar);
        mo6700b();
        mo7366r();
        if (mo6836o0(gaVar.f5852a, gaVar.f5854c) == null) {
            if (C1788fa.m8460d0(gaVar.f5854c)) {
                if (m8258i0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{gaVar.f5852a}) >= ((long) mo6712l().mo7421y(gaVar.f5852a))) {
                    return false;
                }
            } else if (!"_npa".equals(gaVar.f5854c)) {
                if (m8258i0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{gaVar.f5852a, gaVar.f5853b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gaVar.f5852a);
        contentValues.put("origin", gaVar.f5853b);
        contentValues.put("name", gaVar.f5854c);
        contentValues.put("set_timestamp", Long.valueOf(gaVar.f5855d));
        m8246M(contentValues, "value", gaVar.f5856e);
        try {
            if (mo6844v().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                mo6709i().mo6764E().mo6886b("Failed to insert/update user property (got -1). appId", C1746c4.m8178w(gaVar.f5852a));
            }
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing user property. appId", C1746c4.m8178w(gaVar.f5852a), e);
        }
        return true;
    }

    /* renamed from: U */
    public final boolean mo6829U(C1968ua uaVar) {
        C1658o.m7845j(uaVar);
        mo6700b();
        mo7366r();
        if (mo6836o0(uaVar.f6434f, uaVar.f6436h.f5774g) == null) {
            if (m8258i0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{uaVar.f6434f}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", uaVar.f6434f);
        contentValues.put("origin", uaVar.f6435g);
        contentValues.put("name", uaVar.f6436h.f5774g);
        m8246M(contentValues, "value", uaVar.f6436h.mo6894d());
        contentValues.put("active", Boolean.valueOf(uaVar.f6438j));
        contentValues.put("trigger_event_name", uaVar.f6439k);
        contentValues.put("trigger_timeout", Long.valueOf(uaVar.f6441m));
        mo6707f();
        contentValues.put("timed_out_event", C1788fa.m8464o0(uaVar.f6440l));
        contentValues.put("creation_timestamp", Long.valueOf(uaVar.f6437i));
        mo6707f();
        contentValues.put("triggered_event", C1788fa.m8464o0(uaVar.f6442n));
        contentValues.put("triggered_timestamp", Long.valueOf(uaVar.f6436h.f5775h));
        contentValues.put("time_to_live", Long.valueOf(uaVar.f6443o));
        mo6707f();
        contentValues.put("expired_event", C1788fa.m8464o0(uaVar.f6444p));
        try {
            if (mo6844v().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                mo6709i().mo6764E().mo6886b("Failed to insert/update conditional user property (got -1)", C1746c4.m8178w(uaVar.f6434f));
            }
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing conditional user property", C1746c4.m8178w(uaVar.f6434f), e);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo6830X(String str, Bundle bundle) {
        mo6700b();
        mo7366r();
        byte[] k = mo7383m().mo6760x(new C1849l(this.f5634a, BuildConfig.FLAVOR, str, "dep", 0, 0, bundle)).mo14268k();
        mo6709i().mo6772M().mo6887c("Saving default event parameters, appId, data size", mo6705d().mo6692v(str), Integer.valueOf(k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", k);
        try {
            if (mo6844v().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo6709i().mo6764E().mo6886b("Failed to insert default event parameters (got -1). appId", C1746c4.m8178w(str));
            return false;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing default event parameters. appId", C1746c4.m8178w(str), e);
            return false;
        }
    }

    /* renamed from: Y */
    public final boolean mo6831Y(String str, Long l, long j, C4888z0 z0Var) {
        mo6700b();
        mo7366r();
        C1658o.m7845j(z0Var);
        C1658o.m7841f(str);
        C1658o.m7845j(l);
        byte[] k = z0Var.mo14268k();
        mo6709i().mo6772M().mo6887c("Saving complex main event, appId, data size", mo6705d().mo6692v(str), Integer.valueOf(k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", k);
        try {
            if (mo6844v().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo6709i().mo6764E().mo6886b("Failed to insert complex main event (got -1). appId", C1746c4.m8178w(str));
            return false;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing complex main event. appId", C1746c4.m8178w(str), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011f A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0159 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0172 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e9 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022d  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1782f4 mo6832j0(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            com.google.android.gms.common.internal.C1658o.m7841f(r35)
            r34.mo6700b()
            r34.mo7366r()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.mo6844v()     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r4 = "apps"
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            if (r4 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            return r2
        L_0x006b:
            com.google.android.gms.measurement.internal.f4 r4 = new com.google.android.gms.measurement.internal.f4     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            r5 = r34
            com.google.android.gms.measurement.internal.x9 r6 = r5.f6476b     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.h5 r6 = r6.mo7459k0()     // Catch:{ SQLiteException -> 0x0200 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6928c(r6)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6954r(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6900C(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6905H(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6924a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6953q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6906I(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6909L(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6961y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6899B(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 != 0) goto L_0x00d9
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            r4.mo6932e(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6914Q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6916S(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6918U(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6920W(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6908K(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6911N(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0124:
            r4.mo6957u(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6903F(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6925a0(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6922Y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6912O(r6)     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.wa r6 = r34.mo6712l()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C1957u.f6320G0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r6 = r6.mo7415s(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r7 = 0
            if (r6 != 0) goto L_0x016a
            r6 = 22
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 == 0) goto L_0x0163
            r9 = r7
            goto L_0x0167
        L_0x0163:
            long r9 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0167:
            r4.mo6929c0(r9)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x016a:
            r6 = 23
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x017b
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r6 = 0
            goto L_0x017c
        L_0x017b:
            r6 = 1
        L_0x017c:
            r4.mo6955s(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 24
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x018f
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r4.mo6959w(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6958v(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            long r7 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01a8:
            r4.mo6902E(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 != 0) goto L_0x01c5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6930d(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01c5:
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.wa r0 = r34.mo6712l()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C1957u.f6375k0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r0.mo7398C(r1, r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo6962z(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01e0:
            r4.mo6952p()     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01fa
            com.google.android.gms.measurement.internal.c4 r0 = r34.mo6709i()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r35)     // Catch:{ SQLiteException -> 0x0200 }
            r0.mo6886b(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01fa:
            if (r3 == 0) goto L_0x01ff
            r3.close()
        L_0x01ff:
            return r4
        L_0x0200:
            r0 = move-exception
            goto L_0x0212
        L_0x0202:
            r0 = move-exception
            r5 = r34
            goto L_0x022a
        L_0x0206:
            r0 = move-exception
            r5 = r34
            goto L_0x0212
        L_0x020a:
            r0 = move-exception
            r5 = r34
            goto L_0x022b
        L_0x020e:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0212:
            com.google.android.gms.measurement.internal.c4 r4 = r34.mo6709i()     // Catch:{ all -> 0x0229 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6764E()     // Catch:{ all -> 0x0229 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r35)     // Catch:{ all -> 0x0229 }
            r4.mo6887c(r6, r1, r0)     // Catch:{ all -> 0x0229 }
            if (r3 == 0) goto L_0x0228
            r3.close()
        L_0x0228:
            return r2
        L_0x0229:
            r0 = move-exception
        L_0x022a:
            r2 = r3
        L_0x022b:
            if (r2 == 0) goto L_0x0230
            r2.close()
        L_0x0230:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6832j0(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    /* renamed from: k0 */
    public final List<C1968ua> mo6833k0(String str, String str2, String str3) {
        C1658o.m7841f(str);
        mo6700b();
        mo7366r();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo6821L(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: l0 */
    public final void mo6834l0(String str, String str2) {
        C1658o.m7841f(str);
        C1658o.m7841f(str2);
        mo6700b();
        mo7366r();
        try {
            mo6844v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6888d("Error deleting user property. appId", C1746c4.m8178w(str), mo6705d().mo6694z(str2), e);
        }
    }

    /* renamed from: n0 */
    public final long mo6835n0(String str) {
        C1658o.m7841f(str);
        mo6700b();
        mo7366r();
        try {
            return (long) mo6844v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo6712l().mo7417u(str, C1957u.f6384p))))});
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error deleting over the limit events. appId", C1746c4.m8178w(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1800ga mo6836o0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C1658o.m7841f(r19)
            com.google.android.gms.common.internal.C1658o.m7841f(r20)
            r18.mo6700b()
            r18.mo7366r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo6844v()     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.m8244F(r10, r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.ga r0 = new com.google.android.gms.measurement.internal.ga     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.c4 r1 = r18.mo6709i()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.mo6886b(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0086
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a6
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0086
        L_0x007e:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x0082:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0086:
            com.google.android.gms.measurement.internal.c4 r1 = r18.mo6709i()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r19)     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.a4 r4 = r18.mo6705d()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.mo6694z(r8)     // Catch:{ all -> 0x00a5 }
            r1.mo6888d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x00a4
            r10.close()
        L_0x00a4:
            return r9
        L_0x00a5:
            r0 = move-exception
        L_0x00a6:
            r9 = r10
        L_0x00a7:
            if (r9 == 0) goto L_0x00ac
            r9.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6836o0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ga");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1968ua mo6837p0(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.C1658o.m7841f(r30)
            com.google.android.gms.common.internal.C1658o.m7841f(r31)
            r29.mo6700b()
            r29.mo7366r()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.mo6844v()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.m8244F(r9, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ba r0 = r29.mo7383m()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r2 = com.google.android.gms.measurement.internal.C1933s.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo6759w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.s r22 = (com.google.android.gms.measurement.internal.C1933s) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ba r0 = r29.mo7383m()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r2 = com.google.android.gms.measurement.internal.C1933s.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo6759w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.s r25 = (com.google.android.gms.measurement.internal.C1933s) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ba r0 = r29.mo7383m()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.s> r2 = com.google.android.gms.measurement.internal.C1933s.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo6759w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.s r28 = (com.google.android.gms.measurement.internal.C1933s) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ea r17 = new com.google.android.gms.measurement.internal.ea     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.ua r0 = new com.google.android.gms.measurement.internal.ua     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.c4 r1 = r29.mo6709i()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.a4 r4 = r29.mo6705d()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.mo6694z(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.mo6887c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0102
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0122
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0102
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00fe:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0102:
            com.google.android.gms.measurement.internal.c4 r1 = r29.mo6709i()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r30)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.a4 r4 = r29.mo6705d()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = r4.mo6694z(r7)     // Catch:{ all -> 0x0121 }
            r1.mo6888d(r2, r3, r4, r0)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x0120
            r9.close()
        L_0x0120:
            return r8
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r8 = r9
        L_0x0123:
            if (r8 == 0) goto L_0x0128
            r8.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6837p0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ua");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo6838q0(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C1658o.m7841f(r11)
            r10.mo6700b()
            r10.mo7366r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.mo6844v()     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.c4 r3 = r10.mo6709i()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.mo6886b(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0058
        L_0x0054:
            r11 = move-exception
            goto L_0x0071
        L_0x0056:
            r2 = move-exception
            r1 = r0
        L_0x0058:
            com.google.android.gms.measurement.internal.c4 r3 = r10.mo6709i()     // Catch:{ all -> 0x006f }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ all -> 0x006f }
            r3.mo6887c(r4, r11, r2)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            return r0
        L_0x006f:
            r11 = move-exception
            r0 = r1
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6838q0(java.lang.String):byte[]");
    }

    /* renamed from: r0 */
    public final int mo6839r0(String str, String str2) {
        C1658o.m7841f(str);
        C1658o.m7841f(str2);
        mo6700b();
        mo7366r();
        try {
            return mo6844v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6888d("Error deleting conditional property", C1746c4.m8178w(str), mo6705d().mo6694z(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final Map<Integer, List<C4628k0>> mo6840s0(String str) {
        C1658o.m7841f(str);
        C3190a aVar = new C3190a();
        Cursor cursor = null;
        try {
            cursor = mo6844v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<C4628k0>> emptyMap = Collections.emptyMap();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyMap;
            }
            do {
                byte[] blob = cursor.getBlob(1);
                try {
                    C4628k0.C4629a U = C4628k0.m19791U();
                    C1740ba.m8151z(U, blob);
                    C4628k0 k0Var = (C4628k0) ((C4895z6) U.mo14350h());
                    if (k0Var.mo14317M()) {
                        int i = cursor.getInt(0);
                        List list = (List) aVar.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            aVar.put(Integer.valueOf(i), list);
                        }
                        list.add(k0Var);
                    }
                } catch (IOException e) {
                    mo6709i().mo6764E().mo6887c("Failed to merge filter. appId", C1746c4.m8178w(str), e);
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return aVar;
        } catch (SQLiteException e2) {
            mo6709i().mo6764E().mo6887c("Database error querying filters. appId", C1746c4.m8178w(str), e2);
            Map<Integer, List<C4628k0>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo6730t() {
        return false;
    }

    /* renamed from: t0 */
    public final void mo6841t0() {
        mo7366r();
        mo6844v().beginTransaction();
    }

    /* renamed from: u */
    public final void mo6842u() {
        mo7366r();
        mo6844v().setTransactionSuccessful();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e A[Catch:{ all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo6843u0(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo7366r()
            r7.mo6700b()
            com.google.android.gms.common.internal.C1658o.m7841f(r8)
            f.e.a r0 = new f.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.mo6844v()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006b
        L_0x0067:
            r8 = move-exception
            goto L_0x00a0
        L_0x0069:
            r0 = move-exception
            r1 = r2
        L_0x006b:
            com.google.android.gms.measurement.internal.c4 r3 = r7.mo6709i()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r8)     // Catch:{ all -> 0x009e }
            r3.mo6887c(r4, r5, r0)     // Catch:{ all -> 0x009e }
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0098
            com.google.android.gms.measurement.internal.wa r0 = r7.mo6712l()     // Catch:{ all -> 0x009e }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ all -> 0x009e }
            boolean r8 = r0.mo7398C(r8, r3)     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0098
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            return r8
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            return r2
        L_0x009e:
            r8 = move-exception
            r2 = r1
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.close()
        L_0x00a5:
            goto L_0x00a7
        L_0x00a6:
            throw r8
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6843u0(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final SQLiteDatabase mo6844v() {
        mo6700b();
        try {
            return this.f5721d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo6709i().mo6767H().mo6886b("Error opening database", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p148g.p189d.p190a.p232c.p241f.p247f.C4628k0>> mo6845v0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo7366r()
            r12.mo6700b()
            com.google.android.gms.common.internal.C1658o.m7841f(r13)
            com.google.android.gms.common.internal.C1658o.m7841f(r14)
            f.e.a r0 = new f.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo6844v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            g.d.a.c.f.f.k0$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4628k0.m19791U()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r2, r1)     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.k0$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4628k0.C4629a) r2     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.l8 r1 = r2.mo14350h()     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.z6 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r1     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.k0 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4628k0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r12.mo6709i()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo6887c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00d0
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.c4 r1 = r12.mo6709i()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ all -> 0x00ce }
            r1.mo6887c(r2, r3, r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.wa r0 = r12.mo6712l()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ all -> 0x00ce }
            boolean r13 = r0.mo7398C(r13, r1)     // Catch:{ all -> 0x00ce }
            if (r13 == 0) goto L_0x00c8
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00ce }
            if (r14 == 0) goto L_0x00c7
            r14.close()
        L_0x00c7:
            return r13
        L_0x00c8:
            if (r14 == 0) goto L_0x00cd
            r14.close()
        L_0x00cd:
            return r9
        L_0x00ce:
            r13 = move-exception
            r9 = r14
        L_0x00d0:
            if (r9 == 0) goto L_0x00d5
            r9.close()
        L_0x00d5:
            goto L_0x00d7
        L_0x00d6:
            throw r13
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6845v0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo6846w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo6844v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.c4 r3 = r6.mo6709i()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo6886b(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6846w():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0 A[Catch:{ all -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, p148g.p189d.p190a.p232c.p241f.p247f.C4536f1> mo6847w0(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo7366r()
            r11.mo6700b()
            com.google.android.gms.common.internal.C1658o.m7841f(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo6844v()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x009b, all -> 0x0099 }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 != 0) goto L_0x004f
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 == 0) goto L_0x0049
            com.google.android.gms.measurement.internal.wa r1 = r11.mo6712l()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ SQLiteException -> 0x0097 }
            boolean r1 = r1.mo7398C(r12, r2)     // Catch:{ SQLiteException -> 0x0097 }
            if (r1 == 0) goto L_0x0049
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0097 }
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            return r12
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            return r8
        L_0x004f:
            f.e.a r1 = new f.e.a     // Catch:{ SQLiteException -> 0x0097 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x0097 }
        L_0x0054:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x0097 }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x0097 }
            g.d.a.c.f.f.f1$a r4 = p148g.p189d.p190a.p232c.p241f.p247f.C4536f1.m19369c0()     // Catch:{ IOException -> 0x0075 }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r4, r3)     // Catch:{ IOException -> 0x0075 }
            g.d.a.c.f.f.f1$a r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1.C4537a) r4     // Catch:{ IOException -> 0x0075 }
            g.d.a.c.f.f.l8 r3 = r4.mo14350h()     // Catch:{ IOException -> 0x0075 }
            g.d.a.c.f.f.z6 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r3     // Catch:{ IOException -> 0x0075 }
            g.d.a.c.f.f.f1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4536f1) r3     // Catch:{ IOException -> 0x0075 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0097 }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x0097 }
            goto L_0x008b
        L_0x0075:
            r3 = move-exception
            com.google.android.gms.measurement.internal.c4 r4 = r11.mo6709i()     // Catch:{ SQLiteException -> 0x0097 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6764E()     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r12)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0097 }
            r4.mo6888d(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0097 }
        L_0x008b:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x0097 }
            if (r2 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            return r1
        L_0x0097:
            r1 = move-exception
            goto L_0x009d
        L_0x0099:
            r12 = move-exception
            goto L_0x00d2
        L_0x009b:
            r1 = move-exception
            r0 = r8
        L_0x009d:
            com.google.android.gms.measurement.internal.c4 r2 = r11.mo6709i()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r12)     // Catch:{ all -> 0x00d0 }
            r2.mo6887c(r3, r4, r1)     // Catch:{ all -> 0x00d0 }
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ca
            com.google.android.gms.measurement.internal.wa r1 = r11.mo6712l()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ all -> 0x00d0 }
            boolean r12 = r1.mo7398C(r12, r2)     // Catch:{ all -> 0x00d0 }
            if (r12 == 0) goto L_0x00ca
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            return r12
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()
        L_0x00cf:
            return r8
        L_0x00d0:
            r12 = move-exception
            r8 = r0
        L_0x00d2:
            if (r8 == 0) goto L_0x00d7
            r8.close()
        L_0x00d7:
            goto L_0x00d9
        L_0x00d8:
            throw r12
        L_0x00d9:
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6847w0(java.lang.String):java.util.Map");
    }

    /* renamed from: x */
    public final boolean mo6848x() {
        return m8258i0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be A[Catch:{ all -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d2  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<p148g.p189d.p190a.p232c.p241f.p247f.C4684n0>> mo6849x0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo7366r()
            r12.mo6700b()
            com.google.android.gms.common.internal.C1658o.m7841f(r13)
            com.google.android.gms.common.internal.C1658o.m7841f(r14)
            f.e.a r0 = new f.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo6844v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            g.d.a.c.f.f.n0$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4684n0.m19982M()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r2, r1)     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.n0$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4684n0.C4685a) r2     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.l8 r1 = r2.mo14350h()     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.z6 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r1     // Catch:{ IOException -> 0x0077 }
            g.d.a.c.f.f.n0 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4684n0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r12.mo6709i()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo6887c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00d0
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.c4 r1 = r12.mo6709i()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ all -> 0x00ce }
            r1.mo6887c(r2, r3, r0)     // Catch:{ all -> 0x00ce }
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4548fc.m19433b()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.wa r0 = r12.mo6712l()     // Catch:{ all -> 0x00ce }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C1957u.f6334N0     // Catch:{ all -> 0x00ce }
            boolean r13 = r0.mo7398C(r13, r1)     // Catch:{ all -> 0x00ce }
            if (r13 == 0) goto L_0x00c8
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x00ce }
            if (r14 == 0) goto L_0x00c7
            r14.close()
        L_0x00c7:
            return r13
        L_0x00c8:
            if (r14 == 0) goto L_0x00cd
            r14.close()
        L_0x00cd:
            return r9
        L_0x00ce:
            r13 = move-exception
            r9 = r14
        L_0x00d0:
            if (r9 == 0) goto L_0x00d5
            r9.close()
        L_0x00d5:
            goto L_0x00d7
        L_0x00d6:
            throw r13
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1753d.mo6849x0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: y */
    public final long mo6850y(C4499d1 d1Var) throws IOException {
        mo6700b();
        mo7366r();
        C1658o.m7845j(d1Var);
        C1658o.m7841f(d1Var.mo13926U2());
        byte[] k = d1Var.mo14268k();
        long v = mo7383m().mo6758v(k);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d1Var.mo13926U2());
        contentValues.put("metadata_fingerprint", Long.valueOf(v));
        contentValues.put("metadata", k);
        try {
            mo6844v().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return v;
        } catch (SQLiteException e) {
            mo6709i().mo6764E().mo6887c("Error storing raw event metadata. appId", C1746c4.m8178w(d1Var.mo13926U2()), e);
            throw e;
        }
    }

    /* renamed from: y0 */
    public final void mo6851y0() {
        mo7366r();
        mo6844v().endTransaction();
    }

    /* renamed from: z0 */
    public final long mo6852z0(String str) {
        C1658o.m7841f(str);
        return m8260z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }
}
