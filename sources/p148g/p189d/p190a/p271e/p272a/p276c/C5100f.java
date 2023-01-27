package p148g.p189d.p190a.p271e.p272a.p276c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: g.d.a.e.a.c.f */
public final class C5100f {

    /* renamed from: a */
    private final String f15131a;

    public C5100f(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f15131a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private final int m21476a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m21477b(this.f15131a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static String m21477b(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: c */
    public final void mo15203c(String str, Object... objArr) {
        m21476a(3, str, objArr);
    }

    /* renamed from: d */
    public final void mo15204d(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m21477b(this.f15131a, str, objArr), th);
        }
    }

    /* renamed from: e */
    public final void mo15205e(String str, Object... objArr) {
        m21476a(6, str, objArr);
    }

    /* renamed from: f */
    public final void mo15206f(String str, Object... objArr) {
        m21476a(4, str, objArr);
    }

    /* renamed from: g */
    public final void mo15207g(String str, Object... objArr) {
        m21476a(5, str, objArr);
    }
}
