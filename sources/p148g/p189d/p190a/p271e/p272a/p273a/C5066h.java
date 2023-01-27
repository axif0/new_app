package p148g.p189d.p190a.p271e.p272a.p273a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C2434a;
import p148g.p189d.p190a.p271e.p272a.p274b.C5087c;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;

/* renamed from: g.d.a.e.a.a.h */
final class C5066h implements C5058b {

    /* renamed from: a */
    private final C5077s f15072a;

    /* renamed from: b */
    private final C5063e f15073b;

    /* renamed from: c */
    private final Context f15074c;

    C5066h(C5077s sVar, C5063e eVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f15072a = sVar;
        this.f15073b = eVar;
        this.f15074c = context;
    }

    /* renamed from: a */
    public final C5152e<Void> mo15166a() {
        return this.f15072a.mo15181h(this.f15074c.getPackageName());
    }

    /* renamed from: b */
    public final C5152e<C5056a> mo15167b() {
        return this.f15072a.mo15180e(this.f15074c.getPackageName());
    }

    /* renamed from: c */
    public final synchronized void mo15168c(C5087c cVar) {
        this.f15073b.mo15241b(cVar);
    }

    /* renamed from: d */
    public final boolean mo15169d(C5056a aVar, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        return mo15175f(aVar, new C5065g(activity), C5061d.m21394c(i), i2);
    }

    /* renamed from: e */
    public final synchronized void mo15170e(C5087c cVar) {
        this.f15073b.mo15244e(cVar);
    }

    /* renamed from: f */
    public final boolean mo15175f(C5056a aVar, C2434a aVar2, C5061d dVar, int i) throws IntentSender.SendIntentException {
        if (!aVar.mo15159o(dVar)) {
            return false;
        }
        aVar2.mo9277a(aVar.mo15148b(dVar).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
