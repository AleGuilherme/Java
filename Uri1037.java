import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valueq ;
        String intervalo = "intervalo";

        // entrada
        valueq = teclado.nextDouble();

        // processamento
        if (valueq >= 0 && valueq <= 25) { intervalo = "Intervalo [0,25]";}
        else if (valueq > 25 && valueq <= 50) { intervalo = "Intervalo (25,50]";}
        else if (valueq > 50 && valueq <= 75) { intervalo = "Intervalo (50,75]";}
        else if (valueq > 75 && valueq <= 100) { intervalo = "Intervalo (75,100]";}
        else {intervalo = "Fora de intervalo";}

        System.out.println(intervalo);

    }
}
