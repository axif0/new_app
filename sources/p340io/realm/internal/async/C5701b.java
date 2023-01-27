package p340io.realm.internal.async;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: io.realm.internal.async.b */
public class C5701b extends ThreadPoolExecutor {

    /* renamed from: d */
    private static final int f16488d = m23802a();

    /* renamed from: a */
    private boolean f16489a;

    /* renamed from: b */
    private ReentrantLock f16490b;

    /* renamed from: c */
    private Condition f16491c;

    /* renamed from: io.realm.internal.async.b$a */
    class C5702a implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f16492a;

        C5702a(Pattern pattern) {
            this.f16492a = pattern;
        }

        public boolean accept(File file) {
            return this.f16492a.matcher(file.getName()).matches();
        }
    }

    private C5701b(int i, int i2) {
        super(i, i2, 0, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f16490b = reentrantLock;
        this.f16491c = reentrantLock.newCondition();
    }

    @SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
    /* renamed from: a */
    private static int m23802a() {
        int b = m23803b("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (b <= 0) {
            b = Runtime.getRuntime().availableProcessors();
        }
        if (b <= 0) {
            return 1;
        }
        return 1 + (b * 2);
    }

    /* renamed from: b */
    private static int m23803b(String str, String str2) {
        try {
            File[] listFiles = new File(str).listFiles(new C5702a(Pattern.compile(str2)));
            if (listFiles == null) {
                return 0;
            }
            return listFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static C5701b m23804c() {
        int i = f16488d;
        return new C5701b(i, i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r0.f16490b.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1.interrupt();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeExecute(java.lang.Thread r1, java.lang.Runnable r2) {
        /*
            r0 = this;
            super.beforeExecute(r1, r2)
            java.util.concurrent.locks.ReentrantLock r2 = r0.f16490b
            r2.lock()
        L_0x0008:
            boolean r2 = r0.f16489a     // Catch:{ InterruptedException -> 0x001a }
            if (r2 == 0) goto L_0x0012
            java.util.concurrent.locks.Condition r2 = r0.f16491c     // Catch:{ InterruptedException -> 0x001a }
            r2.await()     // Catch:{ InterruptedException -> 0x001a }
            goto L_0x0008
        L_0x0012:
            java.util.concurrent.locks.ReentrantLock r1 = r0.f16490b
            r1.unlock()
            goto L_0x001e
        L_0x0018:
            r1 = move-exception
            goto L_0x001f
        L_0x001a:
            r1.interrupt()     // Catch:{ all -> 0x0018 }
            goto L_0x0012
        L_0x001e:
            return
        L_0x001f:
            java.util.concurrent.locks.ReentrantLock r2 = r0.f16490b
            r2.unlock()
            goto L_0x0026
        L_0x0025:
            throw r1
        L_0x0026:
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: p340io.realm.internal.async.C5701b.beforeExecute(java.lang.Thread, java.lang.Runnable):void");
    }
}
