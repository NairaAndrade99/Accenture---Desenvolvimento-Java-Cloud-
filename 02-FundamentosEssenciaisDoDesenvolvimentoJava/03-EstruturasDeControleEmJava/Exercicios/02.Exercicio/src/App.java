import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        System.out.println(" \n IMC");

        System.out.println("Peso: ");
        double peso = sc.nextDouble();

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        double imc = (peso /( altura * altura));

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso ideal ");
        }else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Levimente acima do peso ");
        }else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade Grau 1 ");
        }else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau 2 (Severa) ");
        }else {
             System.out.println("Obesidade Grau 3 (Mórbid) ");
        }
        

        
    }
}
