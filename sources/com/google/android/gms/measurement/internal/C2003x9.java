package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1682e;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p086f.p102e.C3190a;
import p148g.p189d.p190a.p232c.p237d.p239p.C4389c;
import p148g.p189d.p190a.p232c.p241f.p247f.C4462b1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4499d1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4515e;
import p148g.p189d.p190a.p232c.p241f.p247f.C4574h1;
import p148g.p189d.p190a.p232c.p241f.p247f.C4602ib;
import p148g.p189d.p190a.p232c.p241f.p247f.C4729pa;
import p148g.p189d.p190a.p232c.p241f.p247f.C4784t0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4884yc;
import p148g.p189d.p190a.p232c.p241f.p247f.C4888z0;
import p148g.p189d.p190a.p232c.p241f.p247f.C4895z6;
import p148g.p189d.p190a.p232c.p241f.p247f.C4907zc;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
public class C2003x9 implements C1748c6 {

    /* renamed from: z */
    private static volatile C2003x9 f6518z;

    /* renamed from: a */
    private C1735b5 f6519a;

    /* renamed from: b */
    private C1794g4 f6520b;

    /* renamed from: c */
    private C1753d f6521c;

    /* renamed from: d */
    private C1878n4 f6522d;

    /* renamed from: e */
    private C1955t9 f6523e;

    /* renamed from: f */
    private C1872ma f6524f;

    /* renamed from: g */
    private final C1740ba f6525g;

    /* renamed from: h */
    private C1941s7 f6526h;

    /* renamed from: i */
    private C1751c9 f6527i;

    /* renamed from: j */
    private final C1807h5 f6528j;

    /* renamed from: k */
    private boolean f6529k;

    /* renamed from: l */
    private boolean f6530l;

    /* renamed from: m */
    private long f6531m;

    /* renamed from: n */
    private List<Runnable> f6532n;

    /* renamed from: o */
    private int f6533o;

    /* renamed from: p */
    private int f6534p;

    /* renamed from: q */
    private boolean f6535q;

    /* renamed from: r */
    private boolean f6536r;

    /* renamed from: s */
    private boolean f6537s;

    /* renamed from: t */
    private FileLock f6538t;

    /* renamed from: u */
    private FileChannel f6539u;

    /* renamed from: v */
    private List<Long> f6540v;

    /* renamed from: w */
    private List<Long> f6541w;

    /* renamed from: x */
    private long f6542x;

    /* renamed from: y */
    private final Map<String, C1765e> f6543y;

    /* renamed from: com.google.android.gms.measurement.internal.x9$a */
    class C2004a implements C1777f {

        /* renamed from: a */
        C4499d1 f6544a;

        /* renamed from: b */
        List<Long> f6545b;

        /* renamed from: c */
        List<C4888z0> f6546c;

        /* renamed from: d */
        private long f6547d;

        private C2004a(C2003x9 x9Var) {
        }

        /* synthetic */ C2004a(C2003x9 x9Var, C1991w9 w9Var) {
            this(x9Var);
        }

        /* renamed from: c */
        private static long m9170c(C4888z0 z0Var) {
            return ((z0Var.mo14786Y() / 1000) / 60) / 60;
        }

        /* renamed from: a */
        public final boolean mo6896a(long j, C4888z0 z0Var) {
            C1658o.m7845j(z0Var);
            if (this.f6546c == null) {
                this.f6546c = new ArrayList();
            }
            if (this.f6545b == null) {
                this.f6545b = new ArrayList();
            }
            if (this.f6546c.size() > 0 && m9170c(this.f6546c.get(0)) != m9170c(z0Var)) {
                return false;
            }
            long c = this.f6547d + ((long) z0Var.mo14431c());
            if (c >= ((long) Math.max(0, C1957u.f6370i.mo7323a(null).intValue()))) {
                return false;
            }
            this.f6547d = c;
            this.f6546c.add(z0Var);
            this.f6545b.add(Long.valueOf(j));
            return this.f6546c.size() < Math.max(1, C1957u.f6372j.mo7323a(null).intValue());
        }

        /* renamed from: b */
        public final void mo6897b(C4499d1 d1Var) {
            C1658o.m7845j(d1Var);
            this.f6544a = d1Var;
        }
    }

    private C2003x9(C1752ca caVar) {
        this(caVar, (C1807h5) null);
    }

    private C2003x9(C1752ca caVar, C1807h5 h5Var) {
        this.f6529k = false;
        C1658o.m7845j(caVar);
        this.f6528j = C1807h5.m8537a(caVar.f5712a, (C4515e) null, (Long) null);
        this.f6542x = -1;
        C1740ba baVar = new C1740ba(this);
        baVar.mo7367s();
        this.f6525g = baVar;
        C1794g4 g4Var = new C1794g4(this);
        g4Var.mo7367s();
        this.f6520b = g4Var;
        C1735b5 b5Var = new C1735b5(this);
        b5Var.mo7367s();
        this.f6519a = b5Var;
        this.f6543y = new HashMap();
        this.f6528j.mo6706e().mo6703y(new C1991w9(this, caVar));
    }

