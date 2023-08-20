package com.android.support;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

public class Main {
    public static String dex;
    public static boolean loadd = false;
    public static Context mContext;

    /* renamed from: short  reason: not valid java name */

    static {
        C0129.m1894("Init"));
    }

    public Main() {
    }

    private static native void CheckOverlayPermission(Context context);

    public static native String Init(Context context, String str);

    public static native String Initt(Context context, String str);

    public static void StartWithoutPermission(Context context) {
        Object obj;
        Object obj2;
        Object obj3;
        Runnable runnable;
        Object obj4;
        Object obj5;
        Context context2 = context;
        C0127.m1710(context2, true);
        if (context2 instanceof Activity) {
            mContext = context2;
            String r2 = Main.mContext.getCacheDir() + "/libTH.so"
            C0129.m1894("HuongPro");
            new Runnable() {
                @Override
                public void run() {
                    GG.gg(Main.mContext);
                }
            };
            new Thread(runnable);
            obj3.start();
            new Handler();
            new Runnable() {
                @Override
                public void run() {
                    Object obj = new Menu();
                    obj.SetWindowManagerActivity();
                    obj.ShowMenu();
                }
            };
            boolean r4 = C0127.m1750(obj4, obj5, (long) 1000);
            return;
        }
        CheckOverlayPermission(Main.mContext);
    }
    public static native String abc();
}
