public class Main {
    public static void main(String[] args) {
    Banco banco1 = new Banco("Banrisul");
    Conta conta1;
    Conta conta2;
    Conta conta3;
    conta1 = banco1.criaCliente("Valmir");
    conta2 = banco1.criaCliente("Carlos");
    conta3 = banco1.criaCliente("Leonardo");
    conta1.imprimirExtrato();
    conta2.imprimirExtrato();
    conta3.imprimirExtrato();
    }
}
