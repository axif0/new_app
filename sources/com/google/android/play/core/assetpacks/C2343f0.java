package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p148g.p189d.p190a.p271e.p272a.p276c.C5132v;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
final class C2343f0 extends C5132v {

    /* renamed from: f */
    private final File f7752f;

    /* renamed from: g */
    private final File f7753g;

    /* renamed from: h */
    private final NavigableMap<Long, File> f7754h = new TreeMap();

    C2343f0(File file, File file2) throws IOException {
        this.f7752f = file;
        this.f7753g = file2;
        List<File> a = C2389o2.m10983a(this.f7752f, this.f7753g);
        if (!a.isEmpty()) {
            long j = 0;
            for (File next : a) {
                this.f7754h.put(Long.valueOf(j), next);
                j += next.length();
            }
            return;
        }
        throw new C2411u0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{this.f7752f, this.f7753g}));
    }

    /* renamed from: m */
    private final InputStream m10870m(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f7754h.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C2411u0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    /* renamed from: a */
    public final long mo9145a() {
        Map.Entry<Long, File> lastEntry = this.f7754h.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    public final void close() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final InputStream mo9147h(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C2411u0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo9145a()) {
            Long floorKey = this.f7754h.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f7754h.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C2338e0(m10870m(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m10870m(j, floorKey));
            Collection values = this.f7754h.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C2424x1(Collections.enumeration(values)));
            }
            arrayList.add(new C2338e0(new FileInputStream((File) this.f7754h.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C2411u0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo9145a()), Long.valueOf(j3)}));
    }
}
