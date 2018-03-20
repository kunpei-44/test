package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String userName;
	private String userPrefecture;
	private String userAddress;
	private String userGender;
	private String userTell;
	private boolean loginFlg = false;

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId = loginId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}

	public String getUserPrefecture(){
		return userPrefecture;
	}

	public void setUserPrefecture(String userPrefecture){
		this.userPrefecture = userPrefecture;
	}

	public String getUserAddress(){
		return userAddress;
	}

	public void setUserAddress(String userAddress){
		this.userAddress = userAddress;
	}

	public String getUserGender(){
		return userGender;
	}

	public void setUserGender(String userGender){
		this.userGender = userGender;
	}

	public String getUserTell(){
		return loginId;
	}

	public void setUserTell(String userTell){
		this.userTell = userTell;
	}

}
