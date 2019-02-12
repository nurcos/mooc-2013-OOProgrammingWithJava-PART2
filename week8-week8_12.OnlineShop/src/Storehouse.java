import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Storehouse(){
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(stocks.containsKey(product) && stocks.get(product) > 0){
            stocks.put(product, stocks.get(product)-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> listProducts = products.keySet();
        return listProducts;
    }
}
