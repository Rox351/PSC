package aula15;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Set set1 = new Set();
		
		byte escolha;
		
		/*Definição dos Times*/
		Time t1 = new Time();
		System.out.println("****Time 1****");
		t1.setNome(input.next());
		System.out.println("Técnico do time 1: ");
		t1.setTecnico(input.next());
		
		Time t2 = new Time();
		System.out.println("****Time 2****");
		t2.setNome(input.next());
		System.out.println("Técnico do time 2: ");
		t2.setTecnico(input.next());
		
		set1.setTime1(t1);
		set1.setTime2(t2);
		
		do {
			System.out.println(set1 +"\n");
			System.out.println("1 - Marcar ponto para: " + t1.getNome());
			System.out.println("2 - Marcar ponto para: " + t2.getNome());
			escolha = input.nextByte();
			switch(escolha) {
			case 1: 
				t1.pontuar();
				System.out.println("Ponto para" + t1.getNome());
			break;
			case 2:
				t2.pontuar();
				System.out.println("Ponto para" + t2.getNome());
				break;
			}
			
		}while(set1.continuarSet());
		System.out.println("\nPARTIDA ENCERRADA");
		System.out.println(set1);
		System.out.println("VENCEDOR: " + set1.obterVencedor());
	}
	
}
