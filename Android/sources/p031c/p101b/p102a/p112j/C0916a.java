package p031c.p101b.p102a.p112j;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p101b.p102a.C0869a;
import p031c.p101b.p102a.p104b.C0879b;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p111i.C0911b;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;
import p031c.p101b.p102a.p114l.C0936o;
import p031c.p101b.p102a.p115m.C0941d;

/* renamed from: c.b.a.j.a */
/* loaded from: classes.dex */
public class C0916a {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<Long> f3901a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    private static int m4559a(long j) {
        if (f3901a.size() >= 10) {
            long longValue = j - f3901a.element().longValue();
            if (longValue < 0) {
                f3901a.clear();
                return 2;
            }
            if (longValue <= 10000) {
                return 1;
            }
            while (f3901a.size() >= 10) {
                f3901a.poll();
            }
        }
        f3901a.offer(Long.valueOf(j));
        return 0;
    }

    /* renamed from: a */
    public static long m4560a(Context context, String str, int i, long j) {
        C0923b.m4642a("TagAliasHelper", "action - onRecvTagAliasCallBack");
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code", C0883f.a.f3730j);
            if (i == 0) {
                j = jSONObject.optLong("sequence");
            }
            Intent intent = new Intent();
            if (i == 0) {
                intent.setAction("cn.jpush.android.intent.TAG_ALIAS_CALLBACK");
            } else {
                String m4243b = C0869a.m4243b(context);
                if (!TextUtils.isEmpty(m4243b)) {
                    intent = new Intent(context, Class.forName(m4243b));
                }
                intent.setAction("cn.jpush.android.intent.RECEIVE_MESSAGE");
                if (i == 1) {
                    intent.putExtra("message_type", 1);
                } else {
                    intent.putExtra("message_type", 2);
                }
            }
            Intent intent2 = intent;
            intent2.addCategory(context.getPackageName());
            intent2.putExtra("proto_type", i);
            intent2.setPackage(context.getPackageName());
            intent2.putExtra("tagalias_errorcode", optInt);
            intent2.putExtra("tagalias_seqid", j);
            Intent m4588a = C0917b.m4582a().m4588a(context, j, optInt, jSONObject, intent2);
            if (m4588a != null) {
                context.sendBroadcast(m4588a);
            }
            return j;
        } catch (Throwable unused) {
            C0923b.m4653i("TagAliasHelper", "tagalias msgContent:" + str);
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static String m4561a(Context context, String str, long j, int i) {
        String jSONObject;
        if (m4580c(i)) {
            try {
                JSONObject m4565a = m4565a(i);
                if (m4578b(2, i)) {
                    if (TextUtils.isEmpty(str)) {
                        C0923b.m4648d("TagAliasHelper", "alias was empty. Give up action.");
                        m4566a(context, 2, C0883f.a.f3722b, j);
                        return null;
                    }
                    if (!m4573a(context, 2, str, j)) {
                        return null;
                    }
                    m4565a.put("alias", str);
                }
                jSONObject = m4565a.toString();
                C0923b.m4642a("TagAliasHelper", "alias str:" + jSONObject);
            } catch (Throwable th) {
                C0923b.m4653i("TagAliasHelper", "alias exception:" + th);
            }
            if (!TextUtils.isEmpty(jSONObject)) {
                return jSONObject;
            }
            C0923b.m4642a("TagAliasHelper", "alias request action was empty");
            return null;
        }
        C0923b.m4646c("TagAliasHelper", "unsupport alias action type");
        m4566a(context, 2, C0883f.a.f3730j, j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.json.JSONArray] */
    /* renamed from: a */
    public static String m4562a(Context context, List<String> list, long j, int i, int i2, int i3) {
        String jSONObject;
        if (i != 0) {
            try {
                JSONObject m4565a = m4565a(i);
                if (m4572a(1, i)) {
                    if (list != null && !list.isEmpty()) {
                        HashSet hashSet = new HashSet(list);
                        if (!m4574a(context, 1, hashSet, j)) {
                            return null;
                        }
                        Object m4577b = m4577b(hashSet);
                        if (!m4579b(context, m4577b, j, 1)) {
                            return null;
                        }
                        if (i != 6) {
                            m4577b = new JSONArray();
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                m4577b.put(it.next());
                            }
                        } else if (TextUtils.isEmpty(m4577b)) {
                            C0923b.m4648d("TagAliasHelper", "stags was empty. Give up action.");
                            m4566a(context, 1, C0883f.a.f3722b, j);
                            return null;
                        }
                        m4565a.put("tags", m4577b);
                    }
                    C0923b.m4648d("TagAliasHelper", "tags was empty. Give up action.");
                    m4566a(context, 1, C0883f.a.f3722b, j);
                    return null;
                }
                if (i == 5) {
                    if (i3 == -1) {
                        i3 = 1;
                    }
                    m4565a.put("curr", i3);
                }
                jSONObject = m4565a.toString();
                C0923b.m4642a("TagAliasHelper", "tag str:" + jSONObject);
            } catch (Throwable th) {
                C0923b.m4653i("TagAliasHelper", "tag exception:" + th);
            }
            if (!TextUtils.isEmpty(jSONObject)) {
                return jSONObject;
            }
            C0923b.m4642a("TagAliasHelper", "tag request action was empty");
            return null;
        }
        C0923b.m4646c("TagAliasHelper", "unsupport tag action type");
        m4566a(context, 1, C0883f.a.f3730j, j);
        return null;
    }

    /* renamed from: a */
    private static String m4563a(Context context, List<String> list, String str, long j) {
        String jSONObject;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        if (str != null && !m4573a(context, 0, str, j)) {
            return null;
        }
        if (hashSet != null && !m4574a(context, 0, hashSet, j)) {
            return null;
        }
        String m4577b = m4577b(hashSet);
        if (!m4579b(context, m4577b, j, 0)) {
            return null;
        }
        if (m4577b == null && str == null) {
            C0923b.m4648d("TagAliasHelper", "NULL alias and tags. Give up action.");
            m4566a(context, 0, C0883f.a.f3722b, j);
            return null;
        }
        C0923b.m4644b("TagAliasHelper", "action:setAliasAndTags - alias:" + str + ", tags:" + m4577b);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("platform", "a");
            if (str != null) {
                jSONObject2.put("alias", str);
            }
            if (hashSet != null) {
                jSONObject2.put("tags", m4577b);
            }
            jSONObject = jSONObject2.toString();
            C0923b.m4642a("TagAliasHelper", "tagalias str:" + jSONObject);
        } catch (Throwable th) {
            C0923b.m4653i("TagAliasHelper", "tagalias exception:" + th);
            m4566a(context, 0, C0883f.a.f3730j, j);
        }
        if (!TextUtils.isEmpty(jSONObject)) {
            return jSONObject;
        }
        C0923b.m4642a("TagAliasHelper", "tagalias request action was empty");
        return null;
    }

