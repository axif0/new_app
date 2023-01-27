package p148g.p189d.p190a.p232c.p233a.p234a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import p148g.p189d.p190a.p232c.p237d.C4379j;

/* renamed from: g.d.a.c.a.a.c */
public final class C4329c {

    /* renamed from: a */
    private SharedPreferences f13831a;

    public C4329c(Context context) {
        try {
            Context c = C4379j.m18595c(context);
            this.f13831a = c == null ? null : c.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f13831a = null;
        }
    }

    /* renamed from: a */
    public final boolean mo13617a(String str, boolean z) {
        try {
            if (this.f13831a == null) {
                return false;
            }
            return this.f13831a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo13618b(String str, float f) {
        try {
            if (this.f13831a == null) {
                return 0.0f;
            }
            return this.f13831a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo13619c(String str, String str2) {
        try {
            return this.f13831a == null ? str2 : this.f13831a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
