import java.util.Scanner;

public class Uri1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valueMes ;
        String nomeMes = "mes";
        

        // entrada

        valueMes = teclado.nextInt();

        if (valueMes == 1) { nomeMes = "January";}
        else if (valueMes == 2) { nomeMes = "February";}
        else if (valueMes == 3) { nomeMes = "March";}
        else if (valueMes == 4) { nomeMes = "April";}
        else if (valueMes == 5) { nomeMes = "May";}
        else if (valueMes == 6) { nomeMes = "June";}
        else if (valueMes == 7) { nomeMes = "July";}
        else if (valueMes == 8) { nomeMes = "August";}
        else if (valueMes == 9) { nomeMes = "September";}
        else if (valueMes == 10) { nomeMes = "October";}
        else if (valueMes == 11) { nomeMes = "November";}
        else if (valueMes == 12) { nomeMes = "December";}

        System.out.println(nomeMes);
    }
}