package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p148g.p189d.p190a.p271e.p272a.p276c.C5097d0;
import p148g.p189d.p190a.p271e.p272a.p276c.C5100f;

/* renamed from: com.google.android.play.core.assetpacks.c0 */
final class C2328c0 {

    /* renamed from: c */
    private static final C5100f f7723c = new C5100f("AssetPackStorage");

    /* renamed from: a */
    private final Context f7724a;

    /* renamed from: b */
    private final C2350g2 f7725b;

    static {
        TimeUnit.DAYS.toMillis(14);
        TimeUnit.DAYS.toMillis(28);
    }

    C2328c0(Context context, C2350g2 g2Var) {
        this.f7724a = context;
        this.f7725b = g2Var;
    }

    /* renamed from: B */
    private final File m10819B(String str) {
        return new File(m10824G(), str);
    }

    /* renamed from: C */
    private final File m10820C(String str, int i, long j) {
        return new File(mo9123m(str, i, j), "merge.tmp");
    }

    /* renamed from: D */
    private final List<File> m10821D() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m10824G().exists()) {
                if (m10824G().listFiles() != null) {
                    for (File file : m10824G().listFiles()) {
                        if (!file.getCanonicalPath().equals(m10822E().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f7723c.mo15205e("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: E */
    private final File m10822E() {
        return new File(m10824G(), "_tmp");
    }

    /* renamed from: F */
    private final File m10823F(String str, int i, long j) {
        return new File(new File(new File(m10822E(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: G */
    private final File m10824G() {
        return new File(this.f7724a.getFilesDir(), "assetpacks");
    }

    /* renamed from: a */
    private final File m10825a(String str, int i) {
        return new File(m10819B(str), String.valueOf(i));
    }

    /* renamed from: e */
    private static void m10826e(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long h = m10827h(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(h)) && !file2.getName().equals("stale.tmp")) {
                    m10828q(file2);
                }
            }
        }
    }

    /* renamed from: h */
    private static long m10827h(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f7723c.mo15204d(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: q */
    private static boolean m10828q(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File q : listFiles) {
                z &= m10828q(q);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo9113A(String str, int i, long j) {
        if (m10823F(str, i, j).exists()) {
            m10828q(m10823F(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo9114b(String str, int i, long j) {
        return new File(m10825a(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo9115c(String str, int i, long j, String str2) {
        return new File(new File(new File(m10823F(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, C2322b> mo9116d() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : m10821D()) {
                C2322b i = mo9119i(next.getName());
                if (i != null) {
                    hashMap.put(next.getName(), i);
                }
            }
        } catch (IOException e) {
            f7723c.mo15205e("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9117f(String str, int i, long j, int i2) throws IOException {
        File C = m10820C(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        C.getParentFile().mkdirs();
        C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo9118g(List<String> list) {
        int a = this.f7725b.mo9151a();
        for (File next : m10821D()) {
            if (!list.contains(next.getName()) && m10827h(next) != ((long) a)) {
                m10828q(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C2322b mo9119i(String str) throws IOException {
        String o = mo9125o(str);
        if (o == null) {
            return null;
        }
        File file = new File(o, "assets");
        if (file.isDirectory()) {
            return C2322b.m10801a(o, file.getCanonicalPath());
        }
        f7723c.mo15205e("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final File mo9120j(String str, int i, long j) {
        return new File(mo9114b(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final File mo9121k(String str, int i, long j, String str2) {
        return new File(new File(new File(m10823F(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Map<String, Long> mo9122l() {
        HashMap hashMap = new HashMap();
        for (String next : mo9116d().keySet()) {
            hashMap.put(next, Long.valueOf(mo9133x(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final File mo9123m(String str, int i, long j) {
        return new File(m10823F(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final File mo9124n(String str, int i, long j, String str2) {
        return new File(mo9134y(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo9125o(String str) throws IOException {
        int length;
        File file = new File(m10824G(), str);
        if (!file.exists()) {
            f7723c.mo15203c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f7725b.mo9151a()));
        if (!file2.exists()) {
            f7723c.mo15203c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f7725b.mo9151a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f7723c.mo15203c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f7725b.mo9151a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f7723c.mo15205e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f7725b.mo9151a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo9126p() {
        for (File next : m10821D()) {
            if (next.listFiles() != null) {
                m10826e(next);
                long h = m10827h(next);
                if (((long) this.f7725b.mo9151a()) != h) {
                    try {
                        new File(new File(next, String.valueOf(h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f7723c.mo15205e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File e : next.listFiles()) {
                    m10826e(e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo9127r(String str, int i, long j) throws IOException {
        File C = m10820C(str, i, j);
        if (!C.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(C);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C2411u0("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C2411u0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            C5097d0.m21473a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final File mo9128s(String str, int i, long j, String str2) {
        return new File(mo9134y(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo9129t(String str) {
        if (!m10819B(str).exists()) {
            return true;
        }
        return m10828q(m10819B(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final int mo9130u(String str) {
        return (int) m10827h(m10819B(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final File mo9131v(String str, int i, long j) {
        return new File(new File(m10823F(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final File mo9132w(String str, int i, long j, String str2) {
        return new File(mo9134y(str, i, j, str2), "slice.zip");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo9133x(String str) {
        return m10827h(m10825a(str, mo9130u(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final File mo9134y(String str, int i, long j, String str2) {
        return new File(mo9131v(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo9135z() {
        m10828q(m10824G());
    }
}
