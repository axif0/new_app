package p086f.p111h.p118i;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: f.h.i.c */
public class C3310c {
    /* renamed from: a */
    public static boolean m14263a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
