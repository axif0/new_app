package p148g.p189d.p190a.p271e.p272a.p273a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import p148g.p189d.p190a.p271e.p272a.p274b.C5085a;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5119o0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5120p;
import p148g.p189d.p190a.p271e.p272a.p276c.C5128t;
import p148g.p189d.p190a.p271e.p272a.p278e.C5145a;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;
import p148g.p189d.p190a.p271e.p272a.p280g.C5154g;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: g.d.a.e.a.a.s */
final class C5077s {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C5100f f15093e = new C5100f("AppUpdateService");

    /* renamed from: f */
    private static final Intent f15094f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C5120p<C5119o0> f15095a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f15096b;

    /* renamed from: c */
    private final Context f15097c;

    /* renamed from: d */
    private final C5079u f15098d;

    public C5077s(Context context, C5079u uVar) {
        this.f15096b = context.getPackageName();
        this.f15097c = context;
        this.f15098d = uVar;
        if (C5128t.m21549a(context)) {
            this.f15095a = new C5120p(C5145a.m21596a(context), f15093e, "AppUpdateService", f15094f, C5071m.f15081a);
        }
    }

    /* renamed from: b */
    static /* synthetic */ Bundle m21421b(C5077s sVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m21427j());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(sVar.f15097c.getPackageManager().getPackageInfo(sVar.f15097c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f15093e.mo15205e("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: c */
    static /* synthetic */ C5056a m21422c(C5077s sVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return C5056a.m21366c(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness")), bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), sVar.f15098d.mo15182a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* renamed from: i */
    private static <T> C5152e<T> m21426i() {
        f15093e.mo15205e("onError(%d)", -9);
        return C5154g.m21612a(new C5085a(-9));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static Bundle m21427j() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10802);
        return bundle;
    }

    /* renamed from: e */
    public final C5152e<C5056a> mo15180e(String str) {
        if (this.f15095a == null) {
            return m21426i();
        }
        f15093e.mo15206f("requestUpdateInfo(%s)", str);
        C5163p pVar = new C5163p();
        this.f15095a.mo15222c(new C5072n(this, pVar, str, pVar));
        return pVar.mo15261a();
    }

    /* renamed from: h */
    public final C5152e<Void> mo15181h(String str) {
        if (this.f15095a == null) {
            return m21426i();
        }
        f15093e.mo15206f("completeUpdate(%s)", str);
        C5163p pVar = new C5163p();
        this.f15095a.mo15222c(new C5073o(this, pVar, pVar, str));
        return pVar.mo15261a();
    }
}
