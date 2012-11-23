package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String biO = request.getParameter("bio");
		String hddTest = request.getParameter("hddTest");
		String paramLink = request.getParameter("paramLink");
		
		System.out.println(">>>>>>Test>>>>>>>");
		System.out.println("user>>" + userName);
		System.out.println("pass>>" + passWord);
		System.out.println("bio>>" + biO);
		System.out.println("hddTest>>"+ hddTest);
		System.out.println("paramLink>>"+paramLink);
		String destination = "/result.jsp";


		//HttpSession sess = request.getSession();
		request.setAttribute("username", userName);
		request.setAttribute("password", passWord);
		request.setAttribute("bio", biO);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
	}

}
