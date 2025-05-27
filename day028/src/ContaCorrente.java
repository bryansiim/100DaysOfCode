public class ContaCorrente extends Conta{

    public ContaCorrente(double saldoInicial, String titular){
        super(saldoInicial, titular); //chama o contrutor da classe mae (CONTA)
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
