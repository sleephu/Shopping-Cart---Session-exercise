package shop;

public class Catalog {
	private static CatalogItem[] items =
	    { 
		   new CatalogItem("01","Java Servlet Programming", 29.95),
	       new CatalogItem("02","Oracle Database Programming",48.95),
	       new CatalogItem("03","System Analysis and Design With UML",14.95),
	       new CatalogItem("04","Object Oriented Software engineering",35.99),
	       new CatalogItem("05","Java Web Services",27.99), 
	       new CatalogItem("06","I'm Going to Tell You a Secret By Madonna",26.99),
	       new CatalogItem("07","Baby one more time By Brienty Spears",10.95),
	       new CatalogItem("08","Justified By Justin Timberlake",9.97),
	       new CatalogItem("09","Loose By Nelly Furtado",13.98),
	       new CatalogItem("10","Gold Digger By Kanye West",27.99),
	       new CatalogItem("11","Apple Mac Pro with 13.3' Display",1299.99),
	       new CatalogItem("12","Asus Laptop With Centrino 2 Black",945.95),
	       new CatalogItem("13","HP Pavilion Laptop With Centrino 2 DV7",1199.95),
	       new CatalogItem("14","Toshiba Satellite Laptop With Centrino 2-Copper",899.99),
	       new CatalogItem("15","Sony VAIO Laptop With Core 2 Duo Cosmopolitan Pink",799.99)
		};
	public static CatalogItem getItem(String itemID){
		CatalogItem item;
		if(itemID==null){	
			return(null);
		}
		for(int i=0; i<items.length;i++){
			item = items[i];
			if(itemID.equals(item.getItemID())){
				return(item);
			}
			
		}
		return null;
	}
}
