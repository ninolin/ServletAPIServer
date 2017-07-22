package nino.API.Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import nino.API.APIBaseServlet;

@WebServlet("/login")
public class login extends APIBaseServlet{
	
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JSONObject objJSON = new JSONObject();
		objJSON.put("hellobbbb", "bbbb");
		//objJSON.write(response.getWriter());
		//System.out.println("bbb");
		//JSONObject objJSON2 = new JSONObject();
		//objJSON2.put("helloa", "cccc");
		//objJSON2.write(response.getWriter());
		//System.out.println("cccc");
		//response.setContentType("application/json");
		//response.getWriter().write(objJSON2.toString());
		this.myResult.setDATA(objJSON);
		this.myResult.setResult(1);
	}
}
