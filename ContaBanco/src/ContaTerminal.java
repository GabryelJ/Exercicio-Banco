import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Insira seu nome: ");
        nomeCliente = entrada.next();
        System.out.print("Insira o numero da conta: ");
        numeroConta = entrada.nextInt();
        System.out.print("Insira o numero da agencia: ");
        agencia = entrada.next();
        System.out.print("Insira seu saldo: ");
        saldo = entrada.nextDouble();

        System.out.println(
                "Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " ja esta disponivel para saque."

        );

        entrada.close();
    }
}
