package p031c.p032a.p060d;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import p031c.p032a.p096v.C0846b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c.a.d.c */
/* loaded from: classes.dex */
public final class RunnableC0600c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f2856a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0600c(ArrayList arrayList) {
        this.f2856a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        String str2;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    str = C0599b.f2851c;
                    sb.append(str);
                    sb.append("-");
                    sb.append(C0846b.m4126b());
                    sb.append("_1.txt");
                    String sb2 = sb.toString();
                    File file = new File(sb2);
                    file.getParentFile().mkdirs();
                    int i = 2;
                    while (true) {
                        if (!file.exists()) {
                            break;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        str2 = C0599b.f2851c;
                        sb3.append(str2);
                        sb3.append("-");
                        sb3.append(C0846b.m4126b());
                        sb3.append("_");
                        sb3.append(i);
                        sb3.append(".txt");
                        sb2 = sb3.toString();
                        file = new File(sb2);
                        if (i > 10) {
                            C0601d.m3077f("Logger", "Unexpected error here, so many existed error file.");
                            break;
                        }
                        i++;
                    }
                    C0601d.m3070a("Logger", "Write log file: " + file.getName());
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(sb2));
                    try {
                        Iterator it = this.f2856a.iterator();
                        while (it.hasNext()) {
                            bufferedWriter2.write(((String) it.next()) + "\n");
                        }
                        arrayList3 = C0599b.f2853e;
                        arrayList3.clear();
                        bufferedWriter2.close();
                    } catch (Throwable th) {
                        bufferedWriter = bufferedWriter2;
                        th = th;
                        C0601d.m3071a("Logger", "write logs to file error", th);
                        arrayList2 = C0599b.f2853e;
                        arrayList2.clear();
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        C0599b.m3069c();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                C0601d.m3071a("Logger", "close file stream error", th3);
            }
            C0599b.m3069c();
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
