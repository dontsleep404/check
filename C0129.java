package com.android.support;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Proxy;
import android.os.Build;
import android.os.Process;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;

/* renamed from: com.android.support.۟ۦ۟ۥۤ  reason: contains not printable characters */
public class C0129 {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f58short = {1744, 2164};

    /* renamed from: ۠ۨۦ۟  reason: not valid java name and contains not printable characters */
    public static int f59 = 20;

    /* renamed from: ۟۟۟ۢۨ  reason: not valid java name and contains not printable characters */
    public static ClassLoader m1806(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Context) obj).getClassLoader();
        }
        return null;
    }

    /* renamed from: ۣ۟۟۟ۧ  reason: not valid java name and contains not printable characters */
    public static String m1807() {
        if (C0127.m1700() >= 0) {
            return Build.VERSION.RELEASE;
        }
        return null;
    }

    /* renamed from: ۟۟ۡ۠ۤ  reason: not valid java name and contains not printable characters */
    public static double m1808() {
        if (C0127.m1700() >= 0) {
            return Math.random();
        }
        return 0.0d;
    }

    /* renamed from: ۟۟ۡۦۤ  reason: not valid java name and contains not printable characters */
    public static int m1809(Object obj, int i) {
        if (C0128.m1803() < 0) {
            return Preferences.loadPrefInt((String) obj, i);
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۤ۠  reason: not valid java name and contains not printable characters */
    public static void m1810(Object obj, float f) {
        if (C0131.m2080() > 0) {
            ((RelativeLayout) obj).setAlpha(f);
        }
    }

    /* renamed from: ۟۠ۦۦۦ  reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m1811(Object obj) {
        if (m1842() > 0) {
            return ((LinearLayout) obj).getLayoutParams();
        }
        return null;
    }

    /* renamed from: ۟۠ۨ۠ۦ  reason: not valid java name and contains not printable characters */
    public static Context m1812(Object obj) {
        if (m1842() > 0) {
            return ((View) obj).getContext();
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤۧ  reason: not valid java name and contains not printable characters */
    public static int m1813(Object obj, Object obj2, int i) {
        if (C0128.m1803() <= 0) {
            return ((SharedPreferences) obj).getInt((String) obj2, i);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡ۠ۧ  reason: not valid java name and contains not printable characters */
    public static void m1814(int i) {
        if (C0131.m2080() >= 0) {
            Process.killProcess(i);
        }
    }

    /* renamed from: ۣ۟ۡۤۥ  reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m1815(Object obj, Object obj2) {
        if (m1842() > 0) {
            return ((AlertDialog.Builder) obj).setView((View) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۢۨ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1816(Object obj, Object obj2, Object obj3) {
        if (C0128.m1803() <= 0) {
            return ((SharedPreferences.Editor) obj).putString((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۦۡ  reason: not valid java name and contains not printable characters */
    public static void m1817(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((AlertDialog) obj).setMessage((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۡۧۧۨ  reason: not valid java name and contains not printable characters */
    public static int m1818(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            return ((Preferences) obj).readInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۢ۟ۦۥ  reason: not valid java name and contains not printable characters */
    public static void m1819(Object obj, Object obj2, Object obj3) {
        if (C0127.m1700() > 0) {
            ((WindowManager) obj).updateViewLayout((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* renamed from: ۣۣ۟ۢ۠  reason: not valid java name and contains not printable characters */
    public static Thread.UncaughtExceptionHandler m1820() {
        if (C0127.m1700() > 0) {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۡۡ  reason: not valid java name and contains not printable characters */
    public static void m1821(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((LinearLayout) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۟ۢۡۢۢ  reason: not valid java name and contains not printable characters */
    public static Context m1822() {
        if (m1842() >= 0) {
            return Preferences.context;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۧ۟  reason: not valid java name and contains not printable characters */
    public static int m1823() {
        if (C0131.m2080() > 0) {
            return Process.myPid();
        }
        return 0;
    }

    /* renamed from: ۟ۢۤۡۢ  reason: not valid java name and contains not printable characters */
    public static Object m1824(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Iterator) obj).next();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۨ  reason: not valid java name and contains not printable characters */
    public static String m1825(Object obj, int i) {
        if (C0128.m1803() <= 0) {
            return Preferences.loadPrefString((String) obj, i);
        }
        return null;
    }

    /* renamed from: ۣۣۣ۟ۥ  reason: not valid java name and contains not printable characters */
    public static String m1826(Object obj) {
        if (m1842() > 0) {
            return ((Context) obj).getPackageName();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۨۢ  reason: not valid java name and contains not printable characters */
    public static byte[] m1827(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((Signature) obj).toByteArray();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۨ۠  reason: not valid java name and contains not printable characters */
    public static double m1828(long j) {
        if (m1842() > 0) {
            return Double.longBitsToDouble(j);
        }
        return 0.0d;
    }

    /* renamed from: ۣ۟ۧۢۧ  reason: not valid java name and contains not printable characters */
    public static String m1829(Object obj, Object obj2) {
        if (m1842() > 0) {
            return ((Preferences) obj).readString((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟۟ۢ  reason: not valid java name and contains not printable characters */
    public static void m1830(Object obj) {
        if (C0131.m2080() > 0) {
            ((AlertDialog) obj).show();
        }
    }

    /* renamed from: ۟ۤ۟ۧۧ  reason: not valid java name and contains not printable characters */
    public static int m1831(Object obj) {
        if (C0131.m2080() >= 0) {
            return Proxy.getPort((Context) obj);
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟ۨۤ  reason: not valid java name and contains not printable characters */
    public static int m1832(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۤ۟ۨۤ  reason: not valid java name and contains not printable characters */
    public static Class<?> m1833(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX WARNING: type inference failed for: r57v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ۟ۤ۟ۨۤ  reason: not valid java name and contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1834(short[] r54, int r55, int r56, int r57) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.support.C0129.m1834(short[], int, int, int):java.lang.String");
    }

    /* renamed from: ۟ۤ۠ۦۦ  reason: not valid java name and contains not printable characters */
    public static void m1835(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((Switch) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۤۥ۠ۧ  reason: not valid java name and contains not printable characters */
    public static Cipher m1836(Object obj) {
        if (C0131.m2080() > 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۤۥۤ۠  reason: not valid java name and contains not printable characters */
    public static short[] m1837() {
        if (m1842() >= 0) {
            return f58short;
        }
        return null;
    }

    /* renamed from: ۟ۥۢۢ۟  reason: not valid java name and contains not printable characters */
    public static boolean m1838(Object obj, Object obj2, boolean z) {
        if (m1842() >= 0) {
            return ((Preferences) obj).readBoolean((String) obj2, z);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۣۡ  reason: not valid java name and contains not printable characters */
    public static void m1839(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            ((SeekBar) obj).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) obj2);
        }
    }

    /* renamed from: ۟ۥۧۡ۟  reason: not valid java name and contains not printable characters */
    public static float m1840(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((MotionEvent) obj).getRawY();
        }
        return 0.0f;
    }

    /* renamed from: ۟ۦ۟۠ۡ  reason: not valid java name and contains not printable characters */
    public static void m1841(Object obj) {
        if (C0127.m1700() > 0) {
            ((FileOutputStream) obj).close();
        }
    }

    /* renamed from: ۟ۦۣ۠ۡ  reason: not valid java name and contains not printable characters */
    public static int m1842() {
        return 1755504 ^ m1832((Object) "ۣۨۧ");
    }

    /* renamed from: ۟ۦۣۤۤ  reason: not valid java name and contains not printable characters */
    public static StringBuilder m1843(Object obj, long j) {
        if (C0128.m1803() < 0) {
            return ((StringBuilder) obj).append(j);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۡۥ  reason: not valid java name and contains not printable characters */
    public static void m1844(Object obj, int i) {
        if (C0131.m2080() >= 0) {
            ((RelativeLayout) obj).setVisibility(i);
        }
    }

    /* renamed from: ۟ۦۥۦ۠  reason: not valid java name and contains not printable characters */
    public static boolean m1845(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((Preferences) obj).contains((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۣۧۧ  reason: not valid java name and contains not printable characters */
    public static float m1846(int i, float f, Object obj) {
        if (C0127.m1700() >= 0) {
            return TypedValue.applyDimension(i, f, (DisplayMetrics) obj);
        }
        return 0.0f;
    }

    /* renamed from: ۟ۧ۟ۤۦ  reason: not valid java name and contains not printable characters */
    public static void m1847(Object obj, float f) {
        if (C0127.m1700() >= 0) {
            ((TextView) obj).setTextSize(f);
        }
    }

    /* renamed from: ۟ۧ۠ۧۢ  reason: not valid java name and contains not printable characters */
    public static StringBuffer m1848(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            return ((StringBuffer) obj).append((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۢۥ۟  reason: not valid java name and contains not printable characters */
    public static String m1849(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Throwable) obj).getMessage();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۡ  reason: not valid java name and contains not printable characters */
    public static byte[] m1850(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            return ((String) obj).getBytes((Charset) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۤۤ  reason: not valid java name and contains not printable characters */
    public static void m1851(Object obj, int i) {
        if (C0127.m1700() > 0) {
            ((Button) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۟ۧۥ۠  reason: not valid java name and contains not printable characters */
    public static ImageView.ScaleType m1852() {
        if (C0131.m2080() >= 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۨ  reason: not valid java name and contains not printable characters */
    public static void m1853(Object obj, Object obj2, Object obj3) {
        if (C0131.m2080() > 0) {
            ((Preferences) obj).putOrderedStringSet((String) obj2, (Set) obj3);
        }
    }

    /* renamed from: ۠۠ۦۤ  reason: not valid java name and contains not printable characters */
    public static void m1854(Object obj, int i) {
        if (C0127.m1700() > 0) {
            ((LinearLayout) obj).setGravity(i);
        }
    }

    /* renamed from: ۣ۠ۥۢ  reason: not valid java name and contains not printable characters */
    public static String m1855(Object obj, Object obj2, Object obj3) {
        if (C0131.m2080() > 0) {
            return ((String) obj).replaceFirst((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧۤ  reason: not valid java name and contains not printable characters */
    public static void m1856(int i) {
        if (C0128.m1803() <= 0) {
            System.exit(i);
        }
    }

    /* renamed from: ۠ۤۡۡ  reason: not valid java name and contains not printable characters */
    public static boolean m1857() {
        if (m1842() >= 0) {
            return Preferences.loadPref;
        }
        return false;
    }

    /* renamed from: ۣ۠ۤۧ  reason: not valid java name and contains not printable characters */
    public static boolean m1858(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            return ((SharedPreferences) obj).contains((String) obj2);
        }
        return false;
    }

    /* renamed from: ۠ۦۥۤ  reason: not valid java name and contains not printable characters */
    public static long m1859(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((File) obj).length();
        }
        return 0;
    }

    /* renamed from: ۡ۠۟ۧ  reason: not valid java name and contains not printable characters */
    public static void m1860(Object obj, Object obj2) {
        if (m1842() >= 0) {
            ((RadioButton) obj).setButtonTintList((ColorStateList) obj2);
        }
    }

    /* renamed from: ۡۡۢۤ  reason: not valid java name and contains not printable characters */
    public static void m1861(Object obj) {
        if (m1842() > 0) {
            ((Menu) obj).SetWindowManagerActivity();
        }
    }

    /* renamed from: ۣۣۡ۠  reason: not valid java name and contains not printable characters */
    public static boolean m1862(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            return obj.equals(obj2);
        }
        return false;
    }

    /* renamed from: ۡۦ۟  reason: not valid java name and contains not printable characters */
    public static AlertDialog m1863(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((AlertDialog.Builder) obj).show();
        }
        return null;
    }

    /* renamed from: ۡۨ۟ۧ  reason: not valid java name and contains not printable characters */
    public static Toast m1864(Object obj, Object obj2, int i) {
        if (C0131.m2080() >= 0) {
            return Toast.makeText((Context) obj, (CharSequence) obj2, i);
        }
        return null;
    }

    /* renamed from: ۢۢۨ۟  reason: not valid java name and contains not printable characters */
    public static Class m1865(Object obj) {
        if (m1842() > 0) {
            return Class.forName((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۢۨ  reason: not valid java name and contains not printable characters */
    public static void m1866(Object obj, Object obj2) {
        if (m1842() >= 0) {
            ((FrameLayout) obj).removeView((View) obj2);
        }
    }

    /* renamed from: ۢۧۦ۟  reason: not valid java name and contains not printable characters */
    public static boolean m1867(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((String) obj).contains((CharSequence) obj2);
        }
        return false;
    }

    /* renamed from: ۣۢۨ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1868(Object obj, Object obj2, float f) {
        if (C0131.m2080() >= 0) {
            return ((SharedPreferences.Editor) obj).putFloat((String) obj2, f);
        }
        return null;
    }

    /* renamed from: ۣۢۨۨ  reason: not valid java name and contains not printable characters */
    public static Drawable m1869(Object obj) {
        if (m1842() >= 0) {
            return ((Switch) obj).getTrackDrawable();
        }
        return null;
    }

    /* renamed from: ۢۨۤۤ  reason: not valid java name and contains not printable characters */
    public static WebSettings m1870(Object obj) {
        if (C0128.m1803() < 0) {
            return ((WebView) obj).getSettings();
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۦ  reason: not valid java name and contains not printable characters */
    public static String m1871(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((PackageItemInfo) obj).packageName;
        }
        return null;
    }

    /* renamed from: ۣ۠ۥۡ  reason: not valid java name and contains not printable characters */
    public static long m1872(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((Prefs) obj).readLong((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣۡ۟ۧ  reason: not valid java name and contains not printable characters */
    public static void m1873(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((IntentFilter) obj).addDataScheme((String) obj2);
        }
    }

    /* renamed from: ۣۡۡۡ  reason: not valid java name and contains not printable characters */
    public static String m1874(Object obj) {
        if (C0128.m1803() <= 0) {
            return GG.sign((Context) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۤۨ  reason: not valid java name and contains not printable characters */
    public static void m1875(Object obj, int i) {
        if (m1842() > 0) {
            ((LinearLayout) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۣۤۢۨ  reason: not valid java name and contains not printable characters */
    public static void m1876(Object obj, Object obj2, long j) {
        if (m1842() > 0) {
            ((Preferences) obj).writeLong((String) obj2, j);
        }
    }

    /* renamed from: ۣۣۤۢ  reason: not valid java name and contains not printable characters */
    public static Signature[] m1877(Object obj) {
        if (C0128.m1803() < 0) {
            return ((PackageInfo) obj).signatures;
        }
        return null;
    }

    /* renamed from: ۣۦۡۦ  reason: not valid java name and contains not printable characters */
    public static int m1878(Object obj) {
        if (C0128.m1803() < 0) {
            return ((PackageInfo) obj).versionCode;
        }
        return 0;
    }

    /* renamed from: ۤ۟ۢۢ  reason: not valid java name and contains not printable characters */
    public static String m1879(Object obj) {
        if (C0131.m2080() >= 0) {
            return System.getProperty((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۤۦ۠  reason: not valid java name and contains not printable characters */
    public static void m1880(Object obj, int i, int i2) {
        if (C0127.m1700() >= 0) {
            ((GradientDrawable) obj).setStroke(i, i2);
        }
    }

    /* renamed from: ۤۥ  reason: not valid java name and contains not printable characters */
    public static byte[] m1881(Object obj) {
        if (m1842() >= 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* renamed from: ۤۥۨۢ  reason: not valid java name and contains not printable characters */
    public static void m1882(Object obj, boolean z) {
        if (m1842() > 0) {
            ((EditText) obj).setFocusable(z);
        }
    }

    /* renamed from: ۤۧۡ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1883(Object obj, Object obj2, boolean z) {
        if (m1842() > 0) {
            return ((SharedPreferences.Editor) obj).putBoolean((String) obj2, z);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r57v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ۤۧۨ  reason: not valid java name and contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1884(short[] r54, int r55, int r56, int r57) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.support.C0129.m1884(short[], int, int, int):java.lang.String");
    }

    /* renamed from: ۤۧۨۡ  reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m1885(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((PackageInfo) obj).applicationInfo;
        }
        return null;
    }

    /* renamed from: ۤۨۤ  reason: not valid java name and contains not printable characters */
    public static String m1886(String str) {
        String str2 = str;
        String r3 = C0131.m2057();
        String r2 = C0131.m2057();
        for (int i = 0; i < 15; i++) {
            r3 = C0127.m1785(m1848(m1848(new StringBuffer(), r3), C0127.m1723(i)));
            r2 = C0127.m1785(C0127.m1714(m1848(new StringBuffer(), r2), ((int) (m1808() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0130.m1964(str2) / 2);
        for (int i2 = 0; i2 < C0130.m1964(str2); i2 += 2) {
            C0130.m1965(byteArrayOutputStream, (C0131.m2056(r3, C0130.m1956(str2, i2)) << 4) | C0131.m2056(r3, C0130.m1956(str2, i2 + 1)));
        }
        byte[] r32 = m1881(byteArrayOutputStream);
        String r0 = C0127.m1795(m1837(), 0, 1, 1713);
        while (C0130.m1964(r0) > 0) {
            r0 = C0131.m2057();
            if (C0130.m1964(r0) == 0) {
                r0 = C0130.m1942(m1837(), 1, 1, 2069);
            }
        }
        int r4 = C0130.m1964(r0);
        int r5 = C0130.m1964(r2);
        for (int i3 = 0; i3 < r4; i3++) {
            r32[i3] = (byte) (r32[i3] ^ C0130.m1956(r2, i3 % r5));
        }
        for (int i4 = 0; i4 < r32.length; i4 = C0130.m1964(C0131.m2057()) + 1) {
        }
        return new String(r32);
    }

    /* renamed from: ۥۣ۟ۧ  reason: contains not printable characters */
    public static int m1887(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((WindowManager.LayoutParams) obj).x;
        }
        return 0;
    }

    /* renamed from: ۥۡ۟ۧ  reason: contains not printable characters */
    public static File m1888(Object obj) {
        if (C0127.m1700() > 0) {
            return ((File) obj).getParentFile();
        }
        return null;
    }

    /* renamed from: ۥۢ۠ۧ  reason: contains not printable characters */
    public static Window m1889(Object obj) {
        if (m1842() >= 0) {
            return ((AlertDialog) obj).getWindow();
        }
        return null;
    }

    /* renamed from: ۥۣۢ۠  reason: contains not printable characters */
    public static StringBuilder m1890(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            return ((StringBuilder) obj).append((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۡ۟  reason: contains not printable characters */
    public static Typeface m1891() {
        if (C0131.m2080() >= 0) {
            return Typeface.DEFAULT_BOLD;
        }
        return null;
    }

    /* renamed from: ۥۣۨۤ  reason: contains not printable characters */
    public static void m1892(Object obj, int i) {
        if (C0131.m2080() > 0) {
            ((RadioButton) obj).setTextColor(i);
        }
    }

    /* renamed from: ۥۥ۟ۡ  reason: contains not printable characters */
    public static Intent m1893(Object obj, Object obj2, Object obj3) {
        if (m1842() >= 0) {
            return ((Context) obj).registerReceiver((BroadcastReceiver) obj2, (IntentFilter) obj3);
        }
        return null;
    }

    /* renamed from: ۥۥۧۢ  reason: contains not printable characters */
    public static void m1894(Object obj) {
        if (C0127.m1700() >= 0) {
            System.loadLibrary((String) obj);
        }
    }

    /* renamed from: ۦۣۡۨ  reason: contains not printable characters */
    public static void m1895(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            ((WindowManager) obj).removeView((View) obj2);
        }
    }

    /* renamed from: ۦۡۧۤ  reason: contains not printable characters */
    public static int m1896(Object obj) {
        if (C0127.m1700() > 0) {
            return ((WindowManager.LayoutParams) obj).y;
        }
        return 0;
    }

    /* renamed from: ۦۢۥۡ  reason: contains not printable characters */
    public static Charset m1897() {
        if (C0131.m2080() >= 0) {
            return StandardCharsets.UTF_8;
        }
        return null;
    }

    /* renamed from: ۦۤۡ  reason: contains not printable characters */
    public static void m1898(Object obj, int i, int i2, int i3, int i4) {
        if (m1842() > 0) {
            ((SeekBar) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۧۡۧ۟  reason: not valid java name and contains not printable characters */
    public static void m1899(Object obj, float f) {
        if (m1842() >= 0) {
            ((GradientDrawable) obj).setCornerRadius(f);
        }
    }

    /* renamed from: ۧۤۥۢ  reason: not valid java name and contains not printable characters */
    public static void m1900(Object obj) {
        if (C0127.m1700() > 0) {
            ((Menu) obj).onDestroy();
        }
    }

    /* renamed from: ۧۥ۟ۡ  reason: not valid java name and contains not printable characters */
    public static void m1901(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((ClipboardManager) obj).setPrimaryClip((ClipData) obj2);
        }
    }

    /* renamed from: ۧۦۦۡ  reason: not valid java name and contains not printable characters */
    public static boolean m1902(Object obj, Object obj2, boolean z) {
        if (C0128.m1803() < 0) {
            return ((Prefs) obj).readBoolean((String) obj2, z);
        }
        return false;
    }

    /* renamed from: ۣۧۨ۠  reason: not valid java name and contains not printable characters */
    public static String m1903(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Intent) obj).getAction();
        }
        return null;
    }

    /* renamed from: ۨۢۧ۠  reason: not valid java name and contains not printable characters */
    public static Class m1904(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((DexClassLoader) obj).loadClass((String) obj2);
        }
        return null;
    }
}
