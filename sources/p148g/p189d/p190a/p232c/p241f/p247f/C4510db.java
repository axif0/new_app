package p148g.p189d.p190a.p232c.p241f.p247f;

/* renamed from: g.d.a.c.f.f.db */
public final class C4510db implements C4529eb {

    /* renamed from: A */
    private static final C4558g2<Long> f14032A;

    /* renamed from: B */
    private static final C4558g2<Long> f14033B;

    /* renamed from: C */
    private static final C4558g2<Long> f14034C;

    /* renamed from: D */
    private static final C4558g2<Long> f14035D;

    /* renamed from: E */
    private static final C4558g2<Long> f14036E;

    /* renamed from: F */
    private static final C4558g2<String> f14037F;

    /* renamed from: G */
    private static final C4558g2<Long> f14038G;

    /* renamed from: a */
    private static final C4558g2<Long> f14039a;

    /* renamed from: b */
    private static final C4558g2<Long> f14040b;

    /* renamed from: c */
    private static final C4558g2<String> f14041c;

    /* renamed from: d */
    private static final C4558g2<String> f14042d;

    /* renamed from: e */
    private static final C4558g2<Long> f14043e;

    /* renamed from: f */
    private static final C4558g2<Long> f14044f;

    /* renamed from: g */
    private static final C4558g2<Long> f14045g;

    /* renamed from: h */
    private static final C4558g2<Long> f14046h;

    /* renamed from: i */
    private static final C4558g2<Long> f14047i;

    /* renamed from: j */
    private static final C4558g2<Long> f14048j;

    /* renamed from: k */
    private static final C4558g2<Long> f14049k;

    /* renamed from: l */
    private static final C4558g2<Long> f14050l;

    /* renamed from: m */
    private static final C4558g2<Long> f14051m;

    /* renamed from: n */
    private static final C4558g2<Long> f14052n;

    /* renamed from: o */
    private static final C4558g2<Long> f14053o;

    /* renamed from: p */
    private static final C4558g2<Long> f14054p;

    /* renamed from: q */
    private static final C4558g2<Long> f14055q;

    /* renamed from: r */
    private static final C4558g2<Long> f14056r;

    /* renamed from: s */
    private static final C4558g2<Long> f14057s;

    /* renamed from: t */
    private static final C4558g2<Long> f14058t;

    /* renamed from: u */
    private static final C4558g2<Long> f14059u;

    /* renamed from: v */
    private static final C4558g2<Long> f14060v;

    /* renamed from: w */
    private static final C4558g2<Long> f14061w;

    /* renamed from: x */
    private static final C4558g2<Long> f14062x;

    /* renamed from: y */
    private static final C4558g2<Long> f14063y;

    /* renamed from: z */
    private static final C4558g2<Long> f14064z;

