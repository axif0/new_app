package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.n2 */
final /* synthetic */ class C2385n2 implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f7876a = new C2385n2();

    private C2385n2() {
    }

    public final boolean accept(File file, String str) {
        return C2389o2.f7880a.matcher(str).matches();
    }
}
