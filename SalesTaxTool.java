public class SalesTaxTool {

    public static void main(String[] args) {
        double itemPrice = 0;
        final double SALES_TAX = 0.5;
        double itemTax = 0;

        itemTax = SALES_TAX * itemPrice;

        System.out.println("The price of your item is " + itemPrice + ". Your tax is " + itemTax);
    }
}

