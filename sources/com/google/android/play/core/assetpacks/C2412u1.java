package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.common.C2435b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p148g.p189d.p190a.p271e.p272a.p276c.C5099e0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;
import p148g.p189d.p190a.p271e.p272a.p276c.C5107i0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5124r;
import p148g.p189d.p190a.p271e.p272a.p280g.C5152e;
import p148g.p189d.p190a.p271e.p272a.p280g.C5154g;
import p148g.p189d.p190a.p271e.p272a.p280g.C5163p;

/* renamed from: com.google.android.play.core.assetpacks.u1 */
final class C2412u1 implements C2371k3 {

    /* renamed from: g */
    private static final C5100f f7973g = new C5100f("FakeAssetPackService");

    /* renamed from: a */
    private final String f7974a;

    /* renamed from: b */
    private final C2418w f7975b;

    /* renamed from: c */
    private final Context f7976c;

    /* renamed from: d */
    private final C2350g2 f7977d;

    /* renamed from: e */
    private final C5099e0<Executor> f7978e;

    /* renamed from: f */
    private final Handler f7979f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    C2412u1(File file, C2418w wVar, C2427y0 y0Var, Context context, C2350g2 g2Var, C5099e0<Executor> e0Var) {
        this.f7974a = file.getAbsolutePath();
        this.f7975b = wVar;
        this.f7976c = context;
        this.f7977d = g2Var;
        this.f7978e = e0Var;
    }

    /* renamed from: b */
    static long m11036b(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: c */
    private static String m11037c(File file) throws C2435b {
        try {
            return C2420w1.m11061b(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new C2435b("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new C2435b(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: e */
    private final void m11038e(int i, String str, int i2) throws C2435b {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f7977d.mo9151a());
        bundle.putInt("session_id", i);
        File[] h = m11039h(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : h) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a = C5124r.m21531a(file);
            bundle.putParcelableArrayList(C5107i0.m21493b("chunk_intents", str, a), arrayList2);
            bundle.putString(C5107i0.m21493b("uncompressed_hash_sha256", str, a), m11037c(file));
            bundle.putLong(C5107i0.m21493b("uncompressed_size", str, a), file.length());
            arrayList.add(a);
        }
        bundle.putStringArrayList(C5107i0.m21492a("slice_ids", str), arrayList);
        bundle.putLong(C5107i0.m21492a("pack_version", str), (long) this.f7977d.mo9151a());
        bundle.putInt(C5107i0.m21492a("status", str), i2);
        bundle.putInt(C5107i0.m21492a("error_code", str), 0);
        bundle.putLong(C5107i0.m21492a("bytes_downloaded", str), m11036b(i2, j));
        bundle.putLong(C5107i0.m21492a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m11036b(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f7979f.post(new C2408t1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    /* renamed from: h */
    private final File[] m11039h(String str) throws C2435b {
        File file = new File(this.f7974a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C2404s1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a : listFiles) {
                        if (C5124r.m21531a(a).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new C2435b(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new C2435b(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new C2435b(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new C2435b(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: a */
    public final void mo9161a(int i, String str) {
        f7973g.mo15206f("notifyModuleCompleted", new Object[0]);
        this.f7978e.mo15202d().execute(new C2400r1(this, i, str));
    }

    /* renamed from: d */
    public final void mo9162d() {
        f7973g.mo15206f("keepAlive", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo9248f(Intent intent) {
        this.f7975b.mo9252a(this.f7976c, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo9249g(int i, String str) {
        try {
            m11038e(i, str, 4);
        } catch (C2435b e) {
            f7973g.mo15207g("notifyModuleCompleted failed", e);
        }
    }

    /* renamed from: l */
    public final void mo9163l(List<String> list) {
        f7973g.mo15206f("cancelDownload(%s)", list);
    }

    /* renamed from: u */
    public final void mo9164u(int i) {
        f7973g.mo15206f("notifySessionFailed", new Object[0]);
    }

    /* renamed from: v */
    public final C5152e<List<String>> mo9165v(Map<String, Long> map) {
        f7973g.mo15206f("syncPacks()", new Object[0]);
        return C5154g.m21613b(new ArrayList());
    }

    /* renamed from: w */
    public final C5152e<ParcelFileDescriptor> mo9166w(int i, String str, String str2, int i2) {
        f7973g.mo15206f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C5163p pVar = new C5163p();
        try {
            for (File file : m11039h(str)) {
                if (C5124r.m21531a(file).equals(str2)) {
                    pVar.mo15263c(ParcelFileDescriptor.open(file, 268435456));
                    return pVar.mo15261a();
                }
            }
            throw new C2435b(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f7973g.mo15207g("getChunkFileDescriptor failed", e);
            pVar.mo15262b(new C2435b("Asset Slice file not found.", e));
        } catch (C2435b e2) {
            f7973g.mo15207g("getChunkFileDescriptor failed", e2);
            pVar.mo15262b(e2);
        }
    }

    /* renamed from: x */
    public final void mo9167x(int i, String str, String str2, int i2) {
        f7973g.mo15206f("notifyChunkTransferred", new Object[0]);
    }
}
