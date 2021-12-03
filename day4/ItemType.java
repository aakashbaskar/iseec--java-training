import java.util.Scanner;


public class ItemType {
	
	private  static String name;
	private static double CostPerDay;
	private static double Deposit;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getCostPerday()
	{
		return CostPerDay;
	}
	
	public void setCostPerDay(double costPerDay)
	{
		CostPerDay=costPerDay;
	}
	
	public double getDeposit()
	{
		return Deposit;
	}
	
	public void setDeposit(double deposit)
	{
		Deposit=deposit;
	}
	public void display()
	{
		System.out.println("Name:" +name);
		System.out.println("Cost Per day:" +CostPerDay);
		System.out.println("Deposit:" +Deposit);
	}
	
	  public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Item type name:");
		String name=S.next();
		System.out.println("Enter the Cost Per day:");
		double CostPerDay=S.nextDouble();
		System.out.println("Enter the Deposit:");
		double Deposit=S.nextDouble();
		
		ItemType D =new ItemType();
	    D.display();
		
	
		

	}

}
