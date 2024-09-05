public class Main {
    public static void main(String[] args) throws Exception {
        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        Conta cc = new ContaCorrente(felipe);
        Conta poupanca = new ContaPoupanca(felipe);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cc.sacar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
