package interivew;

public class StringOps {

	
	public static void main(String[] args) {
		
//		Input  -  omkardeshmukh123@bajaj.in
//		Output - omkardesXXXXXXXX@bajaXXXX
		
		String input="omkardeshmukh123@bajaj.in";
		
		String  arr[]=input.split("@");
		
		String output="";
		for(int i=0;i<arr.length;i++) {
			
			String temp=arr[i];
			String rep="";
			
			for (int j = 0; j < temp.length(); j++) {
				
				int x=temp.length()/2;
				if(x>j) {
					rep=rep+temp.charAt(j);
				}
				else
					rep=rep+"X";
				
			}
			output=output+rep;
			
			if(i!=arr.length-1) {
				output=output+"@";
			}
		}
		
		System.out.println(output);
	}
}
