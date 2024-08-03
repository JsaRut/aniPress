package p031c.p032a.p072p.p073a.p075b;

import java.util.Map;
import p031c.p032a.p072p.p073a.p080f.p081a.C0732b;

/* renamed from: c.a.p.a.b.k */
/* loaded from: classes.dex */
public class C0719k extends AbstractC0716h {

    /* renamed from: d */
    @InterfaceC0715g("purchase_goods_id")
    private String f3255d;

    /* renamed from: e */
    @InterfaceC0715g("purchase_goods_name")
    private String f3256e;

    /* renamed from: f */
    @InterfaceC0715g("purchase_price")
    private double f3257f;

    /* renamed from: g */
    @InterfaceC0715g("purchase_success")
    private boolean f3258g;

    /* renamed from: h */
    @InterfaceC0715g("purchase_currency")
    private EnumC0714f f3259h;

    /* renamed from: i */
    @InterfaceC0715g("purchase_goods_type")
    private String f3260i;

    /* renamed from: j */
    @InterfaceC0715g("purchase_quantity")
    private int f3261j;

    /* renamed from: k */
    private boolean f3262k;

    /* renamed from: l */
    private boolean f3263l;

    public C0719k() {
        super("custom_purchase");
        this.f3262k = false;
        this.f3263l = false;
    }

    public C0719k(String str, String str2, double d2, boolean z, EnumC0714f enumC0714f, String str3, int i) {
        super("custom_purchase");
        this.f3262k = false;
        this.f3263l = false;
        this.f3255d = str;
        this.f3256e = str2;
        this.f3257f = d2;
        this.f3258g = z;
        this.f3259h = enumC0714f;
        this.f3260i = str3;
        this.f3261j = i;
        this.f3262k = true;
        this.f3263l = true;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    /* renamed from: b */
    public boolean mo3637b() {
        String str;
        if (!super.mo3637b()) {
            return false;
        }
        Map<String, String> map = this.f3248a;
        if (map != null) {
            if (map.containsKey("purchase_currency")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_currency");
                this.f3248a.remove("purchase_currency");
            }
            if (this.f3248a.containsKey("purchase_goods_id")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_goods_id");
                this.f3248a.remove("purchase_goods_id");
            }
            if (this.f3248a.containsKey("purchase_goods_name")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_goods_name");
                this.f3248a.remove("purchase_goods_name");
            }
            if (this.f3248a.containsKey("purchase_goods_type")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_goods_type");
                this.f3248a.remove("purchase_goods_type");
            }
            if (this.f3248a.containsKey("purchase_success")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_success");
                this.f3248a.remove("purchase_success");
            }
            if (this.f3248a.containsKey("purchase_price")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_price");
                this.f3248a.remove("purchase_price");
            }
            if (this.f3248a.containsKey("purchase_quantity")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_quantity");
                this.f3248a.remove("purchase_quantity");
            }
            if (this.f3248a.containsKey("purchase_time")) {
                m3642b("PurchaseEvent", "There was a conflict between custom key/value and model key/value, the conflicted custom key/value will be abandoned, and the event will be recordedpurchase_time");
                this.f3248a.remove("purchase_time");
            }
        }
        if (!m3640a(this.f3255d, "purchaseGoodsid", false) || !m3640a(this.f3256e, "purchaseGoodsname", false) || !m3640a(this.f3260i, "purchaseGoodstype", false)) {
            return false;
        }
        if (!this.f3262k) {
            str = "invalide PurchaseEvent - purchasePrice must set value";
        } else if (this.f3259h == null) {
            str = "invalide PurchaseEvent - purchaseCurrency was empty";
        } else {
            if (this.f3263l) {
                return true;
            }
            str = "invalide PurchaseEvent - purchaseSuccess must set value";
        }
        C0732b.m3724g("PurchaseEvent", str);
        return false;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0719k.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C0719k c0719k = (C0719k) obj;
        String str = this.f3255d;
        if (str == null ? c0719k.f3255d != null : !str.equals(c0719k.f3255d)) {
            return false;
        }
        String str2 = this.f3256e;
        if (str2 == null ? c0719k.f3256e != null : !str2.equals(c0719k.f3256e)) {
            return false;
        }
        if (this.f3257f != c0719k.f3257f || this.f3258g != c0719k.f3258g || this.f3261j != c0719k.f3261j) {
            return false;
        }
        EnumC0714f enumC0714f = this.f3259h;
        if (enumC0714f == null ? c0719k.f3259h != null : !enumC0714f.equals(c0719k.f3259h)) {
            return false;
        }
        String str3 = this.f3260i;
        return str3 != null ? str3.equals(c0719k.f3260i) : c0719k.f3260i == null;
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3255d;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3256e;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + ((int) this.f3257f)) * 31) + this.f3261j) * 31) + (this.f3258g ? 1 : 0)) * 31;
        EnumC0714f enumC0714f = this.f3259h;
        int hashCode4 = (hashCode3 + (enumC0714f != null ? enumC0714f.hashCode() : 0)) * 31;
        String str3 = this.f3260i;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p031c.p032a.p072p.p073a.p075b.AbstractC0716h
    public String toString() {
        return "PurchaseEvent{purchaseGoodsCount=" + this.f3261j + ", purchaseGoodstype='" + this.f3260i + "', purchaseCurrency=" + this.f3259h + ", purchaseSuccess=" + this.f3258g + ", purchasePrice=" + this.f3257f + ", purchaseGoodsname='" + this.f3256e + "', purchaseGoodsid='" + this.f3255d + '\'' + super.toString() + '}';
    }
}
