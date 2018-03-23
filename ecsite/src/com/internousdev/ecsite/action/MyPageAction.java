package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;


public class MyPageAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private List<BuyItemDTO> buyItemDTOList;

	public ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	private String deleteFlg;

	private String message;


	public String execute() throws SQLException{
		@SuppressWarnings("unchecked")
		List<BuyItemDTO> buyItemDTOList = (List<BuyItemDTO>) session.get("list");
		if(!session.containsKey("id")){
			return ERROR;
		}

		if(deleteFlg == null){

			if(buyItemDTOList !=null){
				for(int i=0; i < buyItemDTOList.size(); i++){
					String user_master_id = session.get("login_user_id").toString();
					MyPageDAO myPageDAO = new MyPageDAO();
					myPageList = myPageDAO.getMyPageUserInfo(user_master_id);
				}

			}else{
				String user_master_id = session.get("login_user_id").toString();
				MyPageDAO myPageDAO = new  MyPageDAO();
				myPageList = myPageDAO.getMyPageUserInfo(user_master_id);
			}

				Iterator<MyPageDTO> iterator = myPageList.iterator();
				if(!(iterator.hasNext())){
					myPageList = null;
				}
			}else{
				delete();
			}

			String result = SUCCESS;
			return result;
		}

		public void delete() throws SQLException{

			@SuppressWarnings("unchecked")
			List<BuyItemDTO> buyItemDTOList = (List<BuyItemDTO>) session.get("list");

			String user_master_id = session.get("login_user_id").toString();

			MyPageDAO myPageDAO = new MyPageDAO();
			int res = myPageDAO.buyItemHistoryDelete(user_master_id);

			if(res > 0){
				myPageList = null;
				setMessage("商品情報を正しく削除しました。");
			}else if(res == 0){
				setMessage("商品情報の削除に失敗しました。");
		}
	}

		public String setDeleteFlg(){
			return deleteFlg;
		}

		public void setDeleteFlg(String deleteFlg){
			this.deleteFlg = deleteFlg;
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
		public String getMessage(){
			return message;
		}

		public void setMessage(String message){
			this.message = message;
		}

}
