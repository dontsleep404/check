package com.android.support;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

public class VPN extends ContentProvider implements Runnable {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f55short = {1069, 1068, 1079, 1129, 3249, 3249, 3249, 3313, 2087, 2107, 2107, 2111, 2145, 2111, 2109, 2080, 2103, 2102, 2055, 2080, 2108, 2107, 2765, 2769, 2769, 2773, 2699, 2773, 2775, 2762, 2781, 2780, 2805, 2762, 2775, 2769, 2839, 2827};
    private final ScheduledExecutorService scheduler = C0131.m2088(1);

    public static boolean isVpnConnected() {
        try {
            Enumeration r3 = C0131.m2083();
            if (r3 == null) {
                return false;
            }
            Iterator r2 = C0130.m1977(C0131.m2111(r3));
            while (C0131.m2107(r2)) {
                NetworkInterface networkInterface = (NetworkInterface) C0129.m1824(r2);
                if (C0130.m2018(networkInterface) && C0131.m2037(C0130.m1919(networkInterface)) != 0) {
                    if (C0130.m1943(C0127.m1795(m1697(), 0, 4, 1113), C0130.m1926(networkInterface)) || C0130.m1943(C0130.m1942(m1697(), 4, 4, 3265), C0130.m1926(networkInterface))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C0127.m1735(th);
            return false;
        }
    }

    public static boolean isWifiProxy(Context mContext) {
        String r1;
        int r2;
        Context context = mContext;
        if (C0131.m2102() >= 14) {
            r1 = C0129.m1879(C0127.m1795(m1697(), 8, 14, 2127));
            String r0 = C0129.m1879(C0129.m1884(m1697(), 22, 14, 2725));
            if (r0 == null) {
                r0 = C0127.m1795(m1697(), 36, 2, 2874);
            }
            r2 = C0130.m1997(r0);
        } else {
            r1 = C0131.m2036(context);
            r2 = C0129.m1831(context);
        }
        return !C0131.m2028(r1) && r2 != -1;
    }

    /* renamed from: ۧۨ۟ۡ  reason: not valid java name and contains not printable characters */
    public static short[] m1697() {
        if (C0128.m1803() <= 0) {
            return f55short;
        }
        return null;
    }

    /* renamed from: ۨۦۡۨ  reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService m1698(Object obj) {
        if (C0127.m1700() > 0) {
            return ((VPN) obj).scheduler;
        }
        return null;
    }

    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        String[] strArr = selectionArgs;
        String str = selection;
        Uri uri2 = uri;
        return 0;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        Uri uri2 = uri;
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        ContentValues contentValues = values;
        Uri uri2 = uri;
        return null;
    }

    public boolean onCreate() {
        C0131.m2115(m1698(this), this, 0, 3, C0127.m1780());
        return false;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        String str = sortOrder;
        String[] strArr = selectionArgs;
        String str2 = selection;
        String[] strArr2 = projection;
        Uri uri2 = uri;
        return null;
    }

    public void run() {
        if (C0130.m1972() || C0130.m2007(C0127.m1776(this))) {
            C0129.m1856(0);
        }
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        String[] strArr = selectionArgs;
        String str = selection;
        ContentValues contentValues = values;
        Uri uri2 = uri;
        return 0;
    }
}
