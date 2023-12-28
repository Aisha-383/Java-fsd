class priaccessspecifier 
		{ 
		   private void display() 
		    { 
		        System.out.println("You are using private access specifier"); 
		    } 
		} 
public class accessSpecifiers2 {

	public static void main(String[] args) {
	
//				private
				System.out.println("Private Access Specifier");
				priaccessspecifier  obj = new priaccessspecifier(); 
		       
//		        obj.display();
				 //trying to access private method of another class but it will give error

			}
		}
