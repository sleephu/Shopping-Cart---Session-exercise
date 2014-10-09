package shop;

public class ItemOrder {
	private CatalogItem item;
	private int numItems;
	
	public ItemOrder(CatalogItem item) {
		setItem(item);
		setNumItems(1);
	}
	public CatalogItem getItem() {
		return (item);
	}

	protected void setItem(CatalogItem item) {
		this.item = item;
	}
	public String getItemID() {
		return (getItem().getItemID());
	}

	public String getName() {
		return (getItem().getName());
	}
	public double getUnitCost() {
		return (getItem().getCost());
	}

	public int getNumItems() {
		return (numItems);
	}
	public void setNumItems(int n) {
		this.numItems = n;
	}

	public void incrementNumItems() {
		setNumItems(getNumItems() + 1);
	}
	public void cancelOrder() {
		setNumItems(0);
	}

	public double getTotalCost() {
		return (getNumItems() * getUnitCost());
	}
}
