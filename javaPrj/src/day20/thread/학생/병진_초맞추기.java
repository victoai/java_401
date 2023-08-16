package day20.thread.학생;

import java.util.Scanner;

public class 병진_초맞추기 {
	static int count = 0;
	static int score = 0;
	static int chance = 5;
	public static void main(String[] args) {
		System.out.println("시간이 흐릅니다. 지금 몇 초인지 맞춰보세요.");
		
		Thread th1 = new Thread(new Timer());
		th1.start();
		
		Thread th2 = new Thread(new PlayerInput());
		th2.start();
	}
}

class Timer extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			병진_초맞추기.count = i+1;
			System.out.printf("%d초\n", 병진_초맞추기.count);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		병진_초맞추기.chance = 0; //게임 오버
	}
}

class PlayerInput extends Thread {
	Scanner sc = new Scanner(System.in);
	@Override
	public void run() {
		int input = 0;
		while(병진_초맞추기.count != 0) {
			System.out.print("시간 맞추기 : \n");
			input = sc.nextInt();
			
			if(input == 병진_초맞추기.count) {
				병진_초맞추기.score += 20;
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.printf("\n정답.\n현재점수 : %d 남은기회 : %d\n", 병진_초맞추기.score, 병진_초맞추기.count);
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}
			else {
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.printf("\n아쉽군요.\n현재점수 : %d 남은기회 : %d\n", 병진_초맞추기.score, 병진_초맞추기.count);
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			}
		}
		
		System.out.println("\nGame Over\n");
		System.out.printf("최종점수 : %d");
	}
}
