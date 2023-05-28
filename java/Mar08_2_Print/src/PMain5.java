
public class PMain5 {
	public static void main(String[] args) throws InterruptedException {
		// 명함 만들기
		// 이름, 나이, 성별, 키, 사는곳, 별명
		// escape sequence + printf (%d, %.1f, %s)
		
		System.out.println("***********************");
		System.out.println("*       자기소개      *");
		System.out.println("***********************");
		System.out.printf("*이름   : %s\n","이현석      *" );
		System.out.printf("*나이   : %d          *\n",30);  // \n\r를 쓰는게 통상적이나 간단한 경우는 가능 콘솔에 텍스트 출력시 필
		System.out.printf("*성별   : %s\n", "남자        *");
		System.out.printf("*키     : %dcm       *\n",168);
		System.out.printf("*몸무게 : %.1fkg      *\n", 64.1);
		System.out.printf("*사는곳 : %s\n" , "경남 김해시 *");
		System.out.printf("*별명   : %s\n", "현새        *");
		System.out.println("***********************");
		System.out.println("*       감사합니다    *");
		System.out.println("***********************");
		// \t를 활용해서 자간을 맞추는것이 좋다. 
		
		
		Thread.sleep(5000); // 1000밀리 초 당 1초
	}
}
