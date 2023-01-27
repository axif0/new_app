package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;

/* renamed from: com.google.android.gms.common.util.p */
public class C1693p {

    /* renamed from: a */
    private static final Method f5573a = m7985l();

    /* renamed from: b */
    private static final Method f5574b = m7986m();

    /* renamed from: c */
    private static final Method f5575c = m7987n();

    /* renamed from: d */
    private static final Method f5576d = m7982i();

    static {
        Process.myUid();
        m7981h();
        m7983j();
        m7984k();
    }

    /* renamed from: a */
    public static WorkSource m7974a(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C4389c.m18627a(context).mo13715c(str, 0);
                if (c != null) {
                    return m7978e(c.uid, str);
                }
                String valueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", valueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(valueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                Log.e("WorkSourceUtil", valueOf2.length() != 0 ? "Could not find package: ".concat(valueOf2) : new String("Could not find package: "));
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<String> m7975b(WorkSource workSource) {
        int d = workSource == null ? 0 : m7977d(workSource);
        if (d == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d; i++) {
            String f = m7979f(workSource, i);
            if (!C1691n.m7971a(f)) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m7976c(Context context) {
        return (context == null || context.getPackageManager() == null || C4389c.m18627a(context).mo13714b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: d */
    private static int m7977d(WorkSource workSource) {
        Method method = f5575c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: e */
    private static WorkSource m7978e(int i, String str) {
        WorkSource workSource = new WorkSource();
        m7980g(workSource, i, str);
        return workSource;
    }

    /* renamed from: f */
    private static String m7979f(WorkSource workSource, int i) {
        Method method = f5576d;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    /* renamed from: g */
    private static void m7980g(WorkSource workSource, int i, String str) {
        if (f5574b != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            try {
                f5574b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method = f5573a;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: h */
    private static Method m7981h() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static Method m7982i() {
        if (C1689l.m7961d()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: j */
    private static final Method m7983j() {
        if (C1689l.m7967j()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: k */
    private static final Method m7984k() {
        if (C1689l.m7967j()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e);
            }
        }
        return null;
    }

    /* renamed from: l */
    private static Method m7985l() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    private static Method m7986m() {
        if (C1689l.m7961d()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: n */
    private static Method m7987n() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
