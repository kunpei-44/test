package com.internousdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dao.LoginDAO;
import com.internousdev.webproj4.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	public String execute() {
		String ret=ERROR;
		System.out.println(username);
		System.out.println(password);
		LoginDAO dao=new LoginDAO();

		loginDTOList=dao.select(username, password);
		if(this.username.equals(loginDTOList.get(0).getUsername()) && this.password.equals(loginDTOList.get(0).getPassword())){
			ret= SUCCESS;
		}else{
			ret=ERROR;
		}
		return ret;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<LoginDTO> getLoginDTOList() {
		return loginDTOList;
	}

	public void setLoginDTOList(List<LoginDTO> loginDTOList) {
		this.loginDTOList = loginDTOList;
	}

}