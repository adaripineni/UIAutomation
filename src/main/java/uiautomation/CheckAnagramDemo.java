package uiautomation;

public class CheckAnagramDemo {
	
	public static boolean anagramCheck(String s1, String s2) {
		//madam,daamm
	//char[] ch = s1.toCharArray();
	for (int i=0; i<=s1.length()-1; i++) {
		//meal, lame
		if(s2.indexOf(String.valueOf(s1.charAt(i)))>=0) {
			s2=s2.replaceFirst(String.valueOf(s1.charAt(i)),"" );
		}
		
		else 
			return false;
		
	}
	
	 
	if(s2=="") {
		return true;
	}
	else
		return false;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(anagramCheck("meal","lame"));
		System.out.println(anagramCheck("meal","lamemea"));
		
		System.out.println(anagramCheck("madam","damam"));
		
	}
	

}
