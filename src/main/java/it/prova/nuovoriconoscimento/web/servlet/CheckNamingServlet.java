package it.prova.nuovoriconoscimento.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckNamingServlet")
public class CheckNamingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckNamingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userParameter = request.getParameter("usernameInput");
		String pwdParameter = request.getParameter("passwordInput");
		
		
		if(userParameter!=null && !userParameter.isEmpty() && userParameter.equalsIgnoreCase("test")) {
			RequestDispatcher rd = request.getRequestDispatcher("nonregistrato.jsp");
			rd.forward(request, response);
		}
//			response.getWriter().append("Served at: " + userParameter).append(request.getContextPath());
	}

}
