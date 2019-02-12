import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        Purchase newPurchase = new Purchase(product, 1, price);
        
        if(!purchases.containsKey(product)){
            purchases.put(product, newPurchase);
        }
        else{
            purchases.get(product).increaseAmount();
        }

    }
    
    public int price(){
        int price = 0;
        for(Purchase purchase : purchases.values()){
            price += purchase.price();
        }
        
        return price;
    }
    
    public void print(){
        for(Purchase purchase : purchases.values()){
            System.out.println(purchase);
        }
    }
}
