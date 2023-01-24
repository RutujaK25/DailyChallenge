package dailyChallenges;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class FirstUniqueChar09 {
	
public static void main(String[] args) {
		
		String s = "aabb";
		
		System.out.println(FirstUniqueChar(s));
	}

		public static int FirstUniqueChar(String s)
		
		{
			for (int i = 0; i < s.length(); i++) {
				
				boolean unique=true;
				
				for (int j = 0; j < s.length(); j++) {
					
					if(i!=j && s.charAt(i)==s.charAt(j))
					
					{
						unique=false;
						
						break;
						
					}
				}
				
				if(unique) 
				
				{
				
					return i;
				
				}
		}
			
		return -1;
					
	}
}

					
					
				
				
			
		




