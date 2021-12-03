import java.util.Scanner;

   class demo{
	private String name;
	private double costPerDay;
	private double deposit;
	
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
		return costPerDay;
	}
	
	public void setCostPerDay(double costPerDay)
	{
		this.costPerDay=costPerDay;
	}
	
	public double getDeposit()
	{
		return deposit;
	}
	
	public void setDeposit(double deposit)
	{
		this.deposit=deposit;
	}
	
	
}
public class ItemType {
	
	

	public static void main(String[] args) {
		
		
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Item type name:");
		String name=S.next();
		System.out.println("Enter the Cost Per day:");
		double costPerDay=S.nextDouble();
		System.out.println("Enter the Deposit:");
		double deposit=S.nextDouble();
		
		ItemType D =new ItemType();
	   
		
	
		

	}

}
