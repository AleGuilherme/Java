import java.util.Scanner;

public class Uri1048 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario = 0 ;
        double novoSalario = 0;
        double reajusteGanho = 0;
        String reajustePercent = "0";

        //entrada
        salario = teclado.nextDouble();

        if (salario > 0 && salario <= 400) {
            reajusteGanho = salario * 0.15;
            novoSalario = reajusteGanho + salario;
            reajustePercent = "15 %";          
        }
        else if (salario > 400 && salario <= 800){
            reajusteGanho = salario * 0.12;
            novoSalario = reajusteGanho + salario;
            reajustePercent = "12 %";          
        }
        else if (salario > 800 && salario <= 1200){
            reajusteGanho = salario * 0.10;
            novoSalario = reajusteGanho + salario;
            reajustePercent = "10 %";          
        }
        else if (salario > 1200 && salario <= 2000){
            reajusteGanho = salario * 0.07;
            novoSalario = reajusteGanho + salario;
            reajustePercent = "7 %";          
        }
        else if (salario > 2000) {
            reajusteGanho = salario * 0.04;
            novoSalario = reajusteGanho + salario;
            reajustePercent = "4 %";          
        }

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        System.out.println("Em percentual: " +reajustePercent);
    }

}