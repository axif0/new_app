package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1658o;
import com.google.android.gms.common.util.C1684g;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p148g.p189d.p190a.p232c.p237d.C4375f;
import p148g.p189d.p190a.p232c.p240e.C4400a;
import p148g.p189d.p190a.p232c.p240e.C4403b;

public final class DynamiteModule {

    /* renamed from: b */
    private static Boolean f5584b = null;

    /* renamed from: c */
    private static C1710f f5585c = null;

    /* renamed from: d */
    private static C1712h f5586d = null;

    /* renamed from: e */
    private static String f5587e = null;

    /* renamed from: f */
    private static int f5588f = -1;

    /* renamed from: g */
    private static final ThreadLocal<C1703c> f5589g = new ThreadLocal<>();

    /* renamed from: h */
    private static final C1700b.C1701a f5590h = new C1705a();

    /* renamed from: i */
    public static final C1700b f5591i = new C1706b();

    /* renamed from: j */
    public static final C1700b f5592j = new C1707c();

    /* renamed from: k */
    public static final C1700b f5593k = new C1708d();

    /* renamed from: a */
    private final Context f5594a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C1699a extends Exception {
        private C1699a(String str) {
            super(str);
        }

        /* synthetic */ C1699a(String str, C1705a aVar) {
            this(str);
        }

        private C1699a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ C1699a(String str, Throwable th, C1705a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public interface C1700b {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$a */
        public interface C1701a {
            /* renamed from: a */
            int mo6592a(Context context, String str);

            /* renamed from: b */
            int mo6593b(Context context, String str, boolean z) throws C1699a;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b */
        public static class C1702b {

            /* renamed from: a */
            public int f5595a = 0;

            /* renamed from: b */
            public int f5596b = 0;

            /* renamed from: c */
            public int f5597c = 0;
        }

        /* renamed from: a */
        C1702b mo6591a(Context context, String str, C1701a aVar) throws C1699a;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C1703c {

        /* renamed from: a */
        public Cursor f5598a;

        private C1703c() {
        }

        /* synthetic */ C1703c(C1705a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$d */
    private static class C1704d implements C1700b.C1701a {

        /* renamed from: a */
        private final int f5599a;

        public C1704d(int i, int i2) {
            this.f5599a = i;
        }

        /* renamed from: a */
        public final int mo6592a(Context context, String str) {
            return this.f5599a;
        }

        /* renamed from: b */
        public final int mo6593b(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        C1658o.m7845j(context);
        this.f5594a = context;
    }

    /* renamed from: a */
    public static int m7992a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /* renamed from: b */
    public static int m7993b(Context context, String str) {
        return m7995e(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007c, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r11 != null) goto L_0x007e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m7994d(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.C1700b r11, java.lang.String r12) throws com.google.android.gms.dynamite.DynamiteModule.C1699a {
        /*
            java.lang.String r0 = ":"
            java.lang.String r1 = "DynamiteModule"
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r2 = f5589g
            java.lang.Object r2 = r2.get()
            com.google.android.gms.dynamite.DynamiteModule$c r2 = (com.google.android.gms.dynamite.DynamiteModule.C1703c) r2
            com.google.android.gms.dynamite.DynamiteModule$c r3 = new com.google.android.gms.dynamite.DynamiteModule$c
            r4 = 0
            r3.<init>(r4)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r5 = f5589g
            r5.set(r3)
            com.google.android.gms.dynamite.DynamiteModule$b$a r5 = f5590h     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$b r5 = r11.mo6591a(r10, r12, r5)     // Catch:{ all -> 0x011f }
            int r6 = r5.f5595a     // Catch:{ all -> 0x011f }
            int r7 = r5.f5596b     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r8 = r8.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + 68
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x011f }
            int r9 = r9.length()     // Catch:{ all -> 0x011f }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r9.<init>(r8)     // Catch:{ all -> 0x011f }
            java.lang.String r8 = "Considering local module "
            r9.append(r8)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r6)     // Catch:{ all -> 0x011f }
            java.lang.String r6 = " and remote module "
            r9.append(r6)     // Catch:{ all -> 0x011f }
            r9.append(r12)     // Catch:{ all -> 0x011f }
            r9.append(r0)     // Catch:{ all -> 0x011f }
            r9.append(r7)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x011f }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x011f }
            int r0 = r5.f5597c     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
            int r0 = r5.f5597c     // Catch:{ all -> 0x011f }
            r6 = -1
            if (r0 != r6) goto L_0x0069
            int r0 = r5.f5595a     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0069:
            int r0 = r5.f5597c     // Catch:{ all -> 0x011f }
            r7 = 1
            if (r0 != r7) goto L_0x0072
            int r0 = r5.f5596b     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x00f5
        L_0x0072:
            int r0 = r5.f5597c     // Catch:{ all -> 0x011f }
            if (r0 != r6) goto L_0x0087
            com.google.android.gms.dynamite.DynamiteModule r10 = m8002l(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f5598a
            if (r11 == 0) goto L_0x0081
        L_0x007e:
            r11.close()
        L_0x0081:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f5589g
            r11.set(r2)
            return r10
        L_0x0087:
            int r0 = r5.f5597c     // Catch:{ all -> 0x011f }
            if (r0 != r7) goto L_0x00da
            int r0 = r5.f5596b     // Catch:{ a -> 0x0096 }
            com.google.android.gms.dynamite.DynamiteModule r10 = m7996f(r10, r12, r0)     // Catch:{ a -> 0x0096 }
            android.database.Cursor r11 = r3.f5598a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x0096:
            r0 = move-exception
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r8 = r0.getMessage()     // Catch:{ all -> 0x011f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011f }
            int r9 = r8.length()     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00ac
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x011f }
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x011f }
            r8.<init>(r7)     // Catch:{ all -> 0x011f }
            r7 = r8
        L_0x00b2:
            android.util.Log.w(r1, r7)     // Catch:{ all -> 0x011f }
            int r1 = r5.f5595a     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule$d r1 = new com.google.android.gms.dynamite.DynamiteModule$d     // Catch:{ all -> 0x011f }
            int r5 = r5.f5595a     // Catch:{ all -> 0x011f }
            r7 = 0
            r1.<init>(r5, r7)     // Catch:{ all -> 0x011f }
            com.google.android.gms.dynamite.DynamiteModule$b$b r11 = r11.mo6591a(r10, r12, r1)     // Catch:{ all -> 0x011f }
            int r11 = r11.f5597c     // Catch:{ all -> 0x011f }
            if (r11 != r6) goto L_0x00d2
            com.google.android.gms.dynamite.DynamiteModule r10 = m8002l(r10, r12)     // Catch:{ all -> 0x011f }
            android.database.Cursor r11 = r3.f5598a
            if (r11 == 0) goto L_0x0081
            goto L_0x007e
        L_0x00d2:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "Remote load failed. No local fallback found."
            r10.<init>(r11, r0, r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00da:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f5597c     // Catch:{ all -> 0x011f }
            r12 = 47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r0.<init>(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r12 = "VersionPolicy returned invalid code:"
            r0.append(r12)     // Catch:{ all -> 0x011f }
            r0.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x011f }
            r10.<init>((java.lang.String) r11, (com.google.android.gms.dynamite.C1705a) r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x00f5:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x011f }
            int r11 = r5.f5595a     // Catch:{ all -> 0x011f }
            int r12 = r5.f5596b     // Catch:{ all -> 0x011f }
            r0 = 91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r1.<init>(r0)     // Catch:{ all -> 0x011f }
            java.lang.String r0 = "No acceptable module found. Local version is "
            r1.append(r0)     // Catch:{ all -> 0x011f }
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = " and remote version is "
            r1.append(r11)     // Catch:{ all -> 0x011f }
            r1.append(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = "."
            r1.append(r11)     // Catch:{ all -> 0x011f }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x011f }
            r10.<init>((java.lang.String) r11, (com.google.android.gms.dynamite.C1705a) r4)     // Catch:{ all -> 0x011f }
            throw r10     // Catch:{ all -> 0x011f }
        L_0x011f:
            r10 = move-exception
            android.database.Cursor r11 = r3.f5598a
            if (r11 == 0) goto L_0x0127
            r11.close()
        L_0x0127:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r11 = f5589g
            r11.set(r2)
            goto L_0x012e
        L_0x012d:
            throw r10
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m7994d(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0050=Splitter:B:23:0x0050, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x0079=Splitter:B:35:0x0079} */
    /* renamed from: e */
    public static int m7995e(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00ed }
            java.lang.Boolean r1 = f5584b     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x00b7
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0087 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0032:
            m7997g(r4)     // Catch:{ a -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0087 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0050:
            int r4 = m8001k(r8, r9, r10)     // Catch:{ a -> 0x007c }
            java.lang.String r5 = f5587e     // Catch:{ a -> 0x007c }
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = f5587e     // Catch:{ a -> 0x007c }
            boolean r5 = r5.isEmpty()     // Catch:{ a -> 0x007c }
            if (r5 == 0) goto L_0x0061
            goto L_0x0079
        L_0x0061:
            com.google.android.gms.dynamite.e r5 = new com.google.android.gms.dynamite.e     // Catch:{ a -> 0x007c }
            java.lang.String r6 = f5587e     // Catch:{ a -> 0x007c }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x007c }
            r5.<init>(r6, r7)     // Catch:{ a -> 0x007c }
            m7997g(r5)     // Catch:{ a -> 0x007c }
            r2.set(r3, r5)     // Catch:{ a -> 0x007c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ a -> 0x007c }
            f5584b = r5     // Catch:{ a -> 0x007c }
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r4
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            return r4
        L_0x007c:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            r1 = r2
            goto L_0x00b5
        L_0x0087:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            throw r2     // Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        L_0x008a:
            r1 = move-exception
            goto L_0x008f
        L_0x008c:
            r1 = move-exception
            goto L_0x008f
        L_0x008e:
            r1 = move-exception
        L_0x008f:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00ea }
            int r3 = r3.length()     // Catch:{ all -> 0x00ea }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r4.<init>(r3)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00ea }
            r4.append(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ea }
        L_0x00b5:
            f5584b = r1     // Catch:{ all -> 0x00ea }
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00e5
            int r8 = m8001k(r8, r9, r10)     // Catch:{ a -> 0x00c3 }
            return r8
        L_0x00c3:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00ed }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00ed }
            int r1 = r9.length()     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x00db
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00ed }
            goto L_0x00e0
        L_0x00db:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00ed }
            r9.<init>(r0)     // Catch:{ all -> 0x00ed }
        L_0x00e0:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00ed }
            r8 = 0
            return r8
        L_0x00e5:
            int r8 = m7999i(r8, r9, r10)     // Catch:{ all -> 0x00ed }
            return r8
        L_0x00ea:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            throw r9     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r9 = move-exception
            com.google.android.gms.common.util.C1684g.m7944a(r8, r9)
            goto L_0x00f3
        L_0x00f2:
            throw r9
        L_0x00f3:
            goto L_0x00f2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m7995e(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: f */
    private static DynamiteModule m7996f(Context context, String str, int i) throws C1699a {
        Boolean bool;
        C4400a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f5584b;
            }
            if (bool == null) {
                throw new C1699a("Failed to determine which loading route to use.", (C1705a) null);
            } else if (bool.booleanValue()) {
                return m8000j(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                C1710f m = m8003m(context);
                if (m != null) {
                    if (m.mo6599z0() >= 2) {
                        aVar = m.mo6596c0(C4403b.m18643S0(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = m.mo6597r0(C4403b.m18643S0(context), str, i);
                    }
                    if (C4403b.m18644w(aVar) != null) {
                        return new DynamiteModule((Context) C4403b.m18644w(aVar));
                    }
                    throw new C1699a("Failed to load remote module.", (C1705a) null);
                }
                throw new C1699a("Failed to create IDynamiteLoader.", (C1705a) null);
            }
        } catch (RemoteException e) {
            throw new C1699a("Failed to load remote module.", e, (C1705a) null);
        } catch (C1699a e2) {
            throw e2;
        } catch (Throwable th) {
            C1684g.m7944a(context, th);
            throw new C1699a("Failed to load remote module.", th, (C1705a) null);
        }
    }

    /* renamed from: g */
    private static void m7997g(ClassLoader classLoader) throws C1699a {
        C1712h hVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                hVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                hVar = queryLocalInterface instanceof C1712h ? (C1712h) queryLocalInterface : new C1713i(iBinder);
            }
            f5586d = hVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new C1699a("Failed to instantiate dynamite loader", e, (C1705a) null);
        }
    }

    /* renamed from: h */
    private static Boolean m7998h() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f5588f >= 2);
        }
        return valueOf;
    }

