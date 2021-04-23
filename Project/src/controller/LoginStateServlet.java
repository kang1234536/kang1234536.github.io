package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsersDAO;
import model.UsersVO;

/**
 * Servlet implementation class LoginStateServlet
 */
@WebServlet("/LoginStateServlet")
public class LoginStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginStateServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("userid");
		String user_pw = request.getParameter("userpw");
		
		UsersVO uvo = new UsersVO();
		UsersDAO udao = new UsersDAO();
		UsersVO a = udao.loginChk(user_id, user_pw);
		
		
		
		
		 if (a.getUser_id().equals(user_id) && a.getUser_pw().equals(user_pw)) {
		  System.out.println("로그인에성공하였습니다."); }
		 else if(!a.getUser_id().equals(user_id)) {
			 System.out.println("아이디가 잘못되었습니다.");
		 }else if( !a.getUser_pw().equals(user_pw)) {
			 System.out.println("비밀번호가 잘못되었습니다.");
		 }
		 else {
		 System.out.println("로그인에실패하였습니다."); }
		 

	}

}
