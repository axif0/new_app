package com.google.android.gms.common.util;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: com.google.android.gms.common.util.k */
public final class C1688k {
    /* renamed from: a */
    public static void m7957a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
