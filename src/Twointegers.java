public class Twointegers
{
	private int yin;
	private int yang;
	
	public Twointegers()
	{
		yin = 0;
		yang = 0;
	}
	public Twointegers(int yin, int yang)
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
	public int larger()
	{
		if(yin > yang)
			return yin;
		else 
			return yang;
	}
	public boolean isEven(int sum)
	{
		if(sum % 2 == 0)
			return true;
		else
			return false;
	}
}
