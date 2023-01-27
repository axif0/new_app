package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.z2 */
final /* synthetic */ class C2433z2 implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f8065a = new C2433z2();

    private C2433z2() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
