package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p148g.p189d.p190a.p271e.p272a.p276c.C5097d0;

/* renamed from: com.google.android.play.core.assetpacks.o2 */
final class C2389o2 {

    /* renamed from: a */
    private static final Pattern f7880a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    static List<File> m10983a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C2385n2.f7876a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C2411u0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C2405s2 h = new C2373l0(fileInputStream).mo9168h();
                    if (h.mo9235d() != null) {
                        File file5 = new File(file, h.mo9235d());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new C2411u0(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new C2411u0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    C5097d0.m21473a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
