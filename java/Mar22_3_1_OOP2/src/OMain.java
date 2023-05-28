// 가위, 바위 ,보
// 1.등장인물 : 심판 / 친구 / 나 
// 	-> 다 같이 한자리에 있다는 가정
//  -> 심판에게 룰북(rulebook) 
//  	- 1을 입력하면 가위 , 2를 입력하면 바위 , 3을 입력하면 보 
// 2.각 객체들의 속성 ? 행동 ?
// 3.나를 기준으로 한번 지는 순간 가위바위보 게임은 종료
// 	->내가 질때까지 몇승 몇무 했는지 파악 
public class OMain {
	public static void main(String[] args) {
		
		Referee r = new Referee();
		r.start();
		
		
		
	}
}
