package p340io.realm.internal;

import android.content.Context;
import java.io.File;
import p148g.p176b.p177a.C3683c;

/* renamed from: io.realm.internal.m */
public class C5719m {

    /* renamed from: a */
    private static final String f16523a = File.separator;

    /* renamed from: b */
    private static final String f16524b = File.pathSeparator;

    /* renamed from: c */
    private static boolean f16525c = false;

    static {
        "lib" + f16524b + ".." + f16523a + "lib";
    }

    /* renamed from: a */
    public static synchronized void m23888a(Context context) {
        synchronized (C5719m.class) {
            if (!f16525c) {
                C3683c.m15470a(context, "realm-jni", "6.0.1");
                f16525c = true;
            }
        }
    }
}
