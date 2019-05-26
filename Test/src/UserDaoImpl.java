import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserDaoImpl implements UserDao {

	@Override
	public void add(User user) {
		// TODO 自动生成的方法存根
		Connection con=DBUtil.getCon();
		String sql="insert into"+"test(id,name,age)"+"values(?,?,?)";
		try {
			PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
			pst.setInt(1, user.getId());
			pst.setString(2, user.getName());
			pst.setInt(3, user.getAge());
			int a=pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

//	@Override
//	public void update(int id, User user) {
//		// TODO 自动生成的方法存根
//		
//	}
//
//	@Override
//	public void delete(int id) {
//		// TODO 自动生成的方法存根
//		
//	}
//
//	@Override
//	public List<User> findAll() {
//		// TODO 自动生成的方法存根
//		return null;
//	}
	
}
