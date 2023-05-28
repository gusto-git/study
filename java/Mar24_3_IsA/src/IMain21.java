// A is a B : 상속관계
// 쇼핑몰 - '상품'에 대한 정보를 게시하고 싶음
public class IMain21 {
	public static void main(String[] args) {
		// 신발(이름, 가격, 사이즈)
		
		Shoes s = new Shoes("삼선슬리퍼", 3000, 250);
		s.printInfo();
		System.out.println("=======================");
		
		// 컴퓨터(이름, 가격, cpu, ram , hdd)
		
		Computer com = new Computer("삼성", 1200000, "i5-13600K", 32, 1000);
		com.printInfo();
		System.out.println("=======================");
		
		// 노트북(이름, 가격, cpu, ram , hdd , 무게, 배터리 지속시간)
		Laptop lap = new Laptop("삼성", 1230000, "i5-12600", 32, 500, 1.2, 8);
		lap.printInfo();
		System.out.println("=======================");
	}
}
