package ExcecaoLoiane.Finally;
/*As vezes é necessário executar um código mesmo que tenha havido uma Exception. 
 * É para isto que servem os blocos finally
 * 
 * Os comandos dentro de um bloco finally serão executados de qualquer maneira, mesmo que a execução 
 * tenha passado por um bloco catch.
	Ao contrário dos blocos catch você só pode ter um bloco finally por cada bloco try.
 */
public class TestandoFinally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};
		
		for (int i=0; i<numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException e){
				System.out.println("Erro ao dividir por zero");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Posição do array inválida");
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
			}
		}

	}

}