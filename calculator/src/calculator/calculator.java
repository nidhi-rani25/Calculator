package calculator;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1=sc.nextDouble();
		System.out.println("enter the operator");
		char operator=sc.next().charAt(0);
		System.out.println("Enter the second number");
		double num2=sc.nextDouble();
		double result=0.0;
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
		case '-' :
			result=num1-num2;
			System.out.println(result);
			break;
		case '*' :
			result=num1*num2;
			System.out.println(result);
			break;
		case '/' :
		    result=num1/num2;
		    System.out.println(result);
		    break;
		case '%' :
			result=num1%num2;
			System.out.println(result);
			break;
			default:
				System.out.println("Invalid operator");
				break;
		
			
		}
		
		// TODO Auto-generated method stub

	}

}
