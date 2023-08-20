package com.android.support;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;

class Utils {

    /* renamed from: short  reason: not valid java name */
    private static final short[] f54short = {1068, 1079, 1086, 1106, 1101, 1098, 1097, 2373, 2372, 2375, 2374, 2369, 2368, 2371, 2370, 2381, 2380, 2324, 2327, 2326, 2321, 2320, 2323, 2627, 2627, 2593, 2632, 2596, 2621, 2615, 2613, 2618, 2593, 2619, 2630, 2625, 2614, 2629, 2631, 3154, 3158, 3136, 1260, 1256, 1278, 1154, 1256, 1262, 1263, 1154, 1277, 1254, 1262, 1278, 1176, 1277, 1228, 1225, 1225, 1220, 1219, 1226};

    public Utils() {
    }

    static String SHA256(String str) {
        String str2 = str;
        try {
            MessageDigest r2 = C0130.m1968(C0131.m2095(m1695(), 0, 7, 1151));
            C0130.m2020(r2);
            C0130.m1988(r2, C0129.m1850(str2, C0129.m1897()));
            return C0127.m1790(m1694(C0130.m1986(r2)));
        } catch (NoSuchAlgorithmException e) {
            NoSuchAlgorithmException noSuchAlgorithmException = e;
            return null;
        }
    }

    private static String bytesToHex(byte[] bArr) {
        String str;
        byte[] bArr2 = bArr;
        char[] r2 = C0130.m1957(C0130.m1942(m1695(), 7, 16, 2421));
        char[] cArr = new char[(bArr2.length * 2)];
        for (int i = 0; i < bArr2.length; i++) {
            byte b = bArr2[i] & UByte.MAX_VALUE;
            cArr[i * 2] = r2[b >>> 4];
            cArr[(i * 2) + 1] = r2[b & 15];
        }
        new String(cArr);
        return str;
    }

    static void clearCache(Context context) {
        try {
            m1696(C0131.m2110(context));
        } catch (Exception e) {
            Exception exc = e;
        }
    }

    private static void deleteFilesInDir(File file) {
        File[] r2 = C0131.m2053(file);
        for (int i = 0; i < r2.length; i++) {
            File file2 = r2[i];
            if (C0130.m1978(file2)) {
                m1696(file2);
            }
            boolean r6 = C0130.m1982(file2);
        }
    }

    static byte[] fromBase64(String str) {
        return C0127.m1773(str, 2);
    }

    static String fromBase64String(String str) {
        String str2;
        new String(C0127.m1773(str, 2), C0129.m1897());
        return str2;
    }

    static byte[] loaderDecrypt(byte[] bArr) {
        Object obj;
        byte[] bArr2 = bArr;
        try {
            new SecretKeySpec(C0127.m1797(C0129.m1884(m1695(), 23, 16, 2673)), C0129.m1884(m1695(), 39, 3, 3091));
            Cipher r3 = C0129.m1836(C0130.m1942(m1695(), 42, 20, 1197));
            C0131.m2026(r3, 2, obj);
            return C0130.m1915(r3, bArr2);
        } catch (NoSuchAlgorithmException e) {
            C0130.m2019(e);
            return null;
        } catch (InvalidKeyException e2) {
            C0130.m1952(e2);
            return null;
        } catch (NoSuchPaddingException e3) {
            C0131.m2041(e3);
            return null;
        } catch (BadPaddingException e4) {
            C0131.m2118(e4);
            return null;
        } catch (IllegalBlockSizeException e5) {
            C0130.m1932(e5);
            return null;
        }
    }

    static String profileDecrypt(String str, String str2) {
        String str3;
        char[] r3 = C0130.m1957(str2);
        char[] r4 = C0130.m1957(m1693(str));
        for (int i = 0; i < r4.length; i++) {
            r4[i] = (char) (r3[i % r3.length] ^ r4[i]);
        }
        new String(r4);
        return str3;
    }

    /* JADX INFO: finally extract failed */
    static String readStream(InputStream inputStream) throws IOException {
        Object obj;
        Object obj2;
        Reader reader;
        Object obj3;
        InputStream inputStream2 = inputStream;
        new StringBuilder();
        Object obj4 = obj;
        Throwable th = null;
        try {
            Object obj5 = obj2;
            new InputStreamReader(inputStream2);
            new BufferedReader(reader);
            obj3 = obj5;
            String r6 = C0131.m2057();
            while (true) {
                String r13 = C0127.m1801(obj3);
                String str = r13;
                if (r13 == null) {
                    break;
                }
                StringBuilder r8 = C0129.m1890(obj4, str);
            }
            if (obj3 != null) {
                C0127.m1725(obj3);
            }
            return C0130.m1922(obj4);
        } catch (Throwable th2) {
            Throwable th3 = th2;
            if (th == null) {
                th = th3;
            } else if (th != th3) {
                C0131.m2099(th, th3);
            }
            throw th;
        }
    }

    static String toBase64(String str) {
        return C0127.m1777(C0129.m1850(str, C0129.m1897()), 2);
    }

    static String toBase64(byte[] bArr) {
        return C0127.m1777(bArr, 2);
    }

    /* renamed from: ۣ۟۟ۢ۠  reason: not valid java name and contains not printable characters */
    public static String m1693(Object obj) {
        if (C0128.m1803() <= 0) {
            return fromBase64String((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۥۢ  reason: not valid java name and contains not printable characters */
    public static String m1694(Object obj) {
        if (C0131.m2080() > 0) {
            return bytesToHex((byte[]) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۨۦ۠  reason: not valid java name and contains not printable characters */
    public static short[] m1695() {
        if (C0131.m2080() >= 0) {
            return f54short;
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۥ  reason: not valid java name and contains not printable characters */
    public static void m1696(Object obj) {
        if (C0128.m1803() < 0) {
            deleteFilesInDir((File) obj);
        }
    }
}
