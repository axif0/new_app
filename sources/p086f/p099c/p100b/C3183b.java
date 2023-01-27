package p086f.p099c.p100b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import androidx.core.app.C0570d;
import java.util.ArrayList;
import p086f.p099c.p100b.C3181a;
import p086f.p111h.p112e.C3267a;

/* renamed from: f.c.b.b */
public final class C3183b {

    /* renamed from: a */
    public final Intent f10115a;

    /* renamed from: b */
    public final Bundle f10116b;

    /* renamed from: f.c.b.b$a */
    public static final class C3184a {

        /* renamed from: a */
        private final Intent f10117a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C3181a.C3182a f10118b = new C3181a.C3182a();

        /* renamed from: c */
        private ArrayList<Bundle> f10119c;

        /* renamed from: d */
        private Bundle f10120d;

        /* renamed from: e */
        private ArrayList<Bundle> f10121e;

        /* renamed from: f */
        private boolean f10122f = true;

        /* renamed from: g */
        private SparseArray<Bundle> f10123g;

        /* renamed from: c */
        private void m13594c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0570d.m2656b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f10117a.putExtras(bundle);
        }

        /* renamed from: a */
        public C3184a mo11008a() {
            this.f10117a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }

        /* renamed from: b */
        public C3183b mo11009b() {
            if (!this.f10117a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m13594c((IBinder) null, (PendingIntent) null);
            }
            ArrayList<Bundle> arrayList = this.f10119c;
            if (arrayList != null) {
                this.f10117a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f10121e;
            if (arrayList2 != null) {
                this.f10117a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f10117a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f10122f);
            this.f10117a.putExtras(this.f10118b.mo11005a().mo11004a());
            if (this.f10123g != null) {
                Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f10123g);
                this.f10117a.putExtras(bundle);
            }
            return new C3183b(this.f10117a, this.f10120d);
        }

        /* renamed from: d */
        public C3184a mo11010d(boolean z) {
            this.f10117a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: e */
        public C3184a mo11011e(int i) {
            this.f10118b.mo11006b(i);
            return this;
        }
    }

    C3183b(Intent intent, Bundle bundle) {
        this.f10115a = intent;
        this.f10116b = bundle;
    }

    /* renamed from: a */
    public void mo11007a(Context context, Uri uri) {
        this.f10115a.setData(uri);
        C3267a.m14080j(context, this.f10115a, this.f10116b);
    }
}
