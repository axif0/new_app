package com.bumptech.glide.load.p014q.p019h;

import android.util.Log;
import com.bumptech.glide.load.C0994c;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.load.C1005l;
import com.bumptech.glide.load.p008o.C1141v;
import com.bumptech.glide.p029s.C1388a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.q.h.d */
public class C1299d implements C1005l<C1297c> {
    /* renamed from: b */
    public C0994c mo5160b(C1002i iVar) {
        return C0994c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo5144a(C1141v<C1297c> vVar, File file, C1002i iVar) {
        try {
            C1388a.m6942e(vVar.get().mo5625c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
