package dailyChallenges;

import java.util.Iterator;

public class Challenge03 {

	public static void main(String[] args) {
		
		String name="A man, a plan, a canal: Panama ";
		
		String rev ="";
		
		String str = name.replaceAll("[^A-za-z0-9]", "");//to remove special characters and spaces
		
		System.out.println(str);
		
		String str1 =str.toLowerCase();//to convert into lower case
		
		System.out.println(str1);
		
		char[] charArray = str1.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			
		rev=rev+charArray[i];
		}
		
		boolean isEqual=true;
		if(str1.equals(rev))
		{	
			
			System.out.println(isEqual);
		
		}
		else
			System.out.println("False");
		
			
		
	}			
		
}
