package br.com.generation.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    Random gerador = new Random(System.nanoTime());
		    int numero = 0;
		    int somaMult3 = 0;
		    int qtdMult3 = 0;
		    int qtdNums = 0;

		    do {

		      if(numero % 3 == 0){
		        somaMult3 += numero;
		        qtdMult3++;
		        qtdNums++;
		      }else{
		        qtdNums++;
		      }

		      numero = gerador.nextInt(0, 100);
		      //numero = scanner.nextInt();
		    }while (numero != 0);

		    System.out.println("Soma mult 3: " + somaMult3);
		    System.out.println("Qtd mult 3: " + somaMult3);
		    System.out.println("Media mult 3: " + (somaMult3 / qtdMult3));
		    System.out.println("Media geral com mult 3: " + (somaMult3 / qtdNums));

		  }
		}