import java.security.Provider;
import java.util.List;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ServiseProduct ser = new ServiseProduct();


        ser.addProduct(new Product("Laptop","Hp","whilte","Brown table",2025));
        ser.addProduct(new Product("Hindi","books","diffrent_cloure","Box",2022));
        ser.addProduct(new Product("Tablate", "acer", "black","white table",2024));
        ser.addProduct(new Product("Android", "Samsung", "black","pocket",2020));
        ser.getAllProduct();
        System.out.println("================================================================================");
        Product p= ser.getProduct("Laptop");
       System.out.println(p);

    }
}
