package asgnmnt;

import java.util.*;

public class Trigonometric {
	
	public void trg( ){
		
		 
		  
		 Scanner scanner = new Scanner(System.in);
		 
		  System.out.println("Enter value of angle in degrees ");
		 
		  
		  double degrees = scanner.nextDouble();
		 
		  System.out.println(" calculate the sine, cosine and tan of angle ...");
		  
		 
		  double sineOfAngle = Math.sin(degrees); 
		  double cosOfAngle = Math.cos(degrees); 
		  double tanOfAngle = Math.tan(degrees);
		 
		  System.out.println();
		  System.out.println("The Sine of " + degrees + " degrees is : "
		    + sineOfAngle);
		  System.out.println("The Cosine of " + degrees + " degrees is : "
		    + cosOfAngle);
		  System.out.println("The Tangent of " + degrees + " degrees is : "
		    + tanOfAngle);
		 
		  System.out.println();
		  System.out.println(" calculate the sec, cosec and cot of angle ...");
		  
		 
		  double secOfAngle = 1 / Math.sin(degrees); 
		  double cosecOfAngle = 1 / Math.cos(degrees); 
		  double cotOfAngle = 1 / Math.tan(degrees);
		 
		  System.out.println("\nThe Sec of " + degrees + " degrees is : "
		    + secOfAngle);
		  System.out.println("The Cosec of " + degrees + " degrees is : "
		    + cosecOfAngle);
		  System.out.println("The Cotangent of " + degrees + " degrees is : "
		    + cotOfAngle);
		 
		 
		 }

}
