public class PaymentApp {
    public static void main(String[] args) {
        Order gcashPay = new Order("keyboard", 300.0, 10, new Gcash());
        System.out.println("Order item is " + gcashPay.getItem() + ".");
        System.out.println("Unit price is " + gcashPay.getUnitPrice());
        System.out.println("Quantity is " + gcashPay.getQuantity() + "\n");

        System.out.println("Payment order details if " + gcashPay.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + gcashPay.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + gcashPay.getTotalAmount() + "\n");

        Order mayaPay = new Order();
        mayaPay.setItem("keyboard");
        mayaPay.setUnitPrice(300.0);
        mayaPay.setQuantity(10);
        mayaPay.setPaymentMode(new Maya());

        System.out.println("Payment order details if " + mayaPay.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + mayaPay.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + mayaPay.getTotalAmount()+ "\n");

        Order shopee = new Order("keyboard", 300.0, 10, new ShopeePay());
        System.out.println("Payment order details if " + shopee.getPaymentMode().getClass().getSimpleName());
        System.out.println("Discount rate is " + shopee.getPaymentMode().determineDiscountRate());
        System.out.println("Payment amount is " + shopee.getTotalAmount());

    }
}
