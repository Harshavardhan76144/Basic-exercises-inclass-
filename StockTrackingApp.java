package p1;
public class StockTrackingApp {
	public static void main(String[] args) 
	{	
		String name;
		int price;
		
		// display the price .
		Stock a=new Stock("Infosys", 1300);
		Stock b=new Stock("HP", 1400);
		Stock c=new Stock("Apple", 1800);
		
	/*	a.setStockName("Infosys");
		a.setStockPrice(1300);
		*/
		
		name=a.getStockName();
		price=a.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=b.getStockName();
		price=b.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=c.getStockName();
		price=c.getStockPrice();
		System.out.println(name+"\t"+price);
		
		// call price change method 
		//true for increase, false for decrease
		a.changePrice(10, false);
		b.changePrice(12, true);
		c.changePrice(15, true);
		
		// display the stock details again
		name=a.getStockName();
		price=a.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=b.getStockName();
		price=b.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=c.getStockName();
		price=c.getStockPrice();
		System.out.println(name+"\t"+price);
		
	}

}























































 /*Policy
  * public Policy(int policyId, 	String policyName, 	int policyAmount) 
	{
		super();
		
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyAmount = policyAmount;
		
	}*/





/*Account
 * public Account(int accountNumber, String accountHolderName, int balance, Policy[] policies) 
 * {
	super();
	
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	
	this.balance = balance;
	this.policies = policies;
}
*/

/*//Create accounts Mybankapp
		System.out.println("Enter no. of policies you want to create:");
		int n = sc.nextInt();
		Policy[] policies = new Policy[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Policy Id");
			int policyId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Policy Name");
			String policyName = sc.nextLine();
			System.out.println("Enter Policy Amount");
			int policyAmount = sc.nextInt();
			policies[i] = new Policy(policyId, policyName, policyAmount);
		}
		*/