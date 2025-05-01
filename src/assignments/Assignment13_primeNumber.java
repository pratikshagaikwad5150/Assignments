package assignments;

public class Assignment13_primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int val =101;
		
		for (int i=2;i<=val/2;i++);
		{
			if (val%2== 0)
			{
				flag=false;
				
			}
			
		}
		if(flag)
		{
			
			System.out.println(val+" is a Prime Number");
		}
		else
		{
			System.out.println(val+" is not a primenumber");
		}
		

	}

}
