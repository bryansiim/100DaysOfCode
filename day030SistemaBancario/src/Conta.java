public abstract class Conta {
    protected double saldo;
    protected String titular;

    public Conta(double saldoInicial, String titular){
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    //metodo  abstrato: obrigara subclasse a implementarem
    public abstract void sacar(double valor);
}
