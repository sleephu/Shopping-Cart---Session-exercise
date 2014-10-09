<%@page
	import="shop.Catalog, shop.CatalogItem, shop.ItemOrder, shop.ShoppingCart, java.util.ArrayList,java.text.NumberFormat,java.io.IOException,java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>store</title>
</head>
<body>
	<%
		String action = request.getParameter("move");

		/* session.setAttribute("ShoppingCart", cart); */
		ShoppingCart cart;
		synchronized (session) {
			cart = (ShoppingCart) session.getAttribute("shoppingCart");
		}
		if (cart == null) {
			cart = new ShoppingCart();
			session.setAttribute("shoppingCart", cart);
		}
		if (action.equals("add")) {
			synchronized (session) {
				String[] itemID = (String[]) request.getAttribute("itemID");
				/* System.out.println("QQQQQQQQQQQ "+itemID[0]); */
				if (itemID != null) {
					for (int i = 0; i < itemID.length; i++) {
						//out.println(itemID[i]);
						//out.println(Catalog.getItem(itemID[i]).getName());
						cart.addItem(itemID[i]);
					}
	%>

					<p>	<b>The following item has been added to your shopping cart sucessfully</b></p>
	<%
					for (int i = 0; i < itemID.length; i++) {
	%>
						<p>-<%	out.println(Catalog.getItem(itemID[i]).getName());%></p>
	<%
					}
				}
			}
		} else if (action.equals("delete")) {
			synchronized (session) {
				cart = (ShoppingCart) session.getAttribute("shoppingCart");
				if (cart == null) {
					cart = new ShoppingCart();
					session.setAttribute("shoppingCart", cart);
				}
				String itemID = request.getParameter("itemID");
				cart.removeItem(itemID);
	%>
	<p>
		<b>The following item has been removed from your shopping cart sucessfully</b>
	</p>
	<p>-<%out.println(Catalog.getItem(itemID).getName());%></p>
	<%
			}
		}
	%><br />
	<p>
		[<a href="OrderPage?move=view">View Cart</a>] [<a href="showPage?type=Books">Go to Books Page</a>] [<a href="showPage?type=Music">Go to Music Page</a>] [<a href="shop.showPage?type=Computers">Go to Computers Page</a>]</p>
</body>
</html>