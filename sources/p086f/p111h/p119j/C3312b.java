package p086f.p111h.p119j;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p086f.p102e.C3196e;
import p086f.p102e.C3203g;
import p086f.p111h.p112e.p113c.C3271c;
import p086f.p111h.p112e.p113c.C3279f;
import p086f.p111h.p114f.C3292d;
import p086f.p111h.p114f.C3302k;
import p086f.p111h.p119j.C3320c;
import p086f.p111h.p121l.C3349h;

/* renamed from: f.h.j.b */
public class C3312b {

    /* renamed from: a */
    static final C3196e<String, Typeface> f10555a = new C3196e<>(16);

    /* renamed from: b */
    private static final C3320c f10556b = new C3320c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f10557c = new Object();

    /* renamed from: d */
    static final C3203g<String, ArrayList<C3320c.C3325d<C3319g>>> f10558d = new C3203g<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f10559e = new C3316d();

    /* renamed from: f.h.j.b$a */
    class C3313a implements Callable<C3319g> {

        /* renamed from: a */
        final /* synthetic */ Context f10560a;

        /* renamed from: b */
        final /* synthetic */ C3311a f10561b;

        /* renamed from: c */
        final /* synthetic */ int f10562c;

        /* renamed from: d */
        final /* synthetic */ String f10563d;

        C3313a(Context context, C3311a aVar, int i, String str) {
            this.f10560a = context;
            this.f10561b = aVar;
            this.f10562c = i;
            this.f10563d = str;
        }

        /* renamed from: a */
        public C3319g call() throws Exception {
            C3319g f = C3312b.m14275f(this.f10560a, this.f10561b, this.f10562c);
            Typeface typeface = f.f10574a;
            if (typeface != null) {
                C3312b.f10555a.mo11063d(this.f10563d, typeface);
            }
            return f;
        }
    }

    /* renamed from: f.h.j.b$b */
    class C3314b implements C3320c.C3325d<C3319g> {

        /* renamed from: a */
        final /* synthetic */ C3279f.C3280a f10564a;

        /* renamed from: b */
        final /* synthetic */ Handler f10565b;

        C3314b(C3279f.C3280a aVar, Handler handler) {
            this.f10564a = aVar;
            this.f10565b = handler;
        }

        /* renamed from: b */
        public void mo11481a(C3319g gVar) {
            int i;
            C3279f.C3280a aVar;
            if (gVar == null) {
                aVar = this.f10564a;
                i = 1;
            } else {
                i = gVar.f10575b;
                if (i == 0) {
                    this.f10564a.mo11441b(gVar.f10574a, this.f10565b);
                    return;
                }
                aVar = this.f10564a;
            }
            aVar.mo11440a(i, this.f10565b);
        }
    }

    /* renamed from: f.h.j.b$c */
    class C3315c implements C3320c.C3325d<C3319g> {

        /* renamed from: a */
        final /* synthetic */ String f10566a;

        C3315c(String str) {
            this.f10566a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((p086f.p111h.p119j.C3320c.C3325d) r1.get(r0)).mo11481a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo11481a(p086f.p111h.p119j.C3312b.C3319g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p086f.p111h.p119j.C3312b.f10557c
                monitor-enter(r0)
                f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r1 = p086f.p111h.p119j.C3312b.f10558d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f10566a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r2 = p086f.p111h.p119j.C3312b.f10558d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f10566a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                f.h.j.c$d r2 = (p086f.p111h.p119j.C3320c.C3325d) r2
                r2.mo11481a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x0030:
                throw r5
            L_0x0031:
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p119j.C3312b.C3315c.mo11481a(f.h.j.b$g):void");
        }
    }

    /* renamed from: f.h.j.b$d */
    class C3316d implements Comparator<byte[]> {
        C3316d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(byte[] r5, byte[] r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x0008
                int r5 = r5.length
                int r6 = r6.length
            L_0x0006:
                int r5 = r5 - r6
                return r5
            L_0x0008:
                r0 = 0
                r1 = 0
            L_0x000a:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001b
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x0018
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x0006
            L_0x0018:
                int r1 = r1 + 1
                goto L_0x000a
            L_0x001b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p119j.C3312b.C3316d.compare(byte[], byte[]):int");
        }
    }

    /* renamed from: f.h.j.b$e */
    public static class C3317e {

        /* renamed from: a */
        private final int f10567a;

        /* renamed from: b */
        private final C3318f[] f10568b;

        public C3317e(int i, C3318f[] fVarArr) {
            this.f10567a = i;
            this.f10568b = fVarArr;
        }

        /* renamed from: a */
        public C3318f[] mo11486a() {
            return this.f10568b;
        }

        /* renamed from: b */
        public int mo11487b() {
            return this.f10567a;
        }
    }

    /* renamed from: f.h.j.b$f */
    public static class C3318f {

