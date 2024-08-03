package p031c.p101b.p102a.p112j;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.j.b */
/* loaded from: classes.dex */
public class C0917b {

    /* renamed from: a */
    private static volatile C0917b f3902a;

    /* renamed from: b */
    private static final Object f3903b = new Object();

    /* renamed from: c */
    private ConcurrentHashMap<Long, a> f3904c = new ConcurrentHashMap<>();

    /* renamed from: c.b.a.j.b$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public int f3905a;

        /* renamed from: b */
        public int f3906b;

        /* renamed from: c */
        public long f3907c;

        /* renamed from: d */
        public ArrayList<String> f3908d;

        /* renamed from: e */
        public String f3909e;

        /* renamed from: f */
        public int f3910f = -1;

        /* renamed from: g */
        public int f3911g = -1;

        /* renamed from: h */
        public int f3912h = 0;

        /* renamed from: i */
        public int f3913i;

        public a(int i, int i2, long j, ArrayList<String> arrayList, String str) {
            this.f3913i = 0;
            this.f3905a = i;
            this.f3906b = i2;
            this.f3907c = j;
            this.f3908d = arrayList;
            if (i == 1 && this.f3908d == null) {
                this.f3908d = new ArrayList<>();
            }
            this.f3909e = str;
            this.f3913i = 1;
        }

