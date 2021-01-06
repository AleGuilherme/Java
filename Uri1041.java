import java.util.Scanner ;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double X, Y;
        String Q = "Quadrante";


        //entrada
        X = teclado.nextDouble();
        Y = teclado.nextDouble();

        // processamento
        if (X == 0 && Y == 0) { Q = "Origem"; }
        else if (X == 0 && Y > 0) { Q = "Eixo Y"; }
        else if (X == 0 && Y < 0) { Q = "Eixo Y"; }
        else if (Y == 0 && X > 0) { Q = "Eixo X"; }
        else if (Y == 0 && X < 0) { Q = "Eixo X"; }
        else if (X > 0 && Y > 0) { Q = "Q1"; }
        else if (X > 0 && Y < 0) { Q = "Q4"; }
        else if (X < 0 && Y < 0) { Q = "Q3"; }
        else if (X < 0 && Y > 0) { Q = "Q2"; }

        System.out.println(Q);
    }
}