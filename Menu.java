package com.android.support;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.beetalk.sdk.ShareConstants;
import com.centauri.oversea.comm.MConstants;
import com.intlgame.core.INTLMethodID;
import com.tencent.gcloud.msdk.core.MSDKMethodNameID;
import com.tencent.smtt.sdk.TbsListener;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpStatus;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class Menu {
    public static final String TAG = C0127.m1795(m1516(), 0, 8, 963);

    /* renamed from: short  reason: not valid java name */
    private static final short[] f32short = {910, 940, 935, 924, 910, 934, 941, 950, 3196, 3097, 3097, 3097, 3097, 3183, 3183, 3183, 3183, 2504, 2477, 2477, 2477, 2477, 2477, 2477, 2669, 2568, 2568, 2687, 2682, 2679, 2686, 2686, 2686, 813, 840, 840, 840, 840, 845, 831, 830, 830, 1542, 1635, 1635, 1557, 1557, 1557, 1557, 1557, 1557, 1492, 1478, 1429, 1474, 1426, 1477, 1479, 2035, 2023, 1974, 2016, 2016, 2016, 2016, 514, 533, 530, 529, 529, 529, 529, 529, 529, 363, 270, 270, 270, 270, 376, 376, 376, 376, 3111, 3138, 3138, 3138, 3138, 3124, 3124, 3124, 3124, 3159, 3148, 3140, 3127, 3126, 3127, 3136, 413, 504, 504, 504, 504, 504, 504, 2100, 2129, 2129, 2129, 2129, 2087, 2087, 2087, 2087, 1667, 1669, 1683, 1668, 2394, 2378, 2379, 2330, 2331, 2377, 2377, 1138, 1062, 1082, 1059, 1058, 1136, 581, 529, 540, 536, 541, 583, 581, 598, 529, 540, 536, 541, 583, 2079, 2113, 2124, 2119, 2138, 2051, 2128, 2135, 2138, 2127, 2118, 2078, 2049, 2126, 2114, 2129, 2116, 2122, 2125, 2073, 2051, 2067, 2072, 2051, 2131, 2114, 2119, 2119, 2122, 2125, 2116, 2073, 2051, 2067, 2049, 2077, 320, 277, 273, 283, 348, 271, 270, 287, 321, 350, 2781, 2783, 2696, 2710, 2715, 2699, 2711, 2754, 2781, 1376, 1378, 1322, 1319, 1323, 1317, 1322, 1334, 1407, 1376, 1607, 1605, 1627, 3222, 3205, 3272, 3269, 3278, 3283, 3220, 1005, 1022, 953, 933, 956, 957, 1007, 1667, 1682, 1679, 1667, 1752, 1695, 1667, 1690, 1691, 2728, 2729, 2747, 2800, 2789, 5292, 2634, 1227, 1288, 1429, 1436, -11843, -11097, 771, 802, 771, 810, 810, 787, 844, 854, 825, 824, 3056, 3050, 2949, 2956, 2956, 3259, 3242, 3242, 3242, 3292, 3243, 3232, 9826, 1023, 2812, 12129, 8514, 1233, 1087, 8620, 394, 400, 396, 470, 479, 478, 452, 400, 467, 479, 476, 479, 450, 397, 407, 1036, 1045, 495, 508, 437, 444, 445, 423, 493, 942, 948, 936, 1010, 1019, 1018, 992, 948, 1015, 1019, 1016, 1019, 998, 937, 947, 3199, 3174, 1551, 1564, 1621, 1628, 1629, 1607, 1549, 2661, 1526, 2296, 2274, 2302, 2212, 2221, 2220, 2230, 2274, 2209, 2221, 2222, 2221, 2224, 2303, 2277, 2399, 2374, 2612, 2606, 2610, 2664, 2657, 2656, 2682, 2606, 2669, 2657, 2658, 2657, 2684, 2611, 2601, 2039, 2030, 2640, 2674, 2681, 2626, 2640, 2680, 2675, 2664, 1510, 1509, 1532, 1531, 1531, 1520, 1511, 1461, 539, 2620, 995, 1986, 2016, 2027, 2000, 1986, 2026, 2017, 2042, 1900, 1917, 1888, 1900, 1847, 1904, 1900, 1909, 1908, 2829, 2828, 2846, 2901, 2880, 3179, 3168, 3142, 3137, 3153, 623, 612, 578, 581, 597, 2170, 2134, 2133, 2133, 2136, 2121, 2122, 2140, 2168, 2141, 2141, 2150, 1930, 1958, 1957, 1957, 1960, 1977, 1978, 1964, 1928, 1965, 1965, 1942, 1724, 2019, 1941, 2046, 2019, 2039, 1939, 2020, 1685, 2123, 845, 886, 894, 894, 885, 892, 1819, 1837, 1837, 1827, 1802, 1833, 1850, 1188, 1171, 1170, 1170, 1161, 1160, 2144, 2135, 2134, 2134, 2125, 2124, 2157, 2124, 2157, 2116, 2116, 3163, 3192, 3169, 3174, 3174, 3181, 3194, 3314, 3285, 3275, 3278, 3279, 3311, 3294, 3267, 3279, 3111, 3072, 3102, 3099, 3098, 3128, 3087, 3074, 3099, 3083, 1605, 1646, 1635, 1637, 1645, 1604, 1641, 1662, 564, 519, 514, 527, 521, 548, 531, 530, 530, 521, 520, 1721, 1685, 1686, 1686, 1691, 1674, 1673, 1695, 271, 312, 313, 313, 290, 291, 257, 292, 291, 294, 2779, 2809, 2796, 2813, 2815, 2807, 2794, 2785, 1452, 1431, 1437, 1430, 1450, 1435, 1414, 1418, 1448, 1431, 1435, 1417, 2590, 2597, 2607, 2596, 2587, 2601, 2606, 2586, 2597, 2601, 2619, 2875, 2860, 2874, 1398, 1394, 522, 518, 2931, 2933, 2915, 2932, 1695, 1665, 1670, 1676, 1671, 1695};
    int BTN_COLOR = C0127.m1720(C0129.m1884(m1516(), 24, 9, 2638));
    int BtnOFF = C0127.m1720(C0130.m1942(m1516(), 58, 7, 2000));
    int BtnON = C0127.m1720(C0131.m2095(m1516(), 51, 7, 1527));
    int CategoryBG = C0127.m1720(C0129.m1884(m1516(), 65, 9, 545));
    int CheckBoxColor = C0127.m1720(C0127.m1795(m1516(), 92, 7, 3188));
    float ICON_ALPHA = 0.7f;
    int ICON_SIZE = 40;
    int MENU_BG_COLOR = C0127.m1720(C0129.m1884(m1516(), 33, 9, 782));
    float MENU_CORNER = 4.0f;
    int MENU_FEATURE_BG_COLOR = C0127.m1720(C0129.m1884(m1516(), 42, 9, 1573));
    int MENU_HEIGHT = ShareConstants.ERROR_CODE.GG_RESULT_UNKNOWN_ERROR;
    int MENU_WIDTH = 350;
    String NumberTxtColor = C0127.m1795(m1516(), 106, 9, 2071);
    int POS_X = 0;
    int POS_Y = 100;
    int RadioColor = C0127.m1720(C0131.m2095(m1516(), 99, 7, 446));
    int SeekBarColor = C0127.m1720(C0131.m2095(m1516(), 74, 9, 328));
    int SeekBarProgressColor = C0127.m1720(C0129.m1884(m1516(), 83, 9, 3076));
    int TEXT_COLOR = C0127.m1720(C0130.m1942(m1516(), 8, 9, 3167));
    int TEXT_COLOR_2 = C0127.m1720(C0127.m1795(m1516(), 17, 7, 2539));
    int ToggleOFF = SupportMenu.CATEGORY_MASK;
    int ToggleON = -16711936;
    /* access modifiers changed from: private */
    public final String USER = C0127.m1795(m1516(), 115, 4, 1750);
    public JSONObject data;
    Context getContext;
    public String key;
    public String l;
    LinearLayout mCollapse;
    RelativeLayout mCollapsed;
    LinearLayout mExpanded;
    RelativeLayout mRootContainer;
    LinearLayout mSettings;
    WindowManager mWindowManager;
    LinearLayout mods;
    boolean overlayRequired;
    /* access modifiers changed from: private */
    public Prefs prefs;
    FrameLayout rootFrame;
    LinearLayout.LayoutParams scrlLL;
    LinearLayout.LayoutParams scrlLLExpanded;
    ScrollView scrollView;
    ImageView startimage;
    boolean stopChecking;
    TextView subTitle;
    TextView title;
    WindowManager.LayoutParams vmParams;

    public Menu(Context context) {
        FrameLayout frameLayout;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        LinearLayout linearLayout;
        Object obj;
        Object obj2;
        ImageView imageView;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        LinearLayout linearLayout2;
        Object obj21;
        TextView textView;
        Object obj22;
        TextView textView2;
        ScrollView scrollView2;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout linearLayout3;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        Object obj27;
        Object obj28;
        Object obj29;
        Object obj30;
        Context context2 = context;
        this.getContext = context2;
        Preferences.context = context2;
        new FrameLayout(context2);
        this.rootFrame = frameLayout;
        C0130.m1974(m1458(this), m1468(this));
        new RelativeLayout(context2);
        this.mRootContainer = relativeLayout;
        new RelativeLayout(context2);
        this.mCollapsed = relativeLayout2;
        C0129.m1844(m1500(this), 0);
        C0129.m1810(m1500(this), m1451(this));
        new LinearLayout(context2);
        this.mExpanded = linearLayout;
        C0131.m2032(m1456(this), 8);
        C0129.m1875(m1456(this), m1510(this));
        C0127.m1733(m1456(this), 1);
        new LinearLayout.LayoutParams(m1508(this, m1483(this)), -2);
        C0129.m1821(m1456(this), obj);
        new GradientDrawable();
        Object obj31 = obj2;
        C0129.m1899(obj31, m1501(this));
        C0130.m2013(obj31, m1510(this));
        C0129.m1880(obj31, 1, C0127.m1720(C0130.m1942(m1516(), 119, 7, 2425)));
        new ImageView(context2);
        this.startimage = imageView;
        new RelativeLayout.LayoutParams(-2, -2);
        C0127.m1717(m1474(this), obj3);
        int r6 = (int) C0129.m1846(1, (float) m1497(this), C0131.m2090(C0130.m1973(context2)));
        C0127.m1738(m1474(this)).height = r6;
        C0127.m1738(m1474(this)).width = r6;
        C0127.m1778(m1474(this), C0129.m1852());
        byte[] r7 = C0127.m1773(m1491(this), 0);
        C0131.m2045(m1474(this), C0127.m1744(r7, 0, r7.length));
        ((ViewGroup.MarginLayoutParams) C0127.m1738(m1474(this))).topMargin = m1512(this, 10);
        C0130.m1913(m1474(this), m1468(this));
        new View.OnClickListener(this) {
            private final Menu this$0;

            {
                this.this$0 = r57;
            }

            static Menu access$0(AnonymousClass100000000 r55) {
                return m1519(r55);
            }

            /* renamed from: ۟ۢۤۨۡ  reason: not valid java name and contains not printable characters */
            public static RelativeLayout m1517(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((Menu) obj).mCollapsed;
                }
                return null;
            }

            /* renamed from: ۤ۠ۦۨ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1518(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).mExpanded;
                }
                return null;
            }

            /* renamed from: ۨ۟ۡ۟  reason: not valid java name and contains not printable characters */
            public static Menu m1519(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000000) obj).this$0;
                }
                return null;
            }

            public void onClick(View view) {
                View view2 = view;
                C0129.m1844(m1517(m1519(this)), 8);
                C0131.m2032(m1518(m1519(this)), 0);
            }
        };
        C0130.m2005(m1474(this), obj4);
        new WebView(context2);
        Object obj32 = obj5;
        new RelativeLayout.LayoutParams(-2, -2);
        C0127.m1786(obj32, obj6);
        int r9 = (int) C0129.m1846(1, (float) m1497(this), C0131.m2090(C0130.m1973(context2)));
        C0130.m1938(obj32).height = r9;
        C0130.m1938(obj32).width = r9;
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        C0127.m1779(obj32, C0127.m1785(C0129.m1848(C0129.m1848(obj7, C0127.m1785(C0129.m1848(C0129.m1848(obj8, C0127.m1785(C0129.m1848(C0129.m1848(obj9, C0127.m1785(C0127.m1714(C0129.m1848(obj10, C0127.m1785(C0129.m1848(C0129.m1848(obj11, C0127.m1785(C0127.m1714(C0129.m1848(obj12, C0127.m1785(C0129.m1848(C0129.m1848(obj13, C0127.m1785(C0129.m1848(C0129.m1848(obj14, C0127.m1785(C0129.m1848(C0129.m1848(obj15, C0127.m1785(C0129.m1848(C0129.m1848(obj16, C0127.m1785(C0129.m1848(C0129.m1848(obj17, C0130.m1942(m1516(), 126, 6, INTLMethodID.INTL_METHOD_ID_SHOW_ALLFAQSECTIONS)), C0130.m1942(m1516(), INTLMethodID.INTL_METHOD_ID_AUTH_UNBIND, 13, 633)))), C0131.m2095(m1516(), TbsListener.ErrorCode.NEEDDOWNLOAD_6, 36, 2083)))), C0129.m1884(m1516(), ShareConstants.ERROR_CODE.GG_RESULT_NO_AUTH_HANDLER, 10, 380)))), m1471(this)))), C0131.m2095(m1516(), 191, 9, 2815)))), m1497(this)))), C0129.m1884(m1516(), 200, 10, 1346)))), m1497(this)))), C0127.m1795(m1516(), 210, 3, 1637)))), C0131.m2095(m1516(), 213, 7, 3242)))), C0127.m1795(m1516(), 220, 7, 977))), C0129.m1884(m1516(), 227, 9, 1783), C0129.m1884(m1516(), 236, 5, 2781));
        C0130.m1961(obj32, 0);
        C0131.m2047(obj32, m1451(this));
        C0130.m1911(C0129.m1870(obj32), true);
        C0131.m2105(obj32, m1468(this));
        new TextView(context2);
        Object obj33 = obj18;
        C0127.m1718(obj33, C0131.m2102() >= 23 ? C0131.m2057() : C0129.m1884(m1516(), 247, 2, 2432));
        C0127.m1736(obj33, m1514(this));
        C0127.m1772(obj33, C0129.m1891());
        C0129.m1847(obj33, 20.0f);
        new RelativeLayout.LayoutParams(-2, -2);
        Object obj34 = obj19;
        C0130.m1976(obj34, 11);
        C0131.m2086(obj33, obj34);
        new View.OnClickListener(this) {
            boolean settingsOpen;
            private final Menu this$0;

            {
                this.this$0 = r57;
            }

            static Menu access$0(AnonymousClass100000001 r55) {
                return m1524(r55);
            }

            /* renamed from: ۟۠۟ۤۡ  reason: not valid java name and contains not printable characters */
            public static ScrollView m1520(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).scrollView;
                }
                return null;
            }

            /* renamed from: ۟ۢۡ۟ۦ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1521(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).mods;
                }
                return null;
            }

            /* renamed from: ۤۦۣۢ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1522(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((Menu) obj).mSettings;
                }
                return null;
            }

            /* renamed from: ۤۧ۠  reason: not valid java name and contains not printable characters */
            public static boolean m1523(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000001) obj).settingsOpen;
                }
                return false;
            }

            /* renamed from: ۤۨۨۧ  reason: not valid java name and contains not printable characters */
            public static Menu m1524(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000001) obj).this$0;
                }
                return null;
            }

            @Override
            public void onClick(View view) {
                View view2 = view;
                try {
                    this.settingsOpen = !m1523(this);
                    if (m1523(this)) {
                        C0130.m2010(m1520(m1524(this)), m1521(m1524(this)));
                        C0130.m1928(m1520(m1524(this)), m1522(m1524(this)));
                        C0131.m2103(m1520(m1524(this)), 0, 0);
                        return;
                    }
                    C0130.m2010(m1520(m1524(this)), m1522(m1524(this)));
                    C0130.m1928(m1520(m1524(this)), m1521(m1524(this)));
                } catch (IllegalStateException e) {
                    IllegalStateException illegalStateException = e;
                }
            }
        };
        C0131.m2112(obj33, obj20);
        new LinearLayout(context2);
        this.mSettings = linearLayout2;
        C0127.m1733(m1507(this), 1);
        m1482(this, m1484(this), m1507(this));
        new RelativeLayout(context2);
        Object obj35 = obj21;
        C0130.m2022(obj35, 10, 5, 10, 5);
        C0127.m1765(obj35, 16);
        new TextView(context2);
        this.title = textView;
        C0127.m1736(m1464(this), m1514(this));
        C0129.m1847(m1464(this), 18.0f);
        C0131.m2084(m1464(this), 17);
        new RelativeLayout.LayoutParams(-2, -2);
        Object obj36 = obj22;
        C0130.m1976(obj36, 14);
        C0131.m2086(m1464(this), obj36);
        new TextView(context2);
        this.subTitle = textView2;
        C0127.m1754(m1460(this), C0130.m1989());
        C0130.m1966(m1460(this), -1);
        C0130.m1971(m1460(this), true);
        C0130.m1906(m1460(this), true);
        C0127.m1736(m1460(this), m1514(this));
        C0129.m1847(m1460(this), 11.0f);
        C0131.m2084(m1460(this), 17);
        C0130.m1951(m1460(this), 0, 0, 0, 5);
        new ScrollView(context2);
        this.scrollView = scrollView2;
        new LinearLayout.LayoutParams(-1, m1508(this, m1453(this)));
        this.scrlLL = layoutParams;
        new LinearLayout.LayoutParams(C0129.m1811(m1456(this)));
        this.scrlLLExpanded = layoutParams2;
        m1485(this).weight = 1.0f;
        C0131.m2104(m1486(this), C0130.m2012() ? m1485(this) : m1470(this));
        C0131.m2092(m1486(this), m1481(this));
        new LinearLayout(context2);
        this.mods = linearLayout3;
        C0127.m1733(m1467(this), 1);
        new RelativeLayout(context2);
        Object obj37 = obj23;
        C0130.m2022(obj37, 10, 3, 10, 3);
        C0127.m1765(obj37, 17);
        new RelativeLayout.LayoutParams(-2, -2);
        Object obj38 = obj24;
        C0130.m1976(obj38, 9);
        new Button(context2);
        Object obj39 = obj25;
        C0130.m1912(obj39, obj38);
        C0129.m1851(obj39, 0);
        C0130.m1998(obj39, C0127.m1795(m1516(), 241, 2, 2564));
        C0127.m1705(obj39, m1514(this));
        new View.OnClickListener(this) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f33short = {1254, 1228, 1216, 1217, 1167, 1223, 1222, 1227, 1227, 1226, 1217, 1153, 1167, 1277, 1226, 1218, 1226, 1218, 1229, 1226, 1245, 1167, 1243, 1223, 1226, 1167, 1223, 1222, 1227, 1227, 1226, 1217, 1167, 1222, 1228, 1216, 1217, 1167, 1247, 1216, 1244, 1222, 1243, 1222, 1216, 1217};
            private final Menu this$0;

            {
                this.this$0 = r57;
            }

            static Menu access$0(AnonymousClass100000002 r55) {
                return m1526(r55);
            }

            /* renamed from: ۟۠ۢۤ۠  reason: not valid java name and contains not printable characters */
            public static short[] m1525() {
                if (C0131.m2080() > 0) {
                    return f33short;
                }
                return null;
            }

            /* renamed from: ۟ۢۡۧۡ  reason: not valid java name and contains not printable characters */
            public static Menu m1526(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000002) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۦ۠۟۠  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1527(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((Menu) obj).mExpanded;
                }
                return null;
            }

            /* renamed from: ۦۨۥۨ  reason: contains not printable characters */
            public static RelativeLayout m1528(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((Menu) obj).mCollapsed;
                }
                return null;
            }

            public void onClick(View view) {
                C0129.m1844(m1528(m1526(this)), 0);
                C0129.m1810(m1528(m1526(this)), (float) 0);
                C0131.m2032(m1527(m1526(this)), 8);
                C0130.m2001(C0129.m1864(C0129.m1812(view), C0130.m1942(m1525(), 0, 46, 1199), 1));
            }
        };
        C0130.m1962(obj39, obj26);
        new View.OnLongClickListener(this) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f34short = {2164, 2140, 2135, 2124, 2073, 2130, 2128, 2133, 2133, 2140, 2141};
            private final Menu this$0;

            {
                this.this$0 = r57;
            }

            static Menu access$0(AnonymousClass100000003 r55) {
                return m1531(r55);
            }

            /* renamed from: ۣ۟ۡۢ۠  reason: not valid java name and contains not printable characters */
            public static short[] m1529() {
                if (C0127.m1700() >= 0) {
                    return f34short;
                }
                return null;
            }

            /* renamed from: ۟ۦۥۧ  reason: not valid java name and contains not printable characters */
            public static WindowManager m1530(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((Menu) obj).mWindowManager;
                }
                return null;
            }

            /* renamed from: ۤ  reason: not valid java name and contains not printable characters */
            public static Menu m1531(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000003) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۣۧ۟ۧ  reason: not valid java name and contains not printable characters */
            public static RelativeLayout m1532(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((Menu) obj).mRootContainer;
                }
                return null;
            }

            /* renamed from: ۧۥ۟۠  reason: not valid java name and contains not printable characters */
            public static FrameLayout m1533(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((Menu) obj).rootFrame;
                }
                return null;
            }

            public boolean onLongClick(View view) {
                C0130.m2001(C0129.m1864(C0129.m1812(view), C0129.m1884(m1529(), 0, 11, 2105), 1));
                C0129.m1866(m1533(m1531(this)), m1532(m1531(this)));
                C0129.m1895(m1530(m1531(this)), m1533(m1531(this)));
                return false;
            }
        };
        C0130.m2008(obj39, obj27);
        new RelativeLayout.LayoutParams(-2, -2);
        Object obj40 = obj28;
        C0130.m1976(obj40, 11);
        new Button(context2);
        Object obj41 = obj29;
        C0130.m1912(obj41, obj40);
        C0129.m1851(obj41, 0);
        C0130.m1998(obj41, C0129.m1884(m1516(), 243, 4, 1499));
        C0127.m1705(obj41, m1514(this));
        new View.OnClickListener(this) {
            private final Menu this$0;

            {
                this.this$0 = r57;
            }

            static Menu access$0(AnonymousClass100000004 r55) {
                return m1535(r55);
            }

            /* renamed from: ۟۟ۦۨۡ  reason: not valid java name and contains not printable characters */
            public static float m1534(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((Menu) obj).ICON_ALPHA;
                }
                return 0.0f;
            }

            /* renamed from: ۣۣ۟۠ۧ  reason: not valid java name and contains not printable characters */
            public static Menu m1535(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000004) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۥۣۡۥ  reason: not valid java name and contains not printable characters */
            public static RelativeLayout m1536(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((Menu) obj).mCollapsed;
                }
                return null;
            }

            /* renamed from: ۣۡۡۢ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1537(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((Menu) obj).mExpanded;
                }
                return null;
            }

            public void onClick(View view) {
                View view2 = view;
                C0129.m1844(m1536(m1535(this)), 0);
                C0129.m1810(m1536(m1535(this)), m1534(m1535(this)));
                C0131.m2032(m1537(m1535(this)), 8);
            }
        };
        C0130.m1962(obj41, obj30);
        C0127.m1794(m1477(this), m1500(this));
        C0127.m1794(m1477(this), m1456(this));
        if (m1471(this) != null) {
            C0127.m1794(m1500(this), obj32);
        } else {
            C0127.m1794(m1500(this), m1474(this));
        }
        C0127.m1794(obj35, m1464(this));
        C0127.m1794(obj35, obj33);
        C0130.m1933(m1456(this), obj35);
        C0130.m1933(m1456(this), m1460(this));
        C0130.m1928(m1486(this), m1467(this));
        C0130.m1933(m1456(this), m1486(this));
        C0127.m1794(obj37, obj39);
        C0127.m1794(obj37, obj41);
        C0130.m1933(m1456(this), obj37);
        m1509(this, context2, m1464(this), m1460(this));
    }

    private void Button(LinearLayout linearLayout, int i, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        String str2 = str;
        new Button(m1457(this));
        Object obj4 = obj;
        new LinearLayout.LayoutParams(-1, -1);
        Object obj5 = obj2;
        C0130.m1955(obj5, 7, 5, 7, 5);
        C0130.m1912(obj4, obj5);
        C0127.m1705(obj4, m1490(this));
        C0131.m2039(obj4, false);
        C0130.m1998(obj4, C0130.m2011(str2));
        C0129.m1851(obj4, m1503(this));
        new View.OnClickListener(this, i, str2) {
            private final Menu this$0;
            private final String val$featName;
            private final int val$featNum;

            {
                this.this$0 = r59;
                this.val$featNum = r60;
                this.val$featName = r61;
            }

            static Menu access$0(AnonymousClass100000013 r55) {
                return m1598(r55);
            }

            /* renamed from: ۟۟ۡۡۧ  reason: not valid java name and contains not printable characters */
            public static ScrollView m1596(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((Menu) obj).scrollView;
                }
                return null;
            }

            /* renamed from: ۟۠۟۠ۥ  reason: not valid java name and contains not printable characters */
            public static String m1597(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000013) obj).val$featName;
                }
                return null;
            }

            /* renamed from: ۣ۟ۡۨۨ  reason: not valid java name and contains not printable characters */
            public static Menu m1598(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000013) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۤۤۦ۠  reason: not valid java name and contains not printable characters */
            public static int m1599(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((AnonymousClass100000013) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۢۥۢۡ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1600(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).mods;
                }
                return null;
            }

            /* renamed from: ۢۧۦ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1601(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((Menu) obj).mSettings;
                }
                return null;
            }

            public void onClick(View view) {
                View view2 = view;
                switch (m1599(this)) {
                    case -100:
                        m1598(this).stopChecking = true;
                        break;
                    case -6:
                        C0130.m2010(m1596(m1598(this)), m1601(m1598(this)));
                        C0130.m1928(m1596(m1598(this)), m1600(m1598(this)));
                        break;
                }
                C0130.m1991(m1597(this), m1599(this), 0);
            }
        };
        C0130.m1962(obj4, obj3);
        C0130.m1933(linearLayout, obj4);
    }

    private void ButtonLink(LinearLayout linearLayout, String str, String str2) {
        Object obj;
        Object obj2;
        Object obj3;
        new Button(m1457(this));
        Object obj4 = obj;
        new LinearLayout.LayoutParams(-1, -1);
        Object obj5 = obj2;
        C0130.m1955(obj5, 7, 5, 7, 5);
        C0130.m1912(obj4, obj5);
        C0131.m2039(obj4, false);
        C0127.m1705(obj4, m1490(this));
        C0130.m1998(obj4, C0130.m2011(str));
        C0129.m1851(obj4, m1503(this));
        new View.OnClickListener(this, str2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f40short = {580, 587, 577, 599, 586, 588, 577, 523, 588, 587, 593, 576, 587, 593, 523, 580, 582, 593, 588, 586, 587, 523, 627, 620, 608, 626};
            private final Menu this$0;
            private final String val$url;

            {
                this.this$0 = r58;
                this.val$url = r59;
            }

            static Menu access$0(AnonymousClass100000014 r55) {
                return m1604(r55);
            }

            /* renamed from: ۣۣ۟ۡۤ  reason: not valid java name and contains not printable characters */
            public static String m1602(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000014) obj).val$url;
                }
                return null;
            }

            /* renamed from: ۟ۧۡ۟ۤ  reason: not valid java name and contains not printable characters */
            public static Context m1603(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((Menu) obj).getContext;
                }
                return null;
            }

            /* renamed from: ۣۡ۟ۢ  reason: not valid java name and contains not printable characters */
            public static Menu m1604(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((AnonymousClass100000014) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۨ۟۠ۨ  reason: not valid java name and contains not printable characters */
            public static short[] m1605() {
                if (C0128.m1803() <= 0) {
                    return f40short;
                }
                return null;
            }

            public void onClick(View view) {
                Object obj;
                View view2 = view;
                new Intent(C0127.m1795(m1605(), 0, 26, 549));
                Object obj2 = obj;
                Intent r5 = C0127.m1791(obj2, 268435456);
                Intent r52 = C0130.m2004(obj2, C0131.m2120(m1602(this)));
                C0127.m1751(m1603(m1604(this)), obj2);
            }
        };
        C0130.m1962(obj4, obj3);
        C0130.m1933(linearLayout, obj4);
    }

    private void ButtonOnOff(LinearLayout linearLayout, int i, String str, boolean z) {
        Button button;
        Object obj;
        Object obj2;
        boolean z2;
        Object obj3;
        Object obj4;
        LinearLayout linearLayout2 = linearLayout;
        int i2 = i;
        String str2 = str;
        new Button(m1457(this));
        Button button2 = button;
        new LinearLayout.LayoutParams(-1, -1);
        Object obj5 = obj;
        C0130.m1955(obj5, 7, 5, 7, 5);
        C0130.m1912(button2, obj5);
        C0127.m1705(button2, m1490(this));
        C0131.m2039(button2, false);
        String r8 = C0131.m2048(str2, C0129.m1884(m1516(), 249, 6, 844), C0131.m2057());
        if (C0131.m2117(str2, i2, z)) {
            new StringBuffer();
            C0130.m1998(button2, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj4, r8), C0129.m1884(m1516(), 255, 4, 886)))));
            C0129.m1851(button2, m1515(this));
            z2 = false;
        } else {
            new StringBuffer();
            C0130.m1998(button2, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj2, r8), C0131.m2095(m1516(), 259, 5, MConstants.MSG_PAYCHANNEL_INIT)))));
            C0129.m1851(button2, m1461(this));
            z2 = true;
        }
        new View.OnClickListener(this, z2, r8, i2, button2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f41short = {550, 572, 595, 594, 1718, 1708, 1731, 1738, 1738};
            boolean isOn = m1607(this);
            private final Menu this$0;
            private final Button val$button;
            private final int val$featNum;
            private final boolean val$finalIsOn;
            private final String val$finalfeatName;

            {
                this.this$0 = r61;
                this.val$finalIsOn = r62;
                this.val$finalfeatName = r63;
                this.val$featNum = r64;
                this.val$button = r65;
            }

            static Menu access$0(AnonymousClass100000015 r55) {
                return m1611(r55);
            }

            /* renamed from: ۣۣۣ۟۠  reason: not valid java name and contains not printable characters */
            public static String m1606(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000015) obj).val$finalfeatName;
                }
                return null;
            }

            /* renamed from: ۣۣ۟ۧ۟  reason: not valid java name and contains not printable characters */
            public static boolean m1607(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000015) obj).val$finalIsOn;
                }
                return false;
            }

            /* renamed from: ۟ۤۨۦۦ  reason: not valid java name and contains not printable characters */
            public static short[] m1608() {
                if (C0128.m1803() < 0) {
                    return f41short;
                }
                return null;
            }

            /* renamed from: ۟ۧۥۦۢ  reason: not valid java name and contains not printable characters */
            public static boolean m1609(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000015) obj).isOn;
                }
                return false;
            }

            /* renamed from: ۟ۧۧۦۧ  reason: not valid java name and contains not printable characters */
            public static int m1610(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((Menu) obj).BtnON;
                }
                return 0;
            }

            /* renamed from: ۢ۠۟  reason: not valid java name and contains not printable characters */
            public static Menu m1611(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000015) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۢۤۢۥ  reason: not valid java name and contains not printable characters */
            public static Button m1612(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000015) obj).val$button;
                }
                return null;
            }

            /* renamed from: ۣۢۥۧ  reason: not valid java name and contains not printable characters */
            public static int m1613(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000015) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۦۣ۟ۥ  reason: contains not printable characters */
            public static int m1614(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((Menu) obj).BtnOFF;
                }
                return 0;
            }

            public void onClick(View view) {
                Object obj;
                Object obj2;
                View view2 = view;
                C0127.m1716(m1606(this), m1613(this), m1609(this));
                if (m1609(this)) {
                    Button r3 = m1612(this);
                    new StringBuffer();
                    C0130.m1998(r3, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj2, m1606(this)), C0129.m1884(m1608(), 0, 4, 540)))));
                    C0129.m1851(m1612(this), m1610(m1611(this)));
                    this.isOn = false;
                    return;
                }
                Button r32 = m1612(this);
                new StringBuffer();
                C0130.m1998(r32, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj, m1606(this)), C0129.m1884(m1608(), 4, 5, 1676)))));
                C0129.m1851(m1612(this), m1614(m1611(this)));
                this.isOn = true;
            }
        };
        C0130.m1962(button2, obj3);
        C0130.m1933(linearLayout2, button2);
    }

    private void Category(LinearLayout linearLayout, String str) {
        Object obj;
        new TextView(m1457(this));
        Object obj2 = obj;
        C0127.m1721(obj2, m1513(this));
        C0127.m1718(obj2, C0130.m2011(str));
        C0131.m2084(obj2, 17);
        C0127.m1736(obj2, m1490(this));
        C0130.m1929(obj2, (Object) null, 1);
        C0130.m1951(obj2, 0, 5, 0, 5);
        C0130.m1933(linearLayout, obj2);
    }

    private void CheckBox(LinearLayout linearLayout, int i, String str, boolean z) {
        CheckBox checkBox;
        Object obj;
        LinearLayout linearLayout2 = linearLayout;
        int i2 = i;
        String str2 = str;
        boolean z2 = z;
        new CheckBox(m1457(this));
        CheckBox checkBox2 = checkBox;
        C0130.m1937(checkBox2, str2);
        C0130.m2003(checkBox2, m1490(this));
        if (C0131.m2102() >= 21) {
            C0131.m2087(checkBox2, C0131.m2064(m1505(this)));
        }
        C0130.m1917(checkBox2, C0131.m2117(str2, i2, z2));
        new CompoundButton.OnCheckedChangeListener(this, checkBox2, str2, i2) {
            private final Menu this$0;
            private final CheckBox val$checkBox;
            private final String val$featName;
            private final int val$featNum;

            {
                this.this$0 = r60;
                this.val$checkBox = r61;
                this.val$featName = r62;
                this.val$featNum = r63;
            }

            static Menu access$0(AnonymousClass100000025 r55) {
                return m1668(r55);
            }

            /* renamed from: ۟۟ۦ  reason: not valid java name and contains not printable characters */
            public static int m1667(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000025) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۟ۡۤۡۡ  reason: not valid java name and contains not printable characters */
            public static Menu m1668(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000025) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۢۦ۠ۢ  reason: not valid java name and contains not printable characters */
            public static CheckBox m1669(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000025) obj).val$checkBox;
                }
                return null;
            }

            /* renamed from: ۥۤۤۢ  reason: contains not printable characters */
            public static String m1670(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000025) obj).val$featName;
                }
                return null;
            }

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton compoundButton2 = compoundButton;
                boolean z2 = z;
                if (C0131.m2069(m1669(this))) {
                    C0127.m1716(m1670(this), m1667(this), z2);
                } else {
                    C0127.m1716(m1670(this), m1667(this), z2);
                }
            }
        };
        C0127.m1703(checkBox2, obj);
        C0130.m1933(linearLayout2, checkBox2);
    }

    private void Collapse(LinearLayout linearLayout, String str, boolean z) {
        Object obj;
        Object obj2;
        LinearLayout linearLayout2;
        TextView textView;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        LinearLayout linearLayout3 = linearLayout;
        String str2 = str;
        boolean z2 = z;
        new LinearLayout.LayoutParams(-1, -1);
        Object obj8 = obj;
        C0130.m1955(obj8, 0, 5, 0, 0);
        new LinearLayout(m1457(this));
        Object obj9 = obj2;
        C0129.m1821(obj9, obj8);
        C0130.m2017(obj9, 16);
        C0127.m1733(obj9, 1);
        new LinearLayout(m1457(this));
        LinearLayout linearLayout4 = linearLayout2;
        C0130.m2017(linearLayout4, 16);
        C0127.m1707(linearLayout4, 0, 5, 0, 5);
        C0127.m1733(linearLayout4, 1);
        C0129.m1875(linearLayout4, C0127.m1720(C0127.m1795(m1516(), 264, 7, 3224)));
        C0131.m2032(linearLayout4, 8);
        this.mCollapse = linearLayout4;
        new TextView(m1457(this));
        TextView textView2 = textView;
        C0127.m1721(textView2, m1513(this));
        new StringBuffer();
        new StringBuffer();
        C0127.m1718(textView2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0130.m1942(m1516(), 271, 2, 991)), str2))), C0131.m2095(m1516(), 273, 2, 2780))));
        C0131.m2084(textView2, 17);
        C0127.m1736(textView2, m1490(this));
        C0130.m1929(textView2, (Object) null, 1);
        C0130.m1951(textView2, 0, 20, 0, 20);
        if (z2) {
            C0131.m2032(linearLayout4, 0);
            new StringBuffer();
            new StringBuffer();
            C0127.m1718(textView2, C0127.m1785(C0129.m1848(C0129.m1848(obj6, C0127.m1785(C0129.m1848(C0129.m1848(obj7, C0129.m1884(m1516(), 275, 2, 1265)), str2))), C0131.m2095(m1516(), 277, 2, 1055))));
        }
        new View.OnClickListener(this, z2, linearLayout4, textView2, str2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f51short = {10236, 623, 2393, 11466, 10521, 3204, 2393, 11460};
            boolean isChecked = m1681(this);
            private final Menu this$0;
            private final LinearLayout val$collapseSub;
            private final boolean val$expanded;
            private final String val$text;
            private final TextView val$textView;

            {
                this.this$0 = r61;
                this.val$expanded = r62;
                this.val$collapseSub = r63;
                this.val$textView = r64;
                this.val$text = r65;
            }

            static Menu access$0(AnonymousClass100000027 r55) {
                return m1684(r55);
            }

            /* renamed from: ۟ۦۡۧۨ  reason: not valid java name and contains not printable characters */
            public static short[] m1680() {
                if (C0131.m2080() >= 0) {
                    return f51short;
                }
                return null;
            }

            /* renamed from: ۠ۤۥ  reason: not valid java name and contains not printable characters */
            public static boolean m1681(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((AnonymousClass100000027) obj).val$expanded;
                }
                return false;
            }

            /* renamed from: ۠ۨ۠ۡ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1682(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000027) obj).val$collapseSub;
                }
                return null;
            }

            /* renamed from: ۢ۟ۢۢ  reason: not valid java name and contains not printable characters */
            public static String m1683(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000027) obj).val$text;
                }
                return null;
            }

            /* renamed from: ۣ۠ۧۦ  reason: not valid java name and contains not printable characters */
            public static Menu m1684(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000027) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۧۧۨۨ  reason: not valid java name and contains not printable characters */
            public static TextView m1685(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000027) obj).val$textView;
                }
                return null;
            }

            /* renamed from: ۨۦۨ۟  reason: not valid java name and contains not printable characters */
            public static boolean m1686(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000027) obj).isChecked;
                }
                return false;
            }

            @Override
            public void onClick(View view) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                View view2 = view;
                boolean z = !m1686(this);
                this.isChecked = z;
                if (z) {
                    C0131.m2032(m1682(this), 0);
                    TextView r5 = m1685(this);
                    new StringBuffer();
                    new StringBuffer();
                    C0127.m1718(r5, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0131.m2095(m1680(), 0, 2, 591)), m1683(this)))), C0131.m2095(m1680(), 2, 2, 2425))));
                    return;
                }
                C0131.m2032(m1682(this), 8);
                TextView r52 = m1685(this);
                new StringBuffer();
                new StringBuffer();
                C0127.m1718(r52, C0127.m1785(C0129.m1848(C0129.m1848(obj, C0127.m1785(C0129.m1848(C0129.m1848(obj2, C0130.m1942(m1680(), 4, 2, 3236)), m1683(this)))), C0129.m1884(m1680(), 6, 2, 2425))));
            }
        };
        C0131.m2112(textView2, obj5);
        C0130.m1933(obj9, textView2);
        C0130.m1933(obj9, linearLayout4);
        C0130.m1933(linearLayout3, obj9);
    }

    private void InputLogin(LinearLayout linearLayout, int i, String str) {
        Object obj;
        new LinearLayout(m1457(this));
        Object obj2;
        new LinearLayout.LayoutParams(-1, -1);
        Button button;
        C0130.m1955(obj5, 7, 5, 7, 5);
        Object obj3;
        new Button(m1457(this));
        int i2 = i;
        Object obj4 = obj;
        Object obj5 = obj2;
        Button button2 = button;
        C0130.m1998(button2, C0130.m2011(str));
        C0131.m2039(button2, false);
        C0130.m1912(button2, obj5);
        C0129.m1851(button2, m1503(this));
        C0127.m1705(button2, m1490(this));
        new View.OnClickListener(this, button2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f36short = {1604, 1634, 6311, 1658, 1578, 1633, 1647, 1651, 1578, 1641, 6381, 1643, 1578, 1640, 6315, 1636, 1272, 1276, 1059, 1025, 1038, 1027, 1029, 1036};
            private final Menu this$0;
            private final Button val$button;

            {
                this.this$0 = r58;
                this.val$button = r59;
            }

            static Menu access$0(AnonymousClass100000010 r55) {
                return m1567(r55);
            }

            /* renamed from: ۣ۟۠ۤۡ  reason: not valid java name and contains not printable characters */
            public static short[] m1564() {
                if (C0131.m2080() >= 0) {
                    return f36short;
                }
                return null;
            }

            /* renamed from: ۟ۡ۠ۥ۟  reason: not valid java name and contains not printable characters */
            public static Context m1565(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((Menu) obj).getContext;
                }
                return null;
            }

            /* renamed from: ۣ۟ۢۥۨ  reason: not valid java name and contains not printable characters */
            public static boolean m1566(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((Menu) obj).overlayRequired;
                }
                return false;
            }

            /* renamed from: ۟ۤ۟ۤۧ  reason: not valid java name and contains not printable characters */
            public static Menu m1567(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((AnonymousClass100000010) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۢۥۢۤ  reason: not valid java name and contains not printable characters */
            public static Button m1568(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000010) obj).val$button;
                }
                return null;
            }

            @Override
            public void onClick(View view) {
                Object obj;
                EditText editText;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                View view2 = view;
                new AlertDialog.Builder(m1565(m1567(this)));
                Object obj6 = obj;
                new EditText(m1565(m1567(this)));
                EditText editText2 = editText;
                new View.OnFocusChangeListener(this) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f37short = {2720, 2727, 2745, 2748, 2749, 2710, 2724, 2732, 2749, 2721, 2726, 2733};
                    private final AnonymousClass100000010 this$0;

                    {
                        this.this$0 = r57;
                    }

                    static AnonymousClass100000010 access$0(AnonymousClass100000007 r55) {
                        return m1569(r55);
                    }

                    /* renamed from: ۟۠ۢۡۡ  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000010 m1569(Object obj) {
                        if (C0129.m1842() >= 0) {
                            return ((AnonymousClass100000007) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۣۣ۟ۧۡ  reason: not valid java name and contains not printable characters */
                    public static short[] m1570() {
                        if (C0131.m2080() > 0) {
                            return f37short;
                        }
                        return null;
                    }

                    /* renamed from: ۥۢ۠ۡ  reason: contains not printable characters */
                    public static Menu m1571(Object obj) {
                        if (C0129.m1842() >= 0) {
                            return AnonymousClass100000010.access$0((AnonymousClass100000010) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۣۨۤ۠  reason: not valid java name and contains not printable characters */
                    public static Context m1572(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    @Override
                    public void onFocusChange(View view, boolean z) {
                        View view2 = view;
                        InputMethodManager inputMethodManager = (InputMethodManager) C0127.m1749(m1572(m1571(m1569(this))), C0127.m1795(m1570(), 0, 12, 2761));
                        if (z) {
                            C0131.m2049(inputMethodManager, 2, 1);
                        } else {
                            C0131.m2049(inputMethodManager, 1, 0);
                        }
                    }
                };
                C0131.m2085(editText2, obj2);
                boolean r8 = C0131.m2089(editText2);
                AlertDialog.Builder r82 = C0131.m2077(obj6, "Nhập Key của bạn");
                AlertDialog.Builder r83 = C0129.m1815(obj6, editText2);
                new LinearLayout(m1565(m1567(this)));
                Object obj7 = obj3;
                C0127.m1733(obj7, 1);
                C0130.m1933(obj7, editText2);
                AlertDialog.Builder r84 = C0129.m1815(obj6, obj7);
                new DialogInterface.OnClickListener(this, editText2, m1568(this)) {
                    private final AnonymousClass100000010 this$0;
                    private final Button val$button;
                    private final EditText val$editText;

                    {
                        this.this$0 = r59;
                        this.val$editText = r60;
                        this.val$button = r61;
                    }

                    static AnonymousClass100000010 access$0(AnonymousClass100000008 r55) {
                        return m1574(r55);
                    }

                    /* renamed from: ۟ۢۨۨ۠  reason: not valid java name and contains not printable characters */
                    public static EditText m1573(Object obj) {
                        if (C0131.m2080() > 0) {
                            return ((AnonymousClass100000008) obj).val$editText;
                        }
                        return null;
                    }

                    /* renamed from: ۟ۤ۠ۦۧ  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000010 m1574(Object obj) {
                        if (C0129.m1842() >= 0) {
                            return ((AnonymousClass100000008) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۣۣۡۢ  reason: not valid java name and contains not printable characters */
                    public static Menu m1575(Object obj) {
                        if (C0129.m1842() >= 0) {
                            return AnonymousClass100000010.access$0((AnonymousClass100000010) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۣۨ۠ۧ  reason: not valid java name and contains not printable characters */
                    public static Button m1576(Object obj) {
                        if (C0131.m2080() > 0) {
                            return ((AnonymousClass100000008) obj).val$button;
                        }
                        return null;
                    }

                    /* renamed from: ۨۡ۟۟  reason: not valid java name and contains not printable characters */
                    public static Context m1577(Object obj) {
                        if (C0131.m2080() > 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        int i2 = i;
                        if (C0131.m2027(m1575(m1574(this)), m1577(m1575(m1574(this))), getKey("input"))) {
                            C0127.m1728(m1576(this), 8);
                        }
                        C0129.m1882(m1573(this), false);
                    }
                };
                AlertDialog.Builder r85 = C0131.m2052(obj6, "OK", obj4);
                new DialogInterface.OnClickListener(this) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f38short = {1661, 1658, 1636, 1633, 1632, 1611, 1657, 1649, 1632, 1660, 1659, 1648};
                    private final AnonymousClass100000010 this$0;

                    {
                        this.this$0 = r57;
                    }

                    static AnonymousClass100000010 access$0(AnonymousClass100000009 r55) {
                        return m1580(r55);
                    }

                    /* renamed from: ۣ۟۠ۨۨ  reason: not valid java name and contains not printable characters */
                    public static Context m1578(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    /* renamed from: ۣ۟۠ۨۧ  reason: not valid java name and contains not printable characters */
                    public static Menu m1579(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return AnonymousClass100000010.access$0((AnonymousClass100000010) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۟ۦۥۥ۟  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000010 m1580(Object obj) {
                        if (C0127.m1700() > 0) {
                            return ((AnonymousClass100000009) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۥۥۧۥ  reason: contains not printable characters */
                    public static short[] m1581() {
                        if (C0129.m1842() > 0) {
                            return f38short;
                        }
                        return null;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        int i2 = i;
                        C0131.m2049((InputMethodManager) C0127.m1749(m1578(m1579(m1580(this))), "input_method"), 1, 0);
                    }
                };
                AlertDialog.Builder r86 = C0130.m1924(obj6, "Cancle", obj5);
                if (m1566(m1567(this))) {
                    AlertDialog r6 = C0127.m1722(obj6);
                    C0127.m1753(C0129.m1889(r6), C0131.m2102() >= 26 ? 2038 : 2002);
                    C0129.m1830(r6);
                    return;
                }
                AlertDialog r87 = C0129.m1863(obj6);
            }
        };
        C0130.m1962(button2, obj3);
        C0130.m1933(obj4, button2);
        C0130.m1933(linearLayout, obj4);
    }

    private void InputNum(LinearLayout linearLayout, int i, String str, int i2) {
        Object obj;
        Object obj2;
        Button button;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        LinearLayout linearLayout2 = linearLayout;
        int i3 = i;
        String str2 = str;
        int i4 = i2;
        new LinearLayout(m1457(this));
        Object obj9 = obj;
        new LinearLayout.LayoutParams(-1, -1);
        Object obj10 = obj2;
        C0130.m1955(obj10, 7, 5, 7, 5);
        new Button(m1457(this));
        Button button2 = button;
        int r10 = C0129.m1809(str2, i3);
        Button button3 = button2;
        Object obj11 = obj3;
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        C0130.m1998(button3, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj11, C0127.m1785(C0127.m1714(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, C0127.m1785(C0129.m1848(C0129.m1848(obj7, str2), C0129.m1884(m1516(), 279, 15, 432)))), m1496(this)))), C0127.m1795(m1516(), 294, 2, 1067)))), r10 == 0 ? 1 : r10))), C0130.m1942(m1516(), 296, 7, 467)))));
        C0131.m2039(button2, false);
        C0130.m1912(button2, obj10);
        C0129.m1851(button2, m1503(this));
        C0127.m1705(button2, m1490(this));
        new View.OnClickListener(this, i4, button2, str2, i3) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f42short = {2034, 2014, 1991, 1951, 1993, 2014, 2003, 1994, 2010, 1925, 1951, 2397, 2396, 2399, 2398, 2393, 2392, 2395, 2394, 2389, 2388, 2368, 2680, 2655, 2625, 2628, 2629, 2577, 2655, 2628, 2652, 2643, 2644, 2627, 2049, 2053, 1812, 1846, 1849, 1844, 1842, 1851};
            private final Menu this$0;
            private final Button val$button;
            private final String val$featName;
            private final int val$featNum;
            private final int val$maxValue;

            {
                this.this$0 = r61;
                this.val$maxValue = r62;
                this.val$button = r63;
                this.val$featName = r64;
                this.val$featNum = r65;
            }

            static Menu access$0(AnonymousClass100000020 r55) {
                return m1619(r55);
            }

            /* renamed from: ۟۠ۤۥۨ  reason: not valid java name and contains not printable characters */
            public static Menu m1619(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000020) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۦۣ۟ۨ  reason: not valid java name and contains not printable characters */
            public static int m1620(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000020) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۟ۦۤۢۡ  reason: not valid java name and contains not printable characters */
            public static int m1621(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000020) obj).val$maxValue;
                }
                return 0;
            }

            /* renamed from: ۟ۧ۠ۢۢ  reason: not valid java name and contains not printable characters */
            public static Button m1622(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000020) obj).val$button;
                }
                return null;
            }

            /* renamed from: ۣۡ۟۟  reason: not valid java name and contains not printable characters */
            public static String m1623(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000020) obj).val$featName;
                }
                return null;
            }

            /* renamed from: ۥۦ۟ۧ  reason: contains not printable characters */
            public static boolean m1624(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).overlayRequired;
                }
                return false;
            }

            /* renamed from: ۦۤۤ۠  reason: contains not printable characters */
            public static short[] m1625() {
                if (C0127.m1700() >= 0) {
                    return f42short;
                }
                return null;
            }

            /* renamed from: ۨۦۦۥ  reason: not valid java name and contains not printable characters */
            public static Context m1626(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((Menu) obj).getContext;
                }
                return null;
            }

            @Override
            public void onClick(View view) {
                Object obj;
                EditText editText;
                InputFilter inputFilter;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                Object obj6;
                View view2 = view;
                new AlertDialog.Builder(m1626(m1619(this)));
                Object obj7 = obj;
                new EditText(m1626(m1619(this)));
                EditText editText2 = editText;
                if (m1621(this) != 0) {
                    new StringBuffer();
                    C0131.m2025(editText2, C0127.m1785(C0127.m1714(C0129.m1848(obj6, C0130.m1942(m1625(), 0, 11, 1983)), m1621(this))));
                }
                C0130.m2016(editText2, 2);
                C0131.m2108(editText2, C0130.m1967(C0131.m2095(m1625(), 11, 11, 2413)));
                new InputFilter.LengthFilter(10);
                C0131.m2029(editText2, new InputFilter[]{inputFilter});
                new View.OnFocusChangeListener(this) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f43short = {2852, 2851, 2877, 2872, 2873, 2834, 2848, 2856, 2873, 2853, 2850, 2857};
                    private final AnonymousClass100000020 this$0;

                    {
                        this.this$0 = r57;
                    }

                    static AnonymousClass100000020 access$0(AnonymousClass100000017 r55) {
                        return m1630(r55);
                    }

                    /* renamed from: ۟ۤۥۣۨ  reason: not valid java name and contains not printable characters */
                    public static Context m1627(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    /* renamed from: ۢۤۤۨ  reason: not valid java name and contains not printable characters */
                    public static short[] m1628() {
                        if (C0127.m1700() > 0) {
                            return f43short;
                        }
                        return null;
                    }

                    /* renamed from: ۤۤۡ۠  reason: not valid java name and contains not printable characters */
                    public static Menu m1629(Object obj) {
                        if (C0127.m1700() >= 0) {
                            return AnonymousClass100000020.access$0((AnonymousClass100000020) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۦۨۥۤ  reason: contains not printable characters */
                    public static AnonymousClass100000020 m1630(Object obj) {
                        if (C0128.m1803() <= 0) {
                            return ((AnonymousClass100000017) obj).this$0;
                        }
                        return null;
                    }

                    @Override
                    public void onFocusChange(View view, boolean z) {
                        View view2 = view;
                        InputMethodManager inputMethodManager = (InputMethodManager) C0127.m1749(m1627(m1629(m1630(this))), C0127.m1795(m1628(), 0, 12, 2893));
                        if (z) {
                            C0131.m2049(inputMethodManager, 2, 1);
                        } else {
                            C0131.m2049(inputMethodManager, 1, 0);
                        }
                    }
                };
                C0131.m2085(editText2, obj2);
                boolean r10 = C0131.m2089(editText2);
                AlertDialog.Builder r102 = C0131.m2077(obj7, C0127.m1795(m1625(), 22, 12, 2609));
                AlertDialog.Builder r103 = C0129.m1815(obj7, editText2);
                new LinearLayout(m1626(m1619(this)));
                Object obj8 = obj3;
                C0127.m1733(obj8, 1);
                C0130.m1933(obj8, editText2);
                AlertDialog.Builder r104 = C0129.m1815(obj7, obj8);
                new DialogInterface.OnClickListener(this, editText2, m1621(this), m1622(this), m1623(this), m1620(this)) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f44short = {1704, 2002, 1992, 2004, 1934, 1927, 1926, 1948, 1992, 1931, 1927, 1924, 1927, 1946, 2005, 1999, 3087, 3094, 2466, 2481, 2552, 2545, 2544, 2538, 2464};
                    private final AnonymousClass100000020 this$0;
                    private final Button val$button;
                    private final EditText val$editText;
                    private final String val$featName;
                    private final int val$featNum;
                    private final int val$maxValue;

                    {
                        this.this$0 = r62;
                        this.val$editText = r63;
                        this.val$maxValue = r64;
                        this.val$button = r65;
                        this.val$featName = r66;
                        this.val$featNum = r67;
                    }

                    static AnonymousClass100000020 access$0(AnonymousClass100000018 r55) {
                        return m1634(r55);
                    }

                    /* renamed from: ۣ۟ۥۨۡ  reason: not valid java name and contains not printable characters */
                    public static Menu m1631(Object obj) {
                        if (C0131.m2080() > 0) {
                            return AnonymousClass100000020.access$0((AnonymousClass100000020) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۣ۟ۦۣ۠  reason: not valid java name and contains not printable characters */
                    public static EditText m1632(Object obj) {
                        if (C0129.m1842() > 0) {
                            return ((AnonymousClass100000018) obj).val$editText;
                        }
                        return null;
                    }

                    /* renamed from: ۠ۡۡ۟  reason: not valid java name and contains not printable characters */
                    public static int m1633(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return ((AnonymousClass100000018) obj).val$maxValue;
                        }
                        return 0;
                    }

                    /* renamed from: ۡۥۧۧ  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000020 m1634(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return ((AnonymousClass100000018) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۣۢۡ۠  reason: not valid java name and contains not printable characters */
                    public static String m1635(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((AnonymousClass100000018) obj).val$featName;
                        }
                        return null;
                    }

                    /* renamed from: ۣۧۥۥ  reason: not valid java name and contains not printable characters */
                    public static int m1636(Object obj) {
                        if (C0128.m1803() <= 0) {
                            return ((AnonymousClass100000018) obj).val$featNum;
                        }
                        return 0;
                    }

                    /* renamed from: ۦۢ۠ۡ  reason: contains not printable characters */
                    public static Button m1637(Object obj) {
                        if (C0131.m2080() > 0) {
                            return ((AnonymousClass100000018) obj).val$button;
                        }
                        return null;
                    }

                    /* renamed from: ۣۨ۟ۥ  reason: not valid java name and contains not printable characters */
                    public static short[] m1638() {
                        if (C0129.m1842() >= 0) {
                            return f44short;
                        }
                        return null;
                    }

                    /* renamed from: ۨۧۤۤ  reason: not valid java name and contains not printable characters */
                    public static String m1639(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return ((Menu) obj).NumberTxtColor;
                        }
                        return null;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        int r4;
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        DialogInterface dialogInterface2 = dialogInterface;
                        int i2 = i;
                        try {
                            r4 = C0130.m1997(C0131.m2028(C0130.m1927(C0127.m1739(m1632(this)))) ? C0127.m1795(m1638(), 0, 1, 1688) : C0130.m1927(C0127.m1739(m1632(this))));
                            if (m1633(this) != 0 && r4 >= m1633(this)) {
                                r4 = m1633(this);
                            }
                        } catch (NumberFormatException e) {
                            NumberFormatException numberFormatException = e;
                            r4 = m1633(this) != 0 ? m1633(this) : 2147483640;
                        }
                        Button r7 = m1637(this);
                        new StringBuffer();
                        new StringBuffer();
                        new StringBuffer();
                        new StringBuffer();
                        new StringBuffer();
                        C0130.m1998(r7, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj, C0127.m1785(C0127.m1714(C0129.m1848(obj2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, m1635(this)), C0130.m1942(m1638(), 1, 15, 2024)))), m1639(m1631(m1634(this)))))), C0130.m1942(m1638(), 16, 2, 3112)))), r4))), C0127.m1795(m1638(), 18, 7, 2462)))));
                        C0130.m1991(m1635(this), m1636(this), r4);
                        C0129.m1882(m1632(this), false);
                    }
                };
                AlertDialog.Builder r105 = C0131.m2052(obj7, C0127.m1795(m1625(), 34, 2, 2126), obj4);
                new DialogInterface.OnClickListener(this) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f45short = {2162, 2165, 2155, 2158, 2159, 2116, 2166, 2174, 2159, 2163, 2164, 2175};
                    private final AnonymousClass100000020 this$0;

                    {
                        this.this$0 = r57;
                    }

                    static AnonymousClass100000020 access$0(AnonymousClass100000019 r55) {
                        return m1641(r55);
                    }

                    /* renamed from: ۟۟ۤۦ  reason: not valid java name and contains not printable characters */
                    public static short[] m1640() {
                        if (C0131.m2080() > 0) {
                            return f45short;
                        }
                        return null;
                    }

                    /* renamed from: ۟ۡۤۥۦ  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000020 m1641(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((AnonymousClass100000019) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۟ۡۦ  reason: not valid java name and contains not printable characters */
                    public static Context m1642(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    /* renamed from: ۥۡ۠ۤ  reason: contains not printable characters */
                    public static Menu m1643(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return AnonymousClass100000020.access$0((AnonymousClass100000020) obj);
                        }
                        return null;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        int i2 = i;
                        C0131.m2049((InputMethodManager) C0127.m1749(m1642(m1643(m1641(this))), C0130.m1942(m1640(), 0, 12, 2075)), 1, 0);
                    }
                };
                AlertDialog.Builder r106 = C0130.m1924(obj7, C0131.m2095(m1625(), 36, 6, 1879), obj5);
                if (m1624(m1619(this))) {
                    AlertDialog r8 = C0127.m1722(obj7);
                    C0127.m1753(C0129.m1889(r8), C0131.m2102() >= 26 ? 2038 : 2002);
                    C0129.m1830(r8);
                    return;
                }
                AlertDialog r107 = C0129.m1863(obj7);
            }
        };
        C0130.m1962(button2, obj8);
        C0130.m1933(obj9, button2);
        C0130.m1933(linearLayout2, obj9);
    }

    private void InputText(LinearLayout linearLayout, int i, String str) {
        Object obj;
        Object obj2;
        Button button;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i2 = i;
        String str2 = str;
        new LinearLayout(m1457(this));
        Object obj9 = obj;
        new LinearLayout.LayoutParams(-1, -1);
        Object obj10 = obj2;
        C0130.m1955(obj10, 7, 5, 7, 5);
        new Button(m1457(this));
        Button button2 = button;
        String r8 = C0129.m1825(str2, i2);
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        C0130.m1998(button2, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, C0127.m1785(C0129.m1848(C0129.m1848(obj7, str2), C0129.m1884(m1516(), 303, 15, 916)))), m1496(this)))), C0127.m1795(m1516(), MSDKMethodNameID.MSDK_GROUP_SEND_GROUP_MESSAGE, 2, 3160)))), r8))), C0131.m2095(m1516(), 320, 7, 1587)))));
        C0131.m2039(button2, false);
        C0130.m1912(button2, obj10);
        C0129.m1851(button2, m1503(this));
        C0127.m1705(button2, m1490(this));
        new View.OnClickListener(this, button2, str2, i2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f46short = {632, 607, 577, 580, 581, 529, 581, 596, 585, 581, 1061, 1057, 1739, 1769, 1766, 1771, 1773, 1764};
            private final Menu this$0;
            private final Button val$button;
            private final String val$featName;
            private final int val$featNum;

            {
                this.this$0 = r60;
                this.val$button = r61;
                this.val$featName = r62;
                this.val$featNum = r63;
            }

            static Menu access$0(AnonymousClass100000024 r55) {
                return m1650(r55);
            }

            /* renamed from: ۟ۡۨۧۧ  reason: not valid java name and contains not printable characters */
            public static Button m1644(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000024) obj).val$button;
                }
                return null;
            }

            /* renamed from: ۣ۟ۧ۟۠  reason: not valid java name and contains not printable characters */
            public static Context m1645(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((Menu) obj).getContext;
                }
                return null;
            }

            /* renamed from: ۢ۟ۥ۟  reason: not valid java name and contains not printable characters */
            public static boolean m1646(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((Menu) obj).overlayRequired;
                }
                return false;
            }

            /* renamed from: ۢۥ۠۟  reason: not valid java name and contains not printable characters */
            public static short[] m1647() {
                if (C0129.m1842() > 0) {
                    return f46short;
                }
                return null;
            }

            /* renamed from: ۤۥۡۢ  reason: not valid java name and contains not printable characters */
            public static int m1648(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((AnonymousClass100000024) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۧۡۧ  reason: not valid java name and contains not printable characters */
            public static String m1649(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000024) obj).val$featName;
                }
                return null;
            }

            /* renamed from: ۨۨۡۢ  reason: not valid java name and contains not printable characters */
            public static Menu m1650(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000024) obj).this$0;
                }
                return null;
            }

            @Override
            public void onClick(View view) {
                Object obj;
                EditText editText;
                Object obj2;
                Object obj3;
                Object obj4;
                Object obj5;
                View view2 = view;
                new AlertDialog.Builder(m1645(m1650(this)));
                Object obj6 = obj;
                new EditText(m1645(m1650(this)));
                EditText editText2 = editText;
                new View.OnFocusChangeListener(this) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f47short = {1063, 1056, 1086, 1083, 1082, 1041, 1059, 1067, 1082, 1062, 1057, 1066};
                    private final AnonymousClass100000024 this$0;

                    {
                        this.this$0 = r57;
                    }

                    static AnonymousClass100000024 access$0(AnonymousClass100000021 r55) {
                        return m1653(r55);
                    }

                    /* renamed from: ۟۠ۥۣ۠  reason: not valid java name and contains not printable characters */
                    public static short[] m1651() {
                        if (C0131.m2080() >= 0) {
                            return f47short;
                        }
                        return null;
                    }

                    /* renamed from: ۣ۟ۡۨ۠  reason: not valid java name and contains not printable characters */
                    public static Menu m1652(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return AnonymousClass100000024.access$0((AnonymousClass100000024) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۤۨۤۤ  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000024 m1653(Object obj) {
                        if (C0127.m1700() > 0) {
                            return ((AnonymousClass100000021) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۧۧۡۥ  reason: not valid java name and contains not printable characters */
                    public static Context m1654(Object obj) {
                        if (C0127.m1700() >= 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    @Override
                    public void onFocusChange(View view, boolean z) {
                        View view2 = view;
                        InputMethodManager inputMethodManager = (InputMethodManager) C0127.m1749(m1654(m1652(m1653(this))), C0127.m1795(m1651(), 0, 12, INTLMethodID.INTL_METHOD_ID_SHOW_ALLFAQSECTIONS));
                        if (z) {
                            C0131.m2049(inputMethodManager, 2, 1);
                        } else {
                            C0131.m2049(inputMethodManager, 1, 0);
                        }
                    }
                };
                C0131.m2085(editText2, obj2);
                boolean r9 = C0131.m2089(editText2);
                AlertDialog.Builder r92 = C0131.m2077(obj6, C0130.m1942(m1647(), 0, 10, 561));
                AlertDialog.Builder r93 = C0129.m1815(obj6, editText2);
                new LinearLayout(m1645(m1650(this)));
                Object obj7 = obj3;
                C0127.m1733(obj7, 1);
                C0130.m1933(obj7, editText2);
                AlertDialog.Builder r94 = C0129.m1815(obj6, obj7);
                new DialogInterface.OnClickListener(this, editText2, m1644(this), m1649(this), m1648(this)) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f48short = {2789, 2815, 2787, 2745, 2736, 2737, 2731, 2815, 2748, 2736, 2739, 2736, 2733, 2786, 2808, 1838, 1847, 1048, 1035, 1090, 1099, 1098, 1104, 1050};
                    private final AnonymousClass100000024 this$0;
                    private final Button val$button;
                    private final EditText val$editText;
                    private final String val$featName;
                    private final int val$featNum;

                    {
                        this.this$0 = r61;
                        this.val$editText = r62;
                        this.val$button = r63;
                        this.val$featName = r64;
                        this.val$featNum = r65;
                    }

                    static AnonymousClass100000024 access$0(AnonymousClass100000022 r55) {
                        return m1655(r55);
                    }

                    /* renamed from: ۣ۟ۢۡۢ  reason: not valid java name and contains not printable characters */
                    public static AnonymousClass100000024 m1655(Object obj) {
                        if (C0131.m2080() > 0) {
                            return ((AnonymousClass100000022) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۣ۟ۢۨۦ  reason: not valid java name and contains not printable characters */
                    public static short[] m1656() {
                        if (C0131.m2080() > 0) {
                            return f48short;
                        }
                        return null;
                    }

                    /* renamed from: ۠ۦۢۤ  reason: not valid java name and contains not printable characters */
                    public static String m1657(Object obj) {
                        if (C0129.m1842() > 0) {
                            return ((AnonymousClass100000022) obj).val$featName;
                        }
                        return null;
                    }

                    /* renamed from: ۣۤۥۦ  reason: not valid java name and contains not printable characters */
                    public static int m1658(Object obj) {
                        if (C0127.m1700() >= 0) {
                            return ((AnonymousClass100000022) obj).val$featNum;
                        }
                        return 0;
                    }

                    /* renamed from: ۥۦۤۨ  reason: contains not printable characters */
                    public static String m1659(Object obj) {
                        if (C0128.m1803() <= 0) {
                            return ((Menu) obj).NumberTxtColor;
                        }
                        return null;
                    }

                    /* renamed from: ۦۦۥۡ  reason: contains not printable characters */
                    public static Menu m1660(Object obj) {
                        if (C0131.m2080() > 0) {
                            return AnonymousClass100000024.access$0((AnonymousClass100000024) obj);
                        }
                        return null;
                    }

                    /* renamed from: ۧۡۥ۠  reason: not valid java name and contains not printable characters */
                    public static EditText m1661(Object obj) {
                        if (C0131.m2080() > 0) {
                            return ((AnonymousClass100000022) obj).val$editText;
                        }
                        return null;
                    }

                    /* renamed from: ۨۦۣۦ  reason: not valid java name and contains not printable characters */
                    public static Button m1662(Object obj) {
                        if (C0127.m1700() > 0) {
                            return ((AnonymousClass100000022) obj).val$button;
                        }
                        return null;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        Object obj5;
                        DialogInterface dialogInterface2 = dialogInterface;
                        int i2 = i;
                        String r4 = C0130.m1927(C0127.m1739(m1661(this)));
                        Button r6 = m1662(this);
                        new StringBuffer();
                        new StringBuffer();
                        new StringBuffer();
                        new StringBuffer();
                        new StringBuffer();
                        C0130.m1998(r6, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj, C0127.m1785(C0129.m1848(C0129.m1848(obj2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, m1657(this)), C0131.m2095(m1656(), 0, 15, 2783)))), m1659(m1660(m1655(this)))))), C0130.m1942(m1656(), 15, 2, 1801)))), r4))), C0127.m1795(m1656(), 17, 7, 1060)))));
                        C0130.m1923(m1657(this), m1658(this), r4);
                        C0129.m1882(m1661(this), false);
                    }
                };
                AlertDialog.Builder r95 = C0131.m2052(obj6, C0130.m1942(m1647(), 10, 2, 1130), obj4);
                new DialogInterface.OnClickListener(this) {

                    /* renamed from: short  reason: not valid java name */
                    private static final short[] f49short = {2573, 2570, 2580, 2577, 2576, 2619, 2569, 2561, 2576, 2572, 2571, 2560};
                    private final AnonymousClass100000024 this$0;

                    {
                        this.this$0 = r57;
                    }

                    static AnonymousClass100000024 access$0(AnonymousClass100000023 r55) {
                        return m1663(r55);
                    }

                    /* renamed from: ۦۨۡ  reason: contains not printable characters */
                    public static AnonymousClass100000024 m1663(Object obj) {
                        if (C0128.m1803() < 0) {
                            return ((AnonymousClass100000023) obj).this$0;
                        }
                        return null;
                    }

                    /* renamed from: ۧۢۡۧ  reason: not valid java name and contains not printable characters */
                    public static short[] m1664() {
                        if (C0129.m1842() >= 0) {
                            return f49short;
                        }
                        return null;
                    }

                    /* renamed from: ۣۧۨ  reason: not valid java name and contains not printable characters */
                    public static Context m1665(Object obj) {
                        if (C0131.m2080() >= 0) {
                            return ((Menu) obj).getContext;
                        }
                        return null;
                    }

                    /* renamed from: ۨۡۧۢ  reason: not valid java name and contains not printable characters */
                    public static Menu m1666(Object obj) {
                        if (C0128.m1803() <= 0) {
                            return AnonymousClass100000024.access$0((AnonymousClass100000024) obj);
                        }
                        return null;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        DialogInterface dialogInterface2 = dialogInterface;
                        int i2 = i;
                        C0131.m2049((InputMethodManager) C0127.m1749(m1665(m1666(m1663(this))), C0130.m1942(m1664(), 0, 12, 2660)), 1, 0);
                    }
                };
                AlertDialog.Builder r96 = C0130.m1924(obj6, C0130.m1942(m1647(), 12, 6, 1672), obj5);
                if (m1646(m1650(this))) {
                    AlertDialog r7 = C0127.m1722(obj6);
                    C0127.m1753(C0129.m1889(r7), C0131.m2102() >= 26 ? 2038 : 2002);
                    C0129.m1830(r7);
                    return;
                }
                AlertDialog r97 = C0129.m1863(obj6);
            }
        };
        C0130.m1962(button2, obj8);
        C0130.m1933(obj9, button2);
        C0130.m1933(linearLayout, obj9);
    }

    private void RadioButton(LinearLayout linearLayout, int i, String str, String str2) {
        Object obj;
        TextView textView;
        Object obj2;
        RadioGroup radioGroup;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        RadioButton radioButton;
        Object obj7;
        LinearLayout linearLayout2 = linearLayout;
        int i2 = i;
        String str3 = str;
        new LinkedList(C0130.m2000(C0131.m2070(str2, C0129.m1884(m1516(), 327, 1, 2633))));
        Object obj8 = obj;
        new TextView(m1457(this));
        TextView textView2 = textView;
        new StringBuffer();
        C0127.m1718(textView2, C0127.m1785(C0129.m1848(C0129.m1848(obj2, str3), C0130.m1942(m1516(), 328, 1, 1484))));
        C0127.m1736(textView2, m1490(this));
        new RadioGroup(m1457(this));
        RadioGroup radioGroup2 = radioGroup;
        C0131.m2055(radioGroup2, 10, 5, 10, 5);
        C0127.m1715(radioGroup2, 1);
        C0131.m2033(radioGroup2, textView2);
        for (int i3 = 0; i3 < C0131.m2037(obj8); i3++) {
            new RadioButton(m1457(this));
            RadioButton radioButton2 = radioButton;
            new View.OnClickListener(this, textView2, str3, (String) C0127.m1766(obj8, i3), i2, radioGroup2, radioButton2) {

                /* renamed from: short  reason: not valid java name */
                private static final short[] f50short = {866, 888, 868, 830, 823, 822, 812, 888, 827, 823, 820, 823, 810, 869, 895, 1650, 1643};
                private final Menu this$0;
                private final RadioButton val$Radioo;
                private final int val$featNum;
                private final String val$finalfeatName;
                private final RadioGroup val$radioGroup;
                private final String val$radioName;
                private final TextView val$textView;

                {
                    this.this$0 = r63;
                    this.val$textView = r64;
                    this.val$finalfeatName = r65;
                    this.val$radioName = r66;
                    this.val$featNum = r67;
                    this.val$radioGroup = r68;
                    this.val$Radioo = r69;
                }

                static Menu access$0(AnonymousClass100000026 r55) {
                    return m1676(r55);
                }

                /* renamed from: ۟۟ۦۡۤ  reason: not valid java name and contains not printable characters */
                public static String m1671(Object obj) {
                    if (C0129.m1842() > 0) {
                        return ((AnonymousClass100000026) obj).val$radioName;
                    }
                    return null;
                }

                /* renamed from: ۟ۢۨ۟ۥ  reason: not valid java name and contains not printable characters */
                public static String m1672(Object obj) {
                    if (C0131.m2080() > 0) {
                        return ((AnonymousClass100000026) obj).val$finalfeatName;
                    }
                    return null;
                }

                /* renamed from: ۟ۥۤۧۧ  reason: not valid java name and contains not printable characters */
                public static RadioButton m1673(Object obj) {
                    if (C0127.m1700() > 0) {
                        return ((AnonymousClass100000026) obj).val$Radioo;
                    }
                    return null;
                }

                /* renamed from: ۣۢۡۦ  reason: not valid java name and contains not printable characters */
                public static int m1674(Object obj) {
                    if (C0129.m1842() >= 0) {
                        return ((AnonymousClass100000026) obj).val$featNum;
                    }
                    return 0;
                }

                /* renamed from: ۤۢ۟ۢ  reason: not valid java name and contains not printable characters */
                public static RadioGroup m1675(Object obj) {
                    if (C0129.m1842() >= 0) {
                        return ((AnonymousClass100000026) obj).val$radioGroup;
                    }
                    return null;
                }

                /* renamed from: ۣۤۨۥ  reason: not valid java name and contains not printable characters */
                public static Menu m1676(Object obj) {
                    if (C0127.m1700() >= 0) {
                        return ((AnonymousClass100000026) obj).this$0;
                    }
                    return null;
                }

                /* renamed from: ۥۢۨ۠  reason: contains not printable characters */
                public static short[] m1677() {
                    if (C0127.m1700() > 0) {
                        return f50short;
                    }
                    return null;
                }

                /* renamed from: ۦۨۤۤ  reason: contains not printable characters */
                public static TextView m1678(Object obj) {
                    if (C0128.m1803() < 0) {
                        return ((AnonymousClass100000026) obj).val$textView;
                    }
                    return null;
                }

                /* renamed from: ۨۤۡۨ  reason: not valid java name and contains not printable characters */
                public static String m1679(Object obj) {
                    if (C0129.m1842() > 0) {
                        return ((Menu) obj).NumberTxtColor;
                    }
                    return null;
                }

                public void onClick(View view) {
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    View view2 = view;
                    TextView r3 = m1678(this);
                    new StringBuffer();
                    new StringBuffer();
                    new StringBuffer();
                    new StringBuffer();
                    C0127.m1718(r3, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj, C0127.m1785(C0129.m1848(C0129.m1848(obj2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, m1672(this)), C0131.m2095(m1677(), 0, 15, 856)))), m1679(m1676(this))))), C0131.m2095(m1677(), 15, 2, 1621)))), m1671(this)))));
                    C0130.m1991(m1672(this), m1674(this), C0131.m2040(m1675(this), m1673(this)));
                }
            };
            Object obj9 = obj7;
            C0127.m1747(C0130.m1905(), (String) C0127.m1766(obj8, i3));
            C0127.m1770(radioButton2, (String) C0127.m1766(obj8, i3));
            C0129.m1892(radioButton2, -3355444);
            if (C0131.m2102() >= 21) {
                C0129.m1860(radioButton2, C0131.m2064(m1469(this)));
            }
            C0130.m1936(radioButton2, obj9);
            C0131.m2033(radioGroup2, radioButton2);
        }
        int r11 = C0129.m1809(str3, i2);
        if (r11 > 0) {
            new StringBuffer();
            new StringBuffer();
            new StringBuffer();
            new StringBuffer();
            C0127.m1718(textView2, C0130.m2011(C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, C0127.m1785(C0129.m1848(C0129.m1848(obj6, str3), C0127.m1795(m1516(), 329, 15, 2242)))), m1496(this)))), C0131.m2095(m1516(), 344, 2, 2424)))), (String) C0127.m1766(obj8, r11 - 1)))));
            C0127.m1737((RadioButton) C0127.m1742(radioGroup2, r11), true);
        }
        C0130.m1933(linearLayout2, radioGroup2);
    }

    private void SeekBar(LinearLayout linearLayout, int i, String str, int i2, int i3) {
        Object obj;
        TextView textView;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        LinearLayout linearLayout2 = linearLayout;
        int i4 = i;
        String str2 = str;
        int i5 = i2;
        int i6 = i3;
        int r8 = C0129.m1809(str2, i4);
        new LinearLayout(m1457(this));
        Object obj8 = obj;
        C0127.m1707(obj8, 10, 5, 0, 5);
        C0127.m1733(obj8, 1);
        C0129.m1854(obj8, 17);
        new TextView(m1457(this));
        TextView textView2 = textView;
        TextView textView3 = textView2;
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        C0127.m1718(textView3, C0130.m2011(C0127.m1785(C0127.m1714(C0129.m1848(obj2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0129.m1848(C0129.m1848(obj5, str2), C0127.m1795(m1516(), 346, 15, 2574)))), m1496(this)))), C0131.m2095(m1516(), 361, 2, 2000)))), r8 == 0 ? i5 : r8))));
        C0127.m1736(textView2, m1490(this));
        new SeekBar(m1457(this));
        Object obj9 = obj6;
        C0129.m1898(obj9, 25, 10, 35, 10);
        C0127.m1762(obj9, i6);
        if (C0131.m2102() >= 26) {
            C0130.m1954(obj9, i5);
        }
        C0130.m2009(obj9, r8 == 0 ? i5 : r8);
        C0127.m1731(C0127.m1730(obj9), m1452(this), C0130.m1949());
        C0127.m1731(C0131.m2082(obj9), m1455(this), C0130.m1949());
        new SeekBar.OnSeekBarChangeListener(this, i5, str2, i4, textView2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f39short = {2072, 2050, 2078, 2116, 2125, 2124, 2134, 2050, 2113, 2125, 2126, 2125, 2128, 2079, 2053, 344, 321};
            private final Menu this$0;
            private final String val$featName;
            private final int val$featNum;
            private final int val$min;
            private final TextView val$textView;

            {
                this.this$0 = r61;
                this.val$min = r62;
                this.val$featName = r63;
                this.val$featNum = r64;
                this.val$textView = r65;
            }

            static Menu access$0(AnonymousClass100000012 r55) {
                return m1594(r55);
            }

            /* renamed from: ۟۠ۢۤۤ  reason: not valid java name and contains not printable characters */
            public static int m1589(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000012) obj).val$min;
                }
                return 0;
            }

            /* renamed from: ۣۣۣ۟۟  reason: not valid java name and contains not printable characters */
            public static TextView m1590(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000012) obj).val$textView;
                }
                return null;
            }

            /* renamed from: ۟ۤۢۨ  reason: not valid java name and contains not printable characters */
            public static String m1591(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((Menu) obj).NumberTxtColor;
                }
                return null;
            }

            /* renamed from: ۣ۟ۤۧۧ  reason: not valid java name and contains not printable characters */
            public static int m1592(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000012) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۟ۧۧۧۡ  reason: not valid java name and contains not printable characters */
            public static short[] m1593() {
                if (C0127.m1700() >= 0) {
                    return f39short;
                }
                return null;
            }

            /* renamed from: ۢۢۥ  reason: not valid java name and contains not printable characters */
            public static Menu m1594(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000012) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۨۧۡۧ  reason: not valid java name and contains not printable characters */
            public static String m1595(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((AnonymousClass100000012) obj).val$featName;
                }
                return null;
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                Object obj;
                Object obj2;
                Object obj3;
                Object obj4;
                int i2 = i;
                boolean z2 = z;
                C0130.m2009(seekBar, i2 < m1589(this) ? m1589(this) : i2);
                C0130.m1991(m1595(this), m1592(this), i2 < m1589(this) ? m1589(this) : i2);
                TextView r5 = m1590(this);
                new StringBuffer();
                new StringBuffer();
                new StringBuffer();
                new StringBuffer();
                C0127.m1718(r5, C0130.m2011(C0127.m1785(C0127.m1714(C0129.m1848(obj, C0127.m1785(C0129.m1848(C0129.m1848(obj2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, m1595(this)), C0130.m1942(m1593(), 0, 15, 2082)))), m1591(m1594(this))))), C0130.m1942(m1593(), 15, 2, 383)))), i2 < m1589(this) ? m1589(this) : i2))));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBar seekBar2 = seekBar;
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBar seekBar2 = seekBar;
            }
        };
        C0129.m1839(obj9, obj7);
        C0130.m1933(obj8, textView2);
        C0130.m1933(obj8, obj9);
        C0130.m1933(linearLayout2, obj8);
    }

    private void Spinner(LinearLayout linearLayout, int i, String str, String str2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        List list;
        Object obj6;
        Object obj7;
        Spinner spinner;
        Object obj8;
        Object obj9;
        int i2 = i;
        String str3 = str;
        String str4 = str2;
        String r12 = C0129.m1884(m1516(), 363, 8, 2589);
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        new StringBuffer();
        String r13 = C0127.m1785(C0129.m1848(C0129.m1848(obj, C0127.m1785(C0129.m1848(C0129.m1848(obj2, C0127.m1785(C0129.m1848(C0129.m1848(obj3, C0127.m1785(C0129.m1848(C0129.m1848(obj4, C0127.m1785(C0127.m1714(C0129.m1848(obj5, C0129.m1884(m1516(), 371, 8, 1429)), i2))), C0130.m1942(m1516(), 379, 1, 571)))), str3))), C0127.m1795(m1516(), 380, 1, 2588)))), str4));
        new LinkedList(C0130.m2000(C0131.m2070(str4, C0127.m1795(m1516(), 381, 1, 975))));
        new LinearLayout(m1457(this));
        Object obj10 = obj6;
        new LinearLayout.LayoutParams(-1, -2);
        Object obj11 = obj7;
        C0130.m1955(obj11, 7, 2, 7, 2);
        C0127.m1733(obj10, 1);
        C0129.m1875(obj10, m1503(this));
        C0129.m1821(obj10, obj11);
        new Spinner(m1457(this), 1);
        Spinner spinner2 = spinner;
        C0130.m1980(spinner2, obj11);
        C0127.m1731(C0127.m1799(spinner2), 1, C0130.m1949());
        new ArrayAdapter(m1457(this), 17367049, list);
        Object obj12 = obj8;
        C0130.m1970(obj12, 17367049);
        C0131.m2050(spinner2, obj12);
        C0130.m1975(spinner2, C0129.m1809(str3, i2));
        new AdapterView.OnItemSelectedListener(this, spinner2, i2) {
            private final Menu this$0;
            private final int val$featNum;
            private final Spinner val$spinner;

            {
                this.this$0 = r59;
                this.val$spinner = r60;
                this.val$featNum = r61;
            }

            static Menu access$0(AnonymousClass100000016 r55) {
                return m1616(r55);
            }

            /* renamed from: ۟ۡۦ۟ۧ  reason: not valid java name and contains not printable characters */
            public static int m1615(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((Menu) obj).TEXT_COLOR_2;
                }
                return 0;
            }

            /* renamed from: ۣ۟ۤۥۡ  reason: not valid java name and contains not printable characters */
            public static Menu m1616(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((AnonymousClass100000016) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۥۨۢۡ  reason: not valid java name and contains not printable characters */
            public static int m1617(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000016) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۟ۦ۠ۡۨ  reason: not valid java name and contains not printable characters */
            public static Spinner m1618(Object obj) {
                if (C0131.m2080() > 0) {
                    return ((AnonymousClass100000016) obj).val$spinner;
                }
                return null;
            }

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                View view2 = view;
                long j2 = j;
                C0130.m1991(C0131.m2081(C0130.m2014(m1618(this))), m1617(this), i);
                C0127.m1736((TextView) C0127.m1802(adapterView, 0), m1615(m1616(this)));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                AdapterView<?> adapterView2 = adapterView;
            }
        };
        C0131.m2044(spinner2, obj9);
        C0130.m1933(obj10, spinner2);
        C0130.m1933(linearLayout, obj10);
    }

    private void Switch(LinearLayout linearLayout, int i, String str, boolean z) {
        Switch switchR;
        Object obj;
        Object obj2;
        LinearLayout linearLayout2 = linearLayout;
        int i2 = i;
        String str2 = str;
        boolean z2 = z;
        new Switch(m1457(this));
        Switch switchR2 = switchR;
        Object obj3 = obj;
        int[][] iArr = new int[3][];
        int[][] iArr2 = iArr;
        iArr[0] = new int[]{-16842910};
        int[][] iArr3 = iArr2;
        int[][] iArr4 = iArr3;
        iArr3[1] = new int[]{16842912};
        int[][] iArr5 = iArr4;
        int[][] iArr6 = iArr5;
        iArr5[2] = new int[0];
        int[] iArr7 = new int[3];
        iArr7[0] = -16776961;
        int[] iArr8 = iArr7;
        iArr8[1] = m1463(this);
        int[] iArr9 = iArr8;
        iArr9[2] = m1459(this);
        new ColorStateList(iArr6, iArr9);
        Object obj4 = obj3;
        if (C0131.m2102() >= 21) {
            try {
                C0130.m1909(C0131.m2067(switchR2), obj4);
                C0130.m1909(C0129.m1869(switchR2), obj4);
            } catch (NullPointerException e) {
                NullPointerException nullPointerException = e;
                String r11 = C0130.m1942(m1516(), 382, 8, 1935);
                String r12 = C0131.m2079(nullPointerException);
            }
        }
        C0129.m1835(switchR2, str2);
        C0130.m2015(switchR2, m1490(this));
        C0130.m1920(switchR2, 10, 5, 0, 5);
        C0131.m2066(switchR2, C0131.m2117(str2, i2, z2));
        new CompoundButton.OnCheckedChangeListener(this, str2, i2, switchR2) {
            private final Menu this$0;
            private final String val$featName;
            private final int val$featNum;
            private final Switch val$switchR;

            {
                this.this$0 = r60;
                this.val$featName = r61;
                this.val$featNum = r62;
                this.val$switchR = r63;
            }

            static Menu access$0(AnonymousClass100000011 r55) {
                return m1583(r55);
            }

            /* renamed from: ۣ۟۟ۨۥ  reason: not valid java name and contains not printable characters */
            public static ScrollView m1582(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((Menu) obj).scrollView;
                }
                return null;
            }

            /* renamed from: ۟۠ۧۥۦ  reason: not valid java name and contains not printable characters */
            public static Menu m1583(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000011) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۢ۟۠ۧ  reason: not valid java name and contains not printable characters */
            public static String m1584(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000011) obj).val$featName;
                }
                return null;
            }

            /* renamed from: ۟ۥۥۣۢ  reason: not valid java name and contains not printable characters */
            public static LinearLayout.LayoutParams m1585(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((Menu) obj).scrlLL;
                }
                return null;
            }

            /* renamed from: ۟ۦۤۨۧ  reason: not valid java name and contains not printable characters */
            public static Switch m1586(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000011) obj).val$switchR;
                }
                return null;
            }

            /* renamed from: ۡۥۣ  reason: not valid java name and contains not printable characters */
            public static int m1587(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000011) obj).val$featNum;
                }
                return 0;
            }

            /* renamed from: ۤۨۧۨ  reason: not valid java name and contains not printable characters */
            public static LinearLayout.LayoutParams m1588(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).scrlLLExpanded;
                }
                return null;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton compoundButton2 = compoundButton;
                boolean z2 = z;
                C0127.m1716(m1584(this), m1587(this), z2);
                switch (m1587(this)) {
                    case -3:
                        Preferences.isExpanded = z2;
                        C0131.m2104(m1582(m1583(this)), z2 ? m1588(m1583(this)) : m1585(m1583(this)));
                        return;
                    case -1:
                        C0131.m2042(C0131.m2101(C0127.m1743(m1586(this))), -1, z2);
                        if (!z2) {
                            C0130.m1931(C0131.m2101(C0127.m1743(m1586(this))));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        C0127.m1701(switchR2, obj2);
        C0130.m1933(linearLayout2, switchR2);
    }

    private void TextView(LinearLayout linearLayout, String str) {
        Object obj;
        new TextView(m1457(this));
        Object obj2 = obj;
        C0127.m1718(obj2, C0130.m2011(str));
        C0127.m1736(obj2, m1490(this));
        C0130.m1951(obj2, 10, 5, 10, 5);
        C0130.m1933(linearLayout, obj2);
    }

    private void WebTextView(LinearLayout linearLayout, String str) {
        Object obj;
        new WebView(m1457(this));
        Object obj2 = obj;
        C0127.m1779(obj2, str, C0127.m1795(m1516(), 390, 9, 1816), C0131.m2095(m1516(), 399, 5, 2936));
        C0130.m1961(obj2, 0);
        C0131.m2074(obj2, 0, 5, 0, 5);
        C0130.m1911(C0129.m1870(obj2), false);
        C0130.m1933(linearLayout, obj2);
    }

    private int convertDipToPixels(int i) {
        return (int) ((((float) i) * C0131.m2061(C0131.m2090(C0130.m1973(m1457(this))))) + 0.5f);
    }

    private int dp(int i) {
        return (int) C0129.m1846(1, (float) i, C0131.m2090(C0130.m1973(m1457(this))));
    }

    private void featureList(String[] strArr, LinearLayout linearLayout) {
        int i;
        Object obj;
        String[] strArr2 = strArr;
        int i2 = 0;
        LinearLayout linearLayout2 = linearLayout;
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            boolean z = false;
            String str = strArr2[i3];
            if (C0129.m1867(str, C0127.m1795(m1516(), 404, 5, 3124))) {
                z = true;
                str = C0129.m1855(str, C0131.m2095(m1516(), 409, 5, 560), C0131.m2057());
            }
            LinearLayout linearLayout3 = linearLayout2;
            if (C0129.m1867(str, C0129.m1884(m1516(), 414, 12, 2105))) {
                linearLayout3 = m1454(this);
                str = C0129.m1855(str, C0127.m1795(m1516(), 426, 12, 1993), C0131.m2057());
            }
            String[] r10 = C0131.m2070(str, C0129.m1884(m1516(), 438, 1, 1763));
            if (C0127.m1756(r10[0]) || C0127.m1748(r10[0], C0127.m1795(m1516(), 439, 7, 1998))) {
                i = C0130.m1997(r10[0]);
                new StringBuffer();
                str = C0129.m1855(str, C0127.m1785(C0129.m1848(C0129.m1848(obj, r10[0]), C0127.m1795(m1516(), 446, 1, 1738))), C0131.m2057());
                i2++;
            } else {
                i = i3 - i2;
            }
            String[] r11 = C0131.m2070(str, C0127.m1795(m1516(), 447, 1, 2068));
            String str2 = r11[0];
            if (C0130.m1943(str2, C0130.m1942(m1516(), 448, 6, 793))) {
                m1487(this, linearLayout3, i, r11[1], z);
            } else if (C0130.m1943(str2, C0127.m1795(m1516(), 454, 7, 1864))) {
                m1475(this, linearLayout3, i, r11[1], C0130.m1997(r11[2]), C0130.m1997(r11[3]));
            } else if (C0130.m1943(str2, C0129.m1884(m1516(), 461, 6, 1254))) {
                m1472(this, linearLayout3, i, r11[1]);
            } else if (C0130.m1943(str2, C0129.m1884(m1516(), 467, 11, 2082))) {
                m1473(this, linearLayout3, i, r11[1], z);
            } else if (C0130.m1943(str2, C0130.m1942(m1516(), 478, 7, 3080))) {
                m1511(this, linearLayout3, r11[1]);
                m1465(this, linearLayout3, i, r11[1], r11[2]);
            } else if (C0130.m1943(str2, C0131.m2095(m1516(), 485, 9, 3259))) {
                m1502(this, linearLayout3, i, r11[1]);
            } else if (C0130.m1943(str2, C0129.m1884(m1516(), 494, 10, 3182))) {
                if (r11.length == 3) {
                    m1489(this, linearLayout3, i, r11[2], C0130.m1997(r11[1]));
                }
                if (r11.length == 2) {
                    m1489(this, linearLayout3, i, r11[1], 0);
                }
            } else if (C0130.m1943(str2, C0127.m1795(m1516(), HttpStatus.SC_GATEWAY_TIMEOUT, 8, 1542))) {
                m1493(this, linearLayout3, i, r11[1], z);
            } else if (C0130.m1943(str2, C0130.m1942(m1516(), 512, 11, 614))) {
                m1504(this, linearLayout3, i, r11[1], r11[2]);
            } else if (C0130.m1943(str2, C0131.m2095(m1516(), 523, 8, 1786))) {
                m1494(this, linearLayout3, r11[1], z);
                i2++;
            } else if (C0130.m1943(str2, C0129.m1884(m1516(), 531, 10, 333))) {
                i2++;
                m1495(this, linearLayout3, r11[1], r11[2]);
            } else if (C0130.m1943(str2, C0127.m1795(m1516(), 541, 8, 2712))) {
                i2++;
                m1479(this, linearLayout3, r11[1]);
            } else if (C0130.m1943(str2, C0129.m1884(m1516(), 549, 12, 1534))) {
                i2++;
                m1511(this, linearLayout3, r11[1]);
            } else if (C0130.m1943(str2, C0127.m1795(m1516(), 561, 11, 2636))) {
                i2++;
                m1492(this, linearLayout3, r11[1]);
            }
        }
    }

    private boolean isViewCollapsed() {
        return m1458(this) == null || C0130.m1999(m1500(this)) == 0;
    }

    private View.OnTouchListener onTouchListener() {
        View.OnTouchListener onTouchListener;
        new View.OnTouchListener(this) {
            final View collapsedView = m1558(m1561(this));
            final View expandedView = m1551(m1561(this));
            private float initialTouchX;
            private float initialTouchY;
            private int initialX;
            private int initialY;
            private final Menu this$0;

            {
                this.this$0 = r57;
            }

            static Menu access$0(AnonymousClass100000006 r55) {
                return m1561(r55);
            }

            /* renamed from: ۟۠ۤۨ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1551(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((Menu) obj).mExpanded;
                }
                return null;
            }

            /* renamed from: ۣ۟ۤۤ۟  reason: not valid java name and contains not printable characters */
            public static boolean m1552(Object obj) {
                if (C0129.m1842() > 0) {
                    return Menu.m1488((Menu) obj);
                }
                return false;
            }

            /* renamed from: ۟ۤۤۥۦ  reason: not valid java name and contains not printable characters */
            public static WindowManager.LayoutParams m1553(Object obj) {
                if (C0128.m1803() <= 0) {
                    return ((Menu) obj).vmParams;
                }
                return null;
            }

            /* renamed from: ۟ۤۥۥ  reason: not valid java name and contains not printable characters */
            public static float m1554(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((AnonymousClass100000006) obj).initialTouchY;
                }
                return 0.0f;
            }

            /* renamed from: ۟ۤۦۤۨ  reason: not valid java name and contains not printable characters */
            public static float m1555(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((AnonymousClass100000006) obj).initialTouchX;
                }
                return 0.0f;
            }

            /* renamed from: ۣۣ۟ۧۡ  reason: not valid java name and contains not printable characters */
            public static int m1556(Object obj) {
                if (C0129.m1842() > 0) {
                    return ((AnonymousClass100000006) obj).initialX;
                }
                return 0;
            }

            /* renamed from: ۣۣۣ۠  reason: not valid java name and contains not printable characters */
            public static FrameLayout m1557(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((Menu) obj).rootFrame;
                }
                return null;
            }

            /* renamed from: ۤۢۥۦ  reason: not valid java name and contains not printable characters */
            public static RelativeLayout m1558(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((Menu) obj).mCollapsed;
                }
                return null;
            }

            /* renamed from: ۤۥ۠  reason: not valid java name and contains not printable characters */
            public static View m1559(Object obj) {
                if (C0131.m2080() >= 0) {
                    return ((AnonymousClass100000006) obj).collapsedView;
                }
                return null;
            }

            /* renamed from: ۥۣ۟ۨ  reason: contains not printable characters */
            public static int m1560(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000006) obj).initialY;
                }
                return 0;
            }

            /* renamed from: ۧۢۤۨ  reason: not valid java name and contains not printable characters */
            public static Menu m1561(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000006) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۨ۟ۦ۟  reason: not valid java name and contains not printable characters */
            public static View m1562(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000006) obj).expandedView;
                }
                return null;
            }

            /* renamed from: ۨ۠  reason: not valid java name and contains not printable characters */
            public static WindowManager m1563(Object obj) {
                if (C0129.m1842() >= 0) {
                    return ((Menu) obj).mWindowManager;
                }
                return null;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                View view2 = view;
                MotionEvent motionEvent2 = motionEvent;
                switch (C0127.m1719(motionEvent2)) {
                    case 0:
                        this.initialX = C0129.m1887(m1553(m1561(this)));
                        this.initialY = C0129.m1896(m1553(m1561(this)));
                        this.initialTouchX = C0127.m1763(motionEvent2);
                        this.initialTouchY = C0129.m1840(motionEvent2);
                        return true;
                    case 1:
                        int r4 = (int) (C0127.m1763(motionEvent2) - m1555(this));
                        int r5 = (int) (C0129.m1840(motionEvent2) - m1554(this));
                        C0127.m1741(m1551(m1561(this)), 1.0f);
                        C0129.m1810(m1558(m1561(this)), 1.0f);
                        if (r4 < 10 && r5 < 10 && m1552(m1561(this))) {
                            try {
                                C0130.m1948(m1559(this), 8);
                                C0130.m1948(m1562(this), 0);
                            } catch (NullPointerException e) {
                                NullPointerException nullPointerException = e;
                            }
                        }
                        return true;
                    case 2:
                        C0127.m1741(m1551(m1561(this)), 0.5f);
                        C0129.m1810(m1558(m1561(this)), 0.5f);
                        m1553(m1561(this)).x = m1556(this) + ((int) (C0127.m1763(motionEvent2) - m1555(this)));
                        m1553(m1561(this)).y = m1560(this) + ((int) (C0129.m1840(motionEvent2) - m1554(this)));
                        C0129.m1819(m1563(m1561(this)), m1557(m1561(this)), m1553(m1561(this)));
                        return true;
                    default:
                        return false;
                }
            }
        };
        return onTouchListener;
    }

    /* renamed from: ۟۟ۢۧۥ  reason: not valid java name and contains not printable characters */
    public static void m1450(Object obj, Object obj2, int i, Object obj3) {
        if (C0129.m1842() > 0) {
            ((Menu) obj).InputLogin((LinearLayout) obj2, i, (String) obj3);
        }
    }

    /* renamed from: ۣ۟۟  reason: not valid java name and contains not printable characters */
    public static float m1451(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((Menu) obj).ICON_ALPHA;
        }
        return 0.0f;
    }

    /* renamed from: ۟۠ۥۦۡ  reason: not valid java name and contains not printable characters */
    public static int m1452(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).SeekBarColor;
        }
        return 0;
    }

    /* renamed from: ۟۠ۦ۠ۧ  reason: not valid java name and contains not printable characters */
    public static int m1453(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).MENU_HEIGHT;
        }
        return 0;
    }

    /* renamed from: ۟۠ۧۧ۟  reason: not valid java name and contains not printable characters */
    public static LinearLayout m1454(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).mCollapse;
        }
        return null;
    }

    /* renamed from: ۟ۡۡۥۡ  reason: not valid java name and contains not printable characters */
    public static int m1455(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).SeekBarProgressColor;
        }
        return 0;
    }

    /* renamed from: ۟ۡۦۣۤ  reason: not valid java name and contains not printable characters */
    public static LinearLayout m1456(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((Menu) obj).mExpanded;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۡ  reason: not valid java name and contains not printable characters */
    public static Context m1457(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Menu) obj).getContext;
        }
        return null;
    }

    /* renamed from: ۟ۢۢۧۤ  reason: not valid java name and contains not printable characters */
    public static FrameLayout m1458(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).rootFrame;
        }
        return null;
    }

    /* renamed from: ۟ۢۦۡۤ  reason: not valid java name and contains not printable characters */
    public static int m1459(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).ToggleOFF;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۢۡۦ  reason: not valid java name and contains not printable characters */
    public static TextView m1460(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).subTitle;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۦ  reason: not valid java name and contains not printable characters */
    public static int m1461(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).BtnOFF;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۥ۟۠  reason: not valid java name and contains not printable characters */
    public static String m1462(Object obj) {
        if (C0131.m2080() >= 0) {
            return Utils.fromBase64String((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۥۣ  reason: not valid java name and contains not printable characters */
    public static int m1463(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Menu) obj).ToggleON;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۦ۠  reason: not valid java name and contains not printable characters */
    public static TextView m1464(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Menu) obj).title;
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۢۡ  reason: not valid java name and contains not printable characters */
    public static void m1465(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        if (C0131.m2080() > 0) {
            ((Menu) obj).Spinner((LinearLayout) obj2, i, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۟ۤ۟ۦۢ  reason: not valid java name and contains not printable characters */
    public static int m1466(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).POS_X;
        }
        return 0;
    }

    /* renamed from: ۟ۤ۟ۦۣ  reason: not valid java name and contains not printable characters */
    public static LinearLayout m1467(Object obj) {
        if (C0131.m2080() >= 0) {
            return ((Menu) obj).mods;
        }
        return null;
    }

    /* renamed from: ۟ۤۦۣۧ  reason: not valid java name and contains not printable characters */
    public static View.OnTouchListener m1468(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Menu) obj).onTouchListener();
        }
        return null;
    }

    /* renamed from: ۟ۤۧۧ۠  reason: not valid java name and contains not printable characters */
    public static int m1469(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).RadioColor;
        }
        return 0;
    }

    /* renamed from: ۟ۥۢۧۨ  reason: not valid java name and contains not printable characters */
    public static LinearLayout.LayoutParams m1470(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).scrlLL;
        }
        return null;
    }

    /* renamed from: ۟ۥۥۣۦ  reason: not valid java name and contains not printable characters */
    public static String m1471(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Menu) obj).IconWebViewData();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۧۥ  reason: not valid java name and contains not printable characters */
    public static void m1472(Object obj, Object obj2, int i, Object obj3) {
        if (C0127.m1700() >= 0) {
            ((Menu) obj).Button((LinearLayout) obj2, i, (String) obj3);
        }
    }

    /* renamed from: ۟ۦ۟۠ۥ  reason: not valid java name and contains not printable characters */
    public static void m1473(Object obj, Object obj2, int i, Object obj3, boolean z) {
        if (C0127.m1700() > 0) {
            ((Menu) obj).ButtonOnOff((LinearLayout) obj2, i, (String) obj3, z);
        }
    }

    /* renamed from: ۟ۦۢۤۢ  reason: not valid java name and contains not printable characters */
    public static ImageView m1474(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).startimage;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۣ۟  reason: not valid java name and contains not printable characters */
    public static void m1475(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        if (C0128.m1803() <= 0) {
            ((Menu) obj).SeekBar((LinearLayout) obj2, i, (String) obj3, i2, i3);
        }
    }

    /* renamed from: ۟ۦۦۥۨ  reason: not valid java name and contains not printable characters */
    public static String m1476(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).USER;
        }
        return null;
    }

    /* renamed from: ۠ۢۡۨ  reason: not valid java name and contains not printable characters */
    public static RelativeLayout m1477(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).mRootContainer;
        }
        return null;
    }

    /* renamed from: ۣ۠  reason: not valid java name and contains not printable characters */
    public static String[] m1478(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).GetFeatureList();
        }
        return null;
    }

    /* renamed from: ۠ۧۤۤ  reason: not valid java name and contains not printable characters */
    public static void m1479(Object obj, Object obj2, Object obj3) {
        if (C0127.m1700() >= 0) {
            ((Menu) obj).Category((LinearLayout) obj2, (String) obj3);
        }
    }

    /* renamed from: ۠ۧۧۤ  reason: not valid java name and contains not printable characters */
    public static WindowManager.LayoutParams m1480(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).vmParams;
        }
        return null;
    }

    /* renamed from: ۣۡ۟۠  reason: not valid java name and contains not printable characters */
    public static int m1481(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).MENU_FEATURE_BG_COLOR;
        }
        return 0;
    }

    /* renamed from: ۡۦۤۧ  reason: not valid java name and contains not printable characters */
    public static void m1482(Object obj, Object obj2, Object obj3) {
        if (C0128.m1803() < 0) {
            ((Menu) obj).featureList((String[]) obj2, (LinearLayout) obj3);
        }
    }

    /* renamed from: ۡۧ۟  reason: not valid java name and contains not printable characters */
    public static int m1483(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Menu) obj).MENU_WIDTH;
        }
        return 0;
    }

    /* renamed from: ۣۡۨۢ  reason: not valid java name and contains not printable characters */
    public static String[] m1484(Object obj) {
        if (C0131.m2080() > 0) {
            return ((Menu) obj).SettingsList();
        }
        return null;
    }

    /* renamed from: ۡۨۦ  reason: not valid java name and contains not printable characters */
    public static LinearLayout.LayoutParams m1485(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).scrlLLExpanded;
        }
        return null;
    }

    /* renamed from: ۢ۟ۡۨ  reason: not valid java name and contains not printable characters */
    public static ScrollView m1486(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).scrollView;
        }
        return null;
    }

    /* renamed from: ۢۢ۠ۥ  reason: not valid java name and contains not printable characters */
    public static void m1487(Object obj, Object obj2, int i, Object obj3, boolean z) {
        if (C0129.m1842() > 0) {
            ((Menu) obj).Switch((LinearLayout) obj2, i, (String) obj3, z);
        }
    }

    /* renamed from: ۢۤ۠ۢ  reason: not valid java name and contains not printable characters */
    public static boolean m1488(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).isViewCollapsed();
        }
        return false;
    }

    /* renamed from: ۢۧ  reason: not valid java name and contains not printable characters */
    public static void m1489(Object obj, Object obj2, int i, Object obj3, int i2) {
        if (C0128.m1803() < 0) {
            ((Menu) obj).InputNum((LinearLayout) obj2, i, (String) obj3, i2);
        }
    }

    /* renamed from: ۢۧ۠ۡ  reason: not valid java name and contains not printable characters */
    public static int m1490(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).TEXT_COLOR_2;
        }
        return 0;
    }

    /* renamed from: ۢۧۥ۟  reason: not valid java name and contains not printable characters */
    public static String m1491(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).Icon();
        }
        return null;
    }

    /* renamed from: ۢۨ۠۟  reason: not valid java name and contains not printable characters */
    public static void m1492(Object obj, Object obj2, Object obj3) {
        if (C0131.m2080() > 0) {
            ((Menu) obj).WebTextView((LinearLayout) obj2, (String) obj3);
        }
    }

    /* renamed from: ۣۣ۟۟  reason: not valid java name and contains not printable characters */
    public static void m1493(Object obj, Object obj2, int i, Object obj3, boolean z) {
        if (C0128.m1803() < 0) {
            ((Menu) obj).CheckBox((LinearLayout) obj2, i, (String) obj3, z);
        }
    }

    /* renamed from: ۣ۟ۤۥ  reason: not valid java name and contains not printable characters */
    public static void m1494(Object obj, Object obj2, Object obj3, boolean z) {
        if (C0128.m1803() <= 0) {
            ((Menu) obj).Collapse((LinearLayout) obj2, (String) obj3, z);
        }
    }

    /* renamed from: ۣۣۣۥ  reason: not valid java name and contains not printable characters */
    public static void m1495(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0131.m2080() >= 0) {
            ((Menu) obj).ButtonLink((LinearLayout) obj2, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۤۢۦۦ  reason: not valid java name and contains not printable characters */
    public static String m1496(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).NumberTxtColor;
        }
        return null;
    }

    /* renamed from: ۣۤۦۡ  reason: not valid java name and contains not printable characters */
    public static int m1497(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).ICON_SIZE;
        }
        return 0;
    }

    /* renamed from: ۤۤۥ۠  reason: not valid java name and contains not printable characters */
    public static int m1498(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).POS_Y;
        }
        return 0;
    }

    /* renamed from: ۤۤۨۤ  reason: not valid java name and contains not printable characters */
    public static Prefs m1499(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).prefs;
        }
        return null;
    }

    /* renamed from: ۤۦۡۧ  reason: not valid java name and contains not printable characters */
    public static RelativeLayout m1500(Object obj) {
        if (C0128.m1803() < 0) {
            return ((Menu) obj).mCollapsed;
        }
        return null;
    }

    /* renamed from: ۥۡ۠ۡ  reason: contains not printable characters */
    public static float m1501(Object obj) {
        if (C0129.m1842() > 0) {
            return ((Menu) obj).MENU_CORNER;
        }
        return 0.0f;
    }

    /* renamed from: ۥۤۨۧ  reason: contains not printable characters */
    public static void m1502(Object obj, Object obj2, int i, Object obj3) {
        if (C0128.m1803() < 0) {
            ((Menu) obj).InputText((LinearLayout) obj2, i, (String) obj3);
        }
    }

    /* renamed from: ۥۥۨۥ  reason: contains not printable characters */
    public static int m1503(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).BTN_COLOR;
        }
        return 0;
    }

    /* renamed from: ۥۨ۟ۥ  reason: contains not printable characters */
    public static void m1504(Object obj, Object obj2, int i, Object obj3, Object obj4) {
        if (C0129.m1842() > 0) {
            ((Menu) obj).RadioButton((LinearLayout) obj2, i, (String) obj3, (String) obj4);
        }
    }

    /* renamed from: ۦ۠ۧۦ  reason: contains not printable characters */
    public static int m1505(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).CheckBoxColor;
        }
        return 0;
    }

    /* renamed from: ۦۡۥۡ  reason: contains not printable characters */
    public static WindowManager m1506(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).mWindowManager;
        }
        return null;
    }

    /* renamed from: ۦۡۦ  reason: contains not printable characters */
    public static LinearLayout m1507(Object obj) {
        if (C0128.m1803() <= 0) {
            return ((Menu) obj).mSettings;
        }
        return null;
    }

    /* renamed from: ۦۢ۠ۤ  reason: contains not printable characters */
    public static int m1508(Object obj, int i) {
        if (C0131.m2080() >= 0) {
            return ((Menu) obj).dp(i);
        }
        return 0;
    }

    /* renamed from: ۦۦۨۥ  reason: contains not printable characters */
    public static void m1509(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0129.m1842() > 0) {
            ((Menu) obj).Init((Context) obj2, (TextView) obj3, (TextView) obj4);
        }
    }

    /* renamed from: ۧ۟ۡ۟  reason: not valid java name and contains not printable characters */
    public static int m1510(Object obj) {
        if (C0127.m1700() > 0) {
            return ((Menu) obj).MENU_BG_COLOR;
        }
        return 0;
    }

    /* renamed from: ۧۧۢۦ  reason: not valid java name and contains not printable characters */
    public static void m1511(Object obj, Object obj2, Object obj3) {
        if (C0128.m1803() <= 0) {
            ((Menu) obj).TextView((LinearLayout) obj2, (String) obj3);
        }
    }

    /* renamed from: ۧۧۨۧ  reason: not valid java name and contains not printable characters */
    public static int m1512(Object obj, int i) {
        if (C0131.m2080() >= 0) {
            return ((Menu) obj).convertDipToPixels(i);
        }
        return 0;
    }

    /* renamed from: ۧۨۥۧ  reason: not valid java name and contains not printable characters */
    public static int m1513(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).CategoryBG;
        }
        return 0;
    }

    /* renamed from: ۨۢۢۡ  reason: not valid java name and contains not printable characters */
    public static int m1514(Object obj) {
        if (C0127.m1700() >= 0) {
            return ((Menu) obj).TEXT_COLOR;
        }
        return 0;
    }

    /* renamed from: ۣۨۢۡ  reason: not valid java name and contains not printable characters */
    public static int m1515(Object obj) {
        if (C0129.m1842() >= 0) {
            return ((Menu) obj).BtnON;
        }
        return 0;
    }

    /* renamed from: ۨۤۧۡ  reason: not valid java name and contains not printable characters */
    public static short[] m1516() {
        if (C0131.m2080() > 0) {
            return f32short;
        }
        return null;
    }

    public native String Check(Context context, String str);

    /* access modifiers changed from: package-private */
    public native String[] GetFeatureList();

    /* access modifiers changed from: package-private */
    public native String Icon();

    /* access modifiers changed from: package-private */
    public native String IconWebViewData();

    /* access modifiers changed from: package-private */
    public native void Init(Context context, TextView textView, TextView textView2);

    /* access modifiers changed from: package-private */
    public native boolean IsGameLibLoaded();

    public boolean Lg(Context context, String str) {
        JSONObject jSONObject;
        Context context2 = context;
        String str2 = str;
        try {
            this.l = C0127.m1782(this, m1457(this), str2);
            new JSONObject(C0130.m1918(C0131.m2091(this)));
            this.data = jSONObject;
            if (!data.res != "OK") {
                return false;
            }
            subtitle.settext decode3se64(C0131.m2081())
            menu.pref.write "USER", str2;
            m1482(this, m1478(this), m1467(this));
            return true;
        } catch (Exception e) {
            Exception exc = e;
            C0130.m2001(C0129.m1864(m1457(this), C0130.m1918(C0131.m2091(this)), 1));
            return false;
        }
    }

    @SuppressLint("WrongConstant")
    public void SetWindowManagerActivity() {
        WindowManager.LayoutParams layoutParams;
        new WindowManager.LayoutParams(-2, -2, m1466(this), m1498(this), 2, 41943304, -2);
        this.vmParams = layoutParams;
        m1480(this).gravity = 51;
        m1480(this).x = m1466(this);
        m1480(this).y = m1498(this);
        this.mWindowManager = C0127.m1793((Activity) m1457(this));
        C0127.m1787(m1506(this), m1458(this), m1480(this));
    }

    @SuppressLint("WrongConstant")
    public void SetWindowManagerWindowService() {
        WindowManager.LayoutParams layoutParams;
        new WindowManager.LayoutParams(-2, -2, C0131.m2102() >= 26 ? 2038 : 2002, 8, -3);
        this.vmParams = layoutParams;
        m1480(this).gravity = 51;
        m1480(this).x = m1466(this);
        m1480(this).y = m1498(this);
        this.mWindowManager = (WindowManager) C0127.m1749(m1457(this), C0131.m2095(m1516(), 583, 6, 1768));
        C0127.m1787(m1506(this), m1458(this), m1480(this));
        this.overlayRequired = true;
    }

    /* access modifiers changed from: package-privatef */
    public native String[] SettingsList();

    public void ShowMenu() {
        Handler handler;
        Object obj;
        C0127.m1764(m1458(this), m1477(this));
        new Handler();
        Handler handler2 = handler;
        new Runnable(this, handler2) {

            /* renamed from: short  reason: not valid java name */
            private static final short[] f35short;
            private final Menu this$0;
            private final Handler val$handler;
            boolean viewLoaded = false;

            static {
                short[] sArr = new short[ShareConstants.ERROR_CODE.GG_RESULT_NOT_SUPPORTED];
                // fill-array-data instruction
                sArr[0] = 2740;
                sArr[1] = 2694;
                sArr[2] = 2705;
                sArr[3] = 2690;
                sArr[4] = 2759;
                sArr[5] = 2711;
                sArr[6] = 2709;
                sArr[7] = 2690;
                sArr[8] = 2689;
                sArr[9] = 2690;
                sArr[10] = 2709;
                sArr[11] = 2690;
                sArr[12] = 2697;
                sArr[13] = 2692;
                sArr[14] = 2690;
                sArr[15] = 2708;
                sArr[16] = 2759;
                sArr[17] = 2704;
                sArr[18] = 2694;
                sArr[19] = 2708;
                sArr[20] = 2759;
                sArr[21] = 2693;
                sArr[22] = 2690;
                sArr[23] = 2690;
                sArr[24] = 2697;
                sArr[25] = 2759;
                sArr[26] = 2690;
                sArr[27] = 2697;
                sArr[28] = 2694;
                sArr[29] = 2693;
                sArr[30] = 2699;
                sArr[31] = 2690;
                sArr[32] = 2691;
                sArr[33] = 2761;
                sArr[34] = 2759;
                sArr[35] = 2736;
                sArr[36] = 2694;
                sArr[37] = 2702;
                sArr[38] = 2707;
                sArr[39] = 2702;
                sArr[40] = 2697;
                sArr[41] = 2688;
                sArr[42] = 2759;
                sArr[43] = 2689;
                sArr[44] = 2696;
                sArr[45] = 2709;
                sArr[46] = 2759;
                sArr[47] = 2688;
                sArr[48] = 2694;
                sArr[49] = 2698;
                sArr[50] = 2690;
                sArr[51] = 2759;
                sArr[52] = 2699;
                sArr[53] = 2702;
                sArr[54] = 2693;
                sArr[55] = 2759;
                sArr[56] = 2707;
                sArr[57] = 2696;
                sArr[58] = 2759;
                sArr[59] = 2693;
                sArr[60] = 2690;
                sArr[61] = 2759;
                sArr[62] = 2699;
                sArr[63] = 2696;
                sArr[64] = 2694;
                sArr[65] = 2691;
                sArr[66] = 2690;
                sArr[67] = 2691;
                sArr[68] = 2761;
                sArr[69] = 2761;
                sArr[70] = 2761;
                sArr[71] = 2797;
                sArr[72] = 2797;
                sArr[73] = 2721;
                sArr[74] = 2696;
                sArr[75] = 2709;
                sArr[76] = 2692;
                sArr[77] = 2690;
                sArr[78] = 2759;
                sArr[79] = 2699;
                sArr[80] = 2696;
                sArr[81] = 2694;
                sArr[82] = 2691;
                sArr[83] = 2759;
                sArr[84] = 2698;
                sArr[85] = 2690;
                sArr[86] = 2697;
                sArr[87] = 2706;
                sArr[88] = 2759;
                sArr[89] = 2698;
                sArr[90] = 2694;
                sArr[91] = 2718;
                sArr[92] = 2759;
                sArr[93] = 2697;
                sArr[94] = 2696;
                sArr[95] = 2707;
                sArr[96] = 2759;
                sArr[97] = 2694;
                sArr[98] = 2711;
                sArr[99] = 2711;
                sArr[100] = 2699;
                sArr[101] = 2718;
                sArr[102] = 2759;
                sArr[103] = 2698;
                sArr[104] = 2696;
                sArr[105] = 2691;
                sArr[106] = 2708;
                sArr[107] = 2759;
                sArr[108] = 2702;
                sArr[109] = 2697;
                sArr[110] = 2708;
                sArr[111] = 2707;
                sArr[112] = 2694;
                sArr[113] = 2697;
                sArr[114] = 2707;
                sArr[115] = 2699;
                sArr[116] = 2718;
                sArr[117] = 2761;
                sArr[118] = 2759;
                sArr[119] = 2750;
                sArr[120] = 2696;
                sArr[121] = 2706;
                sArr[122] = 2759;
                sArr[123] = 2704;
                sArr[124] = 2696;
                sArr[125] = 2706;
                sArr[126] = 2699;
                sArr[127] = 2691;
                sArr[128] = 2759;
                sArr[129] = 2697;
                sArr[130] = 2690;
                sArr[131] = 2690;
                sArr[132] = 2691;
                sArr[133] = 2759;
                sArr[134] = 2707;
                sArr[135] = 2696;
                sArr[136] = 2759;
                sArr[137] = 2709;
                sArr[138] = 2690;
                sArr[139] = 2694;
                sArr[140] = 2692;
                sArr[141] = 2707;
                sArr[142] = 2702;
                sArr[143] = 2705;
                sArr[144] = 2694;
                sArr[145] = 2707;
                sArr[146] = 2690;
                sArr[147] = 2759;
                sArr[148] = 2707;
                sArr[149] = 2703;
                sArr[150] = 2690;
                sArr[151] = 2698;
                sArr[152] = 2759;
                sArr[153] = 2694;
                sArr[154] = 2688;
                sArr[155] = 2694;
                sArr[156] = 2702;
                sArr[157] = 2697;
                sArr[158] = 2235;
                sArr[159] = 2194;
                sArr[160] = 2191;
                sArr[161] = 2206;
                sArr[162] = 2200;
                sArr[163] = 2269;
                sArr[164] = 2193;
                sArr[165] = 2194;
                sArr[166] = 2204;
                sArr[167] = 2201;
                sArr[168] = 2269;
                sArr[169] = 2192;
                sArr[170] = 2200;
                sArr[171] = 2195;
                sArr[172] = 2184;
                sArr[173] = 607;
                sArr[174] = 601;
                sArr[175] = 591;
                sArr[176] = 600;
                sArr[177] = 2163;
                sArr[178] = 2160;
                sArr[179] = 2168;
                sArr[180] = 2166;
                sArr[181] = 2161;
                sArr[182] = 2202;
                sArr[183] = 2201;
                sArr[184] = 2193;
                sArr[185] = 2207;
                sArr[186] = 2200;
                f35short = sArr;
            }

            {
                this.this$0 = r58;
                this.val$handler = r59;
            }

            static Menu access$0(AnonymousClass100000005 r55) {
                return m1542(r55);
            }

            /* renamed from: ۟ۡ۠۟ۨ  reason: not valid java name and contains not printable characters */
            public static Context m1538(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((Menu) obj).getContext;
                }
                return null;
            }

            /* renamed from: ۣ۟ۤۦۥ  reason: not valid java name and contains not printable characters */
            public static boolean m1539(Object obj) {
                if (C0127.m1700() >= 0) {
                    return ((Menu) obj).stopChecking;
                }
                return false;
            }

            /* renamed from: ۣ۟ۥۦۧ  reason: not valid java name and contains not printable characters */
            public static void m1540(Object obj, Object obj2, int i, Object obj3) {
                if (C0128.m1803() <= 0) {
                    Menu.m1450((Menu) obj, (LinearLayout) obj2, i, (String) obj3);
                }
            }

            /* renamed from: ۣ۟ۦۡۦ  reason: not valid java name and contains not printable characters */
            public static boolean m1541(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((Menu) obj).IsGameLibLoaded();
                }
                return false;
            }

            /* renamed from: ۣۣ۟ۧۧ  reason: not valid java name and contains not printable characters */
            public static Menu m1542(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000005) obj).this$0;
                }
                return null;
            }

            /* renamed from: ۟ۤۨۢۦ  reason: not valid java name and contains not printable characters */
            public static boolean m1543(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((AnonymousClass100000005) obj).viewLoaded;
                }
                return false;
            }

            /* renamed from: ۠ۡۤۨ  reason: not valid java name and contains not printable characters */
            public static LinearLayout m1544(Object obj) {
                if (C0128.m1803() < 0) {
                    return ((Menu) obj).mods;
                }
                return null;
            }

            /* renamed from: ۠ۢۤ۠  reason: not valid java name and contains not printable characters */
            public static Prefs m1545(Object obj) {
                if (C0128.m1803() < 0) {
                    return Menu.m1499((Menu) obj);
                }
                return null;
            }

            /* renamed from: ۢ۟ۦۣ  reason: not valid java name and contains not printable characters */
            public static void m1546(Object obj, Object obj2, int i, Object obj3) {
                if (C0127.m1700() > 0) {
                    Menu.m1472((Menu) obj, (LinearLayout) obj2, i, (String) obj3);
                }
            }

            /* renamed from: ۣۡۧۧ  reason: not valid java name and contains not printable characters */
            public static short[] m1547() {
                if (C0127.m1700() >= 0) {
                    return f35short;
                }
                return null;
            }

            /* renamed from: ۤۢۤۤ  reason: not valid java name and contains not printable characters */
            public static void m1548(Object obj, Object obj2) {
                if (C0129.m1842() > 0) {
                    ((Menu) obj).prefs = (Prefs) obj2;
                }
            }

            /* renamed from: ۦۥۣۥ  reason: contains not printable characters */
            public static Handler m1549(Object obj) {
                if (C0127.m1700() > 0) {
                    return ((AnonymousClass100000005) obj).val$handler;
                }
                return null;
            }

            /* renamed from: ۧۧۧۨ  reason: not valid java name and contains not printable characters */
            public static void m1550(Object obj, Object obj2, Object obj3) {
                if (C0128.m1803() <= 0) {
                    Menu.m1479((Menu) obj, (LinearLayout) obj2, (String) obj3);
                }
            }

            @Override
            public void run() {
                if (!C0129.m1857() || m1541(m1542(this)) || m1539(m1542(this))) {
                    C0131.m2046(m1544(m1542(this))); // remove all view
                    m1548(m1542(this), C0131.m2062(m1538(m1542(this))));
                    m1542(this).key = C0131.m2119(m1545(m1542(this)), "USER", C0131.m2057());
                    if (C0130.m1943(C0127.m1702(m1542(this)), C0131.m2057())) { // key = "" 
                        m1540(m1542(this), m1544(m1542(this)), 1, "USER"); // InputLogin
                    } else if (!C0131.m2027(m1542(this), m1538(m1542(this)), C0127.m1702(m1542(this)))) {
                        m1540(m1542(this), m1544(m1542(this)), 1, "USER"); // InputLogin
                    }
                } else {
                    if (!m1543(this)) {
                        m1550(m1542(this), m1544(m1542(this)), C0127.m1795(m1547(), 0, 158, 2791));
                        m1546(m1542(this), m1544(m1542(this)), -100, C0130.m1942(m1547(), 158, 15, 2301));
                        this.viewLoaded = true;
                    }
                    boolean r2 = C0127.m1750(m1549(this), this, (long) IjkMediaCodecInfo.RANK_LAST_CHANCE);
                }
            }
        };
        boolean r4 = C0127.m1750(handler2, obj, (long) 500);
    }

    public void onDestroy() {
        if (m1458(this) != null) {
            C0129.m1895(m1506(this), m1458(this));
        }
    }

    public void setVisibility(int i) {
        int i2 = i;
        if (m1458(this) != null) {
            C0127.m1792(m1458(this), i2);
        }
    }
}
