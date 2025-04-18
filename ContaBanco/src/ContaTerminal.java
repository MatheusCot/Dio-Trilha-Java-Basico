import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    
    public static void main (String args[]){
        int numero ; 
        String agencia;
        String nomeCliente;
        String sobreNomeCliente;
        double saldo;

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome! ");
            nomeCliente = scanner.next();

            System.out.println("Digite seu sobrenome! ");
            sobreNomeCliente = scanner.next();
           
            System.out.println("Por favor, digite o numero da Agência! ");
            agencia = scanner.next();
           
            System.out.println("Por favor, digite o número da Conta!");
            numero = scanner.nextInt();
            
    
            System.out.println("Digite o Saldo da conta!");
            saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobreNomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }



}