    /* renamed from: a */
    public static Set<String> m4564a(Set<String> set) {
        if (set == null) {
            return null;
        }
        if (set.isEmpty()) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (String str : set) {
            if (TextUtils.isEmpty(str) || !C0941d.m4748a(str)) {
                C0923b.m4648d("TagAliasHelper", "Invalid tag : " + str);
            } else {
                linkedHashSet.add(str);
                i++;
                if (i >= 1000) {
                    C0923b.m4654j("TagAliasHelper", "The lenght of tags maybe more than 1000.");
                    return linkedHashSet;
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    private static JSONObject m4565a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", "a");
        jSONObject.put("op", m4576b(i));
        return jSONObject;
    }

    /* renamed from: a */
    public static void m4566a(Context context, int i, int i2, long j) {
        try {
            Intent intent = new Intent();
            intent.addCategory(context.getPackageName());
            intent.setPackage(context.getPackageName());
            if (i == 0) {
                intent.setAction("cn.jpush.android.intent.TAG_ALIAS_CALLBACK");
            } else {
                intent.setAction("cn.jpush.android.intent.RECEIVE_MESSAGE");
                intent.setClass(context, Class.forName(C0869a.m4243b(context)));
                if (i == 1) {
                    intent.putExtra("message_type", 1);
                } else {
                    intent.putExtra("message_type", 2);
                }
            }
            intent.putExtra("tagalias_errorcode", i2);
            intent.putExtra("tagalias_seqid", j);
            context.sendBroadcast(intent);
        } catch (Throwable th) {
            C0923b.m4654j("TagAliasHelper", "NotifyTagAliasError:" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m4567a(Context context, int i, long j, String str) {
        C0923b.m4644b("TagAliasHelper", "tagalias:" + str);
        if (str == null) {
            C0923b.m4653i("TagAliasHelper", "tagaliasRequest was null");
        } else {
            int i2 = i == 0 ? 10 : i == 1 ? 28 : 29;
            C0922a.m4633a(context, "JPUSH", i2, i == 0 ? 4 : 1, j, 20000L, C0911b.m4539a(C0922a.m4630a(context), i2, str));
        }
    }

    /* renamed from: a */
    public static void m4568a(Context context, int i, String str, int i2, int i3) {
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
        m4571a(context, str, (Set<String>) null, new C0879b(i, str, System.currentTimeMillis(), i2, i3));
    }

    /* renamed from: a */
    public static void m4569a(Context context, int i, Set<String> set, int i2, int i3) {
        if (context == null) {
            throw new IllegalArgumentException("NULL context");
        }
        m4571a(context, (String) null, set, new C0879b(i, set, System.currentTimeMillis(), i2, i3));
    }

    /* renamed from: a */
    public static void m4570a(Context context, Bundle bundle) {
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        String str3;
        int i4;
        String string = bundle.getString("alias");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("tags");
        long j = bundle.getLong("seq", 0L);
        try {
            i = Integer.parseInt(bundle.getString("proto_type"));
        } catch (Throwable th) {
            C0923b.m4653i("TagAliasHelper", "load tag/alias proto type failed - error:" + th);
            m4566a(context, 0, C0883f.a.f3730j, j);
            i = 0;
        }
        try {
            i2 = Integer.parseInt(bundle.getString("action_type"));
        } catch (Throwable th2) {
            C0923b.m4653i("TagAliasHelper", "load tag/alias action type failed - error:" + th2);
            m4566a(context, i, C0883f.a.f3730j, j);
            i2 = 0;
        }
        if (C0902c.m4458c(context)) {
            i4 = C0883f.a.f3732l;
        } else {
            int m4559a = m4559a(System.currentTimeMillis());
            if (m4559a != 0) {
                C0923b.m4653i("TagAliasHelper", m4559a == 1 ? "set tags/alias too soon,over 10 times in 10s" : "set tags/alias failed,time shaft error，please try again");
                m4566a(context, i, m4559a == 1 ? C0883f.a.f3731k : C0883f.a.f3733m, j);
                return;
            }
            if (!C0917b.m4582a().m4591a(context, i, j)) {
                String str4 = null;
                if (i == 0) {
                    C0923b.m4642a("TagAliasHelper", "old tag/alias proto");
                    str2 = m4563a(context, stringArrayList, string, j);
                    str = "alias";
                    i3 = 2;
                } else {
                    if (i == 1) {
                        str = "alias";
                        i3 = 2;
                        str4 = m4562a(context, stringArrayList, j, i2, -1, -1);
                    } else {
                        str = "alias";
                        i3 = 2;
                        if (i == 2) {
                            str4 = m4561a(context, string, j, i2);
                        }
                    }
                    str2 = str4;
                }
                if (str2 == null || !(i == 1 || i == i3)) {
                    str3 = str2;
                } else {
                    if (!C0917b.m4582a().m4590a(i)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(i == 1 ? "tag" : str);
                        sb.append(" is operatoring, please wait last operator complete");
                        C0923b.m4653i("TagAliasHelper", sb.toString());
                        m4566a(context, i, i == 1 ? C0883f.a.f3741u : C0883f.a.f3742v, j);
                        return;
                    }
                    int i5 = i2;
                    str3 = str2;
                    C0917b.m4582a().m4589a(i, i5, j, stringArrayList, string);
                }
                m4567a(context, i, j, str3);
                return;
            }
            i4 = C0883f.a.f3740t;
        }
        m4566a(context, i, i4, j);
    }

    /* renamed from: a */
    private static void m4571a(Context context, String str, Set<String> set, C0879b c0879b) {
        long m4700a = C0936o.m4700a();
        if (c0879b != null) {
            C0918c.m4592a().m4602a(context, Long.valueOf(m4700a), c0879b);
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        if (c0879b != null && c0879b.f3704f == 0) {
            C0918c.m4592a().m4600a(context);
        }
        Bundle bundle = new Bundle();
        bundle.putString("alias", str);
        bundle.putStringArrayList("tags", set != null ? new ArrayList<>(set) : null);
        bundle.putLong("seq", m4700a);
        StringBuilder sb = new StringBuilder();
        sb.append(c0879b != null ? c0879b.f3704f : 0);
        sb.append("");
        bundle.putString("proto_type", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0879b != null ? c0879b.f3705g : 0);
        sb2.append("");
        bundle.putString("action_type", sb2.toString());
        C0922a.m4637a(context, "JPUSH", "tagalis", bundle);
    }

    /* renamed from: a */
    private static boolean m4572a(int i, int i2) {
        return i == 1 && (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 6);
    }

    /* renamed from: a */
    private static boolean m4573a(Context context, int i, String str, long j) {
        int m4749b = C0941d.m4749b(str);
        if (m4749b == 0) {
            return true;
        }
        C0923b.m4644b("TagAliasHelper", "Invalid alias: " + str + ", will not set alias this time.");
        m4566a(context, i, m4749b, j);
        return false;
    }

    /* renamed from: a */
    private static boolean m4574a(Context context, int i, Set<String> set, long j) {
        int m4747a = C0941d.m4747a(set);
        if (m4747a == 0) {
            return true;
        }
        C0923b.m4644b("TagAliasHelper", "Invalid tags, will not set tags this time.");
        m4566a(context, i, m4747a, j);
        return false;
    }

    /* renamed from: a */
    private static boolean m4575a(String str, boolean z) {
        int length = !TextUtils.isEmpty(str) ? str.getBytes().length + 0 : 0;
        C0923b.m4651g("TagAliasHelper", "tags length:" + length);
        if (z) {
            if (length <= 5000) {
                return true;
            }
        } else if (length <= 7000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static String m4576b(int i) {
        switch (i) {
            case 1:
                return "add";
            case 2:
                return "set";
            case 3:
                return "del";
            case 4:
                return "clean";
            case 5:
                return "get";
            case 6:
                return "valid";
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static String m4577b(Set<String> set) {
        String str = null;
        if (set == null) {
            return null;
        }
        if (set.isEmpty()) {
            return "";
        }
        int i = 0;
        for (String str2 : set) {
            if (TextUtils.isEmpty(str2) || !C0941d.m4748a(str2)) {
                C0923b.m4648d("TagAliasHelper", "Invalid tag: " + str2);
            } else {
                if (str != null) {
                    str2 = str + "," + str2;
                }
                i++;
                if (i >= 1000) {
                    return str2;
                }
                str = str2;
            }
        }
        return str;
    }

    /* renamed from: b */
    private static boolean m4578b(int i, int i2) {
        return i == 2 && i2 == 2;
    }

    /* renamed from: b */
    private static boolean m4579b(Context context, String str, long j, int i) {
        if (str != null) {
            if (!m4575a(str.replaceAll(",", ""), i != 0)) {
                m4566a(context, i, C0883f.a.f3729i, j);
                StringBuilder sb = new StringBuilder();
                sb.append("The length of tags should be less than ");
                sb.append(i != 0 ? 5000 : 7000);
                sb.append(" bytes.");
                C0923b.m4654j("TagAliasHelper", sb.toString());
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m4580c(int i) {
        return i == 2 || i == 3 || i == 5;
    }
}
