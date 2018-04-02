package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {

	private ArrayList<BuyItemDTO> buyItemDTOList = new ArrayList<>();

	private List<String> count;
	private int pay;
	public Map<String, Object> session;

	public String execute(){

		String result = SUCCESS;

		session.put("count", count);

		@SuppressWarnings("unchecked")
		ArrayList<BuyItemDTO> list =(ArrayList<BuyItemDTO>) session.get("buyItemDTOList");

		for(int i=0; i<count.size(); i++){
			BuyItemDTO buyItemDTO = new BuyItemDTO();

			String buyItemName = list.get(i).getItemName();
			session.put("itenName",buyItemName);

			String buyItemPrice = list.get(i).getItemPrice();
			session.put("itemPrice", buyItemPrice);

			int buyItemId = list.get(i).getId();
			session.put("id", buyItemId);

			int item_stock = list.get(i).getItem_stock();

			int intCount = Integer.parseInt(count.get(i));

			int intPrice = Integer.parseInt(list.get(i).getItemPrice());


			if(intCount !=0){

				buyItemDTO.setId((int) session.get("id"));
				buyItemDTO.setItemName(session.get("itenName").toString());
				buyItemDTO.setItemPrice(session.get("itemPrice").toString());
				buyItemDTO.setCount(intCount);
				buyItemDTO.setItem_stock(item_stock);
				buyItemDTO.setTotal_price(intCount * intPrice);
				session.put("total_price",intCount * intPrice);

				String payment;

				if(pay == 1){
					payment = "現金払い";
					session.put("pay",payment);
					buyItemDTO.setPay(payment);
				}else{
					payment = "クレジットカード";
					session.put("pay",payment);
					buyItemDTO.setPay(payment);
				}

				buyItemDTOList.add(buyItemDTO);
			}

			session.put("list",buyItemDTOList);
		}

		if(buyItemDTOList.size()>1){
			int totalPrice=0;
			for(int a=0; a<buyItemDTOList.size(); a++){
				totalPrice = totalPrice + buyItemDTOList.get(a).getTotal_price();
			}
			System.out.println(totalPrice);
			session.put("totalPrice", totalPrice);
		}

		return result;
	}

	public List<String> getCount(){
		return count;
	}

	public void setCount(List<String> count){
		this.count = count;
	}

	public int getPay(){
		return pay;
	}

	public void setPay(int pay){
		this.pay = pay;
	}

	public ArrayList<BuyItemDTO> getBuyItemDTOList(){
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(ArrayList<BuyItemDTO> buyItemDTOList){
		this.buyItemDTOList = buyItemDTOList;
	}



	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
