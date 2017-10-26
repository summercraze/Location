/*
 * This is the class location that saves the maximum value in a 2-D array
 * It saves the row and column of the max value
 */
public class Location 
{
	//variables in the location
	private int row,column;
	private double maxValue;
	
	//constructor
	Location(int x, int y,double z)
	{
		this.row = x;
		this.column = y;
		this.maxValue = z;
	}
	//default constructor
	Location()
	{
		this(0,0,0);
	}
	
	public void setRow(int x)
	{
		this.row = x;
	}
	public void setColumn(int y)
	{
		this.column = y;
	}
	public void setMaxValue(double value)
	{
		this.maxValue = value;
	}
	
	public int getRow()
	{
		return row;
	}
	public int getColumn()
	{
		return column;
	}
	public double getMaxValue()
	{
		return maxValue;
	}
}
