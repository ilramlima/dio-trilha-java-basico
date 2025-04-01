
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        teclado.useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = teclado.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = teclado.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = teclado.nextDouble();

        teclado.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

    }
}
