package shop;

public class CatalogItem {
	private String itemID;
	// private String shortDescription;
	// private String longDescription;
	private String name;
	private double cost;

	public CatalogItem(String itemID, String name, double cost) {
		setItemID(itemID);
		// setShortDescription(shortDescription);
		// setLongDescription(longDescription);
		setName(name);
		setCost(cost);
	}

	public String getItemID() {
		return (itemID);
	}

	protected void setItemID(String itemID) {
		this.itemID = itemID;
	}

	// public String getShortDescription()
	// { return(shortDescription);
	// }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// protected void setShortDescription(String shortDescription)
	// { this.shortDescription = shortDescription;
	// }
	// public String getLongDescription()
	// { return(longDescription);
	// }
	// protected void setLongDescription(String longDescription) {
	// this.longDescription = longDescription;
	// }
	public double getCost() {
		return (cost);
	}

	protected void setCost(double cost) {
		this.cost = cost;
	}
		
}