package day6.arry3;

public class 태민님3차원배열 {

	public static void main(String[] args) {
		int [][][][] sudoku = 
			{
				{
					{
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9}
					},
					{
						{4, 5, 6},
						{7, 8, 9},
						{1, 2, 3}
					},
					{
						{7, 8, 9},
						{1, 2, 3},
						{4, 5, 6}
					}
				},
				{
					{
						{2, 3, 4},
						{5, 6, 7},
						{8, 9, 1}
					},
					{
						{5, 6, 7},
						{8, 9, 1},
						{2, 3, 4}
					},
					{
						{8, 9, 1},
						{2, 3, 4},
						{5, 6, 7}
					}
				},
				{
					{
						{3, 4, 5},
						{6, 7, 8},
						{9, 1, 2}
					},
					{
						{6, 7, 8},
						{9, 1, 2},
						{3, 4, 5}
					},
					{
						{9, 1, 2},
						{3, 4, 5},
						{6, 7, 8}
					}
				}
		
		};
		System.out.println();
		for(int i = 0; i < sudoku.length; i++) {						// 면
			for(int j = 0; j < sudoku[i].length; j++) {					// 행
				for(int k = 0; k < sudoku[i][j].length; k++) {			// 열
					for(int l = 0; l < sudoku[i][j][k].length; l++) {	// 점
						System.out.print(sudoku[i][j][k][l] + " ");		// 출력
					}System.out.print("  ");
				}System.out.println();
			}System.out.println();
		}

	}

}
