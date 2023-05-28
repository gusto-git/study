
public class OMain2 {
	public static void main(String[] args) {
		
		// start 메소드의 파라미터로 사용하기 위해 Friend 클래스 객체로 부르기
		// Me Class는 start 메소드 안에서 불렀기 때문에
		// 파라미터로 필요가 없으므로 main 메소드에서도 부를 필요가 없음! 
		Referee r = new Referee();
		Friend2 f = new Friend2(); // 객체를 불러온다 -> f는 인스턴스명, 인스턴스를 생성한다. 
		r.start(f);
	}
}
// 이게 정답 