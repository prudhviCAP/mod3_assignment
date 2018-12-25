package loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		if(username.equals("prithvi")&&password.equals("admin123")){
			pw.print("<html><body>"+
					"<h3>"+"Welcome "+username+" ! "+
					"<br/>"+
					"login successful"+
					"</h3>"+"</body>");
		}
		else{
			pw.print("<html><body>"+
					"<h3>"+"Login failed  "+
					" ! "+"<br/>"+
					"<a href='login.html'>go to login page</a>"+
					"</h3>"+"</body>");
		}
		
	}

}
