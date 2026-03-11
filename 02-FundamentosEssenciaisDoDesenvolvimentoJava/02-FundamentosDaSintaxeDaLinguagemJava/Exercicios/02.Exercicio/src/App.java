import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qudrado");

         System.out.println("Informe os lados ");

         double quadrado = 0.0; 

        
            
            int lado1 = sc.nextInt();
            int lado2 = sc.nextInt();

              quadrado =  lado1 * lado2;
        
        System.out.printf("A area do quadrado %.2f " , quadrado);
    }
}
