package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p148g.p189d.p190a.p232c.p241f.p247f.C4576h2;
import p148g.p189d.p190a.p232c.p241f.p247f.C4752r1;

/* renamed from: com.google.android.gms.measurement.internal.u */
public final class C1957u {

    /* renamed from: A */
    public static C1925r3<Long> f6307A = m8935a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C1862m0.f6041a);

    /* renamed from: A0 */
    public static C1925r3<Boolean> f6308A0;

    /* renamed from: B */
    public static C1925r3<Long> f6309B = m8935a("measurement.upload.retry_time", 1800000L, 1800000L, C1898p0.f6125a);

    /* renamed from: B0 */
    public static C1925r3<Boolean> f6310B0;

    /* renamed from: C */
    public static C1925r3<Integer> f6311C = m8935a("measurement.upload.retry_count", 6, 6, C1886o0.f6101a);

    /* renamed from: C0 */
    public static C1925r3<Boolean> f6312C0;

    /* renamed from: D */
    public static C1925r3<Long> f6313D = m8935a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C1922r0.f6204a);

    /* renamed from: D0 */
    public static C1925r3<Boolean> f6314D0;

    /* renamed from: E */
    public static C1925r3<Integer> f6315E = m8935a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C1910q0.f6180a);

    /* renamed from: E0 */
    public static C1925r3<Boolean> f6316E0;

    /* renamed from: F */
    public static C1925r3<Integer> f6317F = m8935a("measurement.audience.filter_result_max_count", 200, 200, C1934s0.f6241a);

    /* renamed from: F0 */
    public static C1925r3<Boolean> f6318F0;

    /* renamed from: G */
    public static C1925r3<Integer> f6319G = m8935a("measurement.upload.max_public_user_properties", 25, 25, (C1901p3) null);

    /* renamed from: G0 */
    public static C1925r3<Boolean> f6320G0;

    /* renamed from: H */
    public static C1925r3<Integer> f6321H = m8935a("measurement.upload.max_event_name_cardinality", 500, 500, (C1901p3) null);

    /* renamed from: H0 */
    public static C1925r3<Boolean> f6322H0;

    /* renamed from: I */
    public static C1925r3<Integer> f6323I = m8935a("measurement.upload.max_public_event_params", 25, 25, (C1901p3) null);

    /* renamed from: I0 */
    public static C1925r3<Boolean> f6324I0;

    /* renamed from: J */
    public static C1925r3<Long> f6325J = m8935a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C1970v0.f6446a);

    /* renamed from: J0 */
    public static C1925r3<Boolean> f6326J0;

    /* renamed from: K */
    public static C1925r3<Boolean> f6327K;

    /* renamed from: K0 */
    public static C1925r3<Boolean> f6328K0;

    /* renamed from: L */
    public static C1925r3<String> f6329L = m8935a("measurement.test.string_flag", "---", "---", C1994x0.f6503a);

    /* renamed from: L0 */
    public static C1925r3<Boolean> f6330L0;

    /* renamed from: M */
    public static C1925r3<Long> f6331M = m8935a("measurement.test.long_flag", -1L, -1L, C1982w0.f6478a);

    /* renamed from: M0 */
    public static C1925r3<Long> f6332M0 = m8935a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C1793g3.f5836a);

    /* renamed from: N */
    public static C1925r3<Integer> f6333N = m8935a("measurement.test.int_flag", -2, -2, C2018z0.f6563a);

    /* renamed from: N0 */
    public static C1925r3<Boolean> f6334N0;

    /* renamed from: O */
    public static C1925r3<Double> f6335O;

    /* renamed from: O0 */
    public static C1925r3<Boolean> f6336O0;

    /* renamed from: P */
    public static C1925r3<Integer> f6337P = m8935a("measurement.experiment.max_ids", 50, 50, C1731b1.f5650a);

    /* renamed from: P0 */
    public static C1925r3<Boolean> f6338P0;

    /* renamed from: Q */
    public static C1925r3<Integer> f6339Q = m8935a("measurement.max_bundles_per_iteration", 100, 100, C1719a1.f5618a);

    /* renamed from: Q0 */
    public static C1925r3<Boolean> f6340Q0;

    /* renamed from: R */
    public static C1925r3<Boolean> f6341R;

    /* renamed from: R0 */
    public static C1925r3<Integer> f6342R0 = m8935a("measurement.service.storage_consent_support_version", 203290, 203290, C1865m3.f6044a);

    /* renamed from: S */
    public static C1925r3<Boolean> f6343S;

    /* renamed from: S0 */
    public static C1925r3<Boolean> f6344S0;

    /* renamed from: T */
    public static C1925r3<Boolean> f6345T;

    /* renamed from: T0 */
    public static C1925r3<Boolean> f6346T0;

    /* renamed from: U */
    public static C1925r3<Boolean> f6347U;

    /* renamed from: U0 */
    public static C1925r3<Boolean> f6348U0;

    /* renamed from: V */
    public static C1925r3<Boolean> f6349V;

    /* renamed from: W */
    public static C1925r3<Boolean> f6350W;

    /* renamed from: X */
    public static C1925r3<Boolean> f6351X;

    /* renamed from: Y */
    public static C1925r3<Boolean> f6352Y;

    /* renamed from: Z */
    public static C1925r3<Boolean> f6353Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<C1925r3<?>> f6354a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0 */
    public static C1925r3<Boolean> f6355a0;

    /* renamed from: b */
    public static C1925r3<Long> f6356b = m8935a("measurement.ad_id_cache_time", 10000L, 10000L, C1945t.f6264a);

    /* renamed from: b0 */
    public static C1925r3<Boolean> f6357b0;

    /* renamed from: c */
    public static C1925r3<Long> f6358c = m8935a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C1981w.f6477a);

    /* renamed from: c0 */
    public static C1925r3<Boolean> f6359c0;

    /* renamed from: d */
    public static C1925r3<Long> f6360d = m8935a("measurement.config.cache_time", 86400000L, 3600000L, C1790g0.f5833a);

    /* renamed from: d0 */
    public static C1925r3<Boolean> f6361d0;

    /* renamed from: e */
    public static C1925r3<String> f6362e = m8935a("measurement.config.url_scheme", "https", "https", C1946t0.f6265a);

    /* renamed from: e0 */
    public static C1925r3<Boolean> f6363e0;

    /* renamed from: f */
    public static C1925r3<String> f6364f = m8935a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C1755d1.f5724a);

    /* renamed from: f0 */
    public static C1925r3<Boolean> f6365f0;

    /* renamed from: g */
    public static C1925r3<Integer> f6366g = m8935a("measurement.upload.max_bundles", 100, 100, C1911q1.f6181a);

    /* renamed from: g0 */
    public static C1925r3<Boolean> f6367g0;

    /* renamed from: h */
    public static C1925r3<Integer> f6368h = m8935a("measurement.upload.max_batch_size", 65536, 65536, C2019z1.f6564a);

    /* renamed from: h0 */
    public static C1925r3<Boolean> f6369h0;

    /* renamed from: i */
    public static C1925r3<Integer> f6370i = m8935a("measurement.upload.max_bundle_size", 65536, 65536, C1876n2.f6075a);

    /* renamed from: i0 */
    public static C1925r3<Boolean> f6371i0;

    /* renamed from: j */
    public static C1925r3<Integer> f6372j = m8935a("measurement.upload.max_events_per_bundle", 1000, 1000, C1984w2.f6480a);

    /* renamed from: j0 */
    public static C1925r3<Boolean> f6373j0;

    /* renamed from: k */
    public static C1925r3<Integer> f6374k = m8935a("measurement.upload.max_events_per_day", 100000, 100000, C1841k3.f5962a);

    /* renamed from: k0 */
    public static C1925r3<Boolean> f6375k0;

    /* renamed from: l */
    public static C1925r3<Integer> f6376l = m8935a("measurement.upload.max_error_events_per_day", 1000, 1000, C1969v.f6445a);

    /* renamed from: l0 */
    public static C1925r3<Boolean> f6377l0;

    /* renamed from: m */
    public static C1925r3<Integer> f6378m = m8935a("measurement.upload.max_public_events_per_day", 50000, 50000, C2006y.f6548a);

    /* renamed from: m0 */
    public static C1925r3<Boolean> f6379m0;

    /* renamed from: n */
    public static C1925r3<Integer> f6380n = m8935a("measurement.upload.max_conversions_per_day", 10000, 10000, C1993x.f6502a);

    /* renamed from: n0 */
    public static C1925r3<Boolean> f6381n0;

    /* renamed from: o */
    public static C1925r3<Integer> f6382o = m8935a("measurement.upload.max_realtime_events_per_day", 10, 10, C1718a0.f5617a);

    /* renamed from: o0 */
    public static C1925r3<Boolean> f6383o0;

    /* renamed from: p */
    public static C1925r3<Integer> f6384p = m8935a("measurement.store.max_stored_events_per_app", 100000, 100000, C2017z.f6562a);

    /* renamed from: p0 */
    public static C1925r3<Boolean> f6385p0;

    /* renamed from: q */
    public static C1925r3<String> f6386q = m8935a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C1754d0.f5723a);

    /* renamed from: q0 */
    public static C1925r3<Boolean> f6387q0;

    /* renamed from: r */
    public static C1925r3<Long> f6388r = m8935a("measurement.upload.backoff_period", 43200000L, 43200000L, C1742c0.f5680a);

    /* renamed from: r0 */
    public static C1925r3<Boolean> f6389r0;

    /* renamed from: s */
    public static C1925r3<Long> f6390s = m8935a("measurement.upload.window_interval", 3600000L, 3600000L, C1778f0.f5780a);

    /* renamed from: s0 */
    public static C1925r3<Boolean> f6391s0;

    /* renamed from: t */
    public static C1925r3<Long> f6392t = m8935a("measurement.upload.interval", 3600000L, 3600000L, C1766e0.f5744a);

    /* renamed from: t0 */
    public static C1925r3<Boolean> f6393t0;

    /* renamed from: u */
    public static C1925r3<Long> f6394u = m8935a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C1802h0.f5857a);

    /* renamed from: u0 */
    public static C1925r3<Boolean> f6395u0;

    /* renamed from: v */
    public static C1925r3<Long> f6396v = m8935a("measurement.upload.debug_upload_interval", 1000L, 1000L, C1826j0.f5941a);

    /* renamed from: v0 */
    public static C1925r3<Boolean> f6397v0;

    /* renamed from: w */
    public static C1925r3<Long> f6398w = m8935a("measurement.upload.minimum_delay", 500L, 500L, C1814i0.f5913a);

    /* renamed from: w0 */
    public static C1925r3<Boolean> f6399w0;

    /* renamed from: x */
    public static C1925r3<Long> f6400x = m8935a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C1850l0.f5983a);

    /* renamed from: x0 */
    public static C1925r3<Boolean> f6401x0;

    /* renamed from: y */
    public static C1925r3<Long> f6402y = m8935a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C1838k0.f5959a);

    /* renamed from: y0 */
    public static C1925r3<Boolean> f6403y0;

    /* renamed from: z */
    public static C1925r3<Long> f6404z = m8935a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C1874n0.f6073a);

    /* renamed from: z0 */
    public static C1925r3<Boolean> f6405z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        f6327K = m8935a("measurement.test.boolean_flag", bool, bool, C1958u0.f6406a);
        Double valueOf = Double.valueOf(-3.0d);
        f6335O = m8935a("measurement.test.double_flag", valueOf, valueOf, C2007y0.f6549a);
        Boolean bool2 = Boolean.FALSE;
        f6341R = m8935a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, C1767e1.f5745a);
        Boolean bool3 = Boolean.TRUE;
        f6343S = m8935a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool3, bool3, C1791g1.f5834a);
        Boolean bool4 = Boolean.TRUE;
        f6345T = m8935a("measurement.collection.firebase_global_collection_flag_enabled", bool4, bool4, C1779f1.f5781a);
        Boolean bool5 = Boolean.TRUE;
        f6347U = m8935a("measurement.collection.efficient_engagement_reporting_enabled_2", bool5, bool5, C1815i1.f5914a);
        Boolean bool6 = Boolean.FALSE;
        f6349V = m8935a("measurement.collection.redundant_engagement_removal_enabled", bool6, bool6, C1803h1.f5858a);
        Boolean bool7 = Boolean.TRUE;
        f6350W = m8935a("measurement.client.freeride_engagement_fix", bool7, bool7, C1839k1.f5960a);
        Boolean bool8 = Boolean.TRUE;
        f6351X = m8935a("measurement.collection.log_event_and_bundle_v2", bool8, bool8, C1827j1.f5942a);
        Boolean bool9 = Boolean.FALSE;
        f6352Y = m8935a("measurement.quality.checksum", bool9, bool9, (C1901p3) null);
        Boolean bool10 = Boolean.FALSE;
        f6353Z = m8935a("measurement.sdk.dynamite.allow_remote_dynamite2", bool10, bool10, C1863m1.f6042a);
        Boolean bool11 = Boolean.TRUE;
        f6355a0 = m8935a("measurement.sdk.collection.validate_param_names_alphabetical", bool11, bool11, C1851l1.f5984a);
        Boolean bool12 = Boolean.FALSE;
        f6357b0 = m8935a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool12, bool12, C1887o1.f6102a);
        Boolean bool13 = Boolean.FALSE;
        f6359c0 = m8935a("measurement.audience.refresh_event_count_filters_timestamp", bool13, bool13, C1875n1.f6074a);
        Boolean bool14 = Boolean.FALSE;
        f6361d0 = m8935a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool14, bool14, C1899p1.f6126a);
        Boolean bool15 = Boolean.TRUE;
        f6363e0 = m8935a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool15, bool15, C1935s1.f6242a);
        Boolean bool16 = Boolean.TRUE;
        f6365f0 = m8935a("measurement.sdk.collection.last_deep_link_referrer2", bool16, bool16, C1923r1.f6205a);
        Boolean bool17 = Boolean.FALSE;
        f6367g0 = m8935a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool17, bool17, C1959u1.f6407a);
        Boolean bool18 = Boolean.FALSE;
        f6369h0 = m8935a("measurement.sdk.collection.last_gclid_from_referrer2", bool18, bool18, C1947t1.f6266a);
        Boolean bool19 = Boolean.TRUE;
        f6371i0 = m8935a("measurement.sdk.collection.enable_extend_user_property_size", bool19, bool19, C1983w1.f6479a);
        Boolean bool20 = Boolean.FALSE;
        f6373j0 = m8935a("measurement.upload.file_lock_state_check", bool20, bool20, C1971v1.f6447a);
        Boolean bool21 = Boolean.FALSE;
        f6375k0 = m8935a("measurement.ga.ga_app_id", bool21, bool21, C2008y1.f6550a);
        Boolean bool22 = Boolean.TRUE;
        f6377l0 = m8935a("measurement.lifecycle.app_backgrounded_tracking", bool22, bool22, C1995x1.f6504a);
        Boolean bool23 = Boolean.FALSE;
        f6379m0 = m8935a("measurement.lifecycle.app_in_background_parameter", bool23, bool23, C1720a2.f5619a);
        Boolean bool24 = Boolean.FALSE;
        f6381n0 = m8935a("measurement.integration.disable_firebase_instance_id", bool24, bool24, C1744c2.f5684a);
        Boolean bool25 = Boolean.FALSE;
        f6383o0 = m8935a("measurement.lifecycle.app_backgrounded_engagement", bool25, bool25, C1732b2.f5651a);
        Boolean bool26 = Boolean.FALSE;
        f6385p0 = m8935a("measurement.collection.service.update_with_analytics_fix", bool26, bool26, C1780f2.f5782a);
        Boolean bool27 = Boolean.FALSE;
        f6387q0 = m8935a("measurement.service.use_appinfo_modified", bool27, bool27, C1768e2.f5746a);
        Boolean bool28 = Boolean.TRUE;
        f6389r0 = m8935a("measurement.client.firebase_feature_rollout.v1.enable", bool28, bool28, C1804h2.f5859a);
        Boolean bool29 = Boolean.TRUE;
        f6391s0 = m8935a("measurement.client.sessions.check_on_reset_and_enable2", bool29, bool29, C1792g2.f5835a);
        Boolean bool30 = Boolean.FALSE;
        f6393t0 = m8935a("measurement.scheduler.task_thread.cleanup_on_exit", bool30, bool30, C1828j2.f5943a);
        Boolean bool31 = Boolean.FALSE;
        f6395u0 = m8935a("measurement.upload.file_truncate_fix", bool31, bool31, C1816i2.f5915a);
        Boolean bool32 = Boolean.FALSE;
        f6397v0 = m8935a("measurement.sdk.referrer.delayed_install_referrer_api", bool32, bool32, C1852l2.f5985a);
        Boolean bool33 = Boolean.TRUE;
        f6399w0 = m8935a("measurement.sdk.screen.disabling_automatic_reporting", bool33, bool33, C1840k2.f5961a);
        Boolean bool34 = Boolean.TRUE;
        f6401x0 = m8935a("measurement.sdk.screen.manual_screen_view_logging", bool34, bool34, C1864m2.f6043a);
        Boolean bool35 = Boolean.TRUE;
        f6403y0 = m8935a("measurement.gold.enhanced_ecommerce.format_logs", bool35, bool35, C1900p2.f6127a);
        Boolean bool36 = Boolean.TRUE;
        f6405z0 = m8935a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", bool36, bool36, C1888o2.f6103a);
        Boolean bool37 = Boolean.TRUE;
        f6308A0 = m8935a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", bool37, bool37, C1924r2.f6206a);
        Boolean bool38 = Boolean.TRUE;
        f6310B0 = m8935a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", bool38, bool38, C1912q2.f6182a);
        Boolean bool39 = Boolean.TRUE;
        f6312C0 = m8935a("measurement.gold.enhanced_ecommerce.updated_schema.client", bool39, bool39, C1948t2.f6267a);
        Boolean bool40 = Boolean.TRUE;
        f6314D0 = m8935a("measurement.gold.enhanced_ecommerce.updated_schema.service", bool40, bool40, C1936s2.f6243a);
        Boolean bool41 = Boolean.FALSE;
        m8935a("measurement.collection.synthetic_data_mitigation", bool41, bool41, C1972v2.f6448a);
        Boolean bool42 = Boolean.TRUE;
        f6316E0 = m8935a("measurement.service.configurable_service_limits", bool42, bool42, C1960u2.f6408a);
        Boolean bool43 = Boolean.TRUE;
        f6318F0 = m8935a("measurement.client.configurable_service_limits", bool43, bool43, C1996x2.f6505a);
        Boolean bool44 = Boolean.TRUE;
        f6320G0 = m8935a("measurement.androidId.delete_feature", bool44, bool44, C2020z2.f6565a);
        Boolean bool45 = Boolean.TRUE;
        f6322H0 = m8935a("measurement.client.global_params", bool45, bool45, C2009y2.f6551a);
        Boolean bool46 = Boolean.TRUE;
        f6324I0 = m8935a("measurement.service.global_params", bool46, bool46, C1733b3.f5652a);
        Boolean bool47 = Boolean.TRUE;
        f6326J0 = m8935a("measurement.service.global_params_in_payload", bool47, bool47, C1721a3.f5620a);
        Boolean bool48 = Boolean.TRUE;
        f6328K0 = m8935a("measurement.client.string_reader", bool48, bool48, C1757d3.f5725a);
        Boolean bool49 = Boolean.TRUE;
        f6330L0 = m8935a("measurement.sdk.attribution.cache", bool49, bool49, C1745c3.f5685a);
        Boolean bool50 = Boolean.TRUE;
        f6334N0 = m8935a("measurement.service.database_return_empty_collection", bool50, bool50, C1781f3.f5783a);
        Boolean bool51 = Boolean.TRUE;
        f6336O0 = m8935a("measurement.service.ssaid_removal", bool51, bool51, C1817i3.f5916a);
        Boolean bool52 = Boolean.FALSE;
        f6338P0 = m8935a("measurement.client.consent_state_v1", bool52, bool52, C1805h3.f5860a);
        Boolean bool53 = Boolean.FALSE;
        f6340Q0 = m8935a("measurement.service.consent_state_v1_W33", bool53, bool53, C1829j3.f5944a);
        Boolean bool54 = Boolean.FALSE;
        f6344S0 = m8935a("measurement.client.ad_impression.dev", bool54, bool54, C1853l3.f5986a);
        Boolean bool55 = Boolean.FALSE;
        f6346T0 = m8935a("measurement.service.ad_impression", bool55, bool55, C1889o3.f6104a);
        Boolean bool56 = Boolean.FALSE;
        f6348U0 = m8935a("measurement.service.separate_public_internal_event_blacklisting", bool56, bool56, C1877n3.f6076a);
    }

    /* renamed from: a */
    private static <V> C1925r3<V> m8935a(String str, V v, V v2, C1901p3<V> p3Var) {
        C1925r3 r3Var = new C1925r3(str, v, v2, p3Var);
        f6354a.add(r3Var);
        return r3Var;
    }

    /* renamed from: c */
    public static Map<String, String> m8939c(Context context) {
        C4752r1 a = C4752r1.m20262a(context.getContentResolver(), C4576h2.m19579a("com.google.android.gms.measurement"));
        return a == null ? Collections.emptyMap() : a.mo14569b();
    }
}
