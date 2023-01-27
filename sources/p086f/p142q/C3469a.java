package p086f.p142q;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.karumi.dexter.BuildConfig;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: f.q.a */
public final class C3469a {

    /* renamed from: a */
    private static final Set<File> f10879a = new HashSet();

    /* renamed from: b */
    private static final boolean f10880b = m14977m(System.getProperty("java.vm.version"));

    /* renamed from: f.q.a$a */
    private static final class C3470a {

        /* renamed from: b */
        private static final int f10881b = 4;

        /* renamed from: a */
        private final C3471a f10882a;

        /* renamed from: f.q.a$a$a */
        private interface C3471a {
            /* renamed from: a */
            Object mo11864a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: f.q.a$a$b */
        private static class C3472b implements C3471a {

            /* renamed from: a */
            private final Constructor<?> f10883a;

            C3472b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f10883a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo11864a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f10883a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: f.q.a$a$c */
        private static class C3473c implements C3471a {

            /* renamed from: a */
            private final Constructor<?> f10884a;

            C3473c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f10884a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo11864a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f10884a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: f.q.a$a$d */
        private static class C3474d implements C3471a {

            /* renamed from: a */
            private final Constructor<?> f10885a;

            C3474d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f10885a = constructor;
                constructor.setAccessible(true);
            }

            /* renamed from: a */
            public Object mo11864a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f10885a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C3470a() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                f.q.a$a$b r1 = new f.q.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                f.q.a$a$c r1 = new f.q.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                f.q.a$a$d r1 = new f.q.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f10882a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p086f.p142q.C3469a.C3470a.<init>():void");
        }

        /* renamed from: a */
        static void m14979a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C3469a.m14971g(classLoader, "pathList").get(classLoader);
            Object[] b = new C3470a().m14980b(list);
            try {
                C3469a.m14970f(obj, "dexElements", b);
            } catch (NoSuchFieldException e) {
                Log.w("MultiDex", "Failed find field 'dexElements' attempting 'pathElements'", e);
                C3469a.m14970f(obj, "pathElements", b);
            }
        }

        /* renamed from: b */
        private Object[] m14980b(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f10882a.mo11864a(file, DexFile.loadDex(file.getPath(), m14981c(file), 0));
            }
            return objArr;
        }

