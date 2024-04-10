package application;

import java.util.Locale;
import java.util.Scanner;

import util.converter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preco do dolar ?");
		double dollarPrice = sc.nextDouble();
		System.out.println("Quantos Dólares :");
		double amount = sc.nextDouble();
		double result = converter.dollartoReal(amount, dollarPrice);
		System.out.printf("Dolar para Reais = R$  %.2f%n",result);
		
		
		sc.close();
	}

}
