import java.util.Scanner ;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, value;

        num = teclado.nextInt();

        for (int cont=1; cont<=num; cont++){
            if ( cont % 2 == 0){
                 value = cont * cont ;
                System.out.println(cont+"^2 = "+value);
            }
            
        }
    }
}