package shop;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowPage")
public class ShowPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ShowPage() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		CatalogPage currentPage =
//			      CatalogPageLookUp.getCatalogPage((request.getParameter("type")));
//			    request.setAttribute("pages", currentPage);
//			    String address;
			    String currentPage= request.getParameter("type");
   
//			    if (currentPage == null) {
//			      address = "UnknownPages.jsp";
//			    } else if (currentPage.equals("Books")) {
//			    	CatalogItem[] items = { 
//					    	   new CatalogItem("01","Java Servlet Programming", 29.95),
//					    	   new CatalogItem("02","Oracle Database Programming",48.95),
//					  	       new CatalogItem("03","System Analysis and Design With UML",14.95),
//					  	       new CatalogItem("04","Object Oriented Software engineering",35.99),
//					  	       new CatalogItem("05","Java Web Services",27.99)};
//			      address = "showPage.jsp";
//			      address = "book.jsp";//It can also use this!~^_^~.
//			    } else if (currentPage.equals("Music")) {
//			    	CatalogItem[] items = { 
//			    			  new CatalogItem("06","I'm Going to Tell You a Secret By Madonna",26.99),
//			    		       new CatalogItem("07","Baby one more time By Brienty Spears",10.95),
//			    		       new CatalogItem("08","Justified By Justin Timberlake",9.97),
//			    		       new CatalogItem("09","Loose By Nelly Furtado",13.98),
//			    		       new CatalogItem("10","Gold Digger By Kanye West",27.99)};
//			      address = "music.jsp?title=huahua";
//			      address = "music.jsp";
//			      address = "showPage.jsp";
//			    } else {
//			    	CatalogItem[] items = { 
//			    	new CatalogItem("11","Apple Mac Pro with 13.3' Display",1299.99),
//				       new CatalogItem("12","Asus Laptop With Centrino 2 Black",945.95),
//				       new CatalogItem("13","HP Pavilion Laptop With Centrino 2 DV7",1199.95),
//				       new CatalogItem("14","Toshiba Satellite Laptop With Centrino 2-Copper",899.99),
//				       new CatalogItem("15","Sony VAIO Laptop With Core 2 Duo Cosmopolitan Pink",799.99)};
//			      address = "showPage.jsp";
//			      address = "computer.jsp";
//			    }
//			    request.setAttribute("a", "huahua");
//			    request.setAttribute("type",currentPage);
			    
                if(currentPage !=null){
                	request.setAttribute("type", currentPage);
                	 RequestDispatcher dispatcher =
             			    request.getRequestDispatcher("showPage.jsp");
             			    dispatcher.forward(request, response);
                }
			   
		};
		
		
		
		
//		CatalogItem[] items = { 
//		    	   new CatalogItem("01","Java Servlet Programming", 29.95),
//		    	   new CatalogItem("02","Oracle Database Programming",48.95),
//		  	       new CatalogItem("03","System Analysis and Design With UML",14.95),
//		  	       new CatalogItem("04","Object Oriented Software engineering",35.99),
//		  	       new CatalogItem("05","Java Web Services",27.99), 
		  	       
		    		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
