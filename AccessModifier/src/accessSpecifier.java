
class defAccessSpecifier {
	  void display() 
	     { 
	         System.out.println("You are using defalut access specifier"); 
	     } 
}
public class accessSpecifier {

	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 
	}

}
