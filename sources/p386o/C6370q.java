package p386o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.HttpConnection;
import p351k.p355t.C5895d;
import p374m.C6099a0;
import p374m.C6255s;
import p374m.C6257t;
import p374m.C6261v;
import p374m.C6262w;
import p386o.C6351n;
import p386o.p389y.C6386a;
import p386o.p389y.C6387b;
import p386o.p389y.C6388c;
import p386o.p389y.C6389d;
import p386o.p389y.C6390e;
import p386o.p389y.C6391f;
import p386o.p389y.C6392g;
import p386o.p389y.C6393h;
import p386o.p389y.C6394i;
import p386o.p389y.C6395j;
import p386o.p389y.C6396k;
import p386o.p389y.C6397l;
import p386o.p389y.C6398m;
import p386o.p389y.C6399n;
import p386o.p389y.C6400o;
import p386o.p389y.C6401p;
import p386o.p389y.C6402q;
import p386o.p389y.C6403r;
import p386o.p389y.C6404s;

/* renamed from: o.q */
final class C6370q {

    /* renamed from: a */
    private final Method f17938a;

    /* renamed from: b */
    private final C6257t f17939b;

    /* renamed from: c */
    final String f17940c;

    /* renamed from: d */
    private final String f17941d;

    /* renamed from: e */
    private final C6255s f17942e;

    /* renamed from: f */
    private final C6261v f17943f;

    /* renamed from: g */
    private final boolean f17944g;

    /* renamed from: h */
    private final boolean f17945h;

    /* renamed from: i */
    private final boolean f17946i;

    /* renamed from: j */
    private final C6351n<?>[] f17947j;

    /* renamed from: k */
    final boolean f17948k;

    /* renamed from: o.q$a */
    static final class C6371a {

        /* renamed from: x */
        private static final Pattern f17949x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f17950y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final C6373s f17951a;

        /* renamed from: b */
        final Method f17952b;

        /* renamed from: c */
        final Annotation[] f17953c;

        /* renamed from: d */
        final Annotation[][] f17954d;

        /* renamed from: e */
        final Type[] f17955e;

        /* renamed from: f */
        boolean f17956f;

        /* renamed from: g */
        boolean f17957g;

        /* renamed from: h */
        boolean f17958h;

        /* renamed from: i */
        boolean f17959i;

        /* renamed from: j */
        boolean f17960j;

        /* renamed from: k */
        boolean f17961k;

        /* renamed from: l */
        boolean f17962l;

        /* renamed from: m */
        boolean f17963m;

        /* renamed from: n */
        String f17964n;

        /* renamed from: o */
        boolean f17965o;

        /* renamed from: p */
        boolean f17966p;

        /* renamed from: q */
        boolean f17967q;

        /* renamed from: r */
        String f17968r;

        /* renamed from: s */
        C6255s f17969s;

        /* renamed from: t */
        C6261v f17970t;

        /* renamed from: u */
        Set<String> f17971u;

        /* renamed from: v */
        C6351n<?>[] f17972v;

        /* renamed from: w */
        boolean f17973w;

