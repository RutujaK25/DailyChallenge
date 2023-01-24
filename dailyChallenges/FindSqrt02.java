package dailyChallenges;

public class FindSqrt02 {
	
	public static void main(String[] args)
	
	{
		System.out.println(Sqrt(25));
	}
	
	public static int Sqrt(int no) {
		
		if(no<2)
		{
			return no;
		}
		int start=1;
		
		int end=no;
		
		while(start<=end)
			
		{
			int mid;
			
			mid=(start+end)/2;
			
			if(mid*mid==no)
			{
				return mid;
				
			}
			else if(mid*mid>no)
			{
				end=mid - 1;
				
			}
			else
			{
				start=mid + 1;
			}
			
		}
		return end;
	}
	
	
}	
	

	


