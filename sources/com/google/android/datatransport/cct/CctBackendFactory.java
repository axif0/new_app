package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C1490d;
import com.google.android.datatransport.runtime.backends.C1496h;
import com.google.android.datatransport.runtime.backends.C1502m;

@Keep
public class CctBackendFactory implements C1490d {
    public C1502m create(C1496h hVar) {
        return new C1481e(hVar.mo6131b(), hVar.mo6134e(), hVar.mo6133d());
    }
}
