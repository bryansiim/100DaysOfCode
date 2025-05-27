public abstract class Conta {
    protected double saldo;
    protected String titular;

    public Conta(double saldoInicial, String titular){
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double getSaldo(){
        return saldo;
    }

    //metodo abstraido: sera implementado pelas subclasses
    public abstract void sacar(double valor);

}
