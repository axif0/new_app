package p048d.p049a.p050a.p051a.p078s;

import android.content.Context;
import android.content.SharedPreferences;
import com.karumi.dexter.BuildConfig;
import java.util.List;

/* renamed from: d.a.a.a.s.l */
public class C3099l {

    /* renamed from: a */
    private static C3099l f9873a;

    /* renamed from: b */
    private static SharedPreferences f9874b;

    private C3099l(Context context) {
        f9874b = context.getApplicationContext().getSharedPreferences("bracu_android", 0);
    }

    /* renamed from: b */
    public static C3099l m13277b(Context context) {
        if (f9873a == null) {
            f9873a = new C3099l(context);
        }
        return f9873a;
    }

    /* renamed from: a */
    public boolean mo10689a(String str) {
        return f9874b.getBoolean(str, false);
    }

    /* renamed from: c */
    public int mo10690c(String str, int i) {
        return f9874b.getInt(str, i);
    }

    /* renamed from: d */
    public String mo10691d(String str) {
        return f9874b.getString(str, BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    public String mo10692e(String str, String str2) {
        return f9874b.getString(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10693f(List<String> list) {
        SharedPreferences.Editor edit = f9874b.edit();
        for (String remove : list) {
            edit.remove(remove);
        }
        edit.apply();
    }

    /* renamed from: g */
    public void mo10694g(String str, boolean z) {
        f9874b.edit().putBoolean(str, z).apply();
    }

    /* renamed from: h */
    public void mo10695h(String str, int i) {
        f9874b.edit().putInt(str, i).apply();
    }

    /* renamed from: i */
    public void mo10696i(String str, String str2) {
        f9874b.edit().putString(str, str2).apply();
    }

    /* renamed from: j */
    public void mo10697j(List<String> list, List<String> list2) {
        SharedPreferences.Editor edit = f9874b.edit();
        for (int i = 0; i < list.size(); i++) {
            edit.putString(list.get(i), list2.get(i));
        }
        edit.apply();
    }
}
