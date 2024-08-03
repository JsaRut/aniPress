package p031c.p101b.p102a.p105c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p107e.C0902c;
import p031c.p101b.p102a.p109g.C0904a;
import p031c.p101b.p102a.p114l.C0922a;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.c.c */
/* loaded from: classes.dex */
public class C0891c {

    /* renamed from: a */
    private static volatile C0891c f3778a;

    /* renamed from: b */
    private static ExecutorService f3779b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    private static final Object f3780c = new Object();

    /* renamed from: d */
    private Handler f3781d;

    /* renamed from: e */
    private Context f3782e;

    /* renamed from: f */
    private String f3783f;

    private C0891c(Context context) {
        this.f3781d = null;
        this.f3782e = null;
        this.f3783f = "";
        C0923b.m4642a("JPushLocalNotificationCenter", "Constructor : JPushLocalNotificationCenter");
        this.f3781d = new Handler(Looper.getMainLooper());
        this.f3782e = context;
        this.f3783f = this.f3782e.getPackageName();
    }

    /* renamed from: a */
    public static C0891c m4377a(Context context) {
        C0923b.m4651g("JPushLocalNotificationCenter", "getInstance");
        if (f3778a == null) {
            synchronized (f3780c) {
                if (f3778a == null) {
                    f3778a = new C0891c(context);
                }
            }
        }
        return f3778a;
    }

