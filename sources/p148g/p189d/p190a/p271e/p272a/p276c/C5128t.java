package p148g.p189d.p190a.p271e.p272a.p276c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import p148g.p189d.p190a.p271e.p272a.p278e.C5145a;

/* renamed from: g.d.a.e.a.c.t */
public final class C5128t {

    /* renamed from: a */
    private static final C5100f f15159a = new C5100f("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static boolean m21549a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || (r1 = signatureArr.length) == 0) {
                f15159a.mo15207g("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                return false;
            }
            for (Signature byteArray : signatureArr) {
                String b = C5145a.m21597b(byteArray.toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(b)) {
                    return true;
                }
                if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(b)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
