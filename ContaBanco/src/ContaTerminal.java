import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    
    public static void main (String args[]){
        int numero ; 
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Por favor, digite o número da Conta!");
            numero = scanner.nextInt();
            
            System.out.println("Por favor, digite o numero da Agência! ");
            agencia = scanner.next();
            
            System.out.println("Digite seu nome! ");
            nomeCliente = scanner.next();
    
            System.out.println("Saldo da conta!");
            saldo = scanner.nextDouble();



    }



}
