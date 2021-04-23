package model;

public class UsersVO {
	private String user_id;
	private String user_pw; 
	private String user_name; 
	private int user_div;
	public UsersVO() {
		super();
	}
	public UsersVO(String user_id, String user_pw, String user_name, int user_div) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_div = user_div;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_div() {
		return user_div;
	}
	public void setUser_div(int user_div) {
		this.user_div = user_div;
	}
	@Override
	public String toString() {
		return "UsersVO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_div="
				+ user_div + "]";
	}
	
	
}
