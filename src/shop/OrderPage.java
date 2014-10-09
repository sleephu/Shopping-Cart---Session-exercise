package shop;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OrderPage
 */
@WebServlet("/OrderPage")
public class OrderPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = null;
		String action = request.getParameter("move");
		HttpSession session= request.getSession();
		ShoppingCart cart;
		synchronized (session) {
			cart = (ShoppingCart)session.getAttribute("shoppingCart");
			if(cart == null){
				cart = new ShoppingCart();
				session.setAttribute("shoppingCart", cart);
			}
			session.setAttribute("shoppingCart", cart);
			
			 if (action.equals("add")){
//			    	synchronized(session) {
//			    		String[] itemID = request.getParameterValues("itemID");//ItemsOrdered.get();
//						if (itemID != null) {
//							for (int i=0;i<itemID.length;i++){
//								cart.addItem(itemID[i]);
//							}
				address= "orderPage.jsp";	
				request.setAttribute("itemID",request.getParameterValues("itemID") );
//						}
//			    	}
			    }else if(action.equals("delete")){
//			    	synchronized (session) {
//			    		cart = (ShoppingCart)session.getAttribute("shoppingCart");
//			    		if(cart==null){
//			    			cart = new ShoppingCart();
//			    			session.setAttribute("shoppingCart", cart);
//			    		}
//						String itemID = request.getParameter("itemID");
//						cart.removeItem(itemID);
						address = "orderPage.jsp";
						request.setAttribute("itemID",request.getParameter("itemID"));
//					}
			    }
			    else if(action.equals("view")){
//			    	synchronized (session) {
//			    		cart = (ShoppingCart)session.getAttribute("shoppingCart");
//			           if(cart==null){
//			        	   cart = new ShoppingCart();
//			        	   session.setAttribute("shoppingCart", cart);
//			           }
//			           ArrayList<Object> itemsOrdered = cart.getItemsOrdered();
						address="shoppingCart.jsp";
//					}
			    	
			    }
			
			 
			    }
		 request.setAttribute("move", action);
//		 request.setAttribute("itemID",request.getParameterValues("itemID") );
		 RequestDispatcher dispatcher =request.getRequestDispatcher(address);
		 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
