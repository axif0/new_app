package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p006n.C1012e;
import com.bumptech.glide.load.p008o.C1110i;
import com.bumptech.glide.p029s.C1401j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.t */
public class C1138t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final C3346e<List<Throwable>> f4281a;

    /* renamed from: b */
    private final List<? extends C1110i<Data, ResourceType, Transcode>> f4282b;

    /* renamed from: c */
    private final String f4283c;

    public C1138t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1110i<Data, ResourceType, Transcode>> list, C3346e<List<Throwable>> eVar) {
        this.f4281a = eVar;
        C1401j.m6971c(list);
        this.f4282b = list;
        this.f4283c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C1141v<Transcode> m6012b(C1012e<Data> eVar, C1002i iVar, int i, int i2, C1110i.C1111a<ResourceType> aVar, List<Throwable> list) throws C1134q {
        List<Throwable> list2 = list;
        int size = this.f4282b.size();
        C1141v<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((C1110i) this.f4282b.get(i3)).mo5376a(eVar, i, i2, iVar, aVar);
            } catch (C1134q e) {
                list2.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1134q(this.f4283c, (List<Throwable>) new ArrayList(list2));
    }

    /* renamed from: a */
    public C1141v<Transcode> mo5446a(C1012e<Data> eVar, C1002i iVar, int i, int i2, C1110i.C1111a<ResourceType> aVar) throws C1134q {
        List<Throwable> b = this.f4281a.mo5909b();
        C1401j.m6972d(b);
        List list = b;
        try {
            return m6012b(eVar, iVar, i, i2, aVar, list);
        } finally {
            this.f4281a.mo5908a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4282b.toArray()) + '}';
    }
}
