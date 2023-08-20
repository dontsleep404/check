package com.android.support;

import java.io.ByteArrayOutputStream;

/* renamed from: com.android.support.۟ۤۥۡ۟  reason: contains not printable characters */
public class C0128 {

    /* renamed from: ۣۧۡۧ  reason: not valid java name and contains not printable characters */
    public static int f57 = -18;

    /* renamed from: ۟ۦ۠ۧۡ  reason: not valid java name and contains not printable characters */
    public static int m1803() {
        return -1752584 ^ C0129.m1832((Object) "ۥۥ۠");
    }

    /* renamed from: ۣۧۡۥ  reason: not valid java name and contains not printable characters */
    public static String m1804(String str) {
        String str2 = str;
        String r3 = C0131.m2057();
        String r2 = C0131.m2057();
        for (int i = 0; i < 15; i++) {
            r3 = C0127.m1785(C0129.m1848(C0129.m1848(new StringBuffer(), r3), C0127.m1723(i)));
            r2 = C0127.m1785(C0127.m1714(C0129.m1848(new StringBuffer(), r2), ((int) (C0129.m1808() * ((double) 10))) ^ i));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(C0130.m1964(str2) / 2);
        while (C0130.m1964(str2) > 0) {
            C0130.m1965(byteArrayOutputStream, (C0131.m2056(r3, C0130.m1956(str2, -2)) << 4) | C0131.m2056(r3, C0130.m1956(str2, -1)));
        }
        byte[] r1 = C0129.m1881(byteArrayOutputStream);
        int length = r1.length;
        int r4 = C0130.m1964(r2);
        for (int i2 = 0; i2 < length; i2++) {
            r1[i2] = (byte) (r1[i2] ^ C0130.m1956(r2, i2 % r4));
        }
        return new String(r1);
    }

    /* JADX WARNING: type inference failed for: r57v0, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ۨۦۡۡ  reason: not valid java name and contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m1805(short[] r54, int r55, int r56, int r57) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.support.C0128.m1805(short[], int, int, int):java.lang.String");
    }
}
