package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p148g.p189d.p190a.p271e.p272a.p276c.C5105h0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5126s;

/* renamed from: com.google.android.play.core.assetpacks.d3 */
public final class C2336d3 implements C5105h0<Executor> {
    /* renamed from: a */
    public static Executor m10863a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C2429y2.f8060a);
        C5126s.m21547g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo9098d() {
        return m10863a();
    }
}
