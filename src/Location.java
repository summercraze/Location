
public class Location 
{
	private int row,column;
	private double maxValue;
	
	Location(int x, int y,double z)
	{
		this.row = x;
		this.column = y;
		this.maxValue = z;
	}
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