    static {
        C4721p2 p2Var = new C4721p2(C4576h2.m19579a("com.google.android.gms.measurement"));
        f14039a = p2Var.mo14509b("measurement.ad_id_cache_time", 10000);
        f14040b = p2Var.mo14509b("measurement.config.cache_time", 86400000);
        p2Var.mo14510c("measurement.log_tag", "FA");
        f14041c = p2Var.mo14510c("measurement.config.url_authority", "app-measurement.com");
        f14042d = p2Var.mo14510c("measurement.config.url_scheme", "https");
        f14043e = p2Var.mo14509b("measurement.upload.debug_upload_interval", 1000);
        f14044f = p2Var.mo14509b("measurement.lifetimevalue.max_currency_tracked", 4);
        f14045g = p2Var.mo14509b("measurement.store.max_stored_events_per_app", 100000);
        f14046h = p2Var.mo14509b("measurement.experiment.max_ids", 50);
        f14047i = p2Var.mo14509b("measurement.audience.filter_result_max_count", 200);
        f14048j = p2Var.mo14509b("measurement.alarm_manager.minimum_interval", 60000);
        f14049k = p2Var.mo14509b("measurement.upload.minimum_delay", 500);
        f14050l = p2Var.mo14509b("measurement.monitoring.sample_period_millis", 86400000);
        f14051m = p2Var.mo14509b("measurement.upload.realtime_upload_interval", 10000);
        f14052n = p2Var.mo14509b("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        p2Var.mo14509b("measurement.config.cache_time.service", 3600000);
        f14053o = p2Var.mo14509b("measurement.service_client.idle_disconnect_millis", 5000);
        p2Var.mo14510c("measurement.log_tag.service", "FA-SVC");
        f14054p = p2Var.mo14509b("measurement.upload.stale_data_deletion_interval", 86400000);
        f14055q = p2Var.mo14509b("measurement.upload.backoff_period", 43200000);
        f14056r = p2Var.mo14509b("measurement.upload.initial_upload_delay_time", 15000);
        f14057s = p2Var.mo14509b("measurement.upload.interval", 3600000);
        f14058t = p2Var.mo14509b("measurement.upload.max_bundle_size", 65536);
        f14059u = p2Var.mo14509b("measurement.upload.max_bundles", 100);
        f14060v = p2Var.mo14509b("measurement.upload.max_conversions_per_day", 500);
        f14061w = p2Var.mo14509b("measurement.upload.max_error_events_per_day", 1000);
        f14062x = p2Var.mo14509b("measurement.upload.max_events_per_bundle", 1000);
        f14063y = p2Var.mo14509b("measurement.upload.max_events_per_day", 100000);
        f14064z = p2Var.mo14509b("measurement.upload.max_public_events_per_day", 50000);
        f14032A = p2Var.mo14509b("measurement.upload.max_queue_time", 2419200000L);
        f14033B = p2Var.mo14509b("measurement.upload.max_realtime_events_per_day", 10);
        f14034C = p2Var.mo14509b("measurement.upload.max_batch_size", 65536);
        f14035D = p2Var.mo14509b("measurement.upload.retry_count", 6);
        f14036E = p2Var.mo14509b("measurement.upload.retry_time", 1800000);
        f14037F = p2Var.mo14510c("measurement.upload.url", "https://app-measurement.com/a");
        f14038G = p2Var.mo14509b("measurement.upload.window_interval", 3600000);
    }

    /* renamed from: A */
    public final long mo14047A() {
        return f14061w.mo14175o().longValue();
    }

    /* renamed from: B */
    public final long mo14048B() {
        return f14036E.mo14175o().longValue();
    }

    /* renamed from: C */
    public final long mo14049C() {
        return f14057s.mo14175o().longValue();
    }

    /* renamed from: D */
    public final long mo14050D() {
        return f14053o.mo14175o().longValue();
    }

    /* renamed from: E */
    public final long mo14051E() {
        return f14049k.mo14175o().longValue();
    }

    /* renamed from: F */
    public final long mo14052F() {
        return f14033B.mo14175o().longValue();
    }

    /* renamed from: G */
    public final String mo14053G() {
        return f14037F.mo14175o();
    }

    /* renamed from: a */
    public final long mo14054a() {
        return f14039a.mo14175o().longValue();
    }

    /* renamed from: b */
    public final long mo14055b() {
        return f14040b.mo14175o().longValue();
    }

    /* renamed from: c */
    public final String mo14056c() {
        return f14041c.mo14175o();
    }

    /* renamed from: d */
    public final String mo14057d() {
        return f14042d.mo14175o();
    }

    /* renamed from: e */
    public final long mo14058e() {
        return f14054p.mo14175o().longValue();
    }

    /* renamed from: f */
    public final long mo14059f() {
        return f14043e.mo14175o().longValue();
    }

    /* renamed from: g */
    public final long mo14060g() {
        return f14050l.mo14175o().longValue();
    }

    /* renamed from: h */
    public final long mo14061h() {
        return f14063y.mo14175o().longValue();
    }

    /* renamed from: i */
    public final long mo14062i() {
        return f14055q.mo14175o().longValue();
    }

    /* renamed from: j */
    public final long mo14063j() {
        return f14051m.mo14175o().longValue();
    }

    /* renamed from: k */
    public final long mo14064k() {
        return f14044f.mo14175o().longValue();
    }

    /* renamed from: l */
    public final long mo14065l() {
        return f14045g.mo14175o().longValue();
    }

    /* renamed from: m */
    public final long mo14066m() {
        return f14062x.mo14175o().longValue();
    }

    /* renamed from: n */
    public final long mo14067n() {
        return f14058t.mo14175o().longValue();
    }

    /* renamed from: o */
    public final long mo14068o() {
        return f14034C.mo14175o().longValue();
    }

    /* renamed from: p */
    public final long mo14069p() {
        return f14046h.mo14175o().longValue();
    }

    /* renamed from: q */
    public final long mo14070q() {
        return f14038G.mo14175o().longValue();
    }

    /* renamed from: r */
    public final long mo14071r() {
        return f14059u.mo14175o().longValue();
    }

    /* renamed from: s */
    public final long mo14072s() {
        return f14064z.mo14175o().longValue();
    }

    /* renamed from: t */
    public final long mo14073t() {
        return f14060v.mo14175o().longValue();
    }

    /* renamed from: u */
    public final long mo14074u() {
        return f14047i.mo14175o().longValue();
    }

    /* renamed from: v */
    public final long mo14075v() {
        return f14035D.mo14175o().longValue();
    }

    /* renamed from: w */
    public final long mo14076w() {
        return f14056r.mo14175o().longValue();
    }

    /* renamed from: x */
    public final long mo14077x() {
        return f14052n.mo14175o().longValue();
    }

    /* renamed from: y */
    public final long mo14078y() {
        return f14048j.mo14175o().longValue();
    }

    /* renamed from: z */
    public final long mo14079z() {
        return f14032A.mo14175o().longValue();
    }
}
