import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int value, resto, notas100, notas50, notas20, notas10, notas5, notas2, notas1;

        // entrada
        value = teclado.nextInt();

        // processamento
        notas100 = value / 100 ;
        notas50  = (value % 100) / 50;
        notas20  = ((value % 100) % 50) / 20 ;
        notas10  = (((value % 100) % 50) % 20) / 10 ;
        notas5   = ((((value % 100) % 50) % 20) % 10) / 5;
        notas2   = (((((value % 100) % 50) % 20) % 10) % 5) / 2;
        notas1   = (((((value % 100) % 50) % 20) % 10) % 5) % 2;

        //saida
        System.out.println(value);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50  + " nota(s) de R$ 50,00");
        System.out.println(notas20  + " nota(s) de R$ 20,00");
        System.out.println(notas10  + " nota(s) de R$ 10,00");
        System.out.println(notas5   + " nota(s) de R$ 5,00");
        System.out.println(notas2   + " nota(s) de R$ 2,00");
        System.out.println(notas1   + " nota(s) de R$ 1,00");
    }
}