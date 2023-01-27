package p048d.p049a.p050a.p051a.p073p;

import p048d.p049a.p050a.p051a.p071o.p072a.C3019f0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3023h0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3029k0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3033m0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3035n0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3039p0;
import p048d.p049a.p050a.p051a.p071o.p072a.C3040q;
import p048d.p049a.p050a.p051a.p071o.p072a.C3043s;
import p048d.p049a.p050a.p051a.p071o.p072a.C3044t;
import p048d.p049a.p050a.p051a.p071o.p072a.C3045u;
import p048d.p049a.p050a.p051a.p071o.p072a.C3048x;
import p048d.p049a.p050a.p051a.p071o.p072a.C3049y;
import p386o.C6311b;
import p386o.p389y.C6387b;
import p386o.p389y.C6389d;
import p386o.p389y.C6397l;

/* renamed from: d.a.a.a.p.a */
public interface C3051a {
    @C6389d
    @C6397l("academiaAndroidConnectivity/studentProfileJSON")
    /* renamed from: a */
    C6311b<C3029k0> mo10631a(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3, @C6387b("withResult") String str4, @C6387b("imageAvailability") String str5);

    @C6389d
    @C6397l("academiaAndroidConnectivity/getFacultyProfileInfo")
    /* renamed from: b */
    C6311b<C3043s> mo10632b(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3);

    @C6389d
    @C6397l("academiaAndroidConnectivity/updateNotificationStatus")
    /* renamed from: c */
    C6311b<C3039p0> mo10633c(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3, @C6387b("notification_ids") String str4);

    @C6389d
    @C6397l("academiaAndroidConnectivity/studentResultForAndroid")
    /* renamed from: d */
    C6311b<C3033m0> mo10634d(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3);

    @C6389d
    @C6397l("academiaAndroidConnectivity/showExamSchedule")
    /* renamed from: e */
    C6311b<C3040q> mo10635e(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3);

    @C6389d
    @C6397l("academiaAndroidConnectivity/showClassSchedule")
    /* renamed from: f */
    C6311b<C3035n0> mo10636f(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3);

    @C6389d
    @C6397l("academiaAndroidConnectivity/feedback")
    /* renamed from: g */
    C6311b<C3045u> mo10637g(@C6387b("name") String str, @C6387b("email") String str2, @C6387b("mobileNumber") String str3, @C6387b("comments") String str4);

    @C6389d
    @C6397l("academiaAndroidConnectivity/getNotificationMessageReport")
    /* renamed from: h */
    C6311b<C3049y> mo10638h(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3, @C6387b("subject") String str4, @C6387b("fromDate") String str5, @C6387b("toDate") String str6, @C6387b("fromTime") String str7, @C6387b("toTime") String str8, @C6387b("isDelivered") String str9, @C6387b("offset") String str10);

    @C6389d
    @C6397l("academiaAndroidConnectivity/showAdvisedCourse")
    /* renamed from: i */
    C6311b<C3023h0> mo10639i(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3);

    @C6389d
    @C6397l("academiaAndroidConnectivity/studentProfileJSON")
    /* renamed from: j */
    C6311b<C3029k0> mo10640j(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3, @C6387b("studentSystemUserId") String str4, @C6387b("withResult") String str5, @C6387b("forFaculty") String str6, @C6387b("imageAvailability") String str7);

    @C6389d
    @C6397l("academiaAndroidConnectivity/pushNotificationToStudents")
    /* renamed from: k */
    C6311b<C3019f0> mo10641k(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3, @C6387b("system_ids") String str4, @C6387b("mobileNo") String str5, @C6387b("subject") String str6, @C6387b("message") String str7, @C6387b("isMobileSMS") String str8, @C6387b("notification") String str9);

    @C6389d
    @C6397l("academiaAndroidConnectivity/getFacultyClassSchedule")
    /* renamed from: l */
    C6311b<C3044t> mo10642l(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3);

    @C6389d
    @C6397l("academiaAndroidConnectivity/getUserNotification")
    /* renamed from: m */
    C6311b<C3048x> mo10643m(@C6387b("apiKey") String str, @C6387b("appKey") String str2, @C6387b("systemUserId") String str3, @C6387b("pageNo") String str4, @C6387b("messageType") String str5);
}
