package p048d.p049a.p050a.p051a.p078s;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.fragment.app.C0636d;
import androidx.fragment.app.C0653m;
import androidx.fragment.app.C0675u;
import androidx.fragment.app.Fragment;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.C2722R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import p048d.p049a.p050a.p051a.p058g.C2875m;
import p048d.p049a.p050a.p051a.p059h.C2879b;
import p048d.p049a.p050a.p051a.p059h.C2884g;
import p048d.p049a.p050a.p051a.p064k.C2970c;
import p048d.p049a.p050a.p051a.p064k.C2975h;
import p048d.p049a.p050a.p051a.p064k.C2977j;
import p086f.p099c.p100b.C3183b;
import p086f.p111h.p112e.C3267a;
import p340io.realm.internal.SyncObjectServerFacade;
import p390p.p391a.C6550a;

/* renamed from: d.a.a.a.s.n */
public class C3101n {

    /* renamed from: b */
    private static volatile C3101n f9876b;

    /* renamed from: c */
    private static ProgressDialog f9877c;

    /* renamed from: a */
    private boolean f9878a = false;

    /* renamed from: d.a.a.a.s.n$a */
    static class C3102a implements DialogInterface.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ Context f9879f;

        /* renamed from: g */
        final /* synthetic */ Activity f9880g;

