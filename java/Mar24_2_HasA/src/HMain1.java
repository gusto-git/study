// A has a B : 포함관계


public class HMain1 {
	public static void main(String[] args) {
		// 이름이 Kim Andrew, 성별 : 남자 , 폰번호 010-1234-5678
		// 정보 출력
		Person p = new Person("Kim Andrew" ,"male", "010-1234-5678");
		p.printInfo();
		System.out.println("==============");
		// 강남포차, 신논현역, 022223333, Kim Andrew의 식당 
		// 식당주인의 정보까지
		
		Store s = new Store("강남포차", "신논현역", "022223333", p);
		s.printInfo();
		System.out.println("==============");
		// 석쇠 불고기, 25000, 강남포차에서 파는 메뉴
		// 관련된 정보 모두 출력
		
		Menu m = new Menu("석쇠불고기", 25000, s);
		m.printInfo();
		System.out.println("==============");
		
		// 계란말이, 18000, 강남포차에서 파는 메뉴
		// 관련된 정보 모두 출력
		Menu m1 = new Menu("계란말이", 18000, s);
		m1.printInfo();
		System.out.println("==============");
		
		// 석쇠, 5000원, 석쇠불고기를 담은 접시
		// 관련된 전체정보를 모두 출력
		Tool t = new Tool("석쇠", 5000, m1);
		t.printInfo();
		System.out.println("==============");
		
	    /////////////////////////////////////////////////////////////////////////	
		// 가락시장, 송파구, 석뢰를 구매한 시장(Market)
		Market mk = new Market("가락시장", "송파구", t);
		mk.printInfo();
		System.out.println("==============");
		
		// 이수호, 가락시장을 좋아하는 상인
		Merchant mer = new Merchant("이수호",  mk);
		mer.printInfo();
		
		// 이수호의 이름만 출력 
		System.out.println(mer.name);
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장정보를 출력
		mer.like.printInfo();
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장의 위치는 어디 ?
		System.out.println(mer.like.location);
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장에서 산 접시의 전체정보
		mer.like.buy.printInfo();
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장에서 산 접시의 가격
		System.out.println(mer.like.buy.price);
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장에서 산 접시에 담긴 메뉴 전체정보
		mer.like.buy.dish.printInfo();
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장에서 산 접시에 담긴 메뉴명 출력
		System.out.println(mer.like.buy.dish.name);
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 연락처
		System.out.println(mer.like.buy.dish.where.callNumber);
		System.out.println("==============");
		
		// 이수호가 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 주인 연락처
		System.out.println(mer.like.buy.dish.where.owner.handy);
		System.out.println("==============");
		
		// 계란말이를 파는 사람의 연락처
		System.out.println(m1.where.owner.handy);
		System.out.println("==============");
		
		
	}
}