        C6371a(C6373s sVar, Method method) {
            this.f17951a = sVar;
            this.f17952b = method;
            this.f17953c = method.getAnnotations();
            this.f17955e = method.getGenericParameterTypes();
            this.f17954d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static Class<?> m26173a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: c */
        private C6255s m26174c(String[] strArr) {
            C6255s.C6256a aVar = new C6255s.C6256a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C6379w.m26221n(this.f17952b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (HttpConnection.CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    try {
                        this.f17970t = C6261v.m25703b(trim);
                    } catch (IllegalArgumentException e) {
                        throw C6379w.m26222o(this.f17952b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo17690a(substring, trim);
                }
            }
            return aVar.mo17693d();
        }

        /* renamed from: d */
        private void m26175d(String str, String str2, boolean z) {
            String str3 = this.f17964n;
            if (str3 == null) {
                this.f17964n = str;
                this.f17965o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f17949x.matcher(substring).find()) {
                            throw C6379w.m26221n(this.f17952b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f17968r = str2;
                    this.f17971u = m26179h(str2);
                    return;
                }
                return;
            }
            throw C6379w.m26221n(this.f17952b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        private void m26176e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof C6386a) {
                value = ((C6386a) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof C6390e) {
                value = ((C6390e) annotation).value();
                str = "GET";
            } else if (annotation instanceof C6391f) {
                value = ((C6391f) annotation).value();
                str = "HEAD";
            } else {
                if (annotation instanceof C6396k) {
                    value2 = ((C6396k) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof C6397l) {
                    value2 = ((C6397l) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof C6398m) {
                    value2 = ((C6398m) annotation).value();
                    str2 = "PUT";
                } else if (annotation instanceof C6395j) {
                    value = ((C6395j) annotation).value();
                    str = "OPTIONS";
                } else if (annotation instanceof C6392g) {
                    C6392g gVar = (C6392g) annotation;
                    m26175d(gVar.method(), gVar.path(), gVar.hasBody());
                    return;
                } else if (annotation instanceof C6394i) {
                    String[] value3 = ((C6394i) annotation).value();
                    if (value3.length != 0) {
                        this.f17969s = m26174c(value3);
                        return;
                    }
                    throw C6379w.m26221n(this.f17952b, "@Headers annotation is empty.", new Object[0]);
                } else if (!(annotation instanceof C6389d)) {
                    return;
                } else {
                    if (!this.f17967q) {
                        this.f17966p = true;
                        return;
                    }
                    throw C6379w.m26221n(this.f17952b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                m26175d(str2, value2, true);
                return;
            }
            m26175d(str, value, false);
        }

        /* renamed from: f */
        private C6351n<?> m26177f(int i, Type type, Annotation[] annotationArr, boolean z) {
            C6351n<?> nVar;
            if (annotationArr != null) {
                nVar = null;
                for (Annotation g : annotationArr) {
                    C6351n<?> g2 = m26178g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (nVar == null) {
                            nVar = g2;
                        } else {
                            throw C6379w.m26223p(this.f17952b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                return nVar;
            }
            if (z) {
                try {
                    if (C6379w.m26216i(type) == C5895d.class) {
                        this.f17973w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C6379w.m26223p(this.f17952b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        private C6351n<?> m26178g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C6262w.C6264b> cls2 = C6262w.C6264b.class;
            if (annotation instanceof C6401p) {
                m26181j(i, type);
                if (this.f17960j) {
                    throw C6379w.m26223p(this.f17952b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f17961k) {
                    throw C6379w.m26223p(this.f17952b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f17962l) {
                    throw C6379w.m26223p(this.f17952b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f17963m) {
                    throw C6379w.m26223p(this.f17952b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f17968r != null) {
                    this.f17959i = true;
                    C6401p pVar = (C6401p) annotation;
                    String value = pVar.value();
                    m26180i(i, value);
                    return new C6351n.C6359h(this.f17952b, i, value, this.f17951a.mo18006j(type, annotationArr), pVar.encoded());
                } else {
                    throw C6379w.m26223p(this.f17952b, i, "@Path can only be used with relative url on @%s", this.f17964n);
                }
            } else if (annotation instanceof C6402q) {
                m26181j(i, type);
                C6402q qVar = (C6402q) annotation;
                String value2 = qVar.value();
                boolean encoded = qVar.encoded();
                Class<?> i2 = C6379w.m26216i(type);
                this.f17960j = true;
                if (Iterable.class.isAssignableFrom(i2)) {
                    if (type instanceof ParameterizedType) {
                        return new C6351n.C6360i(value2, this.f17951a.mo18006j(C6379w.m26215h(0, (ParameterizedType) type), annotationArr), encoded).mo17971c();
                    }
                    Method method = this.f17952b;
                    throw C6379w.m26223p(method, i, i2.getSimpleName() + " must include generic type (e.g., " + i2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i2.isArray()) {
                    return new C6351n.C6360i(value2, this.f17951a.mo18006j(type, annotationArr), encoded);
                } else {
                    return new C6351n.C6360i(value2, this.f17951a.mo18006j(m26173a(i2.getComponentType()), annotationArr), encoded).mo17970b();
                }
            } else if (annotation instanceof C6404s) {
                m26181j(i, type);
                boolean encoded2 = ((C6404s) annotation).encoded();
                Class<?> i3 = C6379w.m26216i(type);
                this.f17961k = true;
                if (Iterable.class.isAssignableFrom(i3)) {
                    if (type instanceof ParameterizedType) {
                        return new C6351n.C6362k(this.f17951a.mo18006j(C6379w.m26215h(0, (ParameterizedType) type), annotationArr), encoded2).mo17971c();
                    }
                    Method method2 = this.f17952b;
                    throw C6379w.m26223p(method2, i, i3.getSimpleName() + " must include generic type (e.g., " + i3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i3.isArray()) {
                    return new C6351n.C6362k(this.f17951a.mo18006j(type, annotationArr), encoded2);
                } else {
                    return new C6351n.C6362k(this.f17951a.mo18006j(m26173a(i3.getComponentType()), annotationArr), encoded2).mo17970b();
                }
            } else if (annotation instanceof C6403r) {
                m26181j(i, type);
                Class<?> i4 = C6379w.m26216i(type);
                this.f17962l = true;
                if (Map.class.isAssignableFrom(i4)) {
                    Type j = C6379w.m26217j(type, i4, Map.class);
                    if (j instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) j;
                        Type h = C6379w.m26215h(0, parameterizedType);
                        if (cls == h) {
                            return new C6351n.C6361j(this.f17952b, i, this.f17951a.mo18006j(C6379w.m26215h(1, parameterizedType), annotationArr), ((C6403r) annotation).encoded());
                        }
                        Method method3 = this.f17952b;
                        throw C6379w.m26223p(method3, i, "@QueryMap keys must be of type String: " + h, new Object[0]);
                    }
                    throw C6379w.m26223p(this.f17952b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C6379w.m26223p(this.f17952b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C6393h) {
                m26181j(i, type);
                String value3 = ((C6393h) annotation).value();
                Class<?> i5 = C6379w.m26216i(type);
                if (Iterable.class.isAssignableFrom(i5)) {
                    if (type instanceof ParameterizedType) {
                        return new C6351n.C6356e(value3, this.f17951a.mo18006j(C6379w.m26215h(0, (ParameterizedType) type), annotationArr)).mo17971c();
                    }
                    Method method4 = this.f17952b;
                    throw C6379w.m26223p(method4, i, i5.getSimpleName() + " must include generic type (e.g., " + i5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!i5.isArray()) {
                    return new C6351n.C6356e(value3, this.f17951a.mo18006j(type, annotationArr));
                } else {
                    return new C6351n.C6356e(value3, this.f17951a.mo18006j(m26173a(i5.getComponentType()), annotationArr)).mo17970b();
                }
            } else if (annotation instanceof C6387b) {
                m26181j(i, type);
                if (this.f17966p) {
                    C6387b bVar = (C6387b) annotation;
                    String value4 = bVar.value();
                    boolean encoded3 = bVar.encoded();
                    this.f17956f = true;
                    Class<?> i6 = C6379w.m26216i(type);
                    if (Iterable.class.isAssignableFrom(i6)) {
                        if (type instanceof ParameterizedType) {
                            return new C6351n.C6354c(value4, this.f17951a.mo18006j(C6379w.m26215h(0, (ParameterizedType) type), annotationArr), encoded3).mo17971c();
                        }
                        Method method5 = this.f17952b;
                        throw C6379w.m26223p(method5, i, i6.getSimpleName() + " must include generic type (e.g., " + i6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!i6.isArray()) {
                        return new C6351n.C6354c(value4, this.f17951a.mo18006j(type, annotationArr), encoded3);
                    } else {
                        return new C6351n.C6354c(value4, this.f17951a.mo18006j(m26173a(i6.getComponentType()), annotationArr), encoded3).mo17970b();
                    }
                } else {
                    throw C6379w.m26223p(this.f17952b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof C6388c) {
                m26181j(i, type);
                if (this.f17966p) {
                    Class<?> i7 = C6379w.m26216i(type);
                    if (Map.class.isAssignableFrom(i7)) {
                        Type j2 = C6379w.m26217j(type, i7, Map.class);
                        if (j2 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) j2;
                            Type h2 = C6379w.m26215h(0, parameterizedType2);
                            if (cls == h2) {
                                C6322f j3 = this.f17951a.mo18006j(C6379w.m26215h(1, parameterizedType2), annotationArr);
                                this.f17956f = true;
                                return new C6351n.C6355d(this.f17952b, i, j3, ((C6388c) annotation).encoded());
                            }
                            Method method6 = this.f17952b;
                            throw C6379w.m26223p(method6, i, "@FieldMap keys must be of type String: " + h2, new Object[0]);
                        }
                        throw C6379w.m26223p(this.f17952b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C6379w.m26223p(this.f17952b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C6379w.m26223p(this.f17952b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C6399n) {
                m26181j(i, type);
                if (this.f17967q) {
                    C6399n nVar = (C6399n) annotation;
                    this.f17957g = true;
                    String value5 = nVar.value();
                    Class<?> i8 = C6379w.m26216i(type);
                    if (!value5.isEmpty()) {
                        C6255s g = C6255s.m25631g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", nVar.encoding());
                        if (Iterable.class.isAssignableFrom(i8)) {
                            if (type instanceof ParameterizedType) {
                                Type h3 = C6379w.m26215h(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(C6379w.m26216i(h3))) {
                                    return new C6351n.C6357f(this.f17952b, i, g, this.f17951a.mo18004h(h3, annotationArr, this.f17953c)).mo17971c();
                                }
                                throw C6379w.m26223p(this.f17952b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            Method method7 = this.f17952b;
                            throw C6379w.m26223p(method7, i, i8.getSimpleName() + " must include generic type (e.g., " + i8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (i8.isArray()) {
                            Class<?> a = m26173a(i8.getComponentType());
                            if (!cls2.isAssignableFrom(a)) {
                                return new C6351n.C6357f(this.f17952b, i, g, this.f17951a.mo18004h(a, annotationArr, this.f17953c)).mo17970b();
                            }
                            throw C6379w.m26223p(this.f17952b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(i8)) {
                            return new C6351n.C6357f(this.f17952b, i, g, this.f17951a.mo18004h(type, annotationArr, this.f17953c));
                        } else {
                            throw C6379w.m26223p(this.f17952b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(i8)) {
                        if (!(type instanceof ParameterizedType)) {
                            Method method8 = this.f17952b;
                            throw C6379w.m26223p(method8, i, i8.getSimpleName() + " must include generic type (e.g., " + i8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(C6379w.m26216i(C6379w.m26215h(0, (ParameterizedType) type)))) {
                            return C6351n.C6363l.f17920a.mo17971c();
                        } else {
                            throw C6379w.m26223p(this.f17952b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (i8.isArray()) {
                        if (cls2.isAssignableFrom(i8.getComponentType())) {
                            return C6351n.C6363l.f17920a.mo17970b();
                        }
                        throw C6379w.m26223p(this.f17952b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(i8)) {
                        return C6351n.C6363l.f17920a;
                    } else {
                        throw C6379w.m26223p(this.f17952b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw C6379w.m26223p(this.f17952b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (!(annotation instanceof C6400o)) {
                return null;
            } else {
                m26181j(i, type);
                if (this.f17967q) {
                    this.f17957g = true;
                    Class<?> i9 = C6379w.m26216i(type);
                    if (Map.class.isAssignableFrom(i9)) {
                        Type j4 = C6379w.m26217j(type, i9, Map.class);
                        if (j4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) j4;
                            Type h4 = C6379w.m26215h(0, parameterizedType3);
                            if (cls == h4) {
                                Type h5 = C6379w.m26215h(1, parameterizedType3);
                                if (!cls2.isAssignableFrom(C6379w.m26216i(h5))) {
                                    return new C6351n.C6358g(this.f17952b, i, this.f17951a.mo18004h(h5, annotationArr, this.f17953c), ((C6400o) annotation).encoding());
                                }
                                throw C6379w.m26223p(this.f17952b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            Method method9 = this.f17952b;
                            throw C6379w.m26223p(method9, i, "@PartMap keys must be of type String: " + h4, new Object[0]);
                        }
                        throw C6379w.m26223p(this.f17952b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C6379w.m26223p(this.f17952b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C6379w.m26223p(this.f17952b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            }
        }

        /* renamed from: h */
        static Set<String> m26179h(String str) {
            Matcher matcher = f17949x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: i */
        private void m26180i(int i, String str) {
            if (!f17950y.matcher(str).matches()) {
                throw C6379w.m26223p(this.f17952b, i, "@Path parameter name must match %s. Found: %s", f17949x.pattern(), str);
            } else if (!this.f17971u.contains(str)) {
                throw C6379w.m26223p(this.f17952b, i, "URL \"%s\" does not contain \"{%s}\".", this.f17968r, str);
            }
        }

        /* renamed from: j */
        private void m26181j(int i, Type type) {
            if (C6379w.m26218k(type)) {
                throw C6379w.m26223p(this.f17952b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C6370q mo17992b() {
            for (Annotation e : this.f17953c) {
                m26176e(e);
            }
            if (this.f17964n != null) {
                if (!this.f17965o) {
                    if (this.f17967q) {
                        throw C6379w.m26221n(this.f17952b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f17966p) {
                        throw C6379w.m26221n(this.f17952b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f17954d.length;
                this.f17972v = new C6351n[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C6351n<?>[] nVarArr = this.f17972v;
                    Type type = this.f17955e[i2];
                    Annotation[] annotationArr = this.f17954d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    nVarArr[i2] = m26177f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f17968r == null && !this.f17963m) {
                    throw C6379w.m26221n(this.f17952b, "Missing either @%s URL or @Url parameter.", this.f17964n);
                } else if (!this.f17966p && !this.f17967q && !this.f17965o && this.f17958h) {
                    throw C6379w.m26221n(this.f17952b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                } else if (this.f17966p && !this.f17956f) {
                    throw C6379w.m26221n(this.f17952b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                } else if (!this.f17967q || this.f17957g) {
                    return new C6370q(this);
                } else {
                    throw C6379w.m26221n(this.f17952b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
            } else {
                throw C6379w.m26221n(this.f17952b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C6370q(C6371a aVar) {
        this.f17938a = aVar.f17952b;
        this.f17939b = aVar.f17951a.f17979c;
        this.f17940c = aVar.f17964n;
        this.f17941d = aVar.f17968r;
        this.f17942e = aVar.f17969s;
        this.f17943f = aVar.f17970t;
        this.f17944g = aVar.f17965o;
        this.f17945h = aVar.f17966p;
        this.f17946i = aVar.f17967q;
        this.f17947j = aVar.f17972v;
        this.f17948k = aVar.f17973w;
    }

    /* renamed from: b */
    static C6370q m26171b(C6373s sVar, Method method) {
        return new C6371a(sVar, method).mo17992b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6099a0 mo17991a(Object[] objArr) throws IOException {
        C6351n<?>[] nVarArr = this.f17947j;
        int length = objArr.length;
        if (length == nVarArr.length) {
            C6368p pVar = new C6368p(this.f17940c, this.f17939b, this.f17941d, this.f17942e, this.f17943f, this.f17944g, this.f17945h, this.f17946i);
            if (this.f17948k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                nVarArr[i].mo17969a(pVar, objArr[i]);
            }
            C6099a0.C6100a i2 = pVar.mo17990i();
            i2.mo17229g(C6335j.class, new C6335j(this.f17938a, arrayList));
            return i2.mo17223a();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + nVarArr.length + ")");
    }
}
