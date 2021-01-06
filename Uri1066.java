import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int num, qtdePar=0;
    int qtdeImpar=0;
    int qtdePos=0;
    int qtdeNeg=0;

    for (int cont=1; cont < 6; cont++){
        num = teclado.nextInt();
        if (num % 2 == 0){
            qtdePar += 1;
        }
        else { qtdeImpar += 1;
        }

        if (num > 0){
            qtdePos += 1;
        }
        else if (num != 0) { qtdeNeg += 1;
        }
    }
    System.out.println(qtdePar+" valor(es) par(es)");
    System.out.println(qtdeImpar+" valor(es) impar(es)");
    System.out.println(qtdePos+" valor(es) positivo(s)");
    System.out.println(qtdeNeg+" valor(es) negativo(s)");
    }
}
