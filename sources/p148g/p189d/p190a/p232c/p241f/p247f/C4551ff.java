package p148g.p189d.p190a.p232c.p241f.p247f;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import p148g.p189d.p190a.p232c.p240e.C4400a;

/* renamed from: g.d.a.c.f.f.ff */
public interface C4551ff extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(C4571gf gfVar) throws RemoteException;

    void getAppInstanceId(C4571gf gfVar) throws RemoteException;

    void getCachedAppInstanceId(C4571gf gfVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, C4571gf gfVar) throws RemoteException;

    void getCurrentScreenClass(C4571gf gfVar) throws RemoteException;

    void getCurrentScreenName(C4571gf gfVar) throws RemoteException;

    void getGmpAppId(C4571gf gfVar) throws RemoteException;

    void getMaxUserProperties(String str, C4571gf gfVar) throws RemoteException;

    void getTestFlag(C4571gf gfVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, C4571gf gfVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(C4400a aVar, C4515e eVar, long j) throws RemoteException;

    void isDataCollectionEnabled(C4571gf gfVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, C4571gf gfVar, long j) throws RemoteException;

    void logHealthData(int i, String str, C4400a aVar, C4400a aVar2, C4400a aVar3) throws RemoteException;

    void onActivityCreated(C4400a aVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(C4400a aVar, long j) throws RemoteException;

    void onActivityPaused(C4400a aVar, long j) throws RemoteException;

    void onActivityResumed(C4400a aVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(C4400a aVar, C4571gf gfVar, long j) throws RemoteException;

    void onActivityStarted(C4400a aVar, long j) throws RemoteException;

    void onActivityStopped(C4400a aVar, long j) throws RemoteException;

    void performAction(Bundle bundle, C4571gf gfVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(C4460b bVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(C4400a aVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(C4460b bVar) throws RemoteException;

    void setInstanceIdProvider(C4479c cVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, C4400a aVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(C4460b bVar) throws RemoteException;
}
