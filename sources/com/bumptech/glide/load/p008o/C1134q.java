package com.bumptech.glide.load.p008o;

import android.util.Log;
import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0998g;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.q */
public final class C1134q extends Exception {

    /* renamed from: k */
    private static final StackTraceElement[] f4271k = new StackTraceElement[0];

    /* renamed from: f */
    private final List<Throwable> f4272f;

    /* renamed from: g */
    private C0998g f4273g;

    /* renamed from: h */
    private C0992a f4274h;

    /* renamed from: i */
    private Class<?> f4275i;

    /* renamed from: j */
    private String f4276j;

    /* renamed from: com.bumptech.glide.load.o.q$a */
    private static final class C1135a implements Appendable {

        /* renamed from: f */
        private final Appendable f4277f;

        /* renamed from: g */
        private boolean f4278g = true;

        C1135a(Appendable appendable) {
            this.f4277f = appendable;
        }

        /* renamed from: a */
        private CharSequence m6006a(CharSequence charSequence) {
            return charSequence == null ? BuildConfig.FLAVOR : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f4278g) {
                this.f4278g = false;
                this.f4277f.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f4278g = z;
            this.f4277f.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m6006a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m6006a(charSequence);
            boolean z = false;
            if (this.f4278g) {
                this.f4278g = false;
                this.f4277f.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f4278g = z;
            this.f4277f.append(a, i, i2);
            return this;
        }
    }

    public C1134q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public C1134q(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public C1134q(String str, List<Throwable> list) {
        this.f4276j = str;
        setStackTrace(f4271k);
        this.f4272f = list;
    }

    /* renamed from: a */
    private void m5995a(Throwable th, List<Throwable> list) {
        if (th instanceof C1134q) {
            for (Throwable a : ((C1134q) th).mo5428e()) {
                m5995a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m5996b(List<Throwable> list, Appendable appendable) {
        try {
            m5997c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m5997c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C1134q) {
                ((C1134q) th).m5999h(appendable);
            } else {
                m5998d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m5998d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m5999h(Appendable appendable) {
        m5998d(this, appendable);
        m5996b(mo5428e(), new C1135a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> mo5428e() {
        return this.f4272f;
    }

    /* renamed from: f */
    public List<Throwable> mo5429f() {
        ArrayList arrayList = new ArrayList();
        m5995a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void mo5431g(String str) {
        List<Throwable> f = mo5429f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4276j);
        Class<?> cls = this.f4275i;
        String str4 = BuildConfig.FLAVOR;
        if (cls != null) {
            str = ", " + this.f4275i;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f4274h != null) {
            str2 = ", " + this.f4274h;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f4273g != null) {
            str4 = ", " + this.f4273g;
        }
        sb.append(str4);
        List<Throwable> f = mo5429f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            str3 = " causes:";
        }
        sb.append(str3);
        for (Throwable next : f) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5433j(C0998g gVar, C0992a aVar) {
        mo5434k(gVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5434k(C0998g gVar, C0992a aVar, Class<?> cls) {
        this.f4273g = gVar;
        this.f4274h = aVar;
        this.f4275i = cls;
    }

    /* renamed from: l */
    public void mo5435l(Exception exc) {
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m5999h(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        m5999h(printWriter);
    }
}
