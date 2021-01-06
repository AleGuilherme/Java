/* leitura do teclado, precisamos do componente Scanner
   disponivel no pacote UTIL da linguagem Java
*/
import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){

        // passo 1 - declarar um componente (uma variavel) do tipo Scanner.
        Scanner teclado;
        // pass 2 - indicar que o scanner vai ler do teclado
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.println("Digite um valor inteiro: ");
        a = teclado.nextInt();
        System.out.println("Digite um valor real: ");
        b = teclado.nextDouble();

        System.out.println("Voce digitou os valores " + a + " e " + b);

    }
}