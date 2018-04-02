package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemManageDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private List<BuyItemDTO> list = new ArrayList<BuyItemDTO>();

	public List<BuyItemDTO> itemUpdate(int id){

		String sql = "SELECT id, item_name, item_price, item_stock FROM item_info_transaction where id = ? ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				BuyItemDTO dto = new BuyItemDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItem_stock(resultSet.getInt("item_stock"));
				list.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return list;

	}



}
