package com.android.support;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import com.tencent.gcloud.msdk.core.MSDKMethodNameID;
import com.tencent.smtt.sdk.TbsListener;
import com.twitter.sdk.android.core.internal.TwitterApiConstants;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class GG {
    public static String appSign = C0131.m2095(m1416(), 0, 47, 2115);
    public static Preferences prefs;
    private static BroadcastReceiver receiver;

    /* renamed from: short  reason: not valid java name */
    private static final short[] f25short;
    public static int signi;

    static {
        short[] sArr = new short[MSDKMethodNameID.MSDK_GROUP_GET_GROUP_RELATION];
        // fill-array-data instruction
        sArr[0] = 2055;
        sArr[1] = 2049;
        sArr[2] = 2169;
        sArr[3] = 2163;
        sArr[4] = 2164;
        sArr[5] = 2169;
        sArr[6] = 2171;
        sArr[7] = 2166;
        sArr[8] = 2169;
        sArr[9] = 2167;
        sArr[10] = 2054;
        sArr[11] = 2169;
        sArr[12] = 2160;
        sArr[13] = 2053;
        sArr[14] = 2169;
        sArr[15] = 2053;
        sArr[16] = 2053;
        sArr[17] = 2169;
        sArr[18] = 2162;
        sArr[19] = 2163;
        sArr[20] = 2169;
        sArr[21] = 2050;
        sArr[22] = 2160;
        sArr[23] = 2169;
        sArr[24] = 2055;
        sArr[25] = 2164;
        sArr[26] = 2169;
        sArr[27] = 2055;
        sArr[28] = 2055;
        sArr[29] = 2169;
        sArr[30] = 2170;
        sArr[31] = 2167;
        sArr[32] = 2169;
        sArr[33] = 2166;
        sArr[34] = 2161;
        sArr[35] = 2169;
        sArr[36] = 2166;
        sArr[37] = 2166;
        sArr[38] = 2169;
        sArr[39] = 2161;
        sArr[40] = 2164;
        sArr[41] = 2169;
        sArr[42] = 2170;
        sArr[43] = 2161;
        sArr[44] = 2169;
        sArr[45] = 2170;
        sArr[46] = 2048;
        sArr[47] = 911;
        sArr[48] = 896;
        sArr[49] = 906;
        sArr[50] = 924;
        sArr[51] = 897;
        sArr[52] = 903;
        sArr[53] = 906;
        sArr[54] = 960;
        sArr[55] = 903;
        sArr[56] = 896;
        sArr[57] = 922;
        sArr[58] = 907;
        sArr[59] = 896;
        sArr[60] = 922;
        sArr[61] = 960;
        sArr[62] = 911;
        sArr[63] = 909;
        sArr[64] = 922;
        sArr[65] = 903;
        sArr[66] = 897;
        sArr[67] = 896;
        sArr[68] = 960;
        sArr[69] = 958;
        sArr[70] = 943;
        sArr[71] = 941;
        sArr[72] = 933;
        sArr[73] = 943;
        sArr[74] = 937;
        sArr[75] = 939;
        sArr[76] = 945;
        sArr[77] = 943;
        sArr[78] = 938;
        sArr[79] = 938;
        sArr[80] = 939;
        sArr[81] = 938;
        sArr[82] = 2609;
        sArr[83] = 2622;
        sArr[84] = 2612;
        sArr[85] = 2594;
        sArr[86] = 2623;
        sArr[87] = 2617;
        sArr[88] = 2612;
        sArr[89] = 2686;
        sArr[90] = 2617;
        sArr[91] = 2622;
        sArr[92] = 2596;
        sArr[93] = 2613;
        sArr[94] = 2622;
        sArr[95] = 2596;
        sArr[96] = 2686;
        sArr[97] = 2609;
        sArr[98] = 2611;
        sArr[99] = 2596;
        sArr[100] = 2617;
        sArr[101] = 2623;
        sArr[102] = 2622;
        sArr[103] = 2686;
        sArr[104] = 2560;
        sArr[105] = 2577;
        sArr[106] = 2579;
        sArr[107] = 2587;
        sArr[108] = 2577;
        sArr[109] = 2583;
        sArr[110] = 2581;
        sArr[111] = 2575;
        sArr[112] = 2585;
        sArr[113] = 2590;
        sArr[114] = 2563;
        sArr[115] = 2564;
        sArr[116] = 2577;
        sArr[117] = 2588;
        sArr[118] = 2588;
        sArr[119] = 3046;
        sArr[120] = 3049;
        sArr[121] = 3043;
        sArr[122] = 3061;
        sArr[123] = 3048;
        sArr[124] = 3054;
        sArr[125] = 3043;
        sArr[126] = 2985;
        sArr[127] = 3054;
        sArr[128] = 3049;
        sArr[129] = 3059;
        sArr[130] = 3042;
        sArr[131] = 3049;
        sArr[132] = 3059;
        sArr[133] = 2985;
        sArr[134] = 3046;
        sArr[135] = 3044;
        sArr[136] = 3059;
        sArr[137] = 3054;
        sArr[138] = 3048;
        sArr[139] = 3049;
        sArr[140] = 2985;
        sArr[141] = 3031;
        sArr[142] = 3014;
        sArr[143] = 3012;
        sArr[144] = 3020;
        sArr[145] = 3014;
        sArr[146] = 3008;
        sArr[147] = 3010;
        sArr[148] = 3032;
        sArr[149] = 3009;
        sArr[150] = 3026;
        sArr[151] = 3019;
        sArr[152] = 3019;
        sArr[153] = 3038;
        sArr[154] = 3032;
        sArr[155] = 3029;
        sArr[156] = 3010;
        sArr[157] = 3018;
        sArr[158] = 3016;
        sArr[159] = 3025;
        sArr[160] = 3010;
        sArr[161] = 3011;
        sArr[162] = 2914;
        sArr[163] = 2931;
        sArr[164] = 2929;
        sArr[165] = 2937;
        sArr[166] = 2931;
        sArr[167] = 2933;
        sArr[168] = 2935;
        sArr[169] = 3093;
        sArr[170] = 3097;
        sArr[171] = 3099;
        sArr[172] = 3160;
        sArr[173] = 3073;
        sArr[174] = 3084;
        sArr[175] = 3089;
        sArr[176] = 3089;
        sArr[177] = 3084;
        sArr[178] = 3097;
        sArr[179] = 3096;
        sArr[180] = 3100;
        sArr[181] = 3072;
        sArr[182] = 3087;
        sArr[183] = 3160;
        sArr[184] = 3127;
        sArr[185] = 3093;
        sArr[186] = 3074;
        sArr[187] = 3103;
        sArr[188] = 3072;
        sArr[189] = 3103;
        sArr[190] = 3074;
        sArr[191] = 3087;
        sArr[192] = 3131;
        sArr[193] = 3095;
        sArr[194] = 3103;
        sArr[195] = 3096;
        sArr[196] = 1354;
        sArr[197] = 1349;
        sArr[198] = 1359;
        sArr[199] = 1369;
        sArr[200] = 1348;
        sArr[201] = 1346;
        sArr[202] = 1359;
        sArr[203] = 1285;
        sArr[204] = 1358;
        sArr[205] = 1363;
        sArr[206] = 1375;
        sArr[207] = 1285;
        sArr[208] = 1354;
        sArr[209] = 1354;
        sArr[210] = 3018;
        sArr[211] = 3013;
        sArr[212] = 3023;
        sArr[213] = 3033;
        sArr[214] = 3012;
        sArr[215] = 3010;
        sArr[216] = 3023;
        sArr[217] = 2949;
        sArr[218] = 3021;
        sArr[219] = 3010;
        sArr[220] = 3027;
        sArr[221] = 2949;
        sArr[222] = 3018;
        sArr[223] = 1124;
        sArr[224] = 1149;
        sArr[225] = 1129;
        sArr[226] = 1122;
        sArr[227] = 1062;
        sArr[228] = 1124;
        sArr[229] = 1121;
        sArr[230] = 1130;
        sArr[231] = 1062;
        sArr[232] = 1129;
        sArr[233] = 1885;
        sArr[234] = 1860;
        sArr[235] = 1872;
        sArr[236] = 1883;
        sArr[237] = 1823;
        sArr[238] = 1872;
        sArr[239] = 2779;
        sArr[240] = 2774;
        sArr[241] = 2756;
        sArr[242] = 2778;
        sArr[243] = 2713;
        sArr[244] = 2774;
        sArr[245] = 1420;
        sArr[246] = 1409;
        sArr[247] = 1427;
        sArr[248] = 1421;
        sArr[249] = 1486;
        sArr[250] = 1420;
        sArr[251] = 1409;
        sArr[252] = 1427;
        sArr[253] = 1421;
        sArr[254] = 757;
        sArr[255] = 760;
        sArr[256] = 746;
        sArr[257] = 756;
        sArr[258] = 695;
        sArr[259] = 725;
        sArr[260] = 760;
        sArr[261] = 746;
        sArr[262] = 756;
        sArr[263] = 731;
        sArr[264] = 760;
        sArr[265] = 746;
        sArr[266] = 764;
        sArr[267] = 2583;
        sArr[268] = 2584;
        sArr[269] = 2578;
        sArr[270] = 2564;
        sArr[271] = 2585;
        sArr[272] = 2591;
        sArr[273] = 2578;
        sArr[274] = 2648;
        sArr[275] = 2579;
        sArr[276] = 2574;
        sArr[277] = 2562;
        sArr[278] = 2648;
        sArr[279] = 2610;
        sArr[280] = 2583;
        sArr[281] = 2579;
        sArr[282] = 2587;
        sArr[283] = 2585;
        sArr[284] = 2584;
        sArr[285] = 2619;
        sArr[286] = 2583;
        sArr[287] = 2584;
        sArr[288] = 2583;
        sArr[289] = 2577;
        sArr[290] = 2579;
        sArr[291] = 2564;
        sArr[292] = 2512;
        sArr[293] = 2505;
        sArr[294] = 2525;
        sArr[295] = 2518;
        sArr[296] = 2450;
        sArr[297] = 2544;
        sArr[298] = 2505;
        sArr[299] = 2525;
        sArr[300] = 2558;
        sArr[301] = 2515;
        sArr[302] = 2515;
        sArr[303] = 2512;
        sArr[304] = 2521;
        sArr[305] = 2525;
        sArr[306] = 2514;
        sArr[307] = 2938;
        sArr[308] = 2931;
        sArr[309] = 2818;
        sArr[310] = 1505;
        sArr[311] = 2081;
        sArr[312] = 2088;
        sArr[313] = 2137;
        sArr[314] = 2055;
        sArr[315] = 2066;
        sArr[316] = 2064;
        sArr[317] = 2170;
        sArr[318] = 2072;
        f25short = sArr;
    }

    public GG() {
    }

    public static void GG(Context context) {
        Object obj;
        BroadcastReceiver broadcastReceiver;
        Object obj2;
        Object obj3;
        Object obj4;
        Context context2 = context;
        new IntentFilter();
        Object obj5 = obj;
        C0131.m2113(obj5, C0130.m1942(m1416(), 47, 35, 1006));
        C0131.m2113(obj5, C0129.m1884(m1416(), 82, 37, 2640));
        C0131.m2113(obj5, C0131.m2095(m1416(), 119, 43, 2951));
        C0129.m1873(obj5, C0127.m1795(m1416(), TbsListener.ErrorCode.STARTDOWNLOAD_3, 7, 2834));
        new BroadcastReceiver(context2) {
            private final Context val$context;

            {
                this.val$context = r57;
            }

            /* renamed from: ۦۣۣ۟  reason: contains not printable characters */
            public static Context m1417(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((AnonymousClass100000004) obj).val$context;
                }
                return null;
            }

            @Override
            public void onReceive(Context context, Intent intent) {
                Object obj;
                Context context2 = context;
                Intent intent2 = intent;
                String r4 = C0129.m1903(intent2);
                String r6 = C0130.m1960(C0130.m1941(intent2));
                if (C0127.m1732(m1417(this), r6)) {
                    new Runnable(this, m1417(this), r6, context2) {

                        /* renamed from: short  reason: not valid java name */
                        private static final short[] f26short = {3099, 4736, 3134, 3314, 3286, 2019, 6476, 2002, 1931, 1993, 6500, 2272, 2264, 2129, 2244, 2192, 2264, 2265, 5751, 2270, 2192, 2259, 2128, 2265, 2192, 2465, 5639, 2244, 2192, 5721, 2270, 2263, 2192, 2260, 5717, 2270, 2263, 2192, 2263, 2130, 2249, 2192, 2248, 2245, 2270, 2263, 2192, 2465, 5737, 2244, 2192, 2193, 2192, 2234, 2276, 2138, 2270, 2192, 5721, 2270, 2263, 2192, 2260, 5717, 2270, 2263, 2192, 2186, 2192, 3244, 3318, 3271, 3269, 3277, 3271, 3265, 3267, 3206, 3228, 3206};
                        private final AnonymousClass100000004 this$0;
                        private final Context val$context;
                        private final Context val$context2;
                        private final String val$packageName;

                        {
                            this.this$0 = r60;
                            this.val$context = r61;
                            this.val$packageName = r62;
                            this.val$context2 = r63;
                        }

                        static AnonymousClass100000004 access$0(AnonymousClass100000003 r55) {
                            return m1421(r55);
                        }

                        /* renamed from: ۣ۟۟ۧۥ  reason: not valid java name and contains not printable characters */
                        public static Context m1418(Object obj) {
                            if (C0127.m1700() >= 0) {
                                return ((AnonymousClass100000003) obj).val$context;
                            }
                            return null;
                        }

                        /* renamed from: ۟۠ۦۤ۠  reason: not valid java name and contains not printable characters */
                        public static Context m1419(Object obj) {
                            if (C0131.m2080() > 0) {
                                return ((AnonymousClass100000003) obj).val$context2;
                            }
                            return null;
                        }

                        /* renamed from: ۣۣ۟ۧۨ  reason: not valid java name and contains not printable characters */
                        public static short[] m1420() {
                            if (C0129.m1842() > 0) {
                                return f26short;
                            }
                            return null;
                        }

                        /* renamed from: ۣۧۦۡ  reason: not valid java name and contains not printable characters */
                        public static AnonymousClass100000004 m1421(Object obj) {
                            if (C0129.m1842() > 0) {
                                return ((AnonymousClass100000003) obj).this$0;
                            }
                            return null;
                        }

                        /* renamed from: ۣۣۧۨ  reason: not valid java name and contains not printable characters */
                        public static String m1422(Object obj) {
                            if (C0127.m1700() > 0) {
                                return ((AnonymousClass100000003) obj).val$packageName;
                            }
                            return null;
                        }

                        @Override
                        public void run() {
                            Object obj;
                            Object obj2;
                            Object obj3;
                            Object obj4;
                            Object obj5;
                            Object obj6;
                            Object obj7;
                            Object obj8;
                            PackageManager r2 = C0127.m1713(m1418(this));
                            String str = null;
                            try {
                                str = (String) C0127.m1781(r2, C0130.m1994(r2, m1422(this), 128));
                            } catch (PackageManager.NameNotFoundException e) {
                                C0127.m1774(e);
                            }
                            C0127.m1729(C0127.m1759(), C0130.m1963(m1422(this)), false);
                            new AlertDialog.Builder(m1419(this));
                            new DialogInterface.OnClickListener(this) {
                                private final AnonymousClass100000003 this$0;

                                {
                                    this.this$0 = r57;
                                }

                                static AnonymousClass100000003 access$0(AnonymousClass100000000 r55) {
                                    return m1423(r55);
                                }

                                /* renamed from: ۢ۠ۤۧ  reason: not valid java name and contains not printable characters */
                                public static AnonymousClass100000003 m1423(Object obj) {
                                    if (C0129.m1842() > 0) {
                                        return ((AnonymousClass100000000) obj).this$0;
                                    }
                                    return null;
                                }

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    DialogInterface dialogInterface2 = dialogInterface;
                                    int i2 = i;
                                    C0129.m1814(C0129.m1823());
                                }
                            };
                            new DialogInterface.OnClickListener(this) {
                                private final AnonymousClass100000003 this$0;

                                {
                                    this.this$0 = r57;
                                }

                                static AnonymousClass100000003 access$0(AnonymousClass100000001 r55) {
                                    return m1424(r55);
                                }

                                /* renamed from: ۣۤۨۧ  reason: not valid java name and contains not printable characters */
                                public static AnonymousClass100000003 m1424(Object obj) {
                                    if (C0129.m1842() > 0) {
                                        return ((AnonymousClass100000001) obj).this$0;
                                    }
                                    return null;
                                }

                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    DialogInterface dialogInterface2 = dialogInterface;
                                    int i2 = i;
                                    C0129.m1814(C0129.m1823());
                                }
                            };
                            AlertDialog r4 = C0127.m1722(C0130.m1924(C0131.m2052(C0131.m2077(obj, C0131.m2095(m1420(), 0, 3, 3159)), C0130.m1942(m1420(), 3, 2, 3261), obj2), C0130.m1942(m1420(), 5, 6, 1963), obj3));
                            new StringBuffer();
                            new StringBuffer();
                            new StringBuffer();
                            C0129.m1817(r4, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, C0131.m2095(m1420(), 11, 58, 2224)), str))), C0130.m1942(m1420(), 69, 11, 3238)))), m1422(this))));
                            C0130.m1910(r4, false);
                            C0129.m1830(r4);
                            new Handler(C0131.m2059());
                            new Runnable(this) {
                                private final AnonymousClass100000003 this$0;

                                {
                                    this.this$0 = r57;
                                }

                                static AnonymousClass100000003 access$0(AnonymousClass100000002 r55) {
                                    return m1425(r55);
                                }

                                /* renamed from: ۣ۠ۧۦ  reason: not valid java name and contains not printable characters */
                                public static AnonymousClass100000003 m1425(Object obj) {
                                    if (C0131.m2080() >= 0) {
                                        return ((AnonymousClass100000002) obj).this$0;
                                    }
                                    return null;
                                }

                                @Override
                                public void run() {
                                    C0129.m1814(C0129.m1823());
                                }
                            };
                            boolean r6 = C0127.m1750(obj7, obj8, (long) 2000);
                        }
                    };
                    C0131.m2094((Activity) m1417(this), obj);
                }
            }
        };
        receiver = broadcastReceiver;
        Intent r14 = C0129.m1893(context2, m1415(), obj5);
        try {
            signi = 1;
            prefs = C0131.m2101(context2);
            new ArrayList();
            Object obj6 = obj2;
            long r4 = C0131.m2065(context2);
            if (!C0130.m1943(C0129.m1874(context2), C0127.m1727())) {
                new Runnable(context2) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f27short = {1267, 1240, 1098, 1168, 1101, 1168, 1162, 1168, 1445, 1409, 1136, 6879, 1089, 1048, 1114, 6903, 3191, 4856, 3103, 3147, 3159, 4846, 3153, 3160, 3103, 3151, 3159, 3294, 3147, 3103, 3159, 3158, 4856, 3153, 3103, 3166, 3151, 3156, 3103, 3165, 4852, 3103, 3164, 3159, 4854, 3153, 3159, 3103, 3148, 4818, 3166, 3103, 3091, 3103, 3148, 4738, 3103, 3374, 3276, 3153, 3160, 3103, 4822, 3153, 3160, 3103, 3163, 4826, 3153, 3160, 3103, 3153, 3160, 3166, 3142, 3103, 3165, 3293, 3142, 3103, 3160, 3158, 4834, 3103, 3102, 3102, 3102};
                    private final Context val$context;

                    {
                        this.val$context = r57;
                    }

                    /* renamed from: ۟ۢ۠ۦۦ  reason: not valid java name and contains not printable characters */
                    public static short[] m1426() {
                        if (C0127.m1700() >= 0) {
                            return f27short;
                        }
                        return null;
                    }

                    /* renamed from: ۣۧۨۨ  reason: not valid java name and contains not printable characters */
                    public static Context m1427(Object obj) {
                        if (C0127.m1700() > 0) {
                            return ((AnonymousClass100000008) obj).val$context;
                        }
                        return null;
                    }

                    @Override
                    public void run() {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        new AlertDialog.Builder(m1427(this));
                        new DialogInterface.OnClickListener(this) {
                            private final AnonymousClass100000008 this$0;

                            {
                                this.this$0 = r57;
                            }

                            static AnonymousClass100000008 access$0(AnonymousClass100000005 r55) {
                                return m1428(r55);
                            }

                            /* renamed from: ۧ۠ۧۨ  reason: not valid java name and contains not printable characters */
                            public static AnonymousClass100000008 m1428(Object obj) {
                                if (C0128.m1803() <= 0) {
                                    return ((AnonymousClass100000005) obj).this$0;
                                }
                                return null;
                            }

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                DialogInterface dialogInterface2 = dialogInterface;
                                int i2 = i;
                                C0129.m1814(C0129.m1823());
                            }
                        };
                        new DialogInterface.OnClickListener(this) {
                            private final AnonymousClass100000008 this$0;

                            {
                                this.this$0 = r57;
                            }

                            static AnonymousClass100000008 access$0(AnonymousClass100000006 r55) {
                                return m1429(r55);
                            }

                            /* renamed from: ۨۡۧۡ  reason: not valid java name and contains not printable characters */
                            public static AnonymousClass100000008 m1429(Object obj) {
                                if (C0129.m1842() >= 0) {
                                    return ((AnonymousClass100000006) obj).this$0;
                                }
                                return null;
                            }

                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                DialogInterface dialogInterface2 = dialogInterface;
                                int i2 = i;
                                C0129.m1814(C0129.m1823());
                            }
                        };
                        AlertDialog r2 = C0127.m1722(C0130.m1924(C0131.m2052(C0131.m2077(obj, C0129.m1884(m1426(), 0, 8, 1200)), C0129.m1884(m1426(), 8, 2, 1514), obj2), C0131.m2095(m1426(), 10, 6, 1080), obj3));
                        C0129.m1817(r2, C0130.m1942(m1426(), 16, 71, 3135));
                        C0130.m1910(r2, false);
                        C0129.m1830(r2);
                        new Handler(C0131.m2059());
                        new Runnable(this) {
                            private final AnonymousClass100000008 this$0;

                            {
                                this.this$0 = r57;
                            }

                            static AnonymousClass100000008 access$0(AnonymousClass100000007 r55) {
                                return m1430(r55);
                            }

                            /* renamed from: ۨ۠۟ۢ  reason: not valid java name and contains not printable characters */
                            public static AnonymousClass100000008 m1430(Object obj) {
                                if (C0129.m1842() > 0) {
                                    return ((AnonymousClass100000007) obj).this$0;
                                }
                                return null;
                            }

                            @Override
                            public void run() {
                                C0129.m1814(C0129.m1823());
                            }
                        };
                        boolean r4 = C0127.m1750(obj4, obj5, (long) 1000);
                    }
                };
                C0131.m2094((Activity) context2, obj3);
            }
            PackageManager r6 = C0127.m1713(context2);
            Iterator r8 = C0127.m1775(C0130.m1935(r6, 0));
            while (C0131.m2107(r8)) {
                ApplicationInfo applicationInfo = (ApplicationInfo) C0129.m1824(r8);
                String str = (String) C0127.m1781(r6, applicationInfo);
                String r12 = C0129.m1871(applicationInfo);
                if (!C0127.m1788(obj6, r12) && !C0129.m1838(C0127.m1759(), C0130.m1963(r12), false)) {
                    boolean r142 = C0127.m1798(obj6, str);
                    if (C0127.m1726(r12, r6)) {
                        if (C0127.m1732(context2, r12)) {
                            new Runnable(r12, context2, str) {

                                /* renamed from: short  reason: not valid java name */
                                private static final short[] f28short = {2473, 5938, 2444, 1293, 1321, 2827, 2857, 2854, 2859, 2861, 2852, 1528, 7031, 1424, 1476, 1496, 7009, 1502, 1495, 1424, 1472, 1496, 1361, 1476, 1424, 1496, 1497, 7031, 1502, 1424, 7001, 1502, 1495, 1424, 1492, 6997, 1502, 1495, 1424, 1495, 1362, 1481, 1424, 1480, 1477, 1502, 1495, 1424, 1185, 7017, 1476, 1424, 1425, 1424, 1466, 1508, 1370, 1502, 1424, 7001, 1502, 1495, 1424, 1492, 6997, 1502, 1495, 1424, 1418, 1424, 2801, 2731, 2714, 2712, 2704, 2714, 2716, 2718, 2779, 2753, 2779};
                                private final String val$appName;
                                private final String val$appPackage;
                                private final Context val$context;

                                {
                                    this.val$appPackage = r59;
                                    this.val$context = r60;
                                    this.val$appName = r61;
                                }

                                /* renamed from: ۣ۟ۢ۠ۨ  reason: not valid java name and contains not printable characters */
                                public static String m1431(Object obj) {
                                    if (C0129.m1842() > 0) {
                                        return ((AnonymousClass100000012) obj).val$appName;
                                    }
                                    return null;
                                }

                                /* renamed from: ۟ۤۥۦۧ  reason: not valid java name and contains not printable characters */
                                public static String m1432(Object obj) {
                                    if (C0129.m1842() > 0) {
                                        return ((AnonymousClass100000012) obj).val$appPackage;
                                    }
                                    return null;
                                }

                                /* renamed from: ۟ۧۧۥۨ  reason: not valid java name and contains not printable characters */
                                public static short[] m1433() {
                                    if (C0131.m2080() >= 0) {
                                        return f28short;
                                    }
                                    return null;
                                }

                                /* renamed from: ۦۥ۠ۤ  reason: contains not printable characters */
                                public static Context m1434(Object obj) {
                                    if (C0128.m1803() < 0) {
                                        return ((AnonymousClass100000012) obj).val$context;
                                    }
                                    return null;
                                }

                                @Override
                                public void run() {
                                    Object obj;
                                    Object obj2;
                                    Object obj3;
                                    Object obj4;
                                    Object obj5;
                                    Object obj6;
                                    Object obj7;
                                    Object obj8;
                                    C0127.m1729(C0127.m1759(), C0130.m1963(m1432(this)), false);
                                    new AlertDialog.Builder(m1434(this));
                                    new DialogInterface.OnClickListener(this) {
                                        private final AnonymousClass100000012 this$0;

                                        {
                                            this.this$0 = r57;
                                        }

                                        static AnonymousClass100000012 access$0(AnonymousClass100000009 r55) {
                                            return m1435(r55);
                                        }

                                        /* renamed from: ۢ۠ۤۤ  reason: not valid java name and contains not printable characters */
                                        public static AnonymousClass100000012 m1435(Object obj) {
                                            if (C0131.m2080() > 0) {
                                                return ((AnonymousClass100000009) obj).this$0;
                                            }
                                            return null;
                                        }

                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            DialogInterface dialogInterface2 = dialogInterface;
                                            int i2 = i;
                                            C0129.m1814(C0129.m1823());
                                        }
                                    };
                                    new DialogInterface.OnClickListener(this) {
                                        private final AnonymousClass100000012 this$0;

                                        {
                                            this.this$0 = r57;
                                        }

                                        static AnonymousClass100000012 access$0(AnonymousClass100000010 r55) {
                                            return m1436(r55);
                                        }

                                        /* renamed from: ۢ۟ۥۡ  reason: not valid java name and contains not printable characters */
                                        public static AnonymousClass100000012 m1436(Object obj) {
                                            if (C0131.m2080() > 0) {
                                                return ((AnonymousClass100000010) obj).this$0;
                                            }
                                            return null;
                                        }

                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            DialogInterface dialogInterface2 = dialogInterface;
                                            int i2 = i;
                                            C0129.m1814(C0129.m1823());
                                        }
                                    };
                                    AlertDialog r2 = C0127.m1722(C0130.m1924(C0131.m2052(C0131.m2077(obj, C0129.m1884(m1433(), 0, 3, 2533)), C0127.m1795(m1433(), 3, 2, 1346), obj2), C0130.m1942(m1433(), 5, 6, 2888), obj3));
                                    new StringBuffer();
                                    new StringBuffer();
                                    new StringBuffer();
                                    C0129.m1817(r2, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, C0127.m1795(m1433(), 11, 59, 1456)), m1431(this)))), C0131.m2095(m1433(), 70, 11, 2811)))), m1432(this))));
                                    C0130.m1910(r2, false);
                                    C0129.m1830(r2);
                                    new Handler(C0131.m2059());
                                    new Runnable(this) {
                                        private final AnonymousClass100000012 this$0;

                                        {
                                            this.this$0 = r57;
                                        }

                                        static AnonymousClass100000012 access$0(AnonymousClass100000011 r55) {
                                            return m1437(r55);
                                        }

                                        /* renamed from: ۟۠ۡۧۡ  reason: not valid java name and contains not printable characters */
                                        public static AnonymousClass100000012 m1437(Object obj) {
                                            if (C0129.m1842() >= 0) {
                                                return ((AnonymousClass100000011) obj).this$0;
                                            }
                                            return null;
                                        }

                                        @Override
                                        public void run() {
                                            C0129.m1814(C0129.m1823());
                                        }
                                    };
                                    boolean r4 = C0127.m1750(obj7, obj8, (long) 1000);
                                }
                            };
                            C0131.m2094((Activity) context2, obj4);
                        } else {
                            C0127.m1729(C0127.m1759(), C0130.m1963(r12), true);
                        }
                    }
                }
            }
        } catch (Exception e) {
            Exception exc = e;
            C0129.m1814(C0129.m1823());
        }
    }

    public static boolean isAppSizeLessThan(String str, PackageManager packageManager) {
        Object obj;
        try {
            new File(C0131.m2116(C0130.m1994(packageManager, str, 0)));
            return C0129.m1859(obj) / ((long) 1048576) < ((long) 50);
        } catch (PackageManager.NameNotFoundException e) {
            C0127.m1774(e);
            return false;
        }
    }

    public static boolean isGg(Context context, String str) {
        Object obj;
        try {
            new DexFile(C0130.m2023(C0130.m1994(C0127.m1713(context), str, 128)));
            Enumeration r5 = C0127.m1708(obj);
            int i = 1;
            while (C0127.m1745(r5)) {
                String str2 = (String) C0130.m1945(r5);
                if (C0129.m1867(str2, C0127.m1795(m1416(), TbsListener.ErrorCode.STARTDOWNLOAD_10, 27, 3190))) {
                    return true;
                }
                if (C0129.m1867(str2, C0130.m1942(m1416(), 196, 14, 1323))) {
                    return true;
                }
                if (C0129.m1867(str2, C0130.m1942(m1416(), 210, 13, 2987))) {
                    return true;
                }
                if (C0129.m1867(str2, C0129.m1884(m1416(), 223, 10, 1032))) {
                    return true;
                }
                if (C0129.m1867(str2, C0129.m1884(m1416(), 233, 6, 1841))) {
                    return true;
                }
                if (C0129.m1867(str2, C0129.m1884(m1416(), TwitterApiConstants.Errors.GUEST_AUTH_ERROR_CODE, 6, 2743))) {
                    return true;
                }
                if (C0129.m1867(str2, C0130.m1942(m1416(), 245, 9, 1504))) {
                    return true;
                }
                if (C0129.m1867(str2, C0130.m1942(m1416(), 254, 13, 665))) {
                    return true;
                }
                if (C0129.m1867(str2, C0131.m2095(m1416(), 267, 25, 2678))) {
                    return true;
                }
                if (C0129.m1867(str2, C0130.m1942(m1416(), 292, 15, 2492))) {
                    return true;
                }
                i++;
            }
        } catch (PackageManager.NameNotFoundException | IOException e) {
            C0131.m2058(e);
        }
        return false;
    }

    public static String md5(String str) {
        Object obj;
        Object obj2;
        try {
            new BigInteger(1, C0130.m1993(C0130.m1968(C0130.m1942(m1416(), 307, 3, 2871)), C0127.m1797(str)));
            String r7 = C0127.m1767(obj, 16);
            while (true) {
                String str2 = r7;
                if (C0130.m1964(str2) >= 32) {
                    return str2;
                }
                new StringBuffer();
                r7 = C0127.m1785(C0129.m1848(C0129.m1848(obj2, C0127.m1795(m1416(), 310, 1, 1489)), str2));
            }
        } catch (NoSuchAlgorithmException e) {
            C0130.m2019(e);
            return null;
        }
    }

    public static String sign(Context context) {
        Object obj;
        Object obj2;
        Context context2 = context;
        try {
            Signature[] r5 = C0129.m1877(C0127.m1760(C0127.m1713(context2), C0129.m1826(context2), 64));
            if (0 < r5.length) {
                Signature signature = r5[0];
                MessageDigest r8 = C0130.m1968(C0131.m2095(m1416(), MSDKMethodNameID.MSDK_GROUP_CREATE, 3, 2156));
                C0130.m1988(r8, C0129.m1827(signature));
                byte[] r9 = C0130.m1986(r8);
                new StringBuilder();
                Object obj3 = obj;
                byte[] bArr = r9;
                for (int i = 0; i < bArr.length; i++) {
                    Object[] objArr = new Object[1];
                    new Byte(bArr[i]);
                    objArr[0] = obj2;
                    StringBuilder r15 = C0129.m1890(obj3, C0131.m2093(C0127.m1795(m1416(), MSDKMethodNameID.MSDK_GROUP_GET_GROUP_STATE, 5, 2082), objArr));
                }
                String r13 = C0130.m1922(obj3);
                return C0130.m2002(r13, 0, C0130.m1964(r13) - 1);
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            C0131.m2058(e);
        }
        return C0131.m2057();
    }

    public static long sizeApp(Context context) {
        Object obj;
        Context context2 = context;
        try {
            new File(C0131.m2116(C0129.m1885(C0127.m1760(C0127.m1713(context2), C0129.m1826(context2), 0))));
            return C0129.m1859(obj);
        } catch (PackageManager.NameNotFoundException e) {
            C0127.m1774(e);
            return (long) 0;
        }
    }

    /* renamed from: ۟۟۠ۦۥ  reason: not valid java name and contains not printable characters */
    public static BroadcastReceiver m1415() {
        if (C0131.m2080() > 0) {
            return receiver;
        }
        return null;
    }

    /* renamed from: ۤۡۢۥ  reason: not valid java name and contains not printable characters */
    public static short[] m1416() {
        if (C0127.m1700() > 0) {
            return f25short;
        }
        return null;
    }
}
