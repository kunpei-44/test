package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.InquiryCompleteDAO;
import com.internousdev.ecsite.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryCompleteAction extends ActionSupport implements SessionAware {

	private String name;
	private String qtype;
	private String body;
	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();
	private Map<String, Object> session;
	private String deleteFlg = "0";
	private InquiryCompleteDAO dao = new InquiryCompleteDAO();

	public String execute() {
		System.out.println(name);
		System.out.println(qtype);
		System.out.println(body);

		String ret = SUCCESS;

		if (deleteFlg.equals("0")) {
			if (!(name.equals("")) && !(qtype.equals("")) && !(body.equals(""))) {
				int count = dao.insert(name, qtype, body);
				if (count > 0) {
					inquiryDTOList = dao.select();
					session.put("inquiryDTOList", inquiryDTOList);

				}
				ret = SUCCESS;
			}


			System.out.println("aaa");

		} else{
			delete();
			ret = "delete";
		}
		return ret;
	}

	public void delete() {
		int i = dao.delete();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
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
