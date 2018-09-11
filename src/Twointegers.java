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
	public Twointegers arithmetic(Twointegers integer)
	{
		int sum = yin + yang;
		int difference = yin - yang;
		double product = yin * yang;
		double quotient = (double) yin / yang;
		Twointegers result = new Twointegers(yin, yang);
		return result;
	}
}
