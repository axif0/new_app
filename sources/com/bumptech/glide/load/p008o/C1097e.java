package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0995d;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.p008o.p010b0.C1066a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.e */
class C1097e<DataType> implements C1066a.C1068b {

    /* renamed from: a */
    private final C0995d<DataType> f4115a;

    /* renamed from: b */
    private final DataType f4116b;

    /* renamed from: c */
    private final C1002i f4117c;

    C1097e(C0995d<DataType> dVar, DataType datatype, C1002i iVar) {
        this.f4115a = dVar;
        this.f4116b = datatype;
        this.f4117c = iVar;
    }

    /* renamed from: a */
    public boolean mo5281a(File file) {
        return this.f4115a.mo5144a(this.f4116b, file, this.f4117c);
    }
}
