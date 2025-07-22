package ExcecaoLoiane.Finally;

public class FinallyPegadinha {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for (int i=0; i<numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e){
				System.out.println("Erro ao dividir por zero");
				System.exit(0); //nao execuca o finally quando tiver isso, finalizando a execucao
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posição do array inválida");
				System.exit(0);  //nao execuca o finally quando tiver isso, finalizando a execucao
			}
			finally {
				System.out.println("Essa linha e impressa sempre apos o try ou catch");
				System.out.println();
			}
		}

	}
}