package p148g.p189d.p190a.p232c.p236c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p086f.p102e.C3203g;
import p148g.p189d.p190a.p232c.p236c.C4341e;
import p148g.p189d.p190a.p232c.p251i.C4940h;
import p148g.p189d.p190a.p232c.p251i.C4941i;
import p148g.p189d.p190a.p232c.p251i.C4944k;

/* renamed from: g.d.a.c.c.d */
public class C4339d {

    /* renamed from: h */
    private static int f13840h;

    /* renamed from: i */
    private static PendingIntent f13841i;

    /* renamed from: j */
    private static final Executor f13842j = C4340d0.f13850a;

    /* renamed from: a */
    private final C3203g<String, C4941i<Bundle>> f13843a = new C3203g<>();

    /* renamed from: b */
    private final Context f13844b;

    /* renamed from: c */
    private final C4359v f13845c;

    /* renamed from: d */
    private final ScheduledExecutorService f13846d;

    /* renamed from: e */
    private Messenger f13847e;

    /* renamed from: f */
    private Messenger f13848f;

    /* renamed from: g */
    private C4341e f13849g;

    public C4339d(Context context) {
        this.f13844b = context;
        this.f13845c = new C4359v(context);
        this.f13847e = new Messenger(new C4338c0(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13846d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    static final /* synthetic */ Bundle m18503b(C4940h hVar) throws Exception {
        if (hVar.mo14874l()) {
            return (Bundle) hVar.mo14870h();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(hVar.mo14869g());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", hVar.mo14869g());
    }

    /* renamed from: c */
    static final /* synthetic */ C4940h m18504c(Bundle bundle) throws Exception {
        return m18511l(bundle) ? C4944k.m20949e(null) : C4944k.m20949e(bundle);
    }

    /* renamed from: e */
    private static synchronized String m18505e() {
        String num;
        synchronized (C4339d.class) {
            int i = f13840h;
            f13840h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: f */
    private static synchronized void m18506f(Context context, Intent intent) {
        synchronized (C4339d.class) {
            if (f13841i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f13841i = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f13841i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m18507g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C4341e.C4342a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C4341e) {
                        this.f13849g = (C4341e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f13848f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            Log.d("Rpc", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                String valueOf3 = String.valueOf(stringExtra2);
                                Log.w("Rpc", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            m18510j(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (this.f13843a) {
                            for (int i = 0; i < this.f13843a.size(); i++) {
                                m18510j(this.f13843a.mo11139i(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            m18510j(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        String valueOf4 = String.valueOf(stringExtra);
                        Log.d("Rpc", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf5 = String.valueOf(action);
                    Log.d("Rpc", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: i */
    static final /* synthetic */ void m18509i(C4941i iVar) {
        if (iVar.mo14886d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    /* renamed from: j */
    private final void m18510j(String str, Bundle bundle) {
        synchronized (this.f13843a) {
            C4941i remove = this.f13843a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.mo14885c(bundle);
        }
    }

    /* renamed from: l */
    private static boolean m18511l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: m */
    private final C4940h<Bundle> m18512m(Bundle bundle) {
        String e = m18505e();
        C4941i iVar = new C4941i();
        synchronized (this.f13843a) {
            this.f13843a.put(e, iVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f13845c.mo13666a() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        m18506f(this.f13844b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 5);
        sb.append("|ID|");
        sb.append(e);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f13847e);
        if (!(this.f13848f == null && this.f13849g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                if (this.f13848f != null) {
                    this.f13848f.send(obtain);
                } else {
                    this.f13849g.mo13632b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            iVar.mo14883a().mo14864b(f13842j, new C4335b0(this, e, this.f13846d.schedule(new C4362y(iVar), 30, TimeUnit.SECONDS)));
            return iVar.mo14883a();
        }
        if (this.f13845c.mo13666a() == 2) {
            this.f13844b.sendBroadcast(intent);
        } else {
            this.f13844b.startService(intent);
        }
        iVar.mo14883a().mo14864b(f13842j, new C4335b0(this, e, this.f13846d.schedule(new C4362y(iVar), 30, TimeUnit.SECONDS)));
        return iVar.mo14883a();
    }

    /* renamed from: a */
    public C4940h<Bundle> mo13628a(Bundle bundle) {
        boolean z = true;
        if (this.f13845c.mo13667c() >= 12000000) {
            return C4346i.m18520c(this.f13844b).mo13644f(1, bundle).mo14867e(f13842j, C4361x.f13886a);
        }
        if (this.f13845c.mo13666a() == 0) {
            z = false;
        }
        return !z ? C4944k.m20948d(new IOException("MISSING_INSTANCEID_SERVICE")) : m18512m(bundle).mo14868f(f13842j, new C4363z(this, bundle));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ C4940h mo13629d(Bundle bundle, C4940h hVar) throws Exception {
        return (hVar.mo14874l() && m18511l((Bundle) hVar.mo14870h())) ? m18512m(bundle).mo14875m(f13842j, C4333a0.f13833a) : hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo13630k(String str, ScheduledFuture scheduledFuture, C4940h hVar) {
        synchronized (this.f13843a) {
            this.f13843a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
