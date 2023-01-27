package p148g.p189d.p190a.p232c.p236c;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.p038q.C1694a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p148g.p189d.p190a.p232c.p241f.p244c.C4414a;
import p148g.p189d.p190a.p232c.p241f.p244c.C4419f;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4944k;

/* renamed from: g.d.a.c.c.b */
public abstract class C4334b extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f13834a = C4414a.m18660a().mo13743a(new C1694a("firebase-iid-executor"), C4419f.f13950a);

    /* renamed from: e */
    private final int m18493e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            mo9430d(context, extras);
            return -1;
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo9429c(context, extras);
            return -1;
        } else {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return 500;
        }
    }

    /* renamed from: g */
    private final int m18494g(Context context, Intent intent) {
        C4940h<Void> hVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            hVar = C4944k.m20949e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            hVar = C4346i.m18520c(context).mo13643d(2, bundle);
        }
        int b = mo9428b(context, new C4332a(intent));
        try {
            C4944k.m20946b(hVar, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Executor mo13622a() {
        return this.f13834a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo9428b(Context context, C4332a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo9429c(Context context, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo9430d(Context context, Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo13623f(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int e = intent2 != null ? m18493e(context, intent2) : m18494g(context, intent);
            if (z) {
                pendingResult.setResultCode(e);
            }
        } finally {
            pendingResult.finish();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            mo13622a().execute(new C4345h(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
