package nino.API;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class APIBaseServlet
 */
@WebServlet("/APIBaseServlet")
public class APIBaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public APIBaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   /* protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String strMethod = request.getMethod();
    	System.out.println(strMethod);
    	if (strMethod.equals("GET")) {
        	doGet(request,response);
        }else if (strMethod.equals("POST")) {
        	doPost(request,response);
        }else if (strMethod.equals("DELETE")) {
        	doDelete(request,response);
        }else if (strMethod.equals("PUT")){
        	doPut(request,response);
        }else{
        	
        }
    }*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
