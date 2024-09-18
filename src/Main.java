import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product apple = new Grocery("Apple", 1.0, 0.2);
        Product shampoo = new Beauty("Shampoo", 5.0, 0.5);
        Product fridge = new LargeAppliance("Fridge", 200.0, 50.0);

        Cart cart = new Cart(Arrays.asList(apple, shampoo, fridge));

        // 10% 할인을 적용하는 Promotion 구현체
        Promotion tenPercentOff = new Promotion() {
            @Override
            public double getDiscountAmount(Product product) {
                return product.getPrice() * 0.1;
            }
        };

        System.out.println("Total price after promotion: " + cart.calculateTotalPrice(tenPercentOff));
        System.out.println("Total delivery charge: " + cart.calculateDeliveryCharge());
    }
}
