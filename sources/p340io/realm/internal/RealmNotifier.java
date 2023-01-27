package p340io.realm.internal;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import p340io.realm.C5669h0;
import p340io.realm.internal.C5714k;

@Keep
/* renamed from: io.realm.internal.RealmNotifier */
public abstract class RealmNotifier implements Closeable {
    private List<Runnable> finishedSendingNotificationsCallbacks = new ArrayList();
    private final C5714k.C5715a<C5697b> onChangeCallBack = new C5696a();
    private C5714k<C5697b> realmObserverPairs = new C5714k<>();
    /* access modifiers changed from: private */
    public OsSharedRealm sharedRealm;
    private List<Runnable> startSendingNotificationsCallbacks = new ArrayList();
    private List<Runnable> transactionCallbacks = new ArrayList();

    /* renamed from: io.realm.internal.RealmNotifier$a */
    class C5696a implements C5714k.C5715a<C5697b> {
        C5696a() {
        }

        /* renamed from: b */
        public void mo16266a(C5697b bVar, Object obj) {
            if (RealmNotifier.this.sharedRealm != null && !RealmNotifier.this.sharedRealm.isClosed()) {
                bVar.m23717b(obj);
            }
        }
    }

    /* renamed from: io.realm.internal.RealmNotifier$b */
    private static class C5697b<T> extends C5714k.C5716b<T, C5669h0<T>> {
        public C5697b(T t, C5669h0<T> h0Var) {
            super(t, h0Var);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m23717b(T t) {
            if (t != null) {
                ((C5669h0) this.f16516b).mo16295a(t);
            }
        }
    }

    protected RealmNotifier(OsSharedRealm osSharedRealm) {
        this.sharedRealm = osSharedRealm;
    }

    private void removeAllChangeListeners() {
        this.realmObserverPairs.mo16630b();
    }

    public void addBeginSendingNotificationsCallback(Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }

    public <T> void addChangeListener(T t, C5669h0<T> h0Var) {
        this.realmObserverPairs.mo16629a(new C5697b(t, h0Var));
    }

    public void addFinishedSendingNotificationsCallback(Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }

    public void addTransactionCallback(Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }

    /* access modifiers changed from: package-private */
    public void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }

    public void close() {
        removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }

    /* access modifiers changed from: package-private */
    public void didChange() {
        this.realmObserverPairs.mo16631c(this.onChangeCallBack);
        if (!this.transactionCallbacks.isEmpty()) {
            List<Runnable> list = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList();
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void didSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.finishedSendingNotificationsCallbacks.get(i).run();
        }
    }

    public int getListenersListSize() {
        return this.realmObserverPairs.mo16635g();
    }

    public abstract boolean post(Runnable runnable);

    public <E> void removeChangeListener(E e, C5669h0<E> h0Var) {
        this.realmObserverPairs.mo16633e(e, h0Var);
    }

    public <E> void removeChangeListeners(E e) {
        this.realmObserverPairs.mo16634f(e);
    }

    /* access modifiers changed from: package-private */
    public void willSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); i++) {
            this.startSendingNotificationsCallbacks.get(i).run();
        }
    }
}
