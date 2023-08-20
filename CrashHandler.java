package com.android.support;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.beetalk.sdk.ShareConstants;
import com.tencent.smtt.sdk.TbsListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.http.HttpStatus;

public final class CrashHandler {
    public static final Thread.UncaughtExceptionHandler DEFAULT_UNCAUGHT_EXCEPTION_HANDLER = C0129.m1820();

    public CrashHandler() {
    }

    public static void init(Context context, boolean z) {
        Object obj;
        boolean z2 = z;
        new Thread.UncaughtExceptionHandler(context) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f24short = {1084, 1037, 1037, 1086, 1039, 1052, 1038, 1045, 1378, 1348, 1359, 1302, 1349, 1367, 1344, 1375, 1368, 1361, 1302, 1370, 1369, 1361, 2660, 2660, 2660, 2660, 2626, 2640, 2640, 2626, 2681, 2681, 2608, 2645, 2645, 2626, 2672, 2672, 2626, 2670, 2670, 1097, 1099, 1088, 1147, 1097, 1089, 1098, 1105, 1147, 1095, 1110, 1093, 1111, 1100, 1147, 2682, 2592, 2604, 2592, 360, 308, 307, 296, 309, 294, 288, 290, 360, 290, 298, 306, 299, 294, 307, 290, 291, 360, 375, 360, 259, 296, 292, 306, 298, 290, 297, 307, 308, 360, 644, 671, 666, 671, 670, 646, 671, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3093, 3190, 3143, 3156, 3142, 3165, 3093, 3197, 3152, 3156, 3153, 3093, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3103, 3135, 1574, 1563, 1567, 1559, 1618, 1597, 1556, 1618, 1585, 1536, 1555, 1537, 1562, 1618, 1618, 1618, 1618, 1618, 1618, 1608, 1618, 2045, 833, 864, 883, 876, 870, 864, 805, 840, 868, 875, 880, 867, 868, 870, 881, 880, 887, 864, 887, 831, 805, 2739, 793, 824, 811, 820, 830, 824, 893, 784, 818, 825, 824, 817, 893, 893, 893, 893, 893, 893, 893, 871, 893, 544, 1136, 1119, 1109, 1091, 1118, 1112, 1109, 1041, 1127, 1108, 1091, 1090, 1112, 1118, 1119, 1041, 1041, 1041, 1041, 1035, 1041, 2866, 2666, 2629, 2639, 2649, 2628, 2626, 2639, 2571, 2680, 2671, 2656, 2571, 2571, 2571, 2571, 2571, 2571, 2571, 2571, 2577, 2571, 2648, 1734, 1783, 1783, 1703, 1745, 1762, 1781, 1780, 1774, 1768, 1769, 1737, 1766, 1770, 1762, 1703, 1703, 1703, 1703, 1725, 1703, 1061, 2123, 2170, 2170, 2090, 2140, 2159, 2168, 2169, 2147, 2149, 2148, 2121, 2149, 2158, 2159, 2090, 2090, 2090, 2090, 2096, 2090, 880, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1718, 1749, 1764, 1783, 1765, 1790, 1718, 1758, 1779, 1783, 1778, 1718, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1724, 1692, 1090, 920, 958, 946, 954, 1023, 951, 958, 940, 1023, 956, 941, 958, 940, 951, 954, 955, 1023, 938, 945, 954, 935, 943, 954, 956, 939, 954, 955, 947, 934, 2480, 2451, 2459, 2524, 2447, 2461, 2442, 2457, 2456, 2524, 2440, 2451, 2502, 2524, 2987, 3063, 3056, 3051, 3062, 3045, 3043, 3041, 2987, 3041, 3049, 3057, 3048, 3045, 3056, 3041, 3040, 2987, 2996, 2987, 1520, 1473, 1473, 1522, 1475, 1488, 1474, 1497, 2382, 2405, 2404, 2415, 674, 659, 659, 672, 657, 642, 656, 651, 2376, 2431, 2431, 2402, 2431, 2349, 2407, 2424, 2430, 2425, 2349, 2401, 2424, 2403, 2414, 2405, 2408, 2409, 2349};
            private final Context val$app;

            {
                this.val$app = r57;
            }

            private void tryUncaughtException(Thread thread, Throwable th) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Writer writer;
                Object obj6;
                Object obj7;
                Object obj8;
                Thread thread2 = thread;
                Throwable th2 = th;
                String r18 = C0130.m1942(m1411(), 0, 8, 1149);
                String r19 = C0130.m1942(m1411(), 8, 14, 1334);
                new SimpleDateFormat(C0127.m1795(m1411(), 22, 19, 2589));
                new Date();
                String r6 = C0131.m2030(obj, obj2);
                new StringBuffer();
                new StringBuffer();
                new File(C0131.m2102() >= 30 ? C0127.m1795(m1411(), 60, 30, 327) : C0131.m2079(C0131.m2098(m1412(this), (Object) null)), C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0130.m1942(m1411(), 41, 15, 1060)), r6))), C0130.m1942(m1411(), 56, 4, 2644))));
                Object obj9 = obj5;
                String r10 = C0129.m1884(m1411(), 90, 7, 753);
                long j = (long) 0;
                try {
                    PackageInfo r13 = C0127.m1760(C0127.m1713(m1412(this)), C0129.m1826(m1412(this)), 0);
                    r10 = C0127.m1752(r13);
                    j = C0131.m2102() >= 28 ? C0131.m2073(r13) : (long) C0129.m1878(r13);
                } catch (PackageManager.NameNotFoundException e) {
                    PackageManager.NameNotFoundException nameNotFoundException = e;
                }
                new StringWriter();
                Writer writer2 = writer;
                new PrintWriter(writer2);
                Object obj10 = obj6;
                C0131.m2068(th2, obj10);
                String r132 = C0127.m1724(writer2);
                C0127.m1740(obj10);
                new StringBuilder();
                Object obj11 = obj7;
                StringBuilder r182 = C0129.m1890(obj11, C0131.m2095(m1411(), 97, 42, 3125));
                StringBuilder r183 = C0129.m1890(C0129.m1890(C0129.m1890(obj11, C0131.m2095(m1411(), 139, 21, 1650)), r6), C0130.m1942(m1411(), TbsListener.ErrorCode.STARTDOWNLOAD_1, 1, 2039));
                StringBuilder r184 = C0129.m1890(C0129.m1890(C0129.m1890(obj11, C0130.m1942(m1411(), TbsListener.ErrorCode.STARTDOWNLOAD_2, 21, 773)), C0131.m2024()), C0127.m1795(m1411(), ShareConstants.ERROR_CODE.GG_RESULT_AUTH_EXCHANGE_ERROR, 1, 2745));
                StringBuilder r185 = C0129.m1890(C0129.m1890(C0129.m1890(obj11, C0127.m1795(m1411(), ShareConstants.ERROR_CODE.GG_RESULT_REFRESH_TOKEN_EMPTY, 21, 861)), C0131.m2043()), C0130.m1942(m1411(), 204, 1, 554));
                StringBuilder r186 = C0129.m1890(C0129.m1890(C0129.m1890(obj11, C0129.m1884(m1411(), 205, 21, 1073)), C0129.m1807()), C0127.m1795(m1411(), 226, 1, 2872));
                StringBuilder r187 = C0129.m1890(C0130.m1908(C0129.m1890(obj11, C0130.m1942(m1411(), 227, 21, 2603)), C0131.m2102()), C0130.m1942(m1411(), 248, 1, 2642));
                StringBuilder r188 = C0129.m1890(C0129.m1890(C0129.m1890(obj11, C0127.m1795(m1411(), 249, 21, 1671)), r10), C0130.m1942(m1411(), 270, 1, 1071));
                StringBuilder r189 = C0129.m1890(C0129.m1843(C0129.m1890(obj11, C0131.m2095(m1411(), 271, 21, 2058)), j), C0130.m1942(m1411(), 292, 1, 890));
                StringBuilder r1810 = C0129.m1890(obj11, C0129.m1884(m1411(), 293, 42, 1686));
                StringBuilder r1811 = C0129.m1890(C0129.m1890(obj11, C0130.m1942(m1411(), 335, 1, 1096)), r132);
                try {
                    m1413(this, obj9, C0130.m1922(obj11));
                } catch (IOException e2) {
                    IOException iOException = e2;
                }
                C0130.m2001(C0129.m1864(m1412(this), C0131.m2095(m1411(), 336, 29, 991), 1));
                new StringBuffer();
                C0130.m2001(C0129.m1864(m1412(this), C0127.m1785(C0129.m1848(C0129.m1848(obj8, C0127.m1795(m1411(), 365, 14, 2556)), C0131.m2048(C0131.m2079(obj9), C0127.m1795(m1411(), 379, 20, 2948), C0131.m2057()))), 1));
                String r1812 = C0131.m2095(m1411(), 399, 8, 1457);
                String r192 = C0130.m1942(m1411(), 407, 4, 2314);
                C0129.m1856(2);
            }

            private void writeFile(File file, String str) throws IOException {
                Object obj;
                File file2 = file;
                String str2 = str;
                File r4 = C0129.m1888(file2);
                if (r4 != null && !C0130.m1947(r4)) {
                    boolean r8 = C0127.m1769(r4);
                }
                boolean r82 = C0131.m2100(file2);
                new FileOutputStream(file2);
                Object obj2 = obj;
                C0130.m1939(obj2, C0127.m1797(str2));
                try {
                    C0129.m1841(obj2);
                } catch (IOException e) {
                    IOException iOException = e;
                }
            }

            /* renamed from: ۟ۢ۠ۦۥ  reason: not valid java name and contains not printable characters */
            public static short[] m1411() {
                if (C0131.m2080() > 0) {
                    return f24short;
                }
                return null;
            }

            /* renamed from: ۣۣ۟ۥۣ  reason: not valid java name and contains not printable characters */
            public static Context m1412(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000000) obj).val$app;
                }
                return null;
            }

            /* renamed from: ۢۥۥۢ  reason: not valid java name and contains not printable characters */
            public static void m1413(Object obj, Object obj2, Object obj3) {
                if (C0128.m1803() <= 0) {
                    ((AnonymousClass100000000) obj).writeFile((File) obj2, (String) obj3);
                }
            }

            /* renamed from: ۧۥۡۡ  reason: not valid java name and contains not printable characters */
            public static void m1414(Object obj, Object obj2, Object obj3) {
                if (C0128.m1803() <= 0) {
                    ((AnonymousClass100000000) obj).tryUncaughtException((Thread) obj2, (Throwable) obj3);
                }
            }

            @Override
            public void uncaughtException(Thread thread, Throwable th) {
                Thread thread2 = thread;
                Throwable th2 = th;
                String r6 = C0130.m1942(m1411(), 411, 8, 739);
                String r7 = C0130.m1942(m1411(), HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 19, 2317);
                try {
                    m1414(this, thread2, th2);
                } catch (Throwable th3) {
                    C0127.m1735(th3);
                    if (C0131.m2063() != null) {
                        C0127.m1771(C0131.m2063(), thread2, th2);
                    } else {
                        C0129.m1856(2);
                    }
                }
            }
        };
        C0127.m1784(obj);
    }
}
