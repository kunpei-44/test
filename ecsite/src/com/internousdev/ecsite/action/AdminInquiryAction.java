package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AdminInquiryDAO;
import com.internousdev.ecsite.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminInquiryAction extends ActionSupport implements SessionAware {

	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();
	private Map<String, Object> session;
	private String deleteFlg = "0";

	public String execute(){

		AdminInquiryDAO dao = new AdminInquiryDAO();
		inquiryDTOList = dao.select();
		session.put("inquiryDTOList", inquiryDTOList);
		return SUCCESS;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}


	}

