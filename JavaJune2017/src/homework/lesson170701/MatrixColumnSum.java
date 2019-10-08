package homework.lesson170701;

public class MatrixColumnSum {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4},
				{-1, 5, 6, 7},
				{8, 9, 10, 11},
				{12, -13, 14, 15},
		};
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}
		LABEL:for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] < 0) {
					continue LABEL;
				}
				sum += matrix[j][i];
			}
			System.out.println("col = " + i + "\tsum = " + sum);
		}
	}
}
