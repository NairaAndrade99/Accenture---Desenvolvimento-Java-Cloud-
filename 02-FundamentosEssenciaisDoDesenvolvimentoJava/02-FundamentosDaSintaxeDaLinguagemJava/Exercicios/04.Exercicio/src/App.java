import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

         int pessoa1 = sc.nextInt();
         int pessoa2 = sc.nextInt();

         int dif = pessoa1 - pessoa2;

         System.out.printf("A diferença de idade é %d", dif);
    }
}
