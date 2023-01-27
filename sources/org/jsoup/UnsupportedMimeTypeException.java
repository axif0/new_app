package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: f */
    private String f18021f;

    /* renamed from: g */
    private String f18022g;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.f18021f = str2;
        this.f18022g = str3;
    }

    public String getMimeType() {
        return this.f18021f;
    }

    public String getUrl() {
        return this.f18022g;
    }

    public String toString() {
        return super.toString() + ". Mimetype=" + this.f18021f + ", URL=" + this.f18022g;
    }
}
