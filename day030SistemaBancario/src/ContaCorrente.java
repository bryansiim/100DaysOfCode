public class ContaCorrente extends Conta implements Transferivel {

    public ContaCorrente (double saldoInicial, String titular) {
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

    @Override
    public void transferir(Conta destino, double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
