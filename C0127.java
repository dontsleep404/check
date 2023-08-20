package com.android.support;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.android.support.ۣ۟ۡۧۨ  reason: contains not printable characters */
public class C0127 {

    /* renamed from: ۣۦۦۥ  reason: not valid java name and contains not printable characters */
    public static boolean f56 = true;

    /* renamed from: ۟۟۠ۧ۠  reason: not valid java name and contains not printable characters */
    public static void m1699(Object obj) {
        if (C0128.m1803() <= 0) {
            ((Menu) obj).ShowMenu();
        }
    }

    /* renamed from: ۟۟ۢۦۡ  reason: not valid java name and contains not printable characters */
    public static int m1700() {
        return 56354 ^ C0129.m1832((Object) "ۤ۟");
    }

    /* renamed from: ۟۟ۢۦۦ  reason: not valid java name and contains not printable characters */
    public static void m1701(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((Switch) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
        }
    }

    /* renamed from: ۟۟ۤۤۧ  reason: not valid java name and contains not printable characters */
    public static String m1702(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Menu) obj).key;
        }
        return null;
    }

    /* renamed from: ۟۟ۥ۟ۦ  reason: not valid java name and contains not printable characters */
    public static void m1703(Object obj, Object obj2) {
        if (m1700() > 0) {
            ((CheckBox) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
        }
    }

    /* renamed from: ۟۟ۦ۟ۥ  reason: not valid java name and contains not printable characters */
    public static float m1704(Object obj, Object obj2, float f) {
        if (C0128.m1803() < 0) {
            return ((SharedPreferences) obj).getFloat((String) obj2, f);
        }
        return 0.0f;
    }

    /* renamed from: ۟۟ۧ۟ۡ  reason: not valid java name and contains not printable characters */
    public static void m1705(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            ((Button) obj).setTextColor(i);
        }
    }

    /* renamed from: ۟۟ۨۢ۟  reason: not valid java name and contains not printable characters */
    public static boolean m1706(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            return ((Prefs) obj).contains((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟۟ۨۦ۠  reason: not valid java name and contains not printable characters */
    public static void m1707(Object obj, int i, int i2, int i3, int i4) {
        if (C0131.m2080() >= 0) {
            ((LinearLayout) obj).setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: ۣ۟۠۟ۡ  reason: not valid java name and contains not printable characters */
    public static Enumeration m1708(Object obj) {
        if (C0129.m1842() > 0) {
            return ((DexFile) obj).entries();
        }
        return null;
    }

    /* renamed from: ۟۠۠ۦۥ  reason: not valid java name and contains not printable characters */
    public static Context m1709(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Context) obj).getApplicationContext();
        }
        return null;
    }

    /* renamed from: ۟۠ۡۥۣ  reason: not valid java name and contains not printable characters */
    public static void m1710(Object obj, boolean z) {
        if (m1700() >= 0) {
            CrashHandler.init((Context) obj, z);
        }
    }

    /* renamed from: ۟۠ۤ۠ۥ  reason: not valid java name and contains not printable characters */
    public static void m1711(Object obj, Object obj2) {
        if (C0129.m1842() > 0) {
            ((Preferences) obj).remove((String) obj2);
        }
    }

    /* renamed from: ۟۠ۤۢۥ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1712(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((SharedPreferences) obj).edit();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۨ  reason: not valid java name and contains not printable characters */
    public static PackageManager m1713(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Context) obj).getPackageManager();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠۠  reason: not valid java name and contains not printable characters */
    public static StringBuffer m1714(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            return ((StringBuffer) obj).append(i);
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۨ۠  reason: not valid java name and contains not printable characters */
    public static void m1715(Object obj, int i) {
        if (C0128.m1803() <= 0) {
            ((RadioGroup) obj).setOrientation(i);
        }
    }

    /* renamed from: ۟ۡۡۢ۠  reason: not valid java name and contains not printable characters */
    public static void m1716(Object obj, int i, boolean z) {
        if (C0128.m1803() < 0) {
            Preferences.changeFeatureBool((String) obj, i, z);
        }
    }

    /* renamed from: ۟ۡۢۦ۟  reason: not valid java name and contains not printable characters */
    public static void m1717(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            ((ImageView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۟ۡۤۧۢ  reason: not valid java name and contains not printable characters */
    public static void m1718(Object obj, Object obj2) {
        if (C0129.m1842() > 0) {
            ((TextView) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۟ۡۤۨۢ  reason: not valid java name and contains not printable characters */
    public static int m1719(Object obj) {
        if (m1700() > 0) {
            return ((MotionEvent) obj).getAction();
        }
        return 0;
    }

    /* renamed from: ۟ۢ۟ۡۡ  reason: not valid java name and contains not printable characters */
    public static int m1720(Object obj) {
        if (C0129.m1842() > 0) {
            return Color.parseColor((String) obj);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢ۟ۧ  reason: not valid java name and contains not printable characters */
    public static void m1721(Object obj, int i) {
        if (C0131.m2080() > 0) {
            ((TextView) obj).setBackgroundColor(i);
        }
    }

    /* renamed from: ۣ۟ۢۤۤ  reason: not valid java name and contains not printable characters */
    public static AlertDialog m1722(Object obj) {
        if (C0129.m1842() > 0) {
            return ((AlertDialog.Builder) obj).create();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۤ۟  reason: not valid java name and contains not printable characters */
    public static String m1723(int i) {
        if (C0131.m2080() >= 0) {
            return Integer.toHexString(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۥ  reason: not valid java name and contains not printable characters */
    public static String m1724(Object obj) {
        if (C0131.m2080() > 0) {
            return ((StringWriter) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۤۢ  reason: not valid java name and contains not printable characters */
    public static void m1725(Object obj) {
        if (m1700() > 0) {
            ((AutoCloseable) obj).close();
        }
    }

    /* renamed from: ۣ۟۠ۨ۠  reason: not valid java name and contains not printable characters */
    public static boolean m1726(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            return GG.isAppSizeLessThan((String) obj, (PackageManager) obj2);
        }
        return false;
    }

    /* renamed from: ۣۣ۟  reason: not valid java name and contains not printable characters */
    public static String m1727() {
        if (C0131.m2080() >= 0) {
            return GG.appSign;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۦ  reason: not valid java name and contains not printable characters */
    public static void m1728(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            ((Button) obj).setVisibility(i);
        }
    }

    /* renamed from: ۣ۟ۧۧ۠  reason: not valid java name and contains not printable characters */
    public static void m1729(Object obj, Object obj2, boolean z) {
        if (C0128.m1803() < 0) {
            ((Preferences) obj).writeBoolean((String) obj2, z);
        }
    }

    /* renamed from: ۣ۟ۨۨۢ  reason: not valid java name and contains not printable characters */
    public static Drawable m1730(Object obj) {
        if (m1700() >= 0) {
            return ((SeekBar) obj).getThumb();
        }
        return null;
    }

    /* renamed from: ۟ۤۡۤۨ  reason: not valid java name and contains not printable characters */
    public static void m1731(Object obj, int i, Object obj2) {
        if (C0129.m1842() > 0) {
            ((Drawable) obj).setColorFilter(i, (PorterDuff.Mode) obj2);
        }
    }

    /* renamed from: ۟ۤۢۥۢ  reason: not valid java name and contains not printable characters */
    public static boolean m1732(Object obj, Object obj2) {
        if (C0128.m1803() < 0) {
            return GG.isGg((Context) obj, (String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۤۥۣۤ  reason: not valid java name and contains not printable characters */
    public static void m1733(Object obj, int i) {
        if (m1700() > 0) {
            ((LinearLayout) obj).setOrientation(i);
        }
    }

    /* renamed from: ۟ۤۨۡ۟  reason: not valid java name and contains not printable characters */
    public static void m1734(Object obj, Object obj2, long j) {
        if (C0131.m2080() >= 0) {
            ((Prefs) obj).writeLong((String) obj2, j);
        }
    }

    /* renamed from: ۣ۟ۤۨۢ  reason: not valid java name and contains not printable characters */
    public static void m1735(Object obj) {
        if (C0128.m1803() < 0) {
            ((Throwable) obj).printStackTrace();
        }
    }

    /* renamed from: ۟ۤۨۦ۟  reason: not valid java name and contains not printable characters */
    public static void m1736(Object obj, int i) {
        if (C0128.m1803() <= 0) {
            ((TextView) obj).setTextColor(i);
        }
    }

    /* renamed from: ۟ۥ۠ۢ  reason: not valid java name and contains not printable characters */
    public static void m1737(Object obj, boolean z) {
        if (C0128.m1803() <= 0) {
            ((RadioButton) obj).setChecked(z);
        }
    }

    /* renamed from: ۟ۥۡۧۧ  reason: not valid java name and contains not printable characters */
    public static ViewGroup.LayoutParams m1738(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((ImageView) obj).getLayoutParams();
        }
        return null;
    }

    /* renamed from: ۟ۥۢ۟ۥ  reason: not valid java name and contains not printable characters */
    public static Editable m1739(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((EditText) obj).getText();
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤ۠  reason: not valid java name and contains not printable characters */
    public static void m1740(Object obj) {
        if (m1700() > 0) {
            ((PrintWriter) obj).close();
        }
    }

    /* renamed from: ۟ۥۥۦ۠  reason: not valid java name and contains not printable characters */
    public static void m1741(Object obj, float f) {
        if (m1700() >= 0) {
            ((LinearLayout) obj).setAlpha(f);
        }
    }

    /* renamed from: ۟ۥۦۣۨ  reason: not valid java name and contains not printable characters */
    public static View m1742(Object obj, int i) {
        if (C0128.m1803() <= 0) {
            return ((RadioGroup) obj).getChildAt(i);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۥۧ  reason: not valid java name and contains not printable characters */
    public static Context m1743(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Switch) obj).getContext();
        }
        return null;
    }

    /* renamed from: ۟ۥۨ۠۠  reason: not valid java name and contains not printable characters */
    public static Bitmap m1744(Object obj, int i, int i2) {
        if (C0128.m1803() < 0) {
            return BitmapFactory.decodeByteArray((byte[]) obj, i, i2);
        }
        return null;
    }

    /* renamed from: ۟ۦ۠ۧۥ  reason: not valid java name and contains not printable characters */
    public static boolean m1745(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Enumeration) obj).hasMoreElements();
        }
        return false;
    }

    /* renamed from: ۟ۦۣ۠۟  reason: not valid java name and contains not printable characters */
    public static int m1746(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((Prefs) obj).readInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۨۨ  reason: not valid java name and contains not printable characters */
    public static void m1747(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((PrintStream) obj).println((String) obj2);
        }
    }

    /* renamed from: ۟ۦۦۣۦ  reason: not valid java name and contains not printable characters */
    public static boolean m1748(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            return ((String) obj).matches((String) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦۦۧ  reason: not valid java name and contains not printable characters */
    public static Object m1749(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            return ((Context) obj).getSystemService((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۨۢ  reason: not valid java name and contains not printable characters */
    public static boolean m1750(Object obj, Object obj2, long j) {
        if (C0128.m1803() <= 0) {
            return ((Handler) obj).postDelayed((Runnable) obj2, j);
        }
        return false;
    }

    /* renamed from: ۟ۦۣۨۨ  reason: not valid java name and contains not printable characters */
    public static void m1751(Object obj, Object obj2) {
        if (C0131.m2080() > 0) {
            ((Context) obj).startActivity((Intent) obj2);
        }
    }

    /* renamed from: ۣ۟ۧۡۦ  reason: not valid java name and contains not printable characters */
    public static String m1752(Object obj) {
        if (C0129.m1842() > 0) {
            return ((PackageInfo) obj).versionName;
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۟۟  reason: not valid java name and contains not printable characters */
    public static void m1753(Object obj, int i) {
        if (C0128.m1803() <= 0) {
            ((Window) obj).setType(i);
        }
    }

    /* renamed from: ۟ۧۧۧۦ  reason: not valid java name and contains not printable characters */
    public static void m1754(Object obj, Object obj2) {
        if (m1700() > 0) {
            ((TextView) obj).setEllipsize((TextUtils.TruncateAt) obj2);
        }
    }

    /* renamed from: ۠۟ۨۥ  reason: not valid java name and contains not printable characters */
    public static void m1755(Object obj, int i, int i2) {
        if (C0131.m2080() > 0) {
            ((Preferences) obj).writeInt(i, i2);
        }
    }

    /* renamed from: ۠۟ۨۧ  reason: not valid java name and contains not printable characters */
    public static boolean m1756(Object obj) {
        if (C0129.m1842() > 0) {
            return TextUtils.isDigitsOnly((CharSequence) obj);
        }
        return false;
    }

    /* renamed from: ۠ۡ۠ۦ  reason: not valid java name and contains not printable characters */
    public static Context m1757() {
        if (m1700() > 0) {
            return Main.mContext;
        }
        return null;
    }

    /* renamed from: ۠ۧ۟ۨ  reason: not valid java name and contains not printable characters */
    public static void m1758(Object obj) {
        if (C0129.m1842() > 0) {
            ((Thread) obj).start();
        }
    }

    /* renamed from: ۠ۨۢۥ  reason: not valid java name and contains not printable characters */
    public static Preferences m1759() {
        if (C0129.m1842() >= 0) {
            return GG.prefs;
        }
        return null;
    }

    /* renamed from: ۠ۨۤۦ  reason: not valid java name and contains not printable characters */
    public static PackageInfo m1760(Object obj, Object obj2, int i) {
        if (m1700() >= 0) {
            return ((PackageManager) obj).getPackageInfo((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۡ۠ۨۤ  reason: not valid java name and contains not printable characters */
    public static void m1761(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            ((Menu) obj).setVisibility(i);
        }
    }

    /* renamed from: ۡۡۡ  reason: not valid java name and contains not printable characters */
    public static void m1762(Object obj, int i) {
        if (C0131.m2080() >= 0) {
            ((SeekBar) obj).setMax(i);
        }
    }

    /* renamed from: ۣۡۢۧ  reason: not valid java name and contains not printable characters */
    public static float m1763(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((MotionEvent) obj).getRawX();
        }
        return 0.0f;
    }

    /* renamed from: ۡۢۨۦ  reason: not valid java name and contains not printable characters */
    public static void m1764(Object obj, Object obj2) {
        if (m1700() > 0) {
            ((FrameLayout) obj).addView((View) obj2);
        }
    }

    /* renamed from: ۡۤ۠ۡ  reason: not valid java name and contains not printable characters */
    public static void m1765(Object obj, int i) {
        if (C0129.m1842() > 0) {
            ((RelativeLayout) obj).setVerticalGravity(i);
        }
    }

    /* renamed from: ۡۥۦۥ  reason: not valid java name and contains not printable characters */
    public static Object m1766(Object obj, int i) {
        if (m1700() >= 0) {
            return ((List) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۡۥۨۧ  reason: not valid java name and contains not printable characters */
    public static String m1767(Object obj, int i) {
        if (C0128.m1803() < 0) {
            return ((BigInteger) obj).toString(i);
        }
        return null;
    }

    /* renamed from: ۢ۟۠۟  reason: not valid java name and contains not printable characters */
    public static JSONObject m1768(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Menu) obj).data;
        }
        return null;
    }

    /* renamed from: ۢ۟ۤۡ  reason: not valid java name and contains not printable characters */
    public static boolean m1769(Object obj) {
        if (C0129.m1842() > 0) {
            return ((File) obj).mkdirs();
        }
        return false;
    }

    /* renamed from: ۢۡ۠ۦ  reason: not valid java name and contains not printable characters */
    public static void m1770(Object obj, Object obj2) {
        if (m1700() >= 0) {
            ((RadioButton) obj).setText((CharSequence) obj2);
        }
    }

    /* renamed from: ۢۢۦۤ  reason: not valid java name and contains not printable characters */
    public static void m1771(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            ((Thread.UncaughtExceptionHandler) obj).uncaughtException((Thread) obj2, (Throwable) obj3);
        }
    }

    /* renamed from: ۢۢۦۧ  reason: not valid java name and contains not printable characters */
    public static void m1772(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((TextView) obj).setTypeface((Typeface) obj2);
        }
    }

    /* renamed from: ۢۧۧ  reason: not valid java name and contains not printable characters */
    public static byte[] m1773(Object obj, int i) {
        if (C0131.m2080() > 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* renamed from: ۢۨۥۣ  reason: not valid java name and contains not printable characters */
    public static void m1774(Object obj) {
        if (C0128.m1803() < 0) {
            ((PackageManager.NameNotFoundException) obj).printStackTrace();
        }
    }

    /* renamed from: ۣ۟ۧ  reason: not valid java name and contains not printable characters */
    public static Iterator m1775(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Collection) obj).iterator();
        }
        return null;
    }

    /* renamed from: ۣۣ۠۟  reason: not valid java name and contains not printable characters */
    public static Context m1776(Object obj) {
        if (C0128.m1803() < 0) {
            return ((VPN) obj).getContext();
        }
        return null;
    }

    /* renamed from: ۣۣۢۢ  reason: not valid java name and contains not printable characters */
    public static String m1777(Object obj, int i) {
        if (C0129.m1842() > 0) {
            return Base64.encodeToString((byte[]) obj, i);
        }
        return null;
    }

    /* renamed from: ۣۢۧ۟  reason: not valid java name and contains not printable characters */
    public static void m1778(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            ((ImageView) obj).setScaleType((ImageView.ScaleType) obj2);
        }
    }

    /* renamed from: ۣۥۣۤ  reason: not valid java name and contains not printable characters */
    public static void m1779(Object obj, Object obj2, Object obj3, Object obj4) {
        if (m1700() > 0) {
            ((WebView) obj).loadData((String) obj2, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۤ۟ۧۧ  reason: not valid java name and contains not printable characters */
    public static TimeUnit m1780() {
        if (C0128.m1803() <= 0) {
            return TimeUnit.SECONDS;
        }
        return null;
    }

    /* renamed from: ۤ۠ۦۡ  reason: not valid java name and contains not printable characters */
    public static CharSequence m1781(Object obj, Object obj2) {
        if (C0129.m1842() >= 0) {
            return ((PackageManager) obj).getApplicationLabel((ApplicationInfo) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۤۢ  reason: not valid java name and contains not printable characters */
    public static String m1782(Object obj, Object obj2, Object obj3) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).Check((Context) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۤۤۡ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences.Editor m1783(Object obj, Object obj2, int i) {
        if (C0129.m1842() > 0) {
            return ((SharedPreferences.Editor) obj).putInt((String) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣۤۦ۠  reason: not valid java name and contains not printable characters */
    public static void m1784(Object obj) {
        if (C0131.m2080() > 0) {
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) obj);
        }
    }

    /* renamed from: ۤۤ۠ۤ  reason: not valid java name and contains not printable characters */
    public static String m1785(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((StringBuffer) obj).toString();
        }
        return null;
    }

    /* renamed from: ۤۦ۟ۡ  reason: not valid java name and contains not printable characters */
    public static void m1786(Object obj, Object obj2) {
        if (m1700() >= 0) {
            ((WebView) obj).setLayoutParams((ViewGroup.LayoutParams) obj2);
        }
    }

    /* renamed from: ۥۣ۠ۦ  reason: contains not printable characters */
    public static void m1787(Object obj, Object obj2, Object obj3) {
        if (m1700() > 0) {
            ((WindowManager) obj).addView((View) obj2, (ViewGroup.LayoutParams) obj3);
        }
    }

    /* renamed from: ۥۢۢۦ  reason: contains not printable characters */
    public static boolean m1788(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* renamed from: ۥۣۧۨ  reason: contains not printable characters */
    public static Object m1789(Object obj, Object obj2) {
        if (m1700() >= 0) {
            return ((JSONObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟۠ۤ  reason: contains not printable characters */
    public static String m1790(Object obj) {
        if (m1700() >= 0) {
            return ((String) obj).toUpperCase();
        }
        return null;
    }

    /* renamed from: ۦ۟ۦۣ  reason: contains not printable characters */
    public static Intent m1791(Object obj, int i) {
        if (m1700() >= 0) {
            return ((Intent) obj).setFlags(i);
        }
        return null;
    }

    /* renamed from: ۦۦۧۢ  reason: contains not printable characters */
    public static void m1792(Object obj, int i) {
        if (C0128.m1803() < 0) {
            ((FrameLayout) obj).setVisibility(i);
        }
    }

    /* renamed from: ۧۡۦۡ  reason: not valid java name and contains not printable characters */
    public static WindowManager m1793(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Activity) obj).getWindowManager();
        }
        return null;
    }

    /* renamed from: ۧۢۤۡ  reason: not valid java name and contains not printable characters */
    public static void m1794(Object obj, Object obj2) {
        if (C0128.m1803() <= 0) {
            ((RelativeLayout) obj).addView((View) obj2);
        }
    }

    /* JADX WARNING: type inference failed for: r57v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ۧۤ۟ۤ  reason: not valid java name and contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1795(short[] r54, int r55, int r56, int r57) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.support.C0127.m1795(short[], int, int, int):java.lang.String");
    }

    /* renamed from: ۧۥۦ  reason: not valid java name and contains not printable characters */
    public static void m1796(Object obj) {
        if (C0131.m2080() >= 0) {
            Main.StartWithoutPermission((Context) obj);
        }
    }

    /* renamed from: ۨۡ۟ۥ  reason: not valid java name and contains not printable characters */
    public static byte[] m1797(Object obj) {
        if (m1700() > 0) {
            return ((String) obj).getBytes();
        }
        return null;
    }

    /* renamed from: ۨۡۢۧ  reason: not valid java name and contains not printable characters */
    public static boolean m1798(Object obj, Object obj2) {
        if (C0131.m2080() >= 0) {
            return ((List) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۣۨ۟ۨ  reason: not valid java name and contains not printable characters */
    public static Drawable m1799(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Spinner) obj).getBackground();
        }
        return null;
    }

    /* renamed from: ۣۨ۠۠  reason: not valid java name and contains not printable characters */
    public static String m1800(String str) {
        String str2 = str;
        String r3 = C0131.m2057();
        String r2 = C0131.m2057();
        for (int i = 0; i < 15; i++) {
            r3 = m1785(C0129.m1848(C0129.m1848(new StringBuffer(), r3), m1723(i)));
            r2 = m1785(m1714(C0129.m1848(new StringBuffer(), r2), ((int) (C0129.m1808() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0130.m1964(str2) / 2);
        for (int i2 = 0; i2 < C0130.m1964(str2); i2 += 2) {
            C0130.m1965(byteArrayOutputStream, (C0131.m2056(r3, C0130.m1956(str2, i2)) << 4) | C0131.m2056(r3, C0130.m1956(str2, i2 + 1)));
        }
        byte[] r32 = C0129.m1881(byteArrayOutputStream);
        int length = r32.length;
        int r5 = C0130.m1964(r2);
        for (int i3 = 0; i3 < length; i3++) {
            r32[i3] = (byte) (r32[i3] ^ C0130.m1956(r2, i3 % r5));
        }
        for (int i4 = 0; i4 < r32.length; i4 = C0130.m1964(C0131.m2057()) + 1) {
        }
        return new String(r32);
    }

    /* renamed from: ۣۨۦۡ  reason: not valid java name and contains not printable characters */
    public static String m1801(Object obj) {
        if (C0128.m1803() < 0) {
            return ((BufferedReader) obj).readLine();
        }
        return null;
    }

    /* renamed from: ۨۥ  reason: not valid java name and contains not printable characters */
    public static View m1802(Object obj, int i) {
        if (C0129.m1842() >= 0) {
            return ((AdapterView) obj).getChildAt(i);
        }
        return null;
    }
}
