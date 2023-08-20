package com.android.support;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.goxome.aidestudio.adrt.ADRTLogCatReader;

public class Launcher extends Service {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f29short = {487, 491, 489, 426, 483, 491, 508, 491, 489, 481, 426, 485, 493, 480, 481, 503, 496, 497, 480, 493, 491, 438};
    Menu menu;

    public Launcher() {
    }

    private void Thread() {
        if (m1442(this)) {
            C0127.m1761(m1440(this), 4);
        } else {
            C0127.m1761(m1440(this), 0);
        }
    }

    private boolean isNotInGame() {
        Object obj;
        new ActivityManager.RunningAppProcessInfo();
        Object obj2 = obj;
        C0130.m2006(obj2);
        return C0131.m2060(obj2) != 100;
    }

    /* renamed from: ۣ۟۠ۥۢ  reason: not valid java name and contains not printable characters */
    public static void m1438(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ADRTLogCatReader.onContext((Context) obj, (String) obj2);
        }
    }

    /* renamed from: ۟ۡۨۦ  reason: not valid java name and contains not printable characters */
    public static void m1439(Object obj) {
        if (C0128.m1803() < 0) {
            ((Launcher) obj).Thread();
        }
    }

    /* renamed from: ۡۡۨۦ  reason: not valid java name and contains not printable characters */
    public static Menu m1440(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Launcher) obj).menu;
        }
        return null;
    }

    /* renamed from: ۢۦۣۥ  reason: not valid java name and contains not printable characters */
    public static short[] m1441() {
        if (C0128.m1803() <= 0) {
            return f29short;
        }
        return null;
    }

    /* renamed from: ۨۧۡۧ  reason: not valid java name and contains not printable characters */
    public static boolean m1442(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Launcher) obj).isNotInGame();
        }
        return false;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Intent intent2 = intent;
        return null;
    }

    @Override
    public void onCreate() {
        Menu menu2;
        Handler handler;
        Object obj;
        m1438(this, C0130.m1942(m1441(), 0, 22, 388));
        super.onCreate();
        new Menu(this);
        this.menu = menu2;
        C0130.m1969(m1440(this));
        C0127.m1699(m1440(this));
        new Handler();
        Handler handler2 = handler;
        new Runnable(this, handler2) {
            private final Launcher this$0;
            private final Handler val$handler;

            {
                this.this$0 = r58;
                this.val$handler = r59;
            }

            static Launcher access$0(AnonymousClass100000000 r55) {
                return m1445(r55);
            }

            /* renamed from: ۣ۟۟ۥۦ  reason: not valid java name and contains not printable characters */
            public static void m1443(Object obj) {
                if (C0129.m1842() > 0) {
                    Launcher.m1439((Launcher) obj);
                }
            }

            /* renamed from: ۟ۤۧۦۧ  reason: not valid java name and contains not printable characters */
            public static Handler m1444(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000000) obj).val$handler;
                }
                return null;
            }

            /* renamed from: ۣۦۥۢ  reason: not valid java name and contains not printable characters */
            public static Launcher m1445(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000000) obj).this$0;
                }
                return null;
            }

            public void run() {
                m1443(m1445(this));
                boolean r2 = C0127.m1750(m1444(this), this, (long) 1000);
            }
        };
        boolean r4 = C0130.m1959(handler2, obj);
    }

    public void onDestroy() {
        super.onDestroy();
        C0129.m1900(m1440(this));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2 = intent;
        int i3 = i;
        int i4 = i2;
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        try {
            C0130.m1990((long) 100);
        } catch (InterruptedException e) {
            C0131.m2072(e);
        }
        C0130.m1981(this);
    }
}
