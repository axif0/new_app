package p148g.p189d.p190a.p232c.p237d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1658o;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: g.d.a.c.d.a */
public class C4364a implements ServiceConnection {

    /* renamed from: a */
    private boolean f13890a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f13891b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo13669a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C1658o.m7844i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f13890a) {
            this.f13890a = true;
            IBinder poll = this.f13891b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13891b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
