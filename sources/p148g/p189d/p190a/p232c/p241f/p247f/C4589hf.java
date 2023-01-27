package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;
import p148g.p189d.p190a.p232c.p240e.C4400a;

/* renamed from: g.d.a.c.f.f.hf */
public final class C4589hf extends C4442a implements C4551ff {
    C4589hf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeLong(j);
        mo13769w(23, n);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20439c(n, bundle);
        mo13769w(9, n);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeLong(j);
        mo13769w(43, n);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeLong(j);
        mo13769w(24, n);
    }

    public final void generateEventId(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(22, n);
    }

    public final void getAppInstanceId(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(20, n);
    }

    public final void getCachedAppInstanceId(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(19, n);
    }

    public final void getConditionalUserProperties(String str, String str2, C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20438b(n, gfVar);
        mo13769w(10, n);
    }

    public final void getCurrentScreenClass(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(17, n);
    }

    public final void getCurrentScreenName(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(16, n);
    }

    public final void getGmpAppId(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(21, n);
    }

    public final void getMaxUserProperties(String str, C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        C4800u.m20438b(n, gfVar);
        mo13769w(6, n);
    }

    public final void getTestFlag(C4571gf gfVar, int i) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        n.writeInt(i);
        mo13769w(38, n);
    }

    public final void getUserProperties(String str, String str2, boolean z, C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20440d(n, z);
        C4800u.m20438b(n, gfVar);
        mo13769w(5, n);
    }

    public final void initForTests(Map map) throws RemoteException {
        Parcel n = mo13767n();
        n.writeMap(map);
        mo13769w(37, n);
    }

    public final void initialize(C4400a aVar, C4515e eVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        C4800u.m20439c(n, eVar);
        n.writeLong(j);
        mo13769w(1, n);
    }

    public final void isDataCollectionEnabled(C4571gf gfVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, gfVar);
        mo13769w(40, n);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20439c(n, bundle);
        C4800u.m20440d(n, z);
        C4800u.m20440d(n, z2);
        n.writeLong(j);
        mo13769w(2, n);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C4571gf gfVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20439c(n, bundle);
        C4800u.m20438b(n, gfVar);
        n.writeLong(j);
        mo13769w(3, n);
    }

    public final void logHealthData(int i, String str, C4400a aVar, C4400a aVar2, C4400a aVar3) throws RemoteException {
        Parcel n = mo13767n();
        n.writeInt(i);
        n.writeString(str);
        C4800u.m20438b(n, aVar);
        C4800u.m20438b(n, aVar2);
        C4800u.m20438b(n, aVar3);
        mo13769w(33, n);
    }

    public final void onActivityCreated(C4400a aVar, Bundle bundle, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        C4800u.m20439c(n, bundle);
        n.writeLong(j);
        mo13769w(27, n);
    }

    public final void onActivityDestroyed(C4400a aVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        n.writeLong(j);
        mo13769w(28, n);
    }

    public final void onActivityPaused(C4400a aVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        n.writeLong(j);
        mo13769w(29, n);
    }

    public final void onActivityResumed(C4400a aVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        n.writeLong(j);
        mo13769w(30, n);
    }

    public final void onActivitySaveInstanceState(C4400a aVar, C4571gf gfVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        C4800u.m20438b(n, gfVar);
        n.writeLong(j);
        mo13769w(31, n);
    }

    public final void onActivityStarted(C4400a aVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        n.writeLong(j);
        mo13769w(25, n);
    }

    public final void onActivityStopped(C4400a aVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        n.writeLong(j);
        mo13769w(26, n);
    }

    public final void performAction(Bundle bundle, C4571gf gfVar, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, bundle);
        C4800u.m20438b(n, gfVar);
        n.writeLong(j);
        mo13769w(32, n);
    }

    public final void registerOnMeasurementEventListener(C4460b bVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, bVar);
        mo13769w(35, n);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeLong(j);
        mo13769w(12, n);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, bundle);
        n.writeLong(j);
        mo13769w(8, n);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, bundle);
        n.writeLong(j);
        mo13769w(44, n);
    }

    public final void setCurrentScreen(C4400a aVar, String str, String str2, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, aVar);
        n.writeString(str);
        n.writeString(str2);
        n.writeLong(j);
        mo13769w(15, n);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20440d(n, z);
        mo13769w(39, n);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20439c(n, bundle);
        mo13769w(42, n);
    }

    public final void setEventInterceptor(C4460b bVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, bVar);
        mo13769w(34, n);
    }

    public final void setInstanceIdProvider(C4479c cVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, cVar);
        mo13769w(18, n);
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20440d(n, z);
        n.writeLong(j);
        mo13769w(11, n);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeLong(j);
        mo13769w(13, n);
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeLong(j);
        mo13769w(14, n);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeLong(j);
        mo13769w(7, n);
    }

    public final void setUserProperty(String str, String str2, C4400a aVar, boolean z, long j) throws RemoteException {
        Parcel n = mo13767n();
        n.writeString(str);
        n.writeString(str2);
        C4800u.m20438b(n, aVar);
        C4800u.m20440d(n, z);
        n.writeLong(j);
        mo13769w(4, n);
    }

    public final void unregisterOnMeasurementEventListener(C4460b bVar) throws RemoteException {
        Parcel n = mo13767n();
        C4800u.m20438b(n, bVar);
        mo13769w(36, n);
    }
}