        public String toString() {
            return "TagAliasCacheBean{protoType=" + this.f3905a + ", actionType=" + this.f3906b + ", seqID=" + this.f3907c + ", tags=" + this.f3908d + ", alias='" + this.f3909e + "', totalPage=" + this.f3910f + ", currPage=" + this.f3911g + ", retryCount=" + this.f3912h + '}';
        }
    }

    /* renamed from: a */
    private a m4581a(JSONObject jSONObject, a aVar) {
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - onUpdateCacheNode,responseJson:" + jSONObject + ",tagAliasCacheNode:" + aVar);
        if (aVar == null) {
            C0923b.m4653i("TagAliasNewProtoRetryHelper", "tagAliasCacheNode was null");
            return null;
        }
        if (TextUtils.equals(jSONObject.optString("op"), "get")) {
            if (aVar.f3905a == 1) {
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("tags");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            arrayList.add(optJSONArray.getString(i));
                        }
                        if (arrayList.size() > 0) {
                            aVar.f3908d.addAll(arrayList);
                        }
                    }
                } catch (Throwable th) {
                    C0923b.m4646c("TagAliasNewProtoRetryHelper", "parse tag list failed - error:" + th);
                }
            } else {
                String optString = jSONObject.optString("alias");
                if (optString != null) {
                    aVar.f3909e = optString;
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C0917b m4582a() {
        if (f3902a == null) {
            synchronized (f3903b) {
                if (f3902a == null) {
                    f3902a = new C0917b();
                }
            }
        }
        return f3902a;
    }

    /* renamed from: a */
    private boolean m4583a(Context context, int i, a aVar) {
        int i2;
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - CheckAndSendAgain, errorCode:" + i + ",tagAliasCacheNode:" + aVar);
        if (i != 1 || (i2 = aVar.f3912h) != 0) {
            return false;
        }
        aVar.f3912h = i2 + 1;
        if (m4591a(context, aVar.f3905a, aVar.f3907c)) {
            return true;
        }
        return m4585b(context, aVar);
    }

    /* renamed from: a */
    private boolean m4584a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "tagAlias cache was null";
        } else {
            C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - onTagAliasResponse, tagAliasCacheNode:" + aVar);
            if (aVar.f3911g < aVar.f3910f) {
                return true;
            }
            str = "all tags info was loaded";
        }
        C0923b.m4642a("TagAliasNewProtoRetryHelper", str);
        return false;
    }

    /* renamed from: b */
    private boolean m4585b(Context context, a aVar) {
        String m4561a;
        String str;
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - onSendAgain, tagAliasCacheNode:" + aVar);
        if (aVar == null) {
            C0923b.m4653i("TagAliasNewProtoRetryHelper", "onSendAgain - tagAliasCacheNode was null");
            return false;
        }
        int i = aVar.f3905a;
        if (i == 1) {
            m4561a = C0916a.m4562a(context, aVar.f3908d, aVar.f3907c, aVar.f3906b, aVar.f3910f, aVar.f3911g);
        } else {
            if (i != 2) {
                C0923b.m4642a("TagAliasNewProtoRetryHelper", "unsupport proto type");
                return false;
            }
            m4561a = C0916a.m4561a(context, aVar.f3909e, aVar.f3907c, i);
        }
        if (m4561a == null) {
            return false;
        }
        if (aVar.f3912h > 200) {
            this.f3904c.remove(Long.valueOf(aVar.f3907c));
            C0916a.m4566a(context, aVar.f3905a, C0883f.a.f3734n, aVar.f3907c);
            str = "same tag/alias request times greate than 200";
        } else {
            C0916a.m4567a(context, aVar.f3905a, aVar.f3907c, m4561a);
            aVar.f3912h++;
            this.f3904c.put(Long.valueOf(aVar.f3907c), aVar);
            str = "send request success";
        }
        C0923b.m4642a("TagAliasNewProtoRetryHelper", str);
        return true;
    }

    /* renamed from: a */
    public int m4586a(int i, int i2) {
        if (i == 0) {
            return i2;
        }
        if (i2 == 100) {
            return C0883f.a.f3740t;
        }
        switch (i2) {
            case 0:
                return i2;
            case 1:
            case 2:
                return C0883f.a.f3734n;
            case 3:
                return C0883f.a.f3735o;
            case 4:
                return C0883f.a.f3736p;
            case 5:
                return C0883f.a.f3737q;
            case 6:
                return C0883f.a.f3738r;
            case 7:
            case 8:
                return C0883f.a.f3739s;
            default:
                return i2;
        }
    }

    /* renamed from: a */
    public int m4587a(long j) {
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - onTagAliasTimeOut :" + j);
        a remove = this.f3904c.remove(Long.valueOf(j));
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "onTagAliasTimeOut,removed cachenode:" + remove);
        if (remove != null) {
            return remove.f3905a;
        }
        return 0;
    }

    /* renamed from: a */
    public Intent m4588a(Context context, long j, int i, JSONObject jSONObject, Intent intent) {
        String str;
        String str2;
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - onTagAliasResponse, seqID:" + j + ",errorCode:" + i + ",intent:" + intent);
        a aVar = this.f3904c.get(Long.valueOf(j));
        StringBuilder sb = new StringBuilder();
        sb.append("tagAliasCacheNode:");
        sb.append(aVar);
        C0923b.m4642a("TagAliasNewProtoRetryHelper", sb.toString());
        this.f3904c.remove(Long.valueOf(j));
        if (jSONObject == null) {
            C0923b.m4653i("TagAliasNewProtoRetryHelper", "responseJson was null");
            return intent;
        }
        if (aVar == null) {
            C0923b.m4653i("TagAliasNewProtoRetryHelper", "tagAliasCacheNode was null");
            return intent;
        }
        if (!m4583a(context, i, aVar)) {
            if (i != 0) {
                if (i == 100) {
                    long optLong = jSONObject.optLong("wait", -1L);
                    C0923b.m4654j("TagAliasNewProtoRetryHelper", "set tag/alias action will freeze " + optLong + " seconds");
                    if (optLong > 0) {
                        C0902c.m4447a(context, optLong);
                    }
                }
                int m4586a = m4586a(aVar.f3905a, i);
                intent.putExtra("tagalias_errorcode", m4586a);
                C0923b.m4642a("TagAliasNewProtoRetryHelper", "mapped errorCode:" + m4586a);
                return intent;
            }
            aVar.f3912h = 0;
            if (aVar.f3906b == 5) {
                aVar.f3910f = jSONObject.optInt("total", -1);
                aVar.f3911g = jSONObject.optInt("curr", -1);
                m4581a(jSONObject, aVar);
            }
            if (m4584a(context, aVar)) {
                aVar.f3911g++;
                C0923b.m4642a("TagAliasNewProtoRetryHelper", "load next page, currpage:" + aVar.f3911g + ",totalPage:" + aVar.f3910f);
                if (m4591a(context, aVar.f3905a, aVar.f3907c)) {
                    return null;
                }
                str2 = m4585b(context, aVar) ? "get next page request was sended" : "retry action was sended";
            }
            int i2 = aVar.f3906b;
            if (i2 == 5) {
                int i3 = aVar.f3905a;
                if (i3 == 1) {
                    if (aVar.f3908d.size() > 0) {
                        intent.putStringArrayListExtra("tags", aVar.f3908d);
                    }
                } else if (i3 == 2 && (str = aVar.f3909e) != null) {
                    intent.putExtra("alias", str);
                }
            } else if (i2 == 6) {
                if (aVar.f3905a == 1) {
                    intent.putExtra("validated", jSONObject.optBoolean("validated", false));
                } else {
                    C0923b.m4653i("TagAliasNewProtoRetryHelper", "unsupport  proto type");
                }
            }
            return intent;
        }
        C0923b.m4642a("TagAliasNewProtoRetryHelper", str2);
        return null;
    }

    /* renamed from: a */
    public void m4589a(int i, int i2, long j, ArrayList<String> arrayList, String str) {
        a aVar = new a(i, i2, j, arrayList, str);
        C0923b.m4642a("TagAliasNewProtoRetryHelper", "action - createNewCacheNode, tagAliasCacheNode:" + aVar);
        this.f3904c.put(Long.valueOf(j), aVar);
    }

    /* renamed from: a */
    public boolean m4590a(int i) {
        ConcurrentHashMap<Long, a> concurrentHashMap = this.f3904c;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<Long, a>> it = this.f3904c.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (value != null && value.f3905a == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4591a(Context context, int i, long j) {
        if ((i != 1 && i != 2) || !C0902c.m4465i(context)) {
            return false;
        }
        C0923b.m4653i("TagAliasNewProtoRetryHelper", "tag/alias action was freezed");
        C0916a.m4566a(context, i, C0883f.a.f3740t, j);
        return true;
    }
}
