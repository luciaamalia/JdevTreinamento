import java.util.Iterator;
import javax.swing.JOptionPane;

public class ArrayVet {
	
	public static void main(String[] args) {
	/*
	 * Arrays podem utilizar todo tipo de dados e objetos
	 * Sempre deve ter a quantidade de posições definidas
	 * Sempre inicia na posição 0
	 * Podem ser separados por , 
	*/
		double notas[] = new double[4];
		notas [0] = 3.98;
		notas [1] = 4.38;
		notas [2] = 5.28;
		notas [3] = 6.66;
		
		//acessar os dados do array
		
		//acessar apenas um valor 		
		System.out.println(notas[3]);
		System.out.println("\n");
		
		// acessar todos concatenados
		System.out.println("Nota 1 = "+ notas[0]);
		System.out.println("Nota 2 = "+ notas[1]);
		System.out.println("Nota 3 = "+ notas[2]);
		System.out.println("Nota 4 = "+ notas[3]);
		System.out.println("\n");
		
		//acessar com um for laço
		String[] valores= {"alex","98.5","Curso de Java","contato@jdev","80"};
		
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println("Valores na posição " + pos + " é igual "+ valores[pos]);
		}
		System.out.println("\n");
		
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " é "+ notas[pos]);
		}
		
		// posso declarar com outros tipos
		int[] inteiros = new int[10];
		float[] floats = new float[10];
		
		
	
	}

}
