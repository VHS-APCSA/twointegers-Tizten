public class TwoIntegers
{
	private int yin;
	private int yang;
	
	public TwoIntegers(int yin, int yang)
	{
		this.yin = yin;
		this.yang = yang;
	}
	public int getYin()
	{
		return yin;
	}
	public int getYang()
	{
		return yang;
	}
	public void setYin(int yin)
	{
		this.yin = yin;
	}
	public void setYang(int yang)
	{
		this.yang = yang;
	}
	public String arithmetic()
	{
		int sum = yin + yang;
		int difference = yin - yang;
		double product = yin * yang;
		double quotient = (double) yin / yang;
		return yin + " + " + yang + " = " + sum + ", " + 
				yin + " - " + yang + " = " + difference + ", " +
				yin + " * " + yang + " = " + product + ", " +
				yin + " / " + yang + " = " + quotient;
	}
	public String larger()
	{
		if(yin > yang)
			return (yin + " is larger than " + yang);
		else 
			return (yang + " is larger than " + yin);
	}
	public boolean isEven()
	{
		int sum = yin + yang;
		if(sum % 2 == 0)
			return true;
		else
			return false;
	}
	public boolean isMultiple()
	{
		if(yin % yang == 0)
			return true;
		else
			return false;
	}
}
