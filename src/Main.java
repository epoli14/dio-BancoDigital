// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();

        cc.setSaldo(2000);
        cc.imprimirExtrato();

        Conta cc2 = new ContaCorrente();

        cc2.setSaldo(5000);
        cc2.imprimirExtrato();

        cc.trasnferir(900, cc2);

        cc2.imprimirExtrato();
        cc.imprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca();

        cc2.trasnferir(400, cp);

        cp.imprimirExtrato();
        cc2.imprimirExtrato();


    }
}