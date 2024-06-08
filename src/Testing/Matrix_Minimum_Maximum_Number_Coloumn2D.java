package Testing;

public class Matrix_Minimum_Maximum_Number_Coloumn2D 
{    //Same column of Minimum number find Max number
	public static void main(String[] args) {

		// Define a 3x3 matrix
		int[][] matrix = { { 3, 8, 7 }, { 5, 1, 9 }, { 9, 2, 6 } };

		// Initialize variables to find the minimum number
		int min = matrix[0][0];
		int minRow = 0;
		int minCol = 0;

		// Find the minimum number and its position
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
					minRow = i;
					minCol = j;
				}
			}
		}

		// Initialize the maximum number in the same column as the minimum number
		int maxInMinCol = matrix[0][minCol];

		// Find the maximum number in the same column as the minimum number
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][minCol] > maxInMinCol) {
				maxInMinCol = matrix[i][minCol];
			}
		}

		// Print the results
		System.out.println("The minimum value in the matrix is: " + min);
		System.out.println("The maximum value in the same column as the minimum value is: " + maxInMinCol);
	}
}
