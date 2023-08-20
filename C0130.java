package com.android.support;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* renamed from: com.android.support.ۤ۟۠ۦ  reason: contains not printable characters */
public class C0130 {

    /* renamed from: ۟ۦۣۤۡ  reason: not valid java name and contains not printable characters */
    public static boolean f60;

    /* renamed from: ۟۟ۡۨۢ  reason: not valid java name and contains not printable characters */
    public static PrintStream m1905() {
        if (C0128.m1803() <= 0) {
            return System.out;
        }
        return null;
    }

    /* renamed from: ۟۟ۢۢ  reason: not valid java name and contains not printable characters */
    public static void m1906(Object obj, boolean z) {
        if (C0127.m1700() > 0) {
            ((TextView) obj).setSelected(z);
        }
    }

    /* renamed from: ۟۟ۦۧۨ  reason: not valid java name and contains not printable characters */
    public static void m1907(Object obj, int i, Object obj2, int i2, boolean z, Object obj3) {
        if (C0131.m2080() >= 0) {
            Preferences.Changes((Context) obj, i, (String) obj2, i2, z, (String) obj3);
        }
    }

    /* renamed from: ۟۟ۦۨ  reason: not valid java name and contains not printable characters */
    public static StringBuilder m1908(Object obj, int i) {
        if (C0129.m1842() > 0) {
            return ((StringBuilder) obj).append(i);
        }
        return null;
    }

