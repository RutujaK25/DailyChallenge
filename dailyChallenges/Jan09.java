package dailyChallenges;

public class Jan09 {

	public static void main(String[] args) {
		String str=" fly me  to the moon  ";
		
		System.out.println(lengthOfLastWord(str));
		

	}

	static int lengthOfLastWord(String s)
	{
		String str=s.trim();//to trim the space if there is any after last word
		int count=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')//count when there is no space
			{
				count++;
				
			}
			else
			
				break;//when space is there
			
			
		}
		return count;//count the characters
		
	}
}
