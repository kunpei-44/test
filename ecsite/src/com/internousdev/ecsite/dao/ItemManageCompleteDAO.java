package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class ItemManageCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private String sql = "UPDATE item_info_transaction SET item_name = ?, item_price = ?, item_stock = ? WHERE id = ?";

	public void itemUpdate(String item_name, String item_price, String item_stock, int id) throws SQLException{

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_name);
			ps.setString(2, item_price);
			ps.setString(3, item_stock);
			ps.setInt(4, id);

			ps.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				con.close();
			}
	}

}
