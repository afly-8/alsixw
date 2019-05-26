import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConnectMysql {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/xiaole", "root", "123456");
		Statement s= (Statement) c.createStatement();
		s.execute("select * from test");
		ResultSet set=s.getResultSet();
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			int age=set.getInt(3);
			System.out.println(id+"===="+name+"===="+age);
		}
	}

}
