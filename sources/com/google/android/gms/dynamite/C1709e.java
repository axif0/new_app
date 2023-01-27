package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* renamed from: com.google.android.gms.dynamite.e */
final class C1709e extends PathClassLoader {
    C1709e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    /* access modifiers changed from: protected */
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
