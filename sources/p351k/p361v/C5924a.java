package p351k.p361v;

import p351k.p361v.p363d.C5951b;
import p351k.p361v.p363d.C5956g;
import p351k.p361v.p363d.C5965p;
import p351k.p366y.C5976b;

/* renamed from: k.v.a */
public final class C5924a {
    /* renamed from: a */
    public static final <T> Class<T> m24479a(C5976b<T> bVar) {
        C5956g.m24500e(bVar, "$this$javaObjectType");
        Class a = ((C5951b) bVar).mo16999a();
        if (a.isPrimitive()) {
            String name = a.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            a = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            a = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            a = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            a = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            a = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            a = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            a = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            a = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            a = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (a != null) {
                return a;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (a != null) {
            return a;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    /* renamed from: b */
    public static final <T> C5976b<T> m24480b(Class<T> cls) {
        C5956g.m24500e(cls, "$this$kotlin");
        return C5965p.m24520a(cls);
    }
}
