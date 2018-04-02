package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dao.ItemManageDAO;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class ItemManageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private int id;
	private List<BuyItemDTO> list = new ArrayList<>();
	private ItemManageDAO dao = new ItemManageDAO();
	private String errorMessage;

	public String execute() {


		String result = ERROR;


		if(id != 0) {

		result = SUCCESS;

		list = dao.itemUpdate(id);

		String selectName = list.get(0).getItemName();
		session.put("itemName", selectName);

		String selectPrice = list.get(0).getItemPrice();
		session.put("itemPrice", selectPrice);

		int selectStock = list.get(0).getItem_stock();
		session.put("item_stock", selectStock);

		session.put("updateId", id);
		}


		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<BuyItemDTO> getList(){
		return list;
	}

	public void setList(List<BuyItemDTO> list) {
		this.list = list;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
