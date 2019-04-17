package java019_designmode.Proxy;

public class UserDaoImpl implements UserDao{

	@Override
	public void save() {
		System.out.println("----已经保存数据!----");
		
	}

}
