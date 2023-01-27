package p340io.realm.internal;

import p340io.realm.C5669h0;
import p340io.realm.internal.ObservableCollection;
import p340io.realm.internal.core.DescriptorOrdering;
import p340io.realm.internal.sync.C5736a;
import p340io.realm.internal.sync.OsSubscription;

/* renamed from: io.realm.internal.r */
public class C5724r extends OsResults {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f16537n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f16538o;

    /* renamed from: p */
    private OsSubscription f16539p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f16540q = false;

    /* renamed from: r */
    private boolean f16541r = true;

    /* renamed from: io.realm.internal.r$a */
    class C5725a implements C5669h0<OsSubscription> {
        C5725a() {
        }

        /* renamed from: b */
        public void mo16295a(OsSubscription osSubscription) {
            boolean unused = C5724r.this.f16538o = true;
        }
    }

    /* renamed from: io.realm.internal.r$b */
    class C5726b implements Runnable {
        C5726b() {
        }

        public void run() {
            boolean unused = C5724r.this.f16538o = false;
            boolean unused2 = C5724r.this.f16540q = false;
            long unused3 = C5724r.this.f16537n = 0;
        }
    }

    /* renamed from: io.realm.internal.r$c */
    class C5727c implements Runnable {
        C5727c() {
        }

        public void run() {
            if (C5724r.this.f16540q || C5724r.this.f16538o) {
                C5724r.this.m23946y();
            }
        }
    }

    C5724r(OsSharedRealm osSharedRealm, Table table, long j, C5736a aVar) {
        super(osSharedRealm, table, j);
        OsSubscription osSubscription = new OsSubscription(this, aVar);
        this.f16539p = osSubscription;
        osSubscription.mo16668a(new C5725a());
        RealmNotifier realmNotifier = osSharedRealm.realmNotifier;
        realmNotifier.addBeginSendingNotificationsCallback(new C5726b());
        realmNotifier.addFinishedSendingNotificationsCallback(new C5727c());
    }

    /* renamed from: x */
    public static C5724r m23945x(OsSharedRealm osSharedRealm, TableQuery tableQuery, DescriptorOrdering descriptorOrdering, C5736a aVar) {
        tableQuery.mo16581m();
        return new C5724r(osSharedRealm, tableQuery.mo16573e(), OsResults.nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr(), descriptorOrdering.getNativePtr()), aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m23946y() {
        OsSubscription osSubscription = this.f16538o ? this.f16539p : null;
        if (this.f16537n != 0 || osSubscription == null || this.f16541r || osSubscription.mo16670c() == OsSubscription.C5735d.ERROR || osSubscription.mo16670c() == OsSubscription.C5735d.COMPLETE) {
            OsCollectionChangeSet dVar = this.f16537n == 0 ? new C5707d(osSubscription, this.f16541r, true) : new OsCollectionChangeSet(this.f16537n, this.f16541r, osSubscription, true);
            if (!dVar.mo16382e() || !mo16453k()) {
                this.f16449j = true;
                this.f16541r = false;
                this.f16451l.mo16631c(new ObservableCollection.C5678a(dVar));
            }
        }
    }

    public void notifyChangeListeners(long j) {
        this.f16540q = true;
        this.f16537n = j;
    }
}
