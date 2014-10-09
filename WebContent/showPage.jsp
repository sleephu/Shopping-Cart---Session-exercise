
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
/* CatalogPage currentPage =
CatalogPageLookUp.getCatalogPage((request.getParameter("type")));
request.setAttribute("pages", currentPage); */
String type =request.getParameter("type");
%>
<%-- Shop for ${type}  
<hr> --%>
<% if(type.equals("Books")){ %>
<p>Shop for ${type}</p>
		<hr>
<p style="text-align:right"> [<a href="OrderPage?move=view">View Cart</a>]</p>
<form action="orderPage1" method="post">
<label><input name="itemID" type="checkbox" value="01" />Java Servlet Programming [$29.95]</label><br/>
<label><input name="itemID" type="checkbox" value="02" />Oracle Database Programming[$48.95]</label><br/>
<label><input name="itemID" type="checkbox" value="03" />System Analysis and Design With UML[$14.95]</label><br/>
<label><input name="itemID" type="checkbox" value="04" />Object Oriented Software engineering[$35.99]</label><br/>
<label><input name="itemID" type="checkbox" value="05" />Java Web Services[$27.99]</label><br/>
<input name="move" type="hidden" value="add"/>
<input type="submit" value="Add to Cart"/></form>
<% } else if (type.equals("Music")){ %>
<p>Shop for CDs</p>
		<hr>
<p style="text-align:right"> [<a href="OrderPage?move=view">View Cart</a>]</p>
<form action="OrderPage" method="post">
<label><input name="itemID" type="checkbox" value="06" />I'm Going to Tell You a Secret By Madonna[$26.99]</label><br/>
<label><input name="itemID" type="checkbox" value="07" />Baby one more time By Brienty Spears[$10.95]</label><br/>
<label><input name="itemID" type="checkbox" value="08" />Justified By Justin Timberlake[$9.97]</label><br/>
<label><input name="itemID" type="checkbox" value="09" />Loose By Nelly Furtado[$13.98]</label><br/>
<label><input name="itemID" type="checkbox" value="10" />Gold Digger By Kanye West[$27.99]</label><br/>
<input name="move" type="hidden" value="add"/>
<input type="submit" value="Add to Cart"/></form>
<% } else if (type.equals("Computers")){ %>
<p>Shop for Laptops</p>
		<hr>
<p style="text-align:right"> [<a href="OrderPage?move=view">View Cart</a>]</p>
<form action="OrderPage" method="post">
<label><input name="itemID" type="checkbox" value="11" />Apple Mac Pro with 13.3' Display [$1299.99]</label><br/>
<label><input name="itemID" type="checkbox" value="12" />Asus Laptop With Centrino 2 Black[$945.95]</label><br/>
<label><input name="itemID" type="checkbox" value="13" />HP Pavilion Laptop With Centrino 2 DV7[$1199.95]</label><br/>
<label><input name="itemID" type="checkbox" value="14" />Toshiba Satellite Laptop With Centrino 2-Copper[$899.99]</label><br/>
<label><input name="itemID" type="checkbox" value="15" />Sony VAIO Laptop With Core 2 Duo Cosmopolitan Pink[$799.99]</label><br/>
<input name="move" type="hidden" value="add"/>
<input type="submit" value="Add to Cart"/></form>
<% } %>

<%-- ${CatalogItem[0]} 
${CatalogItem[1]} 
${CatalogItem[2]} 
${CatalogItem[3]} 
${CatalogItem[4]}  --%>
</body>
</html>