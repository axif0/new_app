package p148g.p189d.p190a.p232c.p241f.p247f;

import p148g.p189d.p190a.p232c.p241f.p247f.C4614j5;
import p148g.p189d.p190a.p232c.p241f.p247f.C4652l5;

/* renamed from: g.d.a.c.f.f.l5 */
public abstract class C4652l5<MessageType extends C4614j5<MessageType, BuilderType>, BuilderType extends C4652l5<MessageType, BuilderType>> implements C4637k8 {
    /* renamed from: H */
    public final /* synthetic */ C4637k8 mo14347H(byte[] bArr, C4673m6 m6Var) throws C4636k7 {
        mo14386n(bArr, 0, bArr.length, m6Var);
        return this;
    }

    /* renamed from: Q */
    public final /* synthetic */ C4637k8 mo14348Q(byte[] bArr) throws C4636k7 {
        mo14385l(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: S */
    public final /* synthetic */ C4637k8 mo14349S(C4655l8 l8Var) {
        if (mo14481i().getClass().isInstance(l8Var)) {
            mo14384k((C4614j5) l8Var);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract BuilderType mo14384k(MessageType messagetype);

    /* renamed from: l */
    public abstract BuilderType mo14385l(byte[] bArr, int i, int i2) throws C4636k7;

    /* renamed from: n */
    public abstract BuilderType mo14386n(byte[] bArr, int i, int i2, C4673m6 m6Var) throws C4636k7;
}
