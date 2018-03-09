package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private String result;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();
	public String execute() throws SQLException {

		buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("login_user_id").toString(),
				session.get("buyItem_price").toString(),
				session.get("stock").toString(),
				session.get("pay").toString());

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
