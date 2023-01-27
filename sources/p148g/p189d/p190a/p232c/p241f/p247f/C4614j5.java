package p148g.p189d.p190a.p232c.p241f.p247f;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p148g.p189d.p190a.p232c.p241f.p247f.C4614j5;
import p148g.p189d.p190a.p232c.p241f.p247f.C4652l5;

/* renamed from: g.d.a.c.f.f.j5 */
public abstract class C4614j5<MessageType extends C4614j5<MessageType, BuilderType>, BuilderType extends C4652l5<MessageType, BuilderType>> implements C4655l8 {
    protected int zza = 0;

    /* renamed from: j */
    protected static <T> void m19656j(Iterable<T> iterable, List<? super T> list) {
        C4470b7.m18816d(iterable);
        if (iterable instanceof C4758r7) {
            List<?> b = ((C4758r7) iterable).mo14575b();
            C4758r7 r7Var = (C4758r7) list;
            int size = list.size();
            for (Object next : b) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(r7Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = r7Var.size() - 1; size2 >= size; size2--) {
                        r7Var.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C4773s5) {
                    r7Var.mo14577n((C4773s5) next);
                } else {
                    r7Var.add((String) next);
                }
            }
        } else if (iterable instanceof C4859x8) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    /* renamed from: b */
    public final C4773s5 mo14267b() {
        try {
            C4894z5 u = C4773s5.m20340u(mo14431c());
            mo14433e(u.mo14808b());
            return u.mo14807a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: k */
    public final byte[] mo14268k() {
        try {
            byte[] bArr = new byte[mo14431c()];
            C4615j6 f = C4615j6.m19690f(bArr);
            mo14433e(f);
            f.mo14271N();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo14269l() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo14270n(int i) {
        throw new UnsupportedOperationException();
    }
}
