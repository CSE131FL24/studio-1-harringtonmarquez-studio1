package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first integer: ");
		double n1 = in.nextDouble();
		System.out.print("Enter your second intger: ");
		double n2 = in.nextDouble();
		double average = (n1 + n2) / 2;
		System.out.print("The average of "+n1+" and "+n2+" is "+average+".");
		

	}

}
