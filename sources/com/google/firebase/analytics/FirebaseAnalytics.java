package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.measurement.internal.C1857l7;
import com.google.firebase.installations.C2585f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p148g.p189d.p190a.p232c.p241f.p247f.C4552g;
import p148g.p189d.p190a.p232c.p251i.C4944k;

public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f8164b;

    /* renamed from: a */
    private final C4552g f8165a;

    private FirebaseAnalytics(C4552g gVar) {
        C1658o.m7845j(gVar);
        this.f8165a = gVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f8164b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f8164b == null) {
                    f8164b = new FirebaseAnalytics(C4552g.m19452a(context));
                }
            }
        }
        return f8164b;
    }

    @Keep
    public static C1857l7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C4552g b = C4552g.m19453b(context, (String) null, (String) null, (String) null, bundle);
        if (b == null) {
            return null;
        }
        return new C2502b(b);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) C4944k.m20946b(C2585f.m11503l().mo9496f(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f8165a.mo14150i(activity, str, str2);
    }
}
