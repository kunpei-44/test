package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dao.GoItemManageDAO;

public class GoItemManageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private GoItemManageDAO goItemManageDAO = new GoItemManageDAO();
	private List<BuyItemDTO> buyItemDTOList;

	public String execute() {
		String result = SUCCESS;
		
			buyItemDTOList = goItemManageDAO.getBuyItemInfo();
			session.put("buyItemDTOList", buyItemDTOList);

			result = SUCCESS;
			return result;
	}

	public List<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

}
