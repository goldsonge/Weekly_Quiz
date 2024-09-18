import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart(List<Product> products) {
        this.products = products;
    }

    // 배송료 계산 메서드 (여기서는 무게에 따라 배송료를 계산하는 간단한 예시)
    public double calculateDeliveryCharge() {
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return totalWeight * 0.5; // 단위 무게당 배송료 계산
    }

    public double calculateTotalPrice(Promotion promotion) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.applyPromotion(promotion);
        }
        return totalPrice;
    }
}
