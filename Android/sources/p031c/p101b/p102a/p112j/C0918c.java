package p031c.p101b.p102a.p112j;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cn.jpush.android.service.C0960g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p031c.p101b.p102a.p104b.C0879b;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p104b.C0884g;
import p031c.p101b.p102a.p104b.InterfaceC0888k;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.j.c */
/* loaded from: classes.dex */
public class C0918c {

    /* renamed from: a */
    private static volatile C0918c f3915a;

    /* renamed from: b */
    private static final Object f3916b = new Object();

    /* renamed from: c */
    private C0960g f3917c;

    /* renamed from: d */
    private ConcurrentHashMap<Long, C0879b> f3918d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private AtomicBoolean f3919e = new AtomicBoolean(false);

    private C0918c() {
    }

    /* renamed from: a */
    public static C0918c m4592a() {
        if (f3915a == null) {
            synchronized (f3916b) {
                if (f3915a == null) {
                    f3915a = new C0918c();
                }
            }
        }
        return f3915a;
    }

    /* renamed from: a */
    private String m4593a(C0879b c0879b) {
        if (c0879b == null) {
            C0923b.m4653i("TagAliasOperator", "callBack was null");
            return null;
        }
        try {
            if (c0879b.f3701c != null && c0879b.f3701c.size() > 0) {
                return (String) c0879b.f3701c.toArray()[0];
            }
        } catch (Throwable th) {
            C0923b.m4642a("TagAliasOperator", "get origin check tag failed, error:" + th);
        }
        return null;
    }

    /* renamed from: a */
    private void m4594a(Context context, int i, long j) {
        String str;
        if (i == C0883f.a.f3723c) {
            str = "action - onTimeout rid:" + j;
        } else {
            str = "action - on send data over limit";
        }
        C0923b.m4651g("TagAliasOperator", str);
        C0879b m4598a = m4598a(j);
        if (m4598a != null) {
            m4596a(context, m4598a, i, false);
            m4604b(j);
        } else {
            C0923b.m4653i("TagAliasOperator", "tagalias callback is null; rid=" + j);
        }
    }

    /* renamed from: a */
    private void m4595a(Context context, int i, long j, Intent intent) {
        String str;
        C0923b.m4651g("TagAliasOperator", "SetAliasAndTags finish : errorCode:" + i + " rid:" + j);
        C0879b m4598a = m4598a(j);
        if (m4598a == null) {
            C0923b.m4653i("TagAliasOperator", "tagalias callback is null; rid=" + j);
            return;
        }
        m4592a().m4604b(j);
        boolean z = false;
        if (intent != null) {
            try {
                if (m4598a.f3705g == 5) {
                    if (m4598a.f3704f == 1) {
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("tags");
                        if (stringArrayListExtra != null) {
                            m4598a.f3701c = new HashSet(stringArrayListExtra);
                            str = "all tags was loaded, value:" + m4598a.f3701c;
                        }
                    } else if (m4598a.f3704f == 2) {
                        m4598a.f3700b = intent.getStringExtra("alias");
                        str = "alias was loaded, value:" + m4598a.f3701c;
                    }
                    C0923b.m4642a("TagAliasOperator", str);
                } else if (m4598a.f3705g == 6) {
                    z = intent.getBooleanExtra("validated", false);
                }
            } catch (Throwable th) {
                C0923b.m4642a("TagAliasOperator", "get tag or alias failed - error:" + th);
            }
        }
        m4596a(context, m4598a, i, z);
    }

    /* renamed from: a */
    private void m4596a(Context context, C0879b c0879b, int i, boolean z) {
        C0923b.m4642a("TagAliasOperator", "action - invokeUserCallback, errorCode:" + i + ",callBack:" + c0879b);
        if (c0879b.f3704f != 0) {
            C0923b.m4653i("TagAliasOperator", "new proto type do not call user callback");
            return;
        }
        InterfaceC0888k interfaceC0888k = c0879b.f3702d;
        if (interfaceC0888k != null) {
            interfaceC0888k.m4375a(i, c0879b.f3700b, c0879b.f3701c);
        }
    }

