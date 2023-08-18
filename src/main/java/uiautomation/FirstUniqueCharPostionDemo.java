package uiautomation;

import java.util.HashMap;

public class FirstUniqueCharPostionDemo {
	
	//helloworld - h index =0
	
	//helowrld
	//hheeloww = index = 4
	//helow
	//h=2,e=2,l=1,o=1,w=2
	
	public static int getFirstUniqueCharPos(String s) {
		char[] ch = s.toCharArray();
		int position = 0;
		HashMap<Character, Integer> hm = new HashMap();
		for(char c: ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
			
		
		//helolwrld
		//hhell
		for(int i=0; i<=ch.length-1; i++) {
			if(hm.get(ch[i])==1) {
				position= i;
			
				break;
			}
		}

		return position;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFirstUniqueCharPos("hthelelwrs"));
		
		
		
		
	}

}
