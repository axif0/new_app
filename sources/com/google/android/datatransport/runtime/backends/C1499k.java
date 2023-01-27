package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
class C1499k implements C1491e {

    /* renamed from: a */
    private final C1500a f5069a;

    /* renamed from: b */
    private final C1497i f5070b;

    /* renamed from: c */
    private final Map<String, C1502m> f5071c;

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class C1500a {

        /* renamed from: a */
        private final Context f5072a;

        /* renamed from: b */
        private Map<String, String> f5073b = null;

        C1500a(Context context) {
            this.f5072a = context;
        }

        /* renamed from: a */
        private Map<String, String> m7276a(Context context) {
            Bundle d = m7278d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m7277c() {
            if (this.f5073b == null) {
                this.f5073b = m7276a(this.f5072a);
            }
            return this.f5073b;
        }

        /* renamed from: d */
        private static Bundle m7278d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1490d mo6142b(String str) {
            String str2;
            String str3;
            String str4 = m7277c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (C1490d) Class.forName(str4).asSubclass(C1490d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                e = e;
                str2 = String.format("Class %s is not found.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            }
        }
    }

    C1499k(Context context, C1497i iVar) {
        this(new C1500a(context), iVar);
    }

    C1499k(C1500a aVar, C1497i iVar) {
        this.f5071c = new HashMap();
        this.f5069a = aVar;
        this.f5070b = iVar;
    }

    /* renamed from: a */
    public synchronized C1502m mo6138a(String str) {
        if (this.f5071c.containsKey(str)) {
            return this.f5071c.get(str);
        }
        C1490d b = this.f5069a.mo6142b(str);
        if (b == null) {
            return null;
        }
        C1502m create = b.create(this.f5070b.mo6139a(str));
        this.f5071c.put(str, create);
        return create;
    }
}
