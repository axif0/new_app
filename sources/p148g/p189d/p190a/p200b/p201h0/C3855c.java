package p148g.p189d.p190a.p200b.p201h0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: g.d.a.b.h0.c */
public final class C3855c {

    /* renamed from: c */
    public static final C3855c f11606c = new C3855c(new int[]{2}, 2);

    /* renamed from: a */
    private final int[] f11607a;

    /* renamed from: b */
    private final int f11608b;

    C3855c(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f11607a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f11607a = new int[0];
        }
        this.f11608b = i;
    }

    /* renamed from: a */
    public static C3855c m16088a(Context context) {
        return m16089b(context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: b */
    static C3855c m16089b(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f11606c : new C3855c(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    /* renamed from: c */
    public boolean mo12572c(int i) {
        return Arrays.binarySearch(this.f11607a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3855c)) {
            return false;
        }
        C3855c cVar = (C3855c) obj;
        return Arrays.equals(this.f11607a, cVar.f11607a) && this.f11608b == cVar.f11608b;
    }

    public int hashCode() {
        return this.f11608b + (Arrays.hashCode(this.f11607a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f11608b + ", supportedEncodings=" + Arrays.toString(this.f11607a) + "]";
    }
}