        /* renamed from: a */
        private final Uri f10569a;

        /* renamed from: b */
        private final int f10570b;

        /* renamed from: c */
        private final int f10571c;

        /* renamed from: d */
        private final boolean f10572d;

        /* renamed from: e */
        private final int f10573e;

        public C3318f(Uri uri, int i, int i2, boolean z, int i3) {
            C3349h.m14361c(uri);
            this.f10569a = uri;
            this.f10570b = i;
            this.f10571c = i2;
            this.f10572d = z;
            this.f10573e = i3;
        }

        /* renamed from: a */
        public int mo11488a() {
            return this.f10573e;
        }

        /* renamed from: b */
        public int mo11489b() {
            return this.f10570b;
        }

        /* renamed from: c */
        public Uri mo11490c() {
            return this.f10569a;
        }

        /* renamed from: d */
        public int mo11491d() {
            return this.f10571c;
        }

        /* renamed from: e */
        public boolean mo11492e() {
            return this.f10572d;
        }
    }

    /* renamed from: f.h.j.b$g */
    private static final class C3319g {

        /* renamed from: a */
        final Typeface f10574a;

        /* renamed from: b */
        final int f10575b;

        C3319g(Typeface typeface, int i) {
            this.f10574a = typeface;
            this.f10575b = i;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m14270a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m14271b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static C3317e m14272c(Context context, CancellationSignal cancellationSignal, C3311a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo h = m14277h(context.getPackageManager(), aVar, context.getResources());
        return h == null ? new C3317e(1, (C3318f[]) null) : new C3317e(0, m14274e(context, aVar, h.authority, cancellationSignal));
    }

    /* renamed from: d */
    private static List<List<byte[]>> m14273d(C3311a aVar, Resources resources) {
        return aVar.mo11472a() != null ? aVar.mo11472a() : C3271c.m14103c(resources, aVar.mo11473b());
    }

    /* renamed from: e */
    static C3318f[] m14274e(Context context, C3311a aVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo11477f()}, (String) null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo11477f()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new C3318f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (C3318f[]) arrayList.toArray(new C3318f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: f */
    static C3319g m14275f(Context context, C3311a aVar, int i) {
        try {
            C3317e c = m14272c(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (c.mo11487b() == 0) {
                Typeface b = C3292d.m14182b(context, (CancellationSignal) null, c.mo11486a(), i);
                if (b != null) {
                    i2 = 0;
                }
                return new C3319g(b, i2);
            }
            if (c.mo11487b() == 1) {
                i2 = -2;
            }
            return new C3319g((Typeface) null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C3319g((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        f10556b.mo11495d(r1, new p086f.p111h.p119j.C3312b.C3315c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m14276g(android.content.Context r2, p086f.p111h.p119j.C3311a r3, p086f.p111h.p112e.p113c.C3279f.C3280a r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo11474c()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            f.e.e<java.lang.String, android.graphics.Typeface> r1 = f10555a
            java.lang.Object r1 = r1.mo11062c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo2458d(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            f.h.j.b$g r2 = m14275f(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f10575b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f10574a
            r4.mo11441b(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.mo11440a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f10574a
            return r2
        L_0x0043:
            f.h.j.b$a r1 = new f.h.j.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            f.h.j.c r3 = f10556b     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo11496e(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            f.h.j.b$g r3 = (p086f.p111h.p119j.C3312b.C3319g) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f10574a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            f.h.j.b$b r3 = new f.h.j.b$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f10557c
            monitor-enter(r4)
            f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r5 = f10558d     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            f.e.g<java.lang.String, java.util.ArrayList<f.h.j.c$d<f.h.j.b$g>>> r3 = f10558d     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            f.h.j.c r3 = f10556b
            f.h.j.b$c r4 = new f.h.j.b$c
            r4.<init>(r0)
            r3.mo11495d(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p111h.p119j.C3312b.m14276g(android.content.Context, f.h.j.a, f.h.e.c.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: h */
    public static ProviderInfo m14277h(PackageManager packageManager, C3311a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String d = aVar.mo11475d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d);
        } else if (resolveContentProvider.packageName.equals(aVar.mo11476e())) {
            List<byte[]> a = m14270a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f10559e);
            List<List<byte[]>> d2 = m14273d(aVar, resources);
            for (int i = 0; i < d2.size(); i++) {
                ArrayList arrayList = new ArrayList(d2.get(i));
                Collections.sort(arrayList, f10559e);
                if (m14271b(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d + ", but package was not " + aVar.mo11476e());
        }
    }

    /* renamed from: i */
    public static Map<Uri, ByteBuffer> m14278i(Context context, C3318f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C3318f fVar : fVarArr) {
            if (fVar.mo11488a() == 0) {
                Uri c = fVar.mo11490c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C3302k.m14250f(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
