package projectTeam.프로젝트_도서관ver3.copy;

import java.util.Scanner;

public class 도서관정보{

	 
	
	우리도서관 now = new 우리도서관("여의샛강도서관", "영등포구 여의대로 24  평일 09:00~20   주말 09:00~17:00", "매주 월요일  법정공휴일","개인당 최대 10권",  "최대 21일  연장불가","전 화 번 호 : 02-2629-2222");
	대림도서관 dl = new 대림도서관();
	생각공장도서관 sg = new 생각공장도서관();
	
	 
	
	
	public void other() {
		
		loop05:while(true) {
			System.out.println(" ====================\n 도서관 정보를 조회합니다.\n --------------------\n 1. 우리도서관\n 2. 대림도서관\n 3. 생각공장도서관\n 4. 종료\n ====================\n");

			// 이름, 주소, 운영시간, 휴관일, 대여권수, 대여일수, 전화번호
			Scanner sc = new Scanner(System.in);
			String su = sc.nextLine();
			int suNum = Integer.parseInt(su);
			switch(suNum) {
			case 1:
				System.out.println("\n 현재 도서관 정보");
				System.out.println(" ====================");
				System.out.println( now);
				System.out.println("");
				break;
			case 2:
				System.out.println("\n 대림도서관 정보");
				System.out.println(" ====================");
				System.out.println( dl );
				System.out.println("");
				break;
			case 3 :
				System.out.println("\n 생각공장도서관 정보");
				System.out.println(" ====================");
				System.out.println(sg);
				System.out.println("");
				break;
			case 4 :
				System.out.println("종료\n ====================\n");
				break loop05;
			}
		}
	}
	
}