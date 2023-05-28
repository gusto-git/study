import java.util.Scanner;

public class CMain5 {
	// 직업 :
	// DBA(상위 데이터베이스 관리자) / dba
		// DB 전원관리
		// 백업 / 복구
		// 명어로 CRUD
		// 서비스 활동
	// DBP(데이터베이스 프로그래머) / dbp
		// 명령어로  CRUD
		// 서비스 활동
	// DBU(사용자) /dbu 
		// 서비스 활동 
	// 대 소 문자 구분없이 검색이 가능하도록 만들 것
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("직업 : ");
		String job = k.next();
		
		switch (job) {
		case "DBA": // case "DBA": case "dba":도 가능함 
		case "dba":
			System.out.println("DB 전원관리");
			System.out.println("백업/복구");
			
		case "DBP":
		case "dbp":
			System.out.println("명령어로 CRUD");
			
		case "DBU":
		case "dbu":
			System.out.println("서비스 활동");
			break;		

		default:
			System.out.println("DB 손해보험");
			break;
			// break와 비슷한 원리로 case를 두번 쓰면 된다. -> 대소문자 구분하기 
		}
	}
}
