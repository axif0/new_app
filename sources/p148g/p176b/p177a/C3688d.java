package p148g.p176b.p177a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p148g.p176b.p177a.C3683c;
import p148g.p176b.p177a.p178g.C3701i;

/* renamed from: g.b.a.d */
public class C3688d {

    /* renamed from: a */
    protected final Set<String> f11276a;

    /* renamed from: b */
    protected final C3683c.C3685b f11277b;

    /* renamed from: c */
    protected final C3683c.C3684a f11278c;

    /* renamed from: d */
    protected boolean f11279d;

    /* renamed from: e */
    protected boolean f11280e;

    /* renamed from: f */
    protected C3683c.C3687d f11281f;

    /* renamed from: g.b.a.d$a */
    class C3689a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f11282f;

        /* renamed from: g */
        final /* synthetic */ String f11283g;

        /* renamed from: h */
        final /* synthetic */ String f11284h;

        /* renamed from: i */
        final /* synthetic */ C3683c.C3686c f11285i;

        C3689a(Context context, String str, String str2, C3683c.C3686c cVar) {
            this.f11282f = context;
            this.f11283g = str;
            this.f11284h = str2;
            this.f11285i = cVar;
        }

        public void run() {
            try {
                C3688d.this.m15482g(this.f11282f, this.f11283g, this.f11284h);
                this.f11285i.mo12202b();
            } catch (C3682b | UnsatisfiedLinkError e) {
                this.f11285i.mo12201a(e);
            }
        }
    }

    /* renamed from: g.b.a.d$b */
    class C3690b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f11287a;

        C3690b(C3688d dVar, String str) {
            this.f11287a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.f11287a);
        }
    }

    protected C3688d() {
        this(new C3691e(), new C3680a());
    }

    protected C3688d(C3683c.C3685b bVar, C3683c.C3684a aVar) {
        this.f11276a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f11277b = bVar;
            this.f11278c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m15482g(Context context, String str, String str2) {
        C3701i iVar;
        C3701i iVar2;
        if (!this.f11276a.contains(str) || this.f11279d) {
            try {
                this.f11277b.mo12198c(str);
                this.f11276a.add(str);
                mo12210i("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                mo12210i("Loading the library normally failed: %s", Log.getStackTraceString(e));
                mo12210i("%s (%s) was not loaded normally, re-linking...", str, str2);
                File d = mo12206d(context, str, str2);
                if (!d.exists() || this.f11279d) {
                    if (this.f11279d) {
                        mo12210i("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    mo12204b(context, str, str2);
                    this.f11278c.mo12195a(context, this.f11277b.mo12199d(), this.f11277b.mo12196a(str), d, this);
                }
                try {
                    if (this.f11280e) {
                        iVar = null;
                        iVar2 = new C3701i(d);
                        List<String> j = iVar2.mo12218j();
                        iVar2.close();
                        for (String b : j) {
                            mo12207e(context, this.f11277b.mo12197b(b));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f11277b.mo12200e(d.getAbsolutePath());
                this.f11276a.add(str);
                mo12210i("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th) {
                th = th;
                iVar = iVar2;
                iVar.close();
                throw th;
            }
        } else {
            mo12210i("%s already loaded previously!", str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12204b(Context context, String str, String str2) {
        File c = mo12205c(context);
        File d = mo12206d(context, str, str2);
        File[] listFiles = c.listFiles(new C3690b(this, this.f11277b.mo12196a(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f11279d || !file.getAbsolutePath().equals(d.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public File mo12205c(Context context) {
        return context.getDir("lib", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public File mo12206d(Context context, String str, String str2) {
        String a = this.f11277b.mo12196a(str);
        if (C3692f.m15495a(str2)) {
            return new File(mo12205c(context), a);
        }
        File c = mo12205c(context);
        return new File(c, a + "." + str2);
    }

    /* renamed from: e */
    public void mo12207e(Context context, String str) {
        mo12208f(context, str, (String) null, (C3683c.C3686c) null);
    }

    /* renamed from: f */
    public void mo12208f(Context context, String str, String str2, C3683c.C3686c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C3692f.m15495a(str)) {
            mo12210i("Beginning load of %s...", str);
            if (cVar == null) {
                m15482g(context, str, str2);
            } else {
                new Thread(new C3689a(context, str, str2, cVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* renamed from: h */
    public void mo12209h(String str) {
        C3683c.C3687d dVar = this.f11281f;
        if (dVar != null) {
            dVar.mo12203a(str);
        }
    }

    /* renamed from: i */
    public void mo12210i(String str, Object... objArr) {
        mo12209h(String.format(Locale.US, str, objArr));
    }
}
