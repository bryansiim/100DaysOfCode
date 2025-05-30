public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1200, "Bryan");
        ContaPoupanca conta2 = new ContaPoupanca(500, "Maria");

        System.out.println("Saldo Inicial:");
        System.out.println(conta1.getTitular() + ": " + (conta1.getSaldo()));
        System.out.println(conta2.getTitular() + ": " + (conta2.getSaldo()));

        System.out.println("Depósitos:");
        conta1.depositar(500);
        conta2.depositar(100);

        System.out.println(conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println(conta2.getTitular() + ": " + conta2.getSaldo());

        System.out.println("Saques:");
        conta1.sacar(150);
        conta2.sacar(50);

        System.out.println(conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println(conta2.getTitular() + ": " + conta2.getSaldo());

        System.out.println("Transferencia de Bryan pra Maria Luiza");
        conta1.transferir(conta2, 200);

        System.out.println(conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println(conta2.getTitular() + ": " + conta2.getSaldo());


    }
}