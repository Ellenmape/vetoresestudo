package vetores;

public class matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado = 0;
		int numeros[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("O número da linha 3, coluna 2 é: " + numeros[2][1]);

		for (int indiceLinha = 0; indiceLinha < numeros.length; indiceLinha++) {
			for (int indiceColuna = 0; indiceColuna < numeros.length; indiceColuna++) {
				System.out.println(numeros[indiceLinha][indiceColuna]);
			}
		}

		for (int contador = 0; contador < numeros.length; contador++) {
			resultado += numeros[contador][contador];
			System.out.println(resultado);

		}
	}
}