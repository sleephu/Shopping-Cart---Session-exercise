<%@page import="shop.Catalog, shop.ShoppingCart,shop.ItemOrder, java.util.ArrayList, java.text.NumberFormat"%>
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
synchronized(session) {
	 cart = (ShoppingCart)session.getAttribute("shoppingCart");
}
if (cart == null) {
     cart = new ShoppingCart();
     session.setAttribute("shoppingCart", cart);
}
%>
<%
if (action.equals("view")){
	synchronized(session) {
    	 cart = (ShoppingCart)session.getAttribute("shoppingCart");
    	 if (cart == null){
    		 cart = new ShoppingCart();
	         session.setAttribute("shoppingCart", cart);
    	 }
    	 ArrayList<Object> itemsOrdered = cart.getItemsOrdered(); %>
    	
    <h1>Items Currently in Your Cart</h1>
    	<hr>
    	 <%
    	 if (itemsOrdered.size() == 0) {  %>
    		<H2><I>No items in your cart...</I></H2>
    	 <% }else {

    		 ItemOrder order;
    		 NumberFormat formatter = NumberFormat.getCurrencyInstance();
    		 double sum=0;
    		 for(int i=0; i<itemsOrdered.size(); i++) {
    				 order = (ItemOrder)((java.util.List<Object>) itemsOrdered).get(i); 
    				 %>		 
    <p> <% out.println(i+1); %> . <% out.println(order.getName());  %>       <% out.println(formatter.format(order.getUnitCost())); %>      
  <% out.println("[<a href=\"OrderPage?move=delete&itemID="+order.getItemID()+"\">Remove from Cart</a>]</p><br/>"); %>
    				 <% sum +=order.getUnitCost();
    		 } %>	
    		<hr>
    		<h1>TOTAL:                    $<% out.println(sum); %> </h1>
    		 <%
    	}
    }
}
%>
</body>
</html>