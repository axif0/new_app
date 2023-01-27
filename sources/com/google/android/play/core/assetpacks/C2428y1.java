package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.y1 */
final class C2428y1 {

    /* renamed from: a */
    private byte[] f8051a = new byte[4096];

    /* renamed from: b */
    private int f8052b;

    /* renamed from: c */
    private long f8053c;

    /* renamed from: d */
    private long f8054d;

    /* renamed from: e */
    private int f8055e;

    /* renamed from: f */
    private int f8056f;

    /* renamed from: g */
    private int f8057g;

    /* renamed from: h */
    private boolean f8058h;

    /* renamed from: i */
    private String f8059i;

    public C2428y1() {
        mo9271e();
    }

    /* renamed from: a */
    private final int m11079a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f8052b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f8051a, this.f8052b, min);
        int i5 = this.f8052b + min;
        this.f8052b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: b */
    public final int mo9268b(byte[] bArr, int i, int i2) {
        int a = m11079a(30, bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        if (this.f8053c == -1) {
            long e = C2420w1.m11064e(this.f8051a, 0);
            this.f8053c = e;
            if (e == 67324752) {
                this.f8058h = false;
                this.f8054d = C2420w1.m11064e(this.f8051a, 18);
                this.f8057g = C2420w1.m11066g(this.f8051a, 8);
                this.f8055e = C2420w1.m11066g(this.f8051a, 26);
                int g = this.f8055e + 30 + C2420w1.m11066g(this.f8051a, 28);
                this.f8056f = g;
                int length = this.f8051a.length;
                if (length < g) {
                    do {
                        length += length;
                    } while (length < g);
                    this.f8051a = Arrays.copyOf(this.f8051a, length);
                }
            } else {
                this.f8058h = true;
            }
        }
        int a2 = m11079a(this.f8056f, bArr, i + a, i2 - a);
        if (a2 == -1) {
            return -1;
        }
        int i3 = a + a2;
        if (!this.f8058h && this.f8059i == null) {
            this.f8059i = new String(this.f8051a, 30, this.f8055e);
        }
        return i3;
    }

    /* renamed from: c */
    public final C2405s2 mo9269c() {
        int i = this.f8052b;
        int i2 = this.f8056f;
        if (i < i2) {
            return C2405s2.m11026a(this.f8059i, this.f8054d, this.f8057g, true, Arrays.copyOf(this.f8051a, i), this.f8058h);
        }
        C2405s2 a = C2405s2.m11026a(this.f8059i, this.f8054d, this.f8057g, false, Arrays.copyOf(this.f8051a, i2), this.f8058h);
        mo9271e();
        return a;
    }

    /* renamed from: d */
    public final int mo9270d() {
        return this.f8056f;
    }

    /* renamed from: e */
    public final void mo9271e() {
        this.f8052b = 0;
        this.f8055e = -1;
        this.f8053c = -1;
        this.f8058h = false;
        this.f8056f = 30;
        this.f8054d = -1;
        this.f8057g = -1;
        this.f8059i = null;
    }
}
