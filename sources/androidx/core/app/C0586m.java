package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p086f.p111h.p112e.C3267a;

/* renamed from: androidx.core.app.m */
public final class C0586m implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f2430f = new ArrayList<>();

    /* renamed from: g */
    private final Context f2431g;

    /* renamed from: androidx.core.app.m$a */
    public interface C0587a {
        /* renamed from: o */
        Intent mo848o();
    }

    private C0586m(Context context) {
        this.f2431g = context;
    }

    /* renamed from: h */
    public static C0586m m2735h(Context context) {
        return new C0586m(context);
    }

    /* renamed from: c */
    public C0586m mo2872c(Intent intent) {
        this.f2430f.add(intent);
        return this;
    }

    /* renamed from: d */
    public C0586m mo2873d(Activity activity) {
        Intent o = activity instanceof C0587a ? ((C0587a) activity).mo848o() : null;
        if (o == null) {
            o = C0573f.m2660a(activity);
        }
        if (o != null) {
            ComponentName component = o.getComponent();
            if (component == null) {
                component = o.resolveActivity(this.f2431g.getPackageManager());
            }
            mo2874f(component);
            mo2872c(o);
        }
        return this;
    }

    /* renamed from: f */
    public C0586m mo2874f(ComponentName componentName) {
        int size = this.f2430f.size();
        try {
            Context context = this.f2431g;
            while (true) {
                Intent b = C0573f.m2661b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.f2430f.add(size, b);
                context = this.f2431g;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: i */
    public void mo2875i() {
        mo2877j((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2430f.iterator();
    }

    /* renamed from: j */
    public void mo2877j(Bundle bundle) {
        if (!this.f2430f.isEmpty()) {
            ArrayList<Intent> arrayList = this.f2430f;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C3267a.m14079i(this.f2431g, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f2431g.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
