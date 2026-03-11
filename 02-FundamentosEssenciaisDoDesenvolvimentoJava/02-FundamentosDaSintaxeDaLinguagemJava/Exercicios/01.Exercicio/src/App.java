import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println("Qual é seu nome: ");
        String nome = sc.next();

        System.out.println( "Qual é o seu ano de nascimento: ");
        int anoNasc = sc.nextInt();

        anoNasc -= 2026;

        System.out.printf("Olá, %s voce tem %d ", nome,anoNasc);
    }
}
