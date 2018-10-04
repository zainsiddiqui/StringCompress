
public class Compress {

	public static void main(String[] args) {
		System.out.println("Please Enter String: ");
		String original = IO.readString();

		String ans = compress(original);
		System.out.println(ans);
	}
	
	public static String compress(String original) {
	     int length = original.length();
	     int count;
	       
	     count = 0;
	       String results = "";
 
	       for(int i=0;i<original.length();){
	           char begin = original.charAt(i);

	           for(int j=i+1; j<original.length();j++){
	              
	        	   char next = original.charAt(j);
	               
	               if(begin == next){
	                   count++;
	               }
	               else {
	                   break;
	               }
	           }
	           i+= count+1;
	          
	           if(count>0){
	             
	        	   String add = begin + "";
	              
	        	   int tempcount = count +1;
	              
	        	   results+= tempcount + add;
	           }
	           else{
	               results+= begin;
	           }
	           count=0;
	       }
	   return results;
	}
}


