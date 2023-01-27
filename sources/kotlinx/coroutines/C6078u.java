package kotlinx.coroutines;

import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.u */
public final class C6078u extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6078u(String str, Throwable th) {
        super(str, th);
        C5956g.m24501f(str, "message");
        C5956g.m24501f(th, "cause");
    }
}
