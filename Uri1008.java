import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numFunc, horasTrab;
        double valorHora, salario;

        //entrada
        numFunc = teclado.nextInt();
        horasTrab = teclado.nextInt();
        valorHora = teclado.nextDouble();

        //processamento
        salario = horasTrab * valorHora;

        //saida
        System.out.println("NUMBER = " +numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}