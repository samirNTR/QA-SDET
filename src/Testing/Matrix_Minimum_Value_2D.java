package Testing;

public class Matrix_Minimum_Value_2D {

	public static void main(String[] args) {
		// Define a 3x3 matrix
		int[][] matrix = { 
				{ 3, 8, 9 }, // row 0
				{ 5, 1, 90}, // row 1
				{ 9, 2,99 } // row 2
		};

		// Initialize the minimum value with the first element of the matrix
		int min = matrix[0][0];

		// Iterate through the matrix to find the minimum value
		for (int i = 0; i < matrix.length; i++) { // Loop over each row
			for (int j = 0; j < matrix[i].length; j++) { // Loop over each column in the current row
				if (matrix[i][j] < min) { // Compare current element with min
					min = matrix[i][j]; // Update min if current element is smaller
				}
			}
		}

		// Print the minimum value
		System.out.println("The minimum value in the matrix is: " + min);
	}
}
