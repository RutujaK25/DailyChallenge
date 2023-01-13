package dailyChallenges;

import java.util.Arrays;

public class Challenge04 {

	public static void main(String[] args) {
		
		int[] nums= {4,1,2,1,2};
		
		int result=0;
		
		for (int i = 0; i < nums.length; i++) {
			
			result=result^nums[i];// XOR-->4^1^2^1^2-->4^(1^1)^(2^2)-->4^0^0-->4^0-->4
		}
		
		System.out.println(result);
			
		}
		
}	
			
			
		
	