    /* renamed from: a */
    private synchronized void m4378a(long j, long j2, int i) {
        C0923b.m4642a("JPushLocalNotificationCenter", "LocalNotification scheduleReadiedLN");
        if (this.f3781d != null) {
            RunnableC0890b runnableC0890b = new RunnableC0890b(this, j);
            if (j2 <= 0) {
                C0923b.m4642a("JPushLocalNotificationCenter", "post right now ");
                this.f3781d.post(runnableC0890b);
            } else {
                C0923b.m4642a("JPushLocalNotificationCenter", "post delayed : " + j2);
                this.f3781d.postDelayed(runnableC0890b, j2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4379a(Context context, String str) {
        C0923b.m4642a("JPushLocalNotificationCenter", "start LocalNotification broadCastToPushService");
        Bundle bundle = new Bundle();
        bundle.putString("local_notify_msg", str);
        C0922a.m4637a(context, "JPUSH", "show_local_notify", bundle);
        C0923b.m4642a("JPushLocalNotificationCenter", "end LocalNotification broadCastToPushService");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:            if (r13.moveToFirst() != false) goto L9;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:            r2 = p031c.p101b.p102a.p105c.C0892d.m4389a(r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:            if (r2 == null) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:            m4379a(r15, r2.m4407d());        r0.m4396b(r2.m4397a(), 0, 0, 0, r2.m4407d(), r2.m4409f(), r2.m4408e());     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:            if (r13.moveToNext() != false) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:            if (r13 == null) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:            r13.close();     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m4382e(android.content.Context r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "triggerLNKillProcess"
            p031c.p101b.p102a.p114l.C0923b.m4642a(r0, r1)     // Catch: java.lang.Throwable -> L91
            c.b.a.c.d r0 = p031c.p101b.p102a.p105c.C0892d.m4388a(r15)     // Catch: java.lang.Throwable -> L91
            r1 = 0
            boolean r2 = r0.m4413a(r1)     // Catch: java.lang.Throwable -> L91
            if (r2 == 0) goto L88
            r2 = 0
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            r5 = 1
            android.database.Cursor r13 = r0.m4392a(r5, r3)     // Catch: java.lang.Throwable -> L5c java.lang.Exception -> L5e
            boolean r2 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r2 == 0) goto L4d
        L23:
            c.b.a.c.e r2 = p031c.p101b.p102a.p105c.C0892d.m4389a(r13)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r2 == 0) goto L47
            java.lang.String r3 = r2.m4407d()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r14.m4379a(r15, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            long r3 = r2.m4397a()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = r2.m4407d()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            long r9 = r2.m4409f()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            long r11 = r2.m4408e()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r2 = r0
            r2.m4396b(r3, r5, r6, r7, r8, r9, r11)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
        L47:
            boolean r2 = r13.moveToNext()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            if (r2 != 0) goto L23
        L4d:
            if (r13 == 0) goto L52
            r13.close()     // Catch: java.lang.Throwable -> L91
        L52:
            r0.m4414b(r1)     // Catch: java.lang.Throwable -> L91
            goto L8f
        L56:
            r15 = move-exception
            r2 = r13
            goto L7f
        L59:
            r15 = move-exception
            r2 = r13
            goto L5f
        L5c:
            r15 = move-exception
            goto L7f
        L5e:
            r15 = move-exception
        L5f:
            java.lang.String r3 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = "triggerLNKillProcess: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r15 = r15.getMessage()     // Catch: java.lang.Throwable -> L5c
            r4.append(r15)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r15 = r4.toString()     // Catch: java.lang.Throwable -> L5c
            p031c.p101b.p102a.p114l.C0923b.m4654j(r3, r15)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.lang.Throwable -> L91
            goto L52
        L7f:
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.lang.Throwable -> L91
        L84:
            r0.m4414b(r1)     // Catch: java.lang.Throwable -> L91
            throw r15     // Catch: java.lang.Throwable -> L91
        L88:
            java.lang.String r15 = "JPushLocalNotificationCenter"
            java.lang.String r0 = "init LocalNotification cast expt: db open failed"
            p031c.p101b.p102a.p114l.C0923b.m4646c(r15, r0)     // Catch: java.lang.Throwable -> L91
        L8f:
            monitor-exit(r14)
            return
        L91:
            r15 = move-exception
            monitor-exit(r14)
            throw r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p105c.C0891c.m4382e(android.content.Context):void");
    }

    /* renamed from: a */
    public synchronized boolean m4383a(Context context, long j) {
        C0923b.m4644b("JPushLocalNotificationCenter", "remove LocalNotification ");
        long j2 = (int) j;
        try {
            C0892d m4388a = C0892d.m4388a(context);
            C0893e m4394a = m4388a.m4394a(j2, 0);
            if (m4394a == null) {
                return false;
            }
            C0923b.m4642a("JPushLocalNotificationCenter", "remove local count : " + m4394a.m4401b());
            m4388a.m4390a(j2);
            C0883f.m4323b(this.f3782e, (int) j2);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            C0923b.m4646c("JPushLocalNotificationCenter", "exception:" + e2.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public synchronized boolean m4384a(Context context, C0904a c0904a) {
        C0923b.m4644b("JPushLocalNotificationCenter", "add LocalNotification");
        long currentTimeMillis = System.currentTimeMillis();
        long m4476b = c0904a.m4476b() - currentTimeMillis;
        if (C0902c.m4458c(context)) {
            C0923b.m4642a("JPushLocalNotificationCenter", "push has stopped");
        }
        long m4479c = c0904a.m4479c();
        try {
            C0892d m4388a = C0892d.m4388a(context);
            if (m4388a.m4394a(m4479c, 0) != null) {
                m4388a.m4396b(m4479c, 1, 0, 0, c0904a.m4482d(), c0904a.m4476b(), currentTimeMillis);
            } else {
                m4388a.m4391a(m4479c, 1, 0, 0, c0904a.m4482d(), c0904a.m4476b(), currentTimeMillis);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            C0923b.m4646c("JPushLocalNotificationCenter", "exception:" + e2.getMessage());
        }
        if (m4476b >= 300000) {
            return true;
        }
        m4378a(c0904a.m4479c(), m4476b, 0);
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public synchronized void m4385b(Context context) {
        C0923b.m4644b("JPushLocalNotificationCenter", "clear all local notification ");
        int[] m4395a = C0892d.m4388a(context).m4395a();
        if (m4395a != null && m4395a.length > 0) {
            C0923b.m4642a("JPushLocalNotificationCenter", " success");
            for (int i : m4395a) {
                C0883f.m4323b(this.f3782e, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:            if (r4 == null) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:            m4378a(r4.m4397a(), r4.m4409f() - r2, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:            if (r1.moveToNext() != false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:            if (r1.moveToFirst() != false) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:            r4 = p031c.p101b.p102a.p105c.C0892d.m4389a(r1);     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m4386c(android.content.Context r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "JPushLocalNotificationCenter"
            java.lang.String r1 = "init LocalNotification"
            p031c.p101b.p102a.p114l.C0923b.m4642a(r0, r1)     // Catch: java.lang.Throwable -> L7a
            c.b.a.c.d r12 = p031c.p101b.p102a.p105c.C0892d.m4388a(r12)     // Catch: java.lang.Throwable -> L7a
            r0 = 0
            boolean r1 = r12.m4413a(r0)     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L71
            r1 = 0
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            r4 = 300000(0x493e0, double:1.482197E-318)
            android.database.Cursor r1 = r12.m4393a(r2, r4)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r4 == 0) goto L40
        L25:
            c.b.a.c.e r4 = p031c.p101b.p102a.p105c.C0892d.m4389a(r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r4 == 0) goto L3a
            long r6 = r4.m4397a()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            long r4 = r4.m4409f()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            long r8 = r4 - r2
            r10 = 0
            r5 = r11
            r5.m4378a(r6, r8, r10)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
        L3a:
            boolean r4 = r1.moveToNext()     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4b
            if (r4 != 0) goto L25
        L40:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.lang.Throwable -> L7a
        L45:
            r12.m4414b(r0)     // Catch: java.lang.Throwable -> L7a
            goto L78
        L49:
            r2 = move-exception
            goto L68
        L4b:
            r2 = move-exception
            java.lang.String r3 = "JPushLocalNotificationCenter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = "init LocalNotification cast expt:"
            r4.append(r5)     // Catch: java.lang.Throwable -> L49
            r4.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L49
            p031c.p101b.p102a.p114l.C0923b.m4646c(r3, r2)     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.lang.Throwable -> L7a
            goto L45
        L68:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Throwable -> L7a
        L6d:
            r12.m4414b(r0)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L71:
            java.lang.String r12 = "JPushLocalNotificationCenter"
            java.lang.String r0 = "init LocalNotification cast expt: db open failed"
            p031c.p101b.p102a.p114l.C0923b.m4646c(r12, r0)     // Catch: java.lang.Throwable -> L7a
        L78:
            monitor-exit(r11)
            return
        L7a:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031c.p101b.p102a.p105c.C0891c.m4386c(android.content.Context):void");
    }

    /* renamed from: d */
    public void m4387d(Context context) {
        C0923b.m4642a("JPushLocalNotificationCenter", "LocalNotification onHeartBeat");
        f3779b.execute(new RunnableC0889a(this, context));
    }
}
