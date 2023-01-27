package p351k.p361v.p363d;

import com.karumi.dexter.BuildConfig;
import p351k.p366y.C5976b;
import p351k.p366y.C5977c;
import p351k.p366y.C5978d;
import p351k.p366y.C5979e;

/* renamed from: k.v.d.p */
public class C5965p {

    /* renamed from: a */
    private static final C5966q f16929a;

    static {
        C5966q qVar = null;
        try {
            qVar = (C5966q) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (qVar == null) {
            qVar = new C5966q();
        }
        f16929a = qVar;
    }

    /* renamed from: a */
    public static C5976b m24520a(Class cls) {
        return f16929a.mo17013a(cls);
    }

    /* renamed from: b */
    public static C5977c m24521b(Class cls) {
        return f16929a.mo17014b(cls, BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public static C5978d m24522c(C5958i iVar) {
        f16929a.mo17015c(iVar);
        return iVar;
    }

    /* renamed from: d */
    public static C5979e m24523d(C5962m mVar) {
        f16929a.mo17016d(mVar);
        return mVar;
    }

    /* renamed from: e */
    public static String m24524e(C5957h hVar) {
        return f16929a.mo17018f(hVar);
    }
}
