package com.bumptech.glide.load.p012p;

import android.util.Log;
import com.bumptech.glide.load.C0995d;
import com.bumptech.glide.load.C1002i;
import com.bumptech.glide.p029s.C1388a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.c */
public class C1158c implements C0995d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo5144a(ByteBuffer byteBuffer, File file, C1002i iVar) {
        try {
            C1388a.m6942e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
