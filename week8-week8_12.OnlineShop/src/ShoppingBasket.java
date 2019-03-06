import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if(basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        } else {
            basket.put(product, new Purchase(product, 1, price));
        }

    }

    public int price() {
        int finalPrice = 0;
        for (Purchase purchase :
                basket.values()) {
            finalPrice += purchase.price();
        }
        return finalPrice;
    }

    public void print() {
        for (Purchase purch :
                basket.values()) {
            System.out.println(purch);
        }
    }
}
