package day6.arry2;

public class 태민님 {

	public static void main(String[] args) {
		
		String[][] comics = {
				{"데스노트", "20세기소년", "몬스터", "블리치", "나루토"},
				{"아따맘마", "명탐정코난", "주술회전", "건담", "헌터헌터"}
			};
		
		System.out.println(comics[0][0]);
		System.out.println(comics[0][1]);
		System.out.println(comics[0][2]);
		System.out.println(comics[0][3]);
		System.out.println(comics[0][4]);
		
		System.out.println(comics[1][0]);
		System.out.println(comics[1][1]);
		System.out.println(comics[1][2]);
		System.out.println(comics[1][3]);
		System.out.println(comics[1][4]);
		System.out.println();
		
		
		for(int i=0; i<comics.length; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(comics[i][j]);
			}
		}

	}

}
