
public class MianDemo {

	public static void main(String[] args) {
		User u=new User();
		u.setId(4);
		u.setName("����");
		u.setAge(20);
		UserDao ud=new UserDaoImpl();
		ud.add(u);
	}

}
