import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        System.out.println(" Retangulo");

        System.out.println("Informe a base: ");
        double base = sc.nextDouble();

        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("A area do retangulo é %.2f", area);

        

    }
}
