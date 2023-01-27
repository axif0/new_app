package p148g.p189d.p190a.p232c.p236c;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p148g.p189d.p190a.p232c.p236c.C4336c;

/* renamed from: g.d.a.c.c.e */
public class C4341e implements Parcelable {
    public static final Parcelable.Creator<C4341e> CREATOR = new C4344g();

    /* renamed from: f */
    private Messenger f13851f;

    /* renamed from: g */
    private C4336c f13852g;

    /* renamed from: g.d.a.c.c.e$a */
    public static final class C4342a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!(Log.isLoggable("CloudMessengerCompat", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3)))) {
                return C4341e.class;
            }
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            return C4341e.class;
        }
    }

    public C4341e(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f13851f = new Messenger(iBinder);
        } else {
            this.f13852g = new C4336c.C4337a(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m18516a() {
        Messenger messenger = this.f13851f;
        return messenger != null ? messenger.getBinder() : this.f13852g.asBinder();
    }

    /* renamed from: b */
    public final void mo13632b(Message message) throws RemoteException {
        Messenger messenger = this.f13851f;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f13852g.mo13625V(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m18516a().equals(((C4341e) obj).m18516a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m18516a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f13851f;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f13852g.asBinder());
    }
}
