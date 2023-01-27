package p351k.p365x;

import java.util.NoSuchElementException;
import p351k.p353r.C5882v;

/* renamed from: k.x.b */
public final class C5970b extends C5882v {

    /* renamed from: f */
    private final int f16935f;

    /* renamed from: g */
    private boolean f16936g;

    /* renamed from: h */
    private int f16937h;

    /* renamed from: i */
    private final int f16938i;

    public C5970b(int i, int i2, int i3) {
        this.f16938i = i3;
        this.f16935f = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f16936g = z;
        this.f16937h = !z ? this.f16935f : i;
    }

    /* renamed from: c */
    public int mo16953c() {
        int i = this.f16937h;
        if (i != this.f16935f) {
            this.f16937h = this.f16938i + i;
        } else if (this.f16936g) {
            this.f16936g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f16936g;
    }
}
