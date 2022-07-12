package br.com.generation.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    Random gerador = new Random(System.nanoTime());
	    int idade, sexo, nivelCalmo;
	    int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
	        outrosCalmos = 0, pessoasNervMais40 = 0, pessoasCalMenos18 = 0;
	    int i = 0;

	    while (i < 150){
	      System.out.print("Insira idade: ");
	      idade = scanner.nextInt();
	      System.out.print("Insira sexo: (1 - Masc / 2 - Fem / 3 - outros) ");
	      sexo = scanner.nextInt();
	      System.out.print("Insira opção: (1 - calma / 2 - nervosa / 3 - agressiva) ");
	      nivelCalmo = scanner.nextInt();
	      idade = gerador.nextInt(1, 120);
	      sexo = gerador.nextInt(1, 4);
	      nivelCalmo = gerador.nextInt(1, 4);

	      if (nivelCalmo == 1){
	        pessoasCalmas++;
	      }
	      if (sexo == 2 && nivelCalmo == 2){
	        mulheresNervosas++;
	      }
	      if (sexo == 1 && nivelCalmo == 3){
	        homensAgressivos++;
	      }
	      if (sexo == 3 && nivelCalmo == 1){
	        outrosCalmos++;
	      }
	      if (idade > 40 && nivelCalmo == 2){
	        pessoasNervMais40++;
	      }
	      if (idade < 18 && nivelCalmo == 1){
	        pessoasCalMenos18++;
	      }
	      i++;
	    }

	    System.out.println("Pessoas Calmas: " + pessoasCalmas);
	    System.out.println("Mulheres Nervosas: " + mulheresNervosas);
	    System.out.println("Homens Agressivos: " + homensAgressivos);
	    System.out.println("Outros Calmos: " + outrosCalmos);
	    System.out.println("Pessoas Calmas Menor 18: " + pessoasCalMenos18);
	    System.out.println("Pessoas Nervosas Maior 40: " + pessoasNervMais40);

	  }
	}