package user;
// JavaBeans: 하나의 데이터를 관리하고 처리할 수 있는 기법을 JSP에서 구현
public class User {
	
	// 유저정보 자바빈즈
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	
	// 노가다하지말고 자동완성하자
	// alt+shift+s -> Generate Getters and Setters -> Select All -> OK
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
