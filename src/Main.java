/*
 *This is the main class which test the method 
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		//this is the array that holds the number for row and column
		int[] rowColumnNumber = new int[2];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array,with no comma:");
		for (int i = 0 ; i < rowColumnNumber.length; i++ ) 
		{
			rowColumnNumber[i] = input.nextInt();
		}

		//this the row and column that will be used later for easy reference
		int userDefinedRow = rowColumnNumber[0];
		int userDefinedColumn = rowColumnNumber[1];
		double [][] userMatrix = new double [userDefinedRow][userDefinedColumn];

		//this is autopopulate the matrix so user does not have to type the matrix
		userMatrix = autopopulate(userDefinedRow,userDefinedColumn);
		System.out.println("This is the autopopulated matrix:");
		printMatrix(userMatrix);

		//this let user to enter the matrix
//		System.out.println("Enter the array:");
//		for(int row = 0;row < userDefinedRow;row ++)
//		{
//			for(int column = 0;column < userDefinedColumn;column++)
//			{
//				userMatrix[row][column] = input.nextDouble();
//
//			}
//		}
		
		//this uses the function locateLargest to find the largest value of matrix
		Location maxValue = Location.locateLargest(userMatrix);
		System.out.println("The location of the largest element is " + maxValue.maxValue +
				" at (" + maxValue.row + ", " + maxValue.column + ")");

	}
	
	//this help to populate the matrix with random number 0 to 100
	private static double[][] autopopulate(int x,int y)
	{
		double[][] matrix = new double [x][y];
		for (int row = 0;row < x;row++) 
		{
			for(int column = 0;column < y;column++)
			{
				matrix[row][column] = round((double)(Math.random()*100),2);

			}
		}
		return matrix;
	}
	
	//this helps to print out the matrix 
	private static void printMatrix(double[][] m)
	{
		for(int row = 0;row < m.length;row++)
		{
			for(int column = 0;column < m[row].length;column++)
			{
				System.out.print(m[row][column] + " ");
			}

			System.out.println();
		}
	}
	
	//this round the numbers in the matrix to whatever decimal place stated
	private static double round(double value, int places)
	{
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
