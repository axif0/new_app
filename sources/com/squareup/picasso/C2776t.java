package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.C2732a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.squareup.picasso.t */
public class C2776t {

    /* renamed from: p */
    static final Handler f8856p = new C2777a(Looper.getMainLooper());
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: q */
    static volatile C2776t f8857q = null;

    /* renamed from: a */
    private final C2781d f8858a;

    /* renamed from: b */
    private final C2784g f8859b;

    /* renamed from: c */
    private final C2779c f8860c;

    /* renamed from: d */
    private final List<C2793y> f8861d;

    /* renamed from: e */
    final Context f8862e;

    /* renamed from: f */
    final C2756i f8863f;

    /* renamed from: g */
    final C2747d f8864g;

    /* renamed from: h */
    final C2734a0 f8865h;

    /* renamed from: i */
    final Map<Object, C2732a> f8866i;

    /* renamed from: j */
    final Map<ImageView, C2755h> f8867j;

    /* renamed from: k */
    final ReferenceQueue<Object> f8868k;

    /* renamed from: l */
    final Bitmap.Config f8869l;

    /* renamed from: m */
    boolean f8870m;

    /* renamed from: n */
    volatile boolean f8871n;

    /* renamed from: o */
    boolean f8872o;

    /* renamed from: com.squareup.picasso.t$a */
    static class C2777a extends Handler {
        C2777a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C2739c cVar = (C2739c) list.get(i2);
                        cVar.f8771g.mo10094c(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C2732a aVar = (C2732a) list2.get(i2);
                        aVar.f8719a.mo10101l(aVar);
                        i2++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                C2732a aVar2 = (C2732a) message.obj;
                if (aVar2.mo9988g().f8871n) {
                    C2748d0.m12157t("Main", "canceled", aVar2.f8720b.mo10121d(), "target got garbage collected");
                }
                aVar2.f8719a.mo10092a(aVar2.mo9992k());
            }
        }
    }

    /* renamed from: com.squareup.picasso.t$b */
    public static class C2778b {

        /* renamed from: a */
        private final Context f8873a;

        /* renamed from: b */
        private C2761j f8874b;

        /* renamed from: c */
        private ExecutorService f8875c;

        /* renamed from: d */
        private C2747d f8876d;

        /* renamed from: e */
        private C2781d f8877e;

        /* renamed from: f */
        private C2784g f8878f;

        /* renamed from: g */
        private List<C2793y> f8879g;

        /* renamed from: h */
        private Bitmap.Config f8880h;

        /* renamed from: i */
        private boolean f8881i;

        /* renamed from: j */
        private boolean f8882j;

        public C2778b(Context context) {
            if (context != null) {
                this.f8873a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C2776t mo10105a() {
            Context context = this.f8873a;
            if (this.f8874b == null) {
                this.f8874b = new C2775s(context);
            }
            if (this.f8876d == null) {
                this.f8876d = new C2764m(context);
            }
            if (this.f8875c == null) {
                this.f8875c = new C2787v();
            }
            if (this.f8878f == null) {
                this.f8878f = C2784g.f8895a;
            }
            C2734a0 a0Var = new C2734a0(this.f8876d);
            Context context2 = context;
            return new C2776t(context2, new C2756i(context2, this.f8875c, C2776t.f8856p, this.f8874b, this.f8876d, a0Var), this.f8876d, this.f8877e, this.f8878f, this.f8879g, a0Var, this.f8880h, this.f8881i, this.f8882j);
        }
    }

    /* renamed from: com.squareup.picasso.t$c */
    private static class C2779c extends Thread {

        /* renamed from: f */
        private final ReferenceQueue<Object> f8883f;

        /* renamed from: g */
        private final Handler f8884g;

        /* renamed from: com.squareup.picasso.t$c$a */
        class C2780a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Exception f8885f;

            C2780a(C2779c cVar, Exception exc) {
                this.f8885f = exc;
            }

            public void run() {
                throw new RuntimeException(this.f8885f);
            }
        }

        C2779c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f8883f = referenceQueue;
            this.f8884g = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C2732a.C2733a aVar = (C2732a.C2733a) this.f8883f.remove(1000);
                    Message obtainMessage = this.f8884g.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f8731a;
                        this.f8884g.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f8884g.post(new C2780a(this, e));
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.picasso.t$d */
    public interface C2781d {
        /* renamed from: a */
        void mo10108a(C2776t tVar, Uri uri, Exception exc);
    }

    /* renamed from: com.squareup.picasso.t$e */
    public enum C2782e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: f */
        final int f8890f;

        private C2782e(int i) {
            this.f8890f = i;
        }
    }

    /* renamed from: com.squareup.picasso.t$f */
    public enum C2783f {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.picasso.t$g */
    public interface C2784g {

        /* renamed from: a */
        public static final C2784g f8895a = new C2785a();

        /* renamed from: com.squareup.picasso.t$g$a */
        static class C2785a implements C2784g {
            C2785a() {
            }

            /* renamed from: a */
            public C2789w mo10109a(C2789w wVar) {
                return wVar;
            }
        }

        /* renamed from: a */
        C2789w mo10109a(C2789w wVar);
    }

    C2776t(Context context, C2756i iVar, C2747d dVar, C2781d dVar2, C2784g gVar, List<C2793y> list, C2734a0 a0Var, Bitmap.Config config, boolean z, boolean z2) {
        this.f8862e = context;
        this.f8863f = iVar;
        this.f8864g = dVar;
        this.f8858a = dVar2;
        this.f8859b = gVar;
        this.f8869l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C2795z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C2753f(context));
        arrayList.add(new C2768o(context));
        arrayList.add(new C2754g(context));
        arrayList.add(new C2737b(context));
        arrayList.add(new C2762k(context));
        arrayList.add(new C2772r(iVar.f8806d, a0Var));
        this.f8861d = Collections.unmodifiableList(arrayList);
        this.f8865h = a0Var;
        this.f8866i = new WeakHashMap();
        this.f8867j = new WeakHashMap();
        this.f8870m = z;
        this.f8871n = z2;
        this.f8868k = new ReferenceQueue<>();
        C2779c cVar = new C2779c(this.f8868k, f8856p);
        this.f8860c = cVar;
        cVar.start();
    }

    /* renamed from: e */
    private void m12223e(Bitmap bitmap, C2782e eVar, C2732a aVar, Exception exc) {
        String str;
        String str2;
        String str3;
        if (!aVar.mo9993l()) {
            if (!aVar.mo9994m()) {
                this.f8866i.remove(aVar.mo9992k());
            }
            if (bitmap == null) {
                aVar.mo9984c(exc);
                if (this.f8871n) {
                    str3 = aVar.f8720b.mo10121d();
                    str2 = exc.getMessage();
                    str = "errored";
                } else {
                    return;
                }
            } else if (eVar != null) {
                aVar.mo9983b(bitmap, eVar);
                if (this.f8871n) {
                    str3 = aVar.f8720b.mo10121d();
                    str2 = "from " + eVar;
                    str = "completed";
                } else {
                    return;
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            C2748d0.m12157t("Main", str, str3, str2);
        }
    }

    /* renamed from: g */
    public static C2776t m12224g() {
        if (f8857q == null) {
            synchronized (C2776t.class) {
                if (f8857q == null) {
                    if (PicassoProvider.f8718f != null) {
                        f8857q = new C2778b(PicassoProvider.f8718f).mo10105a();
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        return f8857q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10092a(Object obj) {
        C2755h remove;
        C2748d0.m12140c();
        C2732a remove2 = this.f8866i.remove(obj);
        if (remove2 != null) {
            remove2.mo9982a();
            this.f8863f.mo10053c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f8867j.remove((ImageView) obj)) != null) {
            remove.mo10048a();
        }
    }

    /* renamed from: b */
    public void mo10093b(ImageView imageView) {
        if (imageView != null) {
            mo10092a(imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10094c(C2739c cVar) {
        C2732a h = cVar.mo10015h();
        List<C2732a> i = cVar.mo10016i();
        boolean z = true;
        boolean z2 = i != null && !i.isEmpty();
        if (h == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.mo10017j().f8909d;
            Exception k = cVar.mo10018k();
            Bitmap s = cVar.mo10025s();
            C2782e o = cVar.mo10020o();
            if (h != null) {
                m12223e(s, o, h, k);
            }
            if (z2) {
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m12223e(s, o, i.get(i2), k);
                }
            }
            C2781d dVar = this.f8858a;
            if (dVar != null && k != null) {
                dVar.mo10108a(this, uri, k);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10095d(ImageView imageView, C2755h hVar) {
        if (this.f8867j.containsKey(imageView)) {
            mo10092a(imageView);
        }
        this.f8867j.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10096f(C2732a aVar) {
        Object k = aVar.mo9992k();
        if (!(k == null || this.f8866i.get(k) == aVar)) {
            mo10092a(k);
            this.f8866i.put(k, aVar);
        }
        mo10102m(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<C2793y> mo10097h() {
        return this.f8861d;
    }

    /* renamed from: i */
    public C2792x mo10098i(Uri uri) {
        return new C2792x(this, uri, 0);
    }

    /* renamed from: j */
    public C2792x mo10099j(String str) {
        if (str == null) {
            return new C2792x(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return mo10098i(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Bitmap mo10100k(String str) {
        Bitmap a = this.f8864g.mo10038a(str);
        C2734a0 a0Var = this.f8865h;
        if (a != null) {
            a0Var.mo9998d();
        } else {
            a0Var.mo9999e();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo10101l(C2732a aVar) {
        Bitmap k = C2770p.m12211e(aVar.f8723e) ? mo10100k(aVar.mo9985d()) : null;
        if (k != null) {
            m12223e(k, C2782e.MEMORY, aVar, (Exception) null);
            if (this.f8871n) {
                String d = aVar.f8720b.mo10121d();
                C2748d0.m12157t("Main", "completed", d, "from " + C2782e.MEMORY);
                return;
            }
            return;
        }
        mo10096f(aVar);
        if (this.f8871n) {
            C2748d0.m12156s("Main", "resumed", aVar.f8720b.mo10121d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo10102m(C2732a aVar) {
        this.f8863f.mo10058h(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C2789w mo10103n(C2789w wVar) {
        this.f8859b.mo10109a(wVar);
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Request transformer " + this.f8859b.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}
