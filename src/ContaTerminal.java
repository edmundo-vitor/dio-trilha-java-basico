import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaDto contaCriada = recebeDadosUsuario();
        exibeDadosConta(contaCriada);
    }

    private static ContaDto recebeDadosUsuario() {
        Scanner scanner = new Scanner(System.in);
        ContaDto novaConta = new ContaDto();

        System.out.println("Digite o numero da agencia: ");
        novaConta.setAgencia(scanner.nextLine());

        System.out.println("Digite o numero da conta: ");
        novaConta.setNumero(scanner.nextInt());

        scanner.nextLine(); // Limpando buffer

        System.out.println("Digite o nome do cliente: ");
        novaConta.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o saldo do cliente: ");
        novaConta.setSaldo(scanner.nextBigDecimal());

        scanner.close();
        return novaConta;
    }

    private static void exibeDadosConta(ContaDto conta) {
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua " +
                "agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() +
                " já está disponível para saque.");
    }

}