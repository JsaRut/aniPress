package p031c.p032a.p061e;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import p031c.p032a.p042J.C0535b;
import p031c.p032a.p042J.C0536c;
import p031c.p032a.p042J.C0537d;
import p031c.p032a.p042J.C0538e;
import p031c.p032a.p059c.C0595f;
import p031c.p032a.p060d.C0601d;
import p031c.p032a.p091r.C0822k;
import p031c.p032a.p096v.C0853i;
import p031c.p032a.p096v.C0854j;

/* renamed from: c.a.e.b */
/* loaded from: classes.dex */
public final class C0603b {

    /* renamed from: a */
    public static C0538e f2861a;

    /* renamed from: a */
    public static C0615n m3089a(Context context, String str, byte[] bArr, int i, int i2, int i3) {
        try {
            C0535b c0535b = new C0535b(str);
            c0535b.m2774a(30000);
            c0535b.m2780b(30000);
            c0535b.m2781b(true);
            c0535b.m2778a(true);
            c0535b.m2791g(false);
            c0535b.m2776a(bArr);
            c0535b.m2777a("Content-Length", String.valueOf(bArr.length));
            c0535b.m2787e(true);
            if (f2861a == null) {
                try {
                    if (!TextUtils.isEmpty("-----BEGIN CERTIFICATE-----\nMIIDjjCCAnagAwIBAgIQAzrx5qcRqaC7KGSxHQn65TANBgkqhkiG9w0BAQsFADBh\nMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3\nd3cuZGlnaWNlcnQuY29tMSAwHgYDVQQDExdEaWdpQ2VydCBHbG9iYWwgUm9vdCBH\nMjAeFw0xMzA4MDExMjAwMDBaFw0zODAxMTUxMjAwMDBaMGExCzAJBgNVBAYTAlVT\nMRUwEwYDVQQKEwxEaWdpQ2VydCBJbmMxGTAXBgNVBAsTEHd3dy5kaWdpY2VydC5j\nb20xIDAeBgNVBAMTF0RpZ2lDZXJ0IEdsb2JhbCBSb290IEcyMIIBIjANBgkqhkiG\n9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuzfNNNx7a8myaJCtSnX/RrohCgiN9RlUyfuI\n2/Ou8jqJkTx65qsGGmvPrC3oXgkkRLpimn7Wo6h+4FR1IAWsULecYxpsMNzaHxmx\n1x7e/dfgy5SDN67sH0NO3Xss0r0upS/kqbitOtSZpLYl6ZtrAGCSYP9PIUkY92eQ\nq2EGnI/yuum06ZIya7XzV+hdG82MHauVBJVJ8zUtluNJbd134/tJS7SsVQepj5Wz\ntCO7TG1F8PapspUwtP1MVYwnSlcUfIKdzXOS0xZKBgyMUNGPHgm+F6HmIcr9g+UQ\nvIOlCsRnKPZzFBQ9RnbDhxSJITRNrw9FDKZJobq7nMWxM4MphQIDAQABo0IwQDAP\nBgNVHRMBAf8EBTADAQH/MA4GA1UdDwEB/wQEAwIBhjAdBgNVHQ4EFgQUTiJUIBiV\n5uNu5g/6+rkS7QYXjzkwDQYJKoZIhvcNAQELBQADggEBAGBnKJRvDkhj6zHd6mcY\n1Yl9PMWLSn/pvtsrF9+wX3N3KjITOYFnQoQj8kVnNeyIv/iPsGEMNKSuIEyExtv4\nNeF22d+mQrvHRAiGfzZ0JFrabA0UWTW98kndth/Jsw1HKj2ZL7tcu7XUIOGZX1NG\nFdtom/DzMNU+MeKNhJ7jitralj41E6Vf8PlwUHBHQRFXGU7Aj64GxJUTFy8bJZ91\n8rGOmaFvE7FBcf6IKshPECBV1/MUReXgRPTqh5Uykw7+U0b6LJ3/iyK5S9kJRaTe\npLiaWN0bfVKfjllDiIGknibVb63dDcY3fe0Dkhvld1927jyNxF1WW6LZZm6zNTfl\nMrY=\n-----END CERTIFICATE-----")) {
                        f2861a = new C0538e("-----BEGIN CERTIFICATE-----\nMIIDjjCCAnagAwIBAgIQAzrx5qcRqaC7KGSxHQn65TANBgkqhkiG9w0BAQsFADBh\nMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3\nd3cuZGlnaWNlcnQuY29tMSAwHgYDVQQDExdEaWdpQ2VydCBHbG9iYWwgUm9vdCBH\nMjAeFw0xMzA4MDExMjAwMDBaFw0zODAxMTUxMjAwMDBaMGExCzAJBgNVBAYTAlVT\nMRUwEwYDVQQKEwxEaWdpQ2VydCBJbmMxGTAXBgNVBAsTEHd3dy5kaWdpY2VydC5j\nb20xIDAeBgNVBAMTF0RpZ2lDZXJ0IEdsb2JhbCBSb290IEcyMIIBIjANBgkqhkiG\n9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuzfNNNx7a8myaJCtSnX/RrohCgiN9RlUyfuI\n2/Ou8jqJkTx65qsGGmvPrC3oXgkkRLpimn7Wo6h+4FR1IAWsULecYxpsMNzaHxmx\n1x7e/dfgy5SDN67sH0NO3Xss0r0upS/kqbitOtSZpLYl6ZtrAGCSYP9PIUkY92eQ\nq2EGnI/yuum06ZIya7XzV+hdG82MHauVBJVJ8zUtluNJbd134/tJS7SsVQepj5Wz\ntCO7TG1F8PapspUwtP1MVYwnSlcUfIKdzXOS0xZKBgyMUNGPHgm+F6HmIcr9g+UQ\nvIOlCsRnKPZzFBQ9RnbDhxSJITRNrw9FDKZJobq7nMWxM4MphQIDAQABo0IwQDAP\nBgNVHRMBAf8EBTADAQH/MA4GA1UdDwEB/wQEAwIBhjAdBgNVHQ4EFgQUTiJUIBiV\n5uNu5g/6+rkS7QYXjzkwDQYJKoZIhvcNAQELBQADggEBAGBnKJRvDkhj6zHd6mcY\n1Yl9PMWLSn/pvtsrF9+wX3N3KjITOYFnQoQj8kVnNeyIv/iPsGEMNKSuIEyExtv4\nNeF22d+mQrvHRAiGfzZ0JFrabA0UWTW98kndth/Jsw1HKj2ZL7tcu7XUIOGZX1NG\nFdtom/DzMNU+MeKNhJ7jitralj41E6Vf8PlwUHBHQRFXGU7Aj64GxJUTFy8bJZ91\n8rGOmaFvE7FBcf6IKshPECBV1/MUReXgRPTqh5Uykw7+U0b6LJ3/iyK5S9kJRaTe\npLiaWN0bfVKfjllDiIGknibVb63dDcY3fe0Dkhvld1927jyNxF1WW6LZZm6zNTfl\nMrY=\n-----END CERTIFICATE-----");
                    }
                } catch (Throwable unused) {
                }
            }
            if (f2861a != null) {
                c0535b.m2775a(f2861a);
            }
            c0535b.m2777a("Accept", "application/jason");
            c0535b.m2777a("Accept-Encoding", "gzip");
            c0535b.m2777a("X-App-Key", C0595f.m3050b(context));
            c0535b.m2777a("Charset", "UTF-8");
            String m4150a = C0853i.m4150a(i);
            c0535b.m2782c(false);
            c0535b.m2789f(false);
            c0535b.m2777a("Authorization", "Basic " + C0612k.m3123a(context, C0854j.m4160a(bArr), m4150a));
            while (i2 > 0) {
                i2--;
                C0536c m2800a = C0537d.m2800a(context, c0535b);
                int m2799b = m2800a.m2799b();
                C0601d.m3074c("HttpHelper", "status code:" + m2799b + " retry left:" + i2);
                if (m2799b == 200) {
                    return new C0615n(0, m2800a.m2795a());
                }
                if (m2799b == 401) {
                    return new C0615n(-3, m2800a.m2795a());
                }
                if (m2799b == 404 || m2799b == 410 || m2799b == 429) {
                    return new C0615n(-1, m2800a.m2795a());
                }
                if (m2799b == 503) {
                    return new C0615n(-2, m2800a.m2795a());
                }
                if (m2799b != 3005) {
                    return m2799b >= 500 ? new C0615n(-1, m2800a.m2795a()) : new C0615n(-2, m2800a.m2795a());
                }
            }
            return new C0615n(-2, "Failed - retry enough");
        } catch (AssertionError e2) {
            return new C0615n(-2, "Catch AssertionError to avoid http close crash - " + e2.getMessage());
        } catch (Exception e3) {
            return new C0615n(-2, "Exception - " + e3.getMessage());
        } catch (Throwable th) {
            return new C0615n(-2, "Exception - " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static C0615n m3090a(String str, String str2, Context context, boolean z, int i, int i2) {
        try {
            try {
                try {
                    byte[] m4016a = C0822k.m4016a(str2.getBytes("UTF-8"));
                    C0535b c0535b = new C0535b(str);
                    c0535b.m2774a(30000);
                    c0535b.m2780b(30000);
                    c0535b.m2781b(true);
                    c0535b.m2778a(true);
                    c0535b.m2791g(false);
                    String m4150a = C0853i.m4150a(C0853i.m4149a());
                    byte[] m4154a = C0853i.m4154a(m4016a, m4150a, "0102030405060708");
                    c0535b.m2776a(m4154a);
                    c0535b.m2777a("Content-Length", String.valueOf(m4154a.length));
                    c0535b.m2787e(true);
                    if (f2861a == null) {
                        try {
                            if (!TextUtils.isEmpty("-----BEGIN CERTIFICATE-----\nMIIDjjCCAnagAwIBAgIQAzrx5qcRqaC7KGSxHQn65TANBgkqhkiG9w0BAQsFADBh\nMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3\nd3cuZGlnaWNlcnQuY29tMSAwHgYDVQQDExdEaWdpQ2VydCBHbG9iYWwgUm9vdCBH\nMjAeFw0xMzA4MDExMjAwMDBaFw0zODAxMTUxMjAwMDBaMGExCzAJBgNVBAYTAlVT\nMRUwEwYDVQQKEwxEaWdpQ2VydCBJbmMxGTAXBgNVBAsTEHd3dy5kaWdpY2VydC5j\nb20xIDAeBgNVBAMTF0RpZ2lDZXJ0IEdsb2JhbCBSb290IEcyMIIBIjANBgkqhkiG\n9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuzfNNNx7a8myaJCtSnX/RrohCgiN9RlUyfuI\n2/Ou8jqJkTx65qsGGmvPrC3oXgkkRLpimn7Wo6h+4FR1IAWsULecYxpsMNzaHxmx\n1x7e/dfgy5SDN67sH0NO3Xss0r0upS/kqbitOtSZpLYl6ZtrAGCSYP9PIUkY92eQ\nq2EGnI/yuum06ZIya7XzV+hdG82MHauVBJVJ8zUtluNJbd134/tJS7SsVQepj5Wz\ntCO7TG1F8PapspUwtP1MVYwnSlcUfIKdzXOS0xZKBgyMUNGPHgm+F6HmIcr9g+UQ\nvIOlCsRnKPZzFBQ9RnbDhxSJITRNrw9FDKZJobq7nMWxM4MphQIDAQABo0IwQDAP\nBgNVHRMBAf8EBTADAQH/MA4GA1UdDwEB/wQEAwIBhjAdBgNVHQ4EFgQUTiJUIBiV\n5uNu5g/6+rkS7QYXjzkwDQYJKoZIhvcNAQELBQADggEBAGBnKJRvDkhj6zHd6mcY\n1Yl9PMWLSn/pvtsrF9+wX3N3KjITOYFnQoQj8kVnNeyIv/iPsGEMNKSuIEyExtv4\nNeF22d+mQrvHRAiGfzZ0JFrabA0UWTW98kndth/Jsw1HKj2ZL7tcu7XUIOGZX1NG\nFdtom/DzMNU+MeKNhJ7jitralj41E6Vf8PlwUHBHQRFXGU7Aj64GxJUTFy8bJZ91\n8rGOmaFvE7FBcf6IKshPECBV1/MUReXgRPTqh5Uykw7+U0b6LJ3/iyK5S9kJRaTe\npLiaWN0bfVKfjllDiIGknibVb63dDcY3fe0Dkhvld1927jyNxF1WW6LZZm6zNTfl\nMrY=\n-----END CERTIFICATE-----")) {
                                f2861a = new C0538e("-----BEGIN CERTIFICATE-----\nMIIDjjCCAnagAwIBAgIQAzrx5qcRqaC7KGSxHQn65TANBgkqhkiG9w0BAQsFADBh\nMQswCQYDVQQGEwJVUzEVMBMGA1UEChMMRGlnaUNlcnQgSW5jMRkwFwYDVQQLExB3\nd3cuZGlnaWNlcnQuY29tMSAwHgYDVQQDExdEaWdpQ2VydCBHbG9iYWwgUm9vdCBH\nMjAeFw0xMzA4MDExMjAwMDBaFw0zODAxMTUxMjAwMDBaMGExCzAJBgNVBAYTAlVT\nMRUwEwYDVQQKEwxEaWdpQ2VydCBJbmMxGTAXBgNVBAsTEHd3dy5kaWdpY2VydC5j\nb20xIDAeBgNVBAMTF0RpZ2lDZXJ0IEdsb2JhbCBSb290IEcyMIIBIjANBgkqhkiG\n9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuzfNNNx7a8myaJCtSnX/RrohCgiN9RlUyfuI\n2/Ou8jqJkTx65qsGGmvPrC3oXgkkRLpimn7Wo6h+4FR1IAWsULecYxpsMNzaHxmx\n1x7e/dfgy5SDN67sH0NO3Xss0r0upS/kqbitOtSZpLYl6ZtrAGCSYP9PIUkY92eQ\nq2EGnI/yuum06ZIya7XzV+hdG82MHauVBJVJ8zUtluNJbd134/tJS7SsVQepj5Wz\ntCO7TG1F8PapspUwtP1MVYwnSlcUfIKdzXOS0xZKBgyMUNGPHgm+F6HmIcr9g+UQ\nvIOlCsRnKPZzFBQ9RnbDhxSJITRNrw9FDKZJobq7nMWxM4MphQIDAQABo0IwQDAP\nBgNVHRMBAf8EBTADAQH/MA4GA1UdDwEB/wQEAwIBhjAdBgNVHQ4EFgQUTiJUIBiV\n5uNu5g/6+rkS7QYXjzkwDQYJKoZIhvcNAQELBQADggEBAGBnKJRvDkhj6zHd6mcY\n1Yl9PMWLSn/pvtsrF9+wX3N3KjITOYFnQoQj8kVnNeyIv/iPsGEMNKSuIEyExtv4\nNeF22d+mQrvHRAiGfzZ0JFrabA0UWTW98kndth/Jsw1HKj2ZL7tcu7XUIOGZX1NG\nFdtom/DzMNU+MeKNhJ7jitralj41E6Vf8PlwUHBHQRFXGU7Aj64GxJUTFy8bJZ91\n8rGOmaFvE7FBcf6IKshPECBV1/MUReXgRPTqh5Uykw7+U0b6LJ3/iyK5S9kJRaTe\npLiaWN0bfVKfjllDiIGknibVb63dDcY3fe0Dkhvld1927jyNxF1WW6LZZm6zNTfl\nMrY=\n-----END CERTIFICATE-----");
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (f2861a != null) {
                        c0535b.m2775a(f2861a);
                    }
                    c0535b.m2777a("Accept", "application/jason");
                    c0535b.m2777a("Accept-Encoding", "gzip");
                    c0535b.m2777a("X-App-Key", C0595f.m3050b(context));
                    c0535b.m2782c(true);
                    c0535b.m2789f(true);
                    c0535b.m2785d(true);
                    c0535b.m2777a("Authorization", C0612k.m3124a(m4150a));
                    c0535b.m2777a("Charset", "UTF-8");
                    while (i > 0) {
                        i--;
                        C0536c m2800a = C0537d.m2800a(context, c0535b);
                        int m2799b = m2800a.m2799b();
                        C0601d.m3074c("HttpHelper", "status code:" + m2799b + " retry left:" + i);
                        if (m2799b == 200) {
                            return new C0615n(0, m2800a.m2795a());
                        }
                        if (m2799b == 401) {
                            return new C0615n(-3, m2800a.m2795a());
                        }
                        if (m2799b == 404 || m2799b == 410 || m2799b == 429) {
                            return new C0615n(-1, m2800a.m2795a());
                        }
                        if (m2799b == 503) {
                            return new C0615n(-2, m2800a.m2795a());
                        }
                        if (m2799b != 3005) {
                            return m2799b >= 500 ? new C0615n(-1, m2800a.m2795a()) : new C0615n(-2, m2800a.m2795a());
                        }
                    }
                    return new C0615n(-2, "Failed - retry enough");
                } catch (IOException e2) {
                    return new C0615n(-2, "zip err:" + e2.getMessage());
                }
            } catch (AssertionError e3) {
                return new C0615n(-2, "Catch AssertionError to avoid http close crash - " + e3.getMessage());
            } catch (Exception e4) {
                return new C0615n(-2, "Exception - " + e4.getMessage());
            } catch (Throwable th) {
                return new C0615n(-2, "Exception - " + th.getMessage());
            }
        } catch (UnsupportedEncodingException e5) {
            return new C0615n(-2, "Exception - " + e5.getMessage());
        }
    }
}
