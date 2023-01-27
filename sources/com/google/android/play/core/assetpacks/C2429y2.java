package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.y2 */
final /* synthetic */ class C2429y2 implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f8060a = new C2429y2();

    private C2429y2() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
