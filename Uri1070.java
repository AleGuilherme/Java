import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int testenum = 0;

        testenum = teclado.nextInt();

        if (testenum % 2 == 0){ testenum++ ;
        }

        for (int cont=1; cont<12; cont++) {
                if (testenum % 2 != 0){
                    System.out.println(testenum);
                }
                testenum++;
        }
    }
}