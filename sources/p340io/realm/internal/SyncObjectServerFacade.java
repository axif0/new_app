package p340io.realm.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import p340io.realm.C5648d0;
import p340io.realm.C5672i0;
import p340io.realm.C5782q0;
import p340io.realm.C5804v0;
import p340io.realm.C5815w0;
import p340io.realm.RealmQuery;
import p340io.realm.SyncManager;
import p340io.realm.SyncSession;
import p340io.realm.exceptions.C5655a;
import p340io.realm.exceptions.RealmException;
import p340io.realm.internal.OsRealmConfig;
import p340io.realm.internal.android.C5699a;
import p340io.realm.internal.objectstore.OsAsyncOpenTask;
import p340io.realm.internal.p343u.C5742d;
import p340io.realm.internal.sync.permissions.ObjectPermissionsModule;
import p340io.realm.p347v1.C5805a;

@Keep
/* renamed from: io.realm.internal.SyncObjectServerFacade */
public class SyncObjectServerFacade extends C5713j {
    private static final String WRONG_TYPE_OF_CONFIGURATION = "'configuration' has to be an instance of 'SyncConfiguration'.";
    @SuppressLint({"StaticFieldLeak"})
    private static Context applicationContext;
    private static volatile Method removeSessionMethod;

    private void downloadInitialFullRealm(C5804v0 v0Var) {
        try {
            new OsAsyncOpenTask(new OsRealmConfig.C5687b(v0Var).mo16440b()).mo16642a(v0Var.mo16816z(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new C5655a(v0Var, (Throwable) e);
        }
    }

    private void downloadInitialQueryBasedRealm(C5804v0 v0Var) {
        if (v0Var.mo16814F()) {
            SyncSession session = SyncManager.getSession(v0Var);
            try {
                long z = v0Var.mo16816z(TimeUnit.MILLISECONDS);
                if (!v0Var.mo16813E()) {
                    if (!session.uploadAllLocalChanges(z, TimeUnit.MILLISECONDS)) {
                        throw new C5655a(v0Var, "Failed to first upload local changes in " + z + " milliseconds");
                    }
                }
                if (!session.downloadAllServerChanges(z, TimeUnit.MILLISECONDS)) {
                    throw new C5655a(v0Var, "Failed to download remote changes in " + z + " milliseconds");
                }
            } catch (InterruptedException e) {
                throw new C5655a(v0Var, (Throwable) e);
            }
        }
    }

    public static Context getApplicationContext() {
        return applicationContext;
    }

    private void invokeRemoveSession(C5804v0 v0Var) {
        try {
            if (removeSessionMethod == null) {
                synchronized (SyncObjectServerFacade.class) {
                    if (removeSessionMethod == null) {
                        Method declaredMethod = SyncManager.class.getDeclaredMethod("removeSession", new Class[]{C5804v0.class});
                        declaredMethod.setAccessible(true);
                        removeSessionMethod = declaredMethod;
                    }
                }
            }
            removeSessionMethod.invoke((Object) null, new Object[]{v0Var});
        } catch (NoSuchMethodException e) {
            throw new RealmException("Could not lookup method to remove session: " + v0Var.toString(), e);
        } catch (InvocationTargetException e2) {
            throw new RealmException("Could not invoke method to remove session: " + v0Var.toString(), e2);
        } catch (IllegalAccessException e3) {
            throw new RealmException("Could not remove session: " + v0Var.toString(), e3);
        }
    }

    public void addSupportForObjectLevelPermissions(C5672i0.C5673a aVar) {
        aVar.mo16327a(new ObjectPermissionsModule());
    }

    public void downloadInitialRemoteChanges(C5672i0 i0Var) {
        if (i0Var instanceof C5804v0) {
            C5804v0 v0Var = (C5804v0) i0Var;
            if (!v0Var.mo16814F()) {
                return;
            }
            if (new C5699a().mo16610e()) {
                throw new IllegalStateException("waitForInitialRemoteData() cannot be used synchronously on the main thread. Use Realm.getInstanceAsync() instead.");
            } else if (v0Var.mo16813E()) {
                downloadInitialFullRealm(v0Var);
            } else {
                downloadInitialQueryBasedRealm(v0Var);
            }
        }
    }

    public void downloadInitialSubscriptions(C5648d0 d0Var) {
        Class<C5805a> cls = C5805a.class;
        if (isPartialRealm(d0Var.mo16234x())) {
            C5804v0 v0Var = (C5804v0) d0Var.mo16234x();
            if (v0Var.mo16814F()) {
                RealmQuery<E> u0 = d0Var.mo16277u0(cls);
                u0.mo16159e("status", C5805a.C5806a.PENDING.mo16818e());
                C5782q0<E> m = u0.mo16163m();
                SyncSession session = SyncManager.getSession(v0Var);
                while (!m.isEmpty()) {
                    try {
                        session.uploadAllLocalChanges();
                        session.downloadAllServerChanges();
                        d0Var.mo16223V();
                    } catch (InterruptedException e) {
                        throw new C5655a(v0Var, (Throwable) e);
                    }
                }
                RealmQuery<E> u02 = d0Var.mo16277u0(cls);
                u02.mo16159e("status", C5805a.C5806a.ERROR.mo16818e());
                C5782q0<E> m2 = u02.mo16163m();
                if (!m2.isEmpty()) {
                    throw new C5655a(v0Var, "Some initial subscriptions encountered errors:" + Arrays.toString(m2.toArray()));
                }
            }
        }
    }

    public Object[] getSyncConfigurationOptions(C5672i0 i0Var) {
        if (!(i0Var instanceof C5804v0)) {
            return new Object[12];
        }
        C5804v0 v0Var = (C5804v0) i0Var;
        C5815w0 D = v0Var.mo16812D();
        v0Var.mo16811C().toString();
        D.mo16822b();
        throw null;
    }

    public String getSyncServerCertificateAssetName(C5672i0 i0Var) {
        if (i0Var instanceof C5804v0) {
            return ((C5804v0) i0Var).mo16809A();
        }
        throw new IllegalArgumentException(WRONG_TYPE_OF_CONFIGURATION);
    }

    public String getSyncServerCertificateFilePath(C5672i0 i0Var) {
        if (i0Var instanceof C5804v0) {
            return ((C5804v0) i0Var).mo16810B();
        }
        throw new IllegalArgumentException(WRONG_TYPE_OF_CONFIGURATION);
    }

    public void initialize(Context context, String str) {
        try {
            Method declaredMethod = Class.forName("io.realm.ObjectServer").getDeclaredMethod("init", new Class[]{Context.class, String.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke((Object) null, new Object[]{context, str});
            if (applicationContext == null) {
                applicationContext = context;
                context.registerReceiver(new C5742d(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
        } catch (NoSuchMethodException e) {
            throw new RealmException("Could not initialize the Realm Object Server", e);
        } catch (InvocationTargetException e2) {
            throw new RealmException("Could not initialize the Realm Object Server", e2);
        } catch (IllegalAccessException e3) {
            throw new RealmException("Could not initialize the Realm Object Server", e3);
        } catch (ClassNotFoundException e4) {
            throw new RealmException("Could not initialize the Realm Object Server", e4);
        }
    }

    public boolean isPartialRealm(C5672i0 i0Var) {
        if (i0Var instanceof C5804v0) {
            return !((C5804v0) i0Var).mo16813E();
        }
        return false;
    }

    public void realmClosed(C5672i0 i0Var) {
        if (i0Var instanceof C5804v0) {
            invokeRemoveSession((C5804v0) i0Var);
            return;
        }
        throw new IllegalArgumentException(WRONG_TYPE_OF_CONFIGURATION);
    }

    public boolean wasDownloadInterrupted(Throwable th) {
        return th instanceof C5655a;
    }

    public void wrapObjectStoreSessionIfRequired(OsRealmConfig osRealmConfig) {
        if (osRealmConfig.mo16437b() instanceof C5804v0) {
            SyncManager.getOrCreateSession((C5804v0) osRealmConfig.mo16437b(), osRealmConfig.mo16438c());
        }
    }
}
