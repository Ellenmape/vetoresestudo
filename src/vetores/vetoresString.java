package vetores;

import java.util.Scanner;

public class vetoresString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome[] = new String[5];
		Scanner scanner = new Scanner(System.in);

				
		for(int i = 0; i < nome.length; i++){
		System.out.println("Digite um nome: ");
		nome[i] = scanner.nextLine();
		}
		System.out.println("Nomes digitados:");
	    for (int i = 0; i < nome.length; i++) {
	        System.out.println(nome[i]);

	}
	
    }
}
