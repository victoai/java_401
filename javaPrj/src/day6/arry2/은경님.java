package day6.arry2;

public class 은경님 {

	public static void main(String[] args) {
		String[][][] language = { 
				  {{ "a", "b", "c", "c", "e" }, { "A", "B", "C", "D",  "E"}},
				  {{ "ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ" }, { "가", "나", "다", "라",  "마"}}
				 }; 

		System.out.print(language[0][0][0] + " ");
		System.out.print(language[0][0][1] + " ");
		System.out.print(language[0][0][2] + " ");
		System.out.print(language[0][0][3] + " ");
		System.out.println(language[0][0][4]);
		
		System.out.print(language[0][1][0] + " ");
		System.out.print(language[0][1][1] + " ");
		System.out.print(language[0][1][2] + " ");
		System.out.print(language[0][1][3] + " ");
		System.out.println(language[0][1][4]);
		
		System.out.print(language[1][0][0] + " ");
		System.out.print(language[1][0][1] + " ");
		System.out.print(language[1][0][2] + " ");
		System.out.print(language[1][0][3] + " ");
		System.out.println(language[1][0][4]);
		
		System.out.print(language[1][1][0] + " ");
		System.out.print(language[1][1][1] + " ");
		System.out.print(language[1][1][2] + " ");
		System.out.print(language[1][1][3] + " ");
		System.out.println(language[1][1][4]);

	}

}
