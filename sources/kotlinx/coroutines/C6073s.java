package kotlinx.coroutines;

import kotlinx.coroutines.C6085x0;
import p351k.p355t.C5891a;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5941p;
import p351k.p361v.p363d.C5956g;

/* renamed from: kotlinx.coroutines.s */
public final class C6073s extends C5891a implements C6085x0<String> {

    /* renamed from: f */
    private final long f17033f;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6073s) {
                if (this.f17033f == ((C6073s) obj).f17033f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C5941p<? super R, ? super C5899f.C5902b, ? extends R> pVar) {
        C5956g.m24501f(pVar, "operation");
        return C6085x0.C6086a.m24830a(this, r, pVar);
    }

    public <E extends C5899f.C5902b> E get(C5899f.C5904c<E> cVar) {
        C5956g.m24501f(cVar, "key");
        return C6085x0.C6086a.m24831b(this, cVar);
    }

    /* renamed from: h */
    public void mo17163c(C5899f fVar, String str) {
        C5956g.m24501f(fVar, "context");
        C5956g.m24501f(str, "oldState");
        Thread currentThread = Thread.currentThread();
        C5956g.m24497b(currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public int hashCode() {
        long j = this.f17033f;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: i */
    public String mo17165g(C5899f fVar) {
        String str;
        C5956g.m24501f(fVar, "context");
        C6075t tVar = (C6075t) fVar.get(C6075t.f17035g);
        if (tVar == null || (str = tVar.mo17171h()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        C5956g.m24497b(currentThread, "currentThread");
        String name = currentThread.getName();
        C5956g.m24497b(name, "oldName");
        int n = C5839m.m24348n(name, " @", 0, false, 6, (Object) null);
        if (n < 0) {
            n = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + n + 10);
        String substring = name.substring(0, n);
        C5956g.m24497b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.f17033f);
        String sb2 = sb.toString();
        C5956g.m24497b(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public C5899f minusKey(C5899f.C5904c<?> cVar) {
        C5956g.m24501f(cVar, "key");
        return C6085x0.C6086a.m24832c(this, cVar);
    }

    public C5899f plus(C5899f fVar) {
        C5956g.m24501f(fVar, "context");
        return C6085x0.C6086a.m24833d(this, fVar);
    }

    public String toString() {
        return "CoroutineId(" + this.f17033f + ')';
    }
}