    /* renamed from: c */
    private void m4597c(Context context) {
        ConcurrentHashMap<Long, C0879b> concurrentHashMap = this.f3918d;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, C0879b> entry : this.f3918d.entrySet()) {
            if (entry.getValue().m4304a(20000L)) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            C0923b.m4653i("TagAliasOperator", "cleanTimeOutCallback timeout rid:" + l);
            m4594a(context, C0883f.a.f3723c, l.longValue());
        }
    }

    /* renamed from: a */
    public C0879b m4598a(long j) {
        return this.f3918d.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public C0884g m4599a(Context context, Intent intent) {
        String str;
        long longExtra = intent.getLongExtra("tagalias_seqid", -1L);
        boolean z = false;
        int intExtra = intent.getIntExtra("tagalias_errorcode", 0);
        C0923b.m4651g("TagAliasOperator", "parseTagAliasResponse2JPushMessage, errorCode:" + intExtra + " rid:" + longExtra);
        C0879b m4598a = m4598a(longExtra);
        if (m4598a == null) {
            C0923b.m4653i("TagAliasOperator", "tagalias callback is null; rid=" + longExtra);
            return null;
        }
        m4592a().m4604b(longExtra);
        if (intExtra == 0) {
            try {
                if (m4598a.f3705g == 5) {
                    if (m4598a.f3704f == 1) {
                        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("tags");
                        if (stringArrayListExtra != null) {
                            m4598a.f3701c = new HashSet(stringArrayListExtra);
                            str = "all tags was loaded, value:" + m4598a.f3701c;
                        }
                    } else if (m4598a.f3704f == 2) {
                        m4598a.f3700b = intent.getStringExtra("alias");
                        str = "alias was loaded, value:" + m4598a.f3701c;
                    }
                    C0923b.m4642a("TagAliasOperator", str);
                } else if (m4598a.f3705g == 6) {
                    z = intent.getBooleanExtra("validated", false);
                }
            } catch (Throwable th) {
                C0923b.m4642a("TagAliasOperator", "get tag or alias failed - error:" + th);
            }
        }
        C0884g c0884g = new C0884g();
        c0884g.m4351a(intExtra);
        c0884g.m4356b(m4598a.f3703e);
        if (m4598a.f3704f != 1) {
            c0884g.m4352a(m4598a.f3700b);
        } else if (m4598a.f3705g == 6) {
            c0884g.m4357b(m4593a(m4598a));
            c0884g.m4358b(z);
            c0884g.m4354a(true);
        } else {
            c0884g.m4353a(m4598a.f3701c);
        }
        return c0884g;
    }

    /* renamed from: a */
    public synchronized void m4600a(Context context) {
        if (this.f3919e.get()) {
            C0923b.m4642a("TagAliasOperator", "tag alias callback register is called");
        } else {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addCategory(context.getPackageName());
                intentFilter.addAction("cn.jpush.android.intent.TAG_ALIAS_TIMEOUT");
                intentFilter.addAction("cn.jpush.android.intent.TAG_ALIAS_CALLBACK");
                if (this.f3917c == null) {
                    this.f3917c = new C0960g();
                }
                context.registerReceiver(this.f3917c, intentFilter);
                this.f3919e.set(true);
            } catch (Exception e2) {
                C0923b.m4646c("TagAliasOperator", "setTagAndAlias e:" + e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void m4601a(Context context, long j, int i, Intent intent) {
        C0923b.m4651g("TagAliasOperator", "action - onTagAliasResponse rid:" + j + " tagAliasCallbacks :" + m4592a().m4603b());
        if ("cn.jpush.android.intent.TAG_ALIAS_TIMEOUT".equals(intent.getAction())) {
            m4594a(context, i, j);
        } else {
            m4595a(context, i, j, intent);
        }
        m4605b(context);
    }

    /* renamed from: a */
    public void m4602a(Context context, Long l, C0879b c0879b) {
        m4597c(context);
        this.f3918d.put(l, c0879b);
    }

    /* renamed from: b */
    public ConcurrentHashMap<Long, C0879b> m4603b() {
        return this.f3918d;
    }

    /* renamed from: b */
    public void m4604b(long j) {
        this.f3918d.remove(Long.valueOf(j));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public synchronized void m4605b(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        m4597c(context);
        if (this.f3919e.get() && this.f3918d != null && this.f3918d.isEmpty()) {
            try {
                if (this.f3917c != null) {
                    context.unregisterReceiver(this.f3917c);
                    this.f3917c = null;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                str3 = "TagAliasOperator";
                str4 = "Receiver not registered, cannot call unregisterReceiver";
                C0923b.m4647c(str3, str4, e);
                this.f3919e.set(false);
                str = "TagAliasOperator";
                str2 = "unRegister tag alias callback";
                C0923b.m4651g(str, str2);
            } catch (Exception e3) {
                e = e3;
                str3 = "TagAliasOperator";
                str4 = "other exception";
                C0923b.m4647c(str3, str4, e);
                this.f3919e.set(false);
                str = "TagAliasOperator";
                str2 = "unRegister tag alias callback";
                C0923b.m4651g(str, str2);
            }
            this.f3919e.set(false);
            str = "TagAliasOperator";
            str2 = "unRegister tag alias callback";
        } else {
            str = "TagAliasOperator";
            str2 = "tagAliasCallbacks is not empty";
        }
        C0923b.m4651g(str, str2);
    }
}
