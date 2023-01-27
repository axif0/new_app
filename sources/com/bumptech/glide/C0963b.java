package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p006n.C1023k;
import com.bumptech.glide.load.p008o.C1116k;
import com.bumptech.glide.load.p008o.p009a0.C1042b;
import com.bumptech.glide.load.p008o.p009a0.C1047e;
import com.bumptech.glide.load.p008o.p010b0.C1079h;
import com.bumptech.glide.load.p012p.C1147a;
import com.bumptech.glide.load.p012p.C1151b;
import com.bumptech.glide.load.p012p.C1158c;
import com.bumptech.glide.load.p012p.C1159d;
import com.bumptech.glide.load.p012p.C1162e;
import com.bumptech.glide.load.p012p.C1167f;
import com.bumptech.glide.load.p012p.C1175g;
import com.bumptech.glide.load.p012p.C1181k;
import com.bumptech.glide.load.p012p.C1200s;
import com.bumptech.glide.load.p012p.C1205t;
import com.bumptech.glide.load.p012p.C1206u;
import com.bumptech.glide.load.p012p.C1210v;
import com.bumptech.glide.load.p012p.C1213w;
import com.bumptech.glide.load.p012p.C1218x;
import com.bumptech.glide.load.p012p.p013y.C1220a;
import com.bumptech.glide.load.p012p.p013y.C1222b;
import com.bumptech.glide.load.p012p.p013y.C1224c;
import com.bumptech.glide.load.p012p.p013y.C1226d;
import com.bumptech.glide.load.p012p.p013y.C1228e;
import com.bumptech.glide.load.p014q.p015d.C1235a;
import com.bumptech.glide.load.p014q.p015d.C1236b;
import com.bumptech.glide.load.p014q.p015d.C1237c;
import com.bumptech.glide.load.p014q.p015d.C1241g;
import com.bumptech.glide.load.p014q.p015d.C1242h;
import com.bumptech.glide.load.p014q.p015d.C1245k;
import com.bumptech.glide.load.p014q.p015d.C1256m;
import com.bumptech.glide.load.p014q.p015d.C1262p;
import com.bumptech.glide.load.p014q.p015d.C1265s;
import com.bumptech.glide.load.p014q.p015d.C1269v;
import com.bumptech.glide.load.p014q.p015d.C1270w;
import com.bumptech.glide.load.p014q.p015d.C1274y;
import com.bumptech.glide.load.p014q.p015d.C1276z;
import com.bumptech.glide.load.p014q.p016e.C1283a;
import com.bumptech.glide.load.p014q.p017f.C1289d;
import com.bumptech.glide.load.p014q.p017f.C1290e;
import com.bumptech.glide.load.p014q.p018g.C1291a;
import com.bumptech.glide.load.p014q.p019h.C1293a;
import com.bumptech.glide.load.p014q.p019h.C1297c;
import com.bumptech.glide.load.p014q.p019h.C1299d;
import com.bumptech.glide.load.p014q.p019h.C1307h;
import com.bumptech.glide.load.p014q.p019h.C1309j;
import com.bumptech.glide.load.p014q.p020i.C1310a;
import com.bumptech.glide.load.p014q.p020i.C1311b;
import com.bumptech.glide.load.p014q.p020i.C1312c;
import com.bumptech.glide.load.p014q.p020i.C1313d;
import com.bumptech.glide.p021m.C1318a;
import com.bumptech.glide.p022n.C1328d;
import com.bumptech.glide.p022n.C1338l;
import com.bumptech.glide.p023o.C1347b;
import com.bumptech.glide.p023o.C1349d;
import com.bumptech.glide.p025q.C1364e;
import com.bumptech.glide.p025q.C1365f;
import com.bumptech.glide.p025q.p026j.C1375f;
import com.bumptech.glide.p025q.p026j.C1377h;
import com.bumptech.glide.p029s.C1401j;
import com.bumptech.glide.p029s.C1402k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.b */
public class C0963b implements ComponentCallbacks2 {

    /* renamed from: n */
    private static volatile C0963b f3811n;

    /* renamed from: o */
    private static volatile boolean f3812o;

    /* renamed from: f */
    private final C1047e f3813f;

    /* renamed from: g */
    private final C1079h f3814g;

