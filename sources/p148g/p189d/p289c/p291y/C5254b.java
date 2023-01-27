package p148g.p189d.p289c.p291y;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: g.d.c.y.b */
public final class C5254b {

    /* renamed from: a */
    static final Type[] f15311a = new Type[0];

    /* renamed from: g.d.c.y.b$a */
    private static final class C5255a implements GenericArrayType, Serializable {

        /* renamed from: f */
        private final Type f15312f;

        public C5255a(Type type) {
            this.f15312f = C5254b.m21863b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C5254b.m21867f(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f15312f;
        }

        public int hashCode() {
            return this.f15312f.hashCode();
        }

        public String toString() {
            return C5254b.m21882u(this.f15312f) + "[]";
        }
    }

    /* renamed from: g.d.c.y.b$b */
    private static final class C5256b implements ParameterizedType, Serializable {

        /* renamed from: f */
        private final Type f15313f;

        /* renamed from: g */
        private final Type f15314g;

        /* renamed from: h */
        private final Type[] f15315h;

        public C5256b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C5253a.m21860a(z);
            }
            this.f15313f = type == null ? null : C5254b.m21863b(type);
            this.f15314g = C5254b.m21863b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f15315h = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C5253a.m21861b(this.f15315h[i]);
                C5254b.m21864c(this.f15315h[i]);
                Type[] typeArr3 = this.f15315h;
                typeArr3[i] = C5254b.m21863b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C5254b.m21867f(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f15315h.clone();
        }

        public Type getOwnerType() {
            return this.f15313f;
        }

        public Type getRawType() {
            return this.f15314g;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f15315h) ^ this.f15314g.hashCode()) ^ C5254b.m21874m(this.f15313f);
        }

        public String toString() {
            int length = this.f15315h.length;
            if (length == 0) {
                return C5254b.m21882u(this.f15314g);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C5254b.m21882u(this.f15314g));
            sb.append("<");
            sb.append(C5254b.m21882u(this.f15315h[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C5254b.m21882u(this.f15315h[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: g.d.c.y.b$c */
    private static final class C5257c implements WildcardType, Serializable {

        /* renamed from: f */
        private final Type f15316f;

        /* renamed from: g */
        private final Type f15317g;

        public C5257c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C5253a.m21860a(typeArr2.length <= 1);
            C5253a.m21860a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C5253a.m21861b(typeArr2[0]);
                C5254b.m21864c(typeArr2[0]);
                C5253a.m21860a(typeArr[0] != cls ? false : z);
                this.f15317g = C5254b.m21863b(typeArr2[0]);
                this.f15316f = cls;
                return;
            }
            C5253a.m21861b(typeArr[0]);
            C5254b.m21864c(typeArr[0]);
            this.f15317g = null;
            this.f15316f = C5254b.m21863b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C5254b.m21867f(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f15317g;
            if (type == null) {
                return C5254b.f15311a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f15316f};
        }

        public int hashCode() {
            Type type = this.f15317g;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f15316f.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f15317g != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f15317g;
            } else if (this.f15316f == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f15316f;
            }
            sb.append(C5254b.m21882u(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static GenericArrayType m21862a(Type type) {
        return new C5255a(type);
    }

    /* renamed from: b */
    public static Type m21863b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C5255a(m21863b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5256b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C5255a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C5257c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: c */
    static void m21864c(Type type) {
        C5253a.m21860a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    private static Class<?> m21865d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m21866e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m21867f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m21866e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m21867f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: g */
    public static Type m21868g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m21869h(Type type, Class<?> cls) {
        Type l = m21873l(type, cls, Collection.class);
        if (l instanceof WildcardType) {
            l = ((WildcardType) l).getUpperBounds()[0];
        }
        return l instanceof ParameterizedType ? ((ParameterizedType) l).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    static Type m21870i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m21870i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m21870i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m21871j(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type l = m21873l(type, cls, Map.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: k */
    public static Class<?> m21872k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C5253a.m21860a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m21872k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m21872k(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: l */
    static Type m21873l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C5253a.m21860a(cls2.isAssignableFrom(cls));
        return m21877p(type, cls, m21870i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m21874m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m21875n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m21876o(Type type, Type type2, Type... typeArr) {
        return new C5256b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m21877p(Type type, Class<?> cls, Type type2) {
        return m21878q(type, cls, type2, new HashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m21878q(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m21879r(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m21878q(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = m21862a(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m21878q(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = m21862a(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008b
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m21878q(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m21878q(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008a
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = m21876o(r3, r8, r4)
        L_0x008a:
            return r10
        L_0x008b:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bd
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ab
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m21878q(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bd
            java.lang.reflect.WildcardType r8 = m21881t(r8)
            return r8
        L_0x00ab:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bd
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m21878q(r8, r9, r0, r11)     // Catch:{ all -> 0x00be }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bd
            java.lang.reflect.WildcardType r8 = m21880s(r8)
            return r8
        L_0x00bd:
            return r10
        L_0x00be:
            r8 = move-exception
            goto L_0x00c1
        L_0x00c0:
            throw r8
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p289c.p291y.C5254b.m21878q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m21879r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = m21865d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type i = m21870i(type, cls, d);
        if (!(i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i).getActualTypeArguments()[m21875n(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m21880s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C5257c(typeArr, f15311a);
    }

    /* renamed from: t */
    public static WildcardType m21881t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C5257c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: u */
    public static String m21882u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
