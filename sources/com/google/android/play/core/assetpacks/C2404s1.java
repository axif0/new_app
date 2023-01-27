package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.s1 */
final /* synthetic */ class C2404s1 implements FilenameFilter {

    /* renamed from: a */
    private final String f7953a;

    C2404s1(String str) {
        this.f7953a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f7953a).concat("-")) && str.endsWith(".apk");
    }
}
