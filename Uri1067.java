import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int testnum = 0;

        X = teclado.nextInt();
        for (int cont=0; cont<X; cont++) {
            testnum += 1 ;

            if ( testnum % 2 != 0){
                System.out.println(testnum);
            }
        }
    }
}