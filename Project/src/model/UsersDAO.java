package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import util.DBUtil;

public class UsersDAO {

	public UsersVO loginChk(String cid, String cpass) {
		UsersVO uvo = null;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * from users where user_id=? and user_pw=?";
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, cid);
			st.setString(2, cpass);		
			rs = st.executeQuery();
			while (rs.next()) {
//				ManagerVO vo=new ManagerVO(rs.getInt(1),rs.getString(2));
				
				uvo = makeUser(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBUtil.dbClose(rs, st, conn);
		return uvo;
	}
	
	public int insert(UsersVO uvo) {
		  String sql ="insert into users values(?,?,?,?)";
	      Connection conn;
	      PreparedStatement st=null;
	      int result=0;
	      
	      conn = DBUtil.getConnection();
	      try {

	         st=conn.prepareStatement(sql);
	         
	         st.setString(1,uvo.getUser_id() );
	         st.setString(2,uvo.getUser_pw() );
	         st.setString(3,uvo.getUser_name() );
	         st.setInt(4,uvo.getUser_div() );
	        
				
	         result =st.executeUpdate(); //insert/update/delete�� executeUpdate()�� ����Ѵ�.
	        
	      } catch (SQLException e) {
	         try {
	            conn.rollback();
	         } catch (SQLException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	         }
	         e.printStackTrace();
	      }finally {
	         DBUtil.dbClose(null, st, conn);
	      }
	      
	      return result;
		
		
		
		
		
	}
	private UsersVO makeUser(ResultSet rs) throws SQLException {
		UsersVO uvo = new UsersVO(); 
		uvo.setUser_id(rs.getString("user_id"));
		uvo.setUser_pw(rs.getString("user_pw"));
		uvo.setUser_name(rs.getString("user_name"));
		uvo.setUser_div(rs.getInt("user_div"));
		return uvo;
	}
	
}
