package p148g.p189d.p190a.p271e.p272a.p273a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p148g.p189d.p190a.p271e.p272a.p274b.C5086b;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p277d.C5144c;

/* renamed from: g.d.a.e.a.a.e */
public final class C5063e extends C5144c<C5086b> {
    public C5063e(Context context) {
        super(new C5100f("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9252a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f15167a.mo15203c("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f15167a.mo15203c("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            this.f15167a.mo15203c("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        C5100f fVar = this.f15167a;
        fVar.mo15203c("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        fVar.mo15203c("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        fVar.mo15203c("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        C5086b a = C5086b.m21454a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f15167a.mo15203c("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        mo15242c(a);
    }
}
