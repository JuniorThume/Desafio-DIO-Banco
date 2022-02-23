public class Banco implements NovoCliente{

    public Banco(String nome){
        this.nome = nome;
    }

    public String nome;


    public String getNome() {
        return nome;
    }

    @Override
    public Conta criaCliente(String nome){
        Cliente novo = new Cliente();
        novo.setNome(nome);
        Conta novaConta =  new ContaCorrente(novo);
        return novaConta;
    }
}
