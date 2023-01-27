package p086f.p140p.p141a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: f.p.a.a */
public final class C3465a {

    /* renamed from: f */
    private static final Object f10865f = new Object();

    /* renamed from: g */
    private static C3465a f10866g;

    /* renamed from: a */
    private final Context f10867a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C3468c>> f10868b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C3468c>> f10869c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C3467b> f10870d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f10871e;

    /* renamed from: f.p.a.a$a */
    class C3466a extends Handler {
        C3466a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C3465a.this.mo11858a();
            }
        }
    }

    /* renamed from: f.p.a.a$b */
    private static final class C3467b {

        /* renamed from: a */
        final Intent f10873a;

        /* renamed from: b */
        final ArrayList<C3468c> f10874b;

        C3467b(Intent intent, ArrayList<C3468c> arrayList) {
            this.f10873a = intent;
            this.f10874b = arrayList;
        }
    }

    /* renamed from: f.p.a.a$c */
    private static final class C3468c {

        /* renamed from: a */
        final IntentFilter f10875a;

        /* renamed from: b */
        final BroadcastReceiver f10876b;

        /* renamed from: c */
        boolean f10877c;

        /* renamed from: d */
        boolean f10878d;

        C3468c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f10875a = intentFilter;
            this.f10876b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f10876b);
            sb.append(" filter=");
            sb.append(this.f10875a);
            if (this.f10878d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C3465a(Context context) {
        this.f10867a = context;
        this.f10871e = new C3466a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C3465a m14960b(Context context) {
        C3465a aVar;
        synchronized (f10865f) {
            if (f10866g == null) {
                f10866g = new C3465a(context.getApplicationContext());
            }
            aVar = f10866g;
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.f10874b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.f10874b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.f10878d != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.f10876b.onReceive(r10.f10867a, r4.f10873a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11858a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<f.p.a.a$c>> r0 = r10.f10868b
            monitor-enter(r0)
            java.util.ArrayList<f.p.a.a$b> r1 = r10.f10870d     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            f.p.a.a$b[] r2 = new p086f.p140p.p141a.C3465a.C3467b[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<f.p.a.a$b> r3 = r10.f10870d     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<f.p.a.a$b> r3 = r10.f10870d     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<f.p.a.a$c> r5 = r4.f10874b
            int r5 = r5.size()
            r6 = 0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<f.p.a.a$c> r7 = r4.f10874b
            java.lang.Object r7 = r7.get(r6)
            f.p.a.a$c r7 = (p086f.p140p.p141a.C3465a.C3468c) r7
            boolean r8 = r7.f10878d
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.f10876b
            android.content.Context r8 = r10.f10867a
            android.content.Intent r9 = r4.f10873a
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0047:
            throw r1
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p140p.p141a.C3465a.mo11858a():void");
    }

    /* renamed from: c */
    public void mo11859c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f10868b) {
            C3468c cVar = new C3468c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f10868b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f10868b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f10869c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f10869c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11860d(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<f.p.a.a$c>> r2 = r1.f10868b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x0175 }
            android.content.Context r3 = r1.f10867a     // Catch:{ all -> 0x0175 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0175 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0175 }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x0175 }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x0175 }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x0175 }
            int r3 = r22.getFlags()     // Catch:{ all -> 0x0175 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x002c
            r16 = 1
            goto L_0x002e
        L_0x002c:
            r16 = 0
        L_0x002e:
            if (r16 == 0) goto L_0x0056
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "Resolving type "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r11)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = " scheme "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r13)     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = " of intent "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x0056:
            java.util.HashMap<java.lang.String, java.util.ArrayList<f.p.a.a$c>> r3 = r1.f10869c     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x0175 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0175 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0175 }
            if (r8 == 0) goto L_0x0172
            if (r16 == 0) goto L_0x007d
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = "Action list: "
            r4.append(r5)     // Catch:{ all -> 0x0175 }
            r4.append(r8)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x007d:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x0080:
            int r3 = r8.size()     // Catch:{ all -> 0x0175 }
            if (r6 >= r3) goto L_0x0142
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x0175 }
            r5 = r3
            f.p.a.a$c r5 = (p086f.p140p.p141a.C3465a.C3468c) r5     // Catch:{ all -> 0x0175 }
            if (r16 == 0) goto L_0x00a7
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r4.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = "Matching against filter "
            r4.append(r9)     // Catch:{ all -> 0x0175 }
            android.content.IntentFilter r9 = r5.f10875a     // Catch:{ all -> 0x0175 }
            r4.append(r9)     // Catch:{ all -> 0x0175 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x00a7:
            boolean r3 = r5.f10877c     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x00c0
            if (r16 == 0) goto L_0x00b4
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = "  Filter's target already added"
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0175 }
        L_0x00b4:
            r17 = r6
            r19 = r8
            r18 = r10
            r20 = r11
            r11 = 1
            r10 = r7
            goto L_0x0137
        L_0x00c0:
            android.content.IntentFilter r3 = r5.f10875a     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r17 = r6
            r6 = r13
            r18 = r10
            r10 = r7
            r7 = r12
            r19 = r8
            r8 = r14
            r20 = r11
            r11 = 1
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0175 }
            if (r3 < 0) goto L_0x0105
            if (r16 == 0) goto L_0x00f6
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "  Filter matched!  match=0x"
            r5.append(r6)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0175 }
            r5.append(r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0175 }
        L_0x00f6:
            if (r10 != 0) goto L_0x00fe
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0175 }
            r7.<init>()     // Catch:{ all -> 0x0175 }
            goto L_0x00ff
        L_0x00fe:
            r7 = r10
        L_0x00ff:
            r7.add(r15)     // Catch:{ all -> 0x0175 }
            r15.f10877c = r11     // Catch:{ all -> 0x0175 }
            goto L_0x0138
        L_0x0105:
            if (r16 == 0) goto L_0x0137
            r4 = -4
            if (r3 == r4) goto L_0x011f
            r4 = -3
            if (r3 == r4) goto L_0x011c
            r4 = -2
            if (r3 == r4) goto L_0x0119
            r4 = -1
            if (r3 == r4) goto L_0x0116
            java.lang.String r3 = "unknown reason"
            goto L_0x0121
        L_0x0116:
            java.lang.String r3 = "type"
            goto L_0x0121
        L_0x0119:
            java.lang.String r3 = "data"
            goto L_0x0121
        L_0x011c:
            java.lang.String r3 = "action"
            goto L_0x0121
        L_0x011f:
            java.lang.String r3 = "category"
        L_0x0121:
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r5.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "  Filter did not match: "
            r5.append(r6)     // Catch:{ all -> 0x0175 }
            r5.append(r3)     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0175 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0175 }
        L_0x0137:
            r7 = r10
        L_0x0138:
            int r6 = r17 + 1
            r10 = r18
            r8 = r19
            r11 = r20
            goto L_0x0080
        L_0x0142:
            r10 = r7
            r11 = 1
            if (r10 == 0) goto L_0x0172
            r3 = 0
        L_0x0147:
            int r4 = r10.size()     // Catch:{ all -> 0x0175 }
            if (r3 >= r4) goto L_0x0159
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x0175 }
            f.p.a.a$c r4 = (p086f.p140p.p141a.C3465a.C3468c) r4     // Catch:{ all -> 0x0175 }
            r5 = 0
            r4.f10877c = r5     // Catch:{ all -> 0x0175 }
            int r3 = r3 + 1
            goto L_0x0147
        L_0x0159:
            java.util.ArrayList<f.p.a.a$b> r3 = r1.f10870d     // Catch:{ all -> 0x0175 }
            f.p.a.a$b r4 = new f.p.a.a$b     // Catch:{ all -> 0x0175 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0175 }
            r3.add(r4)     // Catch:{ all -> 0x0175 }
            android.os.Handler r0 = r1.f10871e     // Catch:{ all -> 0x0175 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x0170
            android.os.Handler r0 = r1.f10871e     // Catch:{ all -> 0x0175 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x0175 }
        L_0x0170:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            return r11
        L_0x0172:
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            r0 = 0
            return r0
        L_0x0175:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            goto L_0x0179
        L_0x0178:
            throw r0
        L_0x0179:
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p140p.p141a.C3465a.mo11860d(android.content.Intent):boolean");
    }

    /* renamed from: e */
    public void mo11861e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f10868b) {
            ArrayList remove = this.f10868b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C3468c cVar = (C3468c) remove.get(size);
                    cVar.f10878d = true;
                    for (int i = 0; i < cVar.f10875a.countActions(); i++) {
                        String action = cVar.f10875a.getAction(i);
                        ArrayList arrayList = this.f10869c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C3468c cVar2 = (C3468c) arrayList.get(size2);
                                if (cVar2.f10876b == broadcastReceiver) {
                                    cVar2.f10878d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f10869c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
