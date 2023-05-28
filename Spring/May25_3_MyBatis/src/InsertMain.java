import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// int a = 10;
// 기본형 -> BigDecimal
// BigDecimal b = new BigDecimal(a);
// BigDecimal -> 기본형
// int c = b.intValue();


public class InsertMain {
	public static void main(String[] args) {
		SqlSession ss = null;
		
		try {
			InputStream is = Resources.getResourceAsStream("asdf.xml");
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(is);
			ss = ssf.openSession();
			
			// 값 넣기(fdsa.xml의 #{}로 된 부분 채우기)
			Scanner k = new Scanner(System.in);
			System.out.print("커피이름 : ");
			String n = k.next();
			System.out.print("가격 : ");
			BigDecimal p = k.nextBigDecimal();
			
			// console에 입력받은 값을 pojo(javabean)에 입력하기
			Coffee c = new Coffee(n, p);
			
			if (ss.insert("fdsa.regCoffee", c) == 1) {
				System.out.println("입력완");
				ss.commit(); // db에 실제반영
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		ss.close();
		
	}
}
