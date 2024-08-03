package p275e;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: e.c */
/* loaded from: classes.dex */
public class C2715c extends C2711F {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    static C2715c head;
    private boolean inQueue;
    private C2715c next;
    private long timeoutAt;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.c$a */
    /* loaded from: classes.dex */
    public static final class a extends Thread {
        a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:            r1.timedOut();     */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<e.c> r0 = p275e.C2715c.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                e.c r1 = p275e.C2715c.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                e.c r2 = p275e.C2715c.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                p275e.C2715c.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p275e.C2715c.a.run():void");
        }
    }

    static C2715c awaitTimeout() {
        C2715c c2715c = head.next;
        if (c2715c == null) {
            long nanoTime = System.nanoTime();
            C2715c.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next != null || System.nanoTime() - nanoTime < IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return head;
        }
        long remainingNanos = c2715c.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            C2715c.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = c2715c.next;
        c2715c.next = null;
        return c2715c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:            r1.next = r3.next;        r3.next = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:            r3 = false;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized boolean cancelScheduledTimeout(p275e.C2715c r3) {
        /*
            java.lang.Class<e.c> r0 = p275e.C2715c.class
            monitor-enter(r0)
            e.c r1 = p275e.C2715c.head     // Catch: java.lang.Throwable -> L1a
        L5:
            if (r1 == 0) goto L18
            e.c r2 = r1.next     // Catch: java.lang.Throwable -> L1a
            if (r2 != r3) goto L15
            e.c r2 = r3.next     // Catch: java.lang.Throwable -> L1a
            r1.next = r2     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.next = r1     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            e.c r1 = r1.next     // Catch: java.lang.Throwable -> L1a
            goto L5
        L18:
            r3 = 1
            goto L13
        L1a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275e.C2715c.cancelScheduledTimeout(e.c):boolean");
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:12:0x003c, B:13:0x0042, B:15:0x0046, B:17:0x0051, B:20:0x0054, B:22:0x005e, B:31:0x0036, B:32:0x0065, B:33:0x006a), top: B:3:0x0003 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void scheduleTimeout(p275e.C2715c r6, long r7, boolean r9) {
        /*
            java.lang.Class<e.c> r0 = p275e.C2715c.class
            monitor-enter(r0)
            e.c r1 = p275e.C2715c.head     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L16
            e.c r1 = new e.c     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            p275e.C2715c.head = r1     // Catch: java.lang.Throwable -> L6b
            e.c$a r1 = new e.c$a     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            r1.start()     // Catch: java.lang.Throwable -> L6b
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L6b
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L6b
        L2b:
            long r7 = r7 + r1
            r6.timeoutAt = r7     // Catch: java.lang.Throwable -> L6b
            goto L3c
        L2f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            goto L2b
        L34:
            if (r9 == 0) goto L65
            long r7 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L6b
            r6.timeoutAt = r7     // Catch: java.lang.Throwable -> L6b
        L3c:
            long r7 = r6.remainingNanos(r1)     // Catch: java.lang.Throwable -> L6b
            e.c r9 = p275e.C2715c.head     // Catch: java.lang.Throwable -> L6b
        L42:
            e.c r3 = r9.next     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L54
            e.c r3 = r9.next     // Catch: java.lang.Throwable -> L6b
            long r3 = r3.remainingNanos(r1)     // Catch: java.lang.Throwable -> L6b
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L51
            goto L54
        L51:
            e.c r9 = r9.next     // Catch: java.lang.Throwable -> L6b
            goto L42
        L54:
            e.c r7 = r9.next     // Catch: java.lang.Throwable -> L6b
            r6.next = r7     // Catch: java.lang.Throwable -> L6b
            r9.next = r6     // Catch: java.lang.Throwable -> L6b
            e.c r6 = p275e.C2715c.head     // Catch: java.lang.Throwable -> L6b
            if (r9 != r6) goto L63
            java.lang.Class<e.c> r6 = p275e.C2715c.class
            r6.notify()     // Catch: java.lang.Throwable -> L6b
        L63:
            monitor-exit(r0)
            return
        L65:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L6b
            r6.<init>()     // Catch: java.lang.Throwable -> L6b
            throw r6     // Catch: java.lang.Throwable -> L6b
        L6b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p275e.C2715c.scheduleTimeout(e.c, long, boolean):void");
    }

    public final void enter() {
        if (this.inQueue) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final IOException exit(IOException iOException) {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void exit(boolean z) {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC2708C sink(InterfaceC2708C interfaceC2708C) {
        return new C2713a(this, interfaceC2708C);
    }

    public final InterfaceC2709D source(InterfaceC2709D interfaceC2709D) {
        return new C2714b(this, interfaceC2709D);
    }

    protected void timedOut() {
    }
}
