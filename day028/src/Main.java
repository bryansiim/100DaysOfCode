public class Main {
    public static void main(String[] args) {

        //Criando contass
        Conta conta1 = new ContaCorrente(1000, "Ze");
        Conta conta2 = new ContaCorrente(1900000, "Ric");

        //Exibindo dados inicias

        System.out.println("Saldo inicial de Ze: R$" + conta1.getSaldo());
        System.out.println("Saldo inicial de Ric: R$" + conta2.getSaldo());

        //Operacoes
        conta1.depositar(500);
        conta2.depositar(5000);

        //Exibindo saldos finais
        System.out.println("Saldo final de Ze: R$" + conta1.getSaldo());
        System.out.println("Saldo final de Ric: R$" + conta2.getSaldo());

        //teste de saque inválido
        conta1.sacar(7000);


    }
}