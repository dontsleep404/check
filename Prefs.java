package com.android.support;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

public class Prefs {
    private static final boolean DEFAULT_BOOLEAN_VALUE = false;
    private static final double DEFAULT_DOUBLE_VALUE = -1.0d;
    private static final float DEFAULT_FLOAT_VALUE = -1.0f;
    private static final int DEFAULT_INT_VALUE = -1;
    private static final long DEFAULT_LONG_VALUE = -1;
    private static final String DEFAULT_STRING_VALUE = "";
    private static final String LENGTH = C0130.m1942(m1692(), 0, 7, 459);
    private static Prefs prefsInstance;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f53short = {404, 423, 430, 421, 428, 447, 419, 2098, 2077, 2079, 2056, 2059, 2056, 2079, 2056, 2051, 2062, 2056, 2078, 3154, 3169, 3176, 3171, 3178, 3193, 3173, 1064, 1051, 1042, 1049, 1040, 1027, 1055, 968, 1019, 1010, 1017, 1008, 995, 1023, 2711, 1148};
    private SharedPreferences sharedPreferences;

    Prefs(Context context) {
        Object obj;
        Context context2 = context;
        Context r4 = C0127.m1709(context2);
        new StringBuffer();
        this.sharedPreferences = C0130.m1914(r4, C0127.m1785(C0129.m1848(C0129.m1848(obj, C0129.m1826(context2)), C0129.m1884(m1692(), 7, 12, 2157))), 0);
    }

    Prefs(Context context, String str) {
        this.sharedPreferences = C0130.m1914(C0127.m1709(context), str, 0);
    }

    public static Prefs with(Context context) {
        Prefs prefs;
        Context context2 = context;
        if (m1690() == null) {
            new Prefs(context2);
            prefsInstance = prefs;
        }
        return m1690();
    }

    public static Prefs with(Context context, String str) {
        Prefs prefs;
        Context context2 = context;
        String str2 = str;
        if (m1690() == null) {
            new Prefs(context2, str2);
            prefsInstance = prefs;
        }
        return m1690();
    }

    public static Prefs with(Context context, String str, boolean z) {
        Prefs prefs;
        Context context2 = context;
        String str2 = str;
        if (z) {
            new Prefs(context2, str2);
            prefsInstance = prefs;
        }
        return m1690();
    }

    public static Prefs with(Context context, boolean z) {
        Prefs prefs;
        Context context2 = context;
        if (z) {
            new Prefs(context2);
            prefsInstance = prefs;
        }
        return m1690();
    }

    /* renamed from: ۟ۢۨۢ  reason: not valid java name and contains not printable characters */
    public static Prefs m1690() {
        if (C0128.m1803() < 0) {
            return prefsInstance;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۢۦ  reason: not valid java name and contains not printable characters */
    public static SharedPreferences m1691(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Prefs) obj).sharedPreferences;
        }
        return null;
    }

    /* renamed from: ۡۨۨۦ  reason: not valid java name and contains not printable characters */
    public static short[] m1692() {
        if (C0129.m1842() >= 0) {
            return f53short;
        }
        return null;
    }

    public void clear() {
        C0130.m2021(C0130.m1995(C0127.m1712(m1691(this))));
    }

    public boolean contains(String str) {
        return C0129.m1858(m1691(this), str);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return C0131.m2035(m1691(this), str, set);
    }

    public void putStringSet(String str, Set<String> set) {
        C0130.m2021(C0130.m1984(C0127.m1712(m1691(this)), str, set));
    }

    public String read(String str) {
        return C0131.m2096(m1691(this), str, C0131.m2057());
    }

    public String read(String str, String str2) {
        return C0131.m2096(m1691(this), str, str2);
    }

    public boolean readBoolean(String str) {
        return C0129.m1902(this, str, false);
    }

    public boolean readBoolean(String str, boolean z) {
        return C0131.m2114(m1691(this), str, z);
    }

    public double readDouble(String str) {
        String str2 = str;
        return !C0127.m1706(this, str2) ? DEFAULT_DOUBLE_VALUE : C0129.m1828(C0129.m1872(this, str2));
    }

    public double readDouble(String str, double d) {
        String str2 = str;
        return !C0127.m1706(this, str2) ? d : C0129.m1828(C0129.m1872(this, str2));
    }

    public float readFloat(String str) {
        return C0127.m1704(m1691(this), str, DEFAULT_FLOAT_VALUE);
    }

    public float readFloat(String str, float f) {
        return C0127.m1704(m1691(this), str, f);
    }

    public int readInt(String str) {
        return C0129.m1813(m1691(this), str, -1);
    }

    public int readInt(String str, int i) {
        return C0129.m1813(m1691(this), str, i);
    }

    public long readLong(String str) {
        return C0131.m2076(m1691(this), str, -1);
    }

    public long readLong(String str, long j) {
        return C0131.m2076(m1691(this), str, j);
    }

    public void remove(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str2 = str;
        new StringBuffer();
        if (C0127.m1706(this, C0127.m1785(C0129.m1848(C0129.m1848(obj, str2), C0129.m1884(m1692(), 19, 7, 3085))))) {
            new StringBuffer();
            int r3 = C0127.m1746(this, C0127.m1785(C0129.m1848(C0129.m1848(obj2, str2), C0129.m1884(m1692(), 26, 7, 1143))));
            if (r3 >= 0) {
                SharedPreferences.Editor r6 = C0127.m1712(m1691(this));
                new StringBuffer();
                C0130.m2021(C0131.m2034(r6, C0127.m1785(C0129.m1848(C0129.m1848(obj3, str2), C0130.m1942(m1692(), 33, 7, 919)))));
                for (int i = 0; i < r3; i++) {
                    SharedPreferences.Editor r62 = C0127.m1712(m1691(this));
                    new StringBuffer();
                    new StringBuffer();
                    new StringBuffer();
                    C0130.m2021(C0131.m2034(r62, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0127.m1714(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, str2), C0127.m1795(m1692(), 40, 1, 2764)))), i))), C0127.m1795(m1692(), 41, 1, 1057)))));
                }
            }
        }
        C0130.m2021(C0131.m2034(C0127.m1712(m1691(this)), str2));
    }

    public void write(String str, String str2) {
        C0130.m2021(C0129.m1816(C0127.m1712(m1691(this)), str, str2));
    }

    public void writeBoolean(String str, boolean z) {
        C0130.m2021(C0129.m1883(C0127.m1712(m1691(this)), str, z));
    }

    public void writeDouble(String str, double d) {
        C0127.m1734(this, str, C0131.m2097(d));
    }

    public void writeFloat(String str, float f) {
        C0130.m2021(C0129.m1868(C0127.m1712(m1691(this)), str, f));
    }

    public void writeInt(String str, int i) {
        C0130.m2021(C0127.m1783(C0127.m1712(m1691(this)), str, i));
    }

    public void writeLong(String str, long j) {
        C0130.m2021(C0130.m1953(C0127.m1712(m1691(this)), str, j));
    }
}
