package p148g.p189d.p190a.p232c.p241f.p247f;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.d.a.c.f.f.f2 */
public final class C4538f2 {
    /* renamed from: a */
    private static C4464b2 m19395a(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        String valueOf = String.valueOf(readLine);
                        Log.e("HermeticFileOverrides", valueOf.length() != 0 ? "Invalid: ".concat(valueOf) : new String("Invalid: "));
                    } else {
                        String str = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new HashMap());
                        }
                        ((Map) hashMap.get(str)).put(decode, decode2);
                    }
                } else {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf2);
                    Log.i("HermeticFileOverrides", sb.toString());
                    C4464b2 b2Var = new C4464b2(hashMap);
                    bufferedReader.close();
                    return b2Var;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C4467b5.m18801b(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static C4465b3<C4464b2> m19396b(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
            z = true;
        }
        if (!z) {
            return C4465b3.m18791d();
        }
        if (C4720p1.m20074a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        C4465b3<File> c = m19397c(context);
        return c.mo13836b() ? C4465b3.m18790a(m19395a(c.mo13837c())) : C4465b3.m18791d();
    }

    /* renamed from: c */
    private static C4465b3<File> m19397c(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? C4465b3.m18790a(file) : C4465b3.m18791d();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return C4465b3.m18791d();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
