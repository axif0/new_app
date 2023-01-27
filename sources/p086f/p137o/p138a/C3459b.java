package p086f.p137o.p138a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C0717i;
import androidx.lifecycle.C0724n;
import androidx.lifecycle.C0725o;
import androidx.lifecycle.C0736t;
import androidx.lifecycle.C0737u;
import androidx.lifecycle.C0741v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p086f.p102e.C3204h;
import p086f.p111h.p121l.C3342a;
import p086f.p137o.p139b.C3464a;

/* renamed from: f.o.a.b */
class C3459b extends C3458a {

    /* renamed from: c */
    static boolean f10854c = false;

    /* renamed from: a */
    private final C0717i f10855a;

    /* renamed from: b */
    private final C3462c f10856b;

    /* renamed from: f.o.a.b$a */
    public static class C3460a<D> extends C0724n<D> {

        /* renamed from: j */
        private final int f10857j;

        /* renamed from: k */
        private final Bundle f10858k;

        /* renamed from: l */
        private final C3464a<D> f10859l;

        /* renamed from: m */
        private C0717i f10860m;

        /* renamed from: n */
        private C3461b<D> f10861n;

        /* renamed from: o */
        private C3464a<D> f10862o;

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo3630e() {
            if (C3459b.f10854c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f10859l.mo11856d();
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo3631f() {
            if (C3459b.f10854c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f10859l.mo11857e();
            throw null;
        }

        /* renamed from: g */
        public void mo3632g(C0725o<? super D> oVar) {
            super.mo3632g(oVar);
            this.f10860m = null;
            this.f10861n = null;
        }

        /* renamed from: h */
        public void mo3633h(D d) {
            super.mo3633h(d);
            C3464a<D> aVar = this.f10862o;
            if (aVar != null) {
                aVar.mo11855c();
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C3464a<D> mo11847i(boolean z) {
            if (C3459b.f10854c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f10859l.mo11853a();
            throw null;
        }

        /* renamed from: j */
        public void mo11848j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10857j);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10858k);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f10859l);
            C3464a<D> aVar = this.f10859l;
            aVar.mo11854b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo11849k() {
            C0717i iVar = this.f10860m;
            C3461b<D> bVar = this.f10861n;
            if (iVar != null && bVar != null) {
                super.mo3632g(bVar);
                mo3629d(iVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f10857j);
            sb.append(" : ");
            C3342a.m14348a(this.f10859l, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: f.o.a.b$b */
    static class C3461b<D> implements C0725o<D> {
    }

    /* renamed from: f.o.a.b$c */
    static class C3462c extends C0736t {

        /* renamed from: c */
        private static final C0737u.C0738a f10863c = new C3463a();

        /* renamed from: b */
        private C3204h<C3460a> f10864b = new C3204h<>();

        /* renamed from: f.o.a.b$c$a */
        static class C3463a implements C0737u.C0738a {
            C3463a() {
            }

            /* renamed from: a */
            public <T extends C0736t> T mo3508a(Class<T> cls) {
                return new C3462c();
            }
        }

        C3462c() {
        }

        /* renamed from: f */
        static C3462c m14950f(C0741v vVar) {
            return (C3462c) new C0737u(vVar, f10863c).mo3714a(C3462c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3495d() {
            super.mo3495d();
            if (this.f10864b.mo11160q() <= 0) {
                this.f10864b.mo11150c();
            } else {
                this.f10864b.mo11161r(0).mo11847i(true);
                throw null;
            }
        }

        /* renamed from: e */
        public void mo11851e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10864b.mo11160q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f10864b.mo11160q() > 0) {
                    C3460a r = this.f10864b.mo11161r(0);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10864b.mo11157l(0));
                    printWriter.print(": ");
                    printWriter.println(r.toString());
                    r.mo11848j(str2, fileDescriptor, printWriter, strArr);
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo11852g() {
            int q = this.f10864b.mo11160q();
            for (int i = 0; i < q; i++) {
                this.f10864b.mo11161r(i).mo11849k();
            }
        }
    }

    C3459b(C0717i iVar, C0741v vVar) {
        this.f10855a = iVar;
        this.f10856b = C3462c.m14950f(vVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo11844a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10856b.mo11851e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo11845c() {
        this.f10856b.mo11852g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C3342a.m14348a(this.f10855a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
