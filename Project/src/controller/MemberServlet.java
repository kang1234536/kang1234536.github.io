package controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import model.UsersDAO;
import model.UsersVO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		rd=request.getRequestDispatcher("loginForm.jsp");
		rd.forward(request, response);
	}
	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		request.setCharacterEncoding("utf-8");
		
		UsersVO uvo = new UsersVO();
		
		uvo.setUser_id(request.getParameter("userid"));
		uvo.setUser_pw(request.getParameter("userpw"));
		uvo.setUser_name(request.getParameter("username"));
		uvo.setUser_div(Integer.parseInt(request.getParameter("usernumber")));
		System.out.println(uvo);
		
		
	
		UsersDAO udao = new UsersDAO();
		
		udao.insert(uvo);
		
		
		
		
		
	}

}
