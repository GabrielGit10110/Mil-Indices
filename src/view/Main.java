package view;

import java.util.Scanner;

import controller.ControllerOperations;

@SuppressWarnings(value = { "unused" })
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o tamanho do array: ");
		int input = in.nextInt();
		in.close();

		ControllerOperations co = new ControllerOperations();
		int[] array1000= new int[1000];
		int[] array10000 = new int[10000];
		int[] array100000 = new int[100000];
		int[] arrayVariado = new int[input];
		
		co.formilPosicoes(array1000); // Operacao com array de 1000 indices
		co.fordMilPosicoes(array10000); // Operacao com array de 10000 indices
		co.forcMilPosicoes(array100000); // Operacao com array de 10000 indices
		co.forTamanhoVariado(arrayVariado, input); // Operacao com array de tamanho variado


		
	}

}
