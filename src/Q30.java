class Bill{
    public static int counter;
    private String billId;
    private String payMentMode;

    static {
        counter = 1;
    }

    public Bill(String paymentMode) {
        this.billId = "B11089" + counter++;
        this.payMentMode = paymentMode;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillId() {
        return billId;
    }

    public void setPayMentMode(String payMentMode) {
        this.payMentMode = payMentMode;
    }

    public String getPayMentMode() {
        return payMentMode;
    }

    public static int getCounter() {
        return counter;
    }

    // Implement your code here
}
class Q30 {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");

        //Create more objects and add them to the bills array for testing your code

        Bill[] bills = { bill1, bill2 };

        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPayMentMode());
            System.out.println();
        }
    }
}


