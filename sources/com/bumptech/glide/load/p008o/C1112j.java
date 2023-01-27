package com.bumptech.glide.load.p008o;

import com.bumptech.glide.load.C0992a;
import com.bumptech.glide.load.C0994c;

/* renamed from: com.bumptech.glide.load.o.j */
public abstract class C1112j {

    /* renamed from: a */
    public static final C1112j f4194a = new C1113a();

    /* renamed from: b */
    public static final C1112j f4195b = new C1114b();

    /* renamed from: c */
    public static final C1112j f4196c = new C1115c();

    /* renamed from: com.bumptech.glide.load.o.j$a */
    class C1113a extends C1112j {
        C1113a() {
        }

        /* renamed from: a */
        public boolean mo5378a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5379b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo5380c(C0992a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo5381d(boolean z, C0992a aVar, C0994c cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$b */
    class C1114b extends C1112j {
        C1114b() {
        }

        /* renamed from: a */
        public boolean mo5378a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo5379b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo5380c(C0992a aVar) {
            return (aVar == C0992a.DATA_DISK_CACHE || aVar == C0992a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo5381d(boolean z, C0992a aVar, C0994c cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$c */
    class C1115c extends C1112j {
        C1115c() {
        }

        /* renamed from: a */
        public boolean mo5378a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo5379b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo5380c(C0992a aVar) {
            return aVar == C0992a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo5381d(boolean z, C0992a aVar, C0994c cVar) {
            return ((z && aVar == C0992a.DATA_DISK_CACHE) || aVar == C0992a.LOCAL) && cVar == C0994c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo5378a();

    /* renamed from: b */
    public abstract boolean mo5379b();

    /* renamed from: c */
    public abstract boolean mo5380c(C0992a aVar);

    /* renamed from: d */
    public abstract boolean mo5381d(boolean z, C0992a aVar, C0994c cVar);
}
