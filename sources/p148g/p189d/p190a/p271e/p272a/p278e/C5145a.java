package p148g.p189d.p190a.p271e.p272a.p278e;

import android.content.Context;
import android.util.Base64;
import com.karumi.dexter.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: g.d.a.e.a.e.a */
public final class C5145a {
    /* renamed from: a */
    public static Context m21596a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* renamed from: b */
    public static String m21597b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
