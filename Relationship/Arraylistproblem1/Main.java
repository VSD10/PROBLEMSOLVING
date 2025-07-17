
import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception{
		boolean loop=true;
		Scanner sc=new Scanner(System.in);
		ArrayList<ItemType> item=new ArrayList<>();
		int v=1;
		while(loop)
		{
			System.out.println("Enter the details of the Item Type"+v);
			System.out.println("Name:");
			String name=sc.next();
			System.out.println("Deposit");
			Double deposit=sc.nextDouble();
			System.out.println("Cost per day");
			Double costperday=sc.nextDouble();
			item.add(new ItemType(name,deposit,costperday));
			v++;
			System.out.println("Do you want to continue?(y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='n')
				loop=false;
	
		}
		System.out.printf("%-20s%-20s%-20s","Name","Deposit","CostPerDay");
		for(ItemType i:item){
			System.out.printf(i);
		}
		sc.close();




	}
}
