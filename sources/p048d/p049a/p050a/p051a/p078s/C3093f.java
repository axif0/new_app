package p048d.p049a.p050a.p051a.p078s;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p048d.p049a.p050a.p051a.p064k.C2975h;

/* renamed from: d.a.a.a.s.f */
/* compiled from: lambda */
public final /* synthetic */ class C3093f implements DialogInterface.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ AtomicBoolean f9859f;

    /* renamed from: g */
    public final /* synthetic */ C2975h f9860g;

    /* renamed from: h */
    public final /* synthetic */ AtomicInteger f9861h;

    /* renamed from: i */
    public final /* synthetic */ AtomicInteger f9862i;

    public /* synthetic */ C3093f(AtomicBoolean atomicBoolean, C2975h hVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        this.f9859f = atomicBoolean;
        this.f9860g = hVar;
        this.f9861h = atomicInteger;
        this.f9862i = atomicInteger2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C3101n.m13295I(this.f9859f, this.f9860g, this.f9861h, this.f9862i, dialogInterface);
    }
}
