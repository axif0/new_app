package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {

    /* renamed from: f */
    private int f18019f;

    /* renamed from: g */
    private String f18020g;

    public HttpStatusException(String str, int i, String str2) {
        super(str);
        this.f18019f = i;
        this.f18020g = str2;
    }

    public int getStatusCode() {
        return this.f18019f;
    }

    public String getUrl() {
        return this.f18020g;
    }

    public String toString() {
        return super.toString() + ". Status=" + this.f18019f + ", URL=" + this.f18020g;
    }
}
