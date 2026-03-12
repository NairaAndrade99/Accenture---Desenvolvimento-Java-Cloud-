import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner (System.in);

      System.out.print("Digite o numero inicial: ");
        int inicial = sc.nextInt();

        while (true) {
            System.out.print("Digite outro numero: ");
            int numero = sc.nextInt();

            if (numero < inicial) {
                System.out.println("Numero ignorado");
                continue;
            }

            if (numero % inicial != 0) {
                System.out.println("Resto diferente de 0. Encerrando o programa.");
                break;
            }

            System.out.println("Divisivel por " + inicial);
        }

      

    }
}
