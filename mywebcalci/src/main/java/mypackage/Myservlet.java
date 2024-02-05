package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Myservlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    PrintWriter sout=null;
	    try {
	    	sout=response.getWriter();
	    	sout.println("<center>");
	    	int num1=Integer.parseInt(request.getParameter("firstnumber"));
	    	int num2=Integer.parseInt(request.getParameter("secondnumber"));
	    	float c=0;
	    	String op=request.getParameter("btn");
	    	if(op.equals("+")) {
	    	
	    		c=num1+num2;
	    	}else if(op.equals("-")) {
	    		c=num1-num2;
	    	}else if(op.equals("*")) {
	    		c=num1*num2;
	    	}else {
	    		c=num1/num2;
	    	}
	    	
	    	sout.println("<h1>"+"The Result is "+num1+op+num2+"="+c+"</h1>");
	    	
	    }catch(Exception e) {
	    	sout.println(e.getMessage());
	    	sout.println("Go to Main Page<a href=index.html> Click Here");
	    	sout.println("</center>");
	    }finally {
	    	
	    	
	    }
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
