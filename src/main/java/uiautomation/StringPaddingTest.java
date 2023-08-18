package uiautomation;

import java.util.Scanner;

public class StringPaddingTest {
	
	public static String padString(String str){
		if(str.length()<3||str.length()>10) {
			return "invalid length, Please enter string of length between 3 and 10 chars";	
		}
		else 
			for(int i=str.length(); i<10; i++) {
			//str= str+"*";
			str=str+" ";
		}
		
		return str;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a String: ");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
				
		//System.out.print("Please enter a String: ");
		String inp = sc.nextLine();
		System.out.println("PaddedString:"+padString(inp));

	}

}
}
