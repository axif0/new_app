package p340io.realm.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import p340io.realm.C5648d0;
import p340io.realm.C5672i0;
import p340io.realm.exceptions.RealmException;

/* renamed from: io.realm.internal.j */
public class C5713j {
    private static final C5713j nonSyncFacade = new C5713j();
    private static C5713j syncFacade;

    static {
        syncFacade = null;
        try {
            syncFacade = (C5713j) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
        } catch (InstantiationException e) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e);
        } catch (IllegalAccessException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (NoSuchMethodException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4.getTargetException());
        }
    }

    public static C5713j getFacade(boolean z) {
        return z ? syncFacade : nonSyncFacade;
    }

    public static C5713j getSyncFacadeIfPossible() {
        C5713j jVar = syncFacade;
        return jVar != null ? jVar : nonSyncFacade;
    }

    public void addSupportForObjectLevelPermissions(C5672i0.C5673a aVar) {
    }

    public void downloadInitialRemoteChanges(C5672i0 i0Var) {
    }

    public void downloadInitialSubscriptions(C5648d0 d0Var) {
    }

    public Object[] getSyncConfigurationOptions(C5672i0 i0Var) {
        return new Object[12];
    }

    public String getSyncServerCertificateAssetName(C5672i0 i0Var) {
        return null;
    }

    public String getSyncServerCertificateFilePath(C5672i0 i0Var) {
        return null;
    }

    public void initialize(Context context, String str) {
    }

    public boolean isPartialRealm(C5672i0 i0Var) {
        return false;
    }

    public void realmClosed(C5672i0 i0Var) {
    }

    public boolean wasDownloadInterrupted(Throwable th) {
        return false;
    }

    public void wrapObjectStoreSessionIfRequired(OsRealmConfig osRealmConfig) {
    }
}
