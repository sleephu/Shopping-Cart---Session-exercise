<%-- <%@page import="shop.CatalogPage"%> --%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style/style.css">
<link rel="stylesheet" type="text/css" href="style/screen.css">
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>store</title>
</head>
<body>


<div>

<a href="ShowPage?type=Books"target="myframe">Books</a><br>
<a href="ShowPage?type=Music" target="myframe">Music</a><br>
<a href="ShowPage?type=Computers" target="myframe">Computers</a>
</div>
<div class="vl"></div>
<div class="n2">
	<iframe name="myframe" id="myframe" frameBorder="0" >
		
	</iframe>
</div>
</body>
</html> 