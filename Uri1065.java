import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, qtde = 0;

        for (int cont=1; cont < 6; cont++){
            num = teclado.nextInt();
            if (num % 2 == 0){
                qtde += 1 ;
            }
        }
        System.out.println(qtde+" valores pares");
    }
}