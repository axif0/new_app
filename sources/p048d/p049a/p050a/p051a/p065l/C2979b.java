package p048d.p049a.p050a.p051a.p065l;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* renamed from: d.a.a.a.l.b */
public class C2979b {

    /* renamed from: a */
    private File f9514a;

    public C2979b(Context context) {
        this.f9514a = Environment.getExternalStorageState().equals("mounted") ? new File(Environment.getExternalStorageDirectory(), "LazyList") : context.getCacheDir();
        if (!this.f9514a.exists()) {
            this.f9514a.mkdirs();
        }
    }

    /* renamed from: a */
    public File mo10305a(String str) {
        return new File(this.f9514a, String.valueOf(str.hashCode()));
    }
}
