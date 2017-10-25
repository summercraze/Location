import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		int[] rowColumnNumber = new int[2];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array,with no comma:");
		for (int i = 0 ; i < rowColumnNumber.length; i++ ) {
			rowColumnNumber[i] = input.nextInt();
		}
		System.out.println("ERROR CHECKING:" + "There are " + rowColumnNumber[0] 
				+ " rows and " + rowColumnNumber[1] + " columns.");
		int userDefinedRow = rowColumnNumber[0];
		int userDefinedColumn = rowColumnNumber[1];
		double [][] userMatrix = new double [userDefinedRow][userDefinedColumn];

		userMatrix = autopopulate(userDefinedRow,userDefinedColumn);
		System.out.println("This is the autopopulated matrix:");
		printMatrix(userMatrix);
		
//		System.out.println("Enter the array:");
//		for(int row = 0;row < userDefinedRow;row ++)
//		{
//			for(int column = 0;column < userDefinedColumn;column++)
//			{
//				 userMatrix[row][column] = input.nextDouble();
//				
//			}
//		}
	    Location maxValue = locateLargest(userMatrix);
	    System.out.println("The location of the largest element is " + maxValue.getMaxValue() +
	    		" at (" + maxValue.getRow() + ", " + maxValue.getColumn() + ")");
	
	}
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
	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	public static Location locateLargest(double [][] a)
	{
		Location largestLocation = new Location();
		double maxValue = a[0][0];
		if(a.length < a[0].length)
		{
			for(int row = 0;row < a.length;row++)
			{ 
				System.out.println("ERROR CHECKING:Entering a new row!"
						+ "We are in row " + row + ".The max value is " + maxValue);
				System.out.println("ERROR CHECKING:Entering a new row!"
						+ "We are in row " + largestLocation.getRow() + " according to location .The max value is " + largestLocation.getMaxValue());
				for(int column = 0;column < a[row].length;column++)
				{
				   if(a[row][column] > maxValue)
				   {
					   maxValue = a[row][column];
					   largestLocation.setColumn(column);
					   largestLocation.setRow(row);
					   largestLocation.setMaxValue(a[row][column]);

				   }
				}
				
			}
		}
		else
		{
			for(int column = 0;column < a[0].length;column++)
			{
				for(int row = 0;row < a.length;row++)
				{
					if(a[row][column] > maxValue)
					   {
						   maxValue = a[row][column];
						   largestLocation.setColumn(column);
						   largestLocation.setRow(row);
						   largestLocation.setMaxValue(a[row][column]);

					   }
				}
			}
		}
		return largestLocation;
	}
}
