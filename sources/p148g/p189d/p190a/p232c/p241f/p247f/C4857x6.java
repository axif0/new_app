package p148g.p189d.p190a.p232c.p241f.p247f;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p148g.p189d.p190a.p232c.p241f.p247f.C4673m6;

/* renamed from: g.d.a.c.f.f.x6 */
abstract class C4857x6<T extends C4673m6> {

    /* renamed from: a */
    private static final Logger f14628a = Logger.getLogger(C4615j6.class.getName());

    /* renamed from: b */
    private static String f14629b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C4857x6() {
    }

    /* renamed from: b */
    static <T extends C4673m6> T m20581b(Class<T> cls) {
        String str;
        Class<C4857x6> cls2 = C4857x6.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C4673m6.class)) {
            str = f14629b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C4673m6) cls.cast(((C4857x6) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo14735a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C4857x6) it.next()).mo14735a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f14628a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C4673m6) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C4673m6) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo14735a();
}
