package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius :");
		double radius = sc.nextDouble();

		double v = Calculator.volume(radius);
		double c = Calculator.circunference(radius);

		System.out.printf("Circunferencia : %.2f%n", c);
		System.out.printf("Volume : %.2f%n", v);
		System.out.printf("PI value : %.2f%n", Calculator.PI);

		sc.close();
	}
	
}