        /* renamed from: c */
        private static String m14981c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f10881b) + ".dex").getPath();
        }
    }

    /* renamed from: f.q.a$b */
    private static final class C3475b {
        /* renamed from: a */
        static void m14986a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C3469a.m14971g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C3469a.m14970f(obj, "dexElements", m14987b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = C3469a.m14971g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: b */
        private static Object[] m14987b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C3469a.m14972h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: f.q.a$c */
    private static final class C3476c {
        /* renamed from: a */
        static void m14988a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C3469a.m14971g(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            a.set(classLoader, sb.toString());
            C3469a.m14970f(classLoader, "mPaths", strArr);
            C3469a.m14970f(classLoader, "mFiles", fileArr);
            C3469a.m14970f(classLoader, "mZips", zipFileArr);
            C3469a.m14970f(classLoader, "mDexs", dexFileArr);
        }
    }

    /* renamed from: d */
    private static void m14968d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!file2.delete()) {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                } else {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                }
            }
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        android.util.Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00a4 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m14969e(android.content.Context r5, java.io.File r6, java.io.File r7, java.lang.String r8, java.lang.String r9, boolean r10) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f10879a
            monitor-enter(r0)
            java.util.Set<java.io.File> r1 = f10879a     // Catch:{ all -> 0x00af }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x000d:
            java.util.Set<java.io.File> r1 = f10879a     // Catch:{ all -> 0x00af }
            r1.add(r6)     // Catch:{ all -> 0x00af }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r2 = 20
            if (r1 <= r2) goto L_0x0055
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r3.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "MultiDex is not guaranteed to work in SDK version "
            r3.append(r4)     // Catch:{ all -> 0x00af }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00af }
            r3.append(r4)     // Catch:{ all -> 0x00af }
            java.lang.String r4 = ": SDK version higher than "
            r3.append(r4)     // Catch:{ all -> 0x00af }
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = " should be backed by "
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "runtime with built-in multidex capabilty but it's not the "
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "case here: java.vm.version=\""
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x00af }
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00af }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x00af }
        L_0x0055:
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch:{ RuntimeException -> 0x00a5 }
            if (r1 != 0) goto L_0x0064
            java.lang.String r5 = "MultiDex"
            java.lang.String r6 = "Context class loader is null. Must be running in test mode. Skip patching."
            android.util.Log.e(r5, r6)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0064:
            m14968d(r5)     // Catch:{ all -> 0x0068 }
            goto L_0x0070
        L_0x0068:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x00af }
        L_0x0070:
            java.io.File r7 = m14974j(r5, r7, r8)     // Catch:{ all -> 0x00af }
            f.q.b r8 = new f.q.b     // Catch:{ all -> 0x00af }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x00af }
            r6 = 0
            r2 = 0
            java.util.List r2 = r8.mo11866t(r5, r9, r2)     // Catch:{ all -> 0x00a0 }
            m14976l(r1, r7, r2)     // Catch:{ IOException -> 0x0083 }
            goto L_0x0095
        L_0x0083:
            r2 = move-exception
            if (r10 == 0) goto L_0x009f
            java.lang.String r10 = "MultiDex"
            java.lang.String r3 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r10, r3, r2)     // Catch:{ all -> 0x00a0 }
            r10 = 1
            java.util.List r5 = r8.mo11866t(r5, r9, r10)     // Catch:{ all -> 0x00a0 }
            m14976l(r1, r7, r5)     // Catch:{ all -> 0x00a0 }
        L_0x0095:
            r8.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009a
        L_0x0099:
            r6 = move-exception
        L_0x009a:
            if (r6 != 0) goto L_0x009e
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x009e:
            throw r6     // Catch:{ all -> 0x00af }
        L_0x009f:
            throw r2     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r5 = move-exception
            r8.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r5     // Catch:{ all -> 0x00af }
        L_0x00a5:
            r5 = move-exception
            java.lang.String r6 = "MultiDex"
            java.lang.String r7 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r6, r7, r5)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00af:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p086f.p142q.C3469a.m14969e(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m14970f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g = m14971g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static Field m14971g(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Method m14972h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: i */
    private static ApplicationInfo m14973i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* renamed from: j */
    private static File m14974j(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m14978n(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m14978n(file2);
        }
        File file3 = new File(file2, str);
        m14978n(file3);
        return file3;
    }

    /* renamed from: k */
    public static void m14975k(Context context) {
        String str;
        Log.i("MultiDex", "Installing application");
        if (f10880b) {
            str = "VM has multidex support, MultiDex support library is disabled.";
        } else if (Build.VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo i = m14973i(context);
                if (i == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                m14969e(context, new File(i.sourceDir), new File(i.dataDir), "secondary-dexes", BuildConfig.FLAVOR, true);
                str = "install done";
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        } else {
            throw new RuntimeException("MultiDex installation failed. SDK " + Build.VERSION.SDK_INT + " is unsupported. Min SDK version is " + 4 + ".");
        }
        Log.i("MultiDex", str);
    }

    /* renamed from: l */
    private static void m14976l(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                C3475b.m14986a(classLoader, list, file);
            } else if (i >= 14) {
                C3470a.m14979a(classLoader, list);
            } else {
                C3476c.m14988a(classLoader, list);
            }
        }
    }

    /* renamed from: m */
    static boolean m14977m(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z;
    }

    /* renamed from: n */
    private static void m14978n(File file) throws IOException {
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            Log.e("MultiDex", str);
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