    /* renamed from: i */
    private static int m7999i(Context context, String str, boolean z) {
        C1710f m = m8003m(context);
        if (m == null) {
            return 0;
        }
        try {
            if (m.mo6599z0() >= 2) {
                return m.mo6598y(C4403b.m18643S0(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return m.mo6595U(C4403b.m18643S0(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* renamed from: j */
    private static DynamiteModule m8000j(Context context, String str, int i) throws C1699a, RemoteException {
        C1712h hVar;
        C4400a aVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            hVar = f5586d;
        }
        if (hVar != null) {
            C1703c cVar = f5589g.get();
            if (cVar == null || cVar.f5598a == null) {
                throw new C1699a("No result cursor", (C1705a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = cVar.f5598a;
            C4403b.m18643S0(null);
            if (m7998h().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = hVar.mo6601S(C4403b.m18643S0(applicationContext), str, i, C4403b.m18643S0(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = hVar.mo6600R(C4403b.m18643S0(applicationContext), str, i, C4403b.m18643S0(cursor));
            }
            Context context2 = (Context) C4403b.m18644w(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new C1699a("Failed to get module context", (C1705a) null);
        }
        throw new C1699a("DynamiteLoaderV2 was not cached.", (C1705a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m8001k(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.C1699a {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            f5587e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f5588f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$c> r10 = f5589g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$c r10 = (com.google.android.gms.dynamite.DynamiteModule.C1703c) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.f5598a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.f5598a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>((java.lang.String) r10, (com.google.android.gms.dynamite.C1705a) r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.C1699a     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m8001k(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: l */
    private static DynamiteModule m8002l(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: m */
    private static C1710f m8003m(Context context) {
        C1710f fVar;
        synchronized (DynamiteModule.class) {
            if (f5585c != null) {
                C1710f fVar2 = f5585c;
                return fVar2;
            } else if (C4375f.m18582f().mo13698g(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        fVar = queryLocalInterface instanceof C1710f ? (C1710f) queryLocalInterface : new C1711g(iBinder);
                    }
                    if (fVar != null) {
                        f5585c = fVar;
                        return fVar;
                    }
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final IBinder mo6590c(String str) throws C1699a {
        try {
            return (IBinder) this.f5594a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new C1699a(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (C1705a) null);
        }
    }
}
