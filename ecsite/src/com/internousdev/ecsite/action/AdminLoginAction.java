package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminLoginDAO;
import com.internousdev.ecsite.dto.AdminLoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminLoginAction extends ActionSupport implements SessionAware {

	private String adminId;
	private String adminPassword;
	public Map<String, Object> session;
	private AdminLoginDAO adminLoginDAO = new AdminLoginDAO();
	private AdminLoginDTO adminLoginDTO = new AdminLoginDTO();

	public String execute(){
		String result = ERROR;
		adminLoginDTO = adminLoginDAO.getAdminLoginInfo(adminId, adminPassword);
		session.put("loginAdmin", adminLoginDTO);

		if(((AdminLoginDTO) session.get("loginAdmin")).getLoginFlg()){
		result = SUCCESS;
		}
		return result;
	}

	public String getAdminId(){
		return adminId;
	}

	public void setAdminId(String adminId){
		this.adminId = adminId;
	}

	public String getAdminPassword(){
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword){
		this.adminPassword = adminPassword;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
