public class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        contaDestino.depositar(valor);
        this.saldo-= valor;
    }

    public void imprimirExtrato(){
        System.out.println("########################");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo: " + getSaldo());
        System.out.println("########################");
    }

}
