package p340io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import p340io.realm.internal.C5698a;
import p340io.realm.internal.Keep;
import p340io.realm.internal.OsSharedRealm;
import p340io.realm.internal.RealmNotifier;

@Keep
/* renamed from: io.realm.internal.android.AndroidRealmNotifier */
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(OsSharedRealm osSharedRealm, C5698a aVar) {
        super(osSharedRealm);
        this.handler = aVar.mo16608a() ? new Handler(Looper.myLooper()) : null;
    }

    public boolean post(Runnable runnable) {
        Handler handler2 = this.handler;
        return handler2 != null && handler2.post(runnable);
    }
}
