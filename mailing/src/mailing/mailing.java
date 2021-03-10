import java.util.Scanner; 
public class mailing { 
 public static void main(String[] args) 
 { 
 Scanner sc = new Scanner(System.in); 
 System.out.println("Enter your Email id :"); 
 String id = sc.next(); 
 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"; 
 boolean ans = id.matches(regex); 
 if(ans) { 
 System.out.println("Given email-id is valid"); 
 } else { 
 System.out.println("Given email-id is not valid");
 }
 }
}