package Projeto51;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class tresInteiros {
	public static void main(String[] args)
		
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("\nEntre com o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.println("\nEntre com o segundo valor: ");
		b = ler.nextInt();
		
		System.out.println("\nEntre com o terceiro valor: ");
		c = ler.nextInt();
		
		if(a > b && a > c)
		{
			System.out.println("\nMaior n�mero: "+a);
			
			
		}
		else if(b > a && b > c)
		{
			System.out.println("\nMaior n�mero: "+b);
			
		}
		else if(c > a && c > b)
		{
			System.out.println("\nMaior n�mero: "+c);
			
			ler.close();
		}
		
	
		
		
		
		
	}
}
