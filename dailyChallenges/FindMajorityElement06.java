package dailyChallenges;

public class FindMajorityElement06 {
	
	public static void main(String[] args) {
		
		int[] nums= {2,2,1,1,1,2,2};
		
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		
		int majorityElement=nums[0];
		
		int count=1;
		
		for (int i = 1; i < nums.length; i++) {
			
			if(nums[i]==majorityElement)
				
				count++;
		
		else
		{
			count--;
			
			if(count==0)
				
			{
				majorityElement=nums[i];
				
				count=1;
				
			}
		
		}
		
	}
	
	return majorityElement;
		
	}

}
