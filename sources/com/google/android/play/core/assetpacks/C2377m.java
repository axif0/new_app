package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import p148g.p189d.p190a.p271e.p272a.p276c.C5131u0;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.m */
class C2377m<T> extends C5131u0 {

    /* renamed from: a */
    final C5163p<T> f7854a;

    /* renamed from: b */
    final /* synthetic */ C2398r f7855b;

    C2377m(C2398r rVar, C5163p<T> pVar) {
        this.f7855b = rVar;
        this.f7854a = pVar;
    }

    C2377m(C2398r rVar, C5163p pVar, byte[] bArr) {
        this(rVar, pVar);
    }

    C2377m(C2398r rVar, C5163p pVar, char[] cArr) {
        this(rVar, pVar);
    }

    C2377m(C2398r rVar, C5163p pVar, int[] iArr) {
        this(rVar, pVar);
    }

    /* renamed from: J */
    public final void mo9183J(int i) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: J0 */
    public void mo9184J0(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: L */
    public void mo9185L(Bundle bundle, Bundle bundle2) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: d */
    public void mo9186d() {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: e */
    public void mo9187e(Bundle bundle) {
        this.f7855b.f7929c.mo15221b();
        int i = bundle.getInt("error_code");
        C2398r.f7925f.mo15205e("onError(%d)", Integer.valueOf(i));
        this.f7854a.mo15264d(new C2317a(i));
    }

    /* renamed from: h */
    public void mo9188h(Bundle bundle) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: h0 */
    public void mo9189h0(int i, Bundle bundle) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: j0 */
    public void mo9190j0(Bundle bundle) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: l */
    public void mo9191l(List<Bundle> list) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onGetSessionStates", new Object[0]);
    }

    /* renamed from: o */
    public void mo9192o() {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onRemoveModule()", new Object[0]);
    }

    /* renamed from: s */
    public void mo9193s(Bundle bundle, Bundle bundle2) {
        this.f7855b.f7930d.mo15221b();
        C2398r.f7925f.mo15206f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: s0 */
    public void mo9194s0(Bundle bundle) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: u */
    public final void mo9195u(int i) {
        this.f7855b.f7929c.mo15221b();
        C2398r.f7925f.mo15206f("onCancelDownload(%d)", Integer.valueOf(i));
    }
}
