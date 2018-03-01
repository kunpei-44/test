/**
 *
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/**
 * <p>MySQLに接続する為のユーティリティクラスです。<br>
 *ルートアカウントにてDBに接続されます。</p>
 */
public class DBConnecter {

	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url =
			"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String password = "mysql";

public Connection getConnection(){
	Connection con = null;
	try{
		Class.forName(driverName);
		con = (Connection) DriverManager.getConnection(url,user,password);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return con;
}
}