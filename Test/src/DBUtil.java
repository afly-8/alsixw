import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBUtil {
	static String url="jdbc:mysql"+"//localhost:3308/xiaole";
	static String root="root";
	static String pwd="123456";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		Connection con=null;
		try {
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/xiaole", "root", "123456");
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return con;
	}
}
