package com.android.support;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Proxy;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.android.support.ۧۡۢ  reason: contains not printable characters */
public class C0131 {

    /* renamed from: ۣ۟ۢ۟ۤ  reason: not valid java name and contains not printable characters */
    public static int f61 = 69;

    /* renamed from: ۟۟۟ۧۧ  reason: not valid java name and contains not printable characters */
    public static String m2024() {
        if (C0129.m1842() > 0) {
            return Build.MANUFACTURER;
        }
        return null;
    }

    /* renamed from: ۣ۟۟۠ۧ  reason: not valid java name and contains not printable characters */
    public static void m2025(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            ((EditText) obj).setHint((CharSequence) obj2);
        }
    }

    /* renamed from: ۟۟ۡ۠  reason: not valid java name and contains not printable characters */
    public static void m2026(Object obj, int i, Object obj2) {
        if (C0127.m1700() > 0) {
            ((Cipher) obj).init(i, (Key) obj2);
        }
    }

    /* renamed from: ۟۟ۡۨۢ  reason: not valid java name and contains not printable characters */
    public static boolean m2027(Object obj, Object obj2, Object obj3) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).Lg((Context) obj2, (String) obj3);
        }
        return false;
    }

    /* renamed from: ۟۟ۥۦۢ  reason: not valid java name and contains not printable characters */
    public static boolean m2028(Object obj) {
        if (C0127.m1700() > 0) {
            return TextUtils.isEmpty((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۟۠۟ۨۤ  reason: not valid java name and contains not printable characters */
    public static void m2029(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            ((EditText) obj).setFilters((InputFilter[]) obj2);
        }
    }

    /* renamed from: ۟۠ۢۤۢ  reason: not valid java name and contains not printable characters */
    public static String m2030(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            return ((SimpleDateFormat) obj).format((Date) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۥۢ  reason: not valid java name and contains not printable characters */
    public static boolean m2031(Object obj, Object obj2) {
        if (C0129.m1842() > 0) {
            return ((LinkedHashSet) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟۠ۧۤ  reason: not valid java name and contains not printable characters */
    public static void m2032(Object obj, int i) {
        if (m2080() > 0) {
            ((LinearLayout) obj).setVisibility(i);
        }
    }

    /* renamed from: ۣ۟۠ۨۥ  reason: not valid java name and contains not printable characters */
    public static void m2033(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            ((RadioGroup) obj).addView((View) obj2);
        }
    }

    /* renamed from: ۟۠ۤۧ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m2034(Object obj, Object obj2) {
        if (C0129.m1842() > 0) {
            return ((SharedPreferences.Editor) obj).remove((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۣۢ  reason: not valid java name and contains not printable characters */
    public static Set m2035(Object obj, Object obj2, Object obj3) {
        if (C0128.m1803() <= 0) {
            return ((SharedPreferences) obj).getStringSet((String) obj2, (Set) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠ۧۡۤ  reason: not valid java name and contains not printable characters */
    public static String m2036(Object obj) {
        if (C0129.m1842() >= 0) {
            return Proxy.getHost((Context) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۢ۠  reason: not valid java name and contains not printable characters */
    public static int m2037(Object obj) {
        if (m2080() >= 0) {
            return ((List) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۡ۠ۦ  reason: not valid java name and contains not printable characters */
    public static int m2038(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            return ((Preferences) obj).readInt(i);
        }
        return 0;
    }

    /* renamed from: ۟ۡۡۨۥ  reason: not valid java name and contains not printable characters */
    public static void m2039(Object obj, boolean z) {
        if (C0127.m1700() > 0) {
            ((Button) obj).setAllCaps(z);
        }
    }

    /* renamed from: ۟ۡۢ۠ۦ  reason: not valid java name and contains not printable characters */
    public static int m2040(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            return ((RadioGroup) obj).indexOfChild((View) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۡۢۡ۠  reason: not valid java name and contains not printable characters */
    public static void m2041(Object obj) {
        if (C0128.m1803() <= 0) {
            ((NoSuchPaddingException) obj).printStackTrace();
        }
    }

    /* renamed from: ۣ۟ۡ۠ۢ  reason: not valid java name and contains not printable characters */
    public static void m2042(Object obj, int i, boolean z) {
        if (m2080() >= 0) {
            ((Preferences) obj).writeBoolean(i, z);
        }
    }

    /* renamed from: ۟ۡۥۣۢ  reason: not valid java name and contains not printable characters */
    public static String m2043() {
        if (C0127.m1700() > 0) {
            return Build.MODEL;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۦ۠  reason: not valid java name and contains not printable characters */
    public static void m2044(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            ((Spinner) obj).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) obj2);
        }
    }

    /* renamed from: ۟ۡۦۥۤ  reason: not valid java name and contains not printable characters */
    public static void m2045(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            ((ImageView) obj).setImageBitmap((Bitmap) obj2);
        }
    }

    /* renamed from: ۟ۡۨۤۨ  reason: not valid java name and contains not printable characters */
    public static void m2046(Object obj) {
        if (C0129.m1842() > 0) {
            ((LinearLayout) obj).removeAllViews();
        }
    }

    /* renamed from: ۟ۢ۟ۢۦ  reason: not valid java name and contains not printable characters */
    public static void m2047(Object obj, float f) {
        if (C0128.m1803() < 0) {
            ((WebView) obj).setAlpha(f);
        }
    }

    /* renamed from: ۣ۟ۢ۠ۦ  reason: not valid java name and contains not printable characters */
    public static String m2048(Object obj, Object obj2, Object obj3) {
        if (C0128.m1803() < 0) {
            return ((String) obj).replace((CharSequence) obj2, (CharSequence) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۡ۟ۦ  reason: not valid java name and contains not printable characters */
    public static void m2049(Object obj, int i, int i2) {
        if (m2080() >= 0) {
            ((InputMethodManager) obj).toggleSoftInput(i, i2);
        }
    }

    /* renamed from: ۟ۢۤۢۧ  reason: not valid java name and contains not printable characters */
    public static void m2050(Object obj, Object obj2) {
        if (m2080() >= 0) {
            ((Spinner) obj).setAdapter((SpinnerAdapter) obj2);
        }
    }

    /* renamed from: ۟ۢۤۦۡ  reason: not valid java name and contains not printable characters */
    public static String m2051(Object obj) {
        if (C0127.m1700() > 0) {
            return ((ReflectiveOperationException) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟ۢ  reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m2052(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            return ((AlertDialog.Builder) obj).setPositiveButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۦۤۦ  reason: not valid java name and contains not printable characters */
    public static File[] m2053(Object obj) {
        if (C0128.m1803() < 0) {
            return ((File) obj).listFiles();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۧ  reason: not valid java name and contains not printable characters */
    public static void m2054(Object obj) {
        if (C0129.m1842() >= 0) {
            ((ReflectiveOperationException) obj).printStackTrace();
        }
    }

    /* renamed from: ۣ۟ۡۡۧ  reason: not valid java name and contains not printable characters */
    public static void m2055(Object obj, int i, int i2, int i3, int i4) {
        if (C0127.m1700() > 0) {
            ((RadioGroup) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۣ۟ۢۥۨ  reason: not valid java name and contains not printable characters */
    public static int m2056(Object obj, int i) {
        if (C0127.m1700() >= 0) {
            return ((String) obj).indexOf(i);
        }
        return 0;
    }

    /* renamed from: ۣۣ۟۠۟  reason: not valid java name and contains not printable characters */
    public static String m2057() {
        if (C0128.m1803() < 0) {
            return "";
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۤۦ  reason: not valid java name and contains not printable characters */
    public static void m2058(Object obj) {
        if (C0127.m1700() >= 0) {
            ((Exception) obj).printStackTrace();
        }
    }

    /* renamed from: ۣ۟ۧۥۣ  reason: not valid java name and contains not printable characters */
    public static Looper m2059() {
        if (m2080() >= 0) {
            return Looper.getMainLooper();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۤۢ  reason: not valid java name and contains not printable characters */
    public static int m2060(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((ActivityManager.RunningAppProcessInfo) obj).importance;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۡ۟  reason: not valid java name and contains not printable characters */
    public static float m2061(Object obj) {
        if (m2080() >= 0) {
            return ((DisplayMetrics) obj).density;
        }
        return 0.0f;
    }

    /* renamed from: ۟ۤۥۤ  reason: not valid java name and contains not printable characters */
    public static Prefs m2062(Object obj) {
        if (C0128.m1803() <= 0) {
            return Prefs.with((Context) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۠  reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m2063() {
        if (C0129.m1842() >= 0) {
            return CrashHandler.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۥ۠  reason: not valid java name and contains not printable characters */
    public static ColorStateList m2064(int i) {
        if (C0128.m1803() < 0) {
            return ColorStateList.valueOf(i);
        }
        return null;
    }

    /* renamed from: ۟ۥۢۡۡ  reason: not valid java name and contains not printable characters */
    public static long m2065(Object obj) {
        if (C0129.m1842() >= 0) {
            return GG.sizeApp((Context) obj);
        }
        return 0;
    }

    /* renamed from: ۟ۥۢۧۢ  reason: not valid java name and contains not printable characters */
    public static void m2066(Object obj, boolean z) {
        if (C0129.m1842() > 0) {
            ((Switch) obj).setChecked(z);
        }
    }

    /* renamed from: ۟ۥۣۤۡ  reason: not valid java name and contains not printable characters */
    public static Drawable m2067(Object obj) {
        if (m2080() >= 0) {
            return ((Switch) obj).getThumbDrawable();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۦۤ  reason: not valid java name and contains not printable characters */
    public static void m2068(Object obj, Object obj2) {
        if (m2080() > 0) {
            ((Throwable) obj).printStackTrace((PrintWriter) obj2);
        }
    }

    /* renamed from: ۟ۥۦۨۢ  reason: not valid java name and contains not printable characters */
    public static boolean m2069(Object obj) {
        if (C0128.m1803() < 0) {
            return ((CheckBox) obj).isChecked();
        }
        return false;
    }

    /* renamed from: ۟ۥۨۦ  reason: not valid java name and contains not printable characters */
    public static String[] m2070(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            return ((String) obj).split((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۨۤۡ  reason: not valid java name and contains not printable characters */
    public static Set m2071(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            return ((Preferences) obj).getOrderedStringSet((String) obj2, (Set) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧ۟ۡ  reason: not valid java name and contains not printable characters */
    public static void m2072(Object obj) {
        if (C0127.m1700() > 0) {
            ((InterruptedException) obj).printStackTrace();
        }
    }

    /* renamed from: ۟ۧۡۨۡ  reason: not valid java name and contains not printable characters */
    public static long m2073(Object obj) {
        if (C0129.m1842() > 0) {
            return ((PackageInfo) obj).getLongVersionCode();
        }
        return 0;
    }

    /* renamed from: ۟ۨ۠ۦ  reason: not valid java name and contains not printable characters */
    public static void m2074(Object obj, int i, int i2, int i3, int i4) {
        if (C0127.m1700() >= 0) {
            ((WebView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۠ۢۡ۠  reason: not valid java name and contains not printable characters */
    public static String m2075(String str) {
        String str2 = str;
        String r3 = m2057();
        String r2 = m2057();
        for (int i = 0; i < 15; i++) {
            r3 = C0127.m1785(C0129.m1848(C0129.m1848(new StringBuffer(), r3), C0127.m1723(i)));
            r2 = C0127.m1785(C0127.m1714(C0129.m1848(new StringBuffer(), r2), ((int) (C0129.m1808() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0130.m1964(str2) / 2);
        for (int i2 = 0; i2 < C0130.m1964(str2); i2 += 2) {
            C0130.m1965(byteArrayOutputStream, (m2056(r3, C0130.m1956(str2, i2)) << 4) | m2056(r3, C0130.m1956(str2, i2 + 1)));
        }
        byte[] r0 = C0129.m1881(byteArrayOutputStream);
        int length = r0.length;
        int r4 = C0130.m1964(r2);
        while (length > 0) {
            r0[-1] = (byte) (r0[-1] ^ C0130.m1956(r2, -1 % r4));
        }
        for (int i3 = 0; i3 < r0.length; i3 = C0130.m1964(m2057()) + 1) {
        }
        return new String(r0);
    }

    /* renamed from: ۠ۦ۠ۨ  reason: not valid java name and contains not printable characters */
    public static long m2076(Object obj, Object obj2, long j) {
        if (m2080() > 0) {
            return ((SharedPreferences) obj).getLong((String) obj2, j);
        }
        return 0;
    }

    /* renamed from: ۠ۦۣۧ  reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m2077(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            return ((AlertDialog.Builder) obj).setTitle((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۡۡۤ  reason: not valid java name and contains not printable characters */
    public static Object m2078(Object obj, Object obj2, Object obj3) {
        if (m2080() > 0) {
            return ((Method) obj).invoke(obj2, (Object[]) obj3);
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۤ  reason: not valid java name and contains not printable characters */
    public static String m2079(Object obj) {
        if (C0127.m1700() >= 0) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: ۣۡۥۣ  reason: not valid java name and contains not printable characters */
    public static int m2080() {
        return 1755625 ^ C0129.m1832((Object) "ۨۥۦ");
    }

    /* renamed from: ۡۤۦۥ  reason: not valid java name and contains not printable characters */
    public static String m2081(Object obj) {
        if (C0128.m1803() <= 0) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: ۡۥۨۡ  reason: not valid java name and contains not printable characters */
    public static Drawable m2082(Object obj) {
        if (m2080() >= 0) {
            return ((SeekBar) obj).getProgressDrawable();
        }
        return null;
    }

    /* renamed from: ۢۡ۠ۧ  reason: not valid java name and contains not printable characters */
    public static Enumeration m2083() {
        if (C0128.m1803() < 0) {
            return NetworkInterface.getNetworkInterfaces();
        }
        return null;
    }

    /* renamed from: ۢۡۤۡ  reason: not valid java name and contains not printable characters */
    public static void m2084(Object obj, int i) {
        if (C0127.m1700() > 0) {
            ((TextView) obj).setGravity(i);
        }
    }

    /* renamed from: ۣۢۡۤ  reason: not valid java name and contains not printable characters */
    public static void m2085(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            ((EditText) obj).setOnFocusChangeListener((View.OnFocusChangeListener) obj2);
        }
    }

    /* renamed from: ۢۡۦۤ  reason: not valid java name and contains not printable characters */
    public static void m2086(Object obj, Object obj2) {
        if (m2080() >= 0) {
            ((TextView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۢۢۥۧ  reason: not valid java name and contains not printable characters */
    public static void m2087(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            ((CheckBox) obj).setButtonTintList((ColorStateList) obj2);
        }
    }

    /* renamed from: ۣۢۢۢ  reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService m2088(int i) {
        if (m2080() >= 0) {
            return Executors.newScheduledThreadPool(i);
        }
        return null;
    }

    /* renamed from: ۢۤ۠ۦ  reason: not valid java name and contains not printable characters */
    public static boolean m2089(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((EditText) obj).requestFocus();
        }
        return false;
    }

    /* renamed from: ۢۧۡۧ  reason: not valid java name and contains not printable characters */
    public static DisplayMetrics m2090(Object obj) {
        if (m2080() > 0) {
            return ((Resources) obj).getDisplayMetrics();
        }
        return null;
    }

    /* renamed from: ۢۧۢۧ  reason: not valid java name and contains not printable characters */
    public static String m2091(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Menu) obj).l;
        }
        return null;
    }

    /* renamed from: ۢۧۥۧ  reason: not valid java name and contains not printable characters */
    public static void m2092(Object obj, int i) {
        if (m2080() > 0) {
            ((ScrollView) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۣۣۤۧ  reason: not valid java name and contains not printable characters */
    public static String m2093(Object obj, Object obj2) {
        if (m2080() > 0) {
            return String.format((String) obj, (Object[]) obj2);
        }
        return null;
    }

    /* renamed from: ۣۥۣۥ  reason: not valid java name and contains not printable characters */
    public static void m2094(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            ((Activity) obj).runOnUiThread((Runnable) obj2);
        }
    }

    /* JADX WARNING: type inference failed for: r57v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ۣۣۧۥ  reason: not valid java name and contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2095(short[] r54, int r55, int r56, int r57) {
        /*
            r6 = r57
            r5 = r56
            r4 = r55
            r3 = r54
            char[] r1 = new char[r5]
            r0 = 0
        L_0x000b:
            if (r0 >= r5) goto L_0x0018
            int r2 = r4 + r0
            short r2 = r3[r2]
            r2 = r2 ^ r6
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0018:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.support.C0131.m2095(short[], int, int, int):java.lang.String");
    }

    /* renamed from: ۣۨ  reason: not valid java name and contains not printable characters */
    public static String m2096(Object obj, Object obj2, Object obj3) {
        if (m2080() >= 0) {
            return ((SharedPreferences) obj).getString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۤۡۨ  reason: not valid java name and contains not printable characters */
    public static long m2097(double d) {
        if (C0128.m1803() <= 0) {
            return Double.doubleToRawLongBits(d);
        }
        return 0;
    }

    /* renamed from: ۣۤۢۧ  reason: not valid java name and contains not printable characters */
    public static File m2098(Object obj, Object obj2) {
        if (m2080() >= 0) {
            return ((Context) obj).getExternalFilesDir((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۤۥۧ  reason: not valid java name and contains not printable characters */
    public static void m2099(Object obj, Object obj2) {
        if (m2080() > 0) {
            ((Throwable) obj).addSuppressed((Throwable) obj2);
        }
    }

    /* renamed from: ۥ۟ۨ۠  reason: contains not printable characters */
    public static boolean m2100(Object obj) {
        if (C0127.m1700() > 0) {
            return ((File) obj).createNewFile();
        }
        return false;
    }

    /* renamed from: ۥۣۢ۟  reason: contains not printable characters */
    public static Preferences m2101(Object obj) {
        if (m2080() >= 0) {
            return Preferences.with((Context) obj);
        }
        return null;
    }

    /* renamed from: ۥۣۡ۠  reason: contains not printable characters */
    public static int m2102() {
        if (C0129.m1842() > 0) {
            return Build.VERSION.SDK_INT;
        }
        return 0;
    }

    /* renamed from: ۥۥۣۤ  reason: contains not printable characters */
    public static void m2103(Object obj, int i, int i2) {
        if (C0128.m1803() <= 0) {
            ((ScrollView) obj).scrollTo(i, i2);
        }
    }

    /* renamed from: ۥۥۧ  reason: contains not printable characters */
    public static void m2104(Object obj, Object obj2) {
        if (m2080() > 0) {
            ((ScrollView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۥۦ۟  reason: contains not printable characters */
    public static void m2105(Object obj, Object obj2) {
        if (C0129.m1842() > 0) {
            ((WebView) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* renamed from: ۥۦۣۥ  reason: contains not printable characters */
    public static boolean m2106() {
        if (C0128.m1803() < 0) {
            return Main.loadd;
        }
        return false;
    }

    /* renamed from: ۥۣۨۢ  reason: contains not printable characters */
    public static boolean m2107(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Iterator) obj).hasNext();
        }
        return false;
    }

    /* renamed from: ۦۣۡۢ  reason: contains not printable characters */
    public static void m2108(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((EditText) obj).setKeyListener((KeyListener) obj2);
        }
    }

    /* renamed from: ۦۦۣ  reason: contains not printable characters */
    public static String m2109(Object obj) {
        if (C0129.m1842() > 0) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    /* renamed from: ۦۨ  reason: contains not printable characters */
    public static File m2110(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Context) obj).getCacheDir();
        }
        return null;
    }

    /* renamed from: ۦۨۡ۠  reason: contains not printable characters */
    public static ArrayList m2111(Object obj) {
        if (C0127.m1700() >= 0) {
            return Collections.list((Enumeration) obj);
        }
        return null;
    }

    /* renamed from: ۣۧۨ۠  reason: not valid java name and contains not printable characters */
    public static void m2112(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((TextView) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* renamed from: ۧۦ۟ۥ  reason: not valid java name and contains not printable characters */
    public static void m2113(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((IntentFilter) obj).addAction((String) obj2);
        }
    }

    /* renamed from: ۧۧۢۦ  reason: not valid java name and contains not printable characters */
    public static boolean m2114(Object obj, Object obj2, boolean z) {
        if (m2080() >= 0) {
            return ((SharedPreferences) obj).getBoolean((String) obj2, z);
        }
        return false;
    }

    /* renamed from: ۨ۟ۥۧ  reason: not valid java name and contains not printable characters */
    public static ScheduledFuture m2115(Object obj, Object obj2, long j, long j2, Object obj3) {
        if (C0128.m1803() < 0) {
            return ((ScheduledExecutorService) obj).scheduleAtFixedRate((Runnable) obj2, j, j2, (TimeUnit) obj3);
        }
        return null;
    }

    /* renamed from: ۨ۠ۧۤ  reason: not valid java name and contains not printable characters */
    public static String m2116(Object obj) {
        if (C0128.m1803() < 0) {
            return ((ApplicationInfo) obj).publicSourceDir;
        }
        return null;
    }

    /* renamed from: ۨۢۤۢ  reason: not valid java name and contains not printable characters */
    public static boolean m2117(Object obj, int i, boolean z) {
        if (C0127.m1700() > 0) {
            return Preferences.loadPrefBool((String) obj, i, z);
        }
        return false;
    }

    /* renamed from: ۨۤۡ  reason: not valid java name and contains not printable characters */
    public static void m2118(Object obj) {
        if (C0129.m1842() >= 0) {
            ((BadPaddingException) obj).printStackTrace();
        }
    }

    /* renamed from: ۣۨۤۨ  reason: not valid java name and contains not printable characters */
    public static String m2119(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            return ((Prefs) obj).read((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨۤۤۥ  reason: not valid java name and contains not printable characters */
    public static Uri m2120(Object obj) {
        if (C0127.m1700() >= 0) {
            return Uri.parse((String) obj);
        }
        return null;
    }
}
