import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num, totnum = 0;
        int qtde = 0;


        for (int cont=1; cont <= 6; cont++){
            num = teclado.nextFloat();
            if (num > 0){
                qtde += 1;
                totnum = totnum + num;
            }
        }
        System.out.println(qtde+" valores positivos");
        System.out.printf("%.1f%n",totnum / qtde);
    }
}