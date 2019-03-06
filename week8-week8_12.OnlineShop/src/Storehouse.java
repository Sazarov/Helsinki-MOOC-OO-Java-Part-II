import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> store;
    private Map<String, Integer> stock;

    public Storehouse() {
        store = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        store.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if(!store.containsKey(product)) {
            return -99;
        }
        return store.get(product);
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if(!stock.containsKey(product)) {
            return false;
        } else {
            int currentStock = stock.get(product);
            if(currentStock >= 1) {
                stock.replace(product, --currentStock);
                return true;
            } else {
                return false;
            }
        }
    }

    public Set<String> products() {
        return store.keySet();
    }


}
