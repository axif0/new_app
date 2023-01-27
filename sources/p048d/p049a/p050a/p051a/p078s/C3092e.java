package p048d.p049a.p050a.p051a.p078s;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: d.a.a.a.s.e */
/* compiled from: lambda */
public final /* synthetic */ class C3092e implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Calendar f9857a;

    /* renamed from: b */
    public final /* synthetic */ AtomicBoolean f9858b;

    public /* synthetic */ C3092e(Calendar calendar, AtomicBoolean atomicBoolean) {
        this.f9857a = calendar;
        this.f9858b = atomicBoolean;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        C3101n.m13288A(this.f9857a, this.f9858b, datePicker, i, i2, i3);
    }
}
