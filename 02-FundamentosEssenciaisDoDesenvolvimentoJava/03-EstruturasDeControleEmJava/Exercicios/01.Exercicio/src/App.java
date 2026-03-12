import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("\n  Tabuada");

        int valor = sc.nextInt();

        for(int i = 1; i < 9; i++){

               System.out.printf(" \n %d X %d = " + i * valor + " " , i, valor);
        }
    }
}
