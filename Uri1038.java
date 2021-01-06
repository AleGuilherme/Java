import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codItem, qtdeItem;
        double total;
        total = 0.00;

        //entrada
        codItem  = teclado.nextInt();
        qtdeItem = teclado.nextInt();

        //processamento
        if (codItem == 1) {
            total = qtdeItem * 4.00;
        }

        if (codItem == 2) {
            total = qtdeItem * 4.50;
        }

        if (codItem == 3) {
            total = qtdeItem * 5.00;
        }

        if (codItem == 4) {
            total = qtdeItem * 2.00;
        }

        if (codItem == 5) {
            total = qtdeItem * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total) ;

    }
}