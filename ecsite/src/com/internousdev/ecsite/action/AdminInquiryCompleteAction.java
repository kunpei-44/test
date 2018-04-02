package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.InquiryCompleteDAO;
import com.internousdev.ecsite.dto.InquiryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminInquiryCompleteAction extends ActionSupport implements SessionAware {

	private String name;
	private String qtype;
	private String body;
	private String insert_date;
	private String errorMessage;

	Collection<String> checkList;

	List<InquiryDTO> inquiryDTOList = new ArrayList<InquiryDTO>();
	private Map<String, Object> session;
	private String deleteFlg = "0";

	public String execute() {

		 System.out.println(checkList);
		 System.out.println(name);
		 System.out.println(qtype);
		 System.out.println(body);
		 System.out.println(insert_date);

		 String result = ERROR;

		 if(checkList == null) {
			 setErrorMessage("削除するお問い合わせ履歴を選択してください。");
			 return result;
		 }else{

		 String[] nameList = name.split(", ",0);
		 String[] qtypeList = qtype.split(", ",0);
		 String[] bodyList = body.split(", ",0);
//		 String[] insertDateList = insert_date.split(", ",0);

		 InquiryCompleteDAO dao = new InquiryCompleteDAO();
		 int count = 0;
		 for(String check:checkList) {
			 int i = Integer.parseInt(check);
			 count += dao.delete(nameList[i], qtypeList[i], bodyList[i]);
		 }
		 if(count > 0) {
			 result = SUCCESS;
			 return result;
		 }else {
			 result = ERROR;
			 return result;
		 }
		 }

	}

	public List<InquiryDTO> getInquiryDTOList() {
		return inquiryDTOList;
	}

	public void setInquiryDTOList(List<InquiryDTO> inquiryDTOList) {
		this.inquiryDTOList = inquiryDTOList;
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

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}





}
