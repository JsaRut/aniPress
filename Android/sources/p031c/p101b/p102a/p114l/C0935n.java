package p031c.p101b.p102a.p114l;

import android.util.SparseArray;

/* renamed from: c.b.a.l.n */
/* loaded from: classes.dex */
public class C0935n {

    /* renamed from: a */
    private static final SparseArray<String> f3960a = new SparseArray<>();

    static {
        f3960a.put(972, "Deep link set small icon failed");
        f3960a.put(973, "Deep link set large icon failed");
        f3960a.put(974, "Deep link- device in blacklist");
        f3960a.put(975, "Deep link source error");
        f3960a.put(976, "Deep link jump success");
        f3960a.put(977, "Deep link jump failed");
        f3960a.put(978, "Fail Deep link jump success");
        f3960a.put(979, "Fail Deep link jump failed");
        f3960a.put(981, "Deep link notify not show");
        f3960a.put(980, "Deep link notify show");
        f3960a.put(983, "wrong with resource file push_notification.xml");
        f3960a.put(993, "target app uninstall,not found target app small icon");
        f3960a.put(985, "Deep link source is not empty and pkgname is empty but deeplink error");
        f3960a.put(986, "Message is not in push time");
        f3960a.put(988, "Deep link target app uninstalled");
        f3960a.put(995, "Message JSON parsing succeed");
        f3960a.put(996, "Message JSON parsing failed");
        f3960a.put(997, "Message already received, give up");
        f3960a.put(998, "Message already received, still process");
        f3960a.put(1000, "User clicked and opened the Message");
        f3960a.put(1028, "User clicked and opened the Message from JPushInterface.reportNotificationOpened");
        f3960a.put(1001, "Message download succeed");
        f3960a.put(1002, "Message received succeed");
        f3960a.put(1003, "Message silence download succeed");
        f3960a.put(1004, "Video silence downlaod succeed");
        f3960a.put(1005, "User clicked video and jumped to url Message (browser)");
        f3960a.put(1008, "Video is force closed by user");
        f3960a.put(1007, "User clicked 'OK'");
        f3960a.put(1006, "User clicked 'Cancel'");
        f3960a.put(1011, "Download failed");
        f3960a.put(1012, "User clicked to download again");
        f3960a.put(1013, "The file already exist and same size. Don't download again.");
        f3960a.put(1100, "Invalid param or unexpected result.");
        f3960a.put(1014, "Failed to preload required resource");
        f3960a.put(1015, "User clicked install alert on status bar after downloading finished.");
        f3960a.put(1016, "User clicked the webview's url");
        f3960a.put(1017, "User clicked call action");
        f3960a.put(1018, "The Message show in the status bar");
        f3960a.put(1019, "Click applist and show the Message");
        f3960a.put(1020, "Down image failed");
        f3960a.put(1021, "Down html failed");
        f3960a.put(1022, "Down Message failed");
        f3960a.put(1030, "Discard the message because it is not in the push time");
        f3960a.put(1031, "Stop push service");
        f3960a.put(1032, "Resume push service");
    }

    /* renamed from: a */
    public static String m4699a(int i) {
        if (f3960a.get(i) != null) {
            return f3960a.get(i);
        }
        C0923b.m4642a("StatusCode", "Unknown report code - " + i);
        return "";
    }
}
