/*
(1) Se B for maior do que C                             e
(2) Se D for maior do que A,                            e
(3) a soma de C com D for maior do que a soma de A e B  e
(4) Se C e D, ambos, forem positivos                    e
(5) se a variável A for par
*/
import java.util.Scanner;

public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,C,D;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if ( B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0) {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }

    }
}