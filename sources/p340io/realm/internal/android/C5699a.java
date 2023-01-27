package p340io.realm.internal.android;

import android.os.Looper;
import com.karumi.dexter.BuildConfig;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import p340io.realm.internal.C5698a;

/* renamed from: io.realm.internal.android.a */
public class C5699a implements C5698a {
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL"})

    /* renamed from: c */
    public static boolean f16482c = false;

    /* renamed from: a */
    private final Looper f16483a = Looper.myLooper();

    /* renamed from: b */
    private final boolean f16484b = m23798d();

    /* renamed from: c */
    private boolean m23797c() {
        return this.f16483a != null;
    }

    /* renamed from: d */
    private static boolean m23798d() {
        String name = Thread.currentThread().getName();
        return name != null && name.startsWith("IntentService[");
    }

    /* renamed from: a */
    public boolean mo16608a() {
        return m23797c() && !this.f16484b;
    }

    /* renamed from: b */
    public void mo16609b(String str) {
        boolean c = m23797c();
        String str2 = BuildConfig.FLAVOR;
        if (!c) {
            if (str != null) {
                str2 = str + " " + "Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        } else if (this.f16484b) {
            if (str != null) {
                str2 = str + " " + "Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }

    /* renamed from: e */
    public boolean mo16610e() {
        Looper looper = this.f16483a;
        return looper != null && (f16482c || looper == Looper.getMainLooper());
    }
}
