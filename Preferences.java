package com.android.support;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Preferences {
    private static final boolean DEFAULT_BOOLEAN_VALUE = false;
    private static final double DEFAULT_DOUBLE_VALUE = 0.0d;
    private static final float DEFAULT_FLOAT_VALUE = 0.0f;
    private static final int DEFAULT_INT_VALUE = 0;
    private static final long DEFAULT_LONG_VALUE = 0;
    private static final String DEFAULT_STRING_VALUE = "";
    private static final String LENGTH = C0129.m1884(m1688(), 0, 7, 2419);
    public static Context context;
    public static boolean isExpanded;
    public static boolean loadPref;
    private static Preferences prefsInstance;
    private static SharedPreferences sharedPreferences;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f52short = {2348, 2335, 2326, 2333, 2324, 2311, 2331, 1620, 1659, 1657, 1646, 1645, 1646, 1657, 1646, 1637, 1640, 1646, 1656, 1955, 1936, 1945, 1938, 1947, 1928, 1940, 833, 882, 891, 880, 889, 874, 886, 1687, 1899, 1350, 1397, 1404, 1399, 1406, 1389, 1393, 1273, 1226, 1219, 1224, 1217, 1234, 1230, 2001, 2018, 2027, 2016, 2025, 2042, 2022, 2699, 263, 3108, 3279, 1918, 1869, 1860, 1871, 1862, 1877, 1865, 1722, 1673, 1664, 1675, 1666, 1681, 1677, 2577, 2594, 2603, 2592, 2601, 2618, 2598, 2914, 1745};

    Preferences(Context context2) {
        Object obj;
        Context context3 = context2;
        Context r3 = C0127.m1709(context3);
        new StringBuffer();
        sharedPreferences = C0130.m1914(r3, C0127.m1785(C0129.m1848(C0129.m1848(obj, C0129.m1826(context3)), C0130.m1942(m1688(), 7, 12, 1547))), 0);
    }

    Preferences(Context context2, String str) {
        sharedPreferences = C0130.m1914(C0127.m1709(context2), str, 0);
    }

    public static native void Changes(Context context2, int i, String str, int i2, boolean z, String str2);

    public static void changeFeatureBool(String str, int i, boolean z) {
        int i2 = i;
        boolean z2 = z;
        C0131.m2042(C0131.m2101(C0129.m1822()), i2, z2);
        C0130.m1907(C0129.m1822(), i2, str, 0, z2, (Object) null);
    }

    public static void changeFeatureInt(String str, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        C0127.m1755(C0131.m2101(C0129.m1822()), i3, i4);
        C0130.m1907(C0129.m1822(), i3, str, i4, false, (Object) null);
    }

    public static void changeFeatureString(String str, int i, String str2) {
        int i2 = i;
        String str3 = str2;
        C0130.m1992(C0131.m2101(C0129.m1822()), i2, str3);
        C0130.m1907(C0129.m1822(), i2, str, 0, false, str3);
    }

    public static boolean loadPrefBool(String str, int i, boolean z) {
        String str2 = str;
        int i2 = i;
        boolean z2 = z;
        boolean r4 = C0130.m1950(C0131.m2101(C0129.m1822()), i2, z2);
        if (i2 == -1) {
            loadPref = r4;
        }
        if (i2 == -3) {
            isExpanded = r4;
        }
        if (C0129.m1857() || i2 < 0) {
            z2 = r4;
        }
        C0130.m1907(C0129.m1822(), i2, str2, 0, z2, (Object) null);
        return z2;
    }

    public static int loadPrefInt(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (!C0129.m1857()) {
            return 0;
        }
        int r3 = C0131.m2038(C0131.m2101(C0129.m1822()), i2);
        C0130.m1907(C0129.m1822(), i2, str2, r3, false, (Object) null);
        return r3;
    }

    public static String loadPrefString(String str, int i) {
        String str2 = str;
        int i2 = i;
        if (!C0129.m1857() && i2 > 0) {
            return C0131.m2057();
        }
        String r3 = C0130.m1987(C0131.m2101(C0129.m1822()), i2);
        C0130.m1907(C0129.m1822(), i2, str2, 0, false, r3);
        return r3;
    }

    public static Preferences with(Context context2) {
        Preferences preferences;
        Context context3 = context2;
        if (m1689() == null) {
            new Preferences(context3);
            prefsInstance = preferences;
        }
        return m1689();
    }

    public static Preferences with(Context context2, String str) {
        Preferences preferences;
        Context context3 = context2;
        String str2 = str;
        if (m1689() == null) {
            new Preferences(context3, str2);
            prefsInstance = preferences;
        }
        return m1689();
    }

    public static Preferences with(Context context2, String str, boolean z) {
        Preferences preferences;
        Context context3 = context2;
        String str2 = str;
        if (z) {
            new Preferences(context3, str2);
            prefsInstance = preferences;
        }
        return m1689();
    }

    public static Preferences with(Context context2, boolean z) {
        Preferences preferences;
        Context context3 = context2;
        if (z) {
            new Preferences(context3);
            prefsInstance = preferences;
        }
        return m1689();
    }

    /* renamed from: ۟ۧ۠ۦ۠  reason: not valid java name and contains not printable characters */
    public static SharedPreferences m1687() {
        if (C0128.m1803() < 0) {
            return sharedPreferences;
        }
        return null;
    }

    /* renamed from: ۣۤۤ۟  reason: not valid java name and contains not printable characters */
    public static short[] m1688() {
        if (C0127.m1700() > 0) {
            return f52short;
        }
        return null;
    }

    /* renamed from: ۦۨۨۨ  reason: contains not printable characters */
    public static Preferences m1689() {
        if (C0127.m1700() >= 0) {
            return prefsInstance;
        }
        return null;
    }

    public void clear() {
        C0130.m2021(C0130.m1995(C0127.m1712(m1687())));
    }

    public boolean contains(String str) {
        return C0129.m1858(m1687(), str);
    }

    public Set<String> getOrderedStringSet(String str, Set<String> set) {
        Object obj;
        Set<String> set2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str2 = str;
        Set<String> set3 = set;
        new StringBuffer();
        if (!C0129.m1845(this, C0127.m1785(C0129.m1848(C0129.m1848(obj, str2), C0131.m2095(m1688(), 19, 7, 2044))))) {
            return set3;
        }
        new LinkedHashSet();
        Set<String> set4 = set2;
        new StringBuffer();
        int r5 = C0129.m1818(this, C0127.m1785(C0129.m1848(C0129.m1848(obj2, str2), C0129.m1884(m1688(), 26, 7, 798))));
        if (r5 >= 0) {
            for (int i = 0; i < r5; i++) {
                new StringBuffer();
                new StringBuffer();
                new StringBuffer();
                boolean r8 = C0131.m2031(set4, C0129.m1829(this, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0127.m1714(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, str2), C0130.m1942(m1688(), 33, 1, 1740)))), i))), C0127.m1795(m1688(), 34, 1, 1846)))));
            }
        }
        return set4;
    }

    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        String str2 = str;
        Set<String> set2 = set;
        return C0131.m2102() >= 11 ? C0131.m2035(m1687(), str2, set2) : C0131.m2071(this, str2, set2);
    }

    public void putOrderedStringSet(String str, Set<String> set) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        String str2 = str;
        Set<String> set2 = set;
        int i = 0;
        SharedPreferences r10 = m1687();
        new StringBuffer();
        if (C0129.m1858(r10, C0127.m1785(C0129.m1848(C0129.m1848(obj, str2), C0129.m1884(m1688(), 35, 7, 1305))))) {
            new StringBuffer();
            i = C0129.m1818(this, C0127.m1785(C0129.m1848(C0129.m1848(obj9, str2), C0130.m1942(m1688(), 42, 7, 1190))));
        }
        new StringBuffer();
        C0130.m1921(this, C0127.m1785(C0129.m1848(C0129.m1848(obj2, str2), C0130.m1942(m1688(), 49, 7, 1934))), C0130.m1946(set2));
        int i2 = 0;
        Iterator r6 = C0127.m1775(set2);
        while (C0131.m2107(r6)) {
            String str3 = (String) C0129.m1824(r6);
            new StringBuffer();
            new StringBuffer();
            new StringBuffer();
            C0130.m1934(this, C0127.m1785(C0129.m1848(C0129.m1848(obj6, C0127.m1785(C0127.m1714(C0129.m1848(obj7, C0127.m1785(C0129.m1848(C0129.m1848(obj8, str2), C0127.m1795(m1688(), 56, 1, 2768)))), i2))), C0130.m1942(m1688(), 57, 1, 346))), str3);
            i2++;
        }
        while (i2 < i) {
            new StringBuffer();
            new StringBuffer();
            new StringBuffer();
            C0127.m1711(this, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0127.m1714(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, str2), C0131.m2095(m1688(), 58, 1, 3199)))), i2))), C0127.m1795(m1688(), 59, 1, 3218))));
            i2++;
        }
    }

    @TargetApi(11)
    public void putStringSet(String str, Set<String> set) {
        String str2 = str;
        Set<String> set2 = set;
        if (C0131.m2102() >= 11) {
            C0130.m2021(C0130.m1984(C0127.m1712(m1687()), str2, set2));
        } else {
            C0129.m1853(this, str2, set2);
        }
    }

    public boolean readBoolean(int i) {
        return C0131.m2114(m1687(), C0130.m1996(i), false);
    }

    public boolean readBoolean(int i, boolean z) {
        boolean z2 = z;
        try {
            return C0131.m2114(m1687(), C0130.m1996(i), z2);
        } catch (ClassCastException e) {
            ClassCastException classCastException = e;
            return z2;
        }
    }

    public boolean readBoolean(String str) {
        return C0131.m2114(m1687(), str, false);
    }

    public boolean readBoolean(String str, boolean z) {
        return C0131.m2114(m1687(), str, z);
    }

    public double readDouble(String str) {
        String str2 = str;
        return !C0129.m1845(this, str2) ? DEFAULT_DOUBLE_VALUE : C0129.m1828(C0130.m1983(this, str2));
    }

    public double readDouble(String str, double d) {
        String str2 = str;
        return !C0129.m1845(this, str2) ? d : C0129.m1828(C0130.m1983(this, str2));
    }

    public float readFloat(String str) {
        return C0127.m1704(m1687(), str, 0.0f);
    }

    public float readFloat(String str, float f) {
        return C0127.m1704(m1687(), str, f);
    }

    public int readInt(int i) {
        try {
            return C0129.m1813(m1687(), C0130.m1996(i), 0);
        } catch (ClassCastException e) {
            ClassCastException classCastException = e;
            return 0;
        }
    }

    public int readInt(String str) {
        return C0129.m1813(m1687(), str, 0);
    }

    public int readInt(String str, int i) {
        return C0129.m1813(m1687(), str, i);
    }

    public long readLong(String str) {
        return C0131.m2076(m1687(), str, 0);
    }

    public long readLong(String str, long j) {
        return C0131.m2076(m1687(), str, j);
    }

    public String readString(int i) {
        try {
            return C0131.m2096(m1687(), C0130.m1996(i), C0131.m2057());
        } catch (ClassCastException e) {
            ClassCastException classCastException = e;
            return C0131.m2057();
        }
    }

    public String readString(String str) {
        return C0131.m2096(m1687(), str, C0131.m2057());
    }

    public String readString(String str, String str2) {
        return C0131.m2096(m1687(), str, str2);
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
        if (C0129.m1845(this, C0127.m1785(C0129.m1848(C0129.m1848(obj, str2), C0131.m2095(m1688(), 60, 7, 1825))))) {
            new StringBuffer();
            int r3 = C0129.m1818(this, C0127.m1785(C0129.m1848(C0129.m1848(obj2, str2), C0130.m1942(m1688(), 67, 7, 1765))));
            if (r3 >= 0) {
                SharedPreferences.Editor r6 = C0127.m1712(m1687());
                new StringBuffer();
                C0130.m2021(C0131.m2034(r6, C0127.m1785(C0129.m1848(C0129.m1848(obj3, str2), C0131.m2095(m1688(), 74, 7, 2638)))));
                for (int i = 0; i < r3; i++) {
                    SharedPreferences.Editor r62 = C0127.m1712(m1687());
                    new StringBuffer();
                    new StringBuffer();
                    new StringBuffer();
                    C0130.m2021(C0131.m2034(r62, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0127.m1714(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, str2), C0130.m1942(m1688(), 81, 1, 2873)))), i))), C0130.m1942(m1688(), 82, 1, 1676)))));
                }
            }
        }
        C0130.m2021(C0131.m2034(C0127.m1712(m1687()), str2));
    }

    public void writeBoolean(int i, boolean z) {
        C0130.m2021(C0129.m1883(C0127.m1712(m1687()), C0130.m1996(i), z));
    }

    public void writeBoolean(String str, boolean z) {
        C0130.m2021(C0129.m1883(C0127.m1712(m1687()), str, z));
    }

    public void writeDouble(String str, double d) {
        C0129.m1876(this, str, C0131.m2097(d));
    }

    public void writeFloat(String str, float f) {
        C0130.m2021(C0129.m1868(C0127.m1712(m1687()), str, f));
    }

    public void writeInt(int i, int i2) {
        C0130.m2021(C0127.m1783(C0127.m1712(m1687()), C0130.m1996(i), i2));
    }

    public void writeInt(String str, int i) {
        C0130.m2021(C0127.m1783(C0127.m1712(m1687()), str, i));
    }

    public void writeLong(String str, long j) {
        C0130.m2021(C0130.m1953(C0127.m1712(m1687()), str, j));
    }

    public void writeString(int i, String str) {
        C0130.m2021(C0129.m1816(C0127.m1712(m1687()), C0130.m1996(i), str));
    }

    public void writeString(String str, String str2) {
        C0130.m2021(C0129.m1816(C0127.m1712(m1687()), str, str2));
    }
}
