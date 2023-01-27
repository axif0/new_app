package kotlinx.coroutines;

import p351k.p355t.C5899f;

public interface CoroutineExceptionHandler extends C5899f.C5902b {

    /* renamed from: d */
    public static final C5991a f16941d = C5991a.f16942a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C5991a implements C5899f.C5904c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C5991a f16942a = new C5991a();

        private C5991a() {
        }
    }

    void handleException(C5899f fVar, Throwable th);
}
