package br.com.generation.exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	    int idade = 0;
	    int idadeMaior50 = 0;
	    int idadeMenor21 = 0;

	    while(idade != -99){
	      System.out.print("Insira uma idade: ");
	      idade = scanner.nextInt();

	      if (idade == -99){
	        break;
	      }
	      if (idade < 21){
	        idadeMenor21++;
	      }else if(idade > 50){
	        idadeMaior50++;
	      }

	      System.out.println("Pessoas menor de 21: " + idadeMenor21);
	      System.out.println("Pessoas maior de 50: " + idadeMaior50);
	    }

	  }
	}
		
	


