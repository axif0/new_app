package p340io.realm.exceptions;

import p340io.realm.C5672i0;
import p340io.realm.C5804v0;
import p340io.realm.exceptions.RealmFileException;
import p340io.realm.internal.Keep;

@Keep
/* renamed from: io.realm.exceptions.IncompatibleSyncedFileException */
public class IncompatibleSyncedFileException extends RealmFileException {
    private final String path;

    public IncompatibleSyncedFileException(String str, String str2) {
        super(RealmFileException.Kind.INCOMPATIBLE_SYNC_FILE, str);
        this.path = str2;
    }

    public C5672i0 getBackupRealmConfiguration() {
        return C5804v0.m24242x(this.path, (byte[]) null, new Object[0]);
    }

    public C5672i0 getBackupRealmConfiguration(byte[] bArr) {
        return C5804v0.m24242x(this.path, bArr, new Object[0]);
    }

    public C5672i0 getBackupRealmConfiguration(byte[] bArr, Object... objArr) {
        return C5804v0.m24242x(this.path, bArr, objArr);
    }

    public String getRecoveryPath() {
        return this.path;
    }
}
