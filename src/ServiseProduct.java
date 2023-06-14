import  java.util.List;
import java.util.ArrayList;
public class ServiseProduct {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    void getAllProduct() {
        for (Product p : products)
            System.out.println(p);
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

}
