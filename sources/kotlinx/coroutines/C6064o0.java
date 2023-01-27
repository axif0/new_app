package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.o0 */
public final class C6064o0 extends CancellationException implements C6063o<C6064o0> {

    /* renamed from: f */
    public final C6060n0 f17026f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6064o0(String str, Throwable th, C6060n0 n0Var) {
        super(str);
        C5956g.m24501f(str, "message");
        C5956g.m24501f(n0Var, "job");
        this.f17026f = n0Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public C6064o0 mo17144a() {
        if (!C6080v.m24814b()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new C6064o0(message, this, this.f17026f);
        }
        C5956g.m24506k();
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C6064o0) {
                C6064o0 o0Var = (C6064o0) obj;
                if (!C5956g.m24496a(o0Var.getMessage(), getMessage()) || !C5956g.m24496a(o0Var.f17026f, this.f17026f) || !C5956g.m24496a(o0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (!C6080v.m24814b()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        C5956g.m24497b(fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.f17026f.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        C5956g.m24506k();
        throw null;
    }

    public String toString() {
        return super.toString() + "; job=" + this.f17026f;
    }
}
