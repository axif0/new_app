package p148g.p189d.p190a.p232c.p236c;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: g.d.a.c.c.s */
final class C4356s {

    /* renamed from: a */
    private final Messenger f13877a;

    /* renamed from: b */
    private final C4341e f13878b;

    C4356s(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f13877a = new Messenger(iBinder);
            this.f13878b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f13878b = new C4341e(iBinder);
            this.f13877a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13662a(Message message) throws RemoteException {
        Messenger messenger = this.f13877a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C4341e eVar = this.f13878b;
        if (eVar != null) {
            eVar.mo13632b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
