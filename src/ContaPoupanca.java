public class ContaPoupanca extends Conta{

    private static int SEQUENCIAL = 1;
    public ContaPoupanca() {
        super(2, SEQUENCIAL++);
    }
}
