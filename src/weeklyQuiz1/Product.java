package weeklyQuiz1;

public abstract class Product {
    protected String name;
    protected double price;
    protected double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    // 프로모션을 적용한 가격을 리턴하는 메서드
    public double applyPromotion(Promotion promotion) {
        return price - promotion.getDiscountAmount(this);
    }

    public static class Promotion {
        double getDiscountAmount(Product product) {
            return 0;
        }
    }
}