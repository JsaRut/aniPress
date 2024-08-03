package p031c.p101b.p102a.p106d;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.d.c */
/* loaded from: classes.dex */
public class C0898c {

    /* renamed from: a */
    public static Queue<C0896a> f3806a;

    /* renamed from: a */
    public static synchronized void m4422a(Context context, String str) {
        synchronized (C0898c.class) {
            if (context == null) {
                C0923b.m4653i("MsgQueueUtils", "unexcepted , context is null");
                return;
            }
            File filesDir = context.getFilesDir();
            if (filesDir == null) {
                C0923b.m4653i("MsgQueueUtils", "can't get files dir");
                return;
            }
            File file = new File(filesDir, str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static synchronized <T> void m4423a(Context context, String str, ArrayList<T> arrayList) {
        String str2;
        String str3;
        synchronized (C0898c.class) {
            C0923b.m4651g("MsgQueueUtils", "Action - saveObjects");
            if (context == null) {
                C0923b.m4653i("MsgQueueUtils", "unexcepted , context is null");
                return;
            }
            if (arrayList == null) {
                C0923b.m4653i("MsgQueueUtils", "mObjectList is null");
                return;
            }
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(context.openFileOutput(str, 0));
                objectOutputStream.writeObject(arrayList);
                objectOutputStream.close();
            } catch (FileNotFoundException e2) {
                str2 = "MsgQueueUtils";
                str3 = "save Objects FileNotFoundException error:" + e2.getMessage();
                C0923b.m4654j(str2, str3);
            } catch (IOException e3) {
                str2 = "MsgQueueUtils";
                str3 = "save Objects IOException error:" + e3.getMessage();
                C0923b.m4654j(str2, str3);
            }
        }
    }

    /* renamed from: a */
    public static boolean m4424a(Context context, C0896a c0896a) {
        if (f3806a == null) {
            f3806a = new ConcurrentLinkedQueue();
            try {
                ArrayList m4425b = m4425b(context, "msg_queue_v330");
                if (m4425b != null && !m4425b.isEmpty()) {
                    Iterator it = m4425b.iterator();
                    while (it.hasNext()) {
                        f3806a.offer((C0896a) it.next());
                    }
                }
            } catch (Exception e2) {
                C0923b.m4654j("MsgQueueUtils", "init lastMsgQueue failed:" + e2.getMessage());
            }
        }
        if (context == null) {
            C0923b.m4654j("MsgQueueUtils", "#unexcepted - context was null");
            return false;
        }
        if (c0896a == null) {
            C0923b.m4654j("MsgQueueUtils", "#unexcepted - entityKey was null");
        }
        if (f3806a.contains(c0896a)) {
            C0923b.m4646c("MsgQueueUtils", "Duplicated msg. Give up processing - " + c0896a);
            return true;
        }
        if (f3806a.size() >= 200) {
            f3806a.poll();
        }
        f3806a.offer(c0896a);
        try {
            ArrayList m4425b2 = m4425b(context, "msg_queue_v330");
            if (m4425b2 == null) {
                m4425b2 = new ArrayList();
            }
            if (m4425b2.size() >= 50) {
                m4425b2.remove(0);
            }
            m4425b2.add(c0896a);
            m4423a(context, "msg_queue_v330", m4425b2);
        } catch (Exception e3) {
            C0923b.m4654j("MsgQueueUtils", "msg save in sp failed:" + e3.getMessage());
        }
        return false;
    }

    /* renamed from: b */
    public static synchronized <T> ArrayList<T> m4425b(Context context, String str) {
        ArrayList<T> arrayList;
        synchronized (C0898c.class) {
            ObjectInputStream objectInputStream = null;
            if (context == null) {
                C0923b.m4653i("MsgQueueUtils", "unexcepted , context is null");
                return null;
            }
            ArrayList<T> arrayList2 = new ArrayList<>();
            try {
                try {
                    ObjectInputStream objectInputStream2 = new ObjectInputStream(context.openFileInput(str));
                    try {
                        arrayList = (ArrayList) objectInputStream2.readObject();
                        try {
                            objectInputStream2.close();
                        } catch (IOException e2) {
                            C0923b.m4653i("MsgQueueUtils", "InputStream close failed:" + e2.getMessage());
                        }
                    } catch (Exception e3) {
                        e = e3;
                        objectInputStream = objectInputStream2;
                        C0923b.m4653i("MsgQueueUtils", "load objects error:" + e.getMessage());
                        m4422a(context, str);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e4) {
                                C0923b.m4653i("MsgQueueUtils", "InputStream close failed:" + e4.getMessage());
                            }
                        }
                        arrayList = arrayList2;
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream = objectInputStream2;
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e5) {
                                C0923b.m4653i("MsgQueueUtils", "InputStream close failed:" + e5.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e6) {
                e = e6;
            }
            return arrayList;
        }
    }
}
