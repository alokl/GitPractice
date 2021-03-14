
public class GetDigit {
	
// GIT 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1alok7lohani is 8good";
		String result ="";
		         
		   for (int i=0; i<str.length(); i++){
		             
		   Character chars = str.charAt(i);
		    if(Character.isDigit(chars))
		     {
		          result += chars;
		       }
		 }
		System.out.println(result);

	}

}
