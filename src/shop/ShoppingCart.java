package shop;

import java.util.ArrayList;

public class ShoppingCart {
	
private ArrayList<Object> itemsOrdered;

public ShoppingCart() {
	itemsOrdered = new ArrayList<>();
}

public ArrayList<Object> getItemsOrdered() {
	return (itemsOrdered);
}

public synchronized void addItem(String itemID){
	ItemOrder order;
	for(int i=0; i<itemsOrdered.size(); i++){
		order=(ItemOrder)itemsOrdered.get(i);
		if(order.getItemID().equals(itemID)){
			order.incrementNumItems();
			return;
		}
	}
	ItemOrder newOrder= new ItemOrder(Catalog.getItem(itemID));
	itemsOrdered.add(newOrder);
}

public synchronized void removeItem(String itemID){
	ItemOrder order;
	for(int i=0; i<itemsOrdered.size(); i++){
		order=(ItemOrder)itemsOrdered.get(i);
		if(order.getItemID().equals(itemID)){
			itemsOrdered.remove(i);
		}
	}
	
}
}