    /* renamed from: ۟۠۟ۡ۠  reason: not valid java name and contains not printable characters */
    public static void m1909(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            ((Drawable) obj).setTintList((ColorStateList) obj2);
        }
    }

    /* renamed from: ۟۠۠ۧۦ  reason: not valid java name and contains not printable characters */
    public static void m1910(Object obj, boolean z) {
        if (C0131.m2080() > 0) {
            ((AlertDialog) obj).setCancelable(z);
        }
    }

    /* renamed from: ۣ۟۠ۦۢ  reason: not valid java name and contains not printable characters */
    public static void m1911(Object obj, boolean z) {
        if (C0128.m1803() <= 0) {
            ((WebSettings) obj).setAppCacheEnabled(z);
        }
    }

    /* renamed from: ۟۠ۤۧۡ  reason: not valid java name and contains not printable characters */
    public static void m1912(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            ((Button) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۟۠ۥ۟ۤ  reason: not valid java name and contains not printable characters */
    public static void m1913(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            ((ImageView) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* renamed from: ۟۠ۦۢۥ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences m1914(Object obj, Object obj2, int i) {
        if (C0127.m1700() >= 0) {
            return ((Context) obj).getSharedPreferences((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۦۡ  reason: not valid java name and contains not printable characters */
    public static byte[] m1915(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            return ((Cipher) obj).doFinal((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۨ۟ۥ  reason: not valid java name and contains not printable characters */
    public static StringBuffer m1916(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            return ((StringBuffer) obj).append(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۨۨ  reason: not valid java name and contains not printable characters */
    public static void m1917(Object obj, boolean z) {
        if (C0129.m1842() > 0) {
            ((CheckBox) obj).setChecked(z);
        }
    }

    /* renamed from: ۟ۡۢۨۥ  reason: not valid java name and contains not printable characters */
    public static String m1918(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((String) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۡۤۧ۠  reason: not valid java name and contains not printable characters */
    public static List m1919(Object obj) {
        if (C0129.m1842() > 0) {
            return ((NetworkInterface) obj).getInterfaceAddresses();
        }
        return null;
    }

    /* renamed from: ۟ۡۦۦۧ  reason: not valid java name and contains not printable characters */
    public static void m1920(Object obj, int i, int i2, int i3, int i4) {
        if (C0128.m1803() < 0) {
            ((Switch) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۟ۡۨ۟  reason: not valid java name and contains not printable characters */
    public static void m1921(Object obj, Object obj2, int i) {
        if (C0129.m1842() > 0) {
            ((Preferences) obj).writeInt((String) obj2, i);
        }
    }

    /* renamed from: ۟ۢ۟ۢۢ  reason: not valid java name and contains not printable characters */
    public static String m1922(Object obj) {
        if (C0128.m1803() < 0) {
            return ((StringBuilder) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۡۦ  reason: not valid java name and contains not printable characters */
    public static void m1923(Object obj, int i, Object obj2) {
        if (C0129.m1842() > 0) {
            Preferences.changeFeatureString((String) obj, i, (String) obj2);
        }
    }

    /* renamed from: ۣ۟ۢۢۢ  reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m1924(Object obj, Object obj2, Object obj3) {
        if (C0131.m2080() >= 0) {
            return ((AlertDialog.Builder) obj).setNegativeButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۤۤۧ  reason: not valid java name and contains not printable characters */
    public static int m1925() {
        return -1750731 ^ C0129.m1832((Object) "ۣۣۤ");
    }

    /* renamed from: ۟ۢۥ۠ۤ  reason: not valid java name and contains not printable characters */
    public static String m1926(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((NetworkInterface) obj).getName();
        }
        return null;
    }

    /* renamed from: ۟ۢۥۣۡ  reason: not valid java name and contains not printable characters */
    public static String m1927(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Editable) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۦۢۡ  reason: not valid java name and contains not printable characters */
    public static void m1928(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            ((ScrollView) obj).addView((View) obj2);
        }
    }

    /* renamed from: ۟ۢۦۢۢ  reason: not valid java name and contains not printable characters */
    public static void m1929(Object obj, Object obj2, int i) {
        if (C0131.m2080() > 0) {
            ((TextView) obj).setTypeface((Typeface) obj2, i);
        }
    }

    /* renamed from: ۟ۢۨۦۤ  reason: not valid java name and contains not printable characters */
    public static void m1930(Object obj) {
        if (C0129.m1842() >= 0) {
            GG.GG((Context) obj);
        }
    }

    /* renamed from: ۣ۟ۡ۠۠  reason: not valid java name and contains not printable characters */
    public static void m1931(Object obj) {
        if (C0129.m1842() >= 0) {
            ((Preferences) obj).clear();
        }
    }

    /* renamed from: ۣ۟ۡۢۢ  reason: not valid java name and contains not printable characters */
    public static void m1932(Object obj) {
        if (C0131.m2080() >= 0) {
            ((IllegalBlockSizeException) obj).printStackTrace();
        }
    }

    /* renamed from: ۣ۟ۢۨۡ  reason: not valid java name and contains not printable characters */
    public static void m1933(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            ((LinearLayout) obj).addView((View) obj2);
        }
    }

    /* renamed from: ۣ۟ۧ۟  reason: not valid java name and contains not printable characters */
    public static void m1934(Object obj, Object obj2, Object obj3) {
        if (C0131.m2080() > 0) {
            ((Preferences) obj).writeString((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣ۟ۧۥۢ  reason: not valid java name and contains not printable characters */
    public static List m1935(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            return ((PackageManager) obj).getInstalledApplications(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۨۨ  reason: not valid java name and contains not printable characters */
    public static void m1936(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            ((RadioButton) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* renamed from: ۣ۟ۨۨۧ  reason: not valid java name and contains not printable characters */
    public static void m1937(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            ((CheckBox) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۤۡ۠ۥ  reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m1938(Object obj) {
        if (C0127.m1700() > 0) {
            return ((WebView) obj).getLayoutParams();
        }
        return null;
    }

    /* renamed from: ۟ۤۦ۠  reason: not valid java name and contains not printable characters */
    public static void m1939(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            ((FileOutputStream) obj).write((byte[]) obj2);
        }
    }

    /* renamed from: ۟ۤۦۦۥ  reason: not valid java name and contains not printable characters */
    public static String m1940(String str) {
        String str2 = str;
        String r3 = C0131.m2057();
        String r2 = C0131.m2057();
        for (int i = 0; i < 15; i++) {
            r3 = C0127.m1785(C0129.m1848(C0129.m1848(new StringBuffer(), r3), C0127.m1723(i)));
            r2 = C0127.m1785(C0127.m1714(C0129.m1848(new StringBuffer(), r2), ((int) (C0129.m1808() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m1964(str2) / 2);
        for (int i2 = 0; i2 < m1964(str2); i2 += 2) {
            m1965(byteArrayOutputStream, (C0131.m2056(r3, m1956(str2, i2)) << 4) | C0131.m2056(r3, m1956(str2, i2 + 1)));
        }
        byte[] r32 = C0129.m1881(byteArrayOutputStream);
        int length = r32.length;
        int r5 = m1964(r2);
        for (int i3 = 0; i3 < length; i3++) {
            r32[i3] = (byte) (r32[i3] ^ m1956(r2, i3 % r5));
        }
        for (int i4 = 0; i4 < r32.length; i4 = m1964(C0131.m2057()) + 1) {
        }
        return new String(r32);
    }

    /* renamed from: ۟ۤۦۧۢ  reason: not valid java name and contains not printable characters */
    public static Uri m1941(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Intent) obj).getData();
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r57v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ۟ۥ۟ۡۤ  reason: not valid java name and contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1942(short[] r54, int r55, int r56, int r57) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.support.C0130.m1942(short[], int, int, int):java.lang.String");
    }

    /* renamed from: ۟ۥ۟ۥ۠  reason: not valid java name and contains not printable characters */
    public static boolean m1943(Object obj, Object obj2) {
        if (C0129.m1842() > 0) {
            return ((String) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۡۨ  reason: not valid java name and contains not printable characters */
    public static ClipData m1944(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ClipData.newPlainText((CharSequence) obj, (CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤۢ  reason: not valid java name and contains not printable characters */
    public static Object m1945(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Enumeration) obj).nextElement();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۧۥ  reason: not valid java name and contains not printable characters */
    public static int m1946(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Set) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۥۦ۠ۡ  reason: not valid java name and contains not printable characters */
    public static boolean m1947(Object obj) {
        if (C0128.m1803() < 0) {
            return ((File) obj).exists();
        }
        return false;
    }

    /* renamed from: ۟ۥۦۢۡ  reason: not valid java name and contains not printable characters */
    public static void m1948(Object obj, int i) {
        if (C0127.m1700() > 0) {
            ((View) obj).setVisibility(i);
        }
    }

    /* renamed from: ۟ۥۧۡۤ  reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m1949() {
        if (C0129.m1842() >= 0) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۨ۟  reason: not valid java name and contains not printable characters */
    public static boolean m1950(Object obj, int i, boolean z) {
        if (C0131.m2080() > 0) {
            return ((Preferences) obj).readBoolean(i, z);
        }
        return false;
    }

    /* renamed from: ۟ۦۡ۟ۨ  reason: not valid java name and contains not printable characters */
    public static void m1951(Object obj, int i, int i2, int i3, int i4) {
        if (C0129.m1842() > 0) {
            ((TextView) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۟ۦۥۣۥ  reason: not valid java name and contains not printable characters */
    public static void m1952(Object obj) {
        if (C0127.m1700() >= 0) {
            ((InvalidKeyException) obj).printStackTrace();
        }
    }

    /* renamed from: ۟ۦۥۧۥ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1953(Object obj, Object obj2, long j) {
        if (C0127.m1700() >= 0) {
            return ((SharedPreferences.Editor) obj).putLong((String) obj2, j);
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۠ۨ  reason: not valid java name and contains not printable characters */
    public static void m1954(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            ((SeekBar) obj).setMin(i);
        }
    }

    /* renamed from: ۟ۦۨۦۦ  reason: not valid java name and contains not printable characters */
    public static void m1955(Object obj, int i, int i2, int i3, int i4) {
        if (C0129.m1842() > 0) {
            ((LinearLayout.LayoutParams) obj).setMargins(i, i2, i3, i4);
        }
    }

    /* renamed from: ۟ۧ۟ۡۢ  reason: not valid java name and contains not printable characters */
    public static char m1956(Object obj, int i) {
        if (C0129.m1842() > 0) {
            return ((String) obj).charAt(i);
        }
        return 0;
    }

    /* renamed from: ۟ۧۡۦۢ  reason: not valid java name and contains not printable characters */
    public static char[] m1957(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((String) obj).toCharArray();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۡ  reason: not valid java name and contains not printable characters */
    public static Method m1958(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            return ((Class) obj).getMethod((String) obj2, (Class[]) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۥۣۨ  reason: not valid java name and contains not printable characters */
    public static boolean m1959(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            return ((Handler) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۧۦۨۢ  reason: not valid java name and contains not printable characters */
    public static String m1960(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Uri) obj).getSchemeSpecificPart();
        }
        return null;
    }

    /* renamed from: ۠ۤ۠ۦ  reason: not valid java name and contains not printable characters */
    public static void m1961(Object obj, int i) {
        if (C0127.m1700() > 0) {
            ((WebView) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۠ۤۢ  reason: not valid java name and contains not printable characters */
    public static void m1962(Object obj, Object obj2) {
        if (C0127.m1700() > 0) {
            ((Button) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* renamed from: ۠ۥ۠ۨ  reason: not valid java name and contains not printable characters */
    public static String m1963(Object obj) {
        if (C0128.m1803() <= 0) {
            return GG.md5((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۨۥ۟  reason: not valid java name and contains not printable characters */
    public static int m1964(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((String) obj).length();
        }
        return 0;
    }

    /* renamed from: ۠ۨۦۣ  reason: not valid java name and contains not printable characters */
    public static void m1965(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            ((ByteArrayOutputStream) obj).write(i);
        }
    }

    /* renamed from: ۣ۠ۨۨ  reason: not valid java name and contains not printable characters */
    public static void m1966(Object obj, int i) {
        if (C0131.m2080() >= 0) {
            ((TextView) obj).setMarqueeRepeatLimit(i);
        }
    }

    /* renamed from: ۡۡۧۡ  reason: not valid java name and contains not printable characters */
    public static DigitsKeyListener m1967(Object obj) {
        if (C0127.m1700() >= 0) {
            return DigitsKeyListener.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۡۤۦ  reason: not valid java name and contains not printable characters */
    public static MessageDigest m1968(Object obj) {
        if (C0131.m2080() > 0) {
            return MessageDigest.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۡۨۡ  reason: not valid java name and contains not printable characters */
    public static void m1969(Object obj) {
        if (C0127.m1700() > 0) {
            ((Menu) obj).SetWindowManagerWindowService();
        }
    }

    /* renamed from: ۡۤۥۢ  reason: not valid java name and contains not printable characters */
    public static void m1970(Object obj, int i) {
        if (C0131.m2080() >= 0) {
            ((ArrayAdapter) obj).setDropDownViewResource(i);
        }
    }

    /* renamed from: ۡۦۥ  reason: not valid java name and contains not printable characters */
    public static void m1971(Object obj, boolean z) {
        if (C0128.m1803() < 0) {
            ((TextView) obj).setSingleLine(z);
        }
    }

    /* renamed from: ۢ۠ۡۦ  reason: not valid java name and contains not printable characters */
    public static boolean m1972() {
        if (C0129.m1842() >= 0) {
            return VPN.isVpnConnected();
        }
        return false;
    }

    /* renamed from: ۣۢ۠ۧ  reason: not valid java name and contains not printable characters */
    public static Resources m1973(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((Context) obj).getResources();
        }
        return null;
    }

    /* renamed from: ۢۢ  reason: not valid java name and contains not printable characters */
    public static void m1974(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((FrameLayout) obj).setOnTouchListener((View.OnTouchListener) obj2);
        }
    }

    /* renamed from: ۣۣۢۢ  reason: not valid java name and contains not printable characters */
    public static void m1975(Object obj, int i) {
        if (C0128.m1803() < 0) {
            ((Spinner) obj).setSelection(i);
        }
    }

    /* renamed from: ۢۢۥۥ  reason: not valid java name and contains not printable characters */
    public static void m1976(Object obj, int i) {
        if (C0128.m1803() < 0) {
            ((RelativeLayout.LayoutParams) obj).addRule(i);
        }
    }

    /* renamed from: ۣۢۡۢ  reason: not valid java name and contains not printable characters */
    public static Iterator m1977(Object obj) {
        if (C0131.m2080() > 0) {
            return ((ArrayList) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۣۣۢ  reason: not valid java name and contains not printable characters */
    public static boolean m1978(Object obj) {
        if (C0129.m1842() > 0) {
            return ((File) obj).isDirectory();
        }
        return false;
    }

    /* renamed from: ۢۤۦۨ  reason: not valid java name and contains not printable characters */
    public static void m1979(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            ((Prefs) obj).write((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۢۥۡۢ  reason: not valid java name and contains not printable characters */
    public static void m1980(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((Spinner) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۢۥۧ۟  reason: not valid java name and contains not printable characters */
    public static void m1981(Object obj) {
        if (C0128.m1803() <= 0) {
            ((Launcher) obj).stopSelf();
        }
    }

    /* renamed from: ۢۧ۟ۤ  reason: not valid java name and contains not printable characters */
    public static boolean m1982(Object obj) {
        if (C0131.m2080() > 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* renamed from: ۣۢۨ۟  reason: not valid java name and contains not printable characters */
    public static long m1983(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            return ((Preferences) obj).readLong((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۢۨۥۨ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1984(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() > 0) {
            return ((SharedPreferences.Editor) obj).putStringSet((String) obj2, (Set) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟۟۠  reason: not valid java name and contains not printable characters */
    public static File m1985(Object obj, Object obj2, int i) {
        if (C0131.m2080() >= 0) {
            return ((Context) obj).getDir((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣ۠ۢۥ  reason: not valid java name and contains not printable characters */
    public static byte[] m1986(Object obj) {
        if (C0131.m2080() > 0) {
            return ((MessageDigest) obj).digest();
        }
        return null;
    }

    /* renamed from: ۣۧ۟ۡ  reason: not valid java name and contains not printable characters */
    public static String m1987(Object obj, int i) {
        if (C0127.m1700() > 0) {
            return ((Preferences) obj).readString(i);
        }
        return null;
    }

    /* renamed from: ۣۨ  reason: not valid java name and contains not printable characters */
    public static void m1988(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            ((MessageDigest) obj).update((byte[]) obj2);
        }
    }

    /* renamed from: ۣۨۧۨ  reason: not valid java name and contains not printable characters */
    public static TextUtils.TruncateAt m1989() {
        if (C0127.m1700() >= 0) {
            return TextUtils.TruncateAt.MARQUEE;
        }
        return null;
    }

    /* renamed from: ۣۤ۟ۢ  reason: not valid java name and contains not printable characters */
    public static void m1990(long j) {
        if (C0127.m1700() >= 0) {
            Thread.sleep(j);
        }
    }

    /* renamed from: ۤ۠ۢۡ  reason: not valid java name and contains not printable characters */
    public static void m1991(Object obj, int i, int i2) {
        if (C0128.m1803() < 0) {
            Preferences.changeFeatureInt((String) obj, i, i2);
        }
    }

    /* renamed from: ۣۤۦ۠  reason: not valid java name and contains not printable characters */
    public static void m1992(Object obj, int i, Object obj2) {
        if (C0129.m1842() > 0) {
            ((Preferences) obj).writeString(i, (String) obj2);
        }
    }

    /* renamed from: ۣۤۤ۟  reason: not valid java name and contains not printable characters */
    public static byte[] m1993(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            return ((MessageDigest) obj).digest((byte[]) obj2);
        }
        return null;
    }

    /* renamed from: ۤۥ۟ۧ  reason: not valid java name and contains not printable characters */
    public static ApplicationInfo m1994(Object obj, Object obj2, int i) {
        if (C0128.m1803() <= 0) {
            return ((PackageManager) obj).getApplicationInfo((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۤۥ۠ۨ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1995(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((SharedPreferences.Editor) obj).clear();
        }
        return null;
    }

    /* renamed from: ۤۦۣ۠  reason: not valid java name and contains not printable characters */
    public static String m1996(int i) {
        if (C0129.m1842() > 0) {
            return String.valueOf(i);
        }
        return null;
    }

    /* renamed from: ۤۧۧۥ  reason: not valid java name and contains not printable characters */
    public static int m1997(Object obj) {
        if (C0129.m1842() >= 0) {
            return Integer.parseInt((String) obj);
        }
        return 0;
    }

    /* renamed from: ۥ۟۟ۧ  reason: contains not printable characters */
    public static void m1998(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            ((Button) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۥۣۡ  reason: contains not printable characters */
    public static int m1999(Object obj) {
        if (C0129.m1842() > 0) {
            return ((RelativeLayout) obj).getVisibility();
        }
        return 0;
    }

    /* renamed from: ۥۥ۟ۦ  reason: contains not printable characters */
    public static List m2000(Object obj) {
        if (C0131.m2080() > 0) {
            return Arrays.asList((Object[]) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۤۦ  reason: contains not printable characters */
    public static void m2001(Object obj) {
        if (C0127.m1700() >= 0) {
            ((Toast) obj).show();
        }
    }

    /* renamed from: ۥۨۡۧ  reason: contains not printable characters */
    public static String m2002(Object obj, int i, int i2) {
        if (C0129.m1842() > 0) {
            return ((String) obj).substring(i, i2);
        }
        return null;
    }

    /* renamed from: ۦ۠ۥۨ  reason: contains not printable characters */
    public static void m2003(Object obj, int i) {
        if (C0129.m1842() > 0) {
            ((CheckBox) obj).setTextColor(i);
        }
    }

    /* renamed from: ۦۢۦۤ  reason: contains not printable characters */
    public static Intent m2004(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((Intent) obj).setData((Uri) obj2);
        }
        return null;
    }

    /* renamed from: ۦۣ۠۟  reason: contains not printable characters */
    public static void m2005(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            ((ImageView) obj).setOnClickListener((View.OnClickListener) obj2);
        }
    }

    /* renamed from: ۦۤۤۦ  reason: contains not printable characters */
    public static void m2006(Object obj) {
        if (C0129.m1842() >= 0) {
            ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo) obj);
        }
    }

    /* renamed from: ۦۥۣ۟  reason: contains not printable characters */
    public static boolean m2007(Object obj) {
        if (C0128.m1803() <= 0) {
            return VPN.isWifiProxy((Context) obj);
        }
        return false;
    }

    /* renamed from: ۦۦۡ  reason: contains not printable characters */
    public static void m2008(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((Button) obj).setOnLongClickListener((View.OnLongClickListener) obj2);
        }
    }

    /* renamed from: ۦۦۦۢ  reason: contains not printable characters */
    public static void m2009(Object obj, int i) {
        if (C0129.m1842() > 0) {
            ((SeekBar) obj).setProgress(i);
        }
    }

    /* renamed from: ۦۧۡۤ  reason: contains not printable characters */
    public static void m2010(Object obj, Object obj2) {
        if (C0127.m1700() >= 0) {
            ((ScrollView) obj).removeView((View) obj2);
        }
    }

    /* renamed from: ۦۨ۟ۡ  reason: contains not printable characters */
    public static Spanned m2011(Object obj) {
        if (C0128.m1803() < 0) {
            return Html.fromHtml((String) obj);
        }
        return null;
    }

    /* renamed from: ۧ۟۟۟  reason: not valid java name and contains not printable characters */
    public static boolean m2012() {
        if (C0127.m1700() > 0) {
            return Preferences.isExpanded;
        }
        return false;
    }

    /* renamed from: ۧ۟ۡۨ  reason: not valid java name and contains not printable characters */
    public static void m2013(Object obj, int i) {
        if (C0128.m1803() < 0) {
            ((GradientDrawable) obj).setColor(i);
        }
    }

    /* renamed from: ۧۡۨۨ  reason: not valid java name and contains not printable characters */
    public static Object m2014(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Spinner) obj).getSelectedItem();
        }
        return null;
    }

    /* renamed from: ۣۧۤ۠  reason: not valid java name and contains not printable characters */
    public static void m2015(Object obj, int i) {
        if (C0127.m1700() >= 0) {
            ((Switch) obj).setTextColor(i);
        }
    }

    /* renamed from: ۣۧۤۥ  reason: not valid java name and contains not printable characters */
    public static void m2016(Object obj, int i) {
        if (C0131.m2080() > 0) {
            ((EditText) obj).setInputType(i);
        }
    }

    /* renamed from: ۣۧۨ۟  reason: not valid java name and contains not printable characters */
    public static void m2017(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            ((LinearLayout) obj).setVerticalGravity(i);
        }
    }

    /* renamed from: ۨ۟ۤۧ  reason: not valid java name and contains not printable characters */
    public static boolean m2018(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((NetworkInterface) obj).isUp();
        }
        return false;
    }

    /* renamed from: ۨ۟ۧۦ  reason: not valid java name and contains not printable characters */
    public static void m2019(Object obj) {
        if (C0128.m1803() <= 0) {
            ((NoSuchAlgorithmException) obj).printStackTrace();
        }
    }

    /* renamed from: ۨۥۧۧ  reason: not valid java name and contains not printable characters */
    public static void m2020(Object obj) {
        if (C0129.m1842() >= 0) {
            ((MessageDigest) obj).reset();
        }
    }

    /* renamed from: ۨۦۣۧ  reason: not valid java name and contains not printable characters */
    public static void m2021(Object obj) {
        if (C0128.m1803() <= 0) {
            ((SharedPreferences.Editor) obj).apply();
        }
    }

    /* renamed from: ۨۦۦۦ  reason: not valid java name and contains not printable characters */
    public static void m2022(Object obj, int i, int i2, int i3, int i4) {
        if (C0127.m1700() >= 0) {
            ((RelativeLayout) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۣۨۨ۠  reason: not valid java name and contains not printable characters */
    public static String m2023(Object obj) {
        if (C0129.m1842() > 0) {
            return ((ApplicationInfo) obj).sourceDir;
        }
        return null;
    }
}