        C3102a(Context context, Activity activity) {
            this.f9879f = context;
            this.f9880g = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
            C3101n.m13296J(this.f9879f, this.f9880g);
        }
    }

    /* renamed from: d.a.a.a.s.n$b */
    static class C3103b implements DialogInterface.OnClickListener {
        C3103b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: d.a.a.a.s.n$c */
    static /* synthetic */ class C3104c {

        /* renamed from: a */
        static final /* synthetic */ int[] f9881a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                d.a.a.a.h.b[] r0 = p048d.p049a.p050a.p051a.p059h.C2879b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9881a = r0
                d.a.a.a.h.b r1 = p048d.p049a.p050a.p051a.p059h.C2879b.COMMON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9881a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.a.a.h.b r1 = p048d.p049a.p050a.p051a.p059h.C2879b.FACULTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9881a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.a.a.h.b r1 = p048d.p049a.p050a.p051a.p059h.C2879b.STUDENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p078s.C3101n.C3104c.<clinit>():void");
        }
    }

    private C3101n() {
        if (f9876b != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class");
        }
    }

    /* renamed from: A */
    static /* synthetic */ void m13288A(Calendar calendar, AtomicBoolean atomicBoolean, DatePicker datePicker, int i, int i2, int i3) {
        calendar.set(i, i2, i3);
        atomicBoolean.set(true);
    }

    /* renamed from: B */
    static /* synthetic */ void m13289B(Calendar calendar, AtomicBoolean atomicBoolean, C2970c cVar, DialogInterface dialogInterface) {
        C6550a.m26771a("datePickerDialog: %s", calendar.getTime());
        cVar.mo386a(atomicBoolean.get() ? calendar.getTime() : null);
    }

    /* renamed from: D */
    static /* synthetic */ void m13291D(Context context, String str) {
        try {
            Dialog dialog = new Dialog(context, 16973835);
            dialog.setContentView(C2722R.layout.dialog_warning_message);
            dialog.setCanceledOnTouchOutside(true);
            ((TextView) dialog.findViewById(C2722R.C2724id.tv_warning_message)).setText(str);
            dialog.findViewById(C2722R.C2724id.tv_action_ok).setOnClickListener(new C3095h(dialog));
            dialog.setCanceledOnTouchOutside(false);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: H */
    static /* synthetic */ void m13294H(AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, TimePicker timePicker, int i, int i2) {
        atomicBoolean.set(true);
        atomicInteger.set(i);
        atomicInteger2.set(i2);
    }

    /* renamed from: I */
    static /* synthetic */ void m13295I(AtomicBoolean atomicBoolean, C2975h hVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, DialogInterface dialogInterface) {
        if (atomicBoolean.get()) {
            hVar.mo10231a(atomicInteger.get(), atomicInteger2.get());
        } else {
            hVar.mo10231a(-1, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static void m13296J(Context context, Activity activity) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), (String) null));
        activity.startActivityForResult(intent, 101);
    }

    /* renamed from: K */
    public static void m13297K(C0636d dVar, String str) {
        C0653m z = dVar.mo3317z();
        Fragment X = z.mo3426X(str);
        C0675u i = z.mo3440i();
        if (X != null) {
            i.mo3266m(X);
            i.mo3567h(X);
            i.mo3262i();
        }
    }

    /* renamed from: L */
    public static void m13298L(Bitmap bitmap, String str, String str2) {
        File dir = new ContextWrapper(SyncObjectServerFacade.getApplicationContext()).getDir(str2, 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, str + ".png");
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M */
    public static void m13299M(C0636d dVar, List<Integer> list, List<String> list2, C2977j jVar) {
        C2875m c2 = C2875m.m12453c2(list, list2, jVar);
        C0675u i = dVar.mo3317z().mo3440i();
        Fragment X = dVar.mo3317z().mo3426X("notificationDialog");
        if (X != null) {
            i.mo3268p(X);
        }
        i.mo3566g((String) null);
        c2.mo3291V1(i, "notificationDialog");
    }

    /* renamed from: N */
    public static void m13300N(Context context, String str) {
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.runOnUiThread(new C3094g(context, str));
            return;
        }
        try {
            Dialog dialog = new Dialog(context, 16973835);
            dialog.setContentView(C2722R.layout.dialog_warning_message);
            dialog.setCanceledOnTouchOutside(true);
            ((TextView) dialog.findViewById(C2722R.C2724id.tv_warning_message)).setText(str);
            dialog.findViewById(C2722R.C2724id.tv_action_ok).setOnClickListener(new C3089b(dialog));
            dialog.setCanceledOnTouchOutside(false);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: O */
    public static void m13301O(Activity activity, View view) {
        try {
            if (!(view instanceof EditText)) {
                view.setOnTouchListener(new C3090c(activity));
            }
            if (view instanceof ViewGroup) {
                for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                    m13301O(activity, ((ViewGroup) view).getChildAt(i));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: Q */
    public static void m13302Q(Context context) {
        Toast.makeText(context, context.getString(C2722R.string.error_message_internet_connect), 0).show();
    }

    /* renamed from: R */
    public static void m13303R(Context context) {
        Toast.makeText(context, context.getString(C2722R.string.internet_connection_warning_message), 0).show();
    }

    /* renamed from: S */
    public static void m13304S(Context context, String str) {
        try {
            if (f9877c == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                f9877c = progressDialog;
                progressDialog.setIndeterminate(true);
            }
            f9877c.setMessage(str);
            f9877c.setCancelable(false);
            f9877c.setCanceledOnTouchOutside(false);
            f9877c.show();
        } catch (Exception unused) {
        }
    }

    /* renamed from: T */
    public static void m13305T(Context context, Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Need Permissions");
        builder.setMessage("This app needs permission to use this feature. You can grant them in app settings.");
        builder.setPositiveButton("GOTO SETTINGS", new C3102a(context, activity));
        builder.setNegativeButton("Cancel", new C3103b());
        builder.show();
    }

    /* renamed from: V */
    public static Snackbar m13306V(Activity activity, String str, String str2, View.OnClickListener onClickListener) {
        Snackbar Z = Snackbar.m10402Z(activity.getWindow().getDecorView().findViewById(16908290), str, -2);
        Z.mo8711b0(activity.getResources().getColor(C2722R.color.color_white_100));
        Z.mo8710a0(str2, onClickListener);
        Z.mo8654C().setBackgroundColor(C3267a.m14074d(activity, C2722R.color.colorAccent));
        Z.mo8663P();
        return Z;
    }

    /* renamed from: W */
    public static void m13307W(Context context, int i, int i2, boolean z, C2975h hVar) {
        Calendar instance = Calendar.getInstance();
        AtomicInteger atomicInteger = new AtomicInteger(instance.get(11));
        AtomicInteger atomicInteger2 = new AtomicInteger(instance.get(12));
        if (i != -1) {
            atomicInteger.set(i);
            atomicInteger2.set(i2);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new C3096i(atomicBoolean, atomicInteger, atomicInteger2), atomicInteger.get(), atomicInteger2.get(), z);
        timePickerDialog.setOnDismissListener(new C3093f(atomicBoolean, hVar, atomicInteger, atomicInteger2));
        timePickerDialog.show();
    }

    /* renamed from: a */
    public static void m13308a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static void m13310c(Context context, C2884g gVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add("firebase_token_synced");
        arrayList.add("authentication_api_key");
        arrayList.add("logged_in_user_type");
        arrayList.add("app_accessibility");
        if (gVar == C2884g.STUDENT) {
            str = "student_login_json";
        } else {
            if (gVar == C2884g.FACULTY) {
                str = "faculty_login_json";
            }
            C3099l.m13277b(context).mo10693f(arrayList);
        }
        arrayList.add(str);
        C3099l.m13277b(context).mo10693f(arrayList);
    }

    /* renamed from: d */
    public static void m13311d(C0636d dVar, Fragment fragment, C2879b bVar) {
        int i;
        int i2 = C3104c.f9881a[bVar.ordinal()];
        if (i2 == 1) {
            i = C2722R.C2724id.common_fragment_container;
        } else if (i2 == 2) {
            i = C2722R.C2724id.faculty_fragment_container;
        } else if (i2 == 3) {
            i = C2722R.C2724id.student_fragment_container;
        } else {
            throw new IllegalStateException("Unexpected value: " + bVar);
        }
        String simpleName = fragment.getClass().getSimpleName();
        C0675u i3 = dVar.mo3317z().mo3440i();
        i3.mo3570r(i, fragment, simpleName);
        i3.mo3262i();
    }

    /* renamed from: e */
    public static void m13312e(Context context, Date date, C2970c cVar) {
        Calendar instance = Calendar.getInstance();
        if (date != null) {
            instance.setTime(date);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new C3092e(instance, atomicBoolean), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.setOnDismissListener(new C3091d(instance, atomicBoolean, cVar));
        datePickerDialog.show();
    }

    /* renamed from: g */
    public static void m13313g() {
        ProgressDialog progressDialog = f9877c;
        if (progressDialog != null && progressDialog.isShowing()) {
            f9877c.dismiss();
        }
    }

    /* renamed from: h */
    public static void m13314h(Context context, int i) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot((long) i, -1));
        } else {
            vibrator.vibrate((long) i);
        }
    }

    /* renamed from: i */
    public static Date m13315i(Date date, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        try {
            return simpleDateFormat.parse(simpleDateFormat.format(instance.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static Date m13316j(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.getDefault());
        try {
            if (!str.isEmpty()) {
                return simpleDateFormat.parse(str);
            }
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static Date m13317k(int i) {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(6, -i);
        return instance.getTime();
    }

    /* renamed from: l */
    public static String m13318l(String str, String str2) {
        try {
            Date parse = new SimpleDateFormat(str2, Locale.getDefault()).parse(str.substring(0, str.indexOf(32)) + " 00:00:00");
            String format = new SimpleDateFormat("dd", Locale.getDefault()).format(parse);
            String format2 = new SimpleDateFormat("MMM", Locale.getDefault()).format(parse);
            String format3 = new SimpleDateFormat("yyyy", Locale.getDefault()).format(parse);
            String substring = str.substring(str.indexOf(32) + 1);
            return substring + ", " + format2.toUpperCase() + " " + format + ", " + format3;
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: m */
    public static int m13319m(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(7);
    }

    /* renamed from: n */
    public static String m13320n(Date date, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(date);
    }

    /* renamed from: p */
    public static C3101n m13321p() {
        if (f9876b == null) {
            synchronized (C3101n.class) {
                if (f9876b == null) {
                    f9876b = new C3101n();
                }
            }
        }
        return f9876b;
    }

    /* renamed from: q */
    public static int m13322q(int i, int i2) {
        return new Random().nextInt(i2 - i) + i;
    }

    /* renamed from: r */
    public static String m13323r(int i) {
        String str;
        StringBuilder sb;
        if (i < 10) {
            sb = new StringBuilder();
            str = "0";
        } else {
            sb = new StringBuilder();
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: s */
    public static Fragment m13324s(C0636d dVar) {
        for (Fragment next : dVar.mo3317z().mo3435f0()) {
            if (next.mo3198h0()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static void m13325t(Context context, String str) {
        if (!m13328w(context)) {
            m13303R(context);
            return;
        }
        C3183b.C3184a aVar = new C3183b.C3184a();
        aVar.mo11011e(C3267a.m14074d(context, C2722R.color.colorPrimary));
        aVar.mo11008a();
        aVar.mo11010d(true);
        aVar.mo11009b().mo11007a(context, Uri.parse(str));
    }

    /* renamed from: u */
    public static void m13326u(View view, Activity activity) {
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* renamed from: v */
    public static void m13327v(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    /* renamed from: w */
    public static boolean m13328w(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isAvailable() && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    /* renamed from: x */
    public static boolean m13329x(String str) {
        return !Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(str).matches();
    }

    /* renamed from: y */
    public static boolean m13330y(String str) {
        return !Pattern.matches("^(?:\\+?88)?01[3-9]\\d{8}$", str) || str.length() != 11;
    }

    /* renamed from: z */
    public static boolean m13331z(boolean z, boolean z2, boolean z3, int i, int i2, String str) {
        StringBuilder sb = new StringBuilder("((?=.*[a-z])");
        if (z) {
            sb.append("(?=.*[@#$%])");
        }
        if (z2) {
            sb.append("(?=.*[A-Z])");
        }
        if (z3) {
            sb.append("(?=.*[0-9])");
        }
        sb.append(".{");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append("})");
        return !TextUtils.isEmpty(str) && Pattern.compile(sb.toString()).matcher(str).matches();
    }

    /* renamed from: G */
    public /* synthetic */ void mo10698G() {
        this.f9878a = false;
    }

    /* renamed from: P */
    public void mo10699P(Activity activity, Context context) {
        if (this.f9878a) {
            activity.moveTaskToBack(true);
        }
        if (!this.f9878a) {
            this.f9878a = true;
            Toast.makeText(context, "Please click BACK again to exit", 0).show();
        }
        new Handler().postDelayed(new C3088a(this), 2000);
    }

    /* renamed from: U */
    public void mo10700U(Activity activity, String str) {
        Snackbar Z = Snackbar.m10402Z(activity.getWindow().getDecorView().findViewById(16908290), str, 0);
        Z.mo8654C().setBackgroundColor(C3267a.m14074d(activity, C2722R.color.colorAccent));
        Z.mo8663P();
    }

    /* renamed from: f */
    public void mo10701f(NavigationView navigationView) {
        NavigationMenuView navigationMenuView;
        if (navigationView != null && (navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0)) != null) {
            navigationMenuView.setVerticalScrollBarEnabled(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        r8 = r7.getString(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        m13325t(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r0.putBoolean("individual_fragment_data_availability", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        r1.mo3233u1(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r0.putBoolean("individual_fragment_data_availability", false);
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.fragment.app.Fragment mo10702o(androidx.fragment.app.C0636d r7, int r8) {
        /*
            r6 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "individual_fragment_data_availability"
            switch(r8) {
                case 2131362305: goto L_0x00d4;
                case 2131362306: goto L_0x00c9;
                case 2131362307: goto L_0x00c5;
                case 2131362308: goto L_0x000d;
                case 2131362309: goto L_0x00c0;
                case 2131362310: goto L_0x0076;
                case 2131362311: goto L_0x0071;
                case 2131362312: goto L_0x006d;
                case 2131362313: goto L_0x0069;
                case 2131362314: goto L_0x0063;
                case 2131362315: goto L_0x005f;
                case 2131362316: goto L_0x005a;
                case 2131362317: goto L_0x0054;
                case 2131362318: goto L_0x004f;
                case 2131362319: goto L_0x0028;
                case 2131362320: goto L_0x0023;
                case 2131362321: goto L_0x001a;
                case 2131362322: goto L_0x000d;
                case 2131362323: goto L_0x000d;
                case 2131362324: goto L_0x0014;
                case 2131362325: goto L_0x000d;
                case 2131362326: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x00de
        L_0x000f:
            academia.bracu.com.academia.common.fragments.h0 r1 = academia.bracu.com.academia.common.fragments.C0110h0.m429J1()
            goto L_0x001e
        L_0x0014:
            academia.bracu.com.academia.common.fragments.e0 r1 = academia.bracu.com.academia.common.fragments.C0103e0.m398J1()
            goto L_0x00d8
        L_0x001a:
            academia.bracu.com.academia.common.fragments.x r1 = academia.bracu.com.academia.common.fragments.C0131x.m478a2()
        L_0x001e:
            r0.putBoolean(r4, r2)
            goto L_0x00db
        L_0x0023:
            r8 = 2131886497(0x7f1201a1, float:1.9407575E38)
            goto L_0x00cc
        L_0x0028:
            java.lang.String r8 = "geo:23.7801613,90.4070993?q=23.7801613,90.4070993(BRAC University)"
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x0049 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2, r8)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r8 = "com.google.android.apps.maps"
            r0.setPackage(r8)     // Catch:{ Exception -> 0x0049 }
            android.content.pm.PackageManager r8 = r7.getPackageManager()     // Catch:{ Exception -> 0x0049 }
            android.content.ComponentName r8 = r0.resolveActivity(r8)     // Catch:{ Exception -> 0x0049 }
            if (r8 == 0) goto L_0x00de
            r7.startActivity(r0)     // Catch:{ Exception -> 0x0049 }
            goto L_0x00de
        L_0x0049:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x00de
        L_0x004f:
            r8 = 2131886496(0x7f1201a0, float:1.9407572E38)
            goto L_0x00cc
        L_0x0054:
            academia.bracu.com.academia.common.fragments.a0 r1 = academia.bracu.com.academia.common.fragments.C0093a0.m369M1()
            goto L_0x00d8
        L_0x005a:
            r8 = 2131886495(0x7f12019f, float:1.940757E38)
            goto L_0x00cc
        L_0x005f:
            java.lang.String r8 = "http://www.bracu.ac.bd"
            goto L_0x00d0
        L_0x0063:
            academia.bracu.com.academia.common.fragments.z r1 = academia.bracu.com.academia.common.fragments.C0135z.m497U1()
            goto L_0x00d8
        L_0x0069:
            r8 = 2131886494(0x7f12019e, float:1.9407568E38)
            goto L_0x00cc
        L_0x006d:
            r8 = 2131886493(0x7f12019d, float:1.9407566E38)
            goto L_0x00cc
        L_0x0071:
            academia.bracu.com.academia.common.fragments.y r1 = academia.bracu.com.academia.common.fragments.C0134y.m485J1()
            goto L_0x00d8
        L_0x0076:
            academia.bracu.com.academia.common.fragments.w r1 = academia.bracu.com.academia.common.fragments.C0130w.m458J1()
            d.a.a.a.n.b.g r8 = p048d.p049a.p050a.p051a.p067n.p069b.C2999g.m12790d(r7)
            java.lang.String r5 = "spring"
            io.realm.q0 r8 = r8.mo10334a(r5)
            if (r8 == 0) goto L_0x008e
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x008e
            r8 = 1
            goto L_0x008f
        L_0x008e:
            r8 = 0
        L_0x008f:
            if (r8 == 0) goto L_0x00a6
            d.a.a.a.n.b.g r8 = p048d.p049a.p050a.p051a.p067n.p069b.C2999g.m12790d(r7)
            java.lang.String r5 = "summer"
            io.realm.q0 r8 = r8.mo10334a(r5)
            if (r8 == 0) goto L_0x00a5
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x00a5
            r8 = 1
            goto L_0x00a6
        L_0x00a5:
            r8 = 0
        L_0x00a6:
            if (r8 == 0) goto L_0x00bc
            d.a.a.a.n.b.g r7 = p048d.p049a.p050a.p051a.p067n.p069b.C2999g.m12790d(r7)
            java.lang.String r8 = "fall"
            io.realm.q0 r7 = r7.mo10334a(r8)
            if (r7 == 0) goto L_0x00bb
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x00bb
            r2 = 1
        L_0x00bb:
            r8 = r2
        L_0x00bc:
            r0.putBoolean(r4, r8)
            goto L_0x00db
        L_0x00c0:
            academia.bracu.com.academia.common.fragments.u r1 = academia.bracu.com.academia.common.fragments.C0123u.m440J1()
            goto L_0x00d8
        L_0x00c5:
            r8 = 2131886492(0x7f12019c, float:1.9407564E38)
            goto L_0x00cc
        L_0x00c9:
            r8 = 2131886491(0x7f12019b, float:1.9407562E38)
        L_0x00cc:
            java.lang.String r8 = r7.getString(r8)
        L_0x00d0:
            m13325t(r7, r8)
            goto L_0x00de
        L_0x00d4:
            d.a.a.a.j.a r1 = p048d.p049a.p050a.p051a.p063j.C2960a.m12720J1()
        L_0x00d8:
            r0.putBoolean(r4, r3)
        L_0x00db:
            r1.mo3233u1(r0)
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p048d.p049a.p050a.p051a.p078s.C3101n.mo10702o(androidx.fragment.app.d, int):androidx.fragment.app.Fragment");
    }
}
