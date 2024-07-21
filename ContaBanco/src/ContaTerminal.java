import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Insira seu nome: ");
        nomeCliente = input.next();
        System.out.print("Insira o numero da conta: ");
        numeroConta = input.nextInt();
        System.out.print("Insira o numero da agencia: ");
        agencia = input.next();
        System.out.print("Insira seu saldo: ");
        saldo = input.nextDouble();

        System.out.println(
                "Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " ja esta disponivel para saque."

        );

        input.close();
    }
}