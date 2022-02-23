public abstract class Conta implements IConta{
    protected int agencia;
    protected int conta;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;
    protected Cliente cliente;
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }
    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    void imprimeInfosComuns(){
        System.out.println(String.format("TITULAR: %s",this.cliente.getNome()));
        System.out.println(String.format("AGENCIA: %d",this.getAgencia()));
        System.out.println(String.format("CONTA: %d",this.getConta()));
        System.out.println(String.format("SALDO: %.2f",this.getSaldo()));
    }
}
