
public class Order {

    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;


    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    private PaymentMode paymentMode;

    public Order() {

    }

    public Order(String item, Double unitPrice, Integer quantity, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.paymentMode = paymentMode;
    }

    public Order(String item, Double unitPrice, Integer quantity, Double totalAmount, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.paymentMode = paymentMode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return unitPrice * quantity * (1 - paymentMode.determineDiscountRate());
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

}