import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
        int year = OffsetDateTime.now().getYear();
        
        System.out.println("Qual é seu nome: ");
        String nome = sc.next();

        System.out.println( "Qual é o seu ano de nascimento: ");
        int anoNasc = sc.nextInt();

         
           
            int idade = year - anoNasc;

        System.out.printf("Olá, %s voce tem %d ", nome, idade);
    }
}
