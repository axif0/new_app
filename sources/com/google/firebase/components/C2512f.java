package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
public final class C2512f<T> {

    /* renamed from: a */
    private final T f8191a;

    /* renamed from: b */
    private final C2515c<T> f8192b;

    /* renamed from: com.google.firebase.components.f$b */
    private static class C2514b implements C2515c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f8193a;

        private C2514b(Class<? extends Service> cls) {
            this.f8193a = cls;
        }

        /* renamed from: b */
        private Bundle m11298b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f8193a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f8193a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo9380a(Context context) {
            Bundle b = m11298b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.f$c */
    interface C2515c<T> {
        /* renamed from: a */
        List<String> mo9380a(T t);
    }

    C2512f(T t, C2515c<T> cVar) {
        this.f8191a = t;
        this.f8192b = cVar;
    }

    /* renamed from: b */
    public static C2512f<Context> m11295b(Context context, Class<? extends Service> cls) {
        return new C2512f<>(context, new C2514b(cls));
    }

    /* renamed from: c */
    private static List<C2517h> m11296c(List<String> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            try {
                Class<?> cls = Class.forName(next);
                if (!C2517h.class.isAssignableFrom(cls)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", new Object[]{next, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((C2517h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e) {
                e = e;
                str = String.format("Class %s is not an found.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                str = String.format("Could not instantiate %s.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (InstantiationException e3) {
                e = e3;
                str = String.format("Could not instantiate %s.", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (NoSuchMethodException e4) {
                e = e4;
                str = String.format("Could not instantiate %s", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            } catch (InvocationTargetException e5) {
                e = e5;
                str = String.format("Could not instantiate %s", new Object[]{next});
                Log.w("ComponentDiscovery", str, e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C2517h> mo9379a() {
        return m11296c(this.f8192b.mo9380a(this.f8191a));
    }
}
