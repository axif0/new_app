package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C0575h;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: androidx.core.app.j */
class C0583j {

    /* renamed from: a */
    private static final Object f2427a = new Object();

    /* renamed from: b */
    private static Field f2428b;

    /* renamed from: c */
    private static boolean f2429c;

    /* renamed from: a */
    public static SparseArray<Bundle> m2723a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    static Bundle m2724b(C0575h.C0576a aVar) {
        Bundle bundle = new Bundle();
        IconCompat e = aVar.mo2826e();
        bundle.putInt("icon", e != null ? e.mo2878c() : 0);
        bundle.putCharSequence("title", aVar.mo2830i());
        bundle.putParcelable("actionIntent", aVar.mo2822a());
        Bundle bundle2 = aVar.mo2825d() != null ? new Bundle(aVar.mo2825d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.mo2823b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m2727e(aVar.mo2827f()));
        bundle.putBoolean("showsUserInterface", aVar.mo2829h());
        bundle.putInt("semanticAction", aVar.mo2828g());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m2725c(Notification notification) {
        String str;
        String str2;
        synchronized (f2427a) {
            if (f2429c) {
                return null;
            }
            try {
                if (f2428b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2429c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2428b = declaredField;
                }
                Bundle bundle = (Bundle) f2428b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2428b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f2429c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f2429c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m2726d(C0584k kVar) {
        new Bundle();
        kVar.mo2868c();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m2727e(C0584k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[kVarArr.length];
        if (kVarArr.length <= 0) {
            return bundleArr;
        }
        m2726d(kVarArr[0]);
        throw null;
    }

    /* renamed from: f */
    public static Bundle m2728f(Notification.Builder builder, C0575h.C0576a aVar) {
        IconCompat e = aVar.mo2826e();
        builder.addAction(e != null ? e.mo2878c() : 0, aVar.mo2830i(), aVar.mo2822a());
        Bundle bundle = new Bundle(aVar.mo2825d());
        if (aVar.mo2827f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m2727e(aVar.mo2827f()));
        }
        if (aVar.mo2824c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m2727e(aVar.mo2824c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2823b());
        return bundle;
    }
}
