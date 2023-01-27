package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p086f.p102e.C3190a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C0936a {

    /* renamed from: a */
    protected final C3190a<String, Method> f3709a;

    /* renamed from: b */
    protected final C3190a<String, Method> f3710b;

    /* renamed from: c */
    protected final C3190a<String, Class> f3711c;

    public C0936a(C3190a<String, Method> aVar, C3190a<String, Method> aVar2, C3190a<String, Class> aVar3) {
        this.f3709a = aVar;
        this.f3710b = aVar2;
        this.f3711c = aVar3;
    }

    /* renamed from: N */
    private void m5236N(C0938c cVar) {
        try {
            mo4898I(m5237c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m5237c(Class<? extends C0938c> cls) throws ClassNotFoundException {
        Class cls2 = this.f3711c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f3711c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m5238d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<C0936a> cls = C0936a.class;
        Method method = this.f3709a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f3709a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m5239e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f3710b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m5237c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C0936a.class});
        this.f3710b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo4890A(byte[] bArr);

    /* renamed from: B */
    public void mo4891B(byte[] bArr, int i) {
        mo4922w(i);
        mo4890A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo4892C(CharSequence charSequence);

    /* renamed from: D */
    public void mo4893D(CharSequence charSequence, int i) {
        mo4922w(i);
        mo4892C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo4894E(int i);

    /* renamed from: F */
    public void mo4895F(int i, int i2) {
        mo4922w(i2);
        mo4894E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo4896G(Parcelable parcelable);

    /* renamed from: H */
    public void mo4897H(Parcelable parcelable, int i) {
        mo4922w(i);
        mo4896G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo4898I(String str);

    /* renamed from: J */
    public void mo4899J(String str, int i) {
        mo4922w(i);
        mo4898I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C0938c> void mo4900K(T t, C0936a aVar) {
        try {
            m5239e(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo4901L(C0938c cVar) {
        if (cVar == null) {
            mo4898I((String) null);
            return;
        }
        m5236N(cVar);
        C0936a b = mo4904b();
        mo4900K(cVar, b);
        b.mo4903a();
    }

    /* renamed from: M */
    public void mo4902M(C0938c cVar, int i) {
        mo4922w(i);
        mo4901L(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4903a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0936a mo4904b();

    /* renamed from: f */
    public boolean mo4905f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo4906g();

    /* renamed from: h */
    public boolean mo4907h(boolean z, int i) {
        return !mo4912m(i) ? z : mo4906g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo4908i();

    /* renamed from: j */
    public byte[] mo4909j(byte[] bArr, int i) {
        return !mo4912m(i) ? bArr : mo4908i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo4910k();

    /* renamed from: l */
    public CharSequence mo4911l(CharSequence charSequence, int i) {
        return !mo4912m(i) ? charSequence : mo4910k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo4912m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C0938c> T mo4913n(String str, C0936a aVar) {
        try {
            return (C0938c) m5238d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo4914o();

    /* renamed from: p */
    public int mo4915p(int i, int i2) {
        return !mo4912m(i2) ? i : mo4914o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo4916q();

    /* renamed from: r */
    public <T extends Parcelable> T mo4917r(T t, int i) {
        return !mo4912m(i) ? t : mo4916q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo4918s();

    /* renamed from: t */
    public String mo4919t(String str, int i) {
        return !mo4912m(i) ? str : mo4918s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C0938c> T mo4920u() {
        String s = mo4918s();
        if (s == null) {
            return null;
        }
        return mo4913n(s, mo4904b());
    }

    /* renamed from: v */
    public <T extends C0938c> T mo4921v(T t, int i) {
        return !mo4912m(i) ? t : mo4920u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo4922w(int i);

    /* renamed from: x */
    public void mo4923x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo4924y(boolean z);

    /* renamed from: z */
    public void mo4925z(boolean z, int i) {
        mo4922w(i);
        mo4924y(z);
    }
}
