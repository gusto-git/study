import java.math.BigDecimal;

// Javabean,	DTO, POJO(Plain Old Java Object) 다 같은말 

// Framework : 시키는대로만 하면 자동으로 처리해줌

//	MyBatis ORM 발동조건
//		1. Javabean 멤버변수명 = DB 필드명(c_name, c_price)
//		2. OracleDB한정) number 타입: 정수 / 실수 공용
//			Java에 정수/실수 공용 자료형 -> BigDecimal로 사용 
public class Coffee {
	private String c_name;
	private BigDecimal c_price;
	
	public Coffee() {
		// TODO Auto-generated constructor stub
	}

	public Coffee(String c_name, BigDecimal c_price) {
		super();
		this.c_name = c_name;
		this.c_price = c_price;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public BigDecimal getC_price() {
		return c_price;
	}

	public void setC_price(BigDecimal c_price) {
		this.c_price = c_price;
	}
	
	
}
