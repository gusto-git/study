import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionMain {
	public static void main(String[] args) {
		// 한번에 연결 가능
		SqlSession ss = null; // con + pstmt
		try {
			 InputStream is = Resources.getResourceAsStream("asdf.xml");
			 SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			 SqlSessionFactory ssf = ssfb.build(is);
			 ss = ssf.openSession();
			 System.out.println("성공");
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		ss.close();
	}
}
