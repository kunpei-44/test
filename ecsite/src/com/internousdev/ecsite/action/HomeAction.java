package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<BuyItemDTO> buyItemDTOList;

	public String execute(){
		String result = "login";
		if(session.containsKey("id")){
			buyItemDTOList = buyItemDAO.getBuyItemInfo();
			session.put("buyItemDTOList", buyItemDTOList);

			result = SUCCESS;
		}

		return result;

	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList = buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public void setsession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

}
