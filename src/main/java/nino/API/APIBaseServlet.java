package nino.API;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nino.API.Data.Result;

import org.json.JSONException;

/**
 * Servlet implementation class APIBaseServlet
 */
@WebServlet("/APIBaseServlet")
public class APIBaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected Result myResult;
	protected String sAPI = "";
	protected boolean doResponse = true;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public APIBaseServlet() {
        super();
        this.sAPI = this.getClass().getName();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "*");
		response.addHeader("Access-Control-Allow-Headers", "Content-Type");

		this.myResult = new Result(this.sAPI, System.currentTimeMillis());
      
    	String strMethod = request.getMethod();

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
    	// Do response
        if(this.doResponse) {
        	try {
        		this.myResult.toJSONObject().write(response.getWriter());
        		//response.getWriter().write(this.myResult);
        	} catch(JSONException e) {
        		throw new ServletException(e.getMessage());
        	}
        }
    }
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
