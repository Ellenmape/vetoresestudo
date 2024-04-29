package vetores;

import java.util.Scanner;

public class vetoresEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[] = {2,5,1,3,4,49,7,8,10,6};
		int numeroEscolhido;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numeroEscolhido = scanner.nextInt();
	
		
		for(int i = 0; i < numero.length; i++) {
			if(numeroEscolhido == numero[i]) {
				System.out.println("O número " + numeroEscolhido + " está localizado na posição: " + i);
				break;
		
			}if(i + 1 == numero.length) {
				System.out.println("O número " + numeroEscolhido + " não foi encontrado!");
			}
		}

}
}