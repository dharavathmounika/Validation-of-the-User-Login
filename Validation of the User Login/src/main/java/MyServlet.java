import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		String userName =request.getParameter("userName");
		String password =request.getParameter("password");
		if ("aditya".equalsIgnoreCase(userName) && "aditya99".equals(password)){
			rd=getServletContext().getRequestDispatcher("/Welcome.html");
					System.out.println("Valid user");
			rd.forward(request,response);
		}else {
			rd=getServletContext().getRequestDispatcher("/LoginError.html");
					System.out.println("Invalid user");
					rd.forward(request,response);
		}
		
		response.getWriter().append("Response from doGet()");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
