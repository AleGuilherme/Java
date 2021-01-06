import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int timeStart, timeEnd, qtdeHoras;

        // entrada

        timeStart = teclado.nextInt();
        timeEnd = teclado.nextInt();

        // processamento

        if ( timeEnd < timeStart ){
            qtdeHoras = (timeEnd - timeStart) + 24;
        }
        else if (timeEnd == timeStart){
            qtdeHoras = 24 ;
        }
        else {
            qtdeHoras = timeEnd - timeStart ;
        }

        System.out.println("O JOGO DUROU "+ qtdeHoras + " HORA(S)");
    }
}