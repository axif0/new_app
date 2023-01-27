package com.bumptech.glide.load.p008o;

import android.util.Log;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1004k;
import com.bumptech.glide.load.p006n.C1012e;
import com.bumptech.glide.load.p014q.p020i.C1314e;
import com.bumptech.glide.p029s.C1401j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p086f.p111h.p121l.C3346e;

/* renamed from: com.bumptech.glide.load.o.i */
public class C1110i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f4189a;

    /* renamed from: b */
    private final List<? extends C1004k<DataType, ResourceType>> f4190b;

    /* renamed from: c */
    private final C1314e<ResourceType, Transcode> f4191c;

    /* renamed from: d */
    private final C3346e<List<Throwable>> f4192d;

    /* renamed from: e */
    private final String f4193e;

    /* renamed from: com.bumptech.glide.load.o.i$a */
    interface C1111a<ResourceType> {
        /* renamed from: a */
        C1141v<ResourceType> mo5366a(C1141v<ResourceType> vVar);
    }

    public C1110i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C1004k<DataType, ResourceType>> list, C1314e<ResourceType, Transcode> eVar, C3346e<List<Throwable>> eVar2) {
        this.f4189a = cls;
        this.f4190b = list;
        this.f4191c = eVar;
        this.f4192d = eVar2;
        this.f4193e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C1141v<ResourceType> m5918b(C1012e<DataType> eVar, int i, int i2, C1002i iVar) throws C1134q {
        List<Throwable> b = this.f4192d.mo5909b();
        C1401j.m6972d(b);
        List list = b;
        try {
            return m5919c(eVar, i, i2, iVar, list);
        } finally {
            this.f4192d.mo5908a(list);
        }
    }

    /* renamed from: c */
    private C1141v<ResourceType> m5919c(C1012e<DataType> eVar, int i, int i2, C1002i iVar, List<Throwable> list) throws C1134q {
        int size = this.f4190b.size();
        C1141v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1004k kVar = (C1004k) this.f4190b.get(i3);
            try {
                if (kVar.mo5159b(eVar.mo5180a(), iVar)) {
                    vVar = kVar.mo5158a(eVar.mo5180a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1134q(this.f4193e, (List<Throwable>) new ArrayList(list));
    }

    /* renamed from: a */
    public C1141v<Transcode> mo5376a(C1012e<DataType> eVar, int i, int i2, C1002i iVar, C1111a<ResourceType> aVar) throws C1134q {
        return this.f4191c.mo5671a(aVar.mo5366a(m5918b(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f4189a + ", decoders=" + this.f4190b + ", transcoder=" + this.f4191c + '}';
    }
}
