package Projeto51;

import java.util.Scanner;
//Th�o Nogueira
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

public class OrdemCrescente {
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int n1, n2, n3;
		
		int media = 0;
		
		System.out.println("Digite tr�s n�meros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente: \n" + n1 + n2 + n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente: \n" + n1 + n3 + n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente: \n" + n2 + n1 + n3);
		}
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente: \n" + n2 + n3 + n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente: \n" + n3 + n1 + n2);
		}
		else {
			System.out.println("A ordem crescente: \n" + n3+ "\n"+"\n"+ n2 +"\n"+ n1);
		}
		
		ler.close();
}
}
