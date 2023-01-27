package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.measurement.internal.C1784f6;
import com.google.android.gms.measurement.internal.C1807h5;
import com.google.android.gms.measurement.internal.C1857l7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;

@Deprecated
public class AppMeasurement {

    /* renamed from: d */
    private static volatile AppMeasurement f5600d;

    /* renamed from: a */
    private final C1807h5 f5601a;

    /* renamed from: b */
    private final C1857l7 f5602b;

    /* renamed from: c */
    private final boolean f5603c;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            C1658o.m7845j(bundle);
            this.mAppId = (String) C1784f6.m8437a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) C1784f6.m8437a(bundle, "origin", cls2, null);
            this.mName = (String) C1784f6.m8437a(bundle, "name", cls2, null);
            this.mValue = C1784f6.m8437a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C1784f6.m8437a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) C1784f6.m8437a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C1784f6.m8437a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) C1784f6.m8437a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C1784f6.m8437a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) C1784f6.m8437a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C1784f6.m8437a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C1784f6.m8437a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) C1784f6.m8437a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C1784f6.m8437a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C1784f6.m8437a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C1784f6.m8437a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final Bundle mo6619a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C1784f6.m8438b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    private AppMeasurement(C1807h5 h5Var) {
        C1658o.m7845j(h5Var);
        this.f5601a = h5Var;
        this.f5602b = null;
        this.f5603c = false;
    }

    private AppMeasurement(C1857l7 l7Var) {
        C1658o.m7845j(l7Var);
        this.f5602b = l7Var;
        this.f5601a = null;
        this.f5603c = true;
    }

    /* renamed from: a */
    private static AppMeasurement m8029a(Context context, String str, String str2) {
        if (f5600d == null) {
            synchronized (AppMeasurement.class) {
                if (f5600d == null) {
                    C1857l7 b = m8030b(context, (Bundle) null);
                    if (b != null) {
                        f5600d = new AppMeasurement(b);
                    } else {
                        f5600d = new AppMeasurement(C1807h5.m8537a(context, new C4515e(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null), (Long) null));
                    }
                }
            }
        }
        return f5600d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.C1857l7 m8030b(android.content.Context r7, android.os.Bundle r8) {
        /*
            r8 = 0
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r1 = "getScionFrontendApiImplementation"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r6 = 1
            r3[r6] = r4     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{  }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
            r1[r5] = r7     // Catch:{  }
            r1[r6] = r8     // Catch:{  }
            java.lang.Object r7 = r0.invoke(r8, r1)     // Catch:{  }
            com.google.android.gms.measurement.internal.l7 r7 = (com.google.android.gms.measurement.internal.C1857l7) r7     // Catch:{  }
            return r7
        L_0x0027:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m8030b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.l7");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return m8029a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f5603c) {
            this.f5602b.mo7220e(str);
        } else {
            this.f5601a.mo7036S().mo6687z(str, this.f5601a.mo6708g().mo6585a());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f5603c) {
            this.f5602b.mo7227l(str, str2, bundle);
        } else {
            this.f5601a.mo7023F().mo7215y0(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f5603c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f5601a.mo7023F().mo7200c0(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f5603c) {
            this.f5602b.mo7225j(str);
        } else {
            this.f5601a.mo7036S().mo6685D(str, this.f5601a.mo6708g().mo6585a());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f5603c ? this.f5602b.mo7221f() : this.f5601a.mo7024G().mo6976E0();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f5603c ? this.f5602b.mo7218c() : this.f5601a.mo7023F().mo7207j0();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> h = this.f5603c ? this.f5602b.mo7223h(str, str2) : this.f5601a.mo7023F().mo7180B(str, str2);
        ArrayList arrayList = new ArrayList(h == null ? 0 : h.size());
        for (Bundle conditionalUserProperty : h) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f5603c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f5601a.mo7023F().mo7181C(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f5603c ? this.f5602b.mo7217b() : this.f5601a.mo7023F().mo7210m0();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f5603c ? this.f5602b.mo7216a() : this.f5601a.mo7023F().mo7209l0();
    }

    @Keep
    public String getGmpAppId() {
        return this.f5603c ? this.f5602b.mo7219d() : this.f5601a.mo7023F().mo7211n0();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f5603c) {
            return this.f5602b.mo7224i(str);
        }
        this.f5601a.mo7023F();
        C1658o.m7841f(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f5603c ? this.f5602b.mo7226k(str, str2, z) : this.f5601a.mo7023F().mo7183E(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f5603c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f5601a.mo7023F().mo7182D(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f5603c) {
            this.f5602b.mo7228m(str, str2, bundle);
        } else {
            this.f5601a.mo7023F().mo7195X(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C1658o.m7845j(conditionalUserProperty);
        if (this.f5603c) {
            this.f5602b.mo7222g(conditionalUserProperty.mo6619a());
        } else {
            this.f5601a.mo7023F().mo7185G(conditionalUserProperty.mo6619a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C1658o.m7845j(conditionalUserProperty);
        if (this.f5603c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f5601a.mo7023F().mo7212r0(conditionalUserProperty.mo6619a());
        throw null;
    }
}
