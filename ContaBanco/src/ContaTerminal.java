import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
      

         
       
         
        

           Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o numero da conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite  o nome do cliente: ");
            String  nomeCliente = scanner.next();

            System.out.println("Digite  a Agencia: ");
            String Agencia = scanner.next();


            System.out.println("Digite  o Saldo: ");
            Double Saldo =  scanner.nextDouble();


            System.out.println("Olá " + nomeCliente +"," + " obrigado por criar uma conta em nosso banco, sua agência é: " + Agencia + ", conta: " +  numero + " e seu saldo: " + Saldo + "já está disponível para saque");

           /*
            * Conhcer e importar a classe Scanner 
            * Exibir as mensagens para o nosso usuário 
            * Obter pelo scanner os valores digitados no terminal 
            * Exibir a mensagem conta  criada 
            */


    }
}
