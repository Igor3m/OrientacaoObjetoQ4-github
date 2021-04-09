package aplication;

import java.util.Scanner;

import entidade.Dolar;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dolar valor = new Dolar();
		
		valor.cotacao = sc.nextDouble();
		valor.quantidade = sc.nextDouble();
		
		valor.valorEmReal();
		
		sc.close();
	}

}
