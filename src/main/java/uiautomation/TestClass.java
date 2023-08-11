package uiautomation;

public class TestClass {

	public static void main(String[] args) {
		
//		String s="My name is Amulya";
//		//Amulya is name My
//		// TODO Auto-generated method stub
//		
//		String[] sR=s.split(" ");
//		String sRev="";
//		
//		for(int i=sR.length-1; i>=0; i--) {
//			sRev=sRev+sR[i]+" ";
//			
//		}
//		
//			System.out.println(sRev);
		
		for (int i=1; i<=100; i++) {
			
			if(checkIsPrime(i)==true) {
				System.out.printf("%d ",i);
			}
		}
			
		}
		
		public static boolean checkIsPrime(int num) {
			if(num==1||num==2){
				return true;
			}
//			if(num%2==0) {
//				return false;
//			}
			
			for(int i=3; i<num/2; i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
			
			
		}
		
		
		

}
