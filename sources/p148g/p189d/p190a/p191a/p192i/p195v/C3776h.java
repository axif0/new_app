package p148g.p189d.p190a.p191a.p192i.p195v;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1503a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1509e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1511g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1527s;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p198x.C3821a;

/* renamed from: g.d.a.a.i.v.h */
public abstract class C3776h {
    /* renamed from: a */
    static C1527s m15725a(Context context, C3784c cVar, C1511g gVar, C3821a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new C1509e(context, cVar, gVar) : new C1503a(context, cVar, aVar, gVar);
    }
}
