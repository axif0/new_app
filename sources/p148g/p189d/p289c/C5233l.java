package p148g.p189d.p289c;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import p148g.p189d.p289c.p291y.C5289l;

/* renamed from: g.d.c.l */
public abstract class C5233l {
    /* renamed from: c */
    public C5230i mo15375c() {
        if (mo15378h()) {
            return (C5230i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: d */
    public C5236o mo15376d() {
        if (mo15380j()) {
            return (C5236o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: f */
    public C5238q mo15377f() {
        if (mo15381m()) {
            return (C5238q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public boolean mo15378h() {
        return this instanceof C5230i;
    }

    /* renamed from: i */
    public boolean mo15379i() {
        return this instanceof C5235n;
    }

    /* renamed from: j */
    public boolean mo15380j() {
        return this instanceof C5236o;
    }

    /* renamed from: m */
    public boolean mo15381m() {
        return this instanceof C5238q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            C5289l.m21945b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
