import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SelectMain {
	public static void main(String[] args) {
		SqlSession ss = null;
		try {
			// 연결 
			InputStream is = Resources.getResourceAsStream("asdf.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(is);
			ss = ssf.openSession();
			
			// 값 -  List<자바빈>
			// ss.selectList(namespace.id)
			List<Coffee> coffees = ss.selectList("fdsa.getAllCoffee");
			for (Coffee c : coffees) {
				System.out.println(c.getC_name());
				System.out.println(c.getC_price());
				System.out.println("-------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		ss.close();
		
	}
}	
