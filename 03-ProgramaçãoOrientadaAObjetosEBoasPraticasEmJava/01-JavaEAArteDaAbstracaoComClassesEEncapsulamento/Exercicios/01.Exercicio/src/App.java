import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        Conta conta = new Conta();

        System.out.println(" \n\n  BEM-VINDO AO BANCO  ");

        System.out.println(" 1- Consultar saldo\n 2 - Consultar cheque especial\n 3 - Depositar dinheiro\n 4 - Sacar dinheiro\n 5 - Pagar um boleto \n 6 - Verificar se a conta está usando cheque especial \n ");
        
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.printf("Seu saldo bancario é R$ %.2f ",conta.getSaldo() );
                break;
            case 2: 
                System.out.printf("Valor do seu cheque R$ %.2f ",conta.getChuequeEspecial() );
                break;
            case 3:
                System.out.println("Informe o valor do deposito: ");
                double valor = sc.nextDouble();
                conta.setSaldo(valor);
            case 4:
                 System.out.println("Informe o valor de saque: ");
                 double saque = sc.nextDouble();
                 conta.setSaldo(saque);
            case 5: 
                 System.out.println("Informe o valor do boleto: ");
                 double valorBol = sc.nextDouble();
                 conta.setBoleto(valorBol);
            
            default:
                System.out.println("Opção invalida !");
                break;
        }
        
    }
}
