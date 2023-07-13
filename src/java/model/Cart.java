package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public Cart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public Item getItemByID(int id){
        for(Item item : items){
            if(item.getProduct().getProductID() == id){
                return item;
            }
        }
        return null;
    }
    
    public void addItemToCart(Item item){
        if(getItemByID(item.getProduct().getProductID()) != null){
            Item oldItem = getItemByID(item.getProduct().getProductID());
            oldItem.setQuantity(oldItem.getQuantity() + item.getQuantity());
        }
        else{
            items.add(item);
        }
    }
    
    public void removeItem(int id){
        Item item = getItemByID(id);
        if(item != null){
            items.remove(item);
        }
    }
    
    public float getTotalMoney(){
        float sum = 0;
        for(Item item : items){
            sum += item.getProduct().getPrice()*item.getQuantity();
        }
        return sum;
    }
}