    /* renamed from: h */
    private final C0967d f3815h;

    /* renamed from: i */
    private final C0971h f3816i;

    /* renamed from: j */
    private final C1042b f3817j;

    /* renamed from: k */
    private final C1338l f3818k;

    /* renamed from: l */
    private final C1328d f3819l;

    /* renamed from: m */
    private final List<C0979j> f3820m = new ArrayList();

    /* renamed from: com.bumptech.glide.b$a */
    public interface C0964a {
        /* renamed from: a */
        C1365f mo5052a();
    }

    C0963b(Context context, C1116k kVar, C1079h hVar, C1047e eVar, C1042b bVar, C1338l lVar, C1328d dVar, int i, C0964a aVar, Map<Class<?>, C0982k<?, ?>> map, List<C1364e<Object>> list, boolean z, boolean z2, int i2, int i3) {
        C1004k kVar2;
        C1004k kVar3;
        Context context2 = context;
        C1047e eVar2 = eVar;
        C1042b bVar2 = bVar;
        Class<C1318a> cls = C1318a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        C0968e eVar3 = C0968e.NORMAL;
        this.f3813f = eVar2;
        this.f3817j = bVar2;
        this.f3814g = hVar;
        this.f3818k = lVar;
        this.f3819l = dVar;
        Resources resources = context.getResources();
        C0971h hVar2 = new C0971h();
        this.f3816i = hVar2;
        hVar2.mo5077o(new C1245k());
        if (Build.VERSION.SDK_INT >= 27) {
            this.f3816i.mo5077o(new C1262p());
        }
        List<ImageHeaderParser> g = this.f3816i.mo5069g();
        C1293a aVar2 = new C1293a(context2, g, eVar2, bVar2);
        C1004k<ParcelFileDescriptor, Bitmap> g2 = C1276z.m6426g(eVar);
        if (!z2 || Build.VERSION.SDK_INT < 28) {
            C1256m mVar = new C1256m(this.f3816i.mo5069g(), resources.getDisplayMetrics(), eVar2, bVar2);
            kVar2 = new C1241g(mVar);
            kVar3 = new C1270w(mVar, bVar2);
        } else {
            kVar3 = new C1265s();
            kVar2 = new C1242h();
        }
        C1289d dVar2 = new C1289d(context2);
        C1200s.C1203c cVar = new C1200s.C1203c(resources);
        Class<byte[]> cls5 = cls4;
        C1200s.C1204d dVar3 = new C1200s.C1204d(resources);
        C1200s.C1202b bVar3 = new C1200s.C1202b(resources);
        Class<String> cls6 = cls2;
        C1200s.C1201a aVar3 = new C1200s.C1201a(resources);
        C1237c cVar2 = new C1237c(bVar2);
        C1200s.C1204d dVar4 = dVar3;
        C1310a aVar4 = new C1310a();
        C1313d dVar5 = new C1313d();
        ContentResolver contentResolver = context.getContentResolver();
        C0971h hVar3 = this.f3816i;
        hVar3.mo5064a(ByteBuffer.class, new C1158c());
        hVar3.mo5064a(InputStream.class, new C1205t(bVar2));
        hVar3.mo5068e("Bitmap", ByteBuffer.class, Bitmap.class, kVar2);
        hVar3.mo5068e("Bitmap", InputStream.class, Bitmap.class, kVar3);
        hVar3.mo5068e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, g2);
        hVar3.mo5068e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C1276z.m6422c(eVar));
        hVar3.mo5067d(Bitmap.class, Bitmap.class, C1210v.C1211a.m6204a());
        hVar3.mo5068e("Bitmap", Bitmap.class, Bitmap.class, new C1274y());
        hVar3.mo5065b(Bitmap.class, cVar2);
        hVar3.mo5068e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1235a(resources, kVar2));
        hVar3.mo5068e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1235a(resources, kVar3));
        hVar3.mo5068e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1235a(resources, g2));
        hVar3.mo5065b(BitmapDrawable.class, new C1236b(eVar2, cVar2));
        hVar3.mo5068e("Gif", InputStream.class, C1297c.class, new C1309j(g, aVar2, bVar2));
        hVar3.mo5068e("Gif", ByteBuffer.class, C1297c.class, aVar2);
        hVar3.mo5065b(C1297c.class, new C1299d());
        hVar3.mo5067d(cls, cls, C1210v.C1211a.m6204a());
        hVar3.mo5068e("Bitmap", cls, Bitmap.class, new C1307h(eVar2));
        hVar3.mo5066c(Uri.class, Drawable.class, dVar2);
        hVar3.mo5066c(Uri.class, Bitmap.class, new C1269v(dVar2, eVar2));
        hVar3.mo5078p(new C1283a.C1284a());
        hVar3.mo5067d(File.class, ByteBuffer.class, new C1159d.C1161b());
        hVar3.mo5067d(File.class, InputStream.class, new C1167f.C1173e());
        hVar3.mo5066c(File.class, File.class, new C1291a());
        hVar3.mo5067d(File.class, ParcelFileDescriptor.class, new C1167f.C1169b());
        hVar3.mo5067d(File.class, File.class, C1210v.C1211a.m6204a());
        hVar3.mo5078p(new C1023k.C1024a(bVar2));
        C1200s.C1203c cVar3 = cVar;
        hVar3.mo5067d(Integer.TYPE, InputStream.class, cVar3);
        C1200s.C1202b bVar4 = bVar3;
        hVar3.mo5067d(Integer.TYPE, ParcelFileDescriptor.class, bVar4);
        Class<Integer> cls7 = cls3;
        hVar3.mo5067d(cls7, InputStream.class, cVar3);
        hVar3.mo5067d(cls7, ParcelFileDescriptor.class, bVar4);
        C1200s.C1204d dVar6 = dVar4;
        hVar3.mo5067d(cls7, Uri.class, dVar6);
        C1200s.C1201a aVar5 = aVar3;
        hVar3.mo5067d(Integer.TYPE, AssetFileDescriptor.class, aVar5);
        hVar3.mo5067d(cls7, AssetFileDescriptor.class, aVar5);
        hVar3.mo5067d(Integer.TYPE, Uri.class, dVar6);
        Class<String> cls8 = cls6;
        hVar3.mo5067d(cls8, InputStream.class, new C1162e.C1165c());
        hVar3.mo5067d(Uri.class, InputStream.class, new C1162e.C1165c());
        hVar3.mo5067d(cls8, InputStream.class, new C1206u.C1209c());
        hVar3.mo5067d(cls8, ParcelFileDescriptor.class, new C1206u.C1208b());
        hVar3.mo5067d(cls8, AssetFileDescriptor.class, new C1206u.C1207a());
        hVar3.mo5067d(Uri.class, InputStream.class, new C1222b.C1223a());
        hVar3.mo5067d(Uri.class, InputStream.class, new C1147a.C1150c(context.getAssets()));
        hVar3.mo5067d(Uri.class, ParcelFileDescriptor.class, new C1147a.C1149b(context.getAssets()));
        Context context3 = context;
        hVar3.mo5067d(Uri.class, InputStream.class, new C1224c.C1225a(context3));
        hVar3.mo5067d(Uri.class, InputStream.class, new C1226d.C1227a(context3));
        ContentResolver contentResolver2 = contentResolver;
        hVar3.mo5067d(Uri.class, InputStream.class, new C1213w.C1217d(contentResolver2));
        hVar3.mo5067d(Uri.class, ParcelFileDescriptor.class, new C1213w.C1215b(contentResolver2));
        hVar3.mo5067d(Uri.class, AssetFileDescriptor.class, new C1213w.C1214a(contentResolver2));
        hVar3.mo5067d(Uri.class, InputStream.class, new C1218x.C1219a());
        hVar3.mo5067d(URL.class, InputStream.class, new C1228e.C1229a());
        hVar3.mo5067d(Uri.class, File.class, new C1181k.C1182a(context3));
        hVar3.mo5067d(C1175g.class, InputStream.class, new C1220a.C1221a());
        Class<byte[]> cls9 = cls5;
        hVar3.mo5067d(cls9, ByteBuffer.class, new C1151b.C1152a());
        hVar3.mo5067d(cls9, InputStream.class, new C1151b.C1156d());
        hVar3.mo5067d(Uri.class, Uri.class, C1210v.C1211a.m6204a());
        hVar3.mo5067d(Drawable.class, Drawable.class, C1210v.C1211a.m6204a());
        hVar3.mo5066c(Drawable.class, Drawable.class, new C1290e());
        hVar3.mo5079q(Bitmap.class, BitmapDrawable.class, new C1311b(resources));
        C1310a aVar6 = aVar4;
        hVar3.mo5079q(Bitmap.class, cls9, aVar6);
        C1313d dVar7 = dVar5;
        hVar3.mo5079q(Drawable.class, cls9, new C1312c(eVar2, aVar6, dVar7));
        hVar3.mo5079q(C1297c.class, cls9, dVar7);
        Context context4 = context;
        C1042b bVar5 = bVar;
        this.f3815h = new C0967d(context4, bVar5, this.f3816i, new C1375f(), aVar, map, list, kVar, z, i);
    }

    /* renamed from: a */
    private static void m5387a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f3812o) {
            f3812o = true;
            m5391m(context, generatedAppGlideModule);
            f3812o = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static C0963b m5388c(Context context) {
        if (f3811n == null) {
            GeneratedAppGlideModule d = m5389d(context.getApplicationContext());
            synchronized (C0963b.class) {
                if (f3811n == null) {
                    m5387a(context, d);
                }
            }
        }
        return f3811n;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m5389d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e) {
            m5393q(e);
            throw null;
        } catch (IllegalAccessException e2) {
            m5393q(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m5393q(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m5393q(e4);
            throw null;
        }
    }

    /* renamed from: l */
    private static C1338l m5390l(Context context) {
        C1401j.m6973e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m5388c(context).mo5044k();
    }

    /* renamed from: m */
    private static void m5391m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m5392n(context, new C0965c(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m5392n(Context context, C0965c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<C1347b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo5744c()) {
            emptyList = new C1349d(applicationContext).mo5748a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo5035d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo5035d();
            Iterator<C1347b> it = emptyList.iterator();
            while (it.hasNext()) {
                C1347b next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C1347b bVar : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + bVar.getClass());
            }
        }
        cVar.mo5054b(generatedAppGlideModule != null ? generatedAppGlideModule.mo5036e() : null);
        for (C1347b a : emptyList) {
            a.mo5745a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo5743b(applicationContext, cVar);
        }
        C0963b a2 = cVar.mo5053a(applicationContext);
        for (C1347b next2 : emptyList) {
            try {
                next2.mo5746b(applicationContext, a2, a2.f3816i);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + next2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo5747a(applicationContext, a2, a2.f3816i);
        }
        applicationContext.registerComponentCallbacks(a2);
        f3811n = a2;
    }

    /* renamed from: q */
    private static void m5393q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static C0979j m5394t(Context context) {
        return m5390l(context).mo5718e(context);
    }

    /* renamed from: b */
    public void mo5037b() {
        C1402k.m6974a();
        this.f3814g.mo5295b();
        this.f3813f.mo5247b();
        this.f3817j.mo5225b();
    }

    /* renamed from: e */
    public C1042b mo5038e() {
        return this.f3817j;
    }

    /* renamed from: f */
    public C1047e mo5039f() {
        return this.f3813f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1328d mo5040g() {
        return this.f3819l;
    }

    /* renamed from: h */
    public Context mo5041h() {
        return this.f3815h.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0967d mo5042i() {
        return this.f3815h;
    }

    /* renamed from: j */
    public C0971h mo5043j() {
        return this.f3816i;
    }

    /* renamed from: k */
    public C1338l mo5044k() {
        return this.f3818k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5045o(C0979j jVar) {
        synchronized (this.f3820m) {
            if (!this.f3820m.contains(jVar)) {
                this.f3820m.add(jVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo5037b();
    }

    public void onTrimMemory(int i) {
        mo5050r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5049p(C1377h<?> hVar) {
        synchronized (this.f3820m) {
            for (C0979j z : this.f3820m) {
                if (z.mo5114z(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo5050r(int i) {
        C1402k.m6974a();
        for (C0979j onTrimMemory : this.f3820m) {
            onTrimMemory.onTrimMemory(i);
        }
        this.f3814g.mo5287a(i);
        this.f3813f.mo5246a(i);
        this.f3817j.mo5224a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5051s(C0979j jVar) {
        synchronized (this.f3820m) {
            if (this.f3820m.contains(jVar)) {
                this.f3820m.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
