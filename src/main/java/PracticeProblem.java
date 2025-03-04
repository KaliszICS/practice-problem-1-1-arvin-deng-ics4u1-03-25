public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] array) {
		int sum = 0;

		for  (int row = 0; row < array.length; row++){
			for (int col = 0; col < array[row].length; col++) {
				sum += array[row][col];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] array2, int row) {
		int sumrow = 0;

		for (int col = 0; col < array2[row].length; col++) {
			sumrow += array2[row][col];
		}
		return sumrow;
	}

	public static int sumColumn(int[][] array3, int col) {
		int colsum = 0;
		
		for (int row = 0; row < array3.length; row++) {
			colsum += array3[row][col];
		}

		return colsum;
	}

}