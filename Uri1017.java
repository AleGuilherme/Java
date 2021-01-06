import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempoViagem, velocMedia;
        double distancia, consumo;

        //entrada
        tempoViagem = teclado.nextInt();
        velocMedia = teclado.nextInt();

        //processamento
        distancia = velocMedia * tempoViagem;
        consumo = distancia / 12;

        //saida
        System.out.printf("%.3f%n", consumo);
    }
}