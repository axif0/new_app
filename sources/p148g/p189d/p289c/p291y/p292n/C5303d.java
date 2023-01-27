package p148g.p189d.p289c.p291y.p292n;

import p148g.p189d.p289c.C5221f;
import p148g.p189d.p289c.C5245v;
import p148g.p189d.p289c.C5247w;
import p148g.p189d.p289c.p290x.C5249b;
import p148g.p189d.p289c.p291y.C5258c;
import p148g.p189d.p289c.p295z.C5368a;

/* renamed from: g.d.c.y.n.d */
public final class C5303d implements C5247w {

    /* renamed from: f */
    private final C5258c f15383f;

    public C5303d(C5258c cVar) {
        this.f15383f = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: g.d.c.v<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: g.d.c.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: g.d.c.y.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: g.d.c.y.n.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: g.d.c.y.n.l} */
    /* JADX WARNING: type inference failed for: r9v3, types: [g.d.c.v, g.d.c.v<?>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p148g.p189d.p289c.C5245v<?> mo15494a(p148g.p189d.p289c.p291y.C5258c r9, p148g.p189d.p289c.C5221f r10, p148g.p189d.p289c.p295z.C5368a<?> r11, p148g.p189d.p289c.p290x.C5249b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            g.d.c.z.a r0 = p148g.p189d.p289c.p295z.C5368a.m22161a(r0)
            g.d.c.y.i r9 = r9.mo15429a(r0)
            java.lang.Object r9 = r9.mo15431a()
            boolean r0 = r9 instanceof p148g.p189d.p289c.C5245v
            if (r0 == 0) goto L_0x0017
            g.d.c.v r9 = (p148g.p189d.p289c.C5245v) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof p148g.p189d.p289c.C5247w
            if (r0 == 0) goto L_0x0022
            g.d.c.w r9 = (p148g.p189d.p289c.C5247w) r9
            g.d.c.v r9 = r9.mo15405b(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof p148g.p189d.p289c.C5240s
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof p148g.p189d.p289c.C5232k
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            g.d.c.s r0 = (p148g.p189d.p289c.C5240s) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof p148g.p189d.p289c.C5232k
            if (r0 == 0) goto L_0x006b
            r1 = r9
            g.d.c.k r1 = (p148g.p189d.p289c.C5232k) r1
        L_0x006b:
            r4 = r1
            g.d.c.y.n.l r9 = new g.d.c.y.n.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            g.d.c.v r9 = r9.mo15403a()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p148g.p189d.p289c.p291y.p292n.C5303d.mo15494a(g.d.c.y.c, g.d.c.f, g.d.c.z.a, g.d.c.x.b):g.d.c.v");
    }

    /* renamed from: b */
    public <T> C5245v<T> mo15405b(C5221f fVar, C5368a<T> aVar) {
        C5249b bVar = (C5249b) aVar.mo15578c().getAnnotation(C5249b.class);
        if (bVar == null) {
            return null;
        }
        return mo15494a(this.f15383f, fVar, aVar, bVar);
    }
}
