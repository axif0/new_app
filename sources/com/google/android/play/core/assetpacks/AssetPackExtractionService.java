package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

public class AssetPackExtractionService extends Service {

    /* renamed from: f */
    private final C5100f f7704f = new C5100f("AssetPackExtractionService");

    /* renamed from: g */
    Context f7705g;

    /* renamed from: h */
    C2421w2 f7706h;

    /* renamed from: i */
    C2328c0 f7707i;

    /* renamed from: j */
    private C2318a0 f7708j;

    /* renamed from: k */
    private NotificationManager f7709k;

    /* renamed from: c */
    private final synchronized void m10791c(Bundle bundle) {
        String string = bundle.getString("notification_title");
        String string2 = bundle.getString("notification_subtext");
        long j = bundle.getLong("notification_timeout");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f7705g, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j) : new Notification.Builder(this.f7705g).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(string).setSubText(string2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(bundle.getInt("notification_color")).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f7704f.mo15206f("Starting foreground service.", new Object[0]);
        this.f7706h.mo9256b(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7709k.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", bundle.getString("notification_channel_name"), 2));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: a */
    public final synchronized Bundle mo9092a(Bundle bundle) {
        int i = bundle.getInt("action_type");
        C5100f fVar = this.f7704f;
        Integer valueOf = Integer.valueOf(i);
        fVar.mo15203c("updateServiceState: %d", valueOf);
        if (i == 1) {
            m10791c(bundle);
        } else if (i == 2) {
            mo9093b();
        } else {
            this.f7704f.mo15205e("Unknown action type received: %d", valueOf);
        }
        return new Bundle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo9093b() {
        this.f7704f.mo15206f("Stopping service.", new Object[0]);
        this.f7706h.mo9256b(false);
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.f7708j;
    }

    public final void onCreate() {
        super.onCreate();
        this.f7704f.mo15203c("onCreate", new Object[0]);
        C2420w1.m11060a(getApplicationContext()).mo9139a(this);
        this.f7708j = new C2318a0(this.f7705g, this, this.f7707i);
        this.f7709k = (NotificationManager) this.f7705g.getSystemService("notification");
    }
}
