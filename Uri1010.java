import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigoPeca1, qtdePeca1, codigoPeca2, qtdePeca2;
        double valorPeca1, valorPeca2, valorPagar;

        // entrada
        codigoPeca1 = teclado.nextInt();
        qtdePeca1   = teclado.nextInt();
        valorPeca1  = teclado.nextDouble();
        codigoPeca2 = teclado.nextInt();
        qtdePeca2   = teclado.nextInt();
        valorPeca2  = teclado.nextDouble();
        
        // processamento
        valorPagar = (qtdePeca1 * valorPeca1) + (qtdePeca2 * valorPeca2);

        //saida
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
    }
}