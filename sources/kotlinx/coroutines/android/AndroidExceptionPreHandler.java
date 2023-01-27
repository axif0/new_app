package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p351k.C5845e;
import p351k.p355t.C5891a;
import p351k.p355t.C5899f;
import p351k.p361v.p362c.C5926a;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5963n;
import p351k.p361v.p363d.C5965p;
import p351k.p366y.C5981f;

@Keep
public final class AndroidExceptionPreHandler extends C5891a implements CoroutineExceptionHandler, C5926a<Method> {
    static final /* synthetic */ C5981f[] $$delegatedProperties;
    private final C5845e preHandler$delegate = C5847g.m24358a(this);

    static {
        C5963n nVar = new C5963n(C5965p.m24520a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        C5965p.m24523d(nVar);
        $$delegatedProperties = new C5981f[]{nVar};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f16941d);
    }

    private final Method getPreHandler() {
        C5845e eVar = this.preHandler$delegate;
        C5981f fVar = $$delegatedProperties[0];
        return (Method) eVar.getValue();
    }

    public void handleException(C5899f fVar, Throwable th) {
        C5956g.m24501f(fVar, "context");
        C5956g.m24501f(th, "exception");
        Thread currentThread = Thread.currentThread();
        if (Build.VERSION.SDK_INT >= 28) {
            C5956g.m24497b(currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            return;
        }
        Method preHandler = getPreHandler();
        Object obj = null;
        Object invoke = preHandler != null ? preHandler.invoke((Object) null, new Object[0]) : null;
        if (invoke instanceof Thread.UncaughtExceptionHandler) {
            obj = invoke;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(currentThread, th);
        }
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            C5956g.m24497b(declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
