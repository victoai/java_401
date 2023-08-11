package projectTeam.티켓팅프로그램;

import java.util.Scanner;

public class ReservationManager {
	static Scanner sc = new Scanner(System.in);
	
	public ReservationManager() { //기본 생성자
	}

	// 좌석 조회
	public static void reservationConfirm(Area[] Sector) {
		System.out.println(" ");
		System.out.println(
				"--------------------------------------좌석을 등록합니다.----------------------------------------------");
		System.out.println(" ");
		System.out.println(
				"                                        <STAGE>                                                  ");
		System.out.println(" ");

		for (int i = 0; i < Sector[0].Concert.length; i++) {
			System.out.print("    VIP " + (i + 1) + "번" + " " + Sector[0].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[1].Concert.length; i++) {
			System.out.print(" S열 " + (i + 1) + "석" + " " + Sector[1].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[2].Concert.length; i++) {
			System.out.print(" A열 " + (i + 1) + "석" + " " + Sector[2].Concert[i] + " ");
		}
		System.out.println(" ");
		for (int i = 0; i < Sector[3].Concert.length; i++) {
			System.out.print(" B열 " + (i + 1) + "석" + " " + Sector[3].Concert[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	// 좌석 등록
	public static void reservationSeat(Scanner sc, Area[] Sector) {
		String Concert_Insert = sc.next().toUpperCase();

		switch (Concert_Insert) {
		case "V":
			selectSeat(Sector[0]); //'V'구역 예약좌석 선택
			break;
		case "S":
			selectSeat(Sector[1]); //'S'구역 예약좌석 선택
			break;
		case "A":
			selectSeat(Sector[2]); //'A'구역 예약좌석 선택
			break;
		case "B":
			selectSeat(Sector[3]); //'B'구역 예약좌석 선택
			break;
		default:
			System.out.println("잘못된 구역입니다.");
			break;
		}
	}

	//좌석 삭제
	public static void reservationDelete(Scanner sc, Area[] Sector) {
		System.out.println(
				"\n--------------------------- 기존 좌석의 열과 번호를 입력해주세요 구역:A,B,S,V-------------------------------- \n ");
		String Concert_Update = sc.next().toUpperCase();

		switch (Concert_Update) {
		case "V":
			deleteSeat(Sector[0]); //'V'구역에서 좌석삭제
			break;
		case "S":
			deleteSeat(Sector[1]); //'S'구역에서 좌석삭제
			break;
		case "A":
			deleteSeat(Sector[2]); //'A'구역에서 좌석삭제
			break;
		case "B":
			deleteSeat(Sector[3]); //'B'구역에서 좌석삭제
			break;
		default:
			System.out.println("잘못된 구역입니다.");
			break;
		}
	}

	//좌석 변경
	public static void reservationChange(Scanner sc, Area[] Sector) {

		reservationDelete(sc, Sector); //기존 좌석 삭제 
		System.out.println(
				"\n--------------------------- 변경할 좌석을 다시 입력해주세요 구역:A,B,S,V -----------------------------------\n ");
		reservationSeat(sc, Sector); //새로 좌석 등록

	}

	// 좌석 삭제 관련 매서드
	public static void deleteSeat(Area sector) {
		System.out.println("좌석을 선택해주세요:");

		String index_ = sc.nextLine();
		int index  = Integer.parseInt(index_);

		if (index >= 0 && index < sector.Concert.length) {
			if (sector.Concert[index - 1] == '■') {
				sector.Concert[index - 1] = '□'; // 선택된 좌석을 빈 좌석으로 변경
				System.out.println(index + " 번 좌석" + "취소가 완료되었습니다.");
			} else {
				System.out.println("이미 빈 좌석입니다.");
			}
		} else {
			System.out.println("잘못된 좌석 번호입니다.");
		}
	}

	// 좌석 선택 관련 매서드
	public static void selectSeat(Area sector) {
		Scanner sc = new Scanner(System.in);

		System.out.println("좌석을 선택해주세요:");
		int index = sc.nextInt();

		if (index >= 0 && index < sector.Concert.length) {
			if (sector.Concert[index - 1] == '■') {
				System.out.println("이미 등록된 좌석입니다");
			} else {
				sector.Concert[index - 1] = '■'; // 선택된 좌석을 '■'로 표시
				System.out.println("선택이 완료되었습니다.");
			}
		} else {
			System.out.println("잘못된 좌석 번호입니다.");
		}

	}

	// 선택된 좌석 수 구하기
	public static int countSelectedSeats(Area sector) {
		int count = 0;
		for (char seat : sector.Concert) {
			if (seat == '■') {
				count++; 
			} //좌석배열을 검사해서 예약된 좌석수를 카운트
		}
		return count;
	}

	// 금액 구하기
	public static void totalPrice(Area[] Sector) {

		int totalPrice = countSelectedSeats(Sector[0]) * 150000 + countSelectedSeats(Sector[1]) * 120000
				+ countSelectedSeats(Sector[2]) * 100000 + countSelectedSeats(Sector[3]) * 100000;
		//모든 좌석을 카운트해서 구역별로 금액을 다르게 계산
		System.out.println("총수익은 " + totalPrice + "원 입니다");
	}
}
