package controller;

public class ControllerOperations {
	public ControllerOperations() {
		super();
	}
	
	double tempoInicial;
	double tempoFinal;
	double tempoSegundos;
	
	public void formilPosicoes(int[] arrayMilPosicoes) {
		tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			arrayMilPosicoes[i] = 0;
		}
		tempoFinal = System.nanoTime();
		
		tempoSegundos = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo gasto, array de mil posicoes: " + tempoSegundos);
	}
	
	public void fordMilPosicoes(int[] arraydMilPosicoes) {
		tempoInicial = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arraydMilPosicoes[i] = 0;
		}
		tempoFinal = System.nanoTime();
		
		tempoSegundos = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo gasto, array de dez mil posicoes: " + tempoSegundos);
	}
	
	public void forcMilPosicoes(int[] arraycMilPosicoes) {
		tempoInicial = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arraycMilPosicoes[i] = 0;
		}
		tempoFinal = System.nanoTime();
		
		tempoSegundos = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.println("Tempo gasto, array de cem mil posicoes: " + tempoSegundos);

	}
	public void forTamanhoVariado(int[] arrayVariado, int tamanho) {
		tempoInicial = System.nanoTime();
		for (int i = 0; i < tamanho; i++) {
			arrayVariado[i] = 0;
		}
		tempoFinal = System.nanoTime();
		
		tempoSegundos = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		System.out.printf("Tempo gasto, array de %d posicoes: %f %n", tamanho, tempoSegundos);
	
	}

}
