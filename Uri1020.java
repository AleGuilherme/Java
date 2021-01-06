import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idadeDias, idadeAnos, idadeMeses, dias;

        //entrada
        dias = teclado.nextInt();

        //processamento
        idadeAnos = (dias / 365);
        idadeMeses = (dias % 365)/30;
        idadeDias = (dias % 365) % 30;
        
        //saida
        System.out.println(idadeAnos  + " ano(s)");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println(idadeDias  + " dia(s)");
    }
}