public class ProductInfo {
    private String productName;
    private double price;

    public ProductInfo(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductInfo{name='" + productName + "', price=" + price + "}";
    }
}
