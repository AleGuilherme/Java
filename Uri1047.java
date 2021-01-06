import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hourStart, minuteStart, hourEnd, minuteEnd, qtdeMin, qtdeHoras, totmin, totminStart, totminEnd;

        // entrada
        hourStart = teclado.nextInt();
        minuteStart = teclado.nextInt();
        hourEnd = teclado.nextInt();
        minuteEnd = teclado.nextInt();

        // processamento
         /*    if ( hourEnd < hourStart ){
            totminStart = (hourStart * 60) + minuteStart;
            totminEnd = (hourEnd * 60) + minuteEnd;
            totmin = (totminEnd - totminStart) + 1440;
            qtdeHoras = totmin / 60;
            qtdeMin = totmin % 60;
        }
        else if (hourEnd == hourStart && minuteEnd == minuteStart){
            qtdeHoras = 24 ;
            qtdeMin = 0;
        }
        else {
            totminStart = (hourStart * 60) + minuteStart;
            totminEnd = (hourEnd * 60) + minuteEnd;
            totmin = (totminEnd - totminStart);
            qtdeHoras = totmin / 60;
            qtdeMin = totmin % 60;
        }*/
        totminStart = hourStart * 60 + minuteStart ;
        totminEnd = hourEnd * 60 + minuteEnd ;
        totmin = totminEnd - totminStart;
        if (totmin <= 0 ){
            totmin = totmin + 1440;
        }
        qtdeHoras = totmin / 60;
        qtdeMin = totmin % 60;

        System.out.println("O JOGO DUROU "+qtdeHoras+" HORA(S) E "+qtdeMin+" MINUTO(S)");
    }
}