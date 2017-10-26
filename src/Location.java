/*
 * This is the class location that saves the maximum value in a 2-D array
 * It saves the row and column of the max value
 */
public class Location 
{
	//variables in the location
	public static int row, column;
	public static double maxValue;

	public Location(int r,int c,double m)
	{
		row = r;
		column = c;
		maxValue = m;
	}
	//this is the function that locate the largest
	public static Location locateLargest(double [][] a)
	{

		//set up the key for max value
		double maxValue = a[0][0];
		row = 0;
		column = 0;

		/*
		 *so this is the idea of this main code:
		 *it checks which is smaller number:column or row
		 *if row is smaller,we will break the matrix to rows so we have do less loops
		 *and column is the same
		 *in each comparison,we will compare the number with the key,if the key is smaller,the new number
		 *will be the new key
		 */
		if(a.length <= a[0].length)
		{
			for(int i = 0;i < a.length;i++)
			{ 
				for(int j = 0;j < a[i].length;j++)
				{ 
					if(a[i][j] > maxValue)
					{
						maxValue = a[i][j];
						row = i;
						column = j;
					}
				}

			}
		}
		else
		{
			for(int j = 0;j < a[0].length;j++)
			{
				for(int i = 0;i < a.length;i++)
				{
					if(a[i][j] > maxValue)
					{
						maxValue = a[i][j];
						row = i;
						column = j;
					}
				}
			}
		}
		return new Location(row,column,maxValue);
	}
}
