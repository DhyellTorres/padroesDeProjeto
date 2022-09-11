package secao1_5;

public class InvoiceItem {
  // Ex: The InvoiceItem Class
  // private instance variables
  private String id;
  private String desc;
  private int qty;
  private double unitPrice;

  // constructors
  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  // public methods
  public String getID() {
    return id;
  }

  public String getDesc() {
    return desc;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotal() {
    return unitPrice * qty;
  }

  @Override
  public String toString() {
    return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
  }

}
