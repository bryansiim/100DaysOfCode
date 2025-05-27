public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldoInicial, String titular){
        super(saldoInicial, titular);
    }

    @Override
    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
