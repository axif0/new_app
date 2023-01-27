package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0575h;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.i */
class C0582i implements C0574g {

    /* renamed from: a */
    private final Notification.Builder f2419a;

    /* renamed from: b */
    private final C0575h.C0580e f2420b;

    /* renamed from: c */
    private RemoteViews f2421c;

    /* renamed from: d */
    private RemoteViews f2422d;

    /* renamed from: e */
    private final List<Bundle> f2423e = new ArrayList();

    /* renamed from: f */
    private final Bundle f2424f = new Bundle();

    /* renamed from: g */
    private int f2425g;

    /* renamed from: h */
    private RemoteViews f2426h;

    C0582i(C0575h.C0580e eVar) {
        ArrayList<String> arrayList;
        String str;
        Bundle bundle;
        this.f2420b = eVar;
        this.f2419a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(eVar.f2389a, eVar.f2379I) : new Notification.Builder(eVar.f2389a);
        Notification notification = eVar.f2386P;
        this.f2419a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2396h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2392d).setContentText(eVar.f2393e).setContentInfo(eVar.f2398j).setContentIntent(eVar.f2394f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2395g, (notification.flags & 128) != 0).setLargeIcon(eVar.f2397i).setNumber(eVar.f2399k).setProgress(eVar.f2406r, eVar.f2407s, eVar.f2408t);
        if (Build.VERSION.SDK_INT < 21) {
            this.f2419a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f2419a.setSubText(eVar.f2404p).setUsesChronometer(eVar.f2402n).setPriority(eVar.f2400l);
            Iterator<C0575h.C0576a> it = eVar.f2390b.iterator();
            while (it.hasNext()) {
                m2718b(it.next());
            }
            Bundle bundle2 = eVar.f2372B;
            if (bundle2 != null) {
                this.f2424f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f2412x) {
                    this.f2424f.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.f2409u;
                if (str2 != null) {
                    this.f2424f.putString("android.support.groupKey", str2);
                    if (eVar.f2410v) {
                        bundle = this.f2424f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f2424f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.f2411w;
                if (str3 != null) {
                    this.f2424f.putString("android.support.sortKey", str3);
                }
            }
            this.f2421c = eVar.f2376F;
            this.f2422d = eVar.f2377G;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2419a.setShowWhen(eVar.f2401m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = eVar.f2388R) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f2424f;
                ArrayList<String> arrayList2 = eVar.f2388R;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f2419a.setLocalOnly(eVar.f2412x).setGroup(eVar.f2409u).setGroupSummary(eVar.f2410v).setSortKey(eVar.f2411w);
            this.f2425g = eVar.f2383M;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2419a.setCategory(eVar.f2371A).setColor(eVar.f2373C).setVisibility(eVar.f2374D).setPublicVersion(eVar.f2375E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = eVar.f2388R.iterator();
            while (it2.hasNext()) {
                this.f2419a.addPerson(it2.next());
            }
            this.f2426h = eVar.f2378H;
            if (eVar.f2391c.size() > 0) {
                Bundle bundle4 = eVar.mo2840c().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < eVar.f2391c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), C0583j.m2724b(eVar.f2391c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.mo2840c().putBundle("android.car.EXTENSIONS", bundle4);
                this.f2424f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2419a.setExtras(eVar.f2372B).setRemoteInputHistory(eVar.f2405q);
            RemoteViews remoteViews = eVar.f2376F;
            if (remoteViews != null) {
                this.f2419a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f2377G;
            if (remoteViews2 != null) {
                this.f2419a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f2378H;
            if (remoteViews3 != null) {
                this.f2419a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2419a.setBadgeIconType(eVar.f2380J).setShortcutId(eVar.f2381K).setTimeoutAfter(eVar.f2382L).setGroupAlertBehavior(eVar.f2383M);
            if (eVar.f2414z) {
                this.f2419a.setColorized(eVar.f2413y);
            }
            if (!TextUtils.isEmpty(eVar.f2379I)) {
                this.f2419a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2419a.setAllowSystemGeneratedContextualActions(eVar.f2384N);
            this.f2419a.setBubbleMetadata(C0575h.C0579d.m2683b(eVar.f2385O));
        }
        if (eVar.f2387Q) {
            if (this.f2420b.f2410v) {
                this.f2425g = 2;
            } else {
                this.f2425g = 1;
            }
            this.f2419a.setVibrate((long[]) null);
            this.f2419a.setSound((Uri) null);
            int i2 = notification.defaults & -2;
            notification.defaults = i2;
            int i3 = i2 & -3;
            notification.defaults = i3;
            this.f2419a.setDefaults(i3);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f2420b.f2409u)) {
                    this.f2419a.setGroup("silent");
                }
                this.f2419a.setGroupAlertBehavior(this.f2425g);
            }
        }
    }

    /* renamed from: b */
    private void m2718b(C0575h.C0576a aVar) {
        Notification.Action.Builder builder;
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            IconCompat e = aVar.mo2826e();
            if (Build.VERSION.SDK_INT >= 23) {
                builder = new Notification.Action.Builder(e != null ? e.mo2884n() : null, aVar.mo2830i(), aVar.mo2822a());
            } else {
                builder = new Notification.Action.Builder(e != null ? e.mo2878c() : 0, aVar.mo2830i(), aVar.mo2822a());
            }
            if (aVar.mo2827f() != null) {
                for (RemoteInput addRemoteInput : C0584k.m2730b(aVar.mo2827f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo2825d() != null ? new Bundle(aVar.mo2825d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2823b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2823b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2828g());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo2828g());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.mo2831j());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2829h());
            builder.addExtras(bundle);
            this.f2419a.addAction(builder.build());
        } else if (i >= 16) {
            this.f2423e.add(C0583j.m2728f(this.f2419a, aVar));
        }
    }

    /* renamed from: e */
    private void m2719e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo2821a() {
        return this.f2419a;
    }

    /* renamed from: c */
    public Notification mo2866c() {
        Bundle a;
        RemoteViews e;
        RemoteViews c;
        C0575h.C0581f fVar = this.f2420b.f2403o;
        if (fVar != null) {
            fVar.mo2832b(this);
        }
        RemoteViews d = fVar != null ? fVar.mo2863d(this) : null;
        Notification d2 = mo2867d();
        if (!(d == null && (d = this.f2420b.f2376F) == null)) {
            d2.contentView = d;
        }
        if (!(Build.VERSION.SDK_INT < 16 || fVar == null || (c = fVar.mo2862c(this)) == null)) {
            d2.bigContentView = c;
        }
        if (!(Build.VERSION.SDK_INT < 21 || fVar == null || (e = this.f2420b.f2403o.mo2864e(this)) == null)) {
            d2.headsUpContentView = e;
        }
        if (!(Build.VERSION.SDK_INT < 16 || fVar == null || (a = C0575h.m2667a(d2)) == null)) {
            fVar.mo2861a(a);
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo2867d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f2419a.build();
        }
        if (i >= 24) {
            Notification build = this.f2419a.build();
            if (this.f2425g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f2425g != 2)) {
                    m2719e(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f2425g == 1) {
                    m2719e(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f2419a.setExtras(this.f2424f);
            Notification build2 = this.f2419a.build();
            RemoteViews remoteViews = this.f2421c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2422d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2426h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2425g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f2425g != 2)) {
                    m2719e(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f2425g == 1) {
                    m2719e(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f2419a.setExtras(this.f2424f);
            Notification build3 = this.f2419a.build();
            RemoteViews remoteViews4 = this.f2421c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2422d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2425g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f2425g != 2)) {
                    m2719e(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f2425g == 1) {
                    m2719e(build3);
                }
            }
            return build3;
        } else if (i >= 19) {
            SparseArray<Bundle> a = C0583j.m2723a(this.f2423e);
            if (a != null) {
                this.f2424f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f2419a.setExtras(this.f2424f);
            Notification build4 = this.f2419a.build();
            RemoteViews remoteViews6 = this.f2421c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2422d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i < 16) {
            return this.f2419a.getNotification();
        } else {
            Notification build5 = this.f2419a.build();
            Bundle a2 = C0575h.m2667a(build5);
            Bundle bundle = new Bundle(this.f2424f);
            for (String str : this.f2424f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0583j.m2723a(this.f2423e);
            if (a3 != null) {
                C0575h.m2667a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f2421c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f2422d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }
}