    /* renamed from: D */
    private final boolean m9102D(int i, FileChannel fileChannel) {
        m9124n0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f6528j.mo6709i().mo6764E().mo6885a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.f6528j.mo7038b().mo7415s(C1957u.f6395u0) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f6528j.mo6709i().mo6764E().mo6886b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f6528j.mo6709i().mo6764E().mo6886b("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: E */
    private final boolean m9103E(C4888z0.C4889a aVar, C4888z0.C4889a aVar2) {
        C1658o.m7836a("_e".equals(aVar.mo14800K()));
        mo7450d0();
        C4462b1 y = C1740ba.m8150y((C4888z0) ((C4895z6) aVar.mo14350h()), "_sc");
        String str = null;
        String V = y == null ? null : y.mo13815V();
        mo7450d0();
        C4462b1 y2 = C1740ba.m8150y((C4888z0) ((C4895z6) aVar2.mo14350h()), "_pc");
        if (y2 != null) {
            str = y2.mo13815V();
        }
        if (str == null || !str.equals(V)) {
            return false;
        }
        m9111N(aVar, aVar2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0219, code lost:
        if (r4 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0239, code lost:
        if (r6 == null) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024d, code lost:
        r5 = r1;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0252, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0253, code lost:
        r25 = com.karumi.dexter.BuildConfig.FLAVOR;
        r4 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0269, code lost:
        if (r6 == null) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        if (r6 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c5, code lost:
        if (r4 != null) goto L_0x01c7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x024c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0270 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027e A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0451 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0453 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0456 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0457 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0476 A[SYNTHETIC, Splitter:B:213:0x0476] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0510 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0570 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0574 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x05da A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x060a A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0627 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x071b A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x08b2 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x08cb A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x08e5 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0c63 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0c76 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0c79 A[Catch:{ all -> 0x1009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0c9d A[SYNTHETIC, Splitter:B:490:0x0c9d] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b A[Catch:{ SQLiteException -> 0x0242 }] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0fec  */
    /* JADX WARNING: Removed duplicated region for block: B:610:0x1003 A[SYNTHETIC, Splitter:B:610:0x1003] */
    /* JADX WARNING: Removed duplicated region for block: B:628:0x04d7 A[EDGE_INSN: B:628:0x04d7->B:222:0x04d7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012f A[Catch:{ SQLiteException -> 0x0242 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x00e4=Splitter:B:49:0x00e4, B:83:0x01c7=Splitter:B:83:0x01c7, B:110:0x023b=Splitter:B:110:0x023b, B:126:0x026c=Splitter:B:126:0x026c} */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9104F(java.lang.String r43, long r44) {
        /*
            r42 = this;
            r1 = r42
            java.lang.String r2 = "_npa"
            java.lang.String r3 = "_ai"
            java.lang.String r4 = ""
            com.google.android.gms.measurement.internal.d r5 = r42.mo7446Z()
            r5.mo6841t0()
            com.google.android.gms.measurement.internal.x9$a r5 = new com.google.android.gms.measurement.internal.x9$a     // Catch:{ all -> 0x1009 }
            r6 = 0
            r5.<init>(r1, r6)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.d r7 = r42.mo7446Z()     // Catch:{ all -> 0x1009 }
            long r8 = r1.f6542x     // Catch:{ all -> 0x1009 }
            com.google.android.gms.common.internal.C1658o.m7845j(r5)     // Catch:{ all -> 0x1009 }
            r7.mo6700b()     // Catch:{ all -> 0x1009 }
            r7.mo7366r()     // Catch:{ all -> 0x1009 }
            r11 = -1
            r13 = 2
            r14 = 0
            r15 = 1
            android.database.sqlite.SQLiteDatabase r10 = r7.mo6844v()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            boolean r16 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            if (r16 == 0) goto L_0x0094
            int r16 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x0046
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r16 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r6[r14] = r16     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r16 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r6[r15] = r16     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            goto L_0x004e
        L_0x0046:
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r16 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r6[r14] = r16     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
        L_0x004e:
            int r16 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x0057
            java.lang.String r16 = "rowid <= ? and "
            r44 = r16
            goto L_0x0059
        L_0x0057:
            r44 = r4
        L_0x0059:
            int r13 = r44.length()     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            int r13 = r13 + 148
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r11.<init>(r13)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r12 = "select app_id, metadata_fingerprint from raw_events where "
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r12 = r44
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r12 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r11.append(r12)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r11 = r11.toString()     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            android.database.Cursor r6 = r10.rawQuery(r11, r6)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0090 }
            if (r11 != 0) goto L_0x0084
            if (r6 == 0) goto L_0x00e7
            goto L_0x00e4
        L_0x0084:
            java.lang.String r11 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x0090 }
            java.lang.String r12 = r6.getString(r15)     // Catch:{ SQLiteException -> 0x0242 }
            r6.close()     // Catch:{ SQLiteException -> 0x0242 }
            goto L_0x00f3
        L_0x0090:
            r0 = move-exception
            r25 = r4
            goto L_0x00a9
        L_0x0094:
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x00ad
            r6 = 2
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r6 = 0
            r11[r14] = r6     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            r11[r15] = r6     // Catch:{ SQLiteException -> 0x00a5, all -> 0x024c }
            goto L_0x00b2
        L_0x00a5:
            r0 = move-exception
            r25 = r4
            r6 = 0
        L_0x00a9:
            r11 = 0
        L_0x00aa:
            r4 = r0
            goto L_0x0258
        L_0x00ad:
            r6 = 0
            java.lang.String[] r11 = new java.lang.String[]{r6}     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
        L_0x00b2:
            r12 = -1
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x00bb
            java.lang.String r6 = " and rowid <= ?"
            goto L_0x00bc
        L_0x00bb:
            r6 = r4
        L_0x00bc:
            int r12 = r6.length()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            int r12 = r12 + 84
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r13.<init>(r12)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r12 = "select metadata_fingerprint from raw_events where app_id = ?"
            r13.append(r12)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r13.append(r6)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r6 = " order by rowid limit 1;"
            r13.append(r6)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r6 = r13.toString()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            android.database.Cursor r6 = r10.rawQuery(r6, r11)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0247 }
            if (r11 != 0) goto L_0x00eb
            if (r6 == 0) goto L_0x00e7
        L_0x00e4:
            r6.close()     // Catch:{ all -> 0x1009 }
        L_0x00e7:
            r25 = r4
            goto L_0x026c
        L_0x00eb:
            java.lang.String r12 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x0247 }
            r6.close()     // Catch:{ SQLiteException -> 0x0247 }
            r11 = 0
        L_0x00f3:
            java.lang.String r17 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r18 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0242 }
            java.lang.String r19 = "app_id = ? and metadata_fingerprint = ?"
            r13 = 2
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0242 }
            r15[r14] = r11     // Catch:{ SQLiteException -> 0x0242 }
            r13 = 1
            r15[r13] = r12     // Catch:{ SQLiteException -> 0x0242 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            java.lang.String r24 = "2"
            r16 = r10
            r20 = r15
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x0242 }
            boolean r13 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0242 }
            if (r13 != 0) goto L_0x012f
            com.google.android.gms.measurement.internal.c4 r8 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x0242 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6764E()     // Catch:{ SQLiteException -> 0x0242 }
            java.lang.String r9 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ SQLiteException -> 0x0242 }
            r8.mo6886b(r9, r10)     // Catch:{ SQLiteException -> 0x0242 }
            if (r6 == 0) goto L_0x00e7
            goto L_0x00e4
        L_0x012f:
            byte[] r13 = r6.getBlob(r14)     // Catch:{ SQLiteException -> 0x0242 }
            g.d.a.c.f.f.d1$a r15 = p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.m19022P0()     // Catch:{ IOException -> 0x0224 }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r15, r13)     // Catch:{ IOException -> 0x0224 }
            g.d.a.c.f.f.d1$a r15 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.C4500a) r15     // Catch:{ IOException -> 0x0224 }
            g.d.a.c.f.f.l8 r13 = r15.mo14350h()     // Catch:{ IOException -> 0x0224 }
            g.d.a.c.f.f.z6 r13 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r13     // Catch:{ IOException -> 0x0224 }
            g.d.a.c.f.f.d1 r13 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r13     // Catch:{ IOException -> 0x0224 }
            boolean r15 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x0242 }
            if (r15 == 0) goto L_0x015e
            com.google.android.gms.measurement.internal.c4 r15 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x0242 }
            com.google.android.gms.measurement.internal.e4 r15 = r15.mo6767H()     // Catch:{ SQLiteException -> 0x0242 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            r25 = r4
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ SQLiteException -> 0x023f }
            r15.mo6886b(r14, r4)     // Catch:{ SQLiteException -> 0x023f }
            goto L_0x0160
        L_0x015e:
            r25 = r4
        L_0x0160:
            r6.close()     // Catch:{ SQLiteException -> 0x023f }
            r5.mo6897b(r13)     // Catch:{ SQLiteException -> 0x023f }
            r13 = -1
            int r4 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0183
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x023f }
            r13 = 0
            r14[r13] = r11     // Catch:{ SQLiteException -> 0x023f }
            r13 = 1
            r14[r13] = r12     // Catch:{ SQLiteException -> 0x023f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x023f }
            r9 = 2
            r14[r9] = r8     // Catch:{ SQLiteException -> 0x023f }
            r19 = r4
            r20 = r14
            goto L_0x0192
        L_0x0183:
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r8 = 2
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x023f }
            r8 = 0
            r9[r8] = r11     // Catch:{ SQLiteException -> 0x023f }
            r8 = 1
            r9[r8] = r12     // Catch:{ SQLiteException -> 0x023f }
            r19 = r4
            r20 = r9
        L_0x0192:
            java.lang.String r17 = "raw_events"
            java.lang.String r4 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r18 = new java.lang.String[]{r4, r8, r9, r12}     // Catch:{ SQLiteException -> 0x023f }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            r24 = 0
            r16 = r10
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x023f }
            boolean r6 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            if (r6 != 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.c4 r6 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6767H()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            r6.mo6886b(r8, r9)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            if (r4 == 0) goto L_0x026c
        L_0x01c7:
            r4.close()     // Catch:{ all -> 0x1009 }
            goto L_0x026c
        L_0x01cc:
            r6 = 0
            long r8 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            r6 = 3
            byte[] r10 = r4.getBlob(r6)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            g.d.a.c.f.f.z0$a r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.m20752d0()     // Catch:{ IOException -> 0x0200 }
            com.google.android.gms.measurement.internal.C1740ba.m8151z(r6, r10)     // Catch:{ IOException -> 0x0200 }
            g.d.a.c.f.f.z0$a r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r6     // Catch:{ IOException -> 0x0200 }
            r10 = 1
            java.lang.String r12 = r4.getString(r10)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            r6.mo14793C(r12)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            r10 = 2
            long r12 = r4.getLong(r10)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            r6.mo14805y(r12)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            g.d.a.c.f.f.l8 r6 = r6.mo14350h()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            g.d.a.c.f.f.z6 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r6     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            g.d.a.c.f.f.z0 r6 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r6     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            boolean r6 = r5.mo6896a(r8, r6)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            if (r6 != 0) goto L_0x0213
            if (r4 == 0) goto L_0x026c
            goto L_0x01c7
        L_0x0200:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.c4 r8 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6764E()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            r8.mo6887c(r9, r10, r6)     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
        L_0x0213:
            boolean r6 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0220, all -> 0x021c }
            if (r6 != 0) goto L_0x01cc
            if (r4 == 0) goto L_0x026c
            goto L_0x01c7
        L_0x021c:
            r0 = move-exception
            r5 = r1
            r6 = r4
            goto L_0x024f
        L_0x0220:
            r0 = move-exception
            r6 = r4
            goto L_0x00aa
        L_0x0224:
            r0 = move-exception
            r25 = r4
            r4 = r0
            com.google.android.gms.measurement.internal.c4 r8 = r7.mo6709i()     // Catch:{ SQLiteException -> 0x023f }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6764E()     // Catch:{ SQLiteException -> 0x023f }
            java.lang.String r9 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ SQLiteException -> 0x023f }
            r8.mo6887c(r9, r10, r4)     // Catch:{ SQLiteException -> 0x023f }
            if (r6 == 0) goto L_0x026c
        L_0x023b:
            r6.close()     // Catch:{ all -> 0x1009 }
            goto L_0x026c
        L_0x023f:
            r0 = move-exception
            goto L_0x00aa
        L_0x0242:
            r0 = move-exception
            r25 = r4
            goto L_0x00aa
        L_0x0247:
            r0 = move-exception
            r25 = r4
            r4 = r0
            goto L_0x0257
        L_0x024c:
            r0 = move-exception
            r5 = r1
            r6 = 0
        L_0x024f:
            r1 = r0
            goto L_0x1001
        L_0x0252:
            r0 = move-exception
            r25 = r4
            r4 = r0
            r6 = 0
        L_0x0257:
            r11 = 0
        L_0x0258:
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()     // Catch:{ all -> 0x0ffd }
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6764E()     // Catch:{ all -> 0x0ffd }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r11)     // Catch:{ all -> 0x0ffd }
            r7.mo6887c(r8, r9, r4)     // Catch:{ all -> 0x0ffd }
            if (r6 == 0) goto L_0x026c
            goto L_0x023b
        L_0x026c:
            java.util.List<g.d.a.c.f.f.z0> r4 = r5.f6546c     // Catch:{ all -> 0x1009 }
            if (r4 == 0) goto L_0x027b
            java.util.List<g.d.a.c.f.f.z0> r4 = r5.f6546c     // Catch:{ all -> 0x1009 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x1009 }
            if (r4 == 0) goto L_0x0279
            goto L_0x027b
        L_0x0279:
            r4 = 0
            goto L_0x027c
        L_0x027b:
            r4 = 1
        L_0x027c:
            if (r4 != 0) goto L_0x0fec
            g.d.a.c.f.f.d1 r4 = r5.f6544a     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r4 = r4.mo14813x()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1$a r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.C4500a) r4     // Catch:{ all -> 0x1009 }
            r4.mo13990N()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r7 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r7.mo13926U2()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C1957u.f6349V     // Catch:{ all -> 0x1009 }
            boolean r6 = r6.mo7398C(r7, r8)     // Catch:{ all -> 0x1009 }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02a4:
            java.util.List<g.d.a.c.f.f.z0> r9 = r5.f6546c     // Catch:{ all -> 0x1009 }
            int r9 = r9.size()     // Catch:{ all -> 0x1009 }
            r18 = r13
            java.lang.String r13 = "_fr"
            r19 = r2
            java.lang.String r2 = "_et"
            r20 = r14
            java.lang.String r14 = "_e"
            r21 = r6
            r22 = r7
            if (r12 >= r9) goto L_0x093c
            java.util.List<g.d.a.c.f.f.z0> r9 = r5.f6546c     // Catch:{ all -> 0x1009 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r9     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r9 = r9.mo14813x()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0$a r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r9     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.b5 r6 = r42.mo7443V()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r7 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r7.mo13926U2()     // Catch:{ all -> 0x1009 }
            r26 = r12
            java.lang.String r12 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r6 = r6.mo6721A(r7, r12)     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = "_err"
            if (r6 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6767H()     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            g.d.a.c.f.f.d1 r12 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r12.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r12)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r13 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.a4 r13 = r13.mo7025H()     // Catch:{ all -> 0x1009 }
            java.lang.String r14 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            java.lang.String r13 = r13.mo6692v(r14)     // Catch:{ all -> 0x1009 }
            r2.mo6887c(r6, r12, r13)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.b5 r2 = r42.mo7443V()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r6 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r6.mo13926U2()     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.mo6728H(r6)     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x032c
            com.google.android.gms.measurement.internal.b5 r2 = r42.mo7443V()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r6 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r6.mo13926U2()     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.mo6729I(r6)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x032a
            goto L_0x032c
        L_0x032a:
            r2 = 0
            goto L_0x032d
        L_0x032c:
            r2 = 1
        L_0x032d:
            if (r2 != 0) goto L_0x0352
            java.lang.String r2 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x0352
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.fa r27 = r2.mo7024G()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r2 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r28 = r2.mo13926U2()     // Catch:{ all -> 0x1009 }
            r29 = 11
            java.lang.String r30 = "_ev"
            java.lang.String r31 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            r32 = 0
            r27.mo6994W(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x1009 }
        L_0x0352:
            r27 = r15
            r13 = r18
            r14 = r20
            r7 = r22
            r6 = r26
            r16 = r3
            goto L_0x0930
        L_0x0360:
            boolean r6 = p148g.p189d.p190a.p232c.p241f.p247f.C4729pa.m20169b()     // Catch:{ all -> 0x1009 }
            if (r6 == 0) goto L_0x03f0
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r12 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r12.mo13926U2()     // Catch:{ all -> 0x1009 }
            r27 = r15
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C1957u.f6346T0     // Catch:{ all -> 0x1009 }
            boolean r6 = r6.mo7398C(r12, r15)     // Catch:{ all -> 0x1009 }
            if (r6 == 0) goto L_0x03f2
            java.lang.String r6 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = com.google.android.gms.measurement.internal.C1772e6.m8357a(r3)     // Catch:{ all -> 0x1009 }
            boolean r6 = r6.equals(r12)     // Catch:{ all -> 0x1009 }
            if (r6 == 0) goto L_0x03f2
            r9.mo14793C(r3)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r6 = r6.mo6772M()     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = "Renaming ad_impression to _ai"
            r6.mo6885a(r12)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()     // Catch:{ all -> 0x1009 }
            r12 = 5
            boolean r6 = r6.mo6763B(r12)     // Catch:{ all -> 0x1009 }
            if (r6 == 0) goto L_0x03f2
            r6 = 0
        L_0x03aa:
            int r12 = r9.mo14796F()     // Catch:{ all -> 0x1009 }
            if (r6 >= r12) goto L_0x03f2
            java.lang.String r12 = "ad_platform"
            g.d.a.c.f.f.b1 r15 = r9.mo14794D(r6)     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = r15.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x1009 }
            if (r12 == 0) goto L_0x03ed
            g.d.a.c.f.f.b1 r12 = r9.mo14794D(r6)     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r12.mo13815V()     // Catch:{ all -> 0x1009 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1009 }
            if (r12 != 0) goto L_0x03ed
            java.lang.String r12 = "admob"
            g.d.a.c.f.f.b1 r15 = r9.mo14794D(r6)     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = r15.mo13815V()     // Catch:{ all -> 0x1009 }
            boolean r12 = r12.equalsIgnoreCase(r15)     // Catch:{ all -> 0x1009 }
            if (r12 == 0) goto L_0x03ed
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.mo6769J()     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = "AdMob ad impression logged from app. Potentially duplicative."
            r12.mo6885a(r15)     // Catch:{ all -> 0x1009 }
        L_0x03ed:
            int r6 = r6 + 1
            goto L_0x03aa
        L_0x03f0:
            r27 = r15
        L_0x03f2:
            com.google.android.gms.measurement.internal.b5 r6 = r42.mo7443V()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r12 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r12.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r6 = r6.mo6723C(r12, r15)     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = "_c"
            if (r6 != 0) goto L_0x0463
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.common.internal.C1658o.m7841f(r15)     // Catch:{ all -> 0x1009 }
            r16 = r3
            int r3 = r15.hashCode()     // Catch:{ all -> 0x1009 }
            r29 = r10
            r10 = 94660(0x171c4, float:1.32647E-40)
            if (r3 == r10) goto L_0x043e
            r10 = 95025(0x17331, float:1.33158E-40)
            if (r3 == r10) goto L_0x0434
            r10 = 95027(0x17333, float:1.33161E-40)
            if (r3 == r10) goto L_0x042a
            goto L_0x0448
        L_0x042a:
            java.lang.String r3 = "_ui"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0448
            r3 = 1
            goto L_0x0449
        L_0x0434:
            java.lang.String r3 = "_ug"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0448
            r3 = 2
            goto L_0x0449
        L_0x043e:
            java.lang.String r3 = "_in"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0448
            r3 = 0
            goto L_0x0449
        L_0x0448:
            r3 = -1
        L_0x0449:
            if (r3 == 0) goto L_0x0453
            r10 = 1
            if (r3 == r10) goto L_0x0453
            r10 = 2
            if (r3 == r10) goto L_0x0453
            r3 = 0
            goto L_0x0454
        L_0x0453:
            r3 = 1
        L_0x0454:
            if (r3 == 0) goto L_0x0457
            goto L_0x0467
        L_0x0457:
            r30 = r2
            r31 = r4
            r32 = r11
            r10 = r13
            r11 = r14
        L_0x045f:
            r13 = r18
            goto L_0x0642
        L_0x0463:
            r16 = r3
            r29 = r10
        L_0x0467:
            r30 = r2
            r3 = 0
            r10 = 0
            r15 = 0
        L_0x046c:
            int r2 = r9.mo14796F()     // Catch:{ all -> 0x1009 }
            r31 = r4
            java.lang.String r4 = "_r"
            if (r15 >= r2) goto L_0x04d7
            g.d.a.c.f.f.b1 r2 = r9.mo14794D(r15)     // Catch:{ all -> 0x1009 }
            java.lang.String r2 = r2.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r2 = r12.equals(r2)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x04a2
            g.d.a.c.f.f.b1 r2 = r9.mo14794D(r15)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r2 = r2.mo14813x()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1.C4463a) r2     // Catch:{ all -> 0x1009 }
            r3 = 1
            r2.mo13833y(r3)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r2 = r2.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r2     // Catch:{ all -> 0x1009 }
            r9.mo14804x(r15, r2)     // Catch:{ all -> 0x1009 }
            r32 = r11
            r3 = 1
            goto L_0x04d0
        L_0x04a2:
            g.d.a.c.f.f.b1 r2 = r9.mo14794D(r15)     // Catch:{ all -> 0x1009 }
            java.lang.String r2 = r2.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x04ce
            g.d.a.c.f.f.b1 r2 = r9.mo14794D(r15)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r2 = r2.mo14813x()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1.C4463a) r2     // Catch:{ all -> 0x1009 }
            r32 = r11
            r10 = 1
            r2.mo13833y(r10)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r2 = r2.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r2     // Catch:{ all -> 0x1009 }
            r9.mo14804x(r15, r2)     // Catch:{ all -> 0x1009 }
            r10 = 1
            goto L_0x04d0
        L_0x04ce:
            r32 = r11
        L_0x04d0:
            int r15 = r15 + 1
            r4 = r31
            r11 = r32
            goto L_0x046c
        L_0x04d7:
            r32 = r11
            if (r3 != 0) goto L_0x050c
            if (r6 == 0) goto L_0x050c
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6772M()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.a4 r11 = r11.mo7025H()     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            java.lang.String r11 = r11.mo6692v(r15)     // Catch:{ all -> 0x1009 }
            r2.mo6886b(r3, r11)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4462b1.m18758g0()     // Catch:{ all -> 0x1009 }
            r2.mo13825B(r12)     // Catch:{ all -> 0x1009 }
            r3 = r13
            r11 = r14
            r13 = 1
            r2.mo13833y(r13)     // Catch:{ all -> 0x1009 }
            r9.mo14806z(r2)     // Catch:{ all -> 0x1009 }
            goto L_0x050e
        L_0x050c:
            r3 = r13
            r11 = r14
        L_0x050e:
            if (r10 != 0) goto L_0x053c
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6772M()     // Catch:{ all -> 0x1009 }
            java.lang.String r10 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.h5 r13 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.a4 r13 = r13.mo7025H()     // Catch:{ all -> 0x1009 }
            java.lang.String r14 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            java.lang.String r13 = r13.mo6692v(r14)     // Catch:{ all -> 0x1009 }
            r2.mo6886b(r10, r13)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4462b1.m18758g0()     // Catch:{ all -> 0x1009 }
            r2.mo13825B(r4)     // Catch:{ all -> 0x1009 }
            r13 = 1
            r2.mo13833y(r13)     // Catch:{ all -> 0x1009 }
            r9.mo14806z(r2)     // Catch:{ all -> 0x1009 }
        L_0x053c:
            com.google.android.gms.measurement.internal.d r33 = r42.mo7446Z()     // Catch:{ all -> 0x1009 }
            long r34 = r42.m9126o0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r2 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r36 = r2.mo13926U2()     // Catch:{ all -> 0x1009 }
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 1
            com.google.android.gms.measurement.internal.g r2 = r33.mo6808C(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x1009 }
            long r13 = r2.f5832e     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r10 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r10 = r10.mo13926U2()     // Catch:{ all -> 0x1009 }
            int r2 = r2.mo7419w(r10)     // Catch:{ all -> 0x1009 }
            r10 = r3
            long r2 = (long) r2     // Catch:{ all -> 0x1009 }
            int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r15 <= 0) goto L_0x0574
            m9122m(r9, r4)     // Catch:{ all -> 0x1009 }
            goto L_0x0576
        L_0x0574:
            r18 = 1
        L_0x0576:
            java.lang.String r2 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r2 = com.google.android.gms.measurement.internal.C1788fa.m8460d0(r2)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x045f
            if (r6 == 0) goto L_0x045f
            com.google.android.gms.measurement.internal.d r33 = r42.mo7446Z()     // Catch:{ all -> 0x1009 }
            long r34 = r42.m9126o0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r2 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r36 = r2.mo13926U2()     // Catch:{ all -> 0x1009 }
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 0
            r41 = 0
            com.google.android.gms.measurement.internal.g r2 = r33.mo6808C(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x1009 }
            long r2 = r2.f5830c     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r4 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r4 = r4.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r13 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r13 = r13.mo13926U2()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C1957u.f6380n     // Catch:{ all -> 0x1009 }
            int r4 = r4.mo7417u(r13, r14)     // Catch:{ all -> 0x1009 }
            long r13 = (long) r4     // Catch:{ all -> 0x1009 }
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x045f
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6767H()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            g.d.a.c.f.f.d1 r4 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r4 = r4.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r4)     // Catch:{ all -> 0x1009 }
            r2.mo6886b(r3, r4)     // Catch:{ all -> 0x1009 }
            r2 = -1
            r3 = 0
            r4 = 0
            r13 = 0
        L_0x05d4:
            int r14 = r9.mo14796F()     // Catch:{ all -> 0x1009 }
            if (r13 >= r14) goto L_0x05ff
            g.d.a.c.f.f.b1 r14 = r9.mo14794D(r13)     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = r14.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x1009 }
            if (r15 == 0) goto L_0x05f1
            g.d.a.c.f.f.z6$b r2 = r14.mo14813x()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1.C4463a) r2     // Catch:{ all -> 0x1009 }
            r3 = r2
            r2 = r13
            goto L_0x05fc
        L_0x05f1:
            java.lang.String r14 = r14.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r14 = r7.equals(r14)     // Catch:{ all -> 0x1009 }
            if (r14 == 0) goto L_0x05fc
            r4 = 1
        L_0x05fc:
            int r13 = r13 + 1
            goto L_0x05d4
        L_0x05ff:
            if (r4 == 0) goto L_0x0608
            if (r3 == 0) goto L_0x0608
            r9.mo14797G(r2)     // Catch:{ all -> 0x1009 }
            goto L_0x045f
        L_0x0608:
            if (r3 == 0) goto L_0x0627
            java.lang.Object r3 = r3.clone()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4897b) r3     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1$a r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1.C4463a) r3     // Catch:{ all -> 0x1009 }
            r3.mo13825B(r7)     // Catch:{ all -> 0x1009 }
            r13 = 10
            r3.mo13833y(r13)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r3 = r3.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r3     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r3     // Catch:{ all -> 0x1009 }
            r9.mo14804x(r2, r3)     // Catch:{ all -> 0x1009 }
            goto L_0x045f
        L_0x0627:
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            g.d.a.c.f.f.d1 r4 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r4 = r4.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r4)     // Catch:{ all -> 0x1009 }
            r2.mo6886b(r3, r4)     // Catch:{ all -> 0x1009 }
            goto L_0x045f
        L_0x0642:
            if (r6 == 0) goto L_0x0705
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x1009 }
            java.util.List r3 = r9.mo14795E()     // Catch:{ all -> 0x1009 }
            r2.<init>(r3)     // Catch:{ all -> 0x1009 }
            r3 = 0
            r4 = -1
            r6 = -1
        L_0x0650:
            int r7 = r2.size()     // Catch:{ all -> 0x1009 }
            java.lang.String r14 = "currency"
            java.lang.String r15 = "value"
            if (r3 >= r7) goto L_0x0680
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r7     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r7.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r7 = r15.equals(r7)     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x066c
            r4 = r3
            goto L_0x067d
        L_0x066c:
            java.lang.Object r7 = r2.get(r3)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r7     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r7.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r7 = r14.equals(r7)     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x067d
            r6 = r3
        L_0x067d:
            int r3 = r3 + 1
            goto L_0x0650
        L_0x0680:
            r3 = -1
            if (r4 == r3) goto L_0x0706
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r3     // Catch:{ all -> 0x1009 }
            boolean r3 = r3.mo13816Y()     // Catch:{ all -> 0x1009 }
            if (r3 != 0) goto L_0x06b6
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r3     // Catch:{ all -> 0x1009 }
            boolean r3 = r3.mo13820c0()     // Catch:{ all -> 0x1009 }
            if (r3 != 0) goto L_0x06b6
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6769J()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.mo6885a(r3)     // Catch:{ all -> 0x1009 }
            r9.mo14797G(r4)     // Catch:{ all -> 0x1009 }
            m9122m(r9, r12)     // Catch:{ all -> 0x1009 }
            r2 = 18
            m9120l(r9, r2, r15)     // Catch:{ all -> 0x1009 }
            goto L_0x0705
        L_0x06b6:
            r3 = -1
            if (r6 != r3) goto L_0x06bc
            r2 = 1
            r7 = 3
            goto L_0x06e8
        L_0x06bc:
            java.lang.Object r2 = r2.get(r6)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r2     // Catch:{ all -> 0x1009 }
            java.lang.String r2 = r2.mo13815V()     // Catch:{ all -> 0x1009 }
            int r6 = r2.length()     // Catch:{ all -> 0x1009 }
            r7 = 3
            if (r6 == r7) goto L_0x06cf
        L_0x06cd:
            r2 = 1
            goto L_0x06e8
        L_0x06cf:
            r6 = 0
        L_0x06d0:
            int r15 = r2.length()     // Catch:{ all -> 0x1009 }
            if (r6 >= r15) goto L_0x06e7
            int r15 = r2.codePointAt(r6)     // Catch:{ all -> 0x1009 }
            boolean r17 = java.lang.Character.isLetter(r15)     // Catch:{ all -> 0x1009 }
            if (r17 != 0) goto L_0x06e1
            goto L_0x06cd
        L_0x06e1:
            int r15 = java.lang.Character.charCount(r15)     // Catch:{ all -> 0x1009 }
            int r6 = r6 + r15
            goto L_0x06d0
        L_0x06e7:
            r2 = 0
        L_0x06e8:
            if (r2 == 0) goto L_0x0707
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6769J()     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.mo6885a(r6)     // Catch:{ all -> 0x1009 }
            r9.mo14797G(r4)     // Catch:{ all -> 0x1009 }
            m9122m(r9, r12)     // Catch:{ all -> 0x1009 }
            r2 = 19
            m9120l(r9, r2, r14)     // Catch:{ all -> 0x1009 }
            goto L_0x0707
        L_0x0705:
            r3 = -1
        L_0x0706:
            r7 = 3
        L_0x0707:
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r4 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r4 = r4.mo13926U2()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C1957u.f6347U     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.mo7398C(r4, r6)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x08b2
            java.lang.String r2 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x077b
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r2 = r9.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r2 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r2, r10)     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x0773
            if (r32 == 0) goto L_0x0769
            long r14 = r32.mo14801L()     // Catch:{ all -> 0x1009 }
            long r17 = r9.mo14801L()     // Catch:{ all -> 0x1009 }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1009 }
            r17 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x0769
            java.lang.Object r2 = r32.clone()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4897b) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r2     // Catch:{ all -> 0x1009 }
            boolean r4 = r1.m9103E(r9, r2)     // Catch:{ all -> 0x1009 }
            if (r4 == 0) goto L_0x0769
            r4 = r31
            r4.mo14026x(r8, r2)     // Catch:{ all -> 0x1009 }
            r7 = r22
            r6 = r30
        L_0x0763:
            r29 = 0
            r32 = 0
            goto L_0x08b9
        L_0x0769:
            r4 = r31
            r29 = r9
            r7 = r20
            r6 = r30
            goto L_0x08b9
        L_0x0773:
            r4 = r31
            r10 = r22
            r6 = r30
            goto L_0x08b8
        L_0x077b:
            r4 = r31
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x07d4
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r2 = r9.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r2     // Catch:{ all -> 0x1009 }
            r6 = r30
            g.d.a.c.f.f.b1 r2 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r2, r6)     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x07d0
            if (r29 == 0) goto L_0x07c7
            long r14 = r29.mo14801L()     // Catch:{ all -> 0x1009 }
            long r17 = r9.mo14801L()     // Catch:{ all -> 0x1009 }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1009 }
            r17 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x07c7
            java.lang.Object r2 = r29.clone()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4897b) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r2     // Catch:{ all -> 0x1009 }
            boolean r10 = r1.m9103E(r2, r9)     // Catch:{ all -> 0x1009 }
            if (r10 == 0) goto L_0x07c7
            r10 = r22
            r4.mo14026x(r10, r2)     // Catch:{ all -> 0x1009 }
            r7 = r10
            goto L_0x0763
        L_0x07c7:
            r10 = r22
            r32 = r9
            r7 = r10
            r8 = r20
            goto L_0x08b9
        L_0x07d0:
            r10 = r22
            goto L_0x08b8
        L_0x07d4:
            r10 = r22
            r6 = r30
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r12 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r12.mo13926U2()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C1957u.f6383o0     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.mo7398C(r12, r14)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x08b8
            java.lang.String r2 = "_ab"
            java.lang.String r12 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x08b8
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r2 = r9.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r2 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r2, r6)     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x08b8
            if (r29 == 0) goto L_0x08b8
            long r14 = r29.mo14801L()     // Catch:{ all -> 0x1009 }
            long r17 = r9.mo14801L()     // Catch:{ all -> 0x1009 }
            long r14 = r14 - r17
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1009 }
            r17 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x08b8
            java.lang.Object r2 = r29.clone()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6$b r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6.C4897b) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0$a r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r2     // Catch:{ all -> 0x1009 }
            r1.m9111N(r2, r9)     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r2.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r12 = r11.equals(r12)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.common.internal.C1658o.m7836a(r12)     // Catch:{ all -> 0x1009 }
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r12 = r2.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r12 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r12     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r12 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r12     // Catch:{ all -> 0x1009 }
            java.lang.String r14 = "_sn"
            g.d.a.c.f.f.b1 r12 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r12, r14)     // Catch:{ all -> 0x1009 }
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r14 = r2.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r14 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r14     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r14 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r14     // Catch:{ all -> 0x1009 }
            java.lang.String r15 = "_sc"
            g.d.a.c.f.f.b1 r14 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r14, r15)     // Catch:{ all -> 0x1009 }
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r15 = r2.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r15 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r15     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r15 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r15     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "_si"
            g.d.a.c.f.f.b1 r3 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r15, r3)     // Catch:{ all -> 0x1009 }
            if (r12 == 0) goto L_0x086f
            java.lang.String r12 = r12.mo13815V()     // Catch:{ all -> 0x1009 }
            goto L_0x0871
        L_0x086f:
            r12 = r25
        L_0x0871:
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x1009 }
            if (r15 != 0) goto L_0x0880
            com.google.android.gms.measurement.internal.ba r15 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = "_sn"
            r15.mo6750H(r9, r7, r12)     // Catch:{ all -> 0x1009 }
        L_0x0880:
            if (r14 == 0) goto L_0x0887
            java.lang.String r7 = r14.mo13815V()     // Catch:{ all -> 0x1009 }
            goto L_0x0889
        L_0x0887:
            r7 = r25
        L_0x0889:
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x1009 }
            if (r12 != 0) goto L_0x0898
            com.google.android.gms.measurement.internal.ba r12 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            java.lang.String r14 = "_sc"
            r12.mo6750H(r9, r14, r7)     // Catch:{ all -> 0x1009 }
        L_0x0898:
            if (r3 == 0) goto L_0x08ab
            com.google.android.gms.measurement.internal.ba r7 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = "_si"
            long r14 = r3.mo13817Z()     // Catch:{ all -> 0x1009 }
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1009 }
            r7.mo6750H(r9, r12, r3)     // Catch:{ all -> 0x1009 }
        L_0x08ab:
            r4.mo14026x(r10, r2)     // Catch:{ all -> 0x1009 }
            r7 = r10
            r29 = 0
            goto L_0x08b9
        L_0x08b2:
            r10 = r22
            r6 = r30
            r4 = r31
        L_0x08b8:
            r7 = r10
        L_0x08b9:
            if (r21 != 0) goto L_0x0918
            java.lang.String r2 = r9.mo14800K()     // Catch:{ all -> 0x1009 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x0918
            int r2 = r9.mo14796F()     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x08e5
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6767H()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Engagement event does not contain any parameters. appId"
            g.d.a.c.f.f.d1 r6 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r6.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r6)     // Catch:{ all -> 0x1009 }
        L_0x08e1:
            r2.mo6886b(r3, r6)     // Catch:{ all -> 0x1009 }
            goto L_0x0918
        L_0x08e5:
            com.google.android.gms.measurement.internal.ba r2 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r3 = r9.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r3     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r3     // Catch:{ all -> 0x1009 }
            java.lang.Object r2 = r2.mo6754U(r3, r6)     // Catch:{ all -> 0x1009 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x1009 }
            if (r2 != 0) goto L_0x0910
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6767H()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Engagement event does not include duration. appId"
            g.d.a.c.f.f.d1 r6 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r6.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r6)     // Catch:{ all -> 0x1009 }
            goto L_0x08e1
        L_0x0910:
            long r2 = r2.longValue()     // Catch:{ all -> 0x1009 }
            long r2 = r27 + r2
            r27 = r2
        L_0x0918:
            java.util.List<g.d.a.c.f.f.z0> r2 = r5.f6546c     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r3 = r9.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r3     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r3 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r3     // Catch:{ all -> 0x1009 }
            r6 = r26
            r2.set(r6, r3)     // Catch:{ all -> 0x1009 }
            int r14 = r20 + 1
            r4.mo13965A(r9)     // Catch:{ all -> 0x1009 }
            r10 = r29
            r11 = r32
        L_0x0930:
            int r12 = r6 + 1
            r3 = r16
            r2 = r19
            r6 = r21
            r15 = r27
            goto L_0x02a4
        L_0x093c:
            r6 = r2
            r10 = r13
            r11 = r14
            r27 = r15
            if (r21 == 0) goto L_0x0998
            r14 = r20
            r15 = r27
            r2 = 0
        L_0x0948:
            if (r2 >= r14) goto L_0x0996
            g.d.a.c.f.f.z0 r3 = r4.mo13982J(r2)     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r3.mo14784W()     // Catch:{ all -> 0x1009 }
            boolean r7 = r11.equals(r7)     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x0969
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r7 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r3, r10)     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x0969
            r4.mo13992O(r2)     // Catch:{ all -> 0x1009 }
            int r14 = r14 + -1
            int r2 = r2 + -1
            goto L_0x0993
        L_0x0969:
            r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r3 = com.google.android.gms.measurement.internal.C1740ba.m8150y(r3, r6)     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0993
            boolean r7 = r3.mo13816Y()     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x0981
            long r7 = r3.mo13817Z()     // Catch:{ all -> 0x1009 }
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x1009 }
            goto L_0x0982
        L_0x0981:
            r3 = 0
        L_0x0982:
            if (r3 == 0) goto L_0x0993
            long r7 = r3.longValue()     // Catch:{ all -> 0x1009 }
            r12 = 0
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x0993
            long r7 = r3.longValue()     // Catch:{ all -> 0x1009 }
            long r15 = r15 + r7
        L_0x0993:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x0948
        L_0x0996:
            r2 = r15
            goto L_0x099a
        L_0x0998:
            r2 = r27
        L_0x099a:
            r6 = 0
            r1.m9125o(r4, r2, r6)     // Catch:{ all -> 0x1009 }
            java.util.List r6 = r4.mo13977G()     // Catch:{ all -> 0x1009 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x1009 }
        L_0x09a6:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x09c0
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r7     // Catch:{ all -> 0x1009 }
            java.lang.String r8 = "_s"
            java.lang.String r7 = r7.mo14784W()     // Catch:{ all -> 0x1009 }
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x09a6
            r6 = 1
            goto L_0x09c1
        L_0x09c0:
            r6 = 0
        L_0x09c1:
            java.lang.String r7 = "_se"
            if (r6 == 0) goto L_0x09d0
            com.google.android.gms.measurement.internal.d r6 = r42.mo7446Z()     // Catch:{ all -> 0x1009 }
            java.lang.String r8 = r4.mo14025w0()     // Catch:{ all -> 0x1009 }
            r6.mo6834l0(r8, r7)     // Catch:{ all -> 0x1009 }
        L_0x09d0:
            java.lang.String r6 = "_sid"
            int r6 = com.google.android.gms.measurement.internal.C1740ba.m8149u(r4, r6)     // Catch:{ all -> 0x1009 }
            if (r6 < 0) goto L_0x09da
            r6 = 1
            goto L_0x09db
        L_0x09da:
            r6 = 0
        L_0x09db:
            if (r6 == 0) goto L_0x09e2
            r6 = 1
            r1.m9125o(r4, r2, r6)     // Catch:{ all -> 0x1009 }
            goto L_0x0a04
        L_0x09e2:
            int r2 = com.google.android.gms.measurement.internal.C1740ba.m8149u(r4, r7)     // Catch:{ all -> 0x1009 }
            if (r2 < 0) goto L_0x0a04
            r4.mo14003b0(r2)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            g.d.a.c.f.f.d1 r6 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r6.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r6)     // Catch:{ all -> 0x1009 }
            r2.mo6886b(r3, r6)     // Catch:{ all -> 0x1009 }
        L_0x0a04:
            com.google.android.gms.measurement.internal.ba r2 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r3 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6772M()     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = "Checking account type status for ad personalization signals"
            r3.mo6885a(r6)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.b5 r3 = r2.mo7385p()     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r4.mo14025w0()     // Catch:{ all -> 0x1009 }
            boolean r3 = r3.mo6726F(r6)     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0a92
            com.google.android.gms.measurement.internal.d r3 = r2.mo7384o()     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = r4.mo14025w0()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.f4 r3 = r3.mo6832j0(r6)     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0a92
            boolean r3 = r3.mo6946l()     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0a92
            com.google.android.gms.measurement.internal.m r3 = r2.mo6704c()     // Catch:{ all -> 0x1009 }
            boolean r3 = r3.mo7236y()     // Catch:{ all -> 0x1009 }
            if (r3 == 0) goto L_0x0a92
            com.google.android.gms.measurement.internal.c4 r3 = r2.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6771L()     // Catch:{ all -> 0x1009 }
            java.lang.String r6 = "Turning off ad personalization due to account type"
            r3.mo6885a(r6)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.h1$a r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4574h1.m19556a0()     // Catch:{ all -> 0x1009 }
            r6 = r19
            r3.mo14219z(r6)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.m r2 = r2.mo6704c()     // Catch:{ all -> 0x1009 }
            long r7 = r2.mo7234w()     // Catch:{ all -> 0x1009 }
            r3.mo14218y(r7)     // Catch:{ all -> 0x1009 }
            r7 = 1
            r3.mo14213B(r7)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r2 = r3.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r2     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.h1 r2 = (p148g.p189d.p190a.p232c.p241f.p247f.C4574h1) r2     // Catch:{ all -> 0x1009 }
            r3 = 0
        L_0x0a70:
            int r7 = r4.mo14002a0()     // Catch:{ all -> 0x1009 }
            if (r3 >= r7) goto L_0x0a8c
            g.d.a.c.f.f.h1 r7 = r4.mo14000Y(r3)     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r7.mo14205R()     // Catch:{ all -> 0x1009 }
            boolean r7 = r6.equals(r7)     // Catch:{ all -> 0x1009 }
            if (r7 == 0) goto L_0x0a89
            r4.mo14028y(r3, r2)     // Catch:{ all -> 0x1009 }
            r3 = 1
            goto L_0x0a8d
        L_0x0a89:
            int r3 = r3 + 1
            goto L_0x0a70
        L_0x0a8c:
            r3 = 0
        L_0x0a8d:
            if (r3 != 0) goto L_0x0a92
            r4.mo13969C(r2)     // Catch:{ all -> 0x1009 }
        L_0x0a92:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.mo13984K(r2)     // Catch:{ all -> 0x1009 }
            r2 = -9223372036854775808
            r4.mo13994P(r2)     // Catch:{ all -> 0x1009 }
            r2 = 0
        L_0x0aa0:
            int r3 = r4.mo13980I()     // Catch:{ all -> 0x1009 }
            if (r2 >= r3) goto L_0x0ad3
            g.d.a.c.f.f.z0 r3 = r4.mo13982J(r2)     // Catch:{ all -> 0x1009 }
            long r6 = r3.mo14786Y()     // Catch:{ all -> 0x1009 }
            long r8 = r4.mo14006e0()     // Catch:{ all -> 0x1009 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0abd
            long r6 = r3.mo14786Y()     // Catch:{ all -> 0x1009 }
            r4.mo13984K(r6)     // Catch:{ all -> 0x1009 }
        L_0x0abd:
            long r6 = r3.mo14786Y()     // Catch:{ all -> 0x1009 }
            long r8 = r4.mo14010i0()     // Catch:{ all -> 0x1009 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0ad0
            long r6 = r3.mo14786Y()     // Catch:{ all -> 0x1009 }
            r4.mo13994P(r6)     // Catch:{ all -> 0x1009 }
        L_0x0ad0:
            int r2 = r2 + 1
            goto L_0x0aa0
        L_0x0ad3:
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4532ee.m19350b()     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x0aee
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = r4.mo14025w0()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C1957u.f6336O0     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.mo7398C(r3, r6)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x0aee
            r4.mo13987L0()     // Catch:{ all -> 0x1009 }
        L_0x0aee:
            r4.mo13983J0()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.ma r6 = r42.mo7448b0()     // Catch:{ all -> 0x1009 }
            java.lang.String r7 = r4.mo14025w0()     // Catch:{ all -> 0x1009 }
            java.util.List r8 = r4.mo13977G()     // Catch:{ all -> 0x1009 }
            java.util.List r9 = r4.mo14001Z()     // Catch:{ all -> 0x1009 }
            long r2 = r4.mo14006e0()     // Catch:{ all -> 0x1009 }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1009 }
            long r2 = r4.mo14010i0()     // Catch:{ all -> 0x1009 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1009 }
            java.util.List r2 = r6.mo7242v(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x1009 }
            r4.mo13995R(r2)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r3 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r3 = r3.mo13926U2()     // Catch:{ all -> 0x1009 }
            boolean r2 = r2.mo7405K(r3)     // Catch:{ all -> 0x1009 }
            if (r2 == 0) goto L_0x0e5e
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0fe8 }
            r2.<init>()     // Catch:{ all -> 0x0fe8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0fe8 }
            r3.<init>()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.fa r6 = r6.mo7024G()     // Catch:{ all -> 0x0fe8 }
            java.security.SecureRandom r6 = r6.mo6978H0()     // Catch:{ all -> 0x0fe8 }
            r7 = 0
        L_0x0b3f:
            int r8 = r4.mo13980I()     // Catch:{ all -> 0x0fe8 }
            if (r7 >= r8) goto L_0x0e26
            g.d.a.c.f.f.z0 r8 = r4.mo13982J(r7)     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z6$b r8 = r8.mo14813x()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z0$a r8 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0.C4889a) r8     // Catch:{ all -> 0x0fe8 }
            java.lang.String r9 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0fe8 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0bd3
            com.google.android.gms.measurement.internal.ba r9 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r11 = r8.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r11     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r11 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r11     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = r9.mo6754U(r11, r12)     // Catch:{ all -> 0x1009 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x1009 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.o r11 = (com.google.android.gms.measurement.internal.C1885o) r11     // Catch:{ all -> 0x1009 }
            if (r11 != 0) goto L_0x0b8a
            com.google.android.gms.measurement.internal.d r11 = r42.mo7446Z()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r12 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r12.mo13926U2()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.o r11 = r11.mo6810D(r12, r9)     // Catch:{ all -> 0x1009 }
            r2.put(r9, r11)     // Catch:{ all -> 0x1009 }
        L_0x0b8a:
            java.lang.Long r9 = r11.f6098i     // Catch:{ all -> 0x1009 }
            if (r9 != 0) goto L_0x0bc9
            java.lang.Long r9 = r11.f6099j     // Catch:{ all -> 0x1009 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x1009 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0ba3
            com.google.android.gms.measurement.internal.ba r9 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            java.lang.Long r12 = r11.f6099j     // Catch:{ all -> 0x1009 }
            r9.mo6750H(r8, r10, r12)     // Catch:{ all -> 0x1009 }
        L_0x0ba3:
            java.lang.Boolean r9 = r11.f6100k     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0bbe
            java.lang.Boolean r9 = r11.f6100k     // Catch:{ all -> 0x1009 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0bbe
            com.google.android.gms.measurement.internal.ba r9 = r42.mo7450d0()     // Catch:{ all -> 0x1009 }
            java.lang.String r10 = "_efs"
            r11 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x1009 }
            r9.mo6750H(r8, r10, r13)     // Catch:{ all -> 0x1009 }
        L_0x0bbe:
            g.d.a.c.f.f.l8 r9 = r8.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r9     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r9     // Catch:{ all -> 0x1009 }
            r3.add(r9)     // Catch:{ all -> 0x1009 }
        L_0x0bc9:
            r4.mo14026x(r7, r8)     // Catch:{ all -> 0x1009 }
        L_0x0bcc:
            r43 = r5
            r19 = r6
            r5 = r2
            goto L_0x0e1b
        L_0x0bd3:
            com.google.android.gms.measurement.internal.b5 r9 = r42.mo7443V()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.d1 r11 = r5.f6544a     // Catch:{ all -> 0x0fe8 }
            java.lang.String r11 = r11.mo13926U2()     // Catch:{ all -> 0x0fe8 }
            long r11 = r9.mo6727G(r11)     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ all -> 0x0fe8 }
            r9.mo7024G()     // Catch:{ all -> 0x0fe8 }
            long r13 = r8.mo14801L()     // Catch:{ all -> 0x0fe8 }
            long r13 = com.google.android.gms.measurement.internal.C1788fa.m8470w(r13, r11)     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.l8 r9 = r8.mo14350h()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z6 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r9     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z0 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r9     // Catch:{ all -> 0x0fe8 }
            java.lang.String r15 = "_dbg"
            r19 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0fe8 }
            boolean r12 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0fe8 }
            if (r12 != 0) goto L_0x0c60
            if (r11 != 0) goto L_0x0c09
            goto L_0x0c60
        L_0x0c09:
            java.util.List r9 = r9.mo14782C()     // Catch:{ all -> 0x1009 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x1009 }
        L_0x0c11:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x1009 }
            if (r12 == 0) goto L_0x0c60
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.b1 r12 = (p148g.p189d.p190a.p232c.p241f.p247f.C4462b1) r12     // Catch:{ all -> 0x1009 }
            r43 = r9
            java.lang.String r9 = r12.mo13813N()     // Catch:{ all -> 0x1009 }
            boolean r9 = r15.equals(r9)     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0c5d
            boolean r9 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0c3b
            long r15 = r12.mo13817Z()     // Catch:{ all -> 0x1009 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x1009 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1009 }
            if (r9 != 0) goto L_0x0c5b
        L_0x0c3b:
            boolean r9 = r11 instanceof java.lang.String     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0c49
            java.lang.String r9 = r12.mo13815V()     // Catch:{ all -> 0x1009 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1009 }
            if (r9 != 0) goto L_0x0c5b
        L_0x0c49:
            boolean r9 = r11 instanceof java.lang.Double     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0c60
            double r15 = r12.mo13821d0()     // Catch:{ all -> 0x1009 }
            java.lang.Double r9 = java.lang.Double.valueOf(r15)     // Catch:{ all -> 0x1009 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1009 }
            if (r9 == 0) goto L_0x0c60
        L_0x0c5b:
            r9 = 1
            goto L_0x0c61
        L_0x0c5d:
            r9 = r43
            goto L_0x0c11
        L_0x0c60:
            r9 = 0
        L_0x0c61:
            if (r9 != 0) goto L_0x0c76
            com.google.android.gms.measurement.internal.b5 r9 = r42.mo7443V()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.d1 r11 = r5.f6544a     // Catch:{ all -> 0x1009 }
            java.lang.String r11 = r11.mo13926U2()     // Catch:{ all -> 0x1009 }
            java.lang.String r12 = r8.mo14800K()     // Catch:{ all -> 0x1009 }
            int r9 = r9.mo6724D(r11, r12)     // Catch:{ all -> 0x1009 }
            goto L_0x0c77
        L_0x0c76:
            r9 = 1
        L_0x0c77:
            if (r9 > 0) goto L_0x0c9d
            com.google.android.gms.measurement.internal.h5 r10 = r1.f6528j     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.c4 r10 = r10.mo6709i()     // Catch:{ all -> 0x1009 }
            com.google.android.gms.measurement.internal.e4 r10 = r10.mo6767H()     // Catch:{ all -> 0x1009 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.mo14800K()     // Catch:{ all -> 0x1009 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1009 }
            r10.mo6887c(r11, r12, r9)     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.l8 r9 = r8.mo14350h()     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z6 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r9     // Catch:{ all -> 0x1009 }
            g.d.a.c.f.f.z0 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r9     // Catch:{ all -> 0x1009 }
            r3.add(r9)     // Catch:{ all -> 0x1009 }
            goto L_0x0bc9
        L_0x0c9d:
            java.lang.String r11 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.o r11 = (com.google.android.gms.measurement.internal.C1885o) r11     // Catch:{ all -> 0x0fe8 }
            if (r11 != 0) goto L_0x0cfb
            com.google.android.gms.measurement.internal.d r11 = r42.mo7446Z()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.d1 r12 = r5.f6544a     // Catch:{ all -> 0x0fe8 }
            java.lang.String r12 = r12.mo13926U2()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r15 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.o r11 = r11.mo6810D(r12, r15)     // Catch:{ all -> 0x0fe8 }
            if (r11 != 0) goto L_0x0cfb
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo6709i()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.e4 r11 = r11.mo6767H()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            g.d.a.c.f.f.d1 r15 = r5.f6544a     // Catch:{ all -> 0x0fe8 }
            java.lang.String r15 = r15.mo13926U2()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r1 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            r11.mo6887c(r12, r15, r1)     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.o r11 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.d1 r1 = r5.f6544a     // Catch:{ all -> 0x0fe8 }
            java.lang.String r26 = r1.mo13926U2()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r27 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            r28 = 1
            r30 = 1
            r32 = 1
            long r34 = r8.mo14801L()     // Catch:{ all -> 0x0fe8 }
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r25 = r11
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0fe8 }
        L_0x0cfb:
            com.google.android.gms.measurement.internal.ba r1 = r42.mo7450d0()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.l8 r12 = r8.mo14350h()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z6 r12 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r12     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z0 r12 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r12     // Catch:{ all -> 0x0fe8 }
            java.lang.String r15 = "_eid"
            java.lang.Object r1 = r1.mo6754U(r12, r15)     // Catch:{ all -> 0x0fe8 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0fe8 }
            if (r1 == 0) goto L_0x0d13
            r12 = 1
            goto L_0x0d14
        L_0x0d13:
            r12 = 0
        L_0x0d14:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0fe8 }
            r15 = 1
            if (r9 != r15) goto L_0x0d49
            g.d.a.c.f.f.l8 r1 = r8.mo14350h()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z6 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r1     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z0 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r1     // Catch:{ all -> 0x0fe8 }
            r3.add(r1)     // Catch:{ all -> 0x0fe8 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe8 }
            if (r1 == 0) goto L_0x0d44
            java.lang.Long r1 = r11.f6098i     // Catch:{ all -> 0x0fe8 }
            if (r1 != 0) goto L_0x0d38
            java.lang.Long r1 = r11.f6099j     // Catch:{ all -> 0x0fe8 }
            if (r1 != 0) goto L_0x0d38
            java.lang.Boolean r1 = r11.f6100k     // Catch:{ all -> 0x0fe8 }
            if (r1 == 0) goto L_0x0d44
        L_0x0d38:
            r1 = 0
            com.google.android.gms.measurement.internal.o r9 = r11.mo7264c(r1, r1, r1)     // Catch:{ all -> 0x0fe8 }
            java.lang.String r1 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0fe8 }
        L_0x0d44:
            r4.mo14026x(r7, r8)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0bcc
        L_0x0d49:
            int r15 = r6.nextInt(r9)     // Catch:{ all -> 0x0fe8 }
            if (r15 != 0) goto L_0x0d8c
            com.google.android.gms.measurement.internal.ba r1 = r42.mo7450d0()     // Catch:{ all -> 0x0fe8 }
            r43 = r5
            r15 = r6
            long r5 = (long) r9     // Catch:{ all -> 0x0fe8 }
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe8 }
            r1.mo6750H(r8, r10, r9)     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.l8 r1 = r8.mo14350h()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z6 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r1     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z0 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r1     // Catch:{ all -> 0x0fe8 }
            r3.add(r1)     // Catch:{ all -> 0x0fe8 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe8 }
            if (r1 == 0) goto L_0x0d78
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe8 }
            r5 = 0
            com.google.android.gms.measurement.internal.o r11 = r11.mo7264c(r5, r1, r5)     // Catch:{ all -> 0x0fe8 }
        L_0x0d78:
            java.lang.String r1 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            long r5 = r8.mo14801L()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.o r5 = r11.mo7263b(r5, r13)     // Catch:{ all -> 0x0fe8 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0fe8 }
            r5 = r2
            r19 = r15
            goto L_0x0e18
        L_0x0d8c:
            r43 = r5
            r15 = r6
            java.lang.Long r5 = r11.f6097h     // Catch:{ all -> 0x0fe8 }
            if (r5 == 0) goto L_0x0d9e
            java.lang.Long r5 = r11.f6097h     // Catch:{ all -> 0x0fe8 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0fe8 }
            r17 = r1
            r16 = r2
            goto L_0x0db3
        L_0x0d9e:
            r5 = r42
            com.google.android.gms.measurement.internal.h5 r6 = r5.f6528j     // Catch:{ all -> 0x0fe8 }
            r6.mo7024G()     // Catch:{ all -> 0x0fe8 }
            long r5 = r8.mo14802M()     // Catch:{ all -> 0x0fe8 }
            r17 = r1
            r16 = r2
            r1 = r19
            long r5 = com.google.android.gms.measurement.internal.C1788fa.m8470w(r5, r1)     // Catch:{ all -> 0x0fe8 }
        L_0x0db3:
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0e02
            com.google.android.gms.measurement.internal.ba r1 = r42.mo7450d0()     // Catch:{ all -> 0x0fe8 }
            java.lang.String r2 = "_efs"
            r19 = r15
            r5 = 1
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe8 }
            r1.mo6750H(r8, r2, r15)     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.ba r1 = r42.mo7450d0()     // Catch:{ all -> 0x0fe8 }
            long r5 = (long) r9     // Catch:{ all -> 0x0fe8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe8 }
            r1.mo6750H(r8, r10, r2)     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.l8 r1 = r8.mo14350h()     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z6 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r1     // Catch:{ all -> 0x0fe8 }
            g.d.a.c.f.f.z0 r1 = (p148g.p189d.p190a.p232c.p241f.p247f.C4888z0) r1     // Catch:{ all -> 0x0fe8 }
            r3.add(r1)     // Catch:{ all -> 0x0fe8 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe8 }
            if (r1 == 0) goto L_0x0df0
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0fe8 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0fe8 }
            r5 = 0
            com.google.android.gms.measurement.internal.o r11 = r11.mo7264c(r5, r1, r2)     // Catch:{ all -> 0x0fe8 }
        L_0x0df0:
            java.lang.String r1 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            long r5 = r8.mo14801L()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.o r2 = r11.mo7263b(r5, r13)     // Catch:{ all -> 0x0fe8 }
            r5 = r16
        L_0x0dfe:
            r5.put(r1, r2)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0e18
        L_0x0e02:
            r19 = r15
            r5 = r16
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0fe8 }
            if (r1 == 0) goto L_0x0e18
            java.lang.String r1 = r8.mo14800K()     // Catch:{ all -> 0x0fe8 }
            r2 = r17
            r6 = 0
            com.google.android.gms.measurement.internal.o r2 = r11.mo7264c(r2, r6, r6)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0dfe
        L_0x0e18:
            r4.mo14026x(r7, r8)     // Catch:{ all -> 0x0fe8 }
        L_0x0e1b:
            int r7 = r7 + 1
            r1 = r42
            r2 = r5
            r6 = r19
            r5 = r43
            goto L_0x0b3f
        L_0x0e26:
            r43 = r5
            r5 = r2
            int r1 = r3.size()     // Catch:{ all -> 0x0fe8 }
            int r2 = r4.mo13980I()     // Catch:{ all -> 0x0fe8 }
            if (r1 >= r2) goto L_0x0e39
            r4.mo13990N()     // Catch:{ all -> 0x0fe8 }
            r4.mo13971D(r3)     // Catch:{ all -> 0x0fe8 }
        L_0x0e39:
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0fe8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0fe8 }
        L_0x0e41:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0fe8 }
            if (r2 == 0) goto L_0x0e5b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0fe8 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.d r3 = r42.mo7446Z()     // Catch:{ all -> 0x0fe8 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.o r2 = (com.google.android.gms.measurement.internal.C1885o) r2     // Catch:{ all -> 0x0fe8 }
            r3.mo6822N(r2)     // Catch:{ all -> 0x0fe8 }
            goto L_0x0e41
        L_0x0e5b:
            r1 = r43
            goto L_0x0e5f
        L_0x0e5e:
            r1 = r5
        L_0x0e5f:
            g.d.a.c.f.f.d1 r2 = r1.f6544a     // Catch:{ all -> 0x0fe8 }
            java.lang.String r2 = r2.mo13926U2()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.d r3 = r42.mo7446Z()     // Catch:{ all -> 0x0fe8 }
            com.google.android.gms.measurement.internal.f4 r3 = r3.mo6832j0(r2)     // Catch:{ all -> 0x0fe8 }
            r5 = r42
            if (r3 != 0) goto L_0x0e8b
            com.google.android.gms.measurement.internal.h5 r3 = r5.f6528j     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x1007 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            g.d.a.c.f.f.d1 r7 = r1.f6544a     // Catch:{ all -> 0x1007 }
            java.lang.String r7 = r7.mo13926U2()     // Catch:{ all -> 0x1007 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r7)     // Catch:{ all -> 0x1007 }
            r3.mo6886b(r6, r7)     // Catch:{ all -> 0x1007 }
            goto L_0x0ee6
        L_0x0e8b:
            int r6 = r4.mo13980I()     // Catch:{ all -> 0x1007 }
            if (r6 <= 0) goto L_0x0ee6
            long r6 = r3.mo6915R()     // Catch:{ all -> 0x1007 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0e9f
            r4.mo14004c0(r6)     // Catch:{ all -> 0x1007 }
            goto L_0x0ea2
        L_0x0e9f:
            r4.mo14018q0()     // Catch:{ all -> 0x1007 }
        L_0x0ea2:
            long r8 = r3.mo6913P()     // Catch:{ all -> 0x1007 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0ead
            goto L_0x0eae
        L_0x0ead:
            r6 = r8
        L_0x0eae:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0eb6
            r4.mo13997U(r6)     // Catch:{ all -> 0x1007 }
            goto L_0x0eb9
        L_0x0eb6:
            r4.mo14014m0()     // Catch:{ all -> 0x1007 }
        L_0x0eb9:
            r3.mo6941i0()     // Catch:{ all -> 0x1007 }
            long r6 = r3.mo6935f0()     // Catch:{ all -> 0x1007 }
            int r7 = (int) r6     // Catch:{ all -> 0x1007 }
            r4.mo14011j0(r7)     // Catch:{ all -> 0x1007 }
            long r6 = r4.mo14006e0()     // Catch:{ all -> 0x1007 }
            r3.mo6924a(r6)     // Catch:{ all -> 0x1007 }
            long r6 = r4.mo14010i0()     // Catch:{ all -> 0x1007 }
            r3.mo6953q(r6)     // Catch:{ all -> 0x1007 }
            java.lang.String r6 = r3.mo6942j()     // Catch:{ all -> 0x1007 }
            if (r6 == 0) goto L_0x0edc
            r4.mo14024v0(r6)     // Catch:{ all -> 0x1007 }
            goto L_0x0edf
        L_0x0edc:
            r4.mo13976F0()     // Catch:{ all -> 0x1007 }
        L_0x0edf:
            com.google.android.gms.measurement.internal.d r6 = r42.mo7446Z()     // Catch:{ all -> 0x1007 }
            r6.mo6823O(r3)     // Catch:{ all -> 0x1007 }
        L_0x0ee6:
            int r3 = r4.mo13980I()     // Catch:{ all -> 0x1007 }
            if (r3 <= 0) goto L_0x0f47
            com.google.android.gms.measurement.internal.b5 r3 = r42.mo7443V()     // Catch:{ all -> 0x1007 }
            g.d.a.c.f.f.d1 r6 = r1.f6544a     // Catch:{ all -> 0x1007 }
            java.lang.String r6 = r6.mo13926U2()     // Catch:{ all -> 0x1007 }
            g.d.a.c.f.f.t0 r3 = r3.mo6731u(r6)     // Catch:{ all -> 0x1007 }
            if (r3 == 0) goto L_0x0f0b
            boolean r6 = r3.mo14638F()     // Catch:{ all -> 0x1007 }
            if (r6 != 0) goto L_0x0f03
            goto L_0x0f0b
        L_0x0f03:
            long r6 = r3.mo14639G()     // Catch:{ all -> 0x1007 }
            r4.mo14020s0(r6)     // Catch:{ all -> 0x1007 }
            goto L_0x0f36
        L_0x0f0b:
            g.d.a.c.f.f.d1 r3 = r1.f6544a     // Catch:{ all -> 0x1007 }
            java.lang.String r3 = r3.mo13945k0()     // Catch:{ all -> 0x1007 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x1007 }
            if (r3 == 0) goto L_0x0f1d
            r6 = -1
            r4.mo14020s0(r6)     // Catch:{ all -> 0x1007 }
            goto L_0x0f36
        L_0x0f1d:
            com.google.android.gms.measurement.internal.h5 r3 = r5.f6528j     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6767H()     // Catch:{ all -> 0x1007 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            g.d.a.c.f.f.d1 r7 = r1.f6544a     // Catch:{ all -> 0x1007 }
            java.lang.String r7 = r7.mo13926U2()     // Catch:{ all -> 0x1007 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r7)     // Catch:{ all -> 0x1007 }
            r3.mo6886b(r6, r7)     // Catch:{ all -> 0x1007 }
        L_0x0f36:
            com.google.android.gms.measurement.internal.d r3 = r42.mo7446Z()     // Catch:{ all -> 0x1007 }
            g.d.a.c.f.f.l8 r4 = r4.mo14350h()     // Catch:{ all -> 0x1007 }
            g.d.a.c.f.f.z6 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r4     // Catch:{ all -> 0x1007 }
            g.d.a.c.f.f.d1 r4 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r4     // Catch:{ all -> 0x1007 }
            r13 = r18
            r3.mo6826R(r4, r13)     // Catch:{ all -> 0x1007 }
        L_0x0f47:
            com.google.android.gms.measurement.internal.d r3 = r42.mo7446Z()     // Catch:{ all -> 0x1007 }
            java.util.List<java.lang.Long> r1 = r1.f6545b     // Catch:{ all -> 0x1007 }
            com.google.android.gms.common.internal.C1658o.m7845j(r1)     // Catch:{ all -> 0x1007 }
            r3.mo6700b()     // Catch:{ all -> 0x1007 }
            r3.mo7366r()     // Catch:{ all -> 0x1007 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x1007 }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x1007 }
            r6 = 0
        L_0x0f5e:
            int r7 = r1.size()     // Catch:{ all -> 0x1007 }
            if (r6 >= r7) goto L_0x0f7b
            if (r6 == 0) goto L_0x0f6b
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x1007 }
        L_0x0f6b:
            java.lang.Object r7 = r1.get(r6)     // Catch:{ all -> 0x1007 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x1007 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x1007 }
            r4.append(r7)     // Catch:{ all -> 0x1007 }
            int r6 = r6 + 1
            goto L_0x0f5e
        L_0x0f7b:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x1007 }
            android.database.sqlite.SQLiteDatabase r6 = r3.mo6844v()     // Catch:{ all -> 0x1007 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x1007 }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x1007 }
            int r6 = r1.size()     // Catch:{ all -> 0x1007 }
            if (r4 == r6) goto L_0x0fae
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x1007 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x1007 }
            int r1 = r1.size()     // Catch:{ all -> 0x1007 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1007 }
            r3.mo6887c(r6, r4, r1)     // Catch:{ all -> 0x1007 }
        L_0x0fae:
            com.google.android.gms.measurement.internal.d r1 = r42.mo7446Z()     // Catch:{ all -> 0x1007 }
            android.database.sqlite.SQLiteDatabase r3 = r1.mo6844v()     // Catch:{ all -> 0x1007 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0fc5 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0fc5 }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0fc5 }
            r3.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0fc5 }
            goto L_0x0fd8
        L_0x0fc5:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()     // Catch:{ all -> 0x1007 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r2)     // Catch:{ all -> 0x1007 }
            r1.mo6887c(r4, r2, r3)     // Catch:{ all -> 0x1007 }
        L_0x0fd8:
            com.google.android.gms.measurement.internal.d r1 = r42.mo7446Z()     // Catch:{ all -> 0x1007 }
            r1.mo6842u()     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.d r1 = r42.mo7446Z()
            r1.mo6851y0()
            r1 = 1
            return r1
        L_0x0fe8:
            r0 = move-exception
            r5 = r42
            goto L_0x100b
        L_0x0fec:
            r5 = r1
            com.google.android.gms.measurement.internal.d r1 = r42.mo7446Z()     // Catch:{ all -> 0x1007 }
            r1.mo6842u()     // Catch:{ all -> 0x1007 }
            com.google.android.gms.measurement.internal.d r1 = r42.mo7446Z()
            r1.mo6851y0()
            r1 = 0
            return r1
        L_0x0ffd:
            r0 = move-exception
            r5 = r1
            goto L_0x024f
        L_0x1001:
            if (r6 == 0) goto L_0x1006
            r6.close()     // Catch:{ all -> 0x1007 }
        L_0x1006:
            throw r1     // Catch:{ all -> 0x1007 }
        L_0x1007:
            r0 = move-exception
            goto L_0x100b
        L_0x1009:
            r0 = move-exception
            r5 = r1
        L_0x100b:
            r1 = r0
            com.google.android.gms.measurement.internal.d r2 = r42.mo7446Z()
            r2.mo6851y0()
            goto L_0x1015
        L_0x1014:
            throw r1
        L_0x1015:
            goto L_0x1014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.m9104F(java.lang.String, long):boolean");
    }

    /* renamed from: G */
    private final boolean m9105G() {
        m9124n0();
        mo7453g0();
        return mo7446Z().mo6815G0() || !TextUtils.isEmpty(mo7446Z().mo6846w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018e  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9106H() {
        /*
            r21 = this;
            r0 = r21
            r21.m9124n0()
            r21.mo7453g0()
            long r1 = r0.f6531m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.common.util.e r1 = r1.mo6708g()
            long r1 = r1.mo6585a()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f6531m
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.mo6886b(r3, r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.m9121l0()
            r1.mo7253c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m9123m0()
            r1.mo7359v()
            return
        L_0x004b:
            r0.f6531m = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            boolean r1 = r1.mo7049u()
            if (r1 == 0) goto L_0x0239
            boolean r1 = r21.m9105G()
            if (r1 != 0) goto L_0x005d
            goto L_0x0239
        L_0x005d:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.common.util.e r1 = r1.mo6708g()
            long r1 = r1.mo6587c()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C1957u.f6307A
            r6 = 0
            java.lang.Object r5 = r5.mo7323a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.d r5 = r21.mo7446Z()
            boolean r5 = r5.mo6816H0()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.d r5 = r21.mo7446Z()
            boolean r5 = r5.mo6848x()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00b0
            com.google.android.gms.measurement.internal.h5 r10 = r0.f6528j
            com.google.android.gms.measurement.internal.wa r10 = r10.mo7038b()
            java.lang.String r10 = r10.mo7408O()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00ad
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ad
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C1957u.f6396v
            goto L_0x00b2
        L_0x00ad:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C1957u.f6394u
            goto L_0x00b2
        L_0x00b0:
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r10 = com.google.android.gms.measurement.internal.C1957u.f6392t
        L_0x00b2:
            java.lang.Object r10 = r10.mo7323a(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            com.google.android.gms.measurement.internal.h5 r12 = r0.f6528j
            com.google.android.gms.measurement.internal.p4 r12 = r12.mo7051x()
            com.google.android.gms.measurement.internal.t4 r12 = r12.f6134e
            long r12 = r12.mo7343a()
            com.google.android.gms.measurement.internal.h5 r14 = r0.f6528j
            com.google.android.gms.measurement.internal.p4 r14 = r14.mo7051x()
            com.google.android.gms.measurement.internal.t4 r14 = r14.f6135f
            long r14 = r14.mo7343a()
            com.google.android.gms.measurement.internal.d r16 = r21.mo7446Z()
            r17 = r10
            long r9 = r16.mo6812E0()
            com.google.android.gms.measurement.internal.d r11 = r21.mo7446Z()
            r19 = r7
            long r6 = r11.mo6813F0()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
        L_0x00f4:
            r10 = r3
            goto L_0x016c
        L_0x00f7:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r8 = r1 - r8
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r6 + r19
            if (r5 == 0) goto L_0x011d
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x011d
            long r10 = java.lang.Math.min(r6, r8)
            long r10 = r10 + r17
        L_0x011d:
            com.google.android.gms.measurement.internal.ba r5 = r21.mo7450d0()
            r12 = r17
            boolean r5 = r5.mo6753Q(r8, r12)
            if (r5 != 0) goto L_0x012b
            long r10 = r8 + r12
        L_0x012b:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x016c
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x016c
            r5 = 0
        L_0x0134:
            r6 = 20
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C1957u.f6311C
            r8 = 0
            java.lang.Object r7 = r7.mo7323a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r9 = 0
            int r7 = java.lang.Math.max(r9, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x00f4
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r12 = com.google.android.gms.measurement.internal.C1957u.f6309B
            java.lang.Object r12 = r12.mo7323a(r8)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            long r12 = java.lang.Math.max(r3, r12)
            long r12 = r12 * r6
            long r10 = r10 + r12
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            int r5 = r5 + 1
            goto L_0x0134
        L_0x016c:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x018e
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo6885a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.m9121l0()
            r1.mo7253c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m9123m0()
            r1.mo7359v()
            return
        L_0x018e:
            com.google.android.gms.measurement.internal.g4 r1 = r21.mo7444X()
            boolean r1 = r1.mo7010x()
            if (r1 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.String r2 = "No network"
            r1.mo6885a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.m9121l0()
            r1.mo7252b()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m9123m0()
            r1.mo7359v()
            return
        L_0x01b6:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo7051x()
            com.google.android.gms.measurement.internal.t4 r1 = r1.f6136g
            long r1 = r1.mo7343a()
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C1957u.f6388r
            r6 = 0
            java.lang.Object r5 = r5.mo7323a(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ba r7 = r21.mo7450d0()
            boolean r7 = r7.mo6753Q(r1, r5)
            if (r7 != 0) goto L_0x01e2
            long r1 = r1 + r5
            long r10 = java.lang.Math.max(r10, r1)
        L_0x01e2:
            com.google.android.gms.measurement.internal.n4 r1 = r21.m9121l0()
            r1.mo7253c()
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.common.util.e r1 = r1.mo6708g()
            long r1 = r1.mo6587c()
            long r10 = r10 - r1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x021e
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C1957u.f6398w
            r2 = 0
            java.lang.Object r1 = r1.mo7323a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r10 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.p4 r1 = r1.mo7051x()
            com.google.android.gms.measurement.internal.t4 r1 = r1.f6134e
            com.google.android.gms.measurement.internal.h5 r2 = r0.f6528j
            com.google.android.gms.common.util.e r2 = r2.mo6708g()
            long r2 = r2.mo6587c()
            r1.mo7344b(r2)
        L_0x021e:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.mo6886b(r3, r2)
            com.google.android.gms.measurement.internal.t9 r1 = r21.m9123m0()
            r1.mo7358u(r10)
            return
        L_0x0239:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo6885a(r2)
            com.google.android.gms.measurement.internal.n4 r1 = r21.m9121l0()
            r1.mo7253c()
            com.google.android.gms.measurement.internal.t9 r1 = r21.m9123m0()
            r1.mo7359v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.m9106H():void");
    }

    /* renamed from: I */
    private final void m9107I() {
        m9124n0();
        if (this.f6535q || this.f6536r || this.f6537s) {
            this.f6528j.mo6709i().mo6772M().mo6888d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f6535q), Boolean.valueOf(this.f6536r), Boolean.valueOf(this.f6537s));
            return;
        }
        this.f6528j.mo6709i().mo6772M().mo6885a("Stopping uploading service(s)");
        List<Runnable> list = this.f6532n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f6532n.clear();
        }
    }

    /* renamed from: J */
    private final boolean m9108J() {
        String str;
        C1770e4 e4Var;
        FileLock fileLock;
        m9124n0();
        if (!this.f6528j.mo7038b().mo7415s(C1957u.f6373j0) || (fileLock = this.f6538t) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.f6528j.mo6710j().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.f6539u = channel;
                FileLock tryLock = channel.tryLock();
                this.f6538t = tryLock;
                if (tryLock != null) {
                    this.f6528j.mo6709i().mo6772M().mo6885a("Storage concurrent access okay");
                    return true;
                }
                this.f6528j.mo6709i().mo6764E().mo6885a("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                e = e;
                e4Var = this.f6528j.mo6709i().mo6764E();
                str = "Failed to acquire storage lock";
                e4Var.mo6886b(str, e);
                return false;
            } catch (IOException e2) {
                e = e2;
                e4Var = this.f6528j.mo6709i().mo6764E();
                str = "Failed to access storage lock file";
                e4Var.mo6886b(str, e);
                return false;
            } catch (OverlappingFileLockException e3) {
                e = e3;
                e4Var = this.f6528j.mo6709i().mo6767H();
                str = "Storage lock already acquired";
                e4Var.mo6886b(str, e);
                return false;
            }
        } else {
            this.f6528j.mo6709i().mo6772M().mo6885a("Storage concurrent access okay");
            return true;
        }
    }

    /* renamed from: K */
    private final C1860la m9109K(String str) {
        String str2 = str;
        C1782f4 j0 = mo7446Z().mo6832j0(str2);
        if (j0 == null || TextUtils.isEmpty(j0.mo6917T())) {
            this.f6528j.mo6709i().mo6771L().mo6886b("No app data available; dropping", str2);
            return null;
        }
        Boolean M = m9110M(j0);
        if (M == null || M.booleanValue()) {
            return new C1860la(str, j0.mo6898A(), j0.mo6917T(), j0.mo6919V(), j0.mo6921X(), j0.mo6923Z(), j0.mo6927b0(), (String) null, j0.mo6933e0(), false, j0.mo6910M(), j0.mo6944k(), 0, 0, j0.mo6946l(), j0.mo6948m(), false, j0.mo6901D(), j0.mo6950n(), j0.mo6931d0(), j0.mo6951o(), (!C4884yc.m20730b() || !this.f6528j.mo7038b().mo7398C(str2, C1957u.f6375k0)) ? null : j0.mo6904G(), (!C4602ib.m19620b() || !this.f6528j.mo7038b().mo7415s(C1957u.f6340Q0)) ? BuildConfig.FLAVOR : mo7447b(str).mo6873e());
        }
        this.f6528j.mo6709i().mo6764E().mo6886b("App version does not match; dropping. appId", C1746c4.m8178w(str));
        return null;
    }

    /* renamed from: M */
    private final Boolean m9110M(C1782f4 f4Var) {
        try {
            if (f4Var.mo6919V() != -2147483648L) {
                if (f4Var.mo6919V() == ((long) C4389c.m18627a(this.f6528j.mo6710j()).mo13717e(f4Var.mo6956t(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = C4389c.m18627a(this.f6528j.mo6710j()).mo13717e(f4Var.mo6956t(), 0).versionName;
                if (f4Var.mo6917T() != null && f4Var.mo6917T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: N */
    private final void m9111N(C4888z0.C4889a aVar, C4888z0.C4889a aVar2) {
        C1658o.m7836a("_e".equals(aVar.mo14800K()));
        mo7450d0();
        C4462b1 y = C1740ba.m8150y((C4888z0) ((C4895z6) aVar.mo14350h()), "_et");
        if (y.mo13816Y() && y.mo13817Z() > 0) {
            long Z = y.mo13817Z();
            mo7450d0();
            C4462b1 y2 = C1740ba.m8150y((C4888z0) ((C4895z6) aVar2.mo14350h()), "_et");
            if (y2 != null && y2.mo13817Z() > 0) {
                Z += y2.mo13817Z();
            }
            mo7450d0().mo6750H(aVar2, "_et", Long.valueOf(Z));
            mo7450d0().mo6750H(aVar, "_fr", 1L);
        }
    }

    /* renamed from: O */
    private final void m9112O(C1933s sVar, C1860la laVar) {
        if (C4907zc.m20843b() && this.f6528j.mo7038b().mo7415s(C1957u.f6324I0)) {
            C1806h4 b = C1806h4.m8535b(sVar);
            this.f6528j.mo7024G().mo6983M(b.f5864d, mo7446Z().mo6807B0(laVar.f6014f));
            this.f6528j.mo7024G().mo6993V(b, this.f6528j.mo7038b().mo7411m(laVar.f6014f));
            sVar = b.mo7016a();
        }
        if (this.f6528j.mo7038b().mo7415s(C1957u.f6365f0) && "_cmp".equals(sVar.f6237f) && "referrer API v2".equals(sVar.f6238g.mo7249o("_cis"))) {
            String o = sVar.f6238g.mo7249o("gclid");
            if (!TextUtils.isEmpty(o)) {
                mo7463v(new C1776ea("_lgclid", sVar.f6240i, o, "auto"), laVar);
            }
        }
        mo7460p(sVar, laVar);
    }

    /* renamed from: P */
    private static void m9113P(C1967u9 u9Var) {
        if (u9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!u9Var.mo7365q()) {
            String valueOf = String.valueOf(u9Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0963, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e4 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x031b A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0351 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0360 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0394 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x06b1 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x06c5 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0706 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0722 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x017d A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0185 A[Catch:{ SQLiteException -> 0x02ac, all -> 0x09f4 }] */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9114W(com.google.android.gms.measurement.internal.C1933s r27, com.google.android.gms.measurement.internal.C1860la r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.C1658o.m7845j(r28)
            java.lang.String r5 = r3.f6014f
            com.google.android.gms.common.internal.C1658o.m7841f(r5)
            long r5 = java.lang.System.nanoTime()
            r26.m9124n0()
            r26.mo7453g0()
            java.lang.String r15 = r3.f6014f
            r26.mo7450d0()
            boolean r7 = com.google.android.gms.measurement.internal.C1740ba.m8146R(r27, r28)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.f6021m
            if (r7 != 0) goto L_0x002e
            r1.mo7442U(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.b5 r7 = r26.mo7443V()
            java.lang.String r8 = r2.f6237f
            boolean r7 = r7.mo6721A(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6767H()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r15)
            com.google.android.gms.measurement.internal.h5 r5 = r1.f6528j
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7025H()
            java.lang.String r6 = r2.f6237f
            java.lang.String r5 = r5.mo6692v(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.mo6887c(r6, r4, r5)
            com.google.android.gms.measurement.internal.b5 r3 = r26.mo7443V()
            boolean r3 = r3.mo6728H(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.b5 r3 = r26.mo7443V()
            boolean r3 = r3.mo6729I(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.f6237f
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.h5 r4 = r1.f6528j
            com.google.android.gms.measurement.internal.fa r7 = r4.mo7024G()
            r9 = 11
            java.lang.String r11 = r2.f6237f
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.mo6994W(r8, r9, r10, r11, r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            com.google.android.gms.measurement.internal.f4 r2 = r2.mo6832j0(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.mo6939h0()
            long r5 = r2.mo6937g0()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.h5 r5 = r1.f6528j
            com.google.android.gms.common.util.e r5 = r5.mo6708g()
            long r5 = r5.mo6587c()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.r3<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C1957u.f6404z
            java.lang.Object r5 = r5.mo7323a(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6771L()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.mo6885a(r4)
            r1.m9128r(r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4585hb.m19593b()
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C1957u.f6316E0
            boolean r7 = r7.mo7415s(r8)
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.h4 r2 = com.google.android.gms.measurement.internal.C1806h4.m8535b(r27)
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j
            com.google.android.gms.measurement.internal.fa r7 = r7.mo7024G()
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j
            com.google.android.gms.measurement.internal.wa r8 = r8.mo7038b()
            int r8 = r8.mo7411m(r15)
            r7.mo6993V(r2, r8)
            com.google.android.gms.measurement.internal.s r2 = r2.mo7016a()
        L_0x0108:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()
            r8 = 2
            boolean r7 = r7.mo6763B(r8)
            if (r7 == 0) goto L_0x012e
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6772M()
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j
            com.google.android.gms.measurement.internal.a4 r9 = r9.mo7025H()
            java.lang.String r9 = r9.mo6691u(r2)
            java.lang.String r10 = "Logging event"
            r7.mo6886b(r10, r9)
        L_0x012e:
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()
            r7.mo6841t0()
            r1.mo7442U(r3)     // Catch:{ all -> 0x09f4 }
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C1957u.f6314D0     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.mo7415s(r9)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            java.lang.String r9 = "ecommerce_purchase"
            java.lang.String r10 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x09f4 }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0172
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = "purchase"
            java.lang.String r9 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x0172
            java.lang.String r7 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r7 = 0
            goto L_0x0173
        L_0x0172:
            r7 = 1
        L_0x0173:
            java.lang.String r9 = "_iap"
            java.lang.String r11 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x09f4 }
            if (r9 != 0) goto L_0x0182
            if (r7 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r9 = 0
            goto L_0x0183
        L_0x0182:
            r9 = 1
        L_0x0183:
            if (r9 == 0) goto L_0x032a
            com.google.android.gms.measurement.internal.n r9 = r2.f6238g     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.mo7249o(r11)     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x0203
            com.google.android.gms.measurement.internal.n r7 = r2.f6238g     // Catch:{ all -> 0x09f4 }
            java.lang.Double r7 = r7.mo7248m(r11)     // Catch:{ all -> 0x09f4 }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x09f4 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01b8
            com.google.android.gms.measurement.internal.n r7 = r2.f6238g     // Catch:{ all -> 0x09f4 }
            java.lang.Long r7 = r7.mo7247j(r11)     // Catch:{ all -> 0x09f4 }
            long r12 = r7.longValue()     // Catch:{ all -> 0x09f4 }
            double r11 = (double) r12
            java.lang.Double.isNaN(r11)
            double r17 = r11 * r19
        L_0x01b8:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01e6
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01e6
            long r11 = java.lang.Math.round(r17)     // Catch:{ all -> 0x09f4 }
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x020d
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C1957u.f6314D0     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.mo7415s(r13)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x020d
            java.lang.String r7 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x020d
            long r11 = -r11
            goto L_0x020d
        L_0x01e6:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6767H()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r15)     // Catch:{ all -> 0x09f4 }
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x09f4 }
            r7.mo6887c(r8, r9, r10)     // Catch:{ all -> 0x09f4 }
            r23 = r5
            r5 = 0
            r11 = 0
            goto L_0x0319
        L_0x0203:
            com.google.android.gms.measurement.internal.n r7 = r2.f6238g     // Catch:{ all -> 0x09f4 }
            java.lang.Long r7 = r7.mo7247j(r11)     // Catch:{ all -> 0x09f4 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x09f4 }
        L_0x020d:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x0315
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x09f4 }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x09f4 }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x09f4 }
            if (r9 == 0) goto L_0x0315
            java.lang.String r9 = "_ltv_"
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x09f4 }
            int r10 = r7.length()     // Catch:{ all -> 0x09f4 }
            if (r10 == 0) goto L_0x0232
            java.lang.String r7 = r9.concat(r7)     // Catch:{ all -> 0x09f4 }
            goto L_0x0237
        L_0x0232:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x09f4 }
            r7.<init>(r9)     // Catch:{ all -> 0x09f4 }
        L_0x0237:
            r10 = r7
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ga r7 = r7.mo6836o0(r15, r10)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0273
            java.lang.Object r9 = r7.f5856e     // Catch:{ all -> 0x09f4 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x09f4 }
            if (r9 != 0) goto L_0x0249
            goto L_0x0273
        L_0x0249:
            java.lang.Object r7 = r7.f5856e     // Catch:{ all -> 0x09f4 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x09f4 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ga r17 = new com.google.android.gms.measurement.internal.ga     // Catch:{ all -> 0x09f4 }
            java.lang.String r9 = r2.f6239h     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r13 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.common.util.e r13 = r13.mo6708g()     // Catch:{ all -> 0x09f4 }
            long r18 = r13.mo6587c()     // Catch:{ all -> 0x09f4 }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09f4 }
            r7 = r17
            r8 = r15
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09f4 }
        L_0x0270:
            r6 = r17
            goto L_0x02da
        L_0x0273:
            r23 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r9 = r9.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.C1957u.f6315E     // Catch:{ all -> 0x09f4 }
            int r9 = r9.mo7417u(r15, r13)     // Catch:{ all -> 0x09f4 }
            int r9 = r9 - r6
            com.google.android.gms.common.internal.C1658o.m7841f(r15)     // Catch:{ all -> 0x09f4 }
            r7.mo6700b()     // Catch:{ all -> 0x09f4 }
            r7.mo7366r()     // Catch:{ all -> 0x09f4 }
            android.database.sqlite.SQLiteDatabase r13 = r7.mo6844v()     // Catch:{ SQLiteException -> 0x02ac }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02ac }
            r6[r5] = r15     // Catch:{ SQLiteException -> 0x02ac }
            r16 = 1
            r6[r16] = r15     // Catch:{ SQLiteException -> 0x02ac }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02ac }
            r16 = 2
            r6[r16] = r9     // Catch:{ SQLiteException -> 0x02ac }
            r13.execSQL(r8, r6)     // Catch:{ SQLiteException -> 0x02ac }
            goto L_0x02bf
        L_0x02ac:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = "Error pruning currencies. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r15)     // Catch:{ all -> 0x09f4 }
            r7.mo6887c(r8, r9, r6)     // Catch:{ all -> 0x09f4 }
        L_0x02bf:
            com.google.android.gms.measurement.internal.ga r17 = new com.google.android.gms.measurement.internal.ga     // Catch:{ all -> 0x09f4 }
            java.lang.String r9 = r2.f6239h     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.common.util.e r6 = r6.mo6708g()     // Catch:{ all -> 0x09f4 }
            long r18 = r6.mo6587c()     // Catch:{ all -> 0x09f4 }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x09f4 }
            r7 = r17
            r8 = r15
            r11 = r18
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x09f4 }
            goto L_0x0270
        L_0x02da:
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.mo6828T(r6)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x0318
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r15)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r10 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.a4 r10 = r10.mo7025H()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r6.f5854c     // Catch:{ all -> 0x09f4 }
            java.lang.String r10 = r10.mo6694z(r11)     // Catch:{ all -> 0x09f4 }
            java.lang.Object r6 = r6.f5856e     // Catch:{ all -> 0x09f4 }
            r7.mo6888d(r8, r9, r10, r6)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r6.mo7024G()     // Catch:{ all -> 0x09f4 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.mo6994W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f4 }
            goto L_0x0318
        L_0x0315:
            r23 = r5
            r5 = 0
        L_0x0318:
            r11 = 1
        L_0x0319:
            if (r11 != 0) goto L_0x032d
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r2.mo6842u()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            r2.mo6851y0()
            return
        L_0x032a:
            r23 = r5
            r5 = 0
        L_0x032d:
            java.lang.String r6 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r6 = com.google.android.gms.measurement.internal.C1788fa.m8460d0(r6)     // Catch:{ all -> 0x09f4 }
            java.lang.String r7 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r18 = r14.equals(r7)     // Catch:{ all -> 0x09f4 }
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4714ob.m20059b()     // Catch:{ all -> 0x09f4 }
            r19 = 1
            if (r7 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C1957u.f6405z0     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.mo7398C(r8, r9)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            r7.mo7024G()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.n r7 = r2.f6238g     // Catch:{ all -> 0x09f4 }
            long r7 = com.google.android.gms.measurement.internal.C1788fa.m8473y(r7)     // Catch:{ all -> 0x09f4 }
            long r7 = r7 + r19
            r11 = r7
            goto L_0x0362
        L_0x0360:
            r11 = r19
        L_0x0362:
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            long r8 = r26.m9126o0()     // Catch:{ all -> 0x09f4 }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r6
            r27 = r15
            r15 = r16
            r16 = r18
            com.google.android.gms.measurement.internal.g r7 = r7.mo6806B(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x09f4 }
            long r8 = r7.f5829b     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C1957u.f6374k     // Catch:{ all -> 0x09f4 }
            r14 = 0
            java.lang.Object r10 = r10.mo7323a(r14)     // Catch:{ all -> 0x09f4 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x09f4 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x09f4 }
            long r10 = (long) r10     // Catch:{ all -> 0x09f4 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            int r15 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x03c1
            long r8 = r8 % r10
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x03b2
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r27)     // Catch:{ all -> 0x09f4 }
            long r5 = r7.f5829b     // Catch:{ all -> 0x09f4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09f4 }
            r2.mo6887c(r3, r4, r5)     // Catch:{ all -> 0x09f4 }
        L_0x03b2:
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r2.mo6842u()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            r2.mo6851y0()
            return
        L_0x03c1:
            if (r6 == 0) goto L_0x0416
            long r8 = r7.f5828a     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C1957u.f6378m     // Catch:{ all -> 0x09f4 }
            java.lang.Object r15 = r15.mo7323a(r14)     // Catch:{ all -> 0x09f4 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x09f4 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x09f4 }
            long r14 = (long) r15     // Catch:{ all -> 0x09f4 }
            long r8 = r8 - r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0416
            long r8 = r8 % r10
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x03f5
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r27)     // Catch:{ all -> 0x09f4 }
            long r6 = r7.f5828a     // Catch:{ all -> 0x09f4 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x09f4 }
            r3.mo6887c(r4, r5, r6)     // Catch:{ all -> 0x09f4 }
        L_0x03f5:
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r3.mo7024G()     // Catch:{ all -> 0x09f4 }
            r9 = 16
            java.lang.String r10 = "_ev"
            java.lang.String r11 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            r12 = 0
            r8 = r27
            r7.mo6994W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r2.mo6842u()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            r2.mo6851y0()
            return
        L_0x0416:
            if (r18 == 0) goto L_0x0465
            long r8 = r7.f5831d     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r10 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r10 = r10.mo7038b()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.C1957u.f6376l     // Catch:{ all -> 0x09f4 }
            int r10 = r10.mo7417u(r11, r14)     // Catch:{ all -> 0x09f4 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x09f4 }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x09f4 }
            long r10 = (long) r10     // Catch:{ all -> 0x09f4 }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0465
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0456
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r27)     // Catch:{ all -> 0x09f4 }
            long r5 = r7.f5831d     // Catch:{ all -> 0x09f4 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x09f4 }
            r2.mo6887c(r3, r4, r5)     // Catch:{ all -> 0x09f4 }
        L_0x0456:
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r2.mo6842u()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            r2.mo6851y0()
            return
        L_0x0465:
            com.google.android.gms.measurement.internal.n r7 = r2.f6238g     // Catch:{ all -> 0x09f4 }
            android.os.Bundle r14 = r7.mo7245i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r7.mo7024G()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f6239h     // Catch:{ all -> 0x09f4 }
            r7.mo6984N(r14, r8, r9)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r7.mo7024G()     // Catch:{ all -> 0x09f4 }
            r15 = r27
            boolean r7 = r7.mo6974D0(r15)     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = "_r"
            if (r7 == 0) goto L_0x04a4
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r7.mo7024G()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09f4 }
            r7.mo6984N(r14, r8, r9)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r7.mo7024G()     // Catch:{ all -> 0x09f4 }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x09f4 }
            r7.mo6984N(r14, r11, r8)     // Catch:{ all -> 0x09f4 }
        L_0x04a4:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x04cb
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ga r7 = r7.mo6836o0(r8, r4)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x04cb
            java.lang.Object r8 = r7.f5856e     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x04cb
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r8 = r8.mo7024G()     // Catch:{ all -> 0x09f4 }
            java.lang.Object r7 = r7.f5856e     // Catch:{ all -> 0x09f4 }
            r8.mo6984N(r14, r4, r7)     // Catch:{ all -> 0x09f4 }
        L_0x04cb:
            com.google.android.gms.measurement.internal.d r4 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            long r7 = r4.mo6835n0(r15)     // Catch:{ all -> 0x09f4 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ee
            com.google.android.gms.measurement.internal.h5 r4 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()     // Catch:{ all -> 0x09f4 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r15)     // Catch:{ all -> 0x09f4 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x09f4 }
            r4.mo6887c(r9, r10, r7)     // Catch:{ all -> 0x09f4 }
        L_0x04ee:
            com.google.android.gms.measurement.internal.l r4 = new com.google.android.gms.measurement.internal.l     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            java.lang.String r9 = r2.f6239h     // Catch:{ all -> 0x09f4 }
            java.lang.String r10 = r2.f6237f     // Catch:{ all -> 0x09f4 }
            long r12 = r2.f6240i     // Catch:{ all -> 0x09f4 }
            r18 = 0
            r7 = r4
            r2 = r10
            r10 = r15
            r5 = r11
            r11 = r2
            r16 = r14
            r2 = r15
            r25 = 0
            r14 = r18
            r7.<init>((com.google.android.gms.measurement.internal.C1807h5) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r4.f5978b     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.o r7 = r7.mo6810D(r2, r8)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x058c
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            long r7 = r7.mo6852z0(r2)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r9 = r9.mo7038b()     // Catch:{ all -> 0x09f4 }
            int r9 = r9.mo7416t(r2)     // Catch:{ all -> 0x09f4 }
            long r9 = (long) r9     // Catch:{ all -> 0x09f4 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0572
            if (r6 == 0) goto L_0x0572
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r2)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.a4 r7 = r7.mo7025H()     // Catch:{ all -> 0x09f4 }
            java.lang.String r4 = r4.f5978b     // Catch:{ all -> 0x09f4 }
            java.lang.String r4 = r7.mo6692v(r4)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x09f4 }
            int r7 = r7.mo7416t(r2)     // Catch:{ all -> 0x09f4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x09f4 }
            r3.mo6888d(r5, r6, r4, r7)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.fa r7 = r3.mo7024G()     // Catch:{ all -> 0x09f4 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r2
            r7.mo6994W(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            r2.mo6851y0()
            return
        L_0x0572:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o     // Catch:{ all -> 0x09f4 }
            java.lang.String r9 = r4.f5978b     // Catch:{ all -> 0x09f4 }
            r10 = 0
            r12 = 0
            long r14 = r4.f5980d     // Catch:{ all -> 0x09f4 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r6
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x09f4 }
            goto L_0x059a
        L_0x058c:
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            long r8 = r7.f6095f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.l r4 = r4.mo7176a(r2, r8)     // Catch:{ all -> 0x09f4 }
            long r8 = r4.f5980d     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.o r6 = r7.mo7262a(r8)     // Catch:{ all -> 0x09f4 }
        L_0x059a:
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r2.mo6822N(r6)     // Catch:{ all -> 0x09f4 }
            r26.m9124n0()     // Catch:{ all -> 0x09f4 }
            r26.mo7453g0()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.common.internal.C1658o.m7845j(r4)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.common.internal.C1658o.m7845j(r28)     // Catch:{ all -> 0x09f4 }
            java.lang.String r2 = r4.f5977a     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.common.internal.C1658o.m7841f(r2)     // Catch:{ all -> 0x09f4 }
            java.lang.String r2 = r4.f5977a     // Catch:{ all -> 0x09f4 }
            java.lang.String r6 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.common.internal.C1658o.m7836a(r2)     // Catch:{ all -> 0x09f4 }
            g.d.a.c.f.f.d1$a r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.m19022P0()     // Catch:{ all -> 0x09f4 }
            r6 = 1
            r2.mo14023v(r6)     // Catch:{ all -> 0x09f4 }
            java.lang.String r7 = "android"
            r2.mo13973E(r7)     // Catch:{ all -> 0x09f4 }
            java.lang.String r7 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x05d7
            java.lang.String r7 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            r2.mo14009h0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x05d7:
            java.lang.String r7 = r3.f6017i     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x05e4
            java.lang.String r7 = r3.f6017i     // Catch:{ all -> 0x09f4 }
            r2.mo14005d0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x05e4:
            java.lang.String r7 = r3.f6016h     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x05f1
            java.lang.String r7 = r3.f6016h     // Catch:{ all -> 0x09f4 }
            r2.mo14013l0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x05f1:
            long r7 = r3.f6023o     // Catch:{ all -> 0x09f4 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0600
            long r7 = r3.f6023o     // Catch:{ all -> 0x09f4 }
            int r8 = (int) r7     // Catch:{ all -> 0x09f4 }
            r2.mo14015n0(r8)     // Catch:{ all -> 0x09f4 }
        L_0x0600:
            long r7 = r3.f6018j     // Catch:{ all -> 0x09f4 }
            r2.mo14008g0(r7)     // Catch:{ all -> 0x09f4 }
            java.lang.String r7 = r3.f6015g     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x0612
            java.lang.String r7 = r3.f6015g     // Catch:{ all -> 0x09f4 }
            r2.mo14031z0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x0612:
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0645
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.mo7415s(r8)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0645
            java.lang.String r7 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e r7 = r1.mo7447b(r7)     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r3.f6013B     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e r8 = com.google.android.gms.measurement.internal.C1765e.m8334b(r8)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e r7 = r7.mo6877k(r8)     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r3.f6013B     // Catch:{ all -> 0x09f4 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x0645
            java.lang.String r7 = r7.mo6873e()     // Catch:{ all -> 0x09f4 }
            r2.mo13989M0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x0645:
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0694
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C1957u.f6375k0     // Catch:{ all -> 0x09f4 }
            boolean r7 = r7.mo7398C(r8, r9)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0694
            java.lang.String r7 = r2.mo13981I0()     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x0672
            java.lang.String r7 = r3.f6012A     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x0672
            java.lang.String r7 = r3.f6012A     // Catch:{ all -> 0x09f4 }
            r2.mo13985K0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x0672:
            java.lang.String r7 = r2.mo13981I0()     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x06a9
            java.lang.String r7 = r2.mo13993O0()     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x06a9
            java.lang.String r7 = r3.f6031w     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x06a9
            java.lang.String r7 = r3.f6031w     // Catch:{ all -> 0x09f4 }
        L_0x0690:
            r2.mo13979H0(r7)     // Catch:{ all -> 0x09f4 }
            goto L_0x06a9
        L_0x0694:
            java.lang.String r7 = r2.mo13981I0()     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x06a9
            java.lang.String r7 = r3.f6031w     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x06a9
            java.lang.String r7 = r3.f6031w     // Catch:{ all -> 0x09f4 }
            goto L_0x0690
        L_0x06a9:
            long r7 = r3.f6019k     // Catch:{ all -> 0x09f4 }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x06b6
            long r7 = r3.f6019k     // Catch:{ all -> 0x09f4 }
            r2.mo14016o0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x06b6:
            long r7 = r3.f6033y     // Catch:{ all -> 0x09f4 }
            r2.mo14029y0(r7)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ba r7 = r26.mo7450d0()     // Catch:{ all -> 0x09f4 }
            java.util.List r7 = r7.mo6757X()     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x06c8
            r2.mo13998V(r7)     // Catch:{ all -> 0x09f4 }
        L_0x06c8:
            java.lang.String r7 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e r7 = r1.mo7447b(r7)     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r3.f6013B     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e r8 = com.google.android.gms.measurement.internal.C1765e.m8334b(r8)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e r7 = r7.mo6877k(r8)     // Catch:{ all -> 0x09f4 }
            boolean r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x06f2
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r8 = r8.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.mo7415s(r11)     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x06f2
            boolean r8 = r7.mo6880o()     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x079a
        L_0x06f2:
            com.google.android.gms.measurement.internal.c9 r8 = r1.f6527i     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            android.util.Pair r8 = r8.mo6802u(r11, r7)     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x0722
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09f4 }
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch:{ all -> 0x09f4 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x09f4 }
            if (r11 != 0) goto L_0x0722
            boolean r11 = r3.f6028t     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x079a
            java.lang.Object r11 = r8.first     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09f4 }
            r2.mo14017p0(r11)     // Catch:{ all -> 0x09f4 }
            java.lang.Object r11 = r8.second     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x079a
            java.lang.Object r8 = r8.second     // Catch:{ all -> 0x09f4 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x09f4 }
            r2.mo13975F(r8)     // Catch:{ all -> 0x09f4 }
            goto L_0x079a
        L_0x0722:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.m r8 = r8.mo7034Q()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            android.content.Context r11 = r11.mo6710j()     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.mo7231t(r11)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x079a
            boolean r8 = r3.f6029u     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x079a
            boolean r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4532ee.m19350b()     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x074e
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r8 = r8.mo7038b()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6336O0     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.mo7398C(r11, r12)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x079a
        L_0x074e:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            android.content.Context r8 = r8.mo6710j()     // Catch:{ all -> 0x09f4 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = "android_id"
            java.lang.String r8 = android.provider.Settings.Secure.getString(r8, r11)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x077a
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6767H()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = "null secure ID. appId"
            java.lang.String r12 = r2.mo14025w0()     // Catch:{ all -> 0x09f4 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r12)     // Catch:{ all -> 0x09f4 }
            r8.mo6886b(r11, r12)     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = "null"
            goto L_0x0797
        L_0x077a:
            boolean r11 = r8.isEmpty()     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x0797
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r11 = r11.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r11 = r11.mo6767H()     // Catch:{ all -> 0x09f4 }
            java.lang.String r12 = "empty secure ID. appId"
            java.lang.String r13 = r2.mo14025w0()     // Catch:{ all -> 0x09f4 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)     // Catch:{ all -> 0x09f4 }
            r11.mo6886b(r12, r13)     // Catch:{ all -> 0x09f4 }
        L_0x0797:
            r2.mo13974E0(r8)     // Catch:{ all -> 0x09f4 }
        L_0x079a:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.m r8 = r8.mo7034Q()     // Catch:{ all -> 0x09f4 }
            r8.mo6864o()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x09f4 }
            r2.mo13996T(r8)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.m r8 = r8.mo7034Q()     // Catch:{ all -> 0x09f4 }
            r8.mo6864o()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x09f4 }
            r2.mo13986L(r8)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.m r8 = r8.mo7034Q()     // Catch:{ all -> 0x09f4 }
            long r11 = r8.mo7232u()     // Catch:{ all -> 0x09f4 }
            int r8 = (int) r11     // Catch:{ all -> 0x09f4 }
            r2.mo14007f0(r8)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.m r8 = r8.mo7034Q()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r8.mo7233v()     // Catch:{ all -> 0x09f4 }
            r2.mo13999W(r8)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r8 = r8.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C1957u.f6320G0     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.mo7415s(r11)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x07e4
            long r11 = r3.f6025q     // Catch:{ all -> 0x09f4 }
            r2.mo14022u0(r11)     // Catch:{ all -> 0x09f4 }
        L_0x07e4:
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.mo7044p()     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x080c
            boolean r8 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x07fe
            com.google.android.gms.measurement.internal.h5 r8 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r8 = r8.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x09f4 }
            boolean r8 = r8.mo7415s(r11)     // Catch:{ all -> 0x09f4 }
        L_0x07fe:
            r2.mo14025w0()     // Catch:{ all -> 0x09f4 }
            boolean r8 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x080c
            r8 = r25
            r2.mo13978G0(r8)     // Catch:{ all -> 0x09f4 }
        L_0x080c:
            com.google.android.gms.measurement.internal.d r8 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.f4 r8 = r8.mo6832j0(r11)     // Catch:{ all -> 0x09f4 }
            if (r8 != 0) goto L_0x08b7
            com.google.android.gms.measurement.internal.f4 r8 = new com.google.android.gms.measurement.internal.f4     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            java.lang.String r12 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            r8.<init>(r11, r12)     // Catch:{ all -> 0x09f4 }
            boolean r11 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x083d
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x09f4 }
            boolean r11 = r11.mo7415s(r12)     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x083d
            java.lang.String r11 = r1.m9119f(r7)     // Catch:{ all -> 0x09f4 }
        L_0x0839:
            r8.mo6928c(r11)     // Catch:{ all -> 0x09f4 }
            goto L_0x0842
        L_0x083d:
            java.lang.String r11 = r26.m9127p0()     // Catch:{ all -> 0x09f4 }
            goto L_0x0839
        L_0x0842:
            java.lang.String r11 = r3.f6024p     // Catch:{ all -> 0x09f4 }
            r8.mo6903F(r11)     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6015g     // Catch:{ all -> 0x09f4 }
            r8.mo6954r(r11)     // Catch:{ all -> 0x09f4 }
            boolean r11 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x0866
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x09f4 }
            boolean r11 = r11.mo7415s(r12)     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x0866
            boolean r11 = r7.mo6880o()     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x0871
        L_0x0866:
            com.google.android.gms.measurement.internal.c9 r11 = r1.f6527i     // Catch:{ all -> 0x09f4 }
            java.lang.String r12 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r11.mo6803v(r12)     // Catch:{ all -> 0x09f4 }
            r8.mo6900C(r11)     // Catch:{ all -> 0x09f4 }
        L_0x0871:
            r8.mo6905H(r9)     // Catch:{ all -> 0x09f4 }
            r8.mo6924a(r9)     // Catch:{ all -> 0x09f4 }
            r8.mo6953q(r9)     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6016h     // Catch:{ all -> 0x09f4 }
            r8.mo6906I(r11)     // Catch:{ all -> 0x09f4 }
            long r11 = r3.f6023o     // Catch:{ all -> 0x09f4 }
            r8.mo6957u(r11)     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r3.f6017i     // Catch:{ all -> 0x09f4 }
            r8.mo6909L(r11)     // Catch:{ all -> 0x09f4 }
            long r11 = r3.f6018j     // Catch:{ all -> 0x09f4 }
            r8.mo6961y(r11)     // Catch:{ all -> 0x09f4 }
            long r11 = r3.f6019k     // Catch:{ all -> 0x09f4 }
            r8.mo6899B(r11)     // Catch:{ all -> 0x09f4 }
            boolean r11 = r3.f6021m     // Catch:{ all -> 0x09f4 }
            r8.mo6932e(r11)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6320G0     // Catch:{ all -> 0x09f4 }
            boolean r11 = r11.mo7415s(r12)     // Catch:{ all -> 0x09f4 }
            if (r11 != 0) goto L_0x08ab
            long r11 = r3.f6025q     // Catch:{ all -> 0x09f4 }
            r8.mo6929c0(r11)     // Catch:{ all -> 0x09f4 }
        L_0x08ab:
            long r11 = r3.f6033y     // Catch:{ all -> 0x09f4 }
            r8.mo6902E(r11)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r11 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r11.mo6823O(r8)     // Catch:{ all -> 0x09f4 }
        L_0x08b7:
            boolean r11 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x08d1
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x09f4 }
            boolean r11 = r11.mo7415s(r12)     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x08d1
            boolean r7 = r7.mo6882q()     // Catch:{ all -> 0x09f4 }
            if (r7 == 0) goto L_0x08e2
        L_0x08d1:
            java.lang.String r7 = r8.mo6960x()     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x08e2
            java.lang.String r7 = r8.mo6960x()     // Catch:{ all -> 0x09f4 }
            r2.mo14021t0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x08e2:
            java.lang.String r7 = r8.mo6910M()     // Catch:{ all -> 0x09f4 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x09f4 }
            if (r7 != 0) goto L_0x08f3
            java.lang.String r7 = r8.mo6910M()     // Catch:{ all -> 0x09f4 }
            r2.mo13970C0(r7)     // Catch:{ all -> 0x09f4 }
        L_0x08f3:
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            java.lang.String r3 = r3.f6014f     // Catch:{ all -> 0x09f4 }
            java.util.List r3 = r7.mo6817I(r3)     // Catch:{ all -> 0x09f4 }
            r11 = 0
        L_0x08fe:
            int r7 = r3.size()     // Catch:{ all -> 0x09f4 }
            if (r11 >= r7) goto L_0x0933
            g.d.a.c.f.f.h1$a r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4574h1.m19556a0()     // Catch:{ all -> 0x09f4 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ga r8 = (com.google.android.gms.measurement.internal.C1800ga) r8     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r8.f5854c     // Catch:{ all -> 0x09f4 }
            r7.mo14219z(r8)     // Catch:{ all -> 0x09f4 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ga r8 = (com.google.android.gms.measurement.internal.C1800ga) r8     // Catch:{ all -> 0x09f4 }
            long r12 = r8.f5855d     // Catch:{ all -> 0x09f4 }
            r7.mo14218y(r12)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ba r8 = r26.mo7450d0()     // Catch:{ all -> 0x09f4 }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.ga r12 = (com.google.android.gms.measurement.internal.C1800ga) r12     // Catch:{ all -> 0x09f4 }
            java.lang.Object r12 = r12.f5856e     // Catch:{ all -> 0x09f4 }
            r8.mo6752J(r7, r12)     // Catch:{ all -> 0x09f4 }
            r2.mo13967B(r7)     // Catch:{ all -> 0x09f4 }
            int r11 = r11 + 1
            goto L_0x08fe
        L_0x0933:
            com.google.android.gms.measurement.internal.d r3 = r26.mo7446Z()     // Catch:{ IOException -> 0x09a8 }
            g.d.a.c.f.f.l8 r7 = r2.mo14350h()     // Catch:{ IOException -> 0x09a8 }
            g.d.a.c.f.f.z6 r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r7     // Catch:{ IOException -> 0x09a8 }
            g.d.a.c.f.f.d1 r7 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r7     // Catch:{ IOException -> 0x09a8 }
            long r2 = r3.mo6850y(r7)     // Catch:{ IOException -> 0x09a8 }
            com.google.android.gms.measurement.internal.d r7 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.n r8 = r4.f5982f     // Catch:{ all -> 0x09f4 }
            if (r8 == 0) goto L_0x099e
            com.google.android.gms.measurement.internal.n r8 = r4.f5982f     // Catch:{ all -> 0x09f4 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x09f4 }
        L_0x0951:
            boolean r11 = r8.hasNext()     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x0965
            java.lang.Object r11 = r8.next()     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x09f4 }
            boolean r11 = r5.equals(r11)     // Catch:{ all -> 0x09f4 }
            if (r11 == 0) goto L_0x0951
        L_0x0963:
            r11 = 1
            goto L_0x099f
        L_0x0965:
            com.google.android.gms.measurement.internal.b5 r5 = r26.mo7443V()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r4.f5977a     // Catch:{ all -> 0x09f4 }
            java.lang.String r11 = r4.f5978b     // Catch:{ all -> 0x09f4 }
            boolean r5 = r5.mo6723C(r8, r11)     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r11 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            long r12 = r26.m9126o0()     // Catch:{ all -> 0x09f4 }
            java.lang.String r14 = r4.f5977a     // Catch:{ all -> 0x09f4 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.g r8 = r11.mo6808C(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x09f4 }
            if (r5 == 0) goto L_0x099e
            long r11 = r8.f5832e     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.h5 r5 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.wa r5 = r5.mo7038b()     // Catch:{ all -> 0x09f4 }
            java.lang.String r8 = r4.f5977a     // Catch:{ all -> 0x09f4 }
            int r5 = r5.mo7419w(r8)     // Catch:{ all -> 0x09f4 }
            long r13 = (long) r5     // Catch:{ all -> 0x09f4 }
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x099e
            goto L_0x0963
        L_0x099e:
            r11 = 0
        L_0x099f:
            boolean r2 = r7.mo6827S(r4, r2, r11)     // Catch:{ all -> 0x09f4 }
            if (r2 == 0) goto L_0x09c1
            r1.f6531m = r9     // Catch:{ all -> 0x09f4 }
            goto L_0x09c1
        L_0x09a8:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.h5 r4 = r1.f6528j     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6764E()     // Catch:{ all -> 0x09f4 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.mo14025w0()     // Catch:{ all -> 0x09f4 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r2)     // Catch:{ all -> 0x09f4 }
            r4.mo6887c(r5, r2, r3)     // Catch:{ all -> 0x09f4 }
        L_0x09c1:
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()     // Catch:{ all -> 0x09f4 }
            r2.mo6842u()     // Catch:{ all -> 0x09f4 }
            com.google.android.gms.measurement.internal.d r2 = r26.mo7446Z()
            r2.mo6851y0()
            r26.m9106H()
            com.google.android.gms.measurement.internal.h5 r2 = r1.f6528j
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo6709i()
            com.google.android.gms.measurement.internal.e4 r2 = r2.mo6772M()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.mo6886b(r4, r3)
            return
        L_0x09f4:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.d r3 = r26.mo7446Z()
            r3.mo6851y0()
            goto L_0x09ff
        L_0x09fe:
            throw r2
        L_0x09ff:
            goto L_0x09fe
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.m9114W(com.google.android.gms.measurement.internal.s, com.google.android.gms.measurement.internal.la):void");
    }

    /* renamed from: a */
    private final int m9115a(FileChannel fileChannel) {
        m9124n0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f6528j.mo6709i().mo6764E().mo6885a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f6528j.mo6709i().mo6767H().mo6886b("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.f6528j.mo6709i().mo6764E().mo6886b("Failed to read from channel", e);
            return 0;
        }
    }

    /* renamed from: a0 */
    private final boolean m9116a0(C1860la laVar) {
        return (!C4884yc.m20730b() || !this.f6528j.mo7038b().mo7398C(laVar.f6014f, C1957u.f6375k0)) ? !TextUtils.isEmpty(laVar.f6015g) || !TextUtils.isEmpty(laVar.f6031w) : !TextUtils.isEmpty(laVar.f6015g) || !TextUtils.isEmpty(laVar.f6012A) || !TextUtils.isEmpty(laVar.f6031w);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r0.mo6880o() != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01eb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.C1782f4 m9117c(com.google.android.gms.measurement.internal.C1860la r9, com.google.android.gms.measurement.internal.C1782f4 r10, java.lang.String r11) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.e r0 = com.google.android.gms.measurement.internal.C1765e.f5741c
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.measurement.internal.h5 r1 = r8.f6528j
            com.google.android.gms.measurement.internal.wa r1 = r1.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r1 = r1.mo7415s(r2)
            if (r1 == 0) goto L_0x0026
            java.lang.String r0 = r9.f6014f
            com.google.android.gms.measurement.internal.e r0 = r8.mo7447b(r0)
            java.lang.String r1 = r9.f6013B
            com.google.android.gms.measurement.internal.e r1 = com.google.android.gms.measurement.internal.C1765e.m8334b(r1)
            com.google.android.gms.measurement.internal.e r0 = r0.mo6877k(r1)
        L_0x0026:
            r1 = 1
            if (r10 != 0) goto L_0x0066
            com.google.android.gms.measurement.internal.f4 r10 = new com.google.android.gms.measurement.internal.f4
            com.google.android.gms.measurement.internal.h5 r2 = r8.f6528j
            java.lang.String r3 = r9.f6014f
            r10.<init>(r2, r3)
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r2 == 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r2 = r8.f6528j
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x005a
            boolean r2 = r0.mo6882q()
            if (r2 == 0) goto L_0x0053
            java.lang.String r2 = r8.m9119f(r0)
            r10.mo6928c(r2)
        L_0x0053:
            boolean r0 = r0.mo6880o()
            if (r0 == 0) goto L_0x0064
            goto L_0x0061
        L_0x005a:
            java.lang.String r0 = r8.m9127p0()
            r10.mo6928c(r0)
        L_0x0061:
            r10.mo6900C(r11)
        L_0x0064:
            r11 = 1
            goto L_0x00b5
        L_0x0066:
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r2 == 0) goto L_0x0080
            com.google.android.gms.measurement.internal.h5 r2 = r8.f6528j
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x0080
            boolean r2 = r0.mo6880o()
            if (r2 == 0) goto L_0x00b4
        L_0x0080:
            java.lang.String r2 = r10.mo6907J()
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x00b4
            r10.mo6900C(r11)
            boolean r11 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r11 == 0) goto L_0x00ac
            com.google.android.gms.measurement.internal.h5 r11 = r8.f6528j
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r11 = r11.mo7415s(r2)
            if (r11 == 0) goto L_0x00ac
            boolean r11 = r0.mo6882q()
            if (r11 == 0) goto L_0x0064
            java.lang.String r11 = r8.m9119f(r0)
            goto L_0x00b0
        L_0x00ac:
            java.lang.String r11 = r8.m9127p0()
        L_0x00b0:
            r10.mo6928c(r11)
            goto L_0x0064
        L_0x00b4:
            r11 = 0
        L_0x00b5:
            java.lang.String r0 = r9.f6015g
            java.lang.String r2 = r10.mo6898A()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r11 = r9.f6015g
            r10.mo6954r(r11)
            r11 = 1
        L_0x00c7:
            java.lang.String r0 = r9.f6031w
            java.lang.String r2 = r10.mo6901D()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r11 = r9.f6031w
            r10.mo6958v(r11)
            r11 = 1
        L_0x00d9:
            boolean r0 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()
            if (r0 == 0) goto L_0x0103
            com.google.android.gms.measurement.internal.h5 r0 = r8.f6528j
            com.google.android.gms.measurement.internal.wa r0 = r0.mo7038b()
            java.lang.String r2 = r10.mo6956t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6375k0
            boolean r0 = r0.mo7398C(r2, r3)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r9.f6012A
            java.lang.String r2 = r10.mo6904G()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L_0x0103
            java.lang.String r11 = r9.f6012A
            r10.mo6962z(r11)
            r11 = 1
        L_0x0103:
            java.lang.String r0 = r9.f6024p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = r9.f6024p
            java.lang.String r2 = r10.mo6910M()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x011d
            java.lang.String r11 = r9.f6024p
            r10.mo6903F(r11)
            r11 = 1
        L_0x011d:
            long r2 = r9.f6018j
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            long r6 = r10.mo6923Z()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0133
            long r2 = r9.f6018j
            r10.mo6961y(r2)
            r11 = 1
        L_0x0133:
            java.lang.String r0 = r9.f6016h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = r9.f6016h
            java.lang.String r2 = r10.mo6917T()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x014d
            java.lang.String r11 = r9.f6016h
            r10.mo6906I(r11)
            r11 = 1
        L_0x014d:
            long r2 = r9.f6023o
            long r6 = r10.mo6919V()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x015d
            long r2 = r9.f6023o
            r10.mo6957u(r2)
            r11 = 1
        L_0x015d:
            java.lang.String r0 = r9.f6017i
            if (r0 == 0) goto L_0x0171
            java.lang.String r2 = r10.mo6921X()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0171
            java.lang.String r11 = r9.f6017i
            r10.mo6909L(r11)
            r11 = 1
        L_0x0171:
            long r2 = r9.f6019k
            long r6 = r10.mo6927b0()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
            long r2 = r9.f6019k
            r10.mo6899B(r2)
            r11 = 1
        L_0x0181:
            boolean r0 = r9.f6021m
            boolean r2 = r10.mo6933e0()
            if (r0 == r2) goto L_0x018f
            boolean r11 = r9.f6021m
            r10.mo6932e(r11)
            r11 = 1
        L_0x018f:
            java.lang.String r0 = r9.f6020l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = r9.f6020l
            java.lang.String r2 = r10.mo6940i()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01a9
            java.lang.String r11 = r9.f6020l
            r10.mo6912O(r11)
            r11 = 1
        L_0x01a9:
            com.google.android.gms.measurement.internal.h5 r0 = r8.f6528j
            com.google.android.gms.measurement.internal.wa r0 = r0.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6320G0
            boolean r0 = r0.mo7415s(r2)
            if (r0 != 0) goto L_0x01c7
            long r2 = r9.f6025q
            long r6 = r10.mo6944k()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c7
            long r2 = r9.f6025q
            r10.mo6929c0(r2)
            r11 = 1
        L_0x01c7:
            boolean r0 = r9.f6028t
            boolean r2 = r10.mo6946l()
            if (r0 == r2) goto L_0x01d5
            boolean r11 = r9.f6028t
            r10.mo6955s(r11)
            r11 = 1
        L_0x01d5:
            boolean r0 = r9.f6029u
            boolean r2 = r10.mo6948m()
            if (r0 == r2) goto L_0x01e3
            boolean r11 = r9.f6029u
            r10.mo6959w(r11)
            r11 = 1
        L_0x01e3:
            java.lang.Boolean r0 = r9.f6032x
            java.lang.Boolean r2 = r10.mo6950n()
            if (r0 == r2) goto L_0x01f1
            java.lang.Boolean r11 = r9.f6032x
            r10.mo6926b(r11)
            r11 = 1
        L_0x01f1:
            long r2 = r9.f6033y
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            long r4 = r10.mo6931d0()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            long r2 = r9.f6033y
            r10.mo6902E(r2)
            goto L_0x0206
        L_0x0205:
            r1 = r11
        L_0x0206:
            if (r1 == 0) goto L_0x020f
            com.google.android.gms.measurement.internal.d r9 = r8.mo7446Z()
            r9.mo6823O(r10)
        L_0x020f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.m9117c(com.google.android.gms.measurement.internal.la, com.google.android.gms.measurement.internal.f4, java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    /* renamed from: d */
    public static C2003x9 m9118d(Context context) {
        C1658o.m7845j(context);
        C1658o.m7845j(context.getApplicationContext());
        if (f6518z == null) {
            synchronized (C2003x9.class) {
                if (f6518z == null) {
                    f6518z = new C2003x9(new C1752ca(context));
                }
            }
        }
        return f6518z;
    }

    /* renamed from: f */
    private final String m9119f(C1765e eVar) {
        if (!C4602ib.m19620b() || !this.f6528j.mo7038b().mo7415s(C1957u.f6340Q0) || eVar.mo6882q()) {
            return m9127p0();
        }
        return null;
    }

    /* renamed from: l */
    private static void m9120l(C4888z0.C4889a aVar, int i, String str) {
        List<C4462b1> E = aVar.mo14795E();
        int i2 = 0;
        while (i2 < E.size()) {
            if (!"_err".equals(E.get(i2).mo13813N())) {
                i2++;
            } else {
                return;
            }
        }
        C4462b1.C4463a g0 = C4462b1.m18758g0();
        g0.mo13825B("_err");
        g0.mo13833y(Long.valueOf((long) i).longValue());
        C4462b1.C4463a g02 = C4462b1.m18758g0();
        g02.mo13825B("_ev");
        g02.mo13827D(str);
        aVar.mo14791A((C4462b1) ((C4895z6) g0.mo14350h()));
        aVar.mo14791A((C4462b1) ((C4895z6) g02.mo14350h()));
    }

    /* renamed from: l0 */
    private final C1878n4 m9121l0() {
        C1878n4 n4Var = this.f6522d;
        if (n4Var != null) {
            return n4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: m */
    private static void m9122m(C4888z0.C4889a aVar, String str) {
        List<C4462b1> E = aVar.mo14795E();
        for (int i = 0; i < E.size(); i++) {
            if (str.equals(E.get(i).mo13813N())) {
                aVar.mo14797G(i);
                return;
            }
        }
    }

    /* renamed from: m0 */
    private final C1955t9 m9123m0() {
        m9113P(this.f6523e);
        return this.f6523e;
    }

    /* renamed from: n0 */
    private final void m9124n0() {
        this.f6528j.mo6706e().mo6700b();
    }

    /* renamed from: o */
    private final void m9125o(C4499d1.C4500a aVar, long j, boolean z) {
        String str = z ? "_se" : "_lte";
        C1800ga o0 = mo7446Z().mo6836o0(aVar.mo14025w0(), str);
        C1800ga gaVar = (o0 == null || o0.f5856e == null) ? new C1800ga(aVar.mo14025w0(), "auto", str, this.f6528j.mo6708g().mo6587c(), Long.valueOf(j)) : new C1800ga(aVar.mo14025w0(), "auto", str, this.f6528j.mo6708g().mo6587c(), Long.valueOf(((Long) o0.f5856e).longValue() + j));
        C4574h1.C4575a a0 = C4574h1.m19556a0();
        a0.mo14219z(str);
        a0.mo14218y(this.f6528j.mo6708g().mo6587c());
        a0.mo14213B(((Long) gaVar.f5856e).longValue());
        C4574h1 h1Var = (C4574h1) ((C4895z6) a0.mo14350h());
        boolean z2 = false;
        int u = C1740ba.m8149u(aVar, str);
        if (u >= 0) {
            aVar.mo14028y(u, h1Var);
            z2 = true;
        }
        if (!z2) {
            aVar.mo13969C(h1Var);
        }
        if (j > 0) {
            mo7446Z().mo6828T(gaVar);
            this.f6528j.mo6709i().mo6772M().mo6887c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", gaVar.f5856e);
        }
    }

    /* renamed from: o0 */
    private final long m9126o0() {
        long c = this.f6528j.mo6708g().mo6587c();
        C1902p4 x = this.f6528j.mo7051x();
        x.mo6864o();
        x.mo6700b();
        long a = x.f6138i.mo7343a();
        if (a == 0) {
            a = 1 + ((long) x.mo6707f().mo6978H0().nextInt(86400000));
            x.f6138i.mo7344b(a);
        }
        return ((((c + a) / 1000) / 60) / 60) / 24;
    }

    @Deprecated
    /* renamed from: p0 */
    private final String m9127p0() {
        byte[] bArr = new byte[16];
        this.f6528j.mo7024G().mo6978H0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: r */
    private final void m9128r(C1782f4 f4Var) {
        C3190a aVar;
        m9124n0();
        if (!C4884yc.m20730b() || !this.f6528j.mo7038b().mo7398C(f4Var.mo6956t(), C1957u.f6375k0)) {
            if (TextUtils.isEmpty(f4Var.mo6898A()) && TextUtils.isEmpty(f4Var.mo6901D())) {
                mo7434A(f4Var.mo6956t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(f4Var.mo6898A()) && TextUtils.isEmpty(f4Var.mo6904G()) && TextUtils.isEmpty(f4Var.mo6901D())) {
            mo7434A(f4Var.mo6956t(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String q = this.f6528j.mo7038b().mo7413q(f4Var);
        try {
            URL url = new URL(q);
            this.f6528j.mo6709i().mo6772M().mo6886b("Fetching remote configuration", f4Var.mo6956t());
            C4784t0 u = mo7443V().mo6731u(f4Var.mo6956t());
            String z = mo7443V().mo6733z(f4Var.mo6956t());
            if (u == null || TextUtils.isEmpty(z)) {
                aVar = null;
            } else {
                C3190a aVar2 = new C3190a();
                aVar2.put("If-Modified-Since", z);
                aVar = aVar2;
            }
            this.f6535q = true;
            C1794g4 X = mo7444X();
            String t = f4Var.mo6956t();
            C2016y9 y9Var = new C2016y9(this);
            X.mo6700b();
            X.mo7366r();
            C1658o.m7845j(url);
            C1658o.m7845j(y9Var);
            X.mo6706e().mo6697E(new C1842k4(X, t, url, (byte[]) null, aVar, y9Var));
        } catch (MalformedURLException unused) {
            this.f6528j.mo6709i().mo6764E().mo6887c("Failed to parse config URL. Not fetching. appId", C1746c4.m8178w(f4Var.mo6956t()), q);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m9130u(C1752ca caVar) {
        this.f6528j.mo6706e().mo6700b();
        C1753d dVar = new C1753d(this);
        dVar.mo7367s();
        this.f6521c = dVar;
        this.f6528j.mo7038b().mo7414r(this.f6519a);
        C1751c9 c9Var = new C1751c9(this);
        c9Var.mo7367s();
        this.f6527i = c9Var;
        C1872ma maVar = new C1872ma(this);
        maVar.mo7367s();
        this.f6524f = maVar;
        C1941s7 s7Var = new C1941s7(this);
        s7Var.mo7367s();
        this.f6526h = s7Var;
        C1955t9 t9Var = new C1955t9(this);
        t9Var.mo7367s();
        this.f6523e = t9Var;
        this.f6522d = new C1878n4(this);
        if (this.f6533o != this.f6534p) {
            this.f6528j.mo6709i().mo6764E().mo6887c("Not all upload components initialized", Integer.valueOf(this.f6533o), Integer.valueOf(this.f6534p));
        }
        this.f6529k = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142 A[Catch:{ all -> 0x0179, all -> 0x0182 }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7434A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m9124n0()
            r6.mo7453g0()
            com.google.android.gms.common.internal.C1658o.m7841f(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0182 }
        L_0x000e:
            com.google.android.gms.measurement.internal.h5 r1 = r6.f6528j     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6772M()     // Catch:{ all -> 0x0182 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0182 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0182 }
            r1.mo6886b(r2, r3)     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.d r1 = r6.mo7446Z()     // Catch:{ all -> 0x0182 }
            r1.mo6841t0()     // Catch:{ all -> 0x0182 }
            com.google.android.gms.measurement.internal.d r1 = r6.mo7446Z()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.f4 r1 = r1.mo6832j0(r7)     // Catch:{ all -> 0x0179 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r8 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo6709i()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6767H()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r7)     // Catch:{ all -> 0x0179 }
            r8.mo6886b(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.h5 r10 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r10 = r10.mo6708g()     // Catch:{ all -> 0x0179 }
            long r10 = r10.mo6587c()     // Catch:{ all -> 0x0179 }
            r1.mo6911N(r10)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r10 = r6.mo7446Z()     // Catch:{ all -> 0x0179 }
            r10.mo6823O(r1)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r10 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r10 = r10.mo6709i()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r10 = r10.mo6772M()     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            r10.mo6887c(r11, r1, r9)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.b5 r9 = r6.mo7443V()     // Catch:{ all -> 0x0179 }
            r9.mo6722B(r7)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r7 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.mo7051x()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f6135f     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r9 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.mo6708g()     // Catch:{ all -> 0x0179 }
            long r9 = r9.mo6587c()     // Catch:{ all -> 0x0179 }
            r7.mo7344b(r9)     // Catch:{ all -> 0x0179 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.h5 r7 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.p4 r7 = r7.mo7051x()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f6136g     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.h5 r8 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r8 = r8.mo6708g()     // Catch:{ all -> 0x0179 }
            long r8 = r8.mo6587c()     // Catch:{ all -> 0x0179 }
            r7.mo7344b(r8)     // Catch:{ all -> 0x0179 }
        L_0x00c5:
            r6.m9106H()     // Catch:{ all -> 0x0179 }
            goto L_0x016d
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0179 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x0179 }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0179 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0179 }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.b5 r9 = r6.mo7443V()     // Catch:{ all -> 0x0179 }
            boolean r9 = r9.mo6732y(r7, r10, r11)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d r7 = r6.mo7446Z()     // Catch:{ all -> 0x0182 }
        L_0x00fa:
            r7.mo6851y0()     // Catch:{ all -> 0x0182 }
            r6.f6535q = r0
            r6.m9107I()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.b5 r11 = r6.mo7443V()     // Catch:{ all -> 0x0179 }
            g.d.a.c.f.f.t0 r11 = r11.mo6731u(r7)     // Catch:{ all -> 0x0179 }
            if (r11 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.b5 r11 = r6.mo7443V()     // Catch:{ all -> 0x0179 }
            boolean r9 = r11.mo6732y(r7, r9, r9)     // Catch:{ all -> 0x0179 }
            if (r9 != 0) goto L_0x011c
            com.google.android.gms.measurement.internal.d r7 = r6.mo7446Z()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x011c:
            com.google.android.gms.measurement.internal.h5 r9 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.common.util.e r9 = r9.mo6708g()     // Catch:{ all -> 0x0179 }
            long r2 = r9.mo6587c()     // Catch:{ all -> 0x0179 }
            r1.mo6908K(r2)     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r9 = r6.mo7446Z()     // Catch:{ all -> 0x0179 }
            r9.mo6823O(r1)     // Catch:{ all -> 0x0179 }
            if (r8 != r5) goto L_0x0142
            com.google.android.gms.measurement.internal.h5 r8 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo6709i()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r8 = r8.mo6769J()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo6886b(r9, r7)     // Catch:{ all -> 0x0179 }
            goto L_0x015a
        L_0x0142:
            com.google.android.gms.measurement.internal.h5 r7 = r6.f6528j     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.c4 r7 = r7.mo6709i()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.e4 r7 = r7.mo6772M()     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0179 }
            int r10 = r10.length     // Catch:{ all -> 0x0179 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0179 }
            r7.mo6887c(r9, r8, r10)     // Catch:{ all -> 0x0179 }
        L_0x015a:
            com.google.android.gms.measurement.internal.g4 r7 = r6.mo7444X()     // Catch:{ all -> 0x0179 }
            boolean r7 = r7.mo7010x()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            boolean r7 = r6.m9105G()     // Catch:{ all -> 0x0179 }
            if (r7 == 0) goto L_0x00c5
            r6.mo7455h0()     // Catch:{ all -> 0x0179 }
        L_0x016d:
            com.google.android.gms.measurement.internal.d r7 = r6.mo7446Z()     // Catch:{ all -> 0x0179 }
            r7.mo6842u()     // Catch:{ all -> 0x0179 }
            com.google.android.gms.measurement.internal.d r7 = r6.mo7446Z()     // Catch:{ all -> 0x0182 }
            goto L_0x00fa
        L_0x0179:
            r7 = move-exception
            com.google.android.gms.measurement.internal.d r8 = r6.mo7446Z()     // Catch:{ all -> 0x0182 }
            r8.mo6851y0()     // Catch:{ all -> 0x0182 }
            throw r7     // Catch:{ all -> 0x0182 }
        L_0x0182:
            r7 = move-exception
            r6.f6535q = r0
            r6.m9107I()
            goto L_0x018a
        L_0x0189:
            throw r7
        L_0x018a:
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.mo7434A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo7435B(String str, C1765e eVar) {
        if (C4602ib.m19620b() && this.f6528j.mo7038b().mo7415s(C1957u.f6340Q0)) {
            m9124n0();
            mo7453g0();
            this.f6543y.put(str, eVar);
            C1753d Z = mo7446Z();
            if (C4602ib.m19620b() && Z.mo6712l().mo7415s(C1957u.f6340Q0)) {
                C1658o.m7845j(str);
                C1658o.m7845j(eVar);
                Z.mo6700b();
                Z.mo7366r();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", eVar.mo6873e());
                try {
                    if (Z.mo6844v().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                        Z.mo6709i().mo6764E().mo6886b("Failed to insert/update consent setting (got -1). appId", C1746c4.m8178w(str));
                    }
                } catch (SQLiteException e) {
                    Z.mo6709i().mo6764E().mo6887c("Error storing consent setting. appId, error", C1746c4.m8178w(str), e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo7436C(boolean z) {
        m9106H();
    }

    /* renamed from: L */
    public final C1992wa mo7437L() {
        return this.f6528j.mo7038b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo7438Q(C1776ea eaVar, C1860la laVar) {
        m9124n0();
        mo7453g0();
        if (m9116a0(laVar)) {
            if (!laVar.f6021m) {
                mo7442U(laVar);
            } else if (!"_npa".equals(eaVar.f5774g) || laVar.f6032x == null) {
                this.f6528j.mo6709i().mo6771L().mo6886b("Removing user property", this.f6528j.mo7025H().mo6694z(eaVar.f5774g));
                mo7446Z().mo6841t0();
                try {
                    mo7442U(laVar);
                    mo7446Z().mo6834l0(laVar.f6014f, eaVar.f5774g);
                    mo7446Z().mo6842u();
                    this.f6528j.mo6709i().mo6771L().mo6886b("User property removed", this.f6528j.mo7025H().mo6694z(eaVar.f5774g));
                } finally {
                    mo7446Z().mo6851y0();
                }
            } else {
                this.f6528j.mo6709i().mo6771L().mo6885a("Falling back to manifest metadata value for ad personalization");
                mo7463v(new C1776ea("_npa", this.f6528j.mo6708g().mo6587c(), Long.valueOf(laVar.f6032x.booleanValue() ? 1 : 0), "auto"), laVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0455 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x048b A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d2 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0206 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0208 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022f A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0235 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0242 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0251 A[Catch:{ SQLiteException -> 0x01bd, all -> 0x04b5 }] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7439R(com.google.android.gms.measurement.internal.C1860la r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.m9124n0()
            r21.mo7453g0()
            com.google.android.gms.common.internal.C1658o.m7845j(r22)
            java.lang.String r7 = r2.f6014f
            com.google.android.gms.common.internal.C1658o.m7841f(r7)
            boolean r7 = r21.m9116a0(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.d r7 = r21.mo7446Z()
            java.lang.String r8 = r2.f6014f
            com.google.android.gms.measurement.internal.f4 r7 = r7.mo6832j0(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.mo6898A()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.f6015g
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.mo6908K(r8)
            com.google.android.gms.measurement.internal.d r10 = r21.mo7446Z()
            r10.mo6823O(r7)
            com.google.android.gms.measurement.internal.b5 r7 = r21.mo7443V()
            java.lang.String r10 = r2.f6014f
            r7.mo6725E(r10)
        L_0x0056:
            boolean r7 = r2.f6021m
            if (r7 != 0) goto L_0x005e
            r21.mo7442U(r22)
            return
        L_0x005e:
            long r10 = r2.f6026r
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j
            com.google.android.gms.common.util.e r7 = r7.mo6708g()
            long r10 = r7.mo6587c()
        L_0x006e:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j
            com.google.android.gms.measurement.internal.m r7 = r7.mo7034Q()
            r7.mo7235x()
            int r7 = r2.f6027s
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j
            com.google.android.gms.measurement.internal.c4 r12 = r12.mo6709i()
            com.google.android.gms.measurement.internal.e4 r12 = r12.mo6767H()
            java.lang.String r13 = r2.f6014f
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.mo6887c(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.d r12 = r21.mo7446Z()
            r12.mo6841t0()
            com.google.android.gms.measurement.internal.d r12 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.ga r14 = r12.mo6836o0(r13, r14)     // Catch:{ all -> 0x04b5 }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.f5853b     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r18 = r3
            r3 = 1
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.f6032x     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.ea r13 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r18 = "_npa"
            java.lang.Boolean r12 = r2.f6032x     // Catch:{ all -> 0x04b5 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x00cf
            r19 = 1
            goto L_0x00d1
        L_0x00cf:
            r19 = r8
        L_0x00d1:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x04b5 }
            java.lang.String r20 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r18
            r18 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.f5856e     // Catch:{ all -> 0x04b5 }
            java.lang.Long r12 = r8.f5776i     // Catch:{ all -> 0x04b5 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04b5 }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.mo7463v(r8, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x010f
        L_0x00f9:
            r18 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.ea r8 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.mo7438Q(r8, r2)     // Catch:{ all -> 0x04b5 }
        L_0x010f:
            com.google.android.gms.measurement.internal.d r8 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r9 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.f4 r8 = r8.mo6832j0(r9)     // Catch:{ all -> 0x04b5 }
            if (r8 == 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            r12.mo7024G()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r2.f6015g     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = r8.mo6898A()     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = r2.f6031w     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = r8.mo6901D()     // Catch:{ all -> 0x04b5 }
            boolean r12 = com.google.android.gms.measurement.internal.C1788fa.m8461j0(r12, r13, r14, r15)     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.mo6709i()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.mo6767H()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r14 = r8.mo6956t()     // Catch:{ all -> 0x04b5 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r14)     // Catch:{ all -> 0x04b5 }
            r12.mo6886b(r13, r14)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.d r12 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r8 = r8.mo6956t()     // Catch:{ all -> 0x04b5 }
            r12.mo7366r()     // Catch:{ all -> 0x04b5 }
            r12.mo6700b()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.C1658o.m7841f(r8)     // Catch:{ all -> 0x04b5 }
            android.database.sqlite.SQLiteDatabase r13 = r12.mo6844v()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01bd }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String r9 = "events"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "apps"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01bd }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x01cf
            com.google.android.gms.measurement.internal.c4 r0 = r12.mo6709i()     // Catch:{ SQLiteException -> 0x01bd }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6772M()     // Catch:{ SQLiteException -> 0x01bd }
            java.lang.String r13 = "Deleted application data. app, records"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x01bd }
            r0.mo6887c(r13, r8, r9)     // Catch:{ SQLiteException -> 0x01bd }
            goto L_0x01cf
        L_0x01bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r9 = r12.mo6709i()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r9 = r9.mo6764E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r8)     // Catch:{ all -> 0x04b5 }
            r9.mo6887c(r12, r8, r0)     // Catch:{ all -> 0x04b5 }
        L_0x01cf:
            r8 = 0
        L_0x01d0:
            if (r8 == 0) goto L_0x022f
            long r12 = r8.mo6919V()     // Catch:{ all -> 0x04b5 }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01ea
            long r12 = r8.mo6919V()     // Catch:{ all -> 0x04b5 }
            r9 = r4
            long r3 = r2.f6023o     // Catch:{ all -> 0x04b5 }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x01eb
            r0 = 1
            goto L_0x01ec
        L_0x01ea:
            r9 = r4
        L_0x01eb:
            r0 = 0
        L_0x01ec:
            long r3 = r8.mo6919V()     // Catch:{ all -> 0x04b5 }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0208
            java.lang.String r3 = r8.mo6917T()     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x0208
            java.lang.String r3 = r8.mo6917T()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.f6016h     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04b5 }
            if (r3 != 0) goto L_0x0208
            r14 = 1
            goto L_0x0209
        L_0x0208:
            r14 = 0
        L_0x0209:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0230
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.mo6917T()     // Catch:{ all -> 0x04b5 }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_au"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
            r1.mo7460p(r3, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x0230
        L_0x022f:
            r9 = r4
        L_0x0230:
            r21.mo7442U(r22)     // Catch:{ all -> 0x04b5 }
            if (r7 != 0) goto L_0x0242
            com.google.android.gms.measurement.internal.d r0 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = "_f"
        L_0x023d:
            com.google.android.gms.measurement.internal.o r0 = r0.mo6810D(r3, r4)     // Catch:{ all -> 0x04b5 }
            goto L_0x024f
        L_0x0242:
            r3 = 1
            if (r7 != r3) goto L_0x024e
            com.google.android.gms.measurement.internal.d r0 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = "_v"
            goto L_0x023d
        L_0x024e:
            r0 = 0
        L_0x024f:
            if (r0 != 0) goto L_0x048b
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03eb
            com.google.android.gms.measurement.internal.ea r7 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.mo7463v(r7, r2)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r2.f6015g     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C1957u.f6343S     // Catch:{ all -> 0x04b5 }
            boolean r7 = r7.mo7398C(r12, r13)     // Catch:{ all -> 0x04b5 }
            if (r7 == 0) goto L_0x0296
            r21.m9124n0()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.u4 r7 = r7.mo7021D()     // Catch:{ all -> 0x04b5 }
            java.lang.String r12 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            r7.mo7361b(r12)     // Catch:{ all -> 0x04b5 }
        L_0x0296:
            r21.m9124n0()     // Catch:{ all -> 0x04b5 }
            r21.mo7453g0()     // Catch:{ all -> 0x04b5 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r7.<init>()     // Catch:{ all -> 0x04b5 }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04b5 }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04b5 }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04b5 }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04b5 }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04b5 }
            r14 = r18
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r3 = r3.mo7038b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6347U     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.mo7398C(r4, r12)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x02cf
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x02d1
        L_0x02cf:
            r3 = 1
        L_0x02d1:
            boolean r12 = r2.f6030v     // Catch:{ all -> 0x04b5 }
            if (r12 == 0) goto L_0x02d8
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04b5 }
        L_0x02d8:
            com.google.android.gms.measurement.internal.d r0 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.common.internal.C1658o.m7841f(r3)     // Catch:{ all -> 0x04b5 }
            r0.mo6700b()     // Catch:{ all -> 0x04b5 }
            r0.mo7366r()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.mo6805A0(r3, r4)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            android.content.Context r0 = r0.mo6710j()     // Catch:{ all -> 0x04b5 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x0312
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r9)     // Catch:{ all -> 0x04b5 }
            r0.mo6886b(r6, r9)     // Catch:{ all -> 0x04b5 }
        L_0x030e:
            r12 = 0
            goto L_0x03cf
        L_0x0312:
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ NameNotFoundException -> 0x0324 }
            android.content.Context r0 = r0.mo6710j()     // Catch:{ NameNotFoundException -> 0x0324 }
            g.d.a.c.d.p.b r0 = p148g.p189d.p190a.p232c.p237d.p239p.C4389c.m18627a(r0)     // Catch:{ NameNotFoundException -> 0x0324 }
            java.lang.String r12 = r2.f6014f     // Catch:{ NameNotFoundException -> 0x0324 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.mo13717e(r12, r13)     // Catch:{ NameNotFoundException -> 0x0324 }
            goto L_0x033b
        L_0x0324:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.mo6709i()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.mo6764E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r15)     // Catch:{ all -> 0x04b5 }
            r12.mo6887c(r13, r15, r0)     // Catch:{ all -> 0x04b5 }
            r0 = 0
        L_0x033b:
            if (r0 == 0) goto L_0x038b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04b5 }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x038b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04b5 }
            r18 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04b5 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x036e
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r0 = r0.mo7038b()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6385p0     // Catch:{ all -> 0x04b5 }
            boolean r0 = r0.mo7415s(r12)     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x0369
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x036c
            r12 = 1
        L_0x0365:
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x036c
        L_0x0369:
            r12 = 1
            goto L_0x0365
        L_0x036c:
            r14 = 0
            goto L_0x036f
        L_0x036e:
            r14 = 1
        L_0x036f:
            com.google.android.gms.measurement.internal.ea r0 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x0378
            r14 = 1
            goto L_0x037a
        L_0x0378:
            r14 = 0
        L_0x037a:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04b5 }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r18
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.mo7463v(r0, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x038c
        L_0x038b:
            r6 = r14
        L_0x038c:
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ NameNotFoundException -> 0x039e }
            android.content.Context r0 = r0.mo6710j()     // Catch:{ NameNotFoundException -> 0x039e }
            g.d.a.c.d.p.b r0 = p148g.p189d.p190a.p232c.p237d.p239p.C4389c.m18627a(r0)     // Catch:{ NameNotFoundException -> 0x039e }
            java.lang.String r12 = r2.f6014f     // Catch:{ NameNotFoundException -> 0x039e }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo13715c(r12, r13)     // Catch:{ NameNotFoundException -> 0x039e }
            goto L_0x03b5
        L_0x039e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.c4 r12 = r12.mo6709i()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.e4 r12 = r12.mo6764E()     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r14)     // Catch:{ all -> 0x04b5 }
            r12.mo6887c(r13, r14, r0)     // Catch:{ all -> 0x04b5 }
            r0 = 0
        L_0x03b5:
            if (r0 == 0) goto L_0x030e
            int r12 = r0.flags     // Catch:{ all -> 0x04b5 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03c2
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04b5 }
        L_0x03c2:
            int r0 = r0.flags     // Catch:{ all -> 0x04b5 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x030e
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04b5 }
            goto L_0x030e
        L_0x03cf:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03d6
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04b5 }
        L_0x03d6:
            com.google.android.gms.measurement.internal.s r0 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_f"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r7)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
        L_0x03e7:
            r1.m9112O(r0, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x0445
        L_0x03eb:
            r5 = 1
            if (r7 != r5) goto L_0x0445
            com.google.android.gms.measurement.internal.ea r5 = new com.google.android.gms.measurement.internal.ea     // Catch:{ all -> 0x04b5 }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04b5 }
            r1.mo7463v(r5, r2)     // Catch:{ all -> 0x04b5 }
            r21.m9124n0()     // Catch:{ all -> 0x04b5 }
            r21.mo7453g0()     // Catch:{ all -> 0x04b5 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r5.<init>()     // Catch:{ all -> 0x04b5 }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04b5 }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r3 = r3.mo7038b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C1957u.f6347U     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.mo7398C(r4, r6)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x042a
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x042c
        L_0x042a:
            r3 = 1
        L_0x042c:
            boolean r6 = r2.f6030v     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0433
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04b5 }
        L_0x0433:
            com.google.android.gms.measurement.internal.s r0 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_v"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r5)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
            goto L_0x03e7
        L_0x0445:
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r0 = r0.mo7038b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6349V     // Catch:{ all -> 0x04b5 }
            boolean r0 = r0.mo7398C(r3, r4)     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x04a6
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.wa r3 = r3.mo7038b()     // Catch:{ all -> 0x04b5 }
            java.lang.String r4 = r2.f6014f     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C1957u.f6347U     // Catch:{ all -> 0x04b5 }
            boolean r3 = r3.mo7398C(r4, r5)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x0476
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04b5 }
        L_0x0476:
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_e"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
        L_0x0487:
            r1.m9112O(r3, r2)     // Catch:{ all -> 0x04b5 }
            goto L_0x04a6
        L_0x048b:
            boolean r0 = r2.f6022n     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x04a6
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04b5 }
            r0.<init>()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.s r3 = new com.google.android.gms.measurement.internal.s     // Catch:{ all -> 0x04b5 }
            java.lang.String r13 = "_cd"
            com.google.android.gms.measurement.internal.n r14 = new com.google.android.gms.measurement.internal.n     // Catch:{ all -> 0x04b5 }
            r14.<init>(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04b5 }
            goto L_0x0487
        L_0x04a6:
            com.google.android.gms.measurement.internal.d r0 = r21.mo7446Z()     // Catch:{ all -> 0x04b5 }
            r0.mo6842u()     // Catch:{ all -> 0x04b5 }
            com.google.android.gms.measurement.internal.d r0 = r21.mo7446Z()
            r0.mo6851y0()
            return
        L_0x04b5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.d r2 = r21.mo7446Z()
            r2.mo6851y0()
            goto L_0x04bf
        L_0x04be:
            throw r0
        L_0x04bf:
            goto L_0x04be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.mo7439R(com.google.android.gms.measurement.internal.la):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo7440S(C1968ua uaVar) {
        C1860la K = m9109K(uaVar.f6434f);
        if (K != null) {
            mo7441T(uaVar, K);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo7441T(C1968ua uaVar, C1860la laVar) {
        C1658o.m7845j(uaVar);
        C1658o.m7841f(uaVar.f6434f);
        C1658o.m7845j(uaVar.f6436h);
        C1658o.m7841f(uaVar.f6436h.f5774g);
        m9124n0();
        mo7453g0();
        if (m9116a0(laVar)) {
            if (!laVar.f6021m) {
                mo7442U(laVar);
                return;
            }
            mo7446Z().mo6841t0();
            try {
                mo7442U(laVar);
                C1968ua p0 = mo7446Z().mo6837p0(uaVar.f6434f, uaVar.f6436h.f5774g);
                if (p0 != null) {
                    this.f6528j.mo6709i().mo6771L().mo6887c("Removing conditional user property", uaVar.f6434f, this.f6528j.mo7025H().mo6694z(uaVar.f6436h.f5774g));
                    mo7446Z().mo6839r0(uaVar.f6434f, uaVar.f6436h.f5774g);
                    if (p0.f6438j) {
                        mo7446Z().mo6834l0(uaVar.f6434f, uaVar.f6436h.f5774g);
                    }
                    if (uaVar.f6444p != null) {
                        Bundle bundle = null;
                        if (uaVar.f6444p.f6238g != null) {
                            bundle = uaVar.f6444p.f6238g.mo7245i();
                        }
                        m9114W(this.f6528j.mo7024G().mo6975E(uaVar.f6434f, uaVar.f6444p.f6237f, bundle, p0.f6435g, uaVar.f6444p.f6240i, true, false, C4729pa.m20169b() && this.f6528j.mo7038b().mo7415s(C1957u.f6346T0)), laVar);
                    }
                } else {
                    this.f6528j.mo6709i().mo6767H().mo6887c("Conditional user property doesn't exist", C1746c4.m8178w(uaVar.f6434f), this.f6528j.mo7025H().mo6694z(uaVar.f6436h.f5774g));
                }
                mo7446Z().mo6842u();
            } finally {
                mo7446Z().mo6851y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a8, code lost:
        if (r1.mo6880o() != false) goto L_0x00b2;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1782f4 mo7442U(com.google.android.gms.measurement.internal.C1860la r7) {
        /*
            r6 = this;
            r6.m9124n0()
            r6.mo7453g0()
            com.google.android.gms.common.internal.C1658o.m7845j(r7)
            java.lang.String r0 = r7.f6014f
            com.google.android.gms.common.internal.C1658o.m7841f(r0)
            com.google.android.gms.measurement.internal.d r0 = r6.mo7446Z()
            java.lang.String r1 = r7.f6014f
            com.google.android.gms.measurement.internal.f4 r0 = r0.mo6832j0(r1)
            com.google.android.gms.measurement.internal.e r1 = com.google.android.gms.measurement.internal.C1765e.f5741c
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r2 == 0) goto L_0x003e
            com.google.android.gms.measurement.internal.h5 r2 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x003e
            java.lang.String r1 = r7.f6014f
            com.google.android.gms.measurement.internal.e r1 = r6.mo7447b(r1)
            java.lang.String r2 = r7.f6013B
            com.google.android.gms.measurement.internal.e r2 = com.google.android.gms.measurement.internal.C1765e.m8334b(r2)
            com.google.android.gms.measurement.internal.e r1 = r1.mo6877k(r2)
        L_0x003e:
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.h5 r2 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x005c
            boolean r2 = r1.mo6880o()
            if (r2 == 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            java.lang.String r2 = ""
            goto L_0x0064
        L_0x005c:
            com.google.android.gms.measurement.internal.c9 r2 = r6.f6527i
            java.lang.String r3 = r7.f6014f
            java.lang.String r2 = r2.mo6803v(r3)
        L_0x0064:
            boolean r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4568gc.m19535b()
            if (r3 == 0) goto L_0x01a1
            com.google.android.gms.measurement.internal.h5 r3 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r3 = r3.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6387q0
            boolean r3 = r3.mo7415s(r4)
            if (r3 == 0) goto L_0x01a1
            if (r0 != 0) goto L_0x00b6
            com.google.android.gms.measurement.internal.f4 r0 = new com.google.android.gms.measurement.internal.f4
            com.google.android.gms.measurement.internal.h5 r3 = r6.f6528j
            java.lang.String r4 = r7.f6014f
            r0.<init>(r3, r4)
            boolean r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r3 == 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.h5 r3 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r3 = r3.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r3 = r3.mo7415s(r4)
            if (r3 == 0) goto L_0x00ab
            boolean r3 = r1.mo6882q()
            if (r3 == 0) goto L_0x00a4
            java.lang.String r3 = r6.m9119f(r1)
            r0.mo6928c(r3)
        L_0x00a4:
            boolean r1 = r1.mo6880o()
            if (r1 == 0) goto L_0x00fd
            goto L_0x00b2
        L_0x00ab:
            java.lang.String r1 = r6.m9127p0()
            r0.mo6928c(r1)
        L_0x00b2:
            r0.mo6900C(r2)
            goto L_0x00fd
        L_0x00b6:
            boolean r3 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r3 == 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.h5 r3 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r3 = r3.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r3 = r3.mo7415s(r4)
            if (r3 == 0) goto L_0x00d0
            boolean r3 = r1.mo6880o()
            if (r3 == 0) goto L_0x00fd
        L_0x00d0:
            java.lang.String r3 = r0.mo6907J()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00fd
            r0.mo6900C(r2)
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r2 == 0) goto L_0x00f6
            com.google.android.gms.measurement.internal.h5 r2 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r2 = r2.mo7415s(r3)
            if (r2 == 0) goto L_0x00f6
            java.lang.String r1 = r6.m9119f(r1)
            goto L_0x00fa
        L_0x00f6:
            java.lang.String r1 = r6.m9127p0()
        L_0x00fa:
            r0.mo6928c(r1)
        L_0x00fd:
            java.lang.String r1 = r7.f6015g
            r0.mo6954r(r1)
            java.lang.String r1 = r7.f6031w
            r0.mo6958v(r1)
            boolean r1 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()
            if (r1 == 0) goto L_0x0124
            com.google.android.gms.measurement.internal.h5 r1 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r1 = r1.mo7038b()
            java.lang.String r2 = r0.mo6956t()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C1957u.f6375k0
            boolean r1 = r1.mo7398C(r2, r3)
            if (r1 == 0) goto L_0x0124
            java.lang.String r1 = r7.f6012A
            r0.mo6962z(r1)
        L_0x0124:
            java.lang.String r1 = r7.f6024p
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0131
            java.lang.String r1 = r7.f6024p
            r0.mo6903F(r1)
        L_0x0131:
            long r1 = r7.f6018j
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x013c
            r0.mo6961y(r1)
        L_0x013c:
            java.lang.String r1 = r7.f6016h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0149
            java.lang.String r1 = r7.f6016h
            r0.mo6906I(r1)
        L_0x0149:
            long r1 = r7.f6023o
            r0.mo6957u(r1)
            java.lang.String r1 = r7.f6017i
            if (r1 == 0) goto L_0x0155
            r0.mo6909L(r1)
        L_0x0155:
            long r1 = r7.f6019k
            r0.mo6899B(r1)
            boolean r1 = r7.f6021m
            r0.mo6932e(r1)
            java.lang.String r1 = r7.f6020l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x016c
            java.lang.String r1 = r7.f6020l
            r0.mo6912O(r1)
        L_0x016c:
            com.google.android.gms.measurement.internal.h5 r1 = r6.f6528j
            com.google.android.gms.measurement.internal.wa r1 = r1.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C1957u.f6320G0
            boolean r1 = r1.mo7415s(r2)
            if (r1 != 0) goto L_0x017f
            long r1 = r7.f6025q
            r0.mo6929c0(r1)
        L_0x017f:
            boolean r1 = r7.f6028t
            r0.mo6955s(r1)
            boolean r1 = r7.f6029u
            r0.mo6959w(r1)
            java.lang.Boolean r1 = r7.f6032x
            r0.mo6926b(r1)
            long r1 = r7.f6033y
            r0.mo6902E(r1)
            boolean r7 = r0.mo6934f()
            if (r7 == 0) goto L_0x01a0
            com.google.android.gms.measurement.internal.d r7 = r6.mo7446Z()
            r7.mo6823O(r0)
        L_0x01a0:
            return r0
        L_0x01a1:
            com.google.android.gms.measurement.internal.f4 r7 = r6.m9117c(r7, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.mo7442U(com.google.android.gms.measurement.internal.la):com.google.android.gms.measurement.internal.f4");
    }

    /* renamed from: V */
    public final C1735b5 mo7443V() {
        m9113P(this.f6519a);
        return this.f6519a;
    }

    /* renamed from: X */
    public final C1794g4 mo7444X() {
        m9113P(this.f6520b);
        return this.f6520b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final String mo7445Y(C1860la laVar) {
        try {
            return (String) this.f6528j.mo6706e().mo6702v(new C1728aa(this, laVar)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f6528j.mo6709i().mo6764E().mo6887c("Failed to get app instance id. appId", C1746c4.m8178w(laVar.f6014f), e);
            return null;
        }
    }

    /* renamed from: Z */
    public final C1753d mo7446Z() {
        m9113P(this.f6521c);
        return this.f6521c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1765e mo7447b(String str) {
        C1765e eVar = C1765e.f5741c;
        if (C4602ib.m19620b() && this.f6528j.mo7038b().mo7415s(C1957u.f6340Q0)) {
            m9124n0();
            mo7453g0();
            eVar = this.f6543y.get(str);
            if (eVar == null) {
                eVar = mo7446Z().mo6809C0(str);
                if (eVar == null) {
                    eVar = C1765e.f5741c;
                }
                mo7435B(str, eVar);
            }
        }
        return eVar;
    }

    /* renamed from: b0 */
    public final C1872ma mo7448b0() {
        m9113P(this.f6524f);
        return this.f6524f;
    }

    /* renamed from: c0 */
    public final C1941s7 mo7449c0() {
        m9113P(this.f6526h);
        return this.f6526h;
    }

    /* renamed from: d0 */
    public final C1740ba mo7450d0() {
        m9113P(this.f6525g);
        return this.f6525g;
    }

    /* renamed from: e */
    public final C1723a5 mo6706e() {
        return this.f6528j.mo6706e();
    }

    /* renamed from: e0 */
    public final C1722a4 mo7451e0() {
        return this.f6528j.mo7025H();
    }

    /* renamed from: f0 */
    public final C1788fa mo7452f0() {
        return this.f6528j.mo7024G();
    }

    /* renamed from: g */
    public final C1682e mo6708g() {
        return this.f6528j.mo6708g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void mo7453g0() {
        if (!this.f6529k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo7454h() {
        this.f6528j.mo6706e().mo6700b();
        mo7446Z().mo6811D0();
        if (this.f6528j.mo7051x().f6134e.mo7343a() == 0) {
            this.f6528j.mo7051x().f6134e.mo7344b(this.f6528j.mo6708g().mo6587c());
        }
        m9106H();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:125|126) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r1.f6528j.mo6709i().mo6764E().mo6887c("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C1746c4.m8178w(r5), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0353 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a2 A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b3 A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02d7 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d9 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02e1 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f1 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0309 A[Catch:{ MalformedURLException -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x020a A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020b A[Catch:{ all -> 0x038c }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0211 A[Catch:{ all -> 0x038c }] */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7455h0() {
        /*
            r17 = this;
            r1 = r17
            r17.m9124n0()
            r17.mo7453g0()
            r0 = 1
            r1.f6537s = r0
            r2 = 0
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c8 r3 = r3.mo7033P()     // Catch:{ all -> 0x038c }
            java.lang.Boolean r3 = r3.mo6797a0()     // Catch:{ all -> 0x038c }
            if (r3 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6767H()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0024:
            r0.mo6885a(r3)     // Catch:{ all -> 0x038c }
        L_0x0027:
            r1.f6537s = r2
            r17.m9107I()
            return
        L_0x002d:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x038c }
            if (r3 == 0) goto L_0x0040
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6764E()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0024
        L_0x0040:
            long r3 = r1.f6531m     // Catch:{ all -> 0x038c }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x004c
        L_0x0048:
            r17.m9106H()     // Catch:{ all -> 0x038c }
            goto L_0x0027
        L_0x004c:
            r17.m9124n0()     // Catch:{ all -> 0x038c }
            java.util.List<java.lang.Long> r3 = r1.f6540v     // Catch:{ all -> 0x038c }
            if (r3 == 0) goto L_0x0055
            r3 = 1
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            if (r3 == 0) goto L_0x0065
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6772M()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0024
        L_0x0065:
            com.google.android.gms.measurement.internal.g4 r3 = r17.mo7444X()     // Catch:{ all -> 0x038c }
            boolean r3 = r3.mo7010x()     // Catch:{ all -> 0x038c }
            if (r3 != 0) goto L_0x007f
            com.google.android.gms.measurement.internal.h5 r0 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo6709i()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r0 = r0.mo6772M()     // Catch:{ all -> 0x038c }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo6885a(r3)     // Catch:{ all -> 0x038c }
            goto L_0x0048
        L_0x007f:
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.common.util.e r3 = r3.mo6708g()     // Catch:{ all -> 0x038c }
            long r3 = r3.mo6587c()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C1957u.f6339Q     // Catch:{ all -> 0x038c }
            r9 = 0
            int r7 = r7.mo7417u(r9, r8)     // Catch:{ all -> 0x038c }
            long r10 = com.google.android.gms.measurement.internal.C1992wa.m9066L()     // Catch:{ all -> 0x038c }
            long r10 = r3 - r10
            r8 = 0
        L_0x009d:
            if (r8 >= r7) goto L_0x00a8
            boolean r12 = r1.m9104F(r9, r10)     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x00a8
            int r8 = r8 + 1
            goto L_0x009d
        L_0x00a8:
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.p4 r7 = r7.mo7051x()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f6134e     // Catch:{ all -> 0x038c }
            long r7 = r7.mo7343a()     // Catch:{ all -> 0x038c }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00d1
            com.google.android.gms.measurement.internal.h5 r5 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo6709i()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r5 = r5.mo6771L()     // Catch:{ all -> 0x038c }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x038c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x038c }
            r5.mo6886b(r6, r7)     // Catch:{ all -> 0x038c }
        L_0x00d1:
            com.google.android.gms.measurement.internal.d r5 = r17.mo7446Z()     // Catch:{ all -> 0x038c }
            java.lang.String r5 = r5.mo6846w()     // Catch:{ all -> 0x038c }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x038c }
            r7 = -1
            if (r6 != 0) goto L_0x0368
            long r10 = r1.f6542x     // Catch:{ all -> 0x038c }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00f1
            com.google.android.gms.measurement.internal.d r6 = r17.mo7446Z()     // Catch:{ all -> 0x038c }
            long r6 = r6.mo6818I0()     // Catch:{ all -> 0x038c }
            r1.f6542x = r6     // Catch:{ all -> 0x038c }
        L_0x00f1:
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r6 = r6.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C1957u.f6366g     // Catch:{ all -> 0x038c }
            int r6 = r6.mo7417u(r5, r7)     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C1957u.f6368h     // Catch:{ all -> 0x038c }
            int r7 = r7.mo7417u(r5, r8)     // Catch:{ all -> 0x038c }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.d r8 = r17.mo7446Z()     // Catch:{ all -> 0x038c }
            java.util.List r6 = r8.mo6819J(r5, r6, r7)     // Catch:{ all -> 0x038c }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x038c }
            if (r7 != 0) goto L_0x0027
            boolean r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x038c }
            if (r7 == 0) goto L_0x0139
            com.google.android.gms.measurement.internal.h5 r7 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r7 = r7.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x038c }
            boolean r7 = r7.mo7415s(r8)     // Catch:{ all -> 0x038c }
            if (r7 == 0) goto L_0x0139
            com.google.android.gms.measurement.internal.e r7 = r1.mo7447b(r5)     // Catch:{ all -> 0x038c }
            boolean r7 = r7.mo6880o()     // Catch:{ all -> 0x038c }
            if (r7 == 0) goto L_0x018c
        L_0x0139:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x038c }
        L_0x013d:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x038c }
            if (r8 == 0) goto L_0x015c
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x038c }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x038c }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.d1 r8 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r8     // Catch:{ all -> 0x038c }
            java.lang.String r10 = r8.mo13934b0()     // Catch:{ all -> 0x038c }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x038c }
            if (r10 != 0) goto L_0x013d
            java.lang.String r7 = r8.mo13934b0()     // Catch:{ all -> 0x038c }
            goto L_0x015d
        L_0x015c:
            r7 = r9
        L_0x015d:
            if (r7 == 0) goto L_0x018c
            r8 = 0
        L_0x0160:
            int r10 = r6.size()     // Catch:{ all -> 0x038c }
            if (r8 >= r10) goto L_0x018c
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x038c }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x038c }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.d1 r10 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r10     // Catch:{ all -> 0x038c }
            java.lang.String r11 = r10.mo13934b0()     // Catch:{ all -> 0x038c }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x038c }
            if (r11 != 0) goto L_0x0189
            java.lang.String r10 = r10.mo13934b0()     // Catch:{ all -> 0x038c }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x038c }
            if (r10 != 0) goto L_0x0189
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x038c }
            goto L_0x018c
        L_0x0189:
            int r8 = r8 + 1
            goto L_0x0160
        L_0x018c:
            g.d.a.c.f.f.c1$a r7 = p148g.p189d.p190a.p232c.p241f.p247f.C4481c1.m18938F()     // Catch:{ all -> 0x038c }
            int r8 = r6.size()     // Catch:{ all -> 0x038c }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x038c }
            int r11 = r6.size()     // Catch:{ all -> 0x038c }
            r10.<init>(r11)     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()     // Catch:{ all -> 0x038c }
            boolean r11 = r11.mo7404I(r5)     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c9
            boolean r11 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c7
            com.google.android.gms.measurement.internal.h5 r11 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r11 = r11.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x038c }
            boolean r11 = r11.mo7415s(r12)     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c7
            com.google.android.gms.measurement.internal.e r11 = r1.mo7447b(r5)     // Catch:{ all -> 0x038c }
            boolean r11 = r11.mo6880o()     // Catch:{ all -> 0x038c }
            if (r11 == 0) goto L_0x01c9
        L_0x01c7:
            r11 = 1
            goto L_0x01ca
        L_0x01c9:
            r11 = 0
        L_0x01ca:
            boolean r12 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x01eb
            com.google.android.gms.measurement.internal.h5 r12 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r12 = r12.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x038c }
            boolean r12 = r12.mo7415s(r13)     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x01eb
            com.google.android.gms.measurement.internal.e r12 = r1.mo7447b(r5)     // Catch:{ all -> 0x038c }
            boolean r12 = r12.mo6880o()     // Catch:{ all -> 0x038c }
            if (r12 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r12 = 0
            goto L_0x01ec
        L_0x01eb:
            r12 = 1
        L_0x01ec:
            boolean r13 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x038c }
            if (r13 == 0) goto L_0x020d
            com.google.android.gms.measurement.internal.h5 r13 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r13 = r13.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x038c }
            boolean r13 = r13.mo7415s(r14)     // Catch:{ all -> 0x038c }
            if (r13 == 0) goto L_0x020d
            com.google.android.gms.measurement.internal.e r13 = r1.mo7447b(r5)     // Catch:{ all -> 0x038c }
            boolean r13 = r13.mo6882q()     // Catch:{ all -> 0x038c }
            if (r13 == 0) goto L_0x020b
            goto L_0x020d
        L_0x020b:
            r13 = 0
            goto L_0x020e
        L_0x020d:
            r13 = 1
        L_0x020e:
            r14 = 0
        L_0x020f:
            if (r14 >= r8) goto L_0x0293
            java.lang.Object r15 = r6.get(r14)     // Catch:{ all -> 0x038c }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x038c }
            java.lang.Object r15 = r15.first     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.d1 r15 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r15     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.z6$b r15 = r15.mo14813x()     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.d1$a r15 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1.C4500a) r15     // Catch:{ all -> 0x038c }
            java.lang.Object r16 = r6.get(r14)     // Catch:{ all -> 0x038c }
            r0 = r16
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x038c }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x038c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x038c }
            r10.add(r0)     // Catch:{ all -> 0x038c }
            r16 = r10
            r9 = 31049(0x7949, double:1.534E-319)
            r15.mo14012k0(r9)     // Catch:{ all -> 0x038c }
            r15.mo14030z(r3)     // Catch:{ all -> 0x038c }
            r15.mo13988M(r2)     // Catch:{ all -> 0x038c }
            if (r11 != 0) goto L_0x0242
            r15.mo13991N0()     // Catch:{ all -> 0x038c }
        L_0x0242:
            boolean r9 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()     // Catch:{ all -> 0x038c }
            if (r9 == 0) goto L_0x0263
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r9 = r9.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C1957u.f6340Q0     // Catch:{ all -> 0x038c }
            boolean r9 = r9.mo7415s(r10)     // Catch:{ all -> 0x038c }
            if (r9 == 0) goto L_0x0263
            if (r12 != 0) goto L_0x025e
            r15.mo14027x0()     // Catch:{ all -> 0x038c }
            r15.mo13966A0()     // Catch:{ all -> 0x038c }
        L_0x025e:
            if (r13 != 0) goto L_0x0263
            r15.mo13972D0()     // Catch:{ all -> 0x038c }
        L_0x0263:
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.wa r9 = r9.mo7038b()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.C1957u.f6352Y     // Catch:{ all -> 0x038c }
            boolean r9 = r9.mo7398C(r5, r10)     // Catch:{ all -> 0x038c }
            if (r9 == 0) goto L_0x0288
            g.d.a.c.f.f.l8 r9 = r15.mo14350h()     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.z6 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r9     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.d1 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4499d1) r9     // Catch:{ all -> 0x038c }
            byte[] r9 = r9.mo14268k()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.ba r10 = r17.mo7450d0()     // Catch:{ all -> 0x038c }
            long r9 = r10.mo6758v(r9)     // Catch:{ all -> 0x038c }
            r15.mo13968B0(r9)     // Catch:{ all -> 0x038c }
        L_0x0288:
            r7.mo13872v(r15)     // Catch:{ all -> 0x038c }
            int r14 = r14 + 1
            r10 = r16
            r0 = 1
            r9 = 0
            goto L_0x020f
        L_0x0293:
            r16 = r10
            com.google.android.gms.measurement.internal.h5 r6 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r6 = r6.mo6709i()     // Catch:{ all -> 0x038c }
            r9 = 2
            boolean r6 = r6.mo6763B(r9)     // Catch:{ all -> 0x038c }
            if (r6 == 0) goto L_0x02b3
            com.google.android.gms.measurement.internal.ba r6 = r17.mo7450d0()     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.l8 r9 = r7.mo14350h()     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.z6 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r9     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.c1 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4481c1) r9     // Catch:{ all -> 0x038c }
            java.lang.String r6 = r6.mo6748C(r9)     // Catch:{ all -> 0x038c }
            goto L_0x02b4
        L_0x02b3:
            r6 = 0
        L_0x02b4:
            r17.mo7450d0()     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.l8 r9 = r7.mo14350h()     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.z6 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4895z6) r9     // Catch:{ all -> 0x038c }
            g.d.a.c.f.f.c1 r9 = (p148g.p189d.p190a.p232c.p241f.p247f.C4481c1) r9     // Catch:{ all -> 0x038c }
            byte[] r14 = r9.mo14268k()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.r3<java.lang.String> r9 = com.google.android.gms.measurement.internal.C1957u.f6386q     // Catch:{ all -> 0x038c }
            r0 = 0
            java.lang.Object r0 = r9.mo7323a(r0)     // Catch:{ all -> 0x038c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x038c }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0353 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0353 }
            boolean r9 = r16.isEmpty()     // Catch:{ MalformedURLException -> 0x0353 }
            if (r9 != 0) goto L_0x02d9
            r9 = 1
            goto L_0x02da
        L_0x02d9:
            r9 = 0
        L_0x02da:
            com.google.android.gms.common.internal.C1658o.m7836a(r9)     // Catch:{ MalformedURLException -> 0x0353 }
            java.util.List<java.lang.Long> r9 = r1.f6540v     // Catch:{ MalformedURLException -> 0x0353 }
            if (r9 == 0) goto L_0x02f1
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.c4 r9 = r9.mo6709i()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.e4 r9 = r9.mo6764E()     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r9.mo6885a(r10)     // Catch:{ MalformedURLException -> 0x0353 }
            goto L_0x02fa
        L_0x02f1:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0353 }
            r10 = r16
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x0353 }
            r1.f6540v = r9     // Catch:{ MalformedURLException -> 0x0353 }
        L_0x02fa:
            com.google.android.gms.measurement.internal.h5 r9 = r1.f6528j     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.p4 r9 = r9.mo7051x()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.t4 r9 = r9.f6135f     // Catch:{ MalformedURLException -> 0x0353 }
            r9.mo7344b(r3)     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r3 = "?"
            if (r8 <= 0) goto L_0x0311
            g.d.a.c.f.f.d1 r3 = r7.mo13873x(r2)     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r3 = r3.mo13926U2()     // Catch:{ MalformedURLException -> 0x0353 }
        L_0x0311:
            com.google.android.gms.measurement.internal.h5 r4 = r1.f6528j     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6772M()     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x0353 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0353 }
            r4.mo6888d(r7, r3, r8, r6)     // Catch:{ MalformedURLException -> 0x0353 }
            r3 = 1
            r1.f6536r = r3     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.g4 r11 = r17.mo7444X()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.z9 r3 = new com.google.android.gms.measurement.internal.z9     // Catch:{ MalformedURLException -> 0x0353 }
            r3.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0353 }
            r11.mo6700b()     // Catch:{ MalformedURLException -> 0x0353 }
            r11.mo7366r()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.common.internal.C1658o.m7845j(r13)     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.common.internal.C1658o.m7845j(r14)     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.common.internal.C1658o.m7845j(r3)     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.a5 r4 = r11.mo6706e()     // Catch:{ MalformedURLException -> 0x0353 }
            com.google.android.gms.measurement.internal.k4 r6 = new com.google.android.gms.measurement.internal.k4     // Catch:{ MalformedURLException -> 0x0353 }
            r15 = 0
            r10 = r6
            r12 = r5
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0353 }
            r4.mo6697E(r6)     // Catch:{ MalformedURLException -> 0x0353 }
            goto L_0x0027
        L_0x0353:
            com.google.android.gms.measurement.internal.h5 r3 = r1.f6528j     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo6709i()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.e4 r3 = r3.mo6764E()     // Catch:{ all -> 0x038c }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r5)     // Catch:{ all -> 0x038c }
            r3.mo6887c(r4, r5, r0)     // Catch:{ all -> 0x038c }
            goto L_0x0027
        L_0x0368:
            r1.f6542x = r7     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.d r0 = r17.mo7446Z()     // Catch:{ all -> 0x038c }
            long r5 = com.google.android.gms.measurement.internal.C1992wa.m9066L()     // Catch:{ all -> 0x038c }
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo6814G(r3)     // Catch:{ all -> 0x038c }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x038c }
            if (r3 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.d r3 = r17.mo7446Z()     // Catch:{ all -> 0x038c }
            com.google.android.gms.measurement.internal.f4 r0 = r3.mo6832j0(r0)     // Catch:{ all -> 0x038c }
            if (r0 == 0) goto L_0x0027
            r1.m9128r(r0)     // Catch:{ all -> 0x038c }
            goto L_0x0027
        L_0x038c:
            r0 = move-exception
            r1.f6537s = r2
            r17.m9107I()
            goto L_0x0394
        L_0x0393:
            throw r0
        L_0x0394:
            goto L_0x0393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.mo7455h0():void");
    }

    /* renamed from: i */
    public final C1746c4 mo6709i() {
        return this.f6528j.mo6709i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final void mo7456i0() {
        String str;
        C1770e4 e4Var;
        Integer num;
        Integer num2;
        m9124n0();
        mo7453g0();
        if (!this.f6530l) {
            this.f6530l = true;
            if (m9108J()) {
                int a = m9115a(this.f6539u);
                int G = this.f6528j.mo7035R().mo7374G();
                m9124n0();
                if (a > G) {
                    e4Var = this.f6528j.mo6709i().mo6764E();
                    num2 = Integer.valueOf(a);
                    num = Integer.valueOf(G);
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a >= G) {
                    return;
                } else {
                    if (m9102D(G, this.f6539u)) {
                        e4Var = this.f6528j.mo6709i().mo6772M();
                        num2 = Integer.valueOf(a);
                        num = Integer.valueOf(G);
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        e4Var = this.f6528j.mo6709i().mo6764E();
                        num2 = Integer.valueOf(a);
                        num = Integer.valueOf(G);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                e4Var.mo6887c(str, num2, num);
            }
        }
    }

    /* renamed from: j */
    public final Context mo6710j() {
        return this.f6528j.mo6710j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final void mo7457j0() {
        this.f6534p++;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo7458k(int i, Throwable th, byte[] bArr, String str) {
        C1753d Z;
        m9124n0();
        mo7453g0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f6536r = false;
                m9107I();
                throw th2;
            }
        }
        List<Long> list = this.f6540v;
        this.f6540v = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f6528j.mo7051x().f6134e.mo7344b(this.f6528j.mo6708g().mo6587c());
                this.f6528j.mo7051x().f6135f.mo7344b(0);
                m9106H();
                this.f6528j.mo6709i().mo6772M().mo6887c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo7446Z().mo6841t0();
                try {
                    for (Long next : list) {
                        try {
                            Z = mo7446Z();
                            long longValue = next.longValue();
                            Z.mo6700b();
                            Z.mo7366r();
                            if (Z.mo6844v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            Z.mo6709i().mo6764E().mo6886b("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f6541w == null || !this.f6541w.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    mo7446Z().mo6842u();
                    mo7446Z().mo6851y0();
                    this.f6541w = null;
                    if (!mo7444X().mo7010x() || !m9105G()) {
                        this.f6542x = -1;
                        m9106H();
                    } else {
                        mo7455h0();
                    }
                    this.f6531m = 0;
                } catch (Throwable th3) {
                    mo7446Z().mo6851y0();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f6528j.mo6709i().mo6764E().mo6886b("Database error while trying to delete uploaded bundles", e3);
                this.f6531m = this.f6528j.mo6708g().mo6585a();
                this.f6528j.mo6709i().mo6772M().mo6886b("Disable upload, time", Long.valueOf(this.f6531m));
            }
        } else {
            this.f6528j.mo6709i().mo6772M().mo6887c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f6528j.mo7051x().f6135f.mo7344b(this.f6528j.mo6708g().mo6587c());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f6528j.mo7051x().f6136g.mo7344b(this.f6528j.mo6708g().mo6587c());
            }
            mo7446Z().mo6825Q(list);
            m9106H();
        }
        this.f6536r = false;
        m9107I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final C1807h5 mo7459k0() {
        return this.f6528j;
    }

    /* renamed from: n */
    public final C1980va mo6713n() {
        return this.f6528j.mo6713n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo7460p(C1933s sVar, C1860la laVar) {
        List<C1968ua> list;
        List<C1968ua> list2;
        List<C1968ua> list3;
        C1770e4 E;
        String str;
        Object w;
        String z;
        Object obj;
        C1933s sVar2 = sVar;
        C1860la laVar2 = laVar;
        C1658o.m7845j(laVar);
        C1658o.m7841f(laVar2.f6014f);
        m9124n0();
        mo7453g0();
        String str2 = laVar2.f6014f;
        long j = sVar2.f6240i;
        mo7450d0();
        if (C1740ba.m8146R(sVar, laVar)) {
            if (!laVar2.f6021m) {
                mo7442U(laVar2);
                return;
            }
            List<String> list4 = laVar2.f6034z;
            if (list4 != null) {
                if (list4.contains(sVar2.f6237f)) {
                    Bundle i = sVar2.f6238g.mo7245i();
                    i.putLong("ga_safelisted", 1);
                    sVar2 = new C1933s(sVar2.f6237f, new C1873n(i), sVar2.f6239h, sVar2.f6240i);
                } else {
                    this.f6528j.mo6709i().mo6771L().mo6888d("Dropping non-safelisted event. appId, event name, origin", str2, sVar2.f6237f, sVar2.f6239h);
                    return;
                }
            }
            mo7446Z().mo6841t0();
            try {
                C1753d Z = mo7446Z();
                C1658o.m7841f(str2);
                Z.mo6700b();
                Z.mo7366r();
                if (j < 0) {
                    Z.mo6709i().mo6767H().mo6887c("Invalid time querying timed out conditional properties", C1746c4.m8178w(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = Z.mo6821L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (C1968ua next : list) {
                    if (next != null) {
                        this.f6528j.mo6709i().mo6772M().mo6888d("User property timed out", next.f6434f, this.f6528j.mo7025H().mo6694z(next.f6436h.f5774g), next.f6436h.mo6894d());
                        if (next.f6440l != null) {
                            m9114W(new C1933s(next.f6440l, j), laVar2);
                        }
                        mo7446Z().mo6839r0(str2, next.f6436h.f5774g);
                    }
                }
                C1753d Z2 = mo7446Z();
                C1658o.m7841f(str2);
                Z2.mo6700b();
                Z2.mo7366r();
                if (j < 0) {
                    Z2.mo6709i().mo6767H().mo6887c("Invalid time querying expired conditional properties", C1746c4.m8178w(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = Z2.mo6821L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (C1968ua next2 : list2) {
                    if (next2 != null) {
                        this.f6528j.mo6709i().mo6772M().mo6888d("User property expired", next2.f6434f, this.f6528j.mo7025H().mo6694z(next2.f6436h.f5774g), next2.f6436h.mo6894d());
                        mo7446Z().mo6834l0(str2, next2.f6436h.f5774g);
                        if (next2.f6444p != null) {
                            arrayList.add(next2.f6444p);
                        }
                        mo7446Z().mo6839r0(str2, next2.f6436h.f5774g);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    m9114W(new C1933s((C1933s) obj2, j), laVar2);
                }
                C1753d Z3 = mo7446Z();
                String str3 = sVar2.f6237f;
                C1658o.m7841f(str2);
                C1658o.m7841f(str3);
                Z3.mo6700b();
                Z3.mo7366r();
                if (j < 0) {
                    Z3.mo6709i().mo6767H().mo6888d("Invalid time querying triggered conditional properties", C1746c4.m8178w(str2), Z3.mo6705d().mo6692v(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = Z3.mo6821L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (C1968ua next3 : list3) {
                    if (next3 != null) {
                        C1776ea eaVar = next3.f6436h;
                        C1800ga gaVar = r4;
                        C1800ga gaVar2 = new C1800ga(next3.f6434f, next3.f6435g, eaVar.f5774g, j, eaVar.mo6894d());
                        if (mo7446Z().mo6828T(gaVar)) {
                            E = this.f6528j.mo6709i().mo6772M();
                            str = "User property triggered";
                            w = next3.f6434f;
                            z = this.f6528j.mo7025H().mo6694z(gaVar.f5854c);
                            obj = gaVar.f5856e;
                        } else {
                            E = this.f6528j.mo6709i().mo6764E();
                            str = "Too many active user properties, ignoring";
                            w = C1746c4.m8178w(next3.f6434f);
                            z = this.f6528j.mo7025H().mo6694z(gaVar.f5854c);
                            obj = gaVar.f5856e;
                        }
                        E.mo6888d(str, w, z, obj);
                        if (next3.f6442n != null) {
                            arrayList2.add(next3.f6442n);
                        }
                        next3.f6436h = new C1776ea(gaVar);
                        next3.f6438j = true;
                        mo7446Z().mo6829U(next3);
                    }
                }
                m9114W(sVar2, laVar2);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    m9114W(new C1933s((C1933s) obj3, j), laVar2);
                }
                mo7446Z().mo6842u();
            } finally {
                mo7446Z().mo6851y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7461q(com.google.android.gms.measurement.internal.C1933s r36, java.lang.String r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r3 = r37
            com.google.android.gms.measurement.internal.d r2 = r35.mo7446Z()
            com.google.android.gms.measurement.internal.f4 r2 = r2.mo6832j0(r3)
            if (r2 == 0) goto L_0x0112
            java.lang.String r4 = r2.mo6917T()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x001c
            goto L_0x0112
        L_0x001c:
            java.lang.Boolean r4 = r0.m9110M(r2)
            if (r4 != 0) goto L_0x0040
            java.lang.String r4 = r1.f6237f
            java.lang.String r5 = "_ui"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r4 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r4 = r4.mo6709i()
            com.google.android.gms.measurement.internal.e4 r4 = r4.mo6767H()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r37)
            java.lang.String r6 = "Could not find package. appId"
            r4.mo6886b(r6, r5)
            goto L_0x005a
        L_0x0040:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6764E()
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1746c4.m8178w(r37)
            java.lang.String r3 = "App version does not match; dropping event. appId"
            r1.mo6886b(r3, r2)
            return
        L_0x005a:
            com.google.android.gms.measurement.internal.la r15 = new com.google.android.gms.measurement.internal.la
            java.lang.String r4 = r2.mo6898A()
            java.lang.String r5 = r2.mo6917T()
            long r6 = r2.mo6919V()
            java.lang.String r8 = r2.mo6921X()
            long r9 = r2.mo6923Z()
            long r11 = r2.mo6927b0()
            boolean r14 = r2.mo6933e0()
            r16 = 0
            java.lang.String r17 = r2.mo6910M()
            long r18 = r2.mo6944k()
            r20 = 0
            r22 = 0
            boolean r23 = r2.mo6946l()
            boolean r24 = r2.mo6948m()
            r25 = 0
            java.lang.String r26 = r2.mo6901D()
            java.lang.Boolean r27 = r2.mo6950n()
            long r28 = r2.mo6931d0()
            java.util.List r30 = r2.mo6951o()
            boolean r31 = p148g.p189d.p190a.p232c.p241f.p247f.C4884yc.m20730b()
            if (r31 == 0) goto L_0x00bf
            com.google.android.gms.measurement.internal.h5 r13 = r0.f6528j
            com.google.android.gms.measurement.internal.wa r13 = r13.mo7038b()
            java.lang.String r1 = r2.mo6956t()
            r32 = r14
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C1957u.f6375k0
            boolean r1 = r13.mo7398C(r1, r14)
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r2.mo6904G()
            goto L_0x00c2
        L_0x00bf:
            r32 = r14
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            boolean r2 = p148g.p189d.p190a.p232c.p241f.p247f.C4602ib.m19620b()
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.h5 r2 = r0.f6528j
            com.google.android.gms.measurement.internal.wa r2 = r2.mo7038b()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.C1957u.f6340Q0
            boolean r2 = r2.mo7415s(r13)
            if (r2 == 0) goto L_0x00df
            com.google.android.gms.measurement.internal.e r2 = r0.mo7447b(r3)
            java.lang.String r2 = r2.mo6873e()
            goto L_0x00e1
        L_0x00df:
            java.lang.String r2 = ""
        L_0x00e1:
            r33 = r2
            r2 = r15
            r3 = r37
            r13 = 0
            r14 = r32
            r34 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r19 = r20
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r29 = r30
            r30 = r1
            r31 = r33
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (boolean) r24, (java.lang.String) r25, (java.lang.Boolean) r26, (long) r27, (java.util.List<java.lang.String>) r29, (java.lang.String) r30, (java.lang.String) r31)
            r1 = r36
            r2 = r34
            r0.m9112O(r1, r2)
            return
        L_0x0112:
            com.google.android.gms.measurement.internal.h5 r1 = r0.f6528j
            com.google.android.gms.measurement.internal.c4 r1 = r1.mo6709i()
            com.google.android.gms.measurement.internal.e4 r1 = r1.mo6771L()
            java.lang.String r2 = "No app data available; dropping event"
            r1.mo6886b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2003x9.mo7461q(com.google.android.gms.measurement.internal.s, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo7462s(C1967u9 u9Var) {
        this.f6533o++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo7463v(C1776ea eaVar, C1860la laVar) {
        m9124n0();
        mo7453g0();
        if (m9116a0(laVar)) {
            if (!laVar.f6021m) {
                mo7442U(laVar);
                return;
            }
            int p0 = this.f6528j.mo7024G().mo7002p0(eaVar.f5774g);
            C1807h5 h5Var = this.f6528j;
            if (p0 != 0) {
                h5Var.mo7024G();
                String H = C1788fa.m8448H(eaVar.f5774g, 24, true);
                String str = eaVar.f5774g;
                this.f6528j.mo7024G().mo6994W(laVar.f6014f, p0, "_ev", H, str != null ? str.length() : 0);
                return;
            }
            int q0 = h5Var.mo7024G().mo7003q0(eaVar.f5774g, eaVar.mo6894d());
            if (q0 != 0) {
                this.f6528j.mo7024G();
                String H2 = C1788fa.m8448H(eaVar.f5774g, 24, true);
                Object d = eaVar.mo6894d();
                this.f6528j.mo7024G().mo6994W(laVar.f6014f, q0, "_ev", H2, (d == null || (!(d instanceof String) && !(d instanceof CharSequence))) ? 0 : String.valueOf(d).length());
                return;
            }
            Object y0 = this.f6528j.mo7024G().mo7008y0(eaVar.f5774g, eaVar.mo6894d());
            if (y0 != null) {
                if ("_sid".equals(eaVar.f5774g)) {
                    long j = eaVar.f5775h;
                    String str2 = eaVar.f5778k;
                    long j2 = 0;
                    C1800ga o0 = mo7446Z().mo6836o0(laVar.f6014f, "_sno");
                    if (o0 != null) {
                        Object obj = o0.f5856e;
                        if (obj instanceof Long) {
                            j2 = ((Long) obj).longValue();
                            mo7463v(new C1776ea("_sno", j, Long.valueOf(j2 + 1), str2), laVar);
                        }
                    }
                    if (o0 != null) {
                        this.f6528j.mo6709i().mo6767H().mo6886b("Retrieved last session number from database does not contain a valid (long) value", o0.f5856e);
                    }
                    C1885o D = mo7446Z().mo6810D(laVar.f6014f, "_s");
                    if (D != null) {
                        j2 = D.f6092c;
                        this.f6528j.mo6709i().mo6772M().mo6886b("Backfill the session number. Last used session number", Long.valueOf(j2));
                    }
                    mo7463v(new C1776ea("_sno", j, Long.valueOf(j2 + 1), str2), laVar);
                }
                C1800ga gaVar = new C1800ga(laVar.f6014f, eaVar.f5778k, eaVar.f5774g, eaVar.f5775h, y0);
                this.f6528j.mo6709i().mo6772M().mo6887c("Setting user property", this.f6528j.mo7025H().mo6694z(gaVar.f5854c), y0);
                mo7446Z().mo6841t0();
                try {
                    mo7442U(laVar);
                    boolean T = mo7446Z().mo6828T(gaVar);
                    mo7446Z().mo6842u();
                    if (!T) {
                        this.f6528j.mo6709i().mo6764E().mo6887c("Too many unique user properties are set. Ignoring user property", this.f6528j.mo7025H().mo6694z(gaVar.f5854c), gaVar.f5856e);
                        this.f6528j.mo7024G().mo6994W(laVar.f6014f, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    mo7446Z().mo6851y0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo7464w(C1860la laVar) {
        if (this.f6540v != null) {
            ArrayList arrayList = new ArrayList();
            this.f6541w = arrayList;
            arrayList.addAll(this.f6540v);
        }
        C1753d Z = mo7446Z();
        String str = laVar.f6014f;
        C1658o.m7841f(str);
        Z.mo6700b();
        Z.mo7366r();
        try {
            SQLiteDatabase v = Z.mo6844v();
            String[] strArr = {str};
            int delete = v.delete("apps", "app_id=?", strArr) + 0 + v.delete("events", "app_id=?", strArr) + v.delete("user_attributes", "app_id=?", strArr) + v.delete("conditional_properties", "app_id=?", strArr) + v.delete("raw_events", "app_id=?", strArr) + v.delete("raw_events_metadata", "app_id=?", strArr) + v.delete("queue", "app_id=?", strArr) + v.delete("audience_filter_values", "app_id=?", strArr) + v.delete("main_event_params", "app_id=?", strArr) + v.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                Z.mo6709i().mo6772M().mo6887c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            Z.mo6709i().mo6764E().mo6887c("Error resetting analytics data. appId, error", C1746c4.m8178w(str), e);
        }
        if (laVar.f6021m) {
            mo7439R(laVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo7465x(C1968ua uaVar) {
        C1860la K = m9109K(uaVar.f6434f);
        if (K != null) {
            mo7466y(uaVar, K);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo7466y(C1968ua uaVar, C1860la laVar) {
        C1770e4 E;
        String str;
        Object w;
        String z;
        Object d;
        C1770e4 E2;
        String str2;
        Object w2;
        String z2;
        Object obj;
        C1658o.m7845j(uaVar);
        C1658o.m7841f(uaVar.f6434f);
        C1658o.m7845j(uaVar.f6435g);
        C1658o.m7845j(uaVar.f6436h);
        C1658o.m7841f(uaVar.f6436h.f5774g);
        m9124n0();
        mo7453g0();
        if (m9116a0(laVar)) {
            if (!laVar.f6021m) {
                mo7442U(laVar);
                return;
            }
            C1968ua uaVar2 = new C1968ua(uaVar);
            boolean z3 = false;
            uaVar2.f6438j = false;
            mo7446Z().mo6841t0();
            try {
                C1968ua p0 = mo7446Z().mo6837p0(uaVar2.f6434f, uaVar2.f6436h.f5774g);
                if (p0 != null && !p0.f6435g.equals(uaVar2.f6435g)) {
                    this.f6528j.mo6709i().mo6767H().mo6888d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f6528j.mo7025H().mo6694z(uaVar2.f6436h.f5774g), uaVar2.f6435g, p0.f6435g);
                }
                if (p0 != null && p0.f6438j) {
                    uaVar2.f6435g = p0.f6435g;
                    uaVar2.f6437i = p0.f6437i;
                    uaVar2.f6441m = p0.f6441m;
                    uaVar2.f6439k = p0.f6439k;
                    uaVar2.f6442n = p0.f6442n;
                    uaVar2.f6438j = p0.f6438j;
                    uaVar2.f6436h = new C1776ea(uaVar2.f6436h.f5774g, p0.f6436h.f5775h, uaVar2.f6436h.mo6894d(), p0.f6436h.f5778k);
                } else if (TextUtils.isEmpty(uaVar2.f6439k)) {
                    uaVar2.f6436h = new C1776ea(uaVar2.f6436h.f5774g, uaVar2.f6437i, uaVar2.f6436h.mo6894d(), uaVar2.f6436h.f5778k);
                    uaVar2.f6438j = true;
                    z3 = true;
                }
                if (uaVar2.f6438j) {
                    C1776ea eaVar = uaVar2.f6436h;
                    C1800ga gaVar = new C1800ga(uaVar2.f6434f, uaVar2.f6435g, eaVar.f5774g, eaVar.f5775h, eaVar.mo6894d());
                    if (mo7446Z().mo6828T(gaVar)) {
                        E2 = this.f6528j.mo6709i().mo6771L();
                        str2 = "User property updated immediately";
                        w2 = uaVar2.f6434f;
                        z2 = this.f6528j.mo7025H().mo6694z(gaVar.f5854c);
                        obj = gaVar.f5856e;
                    } else {
                        E2 = this.f6528j.mo6709i().mo6764E();
                        str2 = "(2)Too many active user properties, ignoring";
                        w2 = C1746c4.m8178w(uaVar2.f6434f);
                        z2 = this.f6528j.mo7025H().mo6694z(gaVar.f5854c);
                        obj = gaVar.f5856e;
                    }
                    E2.mo6888d(str2, w2, z2, obj);
                    if (z3 && uaVar2.f6442n != null) {
                        m9114W(new C1933s(uaVar2.f6442n, uaVar2.f6437i), laVar);
                    }
                }
                if (mo7446Z().mo6829U(uaVar2)) {
                    E = this.f6528j.mo6709i().mo6771L();
                    str = "Conditional property added";
                    w = uaVar2.f6434f;
                    z = this.f6528j.mo7025H().mo6694z(uaVar2.f6436h.f5774g);
                    d = uaVar2.f6436h.mo6894d();
                } else {
                    E = this.f6528j.mo6709i().mo6764E();
                    str = "Too many conditional properties, ignoring";
                    w = C1746c4.m8178w(uaVar2.f6434f);
                    z = this.f6528j.mo7025H().mo6694z(uaVar2.f6436h.f5774g);
                    d = uaVar2.f6436h.mo6894d();
                }
                E.mo6888d(str, w, z, d);
                mo7446Z().mo6842u();
            } finally {
                mo7446Z().mo6851y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo7467z(Runnable runnable) {
        m9124n0();
        if (this.f6532n == null) {
            this.f6532n = new ArrayList();
        }
        this.f6532n.add(runnable);
    }
}
