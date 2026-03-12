import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner (System.in);

       System.out.println("\n Informe um numero menor ");
       int menor = sc.nextInt();
       System.out.println("Informe um numero maior: ");
       int maior = sc.nextInt();

       for(int i = maior; i < menor; i++){
            if (i % 2 == 0){
                 System.out.printf("[%d] é par \n", i);
            }else {
                 System.out.println(i);
            }
       }
    }
}
