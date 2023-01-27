package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C1801h {
    /* renamed from: a */
    private static Set<String> m8527a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    static void m8528b(C1746c4 c4Var, SQLiteDatabase sQLiteDatabase) {
        if (c4Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c4Var.mo6767H().mo6885a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c4Var.mo6767H().mo6885a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c4Var.mo6767H().mo6885a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c4Var.mo6767H().mo6885a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* renamed from: c */
    static void m8529c(C1746c4 c4Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (c4Var != null) {
            if (!m8530d(c4Var, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (c4Var != null) {
                try {
                    Set<String> a = m8527a(sQLiteDatabase, str);
                    String[] split = str3.split(",");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String str4 = split[i];
                        if (a.remove(str4)) {
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                            sb.append("Table ");
                            sb.append(str);
                            sb.append(" is missing required column: ");
                            sb.append(str4);
                            throw new SQLiteException(sb.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            if (!a.remove(strArr[i2])) {
                                sQLiteDatabase.execSQL(strArr[i2 + 1]);
                            }
                        }
                    }
                    if (!a.isEmpty()) {
                        c4Var.mo6767H().mo6887c("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
                    }
                } catch (SQLiteException e) {
                    c4Var.mo6764E().mo6886b("Failed to verify columns on table that was just created", str);
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Monitor must not be null");
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: d */
    private static boolean m8530d(C1746c4 c4Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (c4Var != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                if (query != null) {
                    query.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                c4Var.mo6767H().mo6887c("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }
}