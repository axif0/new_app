package com.bumptech.glide.p029s;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.s.d */
public class C1393d extends InputStream {

    /* renamed from: h */
    private static final Queue<C1393d> f4784h = C1402k.m6978e(0);

    /* renamed from: f */
    private InputStream f4785f;

    /* renamed from: g */
    private IOException f4786g;

    C1393d() {
    }

    /* renamed from: h */
    public static C1393d m6949h(InputStream inputStream) {
        C1393d poll;
        synchronized (f4784h) {
            poll = f4784h.poll();
        }
        if (poll == null) {
            poll = new C1393d();
        }
        poll.mo5879m(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException mo5875a() {
        return this.f4786g;
    }

    public int available() throws IOException {
        return this.f4785f.available();
    }

    public void close() throws IOException {
        this.f4785f.close();
    }

    /* renamed from: j */
    public void mo5878j() {
        this.f4786g = null;
        this.f4785f = null;
        synchronized (f4784h) {
            f4784h.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5879m(InputStream inputStream) {
        this.f4785f = inputStream;
    }

    public void mark(int i) {
        this.f4785f.mark(i);
    }

    public boolean markSupported() {
        return this.f4785f.markSupported();
    }

    public int read() {
        try {
            return this.f4785f.read();
        } catch (IOException e) {
            this.f4786g = e;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f4785f.read(bArr);
        } catch (IOException e) {
            this.f4786g = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f4785f.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4786g = e;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.f4785f.reset();
    }

    public long skip(long j) {
        try {
            return this.f4785f.skip(j);
        } catch (IOException e) {
            this.f4786g = e;
            return 0;
        }
    }
}
