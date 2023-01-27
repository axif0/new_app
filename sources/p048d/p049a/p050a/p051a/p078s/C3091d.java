package p048d.p049a.p050a.p051a.p078s;

import android.content.DialogInterface;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import p048d.p049a.p050a.p051a.p064k.C2970c;

/* renamed from: d.a.a.a.s.d */
/* compiled from: lambda */
public final /* synthetic */ class C3091d implements DialogInterface.OnDismissListener {

    /* renamed from: f */
    public final /* synthetic */ Calendar f9854f;

    /* renamed from: g */
    public final /* synthetic */ AtomicBoolean f9855g;

    /* renamed from: h */
    public final /* synthetic */ C2970c f9856h;

    public /* synthetic */ C3091d(Calendar calendar, AtomicBoolean atomicBoolean, C2970c cVar) {
        this.f9854f = calendar;
        this.f9855g = atomicBoolean;
        this.f9856h = cVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C3101n.m13289B(this.f9854f, this.f9855g, this.f9856h, dialogInterface);
    }
}
