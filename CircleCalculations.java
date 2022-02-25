
import java.util.Scanner;
public class CircleCalculations{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the radius of the circle: ");
	double r = input.nextDouble();

	System.out.printf("The diameter, circumference and area are %f  %f  %f respectively", r+r,2*3.14159*r,3.14159*r*r);
}
}