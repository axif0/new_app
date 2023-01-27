package p148g.p189d.p190a.p191a.p192i.p195v;

import com.google.android.datatransport.runtime.backends.C1491e;
import com.google.android.datatransport.runtime.backends.C1502m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1527s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p148g.p189d.p190a.p191a.C3733h;
import p148g.p189d.p190a.p191a.p192i.C3749h;
import p148g.p189d.p190a.p191a.p192i.C3755l;
import p148g.p189d.p190a.p191a.p192i.C3761q;
import p148g.p189d.p190a.p191a.p192i.p195v.p196j.C3784c;
import p148g.p189d.p190a.p191a.p192i.p197w.C3819b;

/* renamed from: g.d.a.a.i.v.c */
public class C3771c implements C3773e {

    /* renamed from: f */
    private static final Logger f11440f = Logger.getLogger(C3761q.class.getName());

    /* renamed from: a */
    private final C1527s f11441a;

    /* renamed from: b */
    private final Executor f11442b;

    /* renamed from: c */
    private final C1491e f11443c;

    /* renamed from: d */
    private final C3784c f11444d;

    /* renamed from: e */
    private final C3819b f11445e;

    public C3771c(Executor executor, C1491e eVar, C1527s sVar, C3784c cVar, C3819b bVar) {
        this.f11442b = executor;
        this.f11443c = eVar;
        this.f11441a = sVar;
        this.f11444d = cVar;
        this.f11445e = bVar;
    }

    /* renamed from: b */
    static /* synthetic */ Object m15715b(C3771c cVar, C3755l lVar, C3749h hVar) {
        cVar.f11444d.mo12381E(lVar, hVar);
        cVar.f11441a.mo6147a(lVar, 1);
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ void m15716c(C3771c cVar, C3755l lVar, C3733h hVar, C3749h hVar2) {
        try {
            C1502m a = cVar.f11443c.mo6138a(lVar.mo12319b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{lVar.mo12319b()});
                f11440f.warning(format);
                hVar.mo12287a(new IllegalArgumentException(format));
                return;
            }
            cVar.f11445e.mo12400a(C3770b.m15714a(cVar, lVar, a.mo6114a(hVar2)));
            hVar.mo12287a((Exception) null);
        } catch (Exception e) {
            Logger logger = f11440f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo12287a(e);
        }
    }

    /* renamed from: a */
    public void mo12357a(C3755l lVar, C3749h hVar, C3733h hVar2) {
        this.f11442b.execute(C3769a.m15713a(this, lVar, hVar2, hVar));
    }
}
