package asgnmnt;

import java.util.*;

public class CalculatorReal {
	
public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("choose an operation : \n\t1 for addition\n\t2 for subtraction\n\t3 for multiplication\n\t4 for division\n\t5 for modulus ");
		int option = scr.nextInt();
		System.out.println("Enter two operands : ");
		int a = scr.nextInt();
		int b = scr.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("addition : " + calculator.add(a, b));
			break;
		case 2:
			System.out.println("subtraction : "+calculator.sub(a, b));
			break;
		case 3:
			System.out.println("multiplication : "+calculator.mul(a, b));
			break;
		case 4:
			System.out.println("division : "+calculator.div(a, b));
			break;
		case 5:
			System.out.println("modulus : "+calculator.modulus(a, b));
			break;
		default:
			System.out.println("not a valid option chosen....");		
		}
	}


}
