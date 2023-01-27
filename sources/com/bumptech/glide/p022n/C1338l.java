package com.bumptech.glide.p022n;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.C0653m;
import androidx.fragment.app.C0675u;
import com.bumptech.glide.C0963b;
import com.bumptech.glide.C0979j;
import com.bumptech.glide.p029s.C1402k;
import java.util.HashMap;
import java.util.Map;
import p086f.p102e.C3190a;

/* renamed from: com.bumptech.glide.n.l */
public class C1338l implements Handler.Callback {

    /* renamed from: k */
    private static final C1340b f4637k = new C1339a();

    /* renamed from: f */
    private volatile C0979j f4638f;

    /* renamed from: g */
    final Map<FragmentManager, C1336k> f4639g = new HashMap();

    /* renamed from: h */
    final Map<C0653m, C1343o> f4640h = new HashMap();

    /* renamed from: i */
    private final Handler f4641i;

    /* renamed from: j */
    private final C1340b f4642j;

    /* renamed from: com.bumptech.glide.n.l$a */
    class C1339a implements C1340b {
        C1339a() {
        }

        /* renamed from: a */
        public C0979j mo5723a(C0963b bVar, C1333h hVar, C1341m mVar, Context context) {
            return new C0979j(bVar, hVar, mVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.n.l$b */
    public interface C1340b {
        /* renamed from: a */
        C0979j mo5723a(C0963b bVar, C1333h hVar, C1341m mVar, Context context);
    }

    public C1338l(C1340b bVar) {
        new C3190a();
        new C3190a();
        new Bundle();
        this.f4642j = bVar == null ? f4637k : bVar;
        this.f4641i = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    private static void m6655a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static Activity m6656b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6656b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    /* renamed from: c */
    private C0979j m6657c(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C1336k i = m6659i(fragmentManager, fragment, z);
        C0979j e = i.mo5706e();
        if (e != null) {
            return e;
        }
        C0979j a = this.f4642j.mo5723a(C0963b.m5388c(context), i.mo5705c(), i.mo5707f(), context);
        i.mo5709k(a);
        return a;
    }

    /* renamed from: g */
    private C0979j m6658g(Context context) {
        if (this.f4638f == null) {
            synchronized (this) {
                if (this.f4638f == null) {
                    this.f4638f = this.f4642j.mo5723a(C0963b.m5388c(context.getApplicationContext()), new C1325b(), new C1332g(), context.getApplicationContext());
                }
            }
        }
        return this.f4638f;
    }

    /* renamed from: i */
    private C1336k m6659i(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C1336k kVar = (C1336k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f4639g.get(fragmentManager)) == null) {
            kVar = new C1336k();
            kVar.mo5708j(fragment);
            if (z) {
                kVar.mo5705c().mo5698d();
            }
            this.f4639g.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f4641i.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    /* renamed from: k */
    private C1343o m6660k(C0653m mVar, androidx.fragment.app.Fragment fragment, boolean z) {
        C1343o oVar = (C1343o) mVar.mo3426X("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f4640h.get(mVar)) == null) {
            oVar = new C1343o();
            oVar.mo5736T1(fragment);
            if (z) {
                oVar.mo5733L1().mo5698d();
            }
            this.f4640h.put(mVar, oVar);
            C0675u i = mVar.mo3440i();
            i.mo3564e(oVar, "com.bumptech.glide.manager");
            i.mo3263j();
            this.f4641i.obtainMessage(2, mVar).sendToTarget();
        }
        return oVar;
    }

    /* renamed from: l */
    private static boolean m6661l(Context context) {
        Activity b = m6656b(context);
        return b == null || !b.isFinishing();
    }

    /* renamed from: m */
    private C0979j m6662m(Context context, C0653m mVar, androidx.fragment.app.Fragment fragment, boolean z) {
        C1343o k = m6660k(mVar, fragment, z);
        C0979j N1 = k.mo5734N1();
        if (N1 != null) {
            return N1;
        }
        C0979j a = this.f4642j.mo5723a(C0963b.m5388c(context), k.mo5733L1(), k.mo5735O1(), context);
        k.mo5737U1(a);
        return a;
    }

    /* renamed from: d */
    public C0979j mo5717d(Activity activity) {
        if (C1402k.m6988o()) {
            return mo5718e(activity.getApplicationContext());
        }
        m6655a(activity);
        return m6657c(activity, activity.getFragmentManager(), (Fragment) null, m6661l(activity));
    }

    /* renamed from: e */
    public C0979j mo5718e(Context context) {
        if (context != null) {
            if (C1402k.m6989p() && !(context instanceof Application)) {
                if (context instanceof C0636d) {
                    return mo5719f((C0636d) context);
                }
                if (context instanceof Activity) {
                    return mo5717d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo5718e(contextWrapper.getBaseContext());
                    }
                }
            }
            return m6658g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: f */
    public C0979j mo5719f(C0636d dVar) {
        if (C1402k.m6988o()) {
            return mo5718e(dVar.getApplicationContext());
        }
        m6655a(dVar);
        return m6662m(dVar, dVar.mo3317z(), (androidx.fragment.app.Fragment) null, m6661l(dVar));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: h */
    public C1336k mo5720h(Activity activity) {
        return m6659i(activity.getFragmentManager(), (Fragment) null, m6661l(activity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.f4639g;
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (C0653m) message.obj;
            map = this.f4640h;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C1343o mo5722j(Context context, C0653m mVar) {
        return m6660k(mVar, (androidx.fragment.app.Fragment) null, m6661l(context));
    }
}
