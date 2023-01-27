package p340io.realm.internal.async;

import p340io.realm.internal.Keep;

@Keep
/* renamed from: io.realm.internal.async.BadVersionException */
public class BadVersionException extends Exception {
    public BadVersionException(String str) {
        super(str);
    }

    public BadVersionException(String str, Throwable th) {
        super(str, th);
    }
}
