package p048d.p049a.p050a.p051a.p078s;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d.a.a.a.s.i */
/* compiled from: lambda */
public final /* synthetic */ class C3096i implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f9866a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f9867b;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f9868c;

    public /* synthetic */ C3096i(AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        this.f9866a = atomicBoolean;
        this.f9867b = atomicInteger;
        this.f9868c = atomicInteger2;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        C3101n.m13294H(this.f9866a, this.f9867b, this.f9868c, timePicker, i, i2);
    }
}
