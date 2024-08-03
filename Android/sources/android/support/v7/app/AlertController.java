package android.support.v7.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.C0416Q;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0121j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f1381A;

    /* renamed from: C */
    private Drawable f1383C;

    /* renamed from: D */
    private ImageView f1384D;

    /* renamed from: E */
    private TextView f1385E;

    /* renamed from: F */
    private TextView f1386F;

    /* renamed from: G */
    private View f1387G;

    /* renamed from: H */
    ListAdapter f1388H;

    /* renamed from: J */
    private int f1390J;

    /* renamed from: K */
    private int f1391K;

    /* renamed from: L */
    int f1392L;

    /* renamed from: M */
    int f1393M;

    /* renamed from: N */
    int f1394N;

    /* renamed from: O */
    int f1395O;

    /* renamed from: P */
    private boolean f1396P;

    /* renamed from: R */
    Handler f1398R;

    /* renamed from: a */
    private final Context f1400a;

    /* renamed from: b */
    final DialogC0314B f1401b;

    /* renamed from: c */
    private final Window f1402c;

    /* renamed from: d */
    private final int f1403d;

    /* renamed from: e */
    private CharSequence f1404e;

    /* renamed from: f */
    private CharSequence f1405f;

    /* renamed from: g */
    ListView f1406g;

    /* renamed from: h */
    private View f1407h;

    /* renamed from: i */
    private int f1408i;

    /* renamed from: j */
    private int f1409j;

    /* renamed from: k */
    private int f1410k;

    /* renamed from: l */
    private int f1411l;

    /* renamed from: m */
    private int f1412m;

    /* renamed from: o */
    Button f1414o;

    /* renamed from: p */
    private CharSequence f1415p;

    /* renamed from: q */
    Message f1416q;

    /* renamed from: r */
    private Drawable f1417r;

    /* renamed from: s */
    Button f1418s;

    /* renamed from: t */
    private CharSequence f1419t;

    /* renamed from: u */
    Message f1420u;

    /* renamed from: v */
    private Drawable f1421v;

    /* renamed from: w */
    Button f1422w;

    /* renamed from: x */
    private CharSequence f1423x;

    /* renamed from: y */
    Message f1424y;

    /* renamed from: z */
    private Drawable f1425z;

    /* renamed from: n */
    private boolean f1413n = false;

    /* renamed from: B */
    private int f1382B = 0;

    /* renamed from: I */
    int f1389I = -1;

    /* renamed from: Q */
    private int f1397Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f1399S = new ViewOnClickListenerC0324c(this);

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f1426a;

        /* renamed from: b */
        private final int f1427b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.RecycleListView);
            this.f1427b = obtainStyledAttributes.getDimensionPixelOffset(C0121j.RecycleListView_paddingBottomNoButtons, -1);
            this.f1426a = obtainStyledAttributes.getDimensionPixelOffset(C0121j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m1720a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f1426a, getPaddingRight(), z2 ? getPaddingBottom() : this.f1427b);
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    /* loaded from: classes.dex */
    public static class C0310a {

        /* renamed from: A */
        public int f1428A;

        /* renamed from: B */
        public int f1429B;

        /* renamed from: C */
        public int f1430C;

        /* renamed from: D */
        public int f1431D;

        /* renamed from: F */
        public boolean[] f1433F;

        /* renamed from: G */
        public boolean f1434G;

        /* renamed from: H */
        public boolean f1435H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1437J;

        /* renamed from: K */
        public Cursor f1438K;

        /* renamed from: L */
        public String f1439L;

        /* renamed from: M */
        public String f1440M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1441N;

        /* renamed from: O */
        public a f1442O;

        /* renamed from: a */
        public final Context f1444a;

        /* renamed from: b */
        public final LayoutInflater f1445b;

        /* renamed from: d */
        public Drawable f1447d;

        /* renamed from: f */
        public CharSequence f1449f;

        /* renamed from: g */
        public View f1450g;

        /* renamed from: h */
        public CharSequence f1451h;

        /* renamed from: i */
        public CharSequence f1452i;

        /* renamed from: j */
        public Drawable f1453j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1454k;

        /* renamed from: l */
        public CharSequence f1455l;

        /* renamed from: m */
        public Drawable f1456m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1457n;

        /* renamed from: o */
        public CharSequence f1458o;

        /* renamed from: p */
        public Drawable f1459p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1460q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1462s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1463t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1464u;

        /* renamed from: v */
        public CharSequence[] f1465v;

        /* renamed from: w */
        public ListAdapter f1466w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1467x;

        /* renamed from: y */
        public int f1468y;

        /* renamed from: z */
        public View f1469z;

        /* renamed from: c */
        public int f1446c = 0;

        /* renamed from: e */
        public int f1448e = 0;

        /* renamed from: E */
        public boolean f1432E = false;

        /* renamed from: I */
        public int f1436I = -1;

        /* renamed from: P */
        public boolean f1443P = true;

        /* renamed from: r */
        public boolean f1461r = true;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            void m1723a(ListView listView);
        }

        public C0310a(Context context) {
            this.f1444a = context;
            this.f1445b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m1721b(android.support.v7.app.AlertController r12) {
            /*
                r11 = this;
                android.view.LayoutInflater r0 = r11.f1445b
                int r1 = r12.f1392L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.v7.app.AlertController.RecycleListView) r0
                boolean r1 = r11.f1434G
                r8 = 1
                if (r1 == 0) goto L33
                android.database.Cursor r4 = r11.f1438K
                if (r4 != 0) goto L26
                android.support.v7.app.h r9 = new android.support.v7.app.h
                android.content.Context r3 = r11.f1444a
                int r4 = r12.f1393M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r11.f1465v
                r1 = r9
                r2 = r11
                r7 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L67
            L26:
                android.support.v7.app.i r9 = new android.support.v7.app.i
                android.content.Context r3 = r11.f1444a
                r5 = 0
                r1 = r9
                r2 = r11
                r6 = r0
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                goto L67
            L33:
                boolean r1 = r11.f1435H
                if (r1 == 0) goto L3a
                int r1 = r12.f1394N
                goto L3c
            L3a:
                int r1 = r12.f1395O
            L3c:
                r4 = r1
                android.database.Cursor r5 = r11.f1438K
                r1 = 16908308(0x1020014, float:2.3877285E-38)
                if (r5 == 0) goto L59
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r11.f1444a
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r2 = r11.f1439L
                r7 = 0
                r6[r7] = r2
                int[] r10 = new int[r8]
                r10[r7] = r1
                r2 = r9
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                goto L67
            L59:
                android.widget.ListAdapter r9 = r11.f1466w
                if (r9 == 0) goto L5e
                goto L67
            L5e:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r2 = r11.f1444a
                java.lang.CharSequence[] r3 = r11.f1465v
                r9.<init>(r2, r4, r1, r3)
            L67:
                android.support.v7.app.AlertController$a$a r1 = r11.f1442O
                if (r1 == 0) goto L6e
                r1.m1723a(r0)
            L6e:
                r12.f1388H = r9
                int r1 = r11.f1436I
                r12.f1389I = r1
                android.content.DialogInterface$OnClickListener r1 = r11.f1467x
                if (r1 == 0) goto L81
                android.support.v7.app.j r1 = new android.support.v7.app.j
                r1.<init>(r11, r12)
            L7d:
                r0.setOnItemClickListener(r1)
                goto L8b
            L81:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r11.f1437J
                if (r1 == 0) goto L8b
                android.support.v7.app.k r1 = new android.support.v7.app.k
                r1.<init>(r11, r0, r12)
                goto L7d
            L8b:
                android.widget.AdapterView$OnItemSelectedListener r1 = r11.f1441N
                if (r1 == 0) goto L92
                r0.setOnItemSelectedListener(r1)
            L92:
                boolean r1 = r11.f1435H
                if (r1 == 0) goto L9a
                r0.setChoiceMode(r8)
                goto La2
            L9a:
                boolean r1 = r11.f1434G
                if (r1 == 0) goto La2
                r1 = 2
                r0.setChoiceMode(r1)
            La2:
                r12.f1406g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AlertController.C0310a.m1721b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public void m1722a(AlertController alertController) {
            View view = this.f1450g;
            if (view != null) {
                alertController.m1715b(view);
            } else {
                CharSequence charSequence = this.f1449f;
                if (charSequence != null) {
                    alertController.m1716b(charSequence);
                }
                Drawable drawable = this.f1447d;
                if (drawable != null) {
                    alertController.m1710a(drawable);
                }
                int i = this.f1446c;
                if (i != 0) {
                    alertController.m1714b(i);
                }
                int i2 = this.f1448e;
                if (i2 != 0) {
                    alertController.m1714b(alertController.m1707a(i2));
                }
            }
            CharSequence charSequence2 = this.f1451h;
            if (charSequence2 != null) {
                alertController.m1712a(charSequence2);
            }
            if (this.f1452i != null || this.f1453j != null) {
                alertController.m1709a(-1, this.f1452i, this.f1454k, (Message) null, this.f1453j);
            }
            if (this.f1455l != null || this.f1456m != null) {
                alertController.m1709a(-2, this.f1455l, this.f1457n, (Message) null, this.f1456m);
            }
            if (this.f1458o != null || this.f1459p != null) {
                alertController.m1709a(-3, this.f1458o, this.f1460q, (Message) null, this.f1459p);
            }
            if (this.f1465v != null || this.f1438K != null || this.f1466w != null) {
                m1721b(alertController);
            }
            View view2 = this.f1469z;
            if (view2 != null) {
                if (this.f1432E) {
                    alertController.m1711a(view2, this.f1428A, this.f1429B, this.f1430C, this.f1431D);
                    return;
                } else {
                    alertController.m1719c(view2);
                    return;
                }
            }
            int i3 = this.f1468y;
            if (i3 != 0) {
                alertController.m1718c(i3);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    /* loaded from: classes.dex */
    private static final class HandlerC0311b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1470a;

        public HandlerC0311b(DialogInterface dialogInterface) {
            this.f1470a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1470a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AlertController$c */
    /* loaded from: classes.dex */
    public static class C0312c extends ArrayAdapter<CharSequence> {
        public C0312c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0314B dialogC0314B, Window window) {
        this.f1400a = context;
        this.f1401b = dialogC0314B;
        this.f1402c = window;
        this.f1398R = new HandlerC0311b(dialogC0314B);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0121j.AlertDialog, C0112a.alertDialogStyle, 0);
        this.f1390J = obtainStyledAttributes.getResourceId(C0121j.AlertDialog_android_layout, 0);
        this.f1391K = obtainStyledAttributes.getResourceId(C0121j.AlertDialog_buttonPanelSideLayout, 0);
        this.f1392L = obtainStyledAttributes.getResourceId(C0121j.AlertDialog_listLayout, 0);
        this.f1393M = obtainStyledAttributes.getResourceId(C0121j.AlertDialog_multiChoiceItemLayout, 0);
        this.f1394N = obtainStyledAttributes.getResourceId(C0121j.AlertDialog_singleChoiceItemLayout, 0);
        this.f1395O = obtainStyledAttributes.getResourceId(C0121j.AlertDialog_listItemLayout, 0);
        this.f1396P = obtainStyledAttributes.getBoolean(C0121j.AlertDialog_showTitle, true);
        this.f1403d = obtainStyledAttributes.getDimensionPixelSize(C0121j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        dialogC0314B.m1749a(1);
    }

    /* renamed from: a */
    private ViewGroup m1695a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1696a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: a */
    private void m1697a(ViewGroup viewGroup) {
        int i;
        Button button;
        this.f1414o = (Button) viewGroup.findViewById(R.id.button1);
        this.f1414o.setOnClickListener(this.f1399S);
        if (TextUtils.isEmpty(this.f1415p) && this.f1417r == null) {
            this.f1414o.setVisibility(8);
            i = 0;
        } else {
            this.f1414o.setText(this.f1415p);
            Drawable drawable = this.f1417r;
            if (drawable != null) {
                int i2 = this.f1403d;
                drawable.setBounds(0, 0, i2, i2);
                this.f1414o.setCompoundDrawables(this.f1417r, null, null, null);
            }
            this.f1414o.setVisibility(0);
            i = 1;
        }
        this.f1418s = (Button) viewGroup.findViewById(R.id.button2);
        this.f1418s.setOnClickListener(this.f1399S);
        if (TextUtils.isEmpty(this.f1419t) && this.f1421v == null) {
            this.f1418s.setVisibility(8);
        } else {
            this.f1418s.setText(this.f1419t);
            Drawable drawable2 = this.f1421v;
            if (drawable2 != null) {
                int i3 = this.f1403d;
                drawable2.setBounds(0, 0, i3, i3);
                this.f1418s.setCompoundDrawables(this.f1421v, null, null, null);
            }
            this.f1418s.setVisibility(0);
            i |= 2;
        }
        this.f1422w = (Button) viewGroup.findViewById(R.id.button3);
        this.f1422w.setOnClickListener(this.f1399S);
        if (TextUtils.isEmpty(this.f1423x) && this.f1425z == null) {
            this.f1422w.setVisibility(8);
        } else {
            this.f1422w.setText(this.f1423x);
            Drawable drawable3 = this.f1417r;
            if (drawable3 != null) {
                int i4 = this.f1403d;
                drawable3.setBounds(0, 0, i4, i4);
                this.f1414o.setCompoundDrawables(this.f1417r, null, null, null);
            }
            this.f1422w.setVisibility(0);
            i |= 4;
        }
        if (m1700a(this.f1400a)) {
            if (i == 1) {
                button = this.f1414o;
            } else if (i == 2) {
                button = this.f1418s;
            } else if (i == 4) {
                button = this.f1422w;
            }
            m1699a(button);
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m1698a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f1402c.findViewById(C0117f.scrollIndicatorUp);
        View findViewById2 = this.f1402c.findViewById(C0117f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0107v.m495a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById == null && view2 == null) {
            return;
        }
        if (this.f1405f != null) {
            this.f1381A.setOnScrollChangeListener(new C0325d(this, findViewById, view2));
            this.f1381A.post(new RunnableC0326e(this, findViewById, view2));
            return;
        }
        ListView listView = this.f1406g;
        if (listView != null) {
            listView.setOnScrollListener(new C0327f(this, findViewById, view2));
            this.f1406g.post(new RunnableC0328g(this, findViewById, view2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
    }

    /* renamed from: a */
    private void m1699a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m1700a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0112a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m1701a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1701a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m1702b() {
        int i = this.f1391K;
        return (i != 0 && this.f1397Q == 1) ? i : this.f1390J;
    }

    /* renamed from: b */
    private void m1703b(ViewGroup viewGroup) {
        this.f1381A = (NestedScrollView) this.f1402c.findViewById(C0117f.scrollView);
        this.f1381A.setFocusable(false);
        this.f1381A.setNestedScrollingEnabled(false);
        this.f1386F = (TextView) viewGroup.findViewById(R.id.message);
        TextView textView = this.f1386F;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1405f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f1381A.removeView(this.f1386F);
        if (this.f1406g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f1381A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f1381A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f1406g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private void m1704c() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f1402c.findViewById(C0117f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C0117f.topPanel);
        View findViewById5 = findViewById3.findViewById(C0117f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C0117f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0117f.customPanel);
        m1705c(viewGroup);
        View findViewById7 = viewGroup.findViewById(C0117f.topPanel);
        View findViewById8 = viewGroup.findViewById(C0117f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C0117f.buttonPanel);
        ViewGroup m1695a = m1695a(findViewById7, findViewById4);
        ViewGroup m1695a2 = m1695a(findViewById8, findViewById5);
        ViewGroup m1695a3 = m1695a(findViewById9, findViewById6);
        m1703b(m1695a2);
        m1697a(m1695a3);
        m1706d(m1695a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (m1695a == null || m1695a.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (m1695a3 == null || m1695a3.getVisibility() == 8) ? false : true;
        if (!z3 && m1695a2 != null && (findViewById2 = m1695a2.findViewById(C0117f.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.f1381A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f1405f == null && this.f1406g == null) ? null : m1695a.findViewById(C0117f.titleDividerNoCustom);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m1695a2 != null && (findViewById = m1695a2.findViewById(C0117f.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1406g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m1720a(z2, z3);
        }
        if (!z) {
            View view = this.f1406g;
            if (view == null) {
                view = this.f1381A;
            }
            if (view != null) {
                m1698a(m1695a2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f1406g;
        if (listView2 == null || (listAdapter = this.f1388H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.f1389I;
        if (i > -1) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    /* renamed from: c */
    private void m1705c(ViewGroup viewGroup) {
        View view = this.f1407h;
        if (view == null) {
            view = this.f1408i != 0 ? LayoutInflater.from(this.f1400a).inflate(this.f1408i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m1701a(view)) {
            this.f1402c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1402c.findViewById(C0117f.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1413n) {
            frameLayout.setPadding(this.f1409j, this.f1410k, this.f1411l, this.f1412m);
        }
        if (this.f1406g != null) {
            ((C0416Q.a) viewGroup.getLayoutParams()).f2124a = 0.0f;
        }
    }

    /* renamed from: d */
    private void m1706d(ViewGroup viewGroup) {
        if (this.f1387G != null) {
            viewGroup.addView(this.f1387G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1402c.findViewById(C0117f.title_template).setVisibility(8);
            return;
        }
        this.f1384D = (ImageView) this.f1402c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f1404e)) || !this.f1396P) {
            this.f1402c.findViewById(C0117f.title_template).setVisibility(8);
            this.f1384D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f1385E = (TextView) this.f1402c.findViewById(C0117f.alertTitle);
        this.f1385E.setText(this.f1404e);
        int i = this.f1382B;
        if (i != 0) {
            this.f1384D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f1383C;
        if (drawable != null) {
            this.f1384D.setImageDrawable(drawable);
        } else {
            this.f1385E.setPadding(this.f1384D.getPaddingLeft(), this.f1384D.getPaddingTop(), this.f1384D.getPaddingRight(), this.f1384D.getPaddingBottom());
            this.f1384D.setVisibility(8);
        }
    }

    /* renamed from: a */
    public int m1707a(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1400a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public void m1708a() {
        this.f1401b.setContentView(m1702b());
        m1704c();
    }

    /* renamed from: a */
    public void m1709a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1398R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f1423x = charSequence;
            this.f1424y = message;
            this.f1425z = drawable;
        } else if (i == -2) {
            this.f1419t = charSequence;
            this.f1420u = message;
            this.f1421v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1415p = charSequence;
            this.f1416q = message;
            this.f1417r = drawable;
        }
    }

    /* renamed from: a */
    public void m1710a(Drawable drawable) {
        this.f1383C = drawable;
        this.f1382B = 0;
        ImageView imageView = this.f1384D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f1384D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: a */
    public void m1711a(View view, int i, int i2, int i3, int i4) {
        this.f1407h = view;
        this.f1408i = 0;
        this.f1413n = true;
        this.f1409j = i;
        this.f1410k = i2;
        this.f1411l = i3;
        this.f1412m = i4;
    }

    /* renamed from: a */
    public void m1712a(CharSequence charSequence) {
        this.f1405f = charSequence;
        TextView textView = this.f1386F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean m1713a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1381A;
        return nestedScrollView != null && nestedScrollView.m1528a(keyEvent);
    }

    /* renamed from: b */
    public void m1714b(int i) {
        this.f1383C = null;
        this.f1382B = i;
        ImageView imageView = this.f1384D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f1384D.setImageResource(this.f1382B);
            }
        }
    }

    /* renamed from: b */
    public void m1715b(View view) {
        this.f1387G = view;
    }

    /* renamed from: b */
    public void m1716b(CharSequence charSequence) {
        this.f1404e = charSequence;
        TextView textView = this.f1385E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean m1717b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1381A;
        return nestedScrollView != null && nestedScrollView.m1528a(keyEvent);
    }

    /* renamed from: c */
    public void m1718c(int i) {
        this.f1407h = null;
        this.f1408i = i;
        this.f1413n = false;
    }

    /* renamed from: c */
    public void m1719c(View view) {
        this.f1407h = view;
        this.f1408i = 0;
        this.f1413n = false;
    }
}
