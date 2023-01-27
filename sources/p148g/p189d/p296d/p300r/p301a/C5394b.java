package p148g.p189d.p296d.p300r.p301a;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* renamed from: g.d.d.r.a.b */
public final class C5394b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15610d = "b";

    /* renamed from: a */
    private final Context f15611a;

    /* renamed from: b */
    private boolean f15612b = true;

    /* renamed from: c */
    private boolean f15613c = false;

    /* renamed from: g.d.d.r.a.b$a */
    class C5395a implements MediaPlayer.OnCompletionListener {
        C5395a(C5394b bVar) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    /* renamed from: g.d.d.r.a.b$b */
    class C5396b implements MediaPlayer.OnErrorListener {
        C5396b(C5394b bVar) {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String a = C5394b.f15610d;
            Log.w(a, "Failed to beep " + i + ", " + i2);
            mediaPlayer.stop();
            mediaPlayer.release();
            return true;
        }
    }

    public C5394b(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f15611a = activity.getApplicationContext();
    }

    /* renamed from: b */
    public MediaPlayer mo15637b() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new C5395a(this));
        mediaPlayer.setOnErrorListener(new C5396b(this));
        try {
            openRawResourceFd = this.f15611a.getResources().openRawResourceFd(C5406i.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(f15610d, e);
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    /* renamed from: c */
    public synchronized void mo15638c() {
        if (this.f15612b) {
            mo15637b();
        }
        if (this.f15613c) {
            ((Vibrator) this.f15611a.getSystemService("vibrator")).vibrate(200);
        }
    }

    /* renamed from: d */
    public void mo15639d(boolean z) {
        this.f15612b = z;
    }
}
